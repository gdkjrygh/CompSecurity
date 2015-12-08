// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ik;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            c

public class LaunchOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private LaunchOptions Fd;

        public LaunchOptions build()
        {
            return Fd;
        }

        public Builder setLocale(Locale locale)
        {
            Fd.setLanguage(ik.b(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean flag)
        {
            Fd.setRelaunchIfRunning(flag);
            return this;
        }

        public Builder()
        {
            Fd = new LaunchOptions();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int BR;
    private boolean Fb;
    private String Fc;

    public LaunchOptions()
    {
        this(1, false, ik.b(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        BR = i;
        Fb = flag;
        Fc = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof LaunchOptions))
            {
                return false;
            }
            obj = (LaunchOptions)obj;
            if (Fb != ((LaunchOptions) (obj)).Fb || !ik.a(Fc, ((LaunchOptions) (obj)).Fc))
            {
                return false;
            }
        }
        return true;
    }

    public String getLanguage()
    {
        return Fc;
    }

    public boolean getRelaunchIfRunning()
    {
        return Fb;
    }

    int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Boolean.valueOf(Fb), Fc
        });
    }

    public void setLanguage(String s)
    {
        Fc = s;
    }

    public void setRelaunchIfRunning(boolean flag)
    {
        Fb = flag;
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(Fb), Fc
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
