// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.spotify.mobile.android.spotlets.collection.service.AnnotateService;
import com.spotify.mobile.android.spotlets.collection.service.Annotation;
import java.util.Map;

public final class eoh extends dwj
{

    public final String f;
    final eoi g;
    private final de h;
    private final BroadcastReceiver i = new BroadcastReceiver() {

        private eoh a;

        public final void onReceive(Context context1, Intent intent)
        {
            if (a.f.equals(intent.getStringExtra("playlist_uri")))
            {
                a.g.a(AnnotateService.a(intent));
            }
        }

            
            {
                a = eoh.this;
                super();
            }
    };

    public eoh(Context context, String s, eoi eoi1)
    {
        super(context, com/spotify/mobile/android/spotlets/collection/service/AnnotateService);
        f = s;
        g = eoi1;
        h = de.a(context);
        context = new IntentFilter("com.spotify.mobile.android.spotlets.collection.service.AnnotateService.action.JOB_CHANGED");
        context.addCategory("android.intent.category.DEFAULT");
        h.a(i, context);
    }

    public static boolean a(com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status status)
    {
        return status == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.b || status == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.c || status == com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d;
    }

    protected final void e()
    {
        super.e();
        g.a();
    }

    public final com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status g()
    {
        return ((eob)f()).a(f);
    }

    public final void h()
    {
        eob eob1;
        String s;
        Annotation annotation;
        eob1 = (eob)f();
        s = f;
        eob1.a(s);
        annotation = (Annotation)AnnotateService.h(eob1.a).get(s);
        if (annotation == null) goto _L2; else goto _L1
_L1:
        com.spotify.mobile.android.spotlets.collection.service.AnnotateService._cls5.a[annotation.getStatus().ordinal()];
        JVM INSTR tableswitch 1 6: default 88
    //                   1 89
    //                   2 89
    //                   3 88
    //                   4 88
    //                   5 88
    //                   6 113;
           goto _L2 _L3 _L3 _L2 _L2 _L2 _L4
_L2:
        return;
_L3:
        AnnotateService.a(eob1.a, s, annotation.getImageUri());
        AnnotateService.a(eob1.a, s, com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.f);
        return;
_L4:
        AnnotateService.a(eob1.a, s, annotation, com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.f);
        return;
    }

    public final void i()
    {
        b();
        h.a(i);
    }
}
