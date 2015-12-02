// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.rewrite;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.w.q;
import com.google.common.base.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.facebook.zero.rewrite:
//            d

public class ZeroUrlRewriteRule
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    private final String a;
    private final String b;
    private final String c;
    private final Pattern d;

    private ZeroUrlRewriteRule(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = Pattern.compile(a);
    }

    ZeroUrlRewriteRule(Parcel parcel, d d1)
    {
        this(parcel);
    }

    public ZeroUrlRewriteRule(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
        d = Pattern.compile(a);
    }

    public boolean a(q q1)
    {
        boolean flag1 = false;
        if (!c.equals("always")) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!c.equals("enabled_or_unknown")) goto _L4; else goto _L3
_L3:
        if (q1 == q.YES)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (q1 != q.UNSET) goto _L4; else goto _L5
_L5:
        return true;
    }

    public boolean a(String s)
    {
        return d.matcher(s).matches();
    }

    public String b(String s)
    {
        return d.matcher(s).replaceFirst(b);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof ZeroUrlRewriteRule))
        {
            return false;
        }
        return Objects.equal(a, ((ZeroUrlRewriteRule)obj).a) && Objects.equal(b, ((ZeroUrlRewriteRule)obj).b) && Objects.equal(c, ((ZeroUrlRewriteRule)obj).c);
    }

    public String getMatcher()
    {
        return a;
    }

    public String getMode()
    {
        return c;
    }

    public String getReplacer()
    {
        return b;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            a, b, c
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("matcher", a).add("replacer", b).add("mode", c).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
