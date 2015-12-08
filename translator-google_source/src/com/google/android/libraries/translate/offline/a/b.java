// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.d;
import com.google.android.libraries.translate.offline.o;

public class b extends k
{

    private final Context a;
    private final o b;
    private final d c;
    private final boolean d;
    private ProgressDialog e;

    public b(Context context, o o1, d d1, boolean flag)
    {
        a = context;
        c = d1;
        b = o1;
        d = flag;
    }

    private transient Void a(OfflinePackage aofflinepackage[])
    {
        int i;
        int j;
        j = aofflinepackage.length;
        i = 0;
_L2:
        while (i < j) 
        {
            OfflinePackage offlinepackage = aofflinepackage[i];
            offlinepackage.j();
            if (!offlinepackage.f)
            {
                if (c.a(b.d(offlinepackage)))
                {
                    Singleton.b().a("cancel", offlinepackage, null);
                } else
                if (d)
                {
                    Singleton.b().a("retry", offlinepackage, null);
                } else
                {
                    Singleton.b().a("del", offlinepackage, null);
                }
                try
                {
                    b.a(offlinepackage);
                }
                catch (OfflineTranslationException offlinetranslationexception)
                {
                    offlinetranslationexception.getErrorCode();
                }
            }
            i++;
        }
        Singleton.b().b();
        if (d)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        com.google.android.libraries.translate.offline.b.a(a).b();
        b.b();
        return null;
        aofflinepackage;
        return null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(Void void1)
    {
        p.a(e, "DeletePackageProgress");
    }

    public Object doInBackground(Object aobj[])
    {
        return a((OfflinePackage[])aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        e = ProgressDialog.show(a, a.getText(f.msg_deleting), a.getText(f.msg_delete_offline_language), true, false);
    }
}
