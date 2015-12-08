// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.a.a;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.k;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.f;
import com.google.android.libraries.translate.logging.Event;
import com.google.android.libraries.translate.logging.e;
import com.google.android.libraries.translate.offline.OfflineTranslationException;
import com.google.android.libraries.translate.offline.o;
import com.google.android.libraries.translate.offline.r;
import com.google.android.libraries.translate.speech.c;
import com.google.android.libraries.wordlens.WordLensSystem;

// Referenced classes of package com.google.android.apps.translate:
//            h, r

public class TranslateApplication extends Application
{

    public TranslateApplication()
    {
    }

    protected void attachBaseContext(Context context)
    {
        super.attachBaseContext(context);
        a.a(this);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (TextUtils.isEmpty(b.a(this)))
        {
            f.b(this);
        }
    }

    public void onCreate()
    {
        long l = System.currentTimeMillis();
        super.onCreate();
        Singleton.a(this, new com.google.android.apps.translate.d.a(this), com.google.android.libraries.translate.core.Singleton.TranslateClientId.PHONE_ANDROID_TRANSLATE);
        String as[] = getResources().getStringArray(h.prodUserAgentStrings);
        if (as != null)
        {
            d.b(as);
        }
        as = getResources().getStringArray(h.debugUserAgentStrings);
        if (as != null)
        {
            d.a(as);
        }
        ((c)Singleton.e.b()).a();
        (new r((o)Singleton.c.b())).a(new Void[0]);
        f.b(this);
        Singleton.b().a(Event.APP_LOAD, l, null, null);
        if (WordLensSystem.a() != com.google.android.libraries.wordlens.WordLensSystem.WLSupportLevel.NONE)
        {
            String s;
            try
            {
                s = com.google.android.libraries.translate.offline.f.a(this);
            }
            catch (OfflineTranslationException offlinetranslationexception)
            {
                Singleton.b().a(offlinetranslationexception.getErrorCode(), offlinetranslationexception.getCauseCode());
                offlinetranslationexception = "";
            }
            WordLensSystem.a(this, s);
        }
        b.b(this, Boolean.valueOf(getString(r.default_disable_tts_cache)).booleanValue());
        if (b.f(this, null) == null)
        {
            b.d(this, getString(r.default_single_speech_service));
        }
        if (b.g(this, null) == null)
        {
            b.e(this, getString(r.default_multi_speech_service));
        }
        b.c(this, Boolean.valueOf(getString(r.default_disable_translation_cache)).booleanValue());
    }

    public void onTerminate()
    {
        super.onTerminate();
        Singleton.d.c();
        Singleton.c.c();
        Singleton.b.c();
        Singleton.e.c();
    }
}
