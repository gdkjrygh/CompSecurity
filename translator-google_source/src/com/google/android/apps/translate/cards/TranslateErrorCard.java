// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.cards;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.e.h;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.c;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.OfflinePackage;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.translate.cards:
//            AbstractCard, b, d, c

public class TranslateErrorCard extends AbstractCard
    implements android.view.View.OnClickListener
{

    private final List a;
    private final Bundle b;
    private final b c;
    private final com.google.android.libraries.translate.offline.o d;
    private Runnable e;
    private String f;

    public TranslateErrorCard(Context context, b b1, Bundle bundle, int i)
    {
        super(context, o.card_translate_error);
        a = new ArrayList();
        b = bundle;
        c = b1;
        d = (com.google.android.libraries.translate.offline.o)Singleton.c.b();
        boolean flag;
        if (i == -2 || i == -201 || !com.google.android.libraries.translate.e.o.b(getContext()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        a(m.error_code, r.err_no_network);
        if (!com.google.android.libraries.translate.e.f.a(c.e)) goto _L4; else goto _L3
_L3:
        i = r.err_offline_auto_lang;
_L8:
        if (i != 0)
        {
            a(m.error_detail, i);
        }
_L6:
        findViewById(m.btn_retry).setOnClickListener(this);
        findViewById(m.btn_action).setOnClickListener(this);
        return;
_L4:
        if (a())
        {
            switch (getOfflinePackageStatus())
            {
            default:
                i = 0;
                break;

            case 1: // '\001'
                i = r.err_offline_packs_not_ready;
                break;

            case 2: // '\002'
                i = r.msg_download_offline_langs;
                a(r.label_download_lang, new d(this));
                break;

            case 3: // '\003'
                i = r.err_offline_packs_install_error;
                a(-514);
                a(r.label_more_details, new com.google.android.apps.translate.cards.c(this));
                break;

            case 4: // '\004'
                i = r.err_offline_packs_corrupt;
                a(-511);
                break;

            case 5: // '\005'
                i = r.err_offline_packs_missing;
                a(-512);
                break;

            case 6: // '\006'
                i = r.err_sdcard_missing;
                a(-513);
                break;
            }
        } else
        {
            i = 0;
        }
          goto _L5
_L2:
        a(m.error_code, getContext().getString(r.err_msg_code, new Object[] {
            Integer.valueOf(i)
        }));
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    static List a(TranslateErrorCard translateerrorcard)
    {
        return translateerrorcard.a;
    }

    private void a(int i)
    {
        Singleton.b().a(i, f, c.e.getShortName(), c.f.getShortName());
    }

    private void a(int i, int j)
    {
        ((TextView)findViewById(i)).setText(j);
    }

    private void a(int i, Runnable runnable)
    {
        findViewById(m.lyt_action).setVisibility(0);
        a(m.btn_action, ((CharSequence) (getContext().getString(i))));
        e = runnable;
    }

    private boolean a()
    {
        String s;
        String s1;
        Object obj;
        int i;
        boolean flag = true;
        obj = d.b(PackageType.TRANSLATE);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        s = com.google.android.libraries.translate.languages.c.b(c.e.getShortName());
        s1 = com.google.android.libraries.translate.languages.c.b(c.f.getShortName());
        if (s.equals(s1))
        {
            i = 1;
        } else
        {
            i = 2;
        }
        if (s.equals("en") || s1.equals("en"))
        {
            i--;
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        try
        {
            obj = ((ac) (obj)).h().iterator();
            do
            {
                OfflinePackage offlinepackage;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    offlinepackage = (OfflinePackage)((Iterator) (obj)).next();
                } while (!offlinepackage.a.equals(s) && !offlinepackage.a.equals(s1));
                a.add(offlinepackage);
            } while (true);
        }
        catch (OfflineTranslationException offlinetranslationexception) { }
        if (a.size() == i) goto _L4; else goto _L3
_L3:
        return false;
        return false;
    }

    static com.google.android.libraries.translate.offline.o b(TranslateErrorCard translateerrorcard)
    {
        return translateerrorcard.d;
    }

    private int getOfflinePackageStatus()
    {
        Object obj1 = (OfflinePackage)a.get(0);
        com.google.android.libraries.translate.offline.OfflinePackage.Status status = ((OfflinePackage) (obj1)).c;
        Object obj;
        com.google.android.libraries.translate.offline.OfflinePackage.Status status1;
        if (a.size() > 1)
        {
            obj = (OfflinePackage)a.get(1);
        } else
        {
            obj = d.b(PackageType.TRANSLATE).g();
        }
        status1 = ((OfflinePackage) (obj)).c;
        if (status == com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE || status1 == com.google.android.libraries.translate.offline.OfflinePackage.Status.AVAILABLE)
        {
            return 2;
        }
        if (status == com.google.android.libraries.translate.offline.OfflinePackage.Status.ERROR || status1 == com.google.android.libraries.translate.offline.OfflinePackage.Status.ERROR)
        {
            obj1 = String.valueOf(((OfflinePackage) (obj1)).g());
            obj = String.valueOf(((OfflinePackage) (obj)).g());
            f = (new StringBuilder(String.valueOf(obj1).length() + 1 + String.valueOf(obj).length())).append(((String) (obj1))).append(",").append(((String) (obj))).toString();
            return 3;
        }
        if (status == com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOADED_POST_PROCESSED && status1 == com.google.android.libraries.translate.offline.OfflinePackage.Status.DOWNLOADED_POST_PROCESSED)
        {
            if (!com.google.android.libraries.translate.e.o.c())
            {
                f = "no-sdcard";
                return 6;
            }
            obj1 = ((OfflinePackage) (obj1)).i();
            obj = ((OfflinePackage) (obj)).i();
            if (obj1 == null && obj == null)
            {
                return 4;
            }
            if (obj1 != null)
            {
                obj = obj1;
            }
            f = ((String) (obj));
            return 5;
        } else
        {
            return 1;
        }
    }

    public void onClick(View view)
    {
        int i = view.getId();
        if (i == m.btn_retry)
        {
            h.a(3, b);
        } else
        if (i == m.btn_action)
        {
            e.run();
            return;
        }
    }
}
