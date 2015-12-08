// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            WebSetupConfigRequestCreator

public class WebSetupConfigRequest
    implements SafeParcelable
{

    public static final WebSetupConfigRequestCreator CREATOR = new WebSetupConfigRequestCreator();
    public final AppDescription callingAppDescription;
    final int version;

    WebSetupConfigRequest(int i, AppDescription appdescription)
    {
        version = i;
        callingAppDescription = (AppDescription)Preconditions.checkNotNull(appdescription);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        WebSetupConfigRequestCreator.writeToParcel(this, parcel, i);
    }

}
