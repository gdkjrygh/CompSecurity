// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class gdz extends fud
{

    final gdw c;

    gdz(gdw gdw1, ar ar, opd opd)
    {
        c = gdw1;
        super(ar, opd, b.rp);
    }

    public final ei a(int i, Bundle bundle)
    {
        return new gea(this, b, bundle);
    }

    final void a(int i)
    {
        Bundle bundle = new Bundle();
        bundle.putInt("key_sync_account_id", i);
        c(bundle);
    }

    public final void a(ei ei, Object obj)
    {
        ei = (gdy)obj;
        obj = c;
        for (Iterator iterator = ((gdw) (obj)).b.iterator(); iterator.hasNext(); ((geb)iterator.next()).a(((gdy) (ei)).a, ((gdy) (ei)).b)) { }
        gdn gdn1 = ((gdw) (obj)).a;
        b.u();
        Iterator iterator1 = gdn1.b.keySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            int i = ((Integer)iterator1.next()).intValue();
            gds gds1 = (gds)gdn1.b.get(Integer.valueOf(i));
            if (gds1.a)
            {
                ((gdt) (obj)).a(i, gds1.b);
            }
        } while (true);
        gdn1.a.add(obj);
        obj.c = ((gdy) (ei)).a;
        obj.d = ((gdy) (ei)).b;
        if (((gdw) (obj)).e.a())
        {
            ((gdw) (obj)).a("state refreshed", noy.a("event", "onLibraryStateLoaded"));
        }
    }
}
