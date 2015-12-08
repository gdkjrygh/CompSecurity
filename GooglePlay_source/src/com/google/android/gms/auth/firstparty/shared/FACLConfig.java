// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            FACLConfigCreator

public class FACLConfig
    implements SafeParcelable
{

    public static final FACLConfigCreator CREATOR = new FACLConfigCreator();
    boolean hasShowCircles;
    boolean isAllCirclesVisible;
    boolean isAllContactsVisible;
    boolean showCircles;
    boolean showContacts;
    final int version;
    String visibleEdges;

    FACLConfig(int i, boolean flag, String s, boolean flag1, boolean flag2, boolean flag3, boolean flag4)
    {
        version = i;
        isAllCirclesVisible = flag;
        visibleEdges = s;
        isAllContactsVisible = flag1;
        showCircles = flag2;
        showContacts = flag3;
        hasShowCircles = flag4;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof FACLConfig)
        {
            obj = (FACLConfig)obj;
            flag = flag1;
            if (isAllCirclesVisible == ((FACLConfig) (obj)).isAllCirclesVisible)
            {
                flag = flag1;
                if (TextUtils.equals(visibleEdges, ((FACLConfig) (obj)).visibleEdges))
                {
                    flag = flag1;
                    if (isAllContactsVisible == ((FACLConfig) (obj)).isAllContactsVisible)
                    {
                        flag = flag1;
                        if (showCircles == ((FACLConfig) (obj)).showCircles)
                        {
                            flag = flag1;
                            if (showContacts == ((FACLConfig) (obj)).showContacts)
                            {
                                flag = flag1;
                                if (hasShowCircles == ((FACLConfig) (obj)).hasShowCircles)
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Boolean.valueOf(isAllCirclesVisible), visibleEdges, Boolean.valueOf(isAllContactsVisible), Boolean.valueOf(showCircles), Boolean.valueOf(showContacts), Boolean.valueOf(hasShowCircles)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FACLConfigCreator.writeToParcel$5331385a(this, parcel);
    }

}
