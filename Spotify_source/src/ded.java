// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;

final class ded
{

    TextView a;
    TextView b;
    deg c;
    android.view.ViewTreeObserver.OnGlobalLayoutListener d;
    private final int e;
    private android.view.View.OnClickListener f;

    public ded(Context context, deg deg1, String s)
    {
        d = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

            private ded a;

            public final void onGlobalLayout()
            {
                a.a();
            }

            
            {
                a = ded.this;
                super();
            }
        };
        f = new android.view.View.OnClickListener() {

            private ded a;

            public final void onClick(View view)
            {
                a.a.setMaxLines(0x7fffffff);
                a.b.setVisibility(8);
            }

            
            {
                a = ded.this;
                super();
            }
        };
        e = context.getResources().getInteger(0x7f0e000b);
        a = deg1.d;
        a.getViewTreeObserver().addOnGlobalLayoutListener(d);
        b = deg1.e;
        b.setCompoundDrawablesWithIntrinsicBounds(new dfz(context, SpotifyIcon.j, context.getResources().getDimensionPixelSize(0x7f0c00c4)), null, null, null);
        b.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(0x7f0c00c3));
        c = deg1;
        c.e.setText(s);
    }

    final void a()
    {
        Object obj1 = null;
        int j = 0;
        Object obj;
        if (a != null)
        {
            if ((obj = a.getLayout()) != null)
            {
                int i = ((Layout) (obj)).getLineCount();
                TextView textview;
                boolean flag;
                if (i > 0 && ((Layout) (obj)).getEllipsisCount(i - 1) > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj = b;
                if (!flag)
                {
                    j = 8;
                }
                ((TextView) (obj)).setVisibility(j);
                textview = b;
                if (flag)
                {
                    obj = f;
                } else
                {
                    obj = null;
                }
                textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                textview = a;
                obj = obj1;
                if (flag)
                {
                    obj = f;
                }
                textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                if (flag)
                {
                    a.setMaxLines(e);
                    return;
                }
            }
        }
    }
}
