// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Board, ModelHelper

public class BoardFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "BoardFeed";
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;

    public BoardFeed()
    {
        super(null, null);
        _eventsSubscriber = new _cls2();
    }

    public BoardFeed(Parcel parcel)
    {
        super(null, null);
        _eventsSubscriber = new _cls2();
        readFromParcel(parcel);
    }

    public BoardFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        _eventsSubscriber = new _cls2();
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(Board.makeAll(pinterestjsonobject.e("data")));
            setData(null);
            return;
        }
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getBoards(_ids);
    }

    public FeedApiResponseHandler newApiHandler()
    {
        return new com.pinterest.api.remote.BoardApi.BoardFeedApiResponse();
    }

    public void registerForUpdateEvents()
    {
        Events.register(_eventsSubscriber, com/pinterest/api/model/Board$UpdateEvent, new Class[0]);
    }

    public void unregisterForUpdateEvents()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Board$UpdateEvent
        });
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final BoardFeed this$0;

        public void onEventMainThread(Board.UpdateEvent updateevent)
        {
            Board board;
            board = updateevent.getBoard();
            break MISSING_BLOCK_LABEL_5;
            if (board != null && _items != null && _items.size() > 0)
            {
                int i = _ids.indexOf(board.getUid());
                if (i >= 0 && i < _items.size())
                {
                    boolean flag = false;
                    if (updateevent.wasDeleted())
                    {
                        _items.remove(i);
                        flag = true;
                    } else
                    {
                        _items.set(i, board);
                    }
                    if (_dataListener != null)
                    {
                        _dataListener.onChange(i, flag);
                        return;
                    }
                }
            }
            return;
        }

        _cls2()
        {
            this$0 = BoardFeed.this;
            super();
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BoardFeed createFromParcel(Parcel parcel)
        {
            return new BoardFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BoardFeed[] newArray(int i)
        {
            return new BoardFeed[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
