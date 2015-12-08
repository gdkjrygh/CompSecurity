// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.Parcel;
import com.google.android.gms.cast.internal.j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            T

public class LaunchOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new T();
    final int a;
    boolean b;
    String c;

    public LaunchOptions()
    {
        this(1, false, j.a(Locale.getDefault()));
    }

    LaunchOptions(int i, boolean flag, String s)
    {
        a = i;
        b = flag;
        c = s;
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
            if (b != ((LaunchOptions) (obj)).b || !j.a(c, ((LaunchOptions) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Boolean.valueOf(b), c
        });
    }

    public String toString()
    {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[] {
            Boolean.valueOf(b), c
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        T.a(this, parcel);
    }

}
