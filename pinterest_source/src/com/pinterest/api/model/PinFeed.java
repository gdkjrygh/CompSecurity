// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.api.igresponse.IgHelper;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.experiment.Experiments;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Pin, ModelHelper

public class PinFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "PinFeed";
    public static boolean renderHashtag = false;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected boolean _onlyLikedByMe;
    public boolean isHomeFeed;

    public PinFeed()
    {
        super(null, null);
        _onlyLikedByMe = false;
        isHomeFeed = false;
        _eventsSubscriber = new _cls2();
    }

    public PinFeed(Parcel parcel)
    {
        super(null, null);
        _onlyLikedByMe = false;
        isHomeFeed = false;
        _eventsSubscriber = new _cls2();
        readFromParcel(parcel);
    }

    public PinFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        _onlyLikedByMe = false;
        isHomeFeed = false;
        _eventsSubscriber = new _cls2();
        if (pinterestjsonobject == null)
        {
            return;
        }
        if (_data instanceof PinterestJsonArray)
        {
            renderHashtag = Experiments.a(false);
            _stories = new ArrayList();
            setItems(Pin.makeAll((PinterestJsonArray)_data, (ArrayList)_stories));
        } else
        {
            setItems(new ArrayList());
        }
        setData(null);
    }

    public static PinFeed parseJson(String s, String s1)
    {
        if (StringUtils.isEmpty(s))
        {
            s = new PinFeed();
        } else
        {
            PinFeed pinfeed = (PinFeed)IgHelper.a(com.pinterest.api.igresponse.IgHelper.ResponseType.b, s);
            s = pinfeed;
            if (pinfeed != null)
            {
                pinfeed.setBaseUrl(s1);
                return pinfeed;
            }
        }
        return s;
    }

    public int getItemIndex(Pin pin)
    {
        List list = getItems();
        for (int i = 0; i < list.size(); i++)
        {
            if (((Pin)list.get(i)).equals(pin))
            {
                return i;
            }
        }

        return -1;
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getPins(_ids, _onlyLikedByMe);
    }

    public FeedApiResponseHandler newApiHandler()
    {
        com.pinterest.api.remote.PinApi.PinFeedApiResponse pinfeedapiresponse = new com.pinterest.api.remote.PinApi.PinFeedApiResponse();
        pinfeedapiresponse.isHomeFeed = isHomeFeed;
        if (isHomeFeed)
        {
            StopWatch.get().start("ttlnhf");
        }
        return pinfeedapiresponse;
    }

    public void registerForUpdateEvents()
    {
        Events.register(_eventsSubscriber, com/pinterest/api/model/Pin$UpdateEvent, new Class[0]);
    }

    public void setOnlyLikedByMe(boolean flag)
    {
        _onlyLikedByMe = flag;
    }

    public void unregisterForUpdateEvents()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Pin$UpdateEvent
        });
    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinFeed this$0;

        public void onEventMainThread(Pin.UpdateEvent updateevent)
        {
            Pin pin;
            pin = updateevent.getPin();
            break MISSING_BLOCK_LABEL_5;
            if (pin != null && _items != null && _items.size() > 0)
            {
                int i = _ids.indexOf(pin.getUid());
                if (i >= 0 && i < _items.size())
                {
                    boolean flag = false;
                    if (updateevent.wasDeleted() || _onlyLikedByMe && pin.getLiked() != Boolean.TRUE)
                    {
                        _ids.remove(i);
                        _items.remove(i);
                        flag = true;
                    } else
                    {
                        _items.set(i, pin);
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
            this$0 = PinFeed.this;
            super();
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PinFeed createFromParcel(Parcel parcel)
        {
            return new PinFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PinFeed[] newArray(int i)
        {
            return new PinFeed[i];
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
