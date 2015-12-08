// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            b, a

public class HereContent
    implements SafeParcelable
{
    public static final class Action
        implements SafeParcelable
    {

        public static final a CREATOR = new a();
        final int a;
        final String b;
        final String c;

        public final int describeContents()
        {
            return 0;
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof Action))
                {
                    return false;
                }
                obj = (Action)obj;
                if (!t.a(b, ((Action) (obj)).b) || !t.a(c, ((Action) (obj)).c))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                b, c
            });
        }

        public final String toString()
        {
            return t.a(this).a("title", b).a("uri", c).toString();
        }

        public final void writeToParcel(Parcel parcel, int i)
        {
            com.google.android.gms.location.places.personalized.a.a(this, parcel);
        }


        Action(int i, String s, String s1)
        {
            a = i;
            b = s;
            c = s1;
        }
    }


    public static final b CREATOR = new b();
    final int a;
    final String b;
    final List c;

    HereContent(int i, String s, List list)
    {
        a = i;
        b = s;
        c = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof HereContent))
            {
                return false;
            }
            obj = (HereContent)obj;
            if (!t.a(b, ((HereContent) (obj)).b) || !t.a(c, ((HereContent) (obj)).c))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c
        });
    }

    public String toString()
    {
        return t.a(this).a("data", b).a("actions", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.personalized.b.a(this, parcel);
    }

}
