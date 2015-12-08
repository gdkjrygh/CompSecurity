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
//            c

public class FacebookSignInConfig
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a;
    private Intent b;
    private final ArrayList c;

    public FacebookSignInConfig()
    {
        this(1, null, new ArrayList());
    }

    FacebookSignInConfig(int i, Intent intent, ArrayList arraylist)
    {
        a = i;
        b = intent;
        c = arraylist;
    }

    public final Intent a()
    {
        return b;
    }

    public final ArrayList b()
    {
        return new ArrayList(c);
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
        if (c.size() != ((FacebookSignInConfig) (obj = (FacebookSignInConfig)obj)).b().size() || !(flag = c.containsAll(((FacebookSignInConfig) (obj)).b()))) goto _L1; else goto _L3
_L3:
        return true;
        obj;
        return false;
    }

    public int hashCode()
    {
        Collections.sort(c);
        return c.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.auth.api.signin.c.a(this, parcel, i);
    }

}
