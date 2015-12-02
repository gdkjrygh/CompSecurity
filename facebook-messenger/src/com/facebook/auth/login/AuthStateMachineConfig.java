// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.auth.login:
//            FirstPartySsoFragment, PasswordCredentialsFragment, LoginApprovalFragment, AuthFragmentConfig, 
//            bg

public class AuthStateMachineConfig
{

    private final ev a;
    private final bg b;
    private final Class c;

    public AuthStateMachineConfig(ParcelableConfigInformation parcelableconfiginformation, bg bg)
    {
        a = parcelableconfiginformation.a;
        c = parcelableconfiginformation.b;
        b = bg;
    }

    public AuthStateMachineConfig(ev ev1, bg bg)
    {
        this(ev1, bg, com/facebook/auth/login/FirstPartySsoFragment);
    }

    public AuthStateMachineConfig(ev ev1, bg bg, Class class1)
    {
        a = ev1;
        b = bg;
        c = class1;
    }

    public static ew a(AuthFragmentConfig authfragmentconfig, AuthFragmentConfig authfragmentconfig1, AuthFragmentConfig authfragmentconfig2)
    {
        return (new ew()).b(com/facebook/auth/login/FirstPartySsoFragment.getCanonicalName(), authfragmentconfig).b(com/facebook/auth/login/PasswordCredentialsFragment.getCanonicalName(), authfragmentconfig1).b(com/facebook/auth/login/LoginApprovalFragment.getCanonicalName(), authfragmentconfig2);
    }

    public AuthFragmentConfig a(Class class1)
    {
        return (AuthFragmentConfig)a.get(class1.getCanonicalName());
    }

    public bg a()
    {
        return b;
    }

    public ParcelableConfigInformation b()
    {
        return new ParcelableConfigInformation(a, c);
    }

    public Class c()
    {
        return c;
    }

    private class ParcelableConfigInformation
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new u();
        public ev a;
        public Class b;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeMap(a);
            parcel.writeString(b.getName());
        }


        private ParcelableConfigInformation(Parcel parcel)
        {
            a = ev.a(parcel.readHashMap(com/facebook/auth/login/AuthFragmentConfig.getClassLoader()));
            try
            {
                b = Class.forName(parcel.readString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                throw new RuntimeException((new StringBuilder()).append("Parceled fragment class for auth start was incorrect: ").append(parcel).toString());
            }
        }

        ParcelableConfigInformation(Parcel parcel, t t)
        {
            this(parcel);
        }

        public ParcelableConfigInformation(ev ev1, Class class1)
        {
            a = ev1;
            b = class1;
        }
    }

}
