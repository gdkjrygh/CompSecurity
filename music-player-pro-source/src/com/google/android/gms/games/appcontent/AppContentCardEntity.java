// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCard, AppContentCardEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentAnnotation, AppContentAnnotationEntity, AppContentCondition, AppContentConditionEntity

public final class AppContentCardEntity
    implements SafeParcelable, AppContentCard
{

    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
    private final int CK;
    private final String OH;
    private final String UO;
    private final Uri WD;
    private final ArrayList XJ;
    private final String XK;
    private final Uri XN;
    private final ArrayList XO;
    private final int XP;
    private final Bundle XQ;
    private final String XR;
    private final int XS;
    private final ArrayList mActions;
    private final String vc;

    AppContentCardEntity(int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, String s, int j, String s1, 
            Bundle bundle, Uri uri, Uri uri1, String s2, String s3, int k, String s4)
    {
        CK = i;
        mActions = arraylist;
        XO = arraylist1;
        XJ = arraylist2;
        XK = s;
        XP = j;
        UO = s1;
        XQ = bundle;
        WD = uri;
        XN = uri1;
        XR = s2;
        OH = s3;
        XS = k;
        vc = s4;
    }

    public AppContentCardEntity(AppContentCard appcontentcard)
    {
        boolean flag = false;
        super();
        CK = 1;
        XK = appcontentcard.kI();
        XP = appcontentcard.kO();
        UO = appcontentcard.getDescription();
        XQ = appcontentcard.kP();
        WD = appcontentcard.getIconImageUri();
        XN = appcontentcard.kL();
        OH = appcontentcard.getTitle();
        XR = appcontentcard.kQ();
        XS = appcontentcard.kR();
        vc = appcontentcard.getType();
        List list = appcontentcard.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        list = appcontentcard.kN();
        l = list.size();
        XO = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            XO.add((AppContentAnnotationEntity)(AppContentAnnotationEntity)((AppContentAnnotation)list.get(j)).freeze());
        }

        appcontentcard = appcontentcard.kH();
        l = appcontentcard.size();
        XJ = new ArrayList(l);
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            XJ.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentcard.get(k)).freeze());
        }

    }

    static int a(AppContentCard appcontentcard)
    {
        return jv.hashCode(new Object[] {
            appcontentcard.getActions(), appcontentcard.kN(), appcontentcard.kH(), appcontentcard.kI(), Integer.valueOf(appcontentcard.kO()), appcontentcard.getDescription(), appcontentcard.kP(), appcontentcard.getIconImageUri(), appcontentcard.kL(), appcontentcard.kQ(), 
            appcontentcard.getTitle(), Integer.valueOf(appcontentcard.kR()), appcontentcard.getType()
        });
    }

    static boolean a(AppContentCard appcontentcard, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentCard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentcard == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCard)obj;
        if (!jv.equal(((AppContentCard) (obj)).getActions(), appcontentcard.getActions()) || !jv.equal(((AppContentCard) (obj)).kN(), appcontentcard.kN()) || !jv.equal(((AppContentCard) (obj)).kH(), appcontentcard.kH()) || !jv.equal(((AppContentCard) (obj)).kI(), appcontentcard.kI()) || !jv.equal(Integer.valueOf(((AppContentCard) (obj)).kO()), Integer.valueOf(appcontentcard.kO())) || !jv.equal(((AppContentCard) (obj)).getDescription(), appcontentcard.getDescription()) || !jv.equal(((AppContentCard) (obj)).kP(), appcontentcard.kP()) || !jv.equal(((AppContentCard) (obj)).getIconImageUri(), appcontentcard.getIconImageUri()) || !jv.equal(((AppContentCard) (obj)).kL(), appcontentcard.kL()) || !jv.equal(((AppContentCard) (obj)).kQ(), appcontentcard.kQ()) || !jv.equal(((AppContentCard) (obj)).getTitle(), appcontentcard.getTitle()) || !jv.equal(Integer.valueOf(((AppContentCard) (obj)).kR()), Integer.valueOf(appcontentcard.kR())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentCard) (obj)).getType(), appcontentcard.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentCard appcontentcard)
    {
        return jv.h(appcontentcard).a("Actions", appcontentcard.getActions()).a("Annotations", appcontentcard.kN()).a("Conditions", appcontentcard.kH()).a("ContentDescription", appcontentcard.kI()).a("CurrentSteps", Integer.valueOf(appcontentcard.kO())).a("Description", appcontentcard.getDescription()).a("ExtraData", appcontentcard.kP()).a("IconImageUri", appcontentcard.getIconImageUri()).a("ImageUri", appcontentcard.kL()).a("Subtitle", appcontentcard.kQ()).a("Title", appcontentcard.getTitle()).a("TotalSteps", Integer.valueOf(appcontentcard.kR())).a("Type", appcontentcard.getType()).toString();
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
        return kS();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
    }

    public String getDescription()
    {
        return UO;
    }

    public Uri getIconImageUri()
    {
        return WD;
    }

    public String getTitle()
    {
        return OH;
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

    public Uri kL()
    {
        return XN;
    }

    public List kN()
    {
        return new ArrayList(XO);
    }

    public int kO()
    {
        return XP;
    }

    public Bundle kP()
    {
        return XQ;
    }

    public String kQ()
    {
        return XR;
    }

    public int kR()
    {
        return XS;
    }

    public AppContentCard kS()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentCardEntityCreator.a(this, parcel, i);
    }

}
