// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import android.os.Parcel;
import c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.Arrays;
import jxi;
import k;
import kcs;
import ksc;

public class LogEventParcelable
    implements SafeParcelable
{

    public static final jxi CREATOR = new jxi();
    public final int a;
    public PlayLoggerContext b;
    public byte c[];
    public int d[];
    public final ksc e;
    public final k f;
    public final k g;

    public LogEventParcelable(int i, PlayLoggerContext playloggercontext, byte abyte0[], int ai[])
    {
        a = i;
        b = playloggercontext;
        c = abyte0;
        d = ai;
        e = null;
        f = null;
        g = null;
    }

    public LogEventParcelable(PlayLoggerContext playloggercontext, ksc ksc, k k, k k1, int ai[])
    {
        a = 1;
        b = playloggercontext;
        e = ksc;
        f = k;
        g = k1;
        d = ai;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof LogEventParcelable)
            {
                if (a != ((LogEventParcelable) (obj = (LogEventParcelable)obj)).a || !c.b(b, ((LogEventParcelable) (obj)).b) || !Arrays.equals(c, ((LogEventParcelable) (obj)).c) || !Arrays.equals(d, ((LogEventParcelable) (obj)).d) || !c.b(e, ((LogEventParcelable) (obj)).e) || !c.b(f, ((LogEventParcelable) (obj)).f) || !c.b(g, ((LogEventParcelable) (obj)).g))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, d, e, f, g
        });
    }

    public String toString()
    {
        Object obj1 = null;
        StringBuilder stringbuilder = new StringBuilder("LogEventParcelable[");
        stringbuilder.append(a);
        stringbuilder.append(", ");
        stringbuilder.append(b);
        stringbuilder.append(", ");
        Object obj;
        if (c == null)
        {
            obj = null;
        } else
        {
            obj = new String(c);
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(", ");
        if (d == null)
        {
            obj = obj1;
        } else
        {
            obj = new kcs(", ");
            java.util.List list = Arrays.asList(new int[][] {
                d
            });
            obj = ((kcs) (obj)).a(new StringBuilder(), list).toString();
        }
        stringbuilder.append(((String) (obj)));
        stringbuilder.append(", ");
        stringbuilder.append(e);
        stringbuilder.append(", ");
        stringbuilder.append(f);
        stringbuilder.append(", ");
        stringbuilder.append(g);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jxi.a(this, parcel, i);
    }

}
