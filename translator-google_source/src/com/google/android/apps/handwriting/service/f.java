// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.libraries.handwriting.base.StrokeList;
import java.lang.ref.WeakReference;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            p, HandwritingRecognitionService, h, d, 
//            c, g, l

final class f extends p
{

    private final WeakReference a;

    f(HandwritingRecognitionService handwritingrecognitionservice)
    {
        a = new WeakReference(handwritingrecognitionservice);
    }

    private d a()
    {
        return HandwritingRecognitionService.a((HandwritingRecognitionService)a.get());
    }

    public final int a(String s, StrokeList strokelist, l l)
    {
        Object obj = (HandwritingRecognitionService)a.get();
        if (obj != null)
        {
            getCallingUid();
            int i = HandwritingRecognitionService.b(((HandwritingRecognitionService) (obj)));
            obj = a();
            ((d) (obj)).sendMessage(((d) (obj)).obtainMessage(2, new h(s, i, strokelist, l)));
            return i;
        } else
        {
            return -1;
        }
    }

    public final int a(String s, StrokeList strokelist, String s1, String s2, l l)
    {
        Object obj = (HandwritingRecognitionService)a.get();
        if (obj != null)
        {
            getCallingUid();
            int i = HandwritingRecognitionService.b(((HandwritingRecognitionService) (obj)));
            obj = a();
            ((d) (obj)).sendMessage(((d) (obj)).obtainMessage(4, new c(s, i, strokelist, s1, s2, l)));
            return i;
        } else
        {
            return -1;
        }
    }

    public final void a(Intent intent, l l)
    {
        HandwritingRecognitionService handwritingrecognitionservice = (HandwritingRecognitionService)a.get();
        HandwritingRecognizer.HandwritingRecognizerSettings handwritingrecognizersettings = new HandwritingRecognizer.HandwritingRecognizerSettings((byte)0);
        handwritingrecognizersettings.a = intent.getStringExtra("LANGUAGE_CODE");
        handwritingrecognizersettings.b = HandwritingRecognizer.HandwritingRecognizerSettings.RecognizerType.values()[intent.getIntExtra("RECOGNIZER_TYPE", 0)];
        handwritingrecognizersettings.c = intent.getStringExtra("CLIENT_ID");
        handwritingrecognizersettings.d = intent.getIntExtra("CLIENT_VERSION", 0);
        int i = getCallingUid();
        intent = ((Context)a.get()).getPackageManager();
        String as[] = intent.getPackagesForUid(i);
        if (as == null || as.length == 0)
        {
            handwritingrecognizersettings.c = "unknownclient";
            handwritingrecognizersettings.d = 0;
        } else
        {
            if (as.length == 1)
            {
                handwritingrecognizersettings.c = as[0];
            } else
            {
                handwritingrecognizersettings.c = Arrays.toString(as);
            }
            try
            {
                handwritingrecognizersettings.d = intent.getPackageInfo(as[0], 0).versionCode;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
        }
        if (handwritingrecognitionservice != null)
        {
            getCallingUid();
            intent = a();
            intent.sendMessage(intent.obtainMessage(1, new g(handwritingrecognizersettings, l)));
        }
    }

    public final void a(String s)
    {
        if ((HandwritingRecognitionService)a.get() != null)
        {
            getCallingUid();
            d d1 = a();
            d1.sendMessage(d1.obtainMessage(3, s));
        }
    }
}
