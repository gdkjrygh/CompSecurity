// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.api.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

// Referenced classes of package org.androidannotations.api.a:
//            c

public abstract class e extends c
{

    protected final Context context;
    protected final Intent intent;

    public e(Context context1, Intent intent1)
    {
        context = context1;
        intent = intent1;
    }

    public e(Context context1, Class class1)
    {
        this(context1, new Intent(context1, class1));
    }

    public e action(String s)
    {
        intent.setAction(s);
        return this;
    }

    public e extra(String s, byte byte0)
    {
        intent.putExtra(s, byte0);
        return this;
    }

    public e extra(String s, char c1)
    {
        intent.putExtra(s, c1);
        return this;
    }

    public e extra(String s, double d)
    {
        intent.putExtra(s, d);
        return this;
    }

    public e extra(String s, float f)
    {
        intent.putExtra(s, f);
        return this;
    }

    public e extra(String s, int i)
    {
        intent.putExtra(s, i);
        return this;
    }

    public e extra(String s, long l)
    {
        intent.putExtra(s, l);
        return this;
    }

    public e extra(String s, Bundle bundle)
    {
        intent.putExtra(s, bundle);
        return this;
    }

    public e extra(String s, Parcelable parcelable)
    {
        intent.putExtra(s, parcelable);
        return this;
    }

    public e extra(String s, Serializable serializable)
    {
        intent.putExtra(s, serializable);
        return this;
    }

    public e extra(String s, CharSequence charsequence)
    {
        intent.putExtra(s, charsequence);
        return this;
    }

    public e extra(String s, String s1)
    {
        intent.putExtra(s, s1);
        return this;
    }

    public e extra(String s, short word0)
    {
        intent.putExtra(s, word0);
        return this;
    }

    public e extra(String s, boolean flag)
    {
        intent.putExtra(s, flag);
        return this;
    }

    public e extra(String s, byte abyte0[])
    {
        intent.putExtra(s, abyte0);
        return this;
    }

    public e extra(String s, char ac[])
    {
        intent.putExtra(s, ac);
        return this;
    }

    public e extra(String s, double ad[])
    {
        intent.putExtra(s, ad);
        return this;
    }

    public e extra(String s, float af[])
    {
        intent.putExtra(s, af);
        return this;
    }

    public e extra(String s, int ai[])
    {
        intent.putExtra(s, ai);
        return this;
    }

    public e extra(String s, long al[])
    {
        intent.putExtra(s, al);
        return this;
    }

    public e extra(String s, Parcelable aparcelable[])
    {
        intent.putExtra(s, aparcelable);
        return this;
    }

    public e extra(String s, String as[])
    {
        intent.putExtra(s, as);
        return this;
    }

    public e extra(String s, short aword0[])
    {
        intent.putExtra(s, aword0);
        return this;
    }

    public e extra(String s, boolean aflag[])
    {
        intent.putExtra(s, aflag);
        return this;
    }

    public e extras(Intent intent1)
    {
        intent.putExtras(intent1);
        return this;
    }

    public e flags(int i)
    {
        intent.setFlags(i);
        return this;
    }

    public Intent get()
    {
        return intent;
    }

    public Context getContext()
    {
        return context;
    }

    public e integerArrayListExtra(String s, ArrayList arraylist)
    {
        intent.putIntegerArrayListExtra(s, arraylist);
        return this;
    }

    public e parcelableArrayListExtra(String s, ArrayList arraylist)
    {
        intent.putParcelableArrayListExtra(s, arraylist);
        return this;
    }

    public e stringArrayListExtra(String s, ArrayList arraylist)
    {
        intent.putStringArrayListExtra(s, arraylist);
        return this;
    }
}
