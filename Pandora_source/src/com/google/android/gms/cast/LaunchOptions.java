// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            zzc

public class LaunchOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private LaunchOptions zzMg;

        public LaunchOptions build()
        {
            return zzMg;
        }

        public Builder setLocale(Locale locale)
        {
            zzMg.setLanguage(zzf.zzb(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean flag)
        {
            zzMg.setRelaunchIfRunning(flag);
            return this;
        }

        public Builder()
        {
            zzMg = new LaunchOptions();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private boolean zzMe;
    private String zzMf;
    private final int zzzH;

    public LaunchOptions()
    {
        this(1, false, zzf.zzb(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        zzzH = i;
        zzMe = flag;
        zzMf = s;
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
            if (zzMe != ((LaunchOptions) (obj)).zzMe || !zzf.zza(zzMf, ((LaunchOptions) (obj)).zzMf))
            {
                return false;
            }
        }
        return true;
    }

    public String getLanguage()
    {
        return zzMf;
    }

    public boolean getRelaunchIfRunning()
    {
        return zzMe;
    }

    int getVersionCode()
    {
        return zzzH;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Boolean.valueOf(zzMe), zzMf
        });
    }

    public void setLanguage(String s)
    {
        zzMf = s;
    }

    public void setRelaunchIfRunning(boolean flag)
    {
        zzMe = flag;
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(zzMe), zzMf
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
