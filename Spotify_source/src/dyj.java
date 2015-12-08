// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public final class dyj
{

    boolean a;
    dyw b;
    private final Context c;

    public dyj(Context context)
    {
        c = context;
    }

    private TextView a()
    {
        TextView textview = dgp.a(c, null);
        dgo.a(c, textview, 0x7f0b0142);
        TypedArray typedarray = c.obtainStyledAttributes(0x7f0b017f, new int[] {
            0x7f0101c5
        });
        int i;
        if (typedarray == null)
        {
            i = 0;
        } else
        {
            i = typedarray.getDimensionPixelSize(0, 0);
            typedarray.recycle();
        }
        textview.setPadding(0, i, 0, i);
        return textview;
    }

    private dfi a(int i, int j, dyk dyk1)
    {
        dfj dfj1 = new dfj(c, 0x7f0b0181);
        dfj1.a(c.getString(0x7f0804fc), new android.content.DialogInterface.OnClickListener(dyk1) {

            private dyk a;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                ((dfi)dialoginterface).setOnDismissListener(null);
                a.a();
            }

            
            {
                a = dyk1;
                super();
            }
        });
        dfj1.b(c.getString(0x7f0804fd), new android.content.DialogInterface.OnClickListener(dyk1) {

            private dyk a;
            private dyj b;

            public final void onClick(DialogInterface dialoginterface, int k)
            {
                dyj.a(b, a).show();
            }

            
            {
                b = dyj.this;
                a = dyk1;
                super();
            }
        });
        TextView textview = a();
        a(textview, j, 0);
        dfj1.a(textview);
        dfj1.a(c.getString(i));
        dfj1.a(new android.content.DialogInterface.OnCancelListener(dyk1) {

            private dyk a;
            private dyj b;

            public final void onCancel(DialogInterface dialoginterface)
            {
                dyj.a(b, a).show();
            }

            
            {
                b = dyj.this;
                a = dyk1;
                super();
            }
        });
        return dfj1.b();
    }

    static dfi a(dyj dyj1, dyk dyk1)
    {
        dfj dfj1 = new dfj(dyj1.c, 0x7f0b0181);
        dfj1.a(0x7f080500);
        dfj1.a(0x7f0805a0, new android.content.DialogInterface.OnClickListener(dyk1) {

            private dyk a;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                a.b();
            }

            
            {
                a = dyk1;
                super();
            }
        });
        dfj1.b(0x7f08059f, dyj1. new android.content.DialogInterface.OnClickListener(dyk1) {

            private dyk a;
            private dyj b;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                b.a(b.b, a);
            }

            
            {
                b = dyj.this;
                a = dyk1;
                super();
            }
        });
        dfj1.a(new android.content.DialogInterface.OnCancelListener(dyk1) {

            private dyk a;

            public final void onCancel(DialogInterface dialoginterface)
            {
                a.c();
            }

            
            {
                a = dyk1;
                super();
            }
        });
        dyj1 = dyj1.a();
        dyj1.setText(0x7f08026d);
        dfj1.a(dyj1);
        return dfj1.b();
    }

    public final void a(TextView textview, int i, int j)
    {
        Object obj = new StringBuilder(c.getResources().getString(i));
        if (j != 0)
        {
            String s = c.getString(j);
            ((StringBuilder) (obj)).append("<br><br>").append(s);
        }
        obj = ((StringBuilder) (obj)).toString().replaceAll("spotify:", "com.spotify.mobile.android.tos:spotify:");
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        textview.setText(Html.fromHtml(((String) (obj))));
    }

    public final void a(dyw dyw1, dyk dyk1)
    {
        b = dyw1;
        if (dyw1.c())
        {
            ((giq)dmz.a(giq)).b(c).b().a(fyz.a, true).a(fyz.b, dyw1.d()).b();
        }
        if (dyw1.b())
        {
            dyk1.a();
            return;
        }
        if (dyw1.a())
        {
            a(0x7f080500, 0x7f08016f, dyk1).show();
            return;
        }
        dyw1 = a(0x7f0804fb, 0x7f0804fa, dyk1);
        dyk1 = a(0x7f0804ff, 0x7f0804fe, new dyk(dyw1, dyk1) {

            private dfi a;
            private dyk b;
            private dyj c;

            public final void a()
            {
                c.a = true;
                a.show();
            }

            public final void b()
            {
                b.b();
            }

            public final void c()
            {
                b.c();
            }

            
            {
                c = dyj.this;
                a = dfi1;
                b = dyk1;
                super();
            }
        });
        if (a)
        {
            dyw1.show();
            return;
        } else
        {
            dyk1.show();
            return;
        }
    }
}
