// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.shared:
//            AppDescriptionCreator

public class AppDescription
    implements SafeParcelable
{

    public static final AppDescriptionCreator CREATOR = new AppDescriptionCreator();
    private static final String LOG_PREFIX = (new StringBuilder("[")).append(com/google/android/gms/auth/firstparty/shared/AppDescription.getSimpleName()).append("]").toString();
    private final String LOG_MSG_TMPL = (new StringBuilder("[")).append(getClass().getSimpleName()).append("] %s - %s: %s").toString();
    String callingPkg;
    int callingUid;
    boolean isSetupWizardInProgress;
    String sessionId;
    String sessionSig;
    final int version;

    AppDescription(int i, int j, String s, String s1, String s2, boolean flag)
    {
        version = i;
        sessionId = s;
        sessionSig = s1;
        callingPkg = Preconditions.checkNotEmpty(s2, (new StringBuilder()).append(LOG_PREFIX).append(" callingPkg cannot be null or empty!").toString());
        boolean flag1;
        if (j != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "Invalid callingUid! Cannot be 0!");
        callingUid = j;
        isSetupWizardInProgress = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return (new StringBuilder(getClass().getSimpleName())).append("<").append(callingPkg).append(", ").append(callingUid).append(">").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AppDescriptionCreator.writeToParcel$8f79f6f(this, parcel);
    }

}
