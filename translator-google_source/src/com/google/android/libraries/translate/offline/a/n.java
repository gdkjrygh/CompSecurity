// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.content.Context;
import android.content.DialogInterface;
import android.text.format.Formatter;
import android.view.View;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.d;
import com.google.android.libraries.translate.offline.e;
import com.google.android.libraries.translate.offline.j;
import com.google.android.libraries.translate.offline.o;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.android.libraries.translate.offline.a:
//            o

public final class n
    implements android.content.DialogInterface.OnClickListener, android.view.View.OnClickListener
{

    private final o a;
    private final Context b;
    private final d c;
    private OfflinePackage d;
    private final Runnable e;

    public n(OfflinePackage offlinepackage, o o1, Context context, d d1, Runnable runnable)
    {
        d = offlinepackage;
        a = o1;
        b = context;
        c = d1;
        e = runnable;
    }

    static Runnable a(n n1)
    {
        return n1.e;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        (new com.google.android.libraries.translate.offline.a.o(this, b, a, c)).a(new OfflinePackage[] {
            d
        });
    }

    public final void onClick(View view)
    {
        view = a.c(d);
        if (view == null)
        {
            return;
        }
        d = view;
        if (d.f())
        {
            view = b.getString(f.msg_confirm_offline_pack_cancel, new Object[] {
                d.a(b, false)
            });
            p.a(b, view).setNegativeButton(f.label_no, null).setPositiveButton(f.label_yes, this).show();
            return;
        }
        view = a.d(d).iterator();
        long l = 0L;
        while (view.hasNext()) 
        {
            j j1 = (j)view.next();
            e e1 = a.b;
            long l1;
            if (j1.k > 0L)
            {
                l1 = j1.k;
            } else
            {
                l1 = e1.f(j1.c);
                if (l1 > 0L)
                {
                    j1.a(l1);
                }
            }
            l = l1 + l;
        }
        view = b.getString(f.msg_confirm_offline_pack_delete, new Object[] {
            d.a(b, false), Formatter.formatFileSize(b, l)
        });
        p.a(b, view).setNegativeButton(f.label_cancel, null).setPositiveButton(f.label_ok, this).show();
    }
}
