// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public final class nzm extends nzj
{

    private EditText e;
    private String f;

    public nzm(Context context)
    {
        this(context, null);
    }

    private nzm(Context context, AttributeSet attributeset)
    {
        this(context, null, b.HL);
    }

    private nzm(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new EditText(context, attributeset);
        e.setId(cn.L);
        e.setEnabled(true);
    }

    private void b(String s)
    {
        boolean flag = e();
        f = s;
        e(s);
        boolean flag1 = e();
        if (flag1 != flag)
        {
            d(flag1);
        }
    }

    protected final Object a(TypedArray typedarray, int i)
    {
        return typedarray.getString(i);
    }

    protected final void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(nzn))
        {
            super.a(parcelable);
            return;
        } else
        {
            parcelable = (nzn)parcelable;
            super.a(parcelable.getSuperState());
            b(((nzn) (parcelable)).a);
            return;
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        if (flag)
        {
            String s = e.getText().toString();
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
            obj = a(f);
        } else
        {
            obj = (String)obj;
        }
        b(((String) (obj)));
    }

    protected final boolean aD_()
    {
        return true;
    }

    protected final void b(View view)
    {
        super.b(view);
        EditText edittext = e;
        edittext.setText(f);
        android.view.ViewParent viewparent = edittext.getParent();
        if (viewparent != view)
        {
            if (viewparent != null)
            {
                ((ViewGroup)viewparent).removeView(edittext);
            }
            view = (ViewGroup)view.findViewById(cn.M);
            if (view != null)
            {
                view.addView(edittext, -1, -2);
            }
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
            obj = new nzn(((Parcelable) (obj)));
            obj.a = f;
            return ((Parcelable) (obj));
        }
    }

    public final boolean e()
    {
        return TextUtils.isEmpty(f) || super.e();
    }
}
