// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.comscore.utils.TransmissionMode;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

final class aik
    implements Runnable
{

    private aif a;

    aik(aif aif1)
    {
        a = aif1;
        super();
    }

    public final void run()
    {
        Object obj;
        a.a();
        obj = a;
        if (((aif) (obj)).C == null) goto _L2; else goto _L1
_L1:
        Object obj1 = ((aif) (obj)).C.getResources().getAssets();
        Object obj2;
        obj2 = ((AssetManager) (obj1)).open("comScore.properties");
        obj1 = new Properties();
        ((Properties) (obj1)).load(((java.io.InputStream) (obj2)));
        ajr.a = ajy.e(((aif) (obj)).a("Debug", ((Properties) (obj1)), false));
        obj.I = ajy.e(((aif) (obj)).a("Secure", ((Properties) (obj1)), false));
        obj2 = ((aif) (obj)).a("PublisherSecret", ((Properties) (obj1)), true);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ((aif) (obj)).b(((String) (obj2)));
        obj2 = ((aif) (obj)).a("AppName", ((Properties) (obj1)), true);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        ((aif) (obj)).c(((String) (obj2)));
        obj2 = ((aif) (obj)).a("CustomerC2", ((Properties) (obj1)), false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        ((aif) (obj)).d(((String) (obj2)));
        obj2 = ((aif) (obj)).a("PixelURL", ((Properties) (obj1)), false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        ((aif) (obj)).a(((String) (obj2)));
        obj2 = ((aif) (obj)).a("OfflineURL", ((Properties) (obj1)), false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        ((aif) (obj)).a.b(((String) (obj2)));
        obj2 = ((aif) (obj)).a("LiveTransmissionMode", ((Properties) (obj1)), false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_199;
        }
        obj.J = TransmissionMode.valueOf(((String) (obj2)).toUpperCase(Locale.getDefault()));
_L10:
        obj2 = ((aif) (obj)).a("OfflineTransmissionMode", ((Properties) (obj1)), false);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        obj.K = TransmissionMode.valueOf(((String) (obj2)).toUpperCase(Locale.getDefault()));
_L7:
        int i;
        obj.F = ajy.a(((aif) (obj)).a("KeepAliveEnabled", ((Properties) (obj1)), false), true);
        i = ajy.a(((aif) (obj)).a("CacheMaxSize", ((Properties) (obj1)), false), -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_270;
        }
        ((aif) (obj)).a.a(i);
        i = ajy.a(((aif) (obj)).a("CacheMaxBatchSize", ((Properties) (obj1)), false), -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        ((aif) (obj)).a.b(i);
        i = ajy.a(((aif) (obj)).a("CacheMaxFlushesInARow", ((Properties) (obj1)), false), -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        ((aif) (obj)).a.a = i;
        i = ajy.a(((aif) (obj)).a("CacheMinutesToRetry", ((Properties) (obj1)), false), -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        ((aif) (obj)).a.c(i);
        i = ajy.a(((aif) (obj)).a("CacheExpiryInDays", ((Properties) (obj1)), false), -1);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        ((aif) (obj)).a.d(i);
        long l = ajy.a(((aif) (obj)).a("CacheFlushingInterval", ((Properties) (obj1)), false), -1L);
        if (l < 0L)
        {
            break MISSING_BLOCK_LABEL_425;
        }
        obj.G = l;
        if (((aif) (obj)).d != null)
        {
            ((aif) (obj)).d.b();
        }
        boolean flag = ajy.e(((aif) (obj)).a("ErrorHandlingEnabled", ((Properties) (obj1)), false));
        if (!((aif) (obj)).N) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        Thread.setDefaultUncaughtExceptionHandler(new ajs(((aif) (obj))));
_L4:
        obj.r = ajy.a(((aif) (obj)).a("AutoStartEnabled", ((Properties) (obj1)), false), true);
        flag = ajy.a(((aif) (obj)).a("AutoUpdateInForegroundOnly", ((Properties) (obj1)), false), true);
        i = ajy.a(((aif) (obj)).a("AutoUpdateInterval", ((Properties) (obj1)), false), -1);
        if (i >= 60)
        {
            IllegalArgumentException illegalargumentexception;
            try
            {
                ((aif) (obj)).a(i, flag);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            break MISSING_BLOCK_LABEL_533;
        }
          goto _L2
        illegalargumentexception;
        obj.J = TransmissionMode.a;
        continue; /* Loop/switch isn't completed */
        if (ajr.a)
        {
            ajn.a(((Exception) (obj)));
            return;
        }
          goto _L2
        IllegalArgumentException illegalargumentexception1;
        illegalargumentexception1;
        obj.K = TransmissionMode.a;
          goto _L7
_L6:
        if (Thread.getDefaultUncaughtExceptionHandler() == ((aif) (obj)).H) goto _L4; else goto _L8
_L8:
        Thread.setDefaultUncaughtExceptionHandler(((aif) (obj)).H);
          goto _L4
_L2:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
