// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

public final class ixx
    implements dhr, mti, omb, opv
{

    private static final ekk a = (new ekm()).a(gej).a();
    private ixe b;
    private ekb c;
    private mtj d;

    public ixx(opd opd1)
    {
        opd1.a(this);
    }

    public ixx(opd opd1, byte byte0)
    {
        opd1.a(this);
    }

    private void a(List list)
    {
        list = new hyw(list);
        b.a(list);
        c.b();
    }

    public final void a()
    {
        Object obj;
        boolean flag;
        obj = c.a();
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_57;
            }
        } while (((ekp)iterator.next()).b(gej) != null);
        flag = false;
_L1:
        if (flag)
        {
            a(((List) (obj)));
            return;
        } else
        {
            obj = new eld(((List) (obj)), a, b.Bz);
            d.a(((mtf) (obj)));
            return;
        }
        flag = true;
          goto _L1
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = ((mtj)olm1.a(mtj)).a(this);
        b = (ixe)olm1.a(ixe);
        c = (ekb)olm1.a(ekb);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        while (!eld.a(b.Bz).equals(s) || mue1 == null || mue1.c()) 
        {
            return;
        }
        a(((List) (mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list"))));
    }

}
