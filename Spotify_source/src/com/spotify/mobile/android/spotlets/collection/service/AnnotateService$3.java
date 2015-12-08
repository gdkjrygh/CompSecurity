// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.service;

import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import eoj;
import gcf;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.service:
//            AnnotateService, Annotation

final class f
    implements Runnable
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private AnnotateService g;

    public final void run()
    {
        String s1 = a;
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = AnnotateService.g(g).a(b, c, d);
            if (s == null)
            {
                Assertion.b("playlistUri is null which should never happen.");
                return;
            }
        }
        if (e != null || f != null)
        {
            String s2 = e;
            s2 = f;
            if (!AnnotateService.h(g).containsKey(s))
            {
                Annotation annotation = new Annotation(b, f, e, atus.b, gcf.a());
                AnnotateService.a(g, s, annotation, atus.b);
            }
            AnnotateService.i(g);
            g.b();
            return;
        } else
        {
            AnnotateService.i(g);
            return;
        }
    }

    atus(AnnotateService annotateservice, String s, String s1, String s2, String s3, String s4, String s5)
    {
        g = annotateservice;
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        super();
    }
}
