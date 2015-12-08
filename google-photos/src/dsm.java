// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class dsm
    implements eka
{

    dsm()
    {
    }

    public final Object a()
    {
        return djy;
    }

    public final boolean a(ar ar1, Collection collection)
    {
        boolean flag;
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_74;
            }
        } while (((ekp)iterator.next()).b(gax) != null);
        flag = false;
_L1:
        if (flag)
        {
            collection = dsl.a(new hyw(collection));
            ar1.c().a().a(collection, "all_media_on_device_delete").b();
            return true;
        } else
        {
            collection = dsn.a(new hyw(collection));
            ar1.c().a().a(collection, "all_media_load_media_source").b();
            return true;
        }
        flag = true;
          goto _L1
    }
}
