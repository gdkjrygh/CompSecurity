// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, BoardInvite, ModelHelper

public class BoardInviteFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "BoardInviteFeed";

    public BoardInviteFeed()
    {
        super(null, null);
    }

    public BoardInviteFeed(Parcel parcel)
    {
        super(null, null);
        readFromParcel(parcel);
    }

    public BoardInviteFeed(PinterestJsonObject pinterestjsonobject, String s)
    {
        super(pinterestjsonobject, s);
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(BoardInvite.makeAll(getData()));
            setData(null);
            return;
        }
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getBoardInvites(_ids);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final BoardInviteFeed createFromParcel(Parcel parcel)
        {
            return new BoardInviteFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final BoardInviteFeed[] newArray(int i)
        {
            return new BoardInviteFeed[i];
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
