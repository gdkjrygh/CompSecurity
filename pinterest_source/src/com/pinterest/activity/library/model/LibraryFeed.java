// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.model;

import android.os.Parcel;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.LibrarySection;
import com.pinterest.api.model.Pin;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private List _persistedItems;

    public LibraryFeed(Parcel parcel)
    {
        super(null, null);
        _persistedItems = Collections.emptyList();
        readFromParcel(parcel);
    }

    public LibraryFeed(PinterestJsonObject pinterestjsonobject, String s, String s1)
    {
        super(pinterestjsonobject, s);
        _persistedItems = Collections.emptyList();
        if (pinterestjsonobject == null)
        {
            return;
        }
        pinterestjsonobject = new ArrayList();
        if (!(_data instanceof PinterestJsonArray)) goto _L2; else goto _L1
_L1:
        if (!s1.equals("pins") && !s1.equals("likes")) goto _L4; else goto _L3
_L3:
        pinterestjsonobject.add(new LibrarySection(null, s1, Pin.makeAll((PinterestJsonArray)_data)));
_L2:
        setItems(pinterestjsonobject);
        setData(null);
        _persistedItems = new ArrayList(pinterestjsonobject);
        return;
_L4:
        if (s1.equals("board"))
        {
            s = Board.makeAll((PinterestJsonArray)_data);
            s1 = new ArrayList();
            for (int i = 0; i < s.size(); i++)
            {
                Board board = (Board)s.get(i);
                s1.add(new LibrarySection(board, "board", board.getPinList()));
            }

            pinterestjsonobject.addAll(s1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected List getPersistedItems()
    {
        return new ArrayList(_persistedItems);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final LibraryFeed createFromParcel(Parcel parcel)
        {
            return new LibraryFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final LibraryFeed[] newArray(int i)
        {
            return new LibraryFeed[i];
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
