// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzrd;
import com.google.android.gms.internal.zzrm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class zzt extends zzc
{

    private final String c = "SafeDataBufferRef";

    public zzt(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    protected float a(String s, float f)
    {
        float f1 = f;
        if (a(s))
        {
            f1 = f;
            if (!g(s))
            {
                f1 = e(s);
            }
        }
        return f1;
    }

    protected int a(String s, int i)
    {
        int j = i;
        if (a(s))
        {
            j = i;
            if (!g(s))
            {
                j = b(s);
            }
        }
        return j;
    }

    protected SafeParcelable a(String s, android.os.Parcelable.Creator creator)
    {
        s = a(s, ((byte []) (null)));
        if (s == null)
        {
            return null;
        } else
        {
            return com.google.android.gms.common.internal.safeparcel.zzc.a(s, creator);
        }
    }

    protected String a(String s, String s1)
    {
        String s2 = s1;
        if (a(s))
        {
            s2 = s1;
            if (!g(s))
            {
                s2 = d(s);
            }
        }
        return s2;
    }

    protected List a(String s, android.os.Parcelable.Creator creator, List list)
    {
        s = a(s, ((byte []) (null)));
        if (s != null) goto _L2; else goto _L1
_L1:
        zzrd zzrd1;
        return list;
_L2:
        byte abyte0[][];
        int j;
        if ((zzrd1 = zzrd.a(s)).c == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = new ArrayList(zzrd1.c.length);
        abyte0 = zzrd1.c;
        j = abyte0.length;
        int i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s.add(com.google.android.gms.common.internal.safeparcel.zzc.a(abyte0[i], creator));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return s;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected List a(String s, List list)
    {
        s = a(s, ((byte []) (null)));
        if (s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        ArrayList arraylist;
        if (((zzrd) (s = zzrd.a(s))).b == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist = new ArrayList(((zzrd) (s)).b.length);
        int i = 0;
_L4:
        if (i >= ((zzrd) (s)).b.length)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Integer.valueOf(((zzrd) (s)).b[i]));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        return arraylist;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected boolean a(String s, boolean flag)
    {
        boolean flag1 = flag;
        if (a(s))
        {
            flag1 = flag;
            if (!g(s))
            {
                flag1 = c(s);
            }
        }
        return flag1;
    }

    protected byte[] a(String s, byte abyte0[])
    {
        byte abyte1[] = abyte0;
        if (a(s))
        {
            abyte1 = abyte0;
            if (!g(s))
            {
                abyte1 = f(s);
            }
        }
        return abyte1;
    }

    protected List b(String s, List list)
    {
        s = a(s, ((byte []) (null)));
        if (s != null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        if (((zzrd) (s = zzrd.a(s))).a == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = Arrays.asList(((zzrd) (s)).a);
        return s;
        s;
        if (Log.isLoggable("SafeDataBufferRef", 6))
        {
            Log.e("SafeDataBufferRef", "Cannot parse byte[]", s);
            return list;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
