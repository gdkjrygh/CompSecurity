// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class dpp extends dpq
{

    public dpp(String s, List list)
    {
        super(s, ImmutableList.a(list));
    }

    public volatile String getId()
    {
        return super.getId();
    }

    public volatile dsj getInfo()
    {
        return super.getInfo();
    }

    public volatile drf getItem(int i)
    {
        return super.getItem(i);
    }

    public volatile int getItemCount()
    {
        return super.getItemCount();
    }

    public volatile Iterable getPlayables()
    {
        return super.getPlayables();
    }
}
