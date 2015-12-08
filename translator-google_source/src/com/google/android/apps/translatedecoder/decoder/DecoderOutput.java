// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            j, k

public final class DecoderOutput
{

    String a;
    String b;
    String c;
    public String d;
    double e;
    public int f;
    public final List g = new ArrayList();
    public final List h = new ArrayList();
    public final List i = new ArrayList();

    public DecoderOutput()
    {
        a = "";
        b = "";
        c = "";
        d = "";
        e = 0.0D;
        f = 0;
    }

    public final void a(FeaturesUsed featuresused)
    {
        i.add(featuresused);
    }

    public final void a(j j)
    {
        g.add(j);
    }

    public final void a(k k)
    {
        h.add(k);
    }
}
