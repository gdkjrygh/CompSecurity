// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.jv;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            c

public class LaunchOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private LaunchOptions FS;

        public LaunchOptions build()
        {
            return FS;
        }

        public Builder setLocale(Locale locale)
        {
            FS.setLanguage(in.b(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean flag)
        {
            FS.setRelaunchIfRunning(flag);
            return this;
        }

        public Builder()
        {
            FS = new LaunchOptions();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int CK;
    private boolean FQ;
    private String FR;

    public LaunchOptions()
    {
        this(1, false, in.b(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        CK = i;
        FQ = flag;
        FR = s;
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
            if (FQ != ((LaunchOptions) (obj)).FQ || !in.a(FR, ((LaunchOptions) (obj)).FR))
            {
                return false;
            }
        }
        return true;
    }

    public String getLanguage()
    {
        return FR;
    }

    public boolean getRelaunchIfRunning()
    {
        return FQ;
    }

    int getVersionCode()
    {
        return CK;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Boolean.valueOf(FQ), FR
        });
    }

    public void setLanguage(String s)
    {
        FR = s;
    }

    public void setRelaunchIfRunning(boolean flag)
    {
        FQ = flag;
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(FQ), FR
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
