// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.ui.activity.dialog.ShowDialogAction;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

// Referenced classes of package com.spotify.mobile.android.ui.activity.upsell:
//            UpsellService, Reason

public class ShowUpsellAction
    implements ShowDialogAction
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShowUpsellAction((Flags)parcel.readParcelable(com/spotify/mobile/android/ui/fragments/logic/Flags.getClassLoader()), (Reason)parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShowUpsellAction[i];
        }

    };
    final Flags a;
    final Reason b;
    final String c;
    final String d;

    public ShowUpsellAction(Flags flags, Reason reason, String s, String s1)
    {
        a = flags;
        b = reason;
        c = s;
        d = s1;
    }

    public static ShowUpsellAction a(Intent intent)
    {
        return (ShowUpsellAction)intent.getParcelableExtra("com.spotify.mobile.android.ui.activity.upsell.ShowUpsellAction.EXTRAS_PARAMS");
    }

    public final void a(Context context)
    {
        UpsellService.a(context, this);
    }

    public final void a(Fragment fragment, int i)
    {
        UpsellService.a(fragment, this, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeSerializable(b);
        parcel.writeString(c);
        parcel.writeString(d);
    }

}
