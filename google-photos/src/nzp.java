// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;

public final class nzp extends nzj
{

    public CharSequence e[];
    public CharSequence f[];
    private String w;
    private String x;
    private int y;
    private boolean z;

    public nzp(Context context)
    {
        this(context, null);
    }

    private nzp(Context context, AttributeSet attributeset)
    {
        super(context, null);
        attributeset = context.obtainStyledAttributes(null, oaw.o, 0, 0);
        e = attributeset.getTextArray(oaw.p);
        f = attributeset.getTextArray(oaw.q);
        attributeset.recycle();
        context = context.obtainStyledAttributes(null, oaw.r, 0, 0);
        x = context.getString(oaw.D);
        context.recycle();
    }

    static int a(nzp nzp1, int i)
    {
        nzp1.y = i;
        return i;
    }

    private int k()
    {
        return c(w);
    }

    protected final Object a(TypedArray typedarray, int i)
    {
        return typedarray.getString(i);
    }

    protected final void a(android.app.AlertDialog.Builder builder)
    {
        super.a(builder);
        if (e == null || f == null)
        {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        } else
        {
            y = k();
            builder.setSingleChoiceItems(e, y, new nzq(this));
            builder.setPositiveButton(null, null);
            return;
        }
    }

    protected final void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(nzr))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (nzr)parcelable;
            super.a(parcelable.getSuperState());
            b(((nzr) (parcelable)).a);
            return;
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        if (flag && y >= 0 && f != null)
        {
            String s = f[y].toString();
            if (b(s))
            {
                b(s);
            }
        }
    }

    protected final void a(boolean flag, Object obj)
    {
        if (flag)
        {
            obj = a(w);
        } else
        {
            obj = (String)obj;
        }
        b(((String) (obj)));
    }

    public final void a_(CharSequence charsequence)
    {
        super.a_(charsequence);
        if (charsequence == null && x != null)
        {
            x = null;
        } else
        if (charsequence != null && !charsequence.equals(x))
        {
            x = charsequence.toString();
            return;
        }
    }

    public final void b(String s)
    {
        boolean flag;
        if (!TextUtils.equals(w, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || !z)
        {
            w = s;
            z = true;
            e(s);
            if (flag)
            {
                g();
            }
        }
    }

    public final int c(String s)
    {
        if (s != null && f != null)
        {
            for (int i = f.length - 1; i >= 0; i--)
            {
                if (f[i].equals(s))
                {
                    return i;
                }
            }

        }
        return -1;
    }

    protected final Parcelable d()
    {
        Object obj = super.d();
        if (super.r)
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new nzr(((Parcelable) (obj)));
            obj.a = w;
            return ((Parcelable) (obj));
        }
    }

    public final CharSequence f()
    {
        int i = k();
        CharSequence charsequence;
        if (i >= 0 && e != null)
        {
            charsequence = e[i];
        } else
        {
            charsequence = null;
        }
        if (x == null || charsequence == null)
        {
            return super.f();
        } else
        {
            return String.format(x, new Object[] {
                charsequence
            });
        }
    }
}
