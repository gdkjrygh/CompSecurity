// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAction, AppContentActionEntityCreator, AppContentCondition, AppContentConditionEntity

public final class AppContentActionEntity
    implements SafeParcelable, AppContentAction
{

    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
    private final int CK;
    private final ArrayList XJ;
    private final String XK;
    private final String XL;
    private final String XM;
    private final Bundle mExtras;
    private final String vc;

    AppContentActionEntity(int i, ArrayList arraylist, String s, Bundle bundle, String s1, String s2, String s3)
    {
        CK = i;
        XJ = arraylist;
        XK = s;
        mExtras = bundle;
        XL = s1;
        XM = s2;
        vc = s3;
    }

    public AppContentActionEntity(AppContentAction appcontentaction)
    {
        CK = 1;
        XK = appcontentaction.kI();
        mExtras = appcontentaction.getExtras();
        XL = appcontentaction.getLabel();
        XM = appcontentaction.kJ();
        vc = appcontentaction.getType();
        appcontentaction = appcontentaction.kH();
        int j = appcontentaction.size();
        XJ = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            XJ.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentaction.get(i)).freeze());
        }

    }

    static int a(AppContentAction appcontentaction)
    {
        return jv.hashCode(new Object[] {
            appcontentaction.kH(), appcontentaction.kI(), appcontentaction.getExtras(), appcontentaction.getLabel(), appcontentaction.kJ(), appcontentaction.getType()
        });
    }

    static boolean a(AppContentAction appcontentaction, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentAction) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentaction == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAction)obj;
        if (!jv.equal(((AppContentAction) (obj)).kH(), appcontentaction.kH()) || !jv.equal(((AppContentAction) (obj)).kI(), appcontentaction.kI()) || !jv.equal(((AppContentAction) (obj)).getExtras(), appcontentaction.getExtras()) || !jv.equal(((AppContentAction) (obj)).getLabel(), appcontentaction.getLabel()) || !jv.equal(((AppContentAction) (obj)).kJ(), appcontentaction.kJ()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentAction) (obj)).getType(), appcontentaction.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentAction appcontentaction)
    {
        return jv.h(appcontentaction).a("Conditions", appcontentaction.kH()).a("ContentDescription", appcontentaction.kI()).a("Extras", appcontentaction.getExtras()).a("Label", appcontentaction.getLabel()).a("LabelStyle", appcontentaction.kJ()).a("Type", appcontentaction.getType()).toString();
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
        return kK();
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getLabel()
    {
        return XL;
    }

    public String getType()
    {
        return vc;
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

    public List kH()
    {
        return new ArrayList(XJ);
    }

    public String kI()
    {
        return XK;
    }

    public String kJ()
    {
        return XM;
    }

    public AppContentAction kK()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentActionEntityCreator.a(this, parcel, i);
    }

}
