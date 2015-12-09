// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.app.Fragment;
import android.view.View;

final class dju
{

    static dir a(djj djj1, Fragment fragment, View view)
    {
        dit dit1 = (dit)dmz.a(dit);
        djj1.a;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 100
    //                   1 112
    //                   2 124;
           goto _L1 _L2 _L3 _L4
_L1:
        fragment = dit1.a(fragment, view);
_L6:
        fragment.a(djj1.g);
        fragment.a(djj1.j);
        fragment.b(djj1.h);
        if (fragment.b() != null)
        {
            fragment.b().b(null);
        }
        return fragment;
_L2:
        fragment = dit1.a(fragment, view);
        continue; /* Loop/switch isn't completed */
_L3:
        fragment = dit1.b(fragment, view);
        continue; /* Loop/switch isn't completed */
_L4:
        fragment = dit1.a(fragment);
        if (true) goto _L6; else goto _L5
_L5:
    }
}
