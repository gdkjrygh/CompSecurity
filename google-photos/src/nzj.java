// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class nzj extends nzw
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, oan
{

    CharSequence a;
    CharSequence b;
    CharSequence c;
    public int d;
    private android.app.AlertDialog.Builder e;
    private CharSequence f;
    private Drawable w;
    private Dialog x;
    private int y;

    public nzj(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, b.HK);
    }

    public nzj(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, oaw.h, i, 0);
        a = context.getString(oaw.l);
        if (a == null)
        {
            a = super.m;
        }
        f = context.getString(oaw.k);
        w = context.getDrawable(oaw.i);
        b = context.getString(oaw.n);
        c = context.getString(oaw.m);
        d = context.getResourceId(oaw.j, d);
        context.recycle();
    }

    private void c(Bundle bundle)
    {
        obj = null;
        Context context = super.g;
        y = -2;
        e = (new android.app.AlertDialog.Builder(context)).setTitle(a).setIcon(w).setPositiveButton(b, this).setNegativeButton(c, this);
        if (d != 0)
        {
            obj = LayoutInflater.from(e.getContext()).inflate(d, null);
        }
        if (obj != null)
        {
            b(((View) (obj)));
            e.setView(((View) (obj)));
        } else
        {
            e.setMessage(f);
        }
        a(e);
        synchronized (super.h)
        {
            if (((oam) (obj)).e == null)
            {
                obj.e = new ArrayList();
            }
            if (!((oam) (obj)).e.contains(this))
            {
                ((oam) (obj)).e.add(this);
            }
        }
        obj = e.create();
        x = ((Dialog) (obj));
        if (bundle != null)
        {
            ((Dialog) (obj)).onRestoreInstanceState(bundle);
        }
        if (aD_())
        {
            ((Dialog) (obj)).getWindow().setSoftInputMode(5);
        }
        ((Dialog) (obj)).setOnDismissListener(this);
        ((Dialog) (obj)).show();
        return;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    protected final void a()
    {
        if (x != null && x.isShowing())
        {
            return;
        } else
        {
            c(null);
            return;
        }
    }

    protected void a(android.app.AlertDialog.Builder builder)
    {
    }

    protected void a(Parcelable parcelable)
    {
        if (parcelable == null || !parcelable.getClass().equals(nzk))
        {
            super.a(parcelable);
        } else
        {
            parcelable = (nzk)parcelable;
            super.a(parcelable.getSuperState());
            if (((nzk) (parcelable)).a)
            {
                c(((nzk) (parcelable)).b);
                return;
            }
        }
    }

    protected void a(boolean flag)
    {
    }

    protected boolean aD_()
    {
        return false;
    }

    protected void b(View view)
    {
        view = view.findViewById(cn.Q);
        if (view != null)
        {
            CharSequence charsequence = f;
            byte byte0 = 8;
            if (!TextUtils.isEmpty(charsequence))
            {
                if (view instanceof TextView)
                {
                    ((TextView)view).setText(charsequence);
                }
                byte0 = 0;
            }
            if (view.getVisibility() != byte0)
            {
                view.setVisibility(byte0);
            }
        }
    }

    public final void c()
    {
        if (x == null || !x.isShowing())
        {
            return;
        } else
        {
            x.dismiss();
            return;
        }
    }

    protected Parcelable d()
    {
        Object obj = super.d();
        if (x == null || !x.isShowing())
        {
            return ((Parcelable) (obj));
        } else
        {
            obj = new nzk(((Parcelable) (obj)));
            obj.a = true;
            obj.b = x.onSaveInstanceState();
            return ((Parcelable) (obj));
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        y = i;
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        synchronized (super.h)
        {
            if (((oam) (dialoginterface)).e != null)
            {
                ((oam) (dialoginterface)).e.remove(this);
            }
        }
        x = null;
        boolean flag;
        if (y == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        return;
        exception;
        dialoginterface;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
