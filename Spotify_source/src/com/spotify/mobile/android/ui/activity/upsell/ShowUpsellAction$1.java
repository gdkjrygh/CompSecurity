// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.os.Parcel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            ShowUpsellAction, Reason

final class 
    implements android.os.activity.upsell.ShowUpsellAction._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new ShowUpsellAction((Flags)parcel.readParcelable(com/spotify/mobile/android/ui/fragments/logic/Flags.getClassLoader()), (Reason)parcel.readSerializable(), parcel.readString(), parcel.readString());
    }

    public final volatile Object[] newArray(int i)
    {
        return new ShowUpsellAction[i];
    }

    ()
    {
    }
}
