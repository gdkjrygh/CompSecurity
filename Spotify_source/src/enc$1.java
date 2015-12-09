// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;

final class ang.Object
    implements epg
{

    final enc a;

    public final void a(Object obj)
    {
        boolean flag = false;
        obj = (fis)obj;
        a.o();
        ((fis) (obj)).isLoading();
        int i = ((com.spotify.mobile.android.spotlets.show.model.Show[])((fis) (obj)).getItems()).length;
        if (a.o())
        {
            boolean flag1;
            if (((fis) (obj)).getUnrangedLength() == 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!((fis) (obj)).isLoading() || !flag1)
            {
                a.R();
                a.O();
                enc.b(a).post(new Runnable(flag1) {

                    private boolean a;
                    private enc._cls1 b;

                    public final void run()
                    {
                        if (enc.a(b.a) != null && !a)
                        {
                            enc.b(b.a).onRestoreInstanceState(enc.a(b.a));
                            enc.c(b.a);
                        }
                    }

            
            {
                b = enc._cls1.this;
                a = flag;
                super();
            }
                });
                if (enc.d(a).d())
                {
                    enc.d(a).b();
                }
                int j;
                if (((fis) (obj)).a() > 0)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                if (flag1 && j != 0)
                {
                    enc.e(a).b(new int[] {
                        4
                    });
                } else
                {
                    enc.e(a).a(new int[] {
                        4
                    });
                }
                obj = enc.f(a);
                if (flag1 && j == 0)
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = 8;
                }
                ((View) (obj)).setVisibility(j);
            }
        }
    }

    public final void a(String s)
    {
        enc.d(a).b();
        Logger.c("Failed to load list of shows %s", new Object[] {
            s
        });
    }

    (enc enc1)
    {
        a = enc1;
        super();
    }
}
