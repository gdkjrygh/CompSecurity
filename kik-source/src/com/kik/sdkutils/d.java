// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.support.v4.app.Fragment;
import android.view.View;
import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package com.kik.sdkutils:
//            i, e, s, m

public final class d
{

    public static p a(Fragment fragment, p p1)
    {
        p p2 = new p();
        p1.a(new i(fragment, p2));
        return p2;
    }

    public static p a(View view, p p1)
    {
        p p2 = new p();
        p1.a(new e(view, p2));
        return p2;
    }

    public static r a(Fragment fragment, r r)
    {
        return new s(fragment, r);
    }

    public static r a(View view, r r)
    {
        return new m(view, r);
    }
}
