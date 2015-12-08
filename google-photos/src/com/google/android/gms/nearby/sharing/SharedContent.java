// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import lma;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            ViewableItem, LocalContent

public class SharedContent
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lma();
    public final int a;
    public String b;
    public ViewableItem c[];
    public LocalContent d[];

    private SharedContent()
    {
        a = 2;
    }

    public SharedContent(int i, String s, ViewableItem aviewableitem[], LocalContent alocalcontent[])
    {
        a = i;
        b = s;
        c = aviewableitem;
        d = alocalcontent;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof SharedContent))
            {
                return false;
            }
            obj = (SharedContent)obj;
            if (!c.b(c, ((SharedContent) (obj)).c) || !c.b(d, ((SharedContent) (obj)).d) || !c.b(b, ((SharedContent) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            c, d, b
        });
    }

    public String toString()
    {
        return (new StringBuilder("SharedContent[viewableItems=")).append(Arrays.toString(c)).append(", localContents=").append(Arrays.toString(d)).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lma.a(this, parcel, i);
    }

}
