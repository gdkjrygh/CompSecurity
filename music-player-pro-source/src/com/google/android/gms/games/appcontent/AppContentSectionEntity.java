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
//            AppContentSection, AppContentSectionEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentCard, AppContentCardEntity

public final class AppContentSectionEntity
    implements SafeParcelable, AppContentSection
{

    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
    private final int CK;
    private final String OH;
    private final String XK;
    private final Bundle XQ;
    private final String XR;
    private final Uri XY;
    private final ArrayList XZ;
    private final ArrayList mActions;
    private final String vc;

    AppContentSectionEntity(int i, ArrayList arraylist, Uri uri, ArrayList arraylist1, String s, Bundle bundle, String s1, 
            String s2, String s3)
    {
        CK = i;
        mActions = arraylist;
        XY = uri;
        XZ = arraylist1;
        XK = s;
        XQ = bundle;
        XR = s1;
        OH = s2;
        vc = s3;
    }

    public AppContentSectionEntity(AppContentSection appcontentsection)
    {
        boolean flag = false;
        super();
        CK = 1;
        XY = appcontentsection.kY();
        XK = appcontentsection.kI();
        XQ = appcontentsection.kP();
        XR = appcontentsection.kQ();
        OH = appcontentsection.getTitle();
        vc = appcontentsection.getType();
        List list = appcontentsection.getActions();
        int k = list.size();
        mActions = new ArrayList(k);
        for (int i = 0; i < k; i++)
        {
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        appcontentsection = appcontentsection.kZ();
        k = appcontentsection.size();
        XZ = new ArrayList(k);
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            XZ.add((AppContentCardEntity)(AppContentCardEntity)((AppContentCard)appcontentsection.get(j)).freeze());
        }

    }

    static int a(AppContentSection appcontentsection)
    {
        return jv.hashCode(new Object[] {
            appcontentsection.getActions(), appcontentsection.kY(), appcontentsection.kZ(), appcontentsection.kI(), appcontentsection.kP(), appcontentsection.kQ(), appcontentsection.getTitle(), appcontentsection.getType()
        });
    }

    static boolean a(AppContentSection appcontentsection, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentSection) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentsection == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentSection)obj;
        if (!jv.equal(((AppContentSection) (obj)).getActions(), appcontentsection.getActions()) || !jv.equal(((AppContentSection) (obj)).kY(), appcontentsection.kY()) || !jv.equal(((AppContentSection) (obj)).kZ(), appcontentsection.kZ()) || !jv.equal(((AppContentSection) (obj)).kI(), appcontentsection.kI()) || !jv.equal(((AppContentSection) (obj)).kP(), appcontentsection.kP()) || !jv.equal(((AppContentSection) (obj)).kQ(), appcontentsection.kQ()) || !jv.equal(((AppContentSection) (obj)).getTitle(), appcontentsection.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentSection) (obj)).getType(), appcontentsection.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentSection appcontentsection)
    {
        return jv.h(appcontentsection).a("Actions", appcontentsection.getActions()).a("BackgroundImageUri", appcontentsection.kY()).a("Cards", appcontentsection.kZ()).a("ContentDescription", appcontentsection.kI()).a("ExtraData", appcontentsection.kP()).a("Subtitle", appcontentsection.kQ()).a("Title", appcontentsection.getTitle()).a("Type", appcontentsection.getType()).toString();
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
        return la();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
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

    public String kI()
    {
        return XK;
    }

    public Bundle kP()
    {
        return XQ;
    }

    public String kQ()
    {
        return XR;
    }

    public Uri kY()
    {
        return XY;
    }

    public List kZ()
    {
        return new ArrayList(XZ);
    }

    public AppContentSection la()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentSectionEntityCreator.a(this, parcel, i);
    }

}
