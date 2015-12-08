// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.kik.android.c.c;
import com.kik.android.c.e;
import kik.android.util.bx;
import kik.android.widget.KikNetworkedImageView;
import kik.android.widget.cs;
import kik.android.widget.w;

// Referenced classes of package com.kik.cache:
//            ax, ay, aj, ad

public class SmileyImageView extends KikNetworkedImageView
{

    private static final com.android.volley.r.a a = new ax();
    private static final com.android.volley.r.b b = new ay();

    public SmileyImageView(Context context)
    {
        super(context);
    }

    public SmileyImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SmileyImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final w a(Bitmap bitmap, String s)
    {
        return new cs(bitmap, s);
    }

    public final void a(e e1, ad ad)
    {
        int i;
        if (e1 != null)
        {
            if (e1 instanceof c)
            {
                if ((i = ((c)e1).a()) != 0)
                {
                    try
                    {
                        b(getResources().getDrawable(i));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (e e1)
                    {
                        bx.a(e1);
                    }
                    return;
                }
            } else
            {
                String s = e1.e();
                e1 = null;
                if (s != null)
                {
                    e1 = aj.a(s, b, a);
                }
                a(((z) (e1)), ad, 0, 0, true, true);
                return;
            }
        }
    }

    public final boolean a()
    {
        return !d();
    }

}
