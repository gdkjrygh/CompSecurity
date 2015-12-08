// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            w

public final class v
    implements SafeParcelable
{

    public static final w CREATOR = new w();
    public final long es;
    public final int et;
    public final List eu;
    public final boolean ev;
    public final Bundle extras;
    public final int tagForChildDirectedTreatment;
    public final int versionCode;

    v(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k)
    {
        versionCode = i;
        es = l;
        extras = bundle;
        et = j;
        eu = list;
        ev = flag;
        tagForChildDirectedTreatment = k;
    }

    public v(Context context, AdRequest adrequest)
    {
        Object obj1 = null;
        super();
        versionCode = 1;
        Object obj = adrequest.getBirthday();
        long l;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        es = l;
        et = adrequest.getGender();
        obj = adrequest.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        eu = ((List) (obj));
        ev = adrequest.isTestDevice(context);
        tagForChildDirectedTreatment = adrequest.w();
        adrequest = (AdMobExtras)adrequest.getNetworkExtras(com/google/android/gms/ads/mediation/admob/AdMobExtras);
        context = obj1;
        if (adrequest != null)
        {
            context = adrequest.getExtras();
        }
        extras = context;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}
