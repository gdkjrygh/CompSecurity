// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class oba extends nzw
{

    public boolean a;
    public boolean b;
    public boolean c;
    private CharSequence d;
    private CharSequence e;
    private boolean f;

    public oba(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final Object a(TypedArray typedarray, int i)
    {
        return Boolean.valueOf(typedarray.getBoolean(i, false));
    }

    protected final void a()
    {
        super.a();
        boolean flag;
        if (!a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = true;
        if (!b(Boolean.valueOf(flag)))
        {
            return;
        } else
        {
            a(flag);
            return;
        }
    }

    protected final void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(obb))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (obb)parcelable;
            super.a(parcelable.getSuperState());
            a(((obb) (parcelable)).a);
            return;
        }
    }

    public final void a(boolean flag)
    {
        boolean flag1;
        if (a != flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || !f)
        {
            a = flag;
            f = true;
            f(flag);
            if (flag1)
            {
                d(e());
                g();
            }
        }
    }

    protected final void a(boolean flag, Object obj)
    {
        if (flag)
        {
            flag = g(a);
        } else
        {
            flag = ((Boolean)obj).booleanValue();
        }
        a(flag);
    }

    public final void b(View view)
    {
        boolean flag = false;
        view = (TextView)view.findViewById(cn.S);
        if (view != null)
        {
            boolean flag1 = true;
            int i;
            if (a && !TextUtils.isEmpty(d))
            {
                view.setText(d);
                i = 0;
            } else
            {
                i = ((flag1) ? 1 : 0);
                if (!a)
                {
                    i = ((flag1) ? 1 : 0);
                    if (!TextUtils.isEmpty(e))
                    {
                        view.setText(e);
                        i = 0;
                    }
                }
            }
            if (i != 0)
            {
                CharSequence charsequence = f();
                if (!TextUtils.isEmpty(charsequence))
                {
                    view.setText(charsequence);
                    i = 0;
                }
            }
            if (i == 0)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 8;
            }
            if (i != view.getVisibility())
            {
                view.setVisibility(i);
            }
        }
    }

    public final void c(CharSequence charsequence)
    {
        d = charsequence;
        if (a)
        {
            g();
        }
    }

    protected final Parcelable d()
    {
        Object obj = super.d();
        if (super.r)
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new obb(((Parcelable) (obj)));
            obj.a = a;
            return ((Parcelable) (obj));
        }
    }

    public final void d(CharSequence charsequence)
    {
        e = charsequence;
        if (!a)
        {
            g();
        }
    }

    public final boolean e()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (c)
            {
                flag = a;
            } else
            if (!a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                flag = flag1;
                if (!super.e())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }
}
