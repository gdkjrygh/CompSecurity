// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;

public class crq extends LruCache
{

    public crq(int i)
    {
        super(i);
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj1 = (crz)obj1;
        super.entryRemoved(flag, obj, obj1, (crz)obj2);
        ((crz) (obj1)).b();
    }
}
