// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.porcelain.collection.PorcelainLinearCollection;
import java.util.List;

public abstract class dpq
    implements PorcelainLinearCollection
{

    private final String mId;
    private final List mItems;

    protected dpq(String s, List list)
    {
        mId = s;
        mItems = (List)ctz.a(list);
    }

    public String getId()
    {
        return mId;
    }

    public volatile dsi getInfo()
    {
        return getInfo();
    }

    public dsj getInfo()
    {
        return (dsj)d.a(this);
    }

    public drf getItem(int i)
    {
        return (drf)getItems().get(i);
    }

    public int getItemCount()
    {
        return getItems().size();
    }

    public List getItems()
    {
        return mItems;
    }

    public Iterable getPlayables()
    {
        return (Iterable)c.a(getItems());
    }
}
