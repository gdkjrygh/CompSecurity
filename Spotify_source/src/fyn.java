// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.AppRaterActivity;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.DialogPresenter;

public final class fyn extends fze
{

    private static final gip a = gip.b("key_rater_shown");
    private static final gip b = gip.b("key_date_first_launch");
    private gin Z;
    private long aa;
    private boolean ab;
    private ClientInfo ac;
    private an ad;

    public fyn()
    {
        ac = (ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo);
        ad = new an() {

            private String a[] = {
                "uri"
            };
            private fyn b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtr.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (obj != null && ((Cursor) (obj)).getCount() >= 20 && System.currentTimeMillis() >= fyn.a(b) + 0x48190800L)
                {
                    fyn.b(b);
                }
            }

            
            {
                b = fyn.this;
                super();
            }
        };
    }

    static long a(fyn fyn1)
    {
        return fyn1.aa;
    }

    static void b(fyn fyn1)
    {
        if (fyn1.Y != null && !fyn1.ab)
        {
            fyn1.Y.a(fyn1);
            fyn1.ab = true;
        }
    }

    protected final void F()
    {
        Y.b(this);
    }

    public final void a()
    {
        if (Z == null)
        {
            Z = ((giq)dmz.a(giq)).b(k());
        }
        if (Z.a(a, false))
        {
            return;
        } else
        {
            Z.b().a(a, true).a();
            a(AppRaterActivity.a(k()));
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            ab = bundle.getBoolean("extra_queued", false);
        }
        Z = ((giq)dmz.a(giq)).b(k());
        if (Z.a(a, false) || ac.b() == null)
        {
            return;
        }
        aa = Z.a(b, 0L);
        if (aa == 0L)
        {
            aa = System.currentTimeMillis();
            Z.b().a(b, aa).a();
        }
        u().a(0x7f11008a, null, ad);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("extra_queued", ab);
    }

}
