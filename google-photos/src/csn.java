// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LruCache;
import java.io.File;

final class csn extends LruCache
{

    public csn(int i)
    {
        super(i);
    }

    protected final void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj = (csl)obj1;
        if (flag)
        {
            ((csl) (obj)).b.delete();
        }
    }

    protected final int sizeOf(Object obj, Object obj1)
    {
        return ((csl)obj1).a;
    }
}
