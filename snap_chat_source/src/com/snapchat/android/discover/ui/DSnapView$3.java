// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui;

import Jr;
import android.animation.Animator;
import wd;

// Referenced classes of package com.snapchat.android.discover.ui:
//            DSnapView

public final class f extends Jr
{

    private float a;
    private float b;
    private wd c;
    private boolean d;
    private com.snapchat.android.discover.model.ediaType e;
    private long f;
    private DSnapView g;

    public final void onAnimationEnd(Animator animator)
    {
        DSnapView.a(g, a, b, c, d, e, f);
    }

    public l.MediaType(DSnapView dsnapview, float f1, float f2, wd wd, boolean flag, com.snapchat.android.discover.model.ediaType ediatype, long l)
    {
        g = dsnapview;
        a = f1;
        b = f2;
        c = wd;
        d = flag;
        e = ediatype;
        f = l;
        super();
    }
}
