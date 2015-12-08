// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.roidapp.baselib.c.an;
import java.util.Locale;

// Referenced classes of package com.roidapp.photogrid.common:
//            cd

public final class cc
{

    String a;
    String b;
    String c;
    String d;
    private Context e;

    public cc(Context context)
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = context;
    }

    static Context a(cc cc1)
    {
        return cc1.e;
    }

    public final void a()
    {
        Object obj;
        Object obj1;
        obj1 = e.getResources().getConfiguration().locale;
        obj = (new StringBuilder()).append(((Locale) (obj1)).getLanguage()).toString();
        obj1 = (new StringBuilder()).append(((Locale) (obj1)).getCountry()).toString();
        d = "http://market.android.com/details?id=com.roidapp.photogrid";
        if (((String) (obj)).equals("en"))
        {
            break MISSING_BLOCK_LABEL_502;
        }
        if (!((String) (obj)).equals("ar")) goto _L2; else goto _L1
_L1:
        a = "\u0639\u0632\u064A\u0632\u064A \u0627\u0644\u0645\u0633\u062A\u062E\u062F\u0645";
        b = "\u0645\u0644\u0641 \u0645\u0639\u0637\u0648\u0628\u060C \u0627\u0644\u0631\u062C\u0627\u0621 \u0625\u0639\u0627\u062F\u0629 \u062A\u062B\u0628\u064A\u062A \u0627\u0644\u062A\u0637\u0628\u064A\u0642 \u0645\u0646 Google Play";
        c = "OK";
_L3:
        obj = new android.app.AlertDialog.Builder(e);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(a);
        ((android.app.AlertDialog.Builder) (obj)).setMessage(b);
        ((android.app.AlertDialog.Builder) (obj)).setPositiveButton(c, new cd(this));
        ((android.app.AlertDialog.Builder) (obj)).create();
        ((android.app.AlertDialog.Builder) (obj)).show();
        return;
_L2:
label0:
        {
            if (!((String) (obj)).equals("de"))
            {
                break label0;
            }
            a = "Sehr geehrter Nutzer";
            b = "Datei besch\344digt, Bitte installieren Sie die App von Google Play.";
            c = "OK";
        }
          goto _L3
label1:
        {
            if (!((String) (obj)).equals("es"))
            {
                break label1;
            }
            a = "Estimado usuario";
            b = "Archivo da\361ado, vuelva a instalar la aplicaci\363n desde Google Play.";
            c = "OK";
        }
          goto _L3
label2:
        {
            if (!((String) (obj)).equals("fr"))
            {
                break label2;
            }
            a = "Cher utilisateur";
            b = "Fichier corrompu, veuillez r\351installer l'application \340 pratir de Google Play.";
            c = "OK";
        }
          goto _L3
label3:
        {
            if (!((String) (obj)).equals("ja"))
            {
                break label3;
            }
            a = "\u30E6\u30FC\u30B6\u30FC\u5404\u4F4D";
            b = "\u7834\u640D\u3057\u305F\u30D5\u30A1\u30A4\u30EB\u306F\u3001Google Play \u304B\u3089\u30A2\u30D7\u30EA\u3092\u518D\u30A4\u30F3\u30B9\u30C8\u30FC\u30EB\u3057\u3066\u304F\u3060\u3055\u3044\u3002";
            c = "OK";
        }
          goto _L3
label4:
        {
            if (!((String) (obj)).equals("ko"))
            {
                break label4;
            }
            a = "\uC0AC\uC6A9\uC790\uB2D8\uAED8";
            b = "\uC190\uC0C1\uB41C \uD30C\uC77C, \uC560\uD50C\uB9AC\uCF00\uC774\uC158\uC744\uC5D0\uC11C \uB2E4\uC2DC \uC124\uCE58\uD558\uC2ED\uC2DC\uC624 Google Play.";
            c = "OK";
        }
          goto _L3
label5:
        {
            if (!((String) (obj)).equals("ru"))
            {
                break label5;
            }
            a = "\u0423\u0432\u0430\u0436\u0430\u0435\u043C\u044B\u0439 \u043F\u043E\u043B\u044C\u0437\u043E\u0432\u0430\u0442\u0435\u043B\u044C";
            b = "\u0424\u0430\u0439\u043B \u043F\u043E\u0432\u0440\u0435\u0436\u0434\u0435\u043D, \u043F\u043E\u0436\u0430\u043B\u0443\u0439\u0441\u0442\u0430, \u043F\u0435\u0440\u0435\u0443\u0441\u0442\u0430\u043D\u043E\u0432\u0438\u0442\u0435 \u043F\u0440\u0438\u043B\u043E\u0436\u0435\u043D\u0438\u0435 \u0438\u0437 Google Play.";
            c = "OK";
        }
          goto _L3
label6:
        {
            if (!((String) (obj)).equals("th"))
            {
                break label6;
            }
            a = "\u0E40\u0E23\u0E35\u0E22\u0E19\u0E1C\u0E39\u0E49\u0E43\u0E0A\u0E49";
            b = "\u0E22\u0E37\u0E48\u0E19\u0E40\u0E2A\u0E35\u0E22\u0E2B\u0E32\u0E22\u0E01\u0E23\u0E38\u0E13\u0E32\u0E15\u0E34\u0E14\u0E15\u0E31\u0E49\u0E07\u0E15\u0E48\u0E32\u0E07\u0E08\u0E32\u0E01 Google Play.";
            c = "OK";
        }
          goto _L3
label7:
        {
            if (!((String) (obj)).equals("tr"))
            {
                break label7;
            }
            a = "say\u0131n kullan\u0131c\u0131";
            b = "Dosya zarar g\366rd\374, l\374tfen uygulamay\u0131 Google Playden tekrar y\374kleyin.";
            c = "OK";
        }
          goto _L3
label8:
        {
            if (!((String) (obj)).equals("zh") || !((String) (obj1)).equals("CN"))
            {
                break label8;
            }
            a = "\u4EB2\u7231\u7684\u7528\u6237";
            b = "\u6587\u4EF6\u635F\u574F\uFF0C\u8BF7\u91CD\u65B0\u5B89\u88C5\u5E94\u7528\u7A0B\u5E8F\u4ECEGoogle Play\u3002";
            c = "OK";
        }
          goto _L3
        if (!((String) (obj)).equals("zh") || !((String) (obj1)).equals("TW"))
        {
            break MISSING_BLOCK_LABEL_502;
        }
        a = "\u89AA\u611B\u7684\u7528\u6236";
        b = "\u6587\u4EF6\u640D\u58DE\uFF0C\u8ACB\u5F9EGoogle Play\u91CD\u65B0\u5B89\u88DD\u61C9\u7528\u7A0B\u5E8F\u3002";
        c = "OK";
          goto _L3
        try
        {
            a = "Dear user";
            b = "File corrupted, please reinstall the app from Google Play";
            c = "OK";
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            an.a(e, b);
            ((android.view.WindowManager.BadTokenException) (obj)).printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            an.a(e, b);
            ((Exception) (obj)).printStackTrace();
            return;
        }
          goto _L3
    }
}
