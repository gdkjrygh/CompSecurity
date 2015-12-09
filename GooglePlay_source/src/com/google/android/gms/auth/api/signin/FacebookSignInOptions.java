// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//            FacebookSignInOptionsCreator

public class FacebookSignInOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new FacebookSignInOptionsCreator();
    Intent mIntent;
    private final ArrayList mScopes;
    final int versionCode;

    public FacebookSignInOptions()
    {
        this(1, null, new ArrayList());
    }

    FacebookSignInOptions(int i, Intent intent, ArrayList arraylist)
    {
        versionCode = i;
        mIntent = intent;
        mScopes = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        if (mScopes.size() != ((FacebookSignInOptions) (obj = (FacebookSignInOptions)obj)).getScopes().size() || !(flag = mScopes.containsAll(((FacebookSignInOptions) (obj)).getScopes()))) goto _L1; else goto _L3
_L3:
        return true;
        obj;
        return false;
    }

    public final ArrayList getScopes()
    {
        return new ArrayList(mScopes);
    }

    public int hashCode()
    {
        Collections.sort(mScopes);
        return mScopes.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        FacebookSignInOptionsCreator.writeToParcel(this, parcel, i);
    }

}
