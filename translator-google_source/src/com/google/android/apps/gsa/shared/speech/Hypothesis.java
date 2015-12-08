// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.k;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.gsa.shared.speech:
//            b

public class Hypothesis
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final String a;
    private final float b;
    private ImmutableList c;

    Hypothesis(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readFloat();
        LinkedList linkedlist = new LinkedList();
        parcel.readTypedList(linkedlist, Span.CREATOR);
        c = ImmutableList.copyOf(linkedlist);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof Hypothesis)
        {
            obj = (Hypothesis)obj;
            flag = flag1;
            if (k.a(a, ((Hypothesis) (obj)).a))
            {
                flag = flag1;
                if (Math.abs(b - ((Hypothesis) (obj)).b) < 0.001F)
                {
                    flag = flag1;
                    if (k.a(c, ((Hypothesis) (obj)).c))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, c
        });
    }

    public String toString()
    {
        String s = a;
        float f = b;
        int i;
        if (c == null)
        {
            i = 0;
        } else
        {
            i = c.size();
        }
        return (new StringBuilder(String.valueOf(s).length() + 56)).append("Hypothesis: [").append(s).append(", ").append(f).append("] with ").append(i).append(" span(s)").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeFloat(b);
        parcel.writeTypedList(c);
    }


    private class Span
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new c();
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public ImmutableList e;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Span)
            {
                obj = (Span)obj;
                flag = flag1;
                if (a == ((Span) (obj)).a)
                {
                    flag = flag1;
                    if (b == ((Span) (obj)).b)
                    {
                        flag = flag1;
                        if (c == ((Span) (obj)).c)
                        {
                            flag = flag1;
                            if (d == ((Span) (obj)).d)
                            {
                                flag = flag1;
                                if (k.a(e, ((Span) (obj)).e))
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                Integer.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), e
            });
        }

        public String toString()
        {
            return (new l(h.a(getClass()))).a("mUtf16Start", a).a("mUtf16End", b).a("mUtf8Start", c).a("mUtf8Length", d).a("mAlternates", e).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            parcel.writeInt(c);
            parcel.writeInt(d);
            parcel.writeStringList(e);
        }


        public Span(Parcel parcel)
        {
            a = parcel.readInt();
            b = parcel.readInt();
            c = parcel.readInt();
            d = parcel.readInt();
            LinkedList linkedlist = new LinkedList();
            parcel.readStringList(linkedlist);
            e = ImmutableList.copyOf(linkedlist);
        }
    }

}
