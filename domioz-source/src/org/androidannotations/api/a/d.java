// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.a;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package org.androidannotations.api.a:
//            c

public abstract class d extends c
{

    protected Bundle args;

    public d()
    {
        args = new Bundle();
    }

    public d arg(Bundle bundle)
    {
        args.putAll(bundle);
        return this;
    }

    public d arg(String s, byte byte0)
    {
        args.putByte(s, byte0);
        return this;
    }

    public d arg(String s, char c1)
    {
        args.putChar(s, c1);
        return this;
    }

    public d arg(String s, double d1)
    {
        args.putDouble(s, d1);
        return this;
    }

    public d arg(String s, float f)
    {
        args.putFloat(s, f);
        return this;
    }

    public d arg(String s, int i)
    {
        args.putInt(s, i);
        return this;
    }

    public d arg(String s, long l)
    {
        args.putLong(s, l);
        return this;
    }

    public d arg(String s, Bundle bundle)
    {
        args.putBundle(s, bundle);
        return this;
    }

    public d arg(String s, Parcelable parcelable)
    {
        args.putParcelable(s, parcelable);
        return this;
    }

    public d arg(String s, SparseArray sparsearray)
    {
        args.putSparseParcelableArray(s, sparsearray);
        return this;
    }

    public d arg(String s, Serializable serializable)
    {
        args.putSerializable(s, serializable);
        return this;
    }

    public d arg(String s, CharSequence charsequence)
    {
        args.putCharSequence(s, charsequence);
        return this;
    }

    public d arg(String s, String s1)
    {
        args.putString(s, s1);
        return this;
    }

    public d arg(String s, short word0)
    {
        args.putShort(s, word0);
        return this;
    }

    public d arg(String s, boolean flag)
    {
        args.putBoolean(s, flag);
        return this;
    }

    public d arg(String s, byte abyte0[])
    {
        args.putByteArray(s, abyte0);
        return this;
    }

    public d arg(String s, char ac[])
    {
        args.putCharArray(s, ac);
        return this;
    }

    public d arg(String s, double ad[])
    {
        args.putDoubleArray(s, ad);
        return this;
    }

    public d arg(String s, float af[])
    {
        args.putFloatArray(s, af);
        return this;
    }

    public d arg(String s, int ai[])
    {
        args.putIntArray(s, ai);
        return this;
    }

    public d arg(String s, long al[])
    {
        args.putLongArray(s, al);
        return this;
    }

    public d arg(String s, Parcelable aparcelable[])
    {
        args.putParcelableArray(s, aparcelable);
        return this;
    }

    public d arg(String s, String as[])
    {
        args.putStringArray(s, as);
        return this;
    }

    public d arg(String s, short aword0[])
    {
        args.putShortArray(s, aword0);
        return this;
    }

    public d arg(String s, boolean aflag[])
    {
        args.putBooleanArray(s, aflag);
        return this;
    }

    public Bundle args()
    {
        return args;
    }

    public abstract Object build();

    public d integerArrayListArg(String s, ArrayList arraylist)
    {
        args.putIntegerArrayList(s, arraylist);
        return this;
    }

    public d parcelableArrayListArg(String s, ArrayList arraylist)
    {
        args.putParcelableArrayList(s, arraylist);
        return this;
    }

    public d stringArrayListArg(String s, ArrayList arraylist)
    {
        args.putStringArrayList(s, arraylist);
        return this;
    }
}
