// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fi, gt, ay, av

public static final class tE
{

    public final ApplicationInfo applicationInfo;
    public final String lA;
    public final gt lD;
    public final ay lH;
    public final List lS;
    public final String tA;
    public final String tB;
    public final Bundle tC;
    public final int tD;
    public final Bundle tE;
    public final boolean tF;
    public final Bundle tw;
    public final av tx;
    public final PackageInfo ty;

    public (Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, gt gt, Bundle bundle1, List list, Bundle bundle2, boolean flag)
    {
        tw = bundle;
        tx = av;
        lH = ay;
        lA = s;
        applicationInfo = applicationinfo;
        ty = packageinfo;
        tA = s1;
        tB = s2;
        lD = gt;
        tC = bundle1;
        tF = flag;
        if (list != null && list.size() > 0)
        {
            tD = 2;
            lS = list;
        } else
        {
            tD = 0;
            lS = null;
        }
        tE = bundle2;
    }
}
