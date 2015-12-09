// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity.dialog;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.support.v4.app.Fragment;

// Referenced classes of package com.spotify.mobile.android.ui.activity.dialog:
//            ShowDialogAction

public class ShowDialogByIntentAction
    implements ShowDialogAction
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ShowDialogByIntentAction((Intent)parcel.readParcelable(android/content/Intent.getClassLoader()));
        }

        public final volatile Object[] newArray(int i)
        {
            return new ShowDialogByIntentAction[i];
        }

    };
    private final Intent a;

    public ShowDialogByIntentAction(Intent intent)
    {
        a = intent;
    }

    public final void a(Context context)
    {
        context.startActivity(a);
    }

    public final void a(Fragment fragment, int i)
    {
        fragment.a(a, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
    }

}
