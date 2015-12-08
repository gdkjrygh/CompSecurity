// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCondition, AppContentConditionEntityCreator

public final class AppContentConditionEntity
    implements SafeParcelable, AppContentCondition
{

    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
    private final int CK;
    private final String XT;
    private final String XU;
    private final String XV;
    private final Bundle XW;

    AppContentConditionEntity(int i, String s, String s1, String s2, Bundle bundle)
    {
        CK = i;
        XT = s;
        XU = s1;
        XV = s2;
        XW = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appcontentcondition)
    {
        CK = 1;
        XT = appcontentcondition.kT();
        XU = appcontentcondition.kT();
        XV = appcontentcondition.kV();
        XW = appcontentcondition.kW();
    }

    static int a(AppContentCondition appcontentcondition)
    {
        return jv.hashCode(new Object[] {
            appcontentcondition.kT(), appcontentcondition.kU(), appcontentcondition.kV(), appcontentcondition.kW()
        });
    }

    static boolean a(AppContentCondition appcontentcondition, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentCondition) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentcondition == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCondition)obj;
        if (!jv.equal(((AppContentCondition) (obj)).kT(), appcontentcondition.kT()) || !jv.equal(((AppContentCondition) (obj)).kU(), appcontentcondition.kU()) || !jv.equal(((AppContentCondition) (obj)).kV(), appcontentcondition.kV()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentCondition) (obj)).kW(), appcontentcondition.kW())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentCondition appcontentcondition)
    {
        return jv.h(appcontentcondition).a("DefaultValue", appcontentcondition.kT()).a("ExpectedValue", appcontentcondition.kU()).a("Predicate", appcontentcondition.kV()).a("PredicateParameters", appcontentcondition.kW()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Object freeze()
    {
        return kX();
    }

    public int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String kT()
    {
        return XT;
    }

    public String kU()
    {
        return XU;
    }

    public String kV()
    {
        return XV;
    }

    public Bundle kW()
    {
        return XW;
    }

    public AppContentCondition kX()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentConditionEntityCreator.a(this, parcel, i);
    }

}
