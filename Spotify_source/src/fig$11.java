// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.logging.Logger;
import com.squareup.picasso.Picasso;

final class ng.Object
    implements epg
{

    private fig a;

    public final void a(Object obj)
    {
        fir fir1;
label0:
        {
            fir1 = (fir)obj;
            a.o();
            if (a.o())
            {
                boolean flag;
                if (((fio[])fir1.getItems()).length == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                fir1.isLoading();
                if (!fir1.isLoading() || !flag)
                {
                    if (fig.v(a) != com.spotify.mobile.android.spotlets.show.model.diaType.c || fiy.c(fig.w(a)))
                    {
                        break label0;
                    }
                    fig.x(a).b(new int[] {
                        3
                    });
                    if (fig.y(a).d())
                    {
                        fig.y(a).b();
                    }
                }
            }
            return;
        }
        fig.c(a, fir1.a().e());
        fig.A(a).a(fig.z(a));
        fig.A(a).a((fio[])fir1.getItems());
        fig.x(a).d(0);
        obj = a;
        Show show;
        Picasso picasso;
        boolean flag1;
        boolean flag2;
        if (fir1.getUnrangedLength() > ((fio[])fir1.getItems()).length)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        fig.a(((fig) (obj)), flag2);
        fig.c(a, fir1.getUnrangedLength());
        if (fig.B(a).a || fig.C(a).a || fig.D(a).a)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            fig.x(a).b(new int[] {
                1
            });
            fig.x(a).a(new int[] {
                3
            });
        } else
        if (fig.E(a) == 0)
        {
            fig.x(a).a(new int[] {
                1
            });
            fig.x(a).b(new int[] {
                3
            });
        } else
        {
            fig.x(a).a(new int[] {
                1
            });
            fig.x(a).a(new int[] {
                3
            });
        }
        if (!TextUtils.isEmpty(fig.z(a)))
        {
            fig.b(a).a_(fig.z(a));
        }
        obj = fig.f(a).getLastPlayerState();
        if (fig.F(a) && obj != null && TextUtils.equals(fig.G(a), ((PlayerState) (obj)).entityUri()))
        {
            fig.f(a).updateWithContext(fig.H(a));
            fig.b(a, false);
        }
        show = fir1.a();
        fig.d(a, show.a());
        fig.e(a, show.c().getUri());
        fig.f(a, show.f());
        if (show.c() != null)
        {
            obj = show.c().getImageUri(com.spotify.mobile.android.spotlets.show.model.Size.c);
        } else
        {
            obj = "";
        }
        obj = dto.a(((String) (obj)));
        picasso = ((gft)dmz.a(gft)).a();
        picasso.a(((android.net.Uri) (obj))).a(dgf.a).a(fig.u(a).d(), null);
        picasso.a(((android.net.Uri) (obj))).a(dff.c(a.k())).a(fig.t(a).b(), null);
        fig.t(a).b().setScaleType(android.widget.ew.ScaleType.CENTER_CROP);
        CoverImageActivity.a(a.k(), fig.t(a).b(), ((android.net.Uri) (obj)));
        fig.I(a).a(fiw.a(show.f()));
        fig.c(a, show.g());
        fig.J(a);
        fig.K(a).setText(a.l().getString(0x7f0804e7, new Object[] {
            show.d()
        }).toUpperCase(a.l().getConfiguration().locale));
        obj = a;
        if (((fio[])fir1.getItems()).length > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((fig) (obj)).a(flag2);
        ((fpe)a.k()).P_();
        obj = fig.L(a);
        if (flag1 || fig.E(a) > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        ((View) (obj)).setEnabled(flag2);
        if (fig.M(a).e())
        {
            fig.M(a).b();
        }
        if (!fig.N(a))
        {
            fig.a(a, fir1);
            fig.O(a);
        }
        fig.x(a).a(new int[] {
            2
        });
    }

    public final void a(String s)
    {
        Logger.c("Failed to load show: %s", new Object[] {
            s
        });
        fig.P(a);
    }

    ng(fig fig1)
    {
        a = fig1;
        super();
    }
}
