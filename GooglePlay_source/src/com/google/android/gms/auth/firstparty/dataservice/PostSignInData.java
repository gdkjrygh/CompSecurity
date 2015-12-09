// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.dataservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.firstparty.dataservice:
//            PostSignInDataCreator

public class PostSignInData
    implements SafeParcelable
{

    public static final PostSignInDataCreator CREATOR = new PostSignInDataCreator();
    public final PendingIntent accountInstallationCompletionAction;
    public final Intent postSignInForeignIntent;
    final int version;

    PostSignInData(int i, Intent intent, PendingIntent pendingintent)
    {
        version = i;
        postSignInForeignIntent = intent;
        accountInstallationCompletionAction = pendingintent;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PostSignInDataCreator.writeToParcel(this, parcel, i);
    }

}
