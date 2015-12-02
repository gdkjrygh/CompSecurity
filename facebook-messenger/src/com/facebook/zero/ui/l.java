// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.ui;

import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.app.q;
import com.facebook.o;
import com.facebook.prefs.shared.ae;
import com.facebook.zero.a.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.zero.ui:
//            n, ExtraChargesDialog, o, k

public class l
{

    private final Resources a;
    private final com.facebook.zero.ui.o b;
    private final Map c = new HashMap();

    public l(Resources resources, com.facebook.zero.ui.o o1)
    {
        a = resources;
        b = o1;
    }

    public l a(ae ae1, String s, k k1)
    {
        return a(ae1, a.getString(o.zero_generic_extra_data_charges_dialog_title), s, k1);
    }

    public l a(ae ae1, String s, String s1, k k1)
    {
        n n1 = new n(this, null);
        n1.a = ae1;
        n1.b = s;
        n1.c = s1;
        n1.d = k1;
        c.put(ae1, n1);
        return this;
    }

    public void a(q q1)
    {
        Iterator iterator = c.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            ExtraChargesDialog extrachargesdialog = (ExtraChargesDialog)q1.a(com.facebook.zero.a.c.a((ae)((java.util.Map.Entry) (obj)).getKey()));
            obj = ((n)((java.util.Map.Entry) (obj)).getValue()).d;
            if (extrachargesdialog != null && obj != null)
            {
                extrachargesdialog.a(((k) (obj)));
            }
        } while (true);
    }

    public void a(ae ae1, q q1)
    {
        a(ae1, q1, ((Parcelable) (null)));
    }

    public void a(ae ae1, q q1, Parcelable parcelable)
    {
        n n1 = (n)c.get(ae1);
        if (n1 != null)
        {
            if (b.a(ae1))
            {
                (new ExtraChargesDialog(n1.a, n1.b, n1.c)).a(parcelable).a(n1.d).a(q1, com.facebook.zero.a.c.a(ae1));
                return;
            }
            ae1 = n1.d;
            if (ae1 != null)
            {
                ae1.a(parcelable);
                return;
            }
        }
    }
}
