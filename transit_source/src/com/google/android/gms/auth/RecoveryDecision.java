// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth:
//            RecoveryDecisionCreator

public class RecoveryDecision
    implements SafeParcelable
{

    public static final RecoveryDecisionCreator CREATOR = new RecoveryDecisionCreator();
    final int iM;
    public boolean isRecoveryInfoNeeded;
    public boolean isRecoveryInterstitialAllowed;
    public PendingIntent recoveryIntent;
    public PendingIntent recoveryIntentWithoutIntro;
    public boolean showRecoveryInterstitial;

    public RecoveryDecision()
    {
        iM = 1;
    }

    RecoveryDecision(int i, PendingIntent pendingintent, boolean flag, boolean flag1, boolean flag2, PendingIntent pendingintent1)
    {
        iM = i;
        recoveryIntent = pendingintent;
        showRecoveryInterstitial = flag;
        isRecoveryInfoNeeded = flag1;
        isRecoveryInterstitialAllowed = flag2;
        recoveryIntentWithoutIntro = pendingintent1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        RecoveryDecisionCreator.a(this, parcel, i);
    }

}
