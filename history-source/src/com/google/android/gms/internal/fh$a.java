// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fh, gs, ay, av

public static final class tS
{

    public final ApplicationInfo applicationInfo;
    public final String lL;
    public final gs lO;
    public final ay lS;
    public final List mc;
    public final Bundle tK;
    public final av tL;
    public final PackageInfo tM;
    public final String tO;
    public final String tP;
    public final Bundle tQ;
    public final int tR;
    public final Bundle tS;
    public final boolean tT;

    public (Bundle bundle, av av, ay ay, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, gs gs, Bundle bundle1, List list, Bundle bundle2, boolean flag)
    {
        tK = bundle;
        tL = av;
        lS = ay;
        lL = s;
        applicationInfo = applicationinfo;
        tM = packageinfo;
        tO = s1;
        tP = s2;
        lO = gs;
        tQ = bundle1;
        tT = flag;
        if (list != null && list.size() > 0)
        {
            tR = 2;
            mc = list;
        } else
        {
            tR = 0;
            mc = null;
        }
        tS = bundle2;
    }
}
