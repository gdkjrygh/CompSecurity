// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;

public final class ekp
{

    public ahb a[];
    aha b;
    private boolean c;
    private ArrayList d;
    private Handler e;
    private Picasso f;

    public ekp(Handler handler)
    {
        d = new ArrayList();
        e = handler;
        f = ((gft)dmz.a(gft)).a();
    }

    private void a()
    {
        e.post(new Runnable() {

            private ekp a;

            public final void run()
            {
                if (a.b != null)
                {
                    a.b.a(a.a);
                }
            }

            
            {
                a = ekp.this;
                super();
            }
        });
    }

    public final void a(aha aha)
    {
        b = aha;
        c = false;
        for (int i = 0; i < a.length; i++)
        {
            Object obj = a[i];
            aha = ((ekq)((ahb) (obj)).c()).a;
            obj = new gwi(((ahb) (obj))) {

                private ahb a;
                private ekp b;

                public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
                {
                    bitmap = eko.a(bitmap, 65, 51);
                    a.a(bitmap);
                    b.a(this);
                }

                public final void a(Drawable drawable)
                {
                    b.a(this);
                }

                public final void b(Drawable drawable)
                {
                }

            
            {
                b = ekp.this;
                a = ahb1;
                super();
            }
            };
            d.add(obj);
            f.a(aha).b(65, 51).c().a(((gwi) (obj)));
        }

        if (d.size() > 0)
        {
            c = true;
            return;
        } else
        {
            a();
            return;
        }
    }

    public final void a(gwi gwi)
    {
        d.remove(gwi);
        if (d.size() == 0 && c)
        {
            a();
        }
    }
}
