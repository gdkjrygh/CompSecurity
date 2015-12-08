// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gj;
import com.google.android.gms.internal.hl;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            c

public class LaunchOptions
    implements SafeParcelable
{
    public static final class Builder
    {

        private LaunchOptions Ap;

        public LaunchOptions build()
        {
            return Ap;
        }

        public Builder setLocale(Locale locale)
        {
            Ap.setLanguage(gj.b(locale));
            return this;
        }

        public Builder setRelaunchIfRunning(boolean flag)
        {
            Ap.setRelaunchIfRunning(flag);
            return this;
        }

        public Builder()
        {
            Ap = new LaunchOptions();
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new c();
    private boolean An;
    private String Ao;
    private final int xJ;

    public LaunchOptions()
    {
        this(1, false, gj.b(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        xJ = i;
        An = flag;
        Ao = s;
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
            if (An != ((LaunchOptions) (obj)).An || !gj.a(Ao, ((LaunchOptions) (obj)).Ao))
            {
                return false;
            }
        }
        return true;
    }

    public String getLanguage()
    {
        return Ao;
    }

    public boolean getRelaunchIfRunning()
    {
        return An;
    }

    int getVersionCode()
    {
        return xJ;
    }

    public int hashCode()
    {
        return hl.hashCode(new Object[] {
            Boolean.valueOf(An), Ao
        });
    }

    public void setLanguage(String s)
    {
        Ao = s;
    }

    public void setRelaunchIfRunning(boolean flag)
    {
        An = flag;
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(An), Ao
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        c.a(this, parcel, i);
    }

}
