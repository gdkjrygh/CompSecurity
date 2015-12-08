// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.a.a;
import com.google.android.libraries.translate.offline.a.n;
import com.google.android.libraries.translate.offline.d;
import com.google.android.libraries.translate.offline.o;

// Referenced classes of package com.google.android.apps.translate.pref:
//            s, u

public final class r
    implements android.content.DialogInterface.OnClickListener, android.view.View.OnClickListener
{

    private final o a;
    private final Context b;
    private final d c;
    private final a d;
    private OfflinePackage e;

    public r(OfflinePackage offlinepackage, o o1, Context context, d d1, a a1)
    {
        e = offlinepackage;
        a = o1;
        b = context;
        c = d1;
        d = a1;
    }

    static OfflinePackage a(r r1)
    {
        return r1.e;
    }

    static OfflinePackage a(r r1, OfflinePackage offlinepackage)
    {
        r1.e = offlinepackage;
        return offlinepackage;
    }

    static o b(r r1)
    {
        return r1.a;
    }

    static Context c(r r1)
    {
        return r1.b;
    }

    static a d(r r1)
    {
        return r1.d;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.c(e);
        if (dialoginterface != null)
        {
            e = dialoginterface;
            if (i == -1)
            {
                (new s(this, b, a, c)).a(new OfflinePackage[] {
                    e
                });
                return;
            }
            if (i == -2)
            {
                (new n(e, a, b, c, new u(this))).onClick(null);
                return;
            }
        }
    }

    public final void onClick(View view)
    {
        p.a(b, e.g()).setTitle(com.google.android.apps.translate.r.msg_install_offline_language_failed).setPositiveButton(com.google.android.apps.translate.r.label_retry, this).setNegativeButton(com.google.android.apps.translate.r.label_delete, this).show();
    }
}
