// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotation, AppContentAnnotationEntityCreator

public final class AppContentAnnotationEntity
    implements SafeParcelable, AppContentAnnotation
{

    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
    private final int CK;
    private final String OH;
    private final String UO;
    private final Uri XN;
    private final String vc;

    AppContentAnnotationEntity(int i, String s, Uri uri, String s1, String s2)
    {
        CK = i;
        UO = s;
        XN = uri;
        OH = s1;
        vc = s2;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appcontentannotation)
    {
        CK = 1;
        UO = appcontentannotation.getDescription();
        XN = appcontentannotation.kL();
        OH = appcontentannotation.getTitle();
        vc = appcontentannotation.getType();
    }

    static int a(AppContentAnnotation appcontentannotation)
    {
        return jv.hashCode(new Object[] {
            appcontentannotation.getDescription(), appcontentannotation.kL(), appcontentannotation.getTitle(), appcontentannotation.getType()
        });
    }

    static boolean a(AppContentAnnotation appcontentannotation, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentAnnotation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentannotation == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAnnotation)obj;
        if (!jv.equal(((AppContentAnnotation) (obj)).getDescription(), appcontentannotation.getDescription()) || !jv.equal(((AppContentAnnotation) (obj)).kL(), appcontentannotation.kL()) || !jv.equal(((AppContentAnnotation) (obj)).getTitle(), appcontentannotation.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(((AppContentAnnotation) (obj)).getType(), appcontentannotation.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(AppContentAnnotation appcontentannotation)
    {
        return jv.h(appcontentannotation).a("Description", appcontentannotation.getDescription()).a("ImageUri", appcontentannotation.kL()).a("Title", appcontentannotation.getTitle()).a("Type", appcontentannotation.getType()).toString();
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
        return kM();
    }

    public String getDescription()
    {
        return UO;
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

    public Uri kL()
    {
        return XN;
    }

    public AppContentAnnotation kM()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppContentAnnotationEntityCreator.a(this, parcel, i);
    }

}
