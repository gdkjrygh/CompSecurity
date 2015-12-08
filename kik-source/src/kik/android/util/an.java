// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package kik.android.util:
//            bx

public abstract class an
{

    private Bundle a;

    protected an()
    {
        a = new Bundle();
        if (!android/support/v4/app/Fragment.isAssignableFrom(getClass().getEnclosingClass()))
        {
            throw new IllegalArgumentException();
        } else
        {
            a("kik.android.util.FragmentBundle.FragmentClass", a());
            return;
        }
    }

    private String a()
    {
        String s = getClass().getEnclosingClass().getCanonicalName();
        if (s == null)
        {
            bx.a(new Exception((new StringBuilder("Null class name for ")).append(getClass().getEnclosingClass().getName()).toString()));
        }
        return s;
    }

    public final void a(Bundle bundle)
    {
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        a = bundle1;
        a("kik.android.util.FragmentBundle.FragmentClass", a());
    }

    protected final void a(String s, int i1)
    {
        a.putInt(s, i1);
    }

    protected final void a(String s, long l1)
    {
        a.putLong(s, l1);
    }

    protected final void a(String s, Parcelable parcelable)
    {
        a.putParcelable(s, parcelable);
    }

    protected final void a(String s, Serializable serializable)
    {
        a.putSerializable(s, serializable);
    }

    protected final void a(String s, String s1)
    {
        a.putString(s, s1);
    }

    public final void a(String s, ArrayList arraylist)
    {
        a.putStringArrayList(s, arraylist);
    }

    protected final void a(String s, boolean flag)
    {
        a.putBoolean(s, flag);
    }

    protected final void a(String s, byte abyte0[])
    {
        a.putByteArray(s, abyte0);
    }

    protected final int b(String s, int i1)
    {
        return a.getInt(s, i1);
    }

    protected final Boolean b(String s, boolean flag)
    {
        return Boolean.valueOf(a.getBoolean(s, flag));
    }

    protected final String b(String s, String s1)
    {
        return a.getString(s, s1);
    }

    protected final Boolean f(String s)
    {
        return Boolean.valueOf(a.getBoolean(s));
    }

    protected final String g(String s)
    {
        return a.getString(s);
    }

    protected final byte[] h(String s)
    {
        return a.getByteArray(s);
    }

    public final Bundle i()
    {
        return a;
    }

    protected final short i(String s)
    {
        return a.getShort(s, (short)0);
    }

    protected final long j(String s)
    {
        return a.getLong(s, -1L);
    }

    protected final Serializable k(String s)
    {
        return a.getSerializable(s);
    }

    protected final Parcelable l(String s)
    {
        return a.getParcelable(s);
    }

    public final ArrayList m(String s)
    {
        return a.getStringArrayList(s);
    }
}
