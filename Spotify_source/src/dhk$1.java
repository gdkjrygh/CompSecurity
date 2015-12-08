// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

final class ang.Object
    implements Runnable
{

    private ArrayList a;
    private dhk b;

    public final void run()
    {
        float f;
        abo abo1;
        dhk dhk1;
        me me1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); me1.a(f).b(0.0F).a(300L).a(new <init>(dhk1, abo1, me1)).d())
        {
            abo1 = (abo)iterator.next();
            dhk1 = b;
            me1 = km.q(abo1.a);
            dhk1.b.add(abo1);
            f = 1.0F;
            Object obj = (dhl)abo1.a.getTag(0x7f1100e0);
            if (obj != null)
            {
                f = ((dhl) (obj)).a;
            }
            obj = (dgz)abo1.a.getTag(0x7f1100e1);
            if (obj == null)
            {
                continue;
            }
            if (((dgz) (obj)).c == -1)
            {
                km.a(abo1.a, -((dgz) (obj)).d);
            }
            if (((dgz) (obj)).c == 1)
            {
                km.a(abo1.a, ((dgz) (obj)).d);
            }
        }

        a.clear();
        b.a.remove(a);
    }

    (dhk dhk1, ArrayList arraylist)
    {
        b = dhk1;
        a = arraylist;
        super();
    }
}
