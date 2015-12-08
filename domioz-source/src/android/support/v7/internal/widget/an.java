// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            as, SpinnerCompat, u

final class an
    implements android.content.DialogInterface.OnClickListener, as
{

    final SpinnerCompat a;
    private AlertDialog b;
    private ListAdapter c;
    private CharSequence d;

    private an(SpinnerCompat spinnercompat)
    {
        a = spinnercompat;
        super();
    }

    an(SpinnerCompat spinnercompat, byte byte0)
    {
        this(spinnercompat);
    }

    public final void a()
    {
        if (b != null)
        {
            b.dismiss();
            b = null;
        }
    }

    public final void a(ListAdapter listadapter)
    {
        c = listadapter;
    }

    public final void a(CharSequence charsequence)
    {
        d = charsequence;
    }

    public final boolean b()
    {
        if (b != null)
        {
            return b.isShowing();
        } else
        {
            return false;
        }
    }

    public final void c()
    {
        if (c == null)
        {
            return;
        }
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a.getContext());
        if (d != null)
        {
            builder.setTitle(d);
        }
        b = builder.setSingleChoiceItems(c, ((u) (a)).u, this).create();
        b.show();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a(i);
        if (a.s != null)
        {
            dialoginterface = a;
            c.getItemId(i);
            dialoginterface.a(null);
        }
        a();
    }
}
