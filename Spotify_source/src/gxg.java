// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class gxg
{

    public Map a;

    private gxg()
    {
    }

    public gxg(byte byte0)
    {
        this();
    }

    public final List a(int i)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return (com.squareup.wire.MessageAdapter.ImmutableList)a.get(Integer.valueOf(i));
        }
    }

    public final void a(int i, Object obj)
    {
        com.squareup.wire.MessageAdapter.ImmutableList immutablelist;
        com.squareup.wire.MessageAdapter.ImmutableList immutablelist1;
        if (a == null)
        {
            immutablelist = null;
        } else
        {
            immutablelist = (com.squareup.wire.MessageAdapter.ImmutableList)a.get(Integer.valueOf(i));
        }
        immutablelist1 = immutablelist;
        if (immutablelist == null)
        {
            immutablelist1 = new com.squareup.wire.MessageAdapter.ImmutableList();
            if (a == null)
            {
                a = new LinkedHashMap();
            }
            a.put(Integer.valueOf(i), immutablelist1);
        }
        com.squareup.wire.MessageAdapter.ImmutableList.a(immutablelist1, obj);
    }
}
