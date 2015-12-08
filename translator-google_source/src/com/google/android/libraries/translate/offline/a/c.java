// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline.a;

import android.app.ProgressDialog;
import android.content.Context;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.e.k;
import com.google.android.libraries.translate.e.m;
import com.google.android.libraries.translate.e.p;
import com.google.android.libraries.translate.f;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.o;

public class c extends k
{

    private final Context a;
    private final o b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean g;
    private final boolean h;
    private ProgressDialog i;

    public c(Context context, o o1, int j)
    {
        boolean flag1 = true;
        super();
        a = context;
        b = o1;
        boolean flag;
        if ((j & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if ((j & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if ((j & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        if ((j & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if ((j & 0x10) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    private transient Void a(OfflinePackage aofflinepackage[])
    {
        int j;
        int l;
        l = aofflinepackage.length;
        j = 0;
_L2:
        if (j >= l)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        OfflinePackage offlinepackage1 = aofflinepackage[j];
        OfflinePackage offlinepackage;
        e e1;
        try
        {
            offlinepackage = b.b(offlinepackage1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            offlinepackage1.c = com.google.android.libraries.translate.offline.OfflinePackage.Status.ERROR;
            offlinepackage1.e = ((OfflineTranslationException) (obj)).getErrorMessage(a);
            offlinepackage1.a(false);
            break MISSING_BLOCK_LABEL_135;
        }
        if (offlinepackage == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        b.a(offlinepackage, c, g);
        e1 = Singleton.b();
        Object obj;
        String s;
        if (d)
        {
            obj = "upgrade";
        } else
        {
            obj = "add";
        }
        if (c)
        {
            s = "all_network";
        } else
        {
            s = "wifi_only";
        }
        e1.a(((String) (obj)), offlinepackage1, s);
        break MISSING_BLOCK_LABEL_135;
        return null;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(Void void1)
    {
        b.a(null, true);
        if (h)
        {
            p.a(i, "DownloadPackageProgress");
        }
        if (!e && !c && !com.google.android.libraries.translate.e.o.c(a))
        {
            m.a(f.msg_download_start_later, 1);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((OfflinePackage[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    protected void onPreExecute()
    {
        Object obj = a;
        int j;
        if (d)
        {
            j = f.title_update_offline_languages_dialog;
        } else
        {
            j = f.title_add_offline_languages_dialog;
        }
        obj = ((Context) (obj)).getString(j);
        if (h)
        {
            i = ProgressDialog.show(a, ((CharSequence) (obj)), a.getString(f.msg_start_downloading_files), true);
        }
    }
}
