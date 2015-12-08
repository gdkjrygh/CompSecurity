// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzgo, zzhy, zzba, zzax

public static final class zzwF
{

    public final ApplicationInfo applicationInfo;
    public final String zzlM;
    public final zzhy zzlP;
    public final zzba zzlV;
    public final List zzmf;
    public final String zzwA;
    public final boolean zzwB;
    public final int zzwC;
    public final long zzwE;
    public final String zzwF;
    public final Bundle zzwm;
    public final zzax zzwn;
    public final PackageInfo zzwo;
    public final String zzwq;
    public final String zzwr;
    public final Bundle zzws;
    public final int zzwt;
    public final Bundle zzwu;
    public final boolean zzwv;
    public final Messenger zzww;
    public final int zzwx;
    public final int zzwy;
    public final float zzwz;

    public (Bundle bundle, zzax zzax, zzba zzba, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, zzhy zzhy, Bundle bundle1, List list, Bundle bundle2, boolean flag, Messenger messenger, 
            int i, int j, float f, String s3, boolean flag1, int k, long l, String s4)
    {
        zzwm = bundle;
        zzwn = zzax;
        zzlV = zzba;
        zzlM = s;
        applicationInfo = applicationinfo;
        zzwo = packageinfo;
        zzwq = s1;
        zzwr = s2;
        zzlP = zzhy;
        zzws = bundle1;
        zzwv = flag;
        zzww = messenger;
        zzwx = i;
        zzwy = j;
        zzwz = f;
        if (list != null && list.size() > 0)
        {
            zzwt = 2;
            zzmf = list;
        } else
        {
            zzwt = 0;
            zzmf = null;
        }
        zzwu = bundle2;
        zzwA = s3;
        zzwB = flag1;
        zzwC = k;
        zzwE = l;
        zzwF = s4;
    }
}
