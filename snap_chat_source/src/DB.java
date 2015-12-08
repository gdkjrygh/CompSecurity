// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.rendering.SnapMediaRenderer;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.CameraDisplayState;
import com.squareup.otto.Bus;
import java.io.File;

public final class DB
    implements SnapMediaRenderer
{

    static String a = "VideoSnapRenderer";
    final DG b;
    public View c;
    ImageView d;
    View e;
    com.snapchat.android.rendering.SnapMediaRenderer.a f;
    sT g;
    public DD h;
    private final LayoutInflater i;
    private final Bus j;
    private final DC k;
    private ViewGroup l;
    private View m;

    private DB(DG dg, LayoutInflater layoutinflater, Bus bus, DC dc)
    {
        b = dg;
        i = layoutinflater;
        j = bus;
        k = dc;
    }

    public DB(Context context, DG dg)
    {
        LayoutInflater layoutinflater = (LayoutInflater)context.getSystemService("layout_inflater");
        Bus bus = Mf.a();
        new Ke();
        this(dg, layoutinflater, bus, new DC(context));
    }

    static DG a(DB db)
    {
        return db.b;
    }

    static String f()
    {
        return a;
    }

    public final void a()
    {
        PG.a();
        if (g == null)
        {
            if (ReleaseManager.f())
            {
                throw new RuntimeException("Start called for null snap");
            }
        } else
        {
            Timber.c(a, "SNAP-VIEW: Start %s", new Object[] {
                g.a
            });
            b.d();
        }
    }

    public final void a(ViewGroup viewgroup)
    {
        l = viewgroup;
        m = b.a(i, viewgroup);
        c = b.a();
        d = b.b();
        e = b.c();
    }

    public final void a(sT st, sR sr, com.snapchat.android.rendering.SnapMediaRenderer.a a1, boolean flag)
    {
        Timber.c(a, "SNAP-VIEW: Prepare %s", new Object[] {
            st.a
        });
        PG.a();
        f = a1;
        g = st;
        if (!Ke.a())
        {
            f.a(com.snapchat.android.rendering.SnapMediaRenderer.ErrorCode.EXTERNAL_STORAGE_REQUIRED);
            return;
        }
        if (Kl.sExternalCacheDirectory == null)
        {
            Kl.a(SnapchatApplication.get().getCacheDir(), SnapchatApplication.get().getExternalCacheDir());
        }
        j.a(new Mh(CameraDisplayState.CLOSE));
        l.setVisibility(0);
        c.setVisibility(4);
        e.setVisibility(0);
        b.a(st, a1);
        a1 = g.a;
        DC dc = k;
        dc.b = new DC._cls1(dc, sr, new DC.a(a1, flag, st) {

            private String a;
            private boolean b;
            private sT c;
            private DB d;

            public final void a(DD dd)
            {
                DB db;
                boolean flag2;
                Timber.c(DB.f(), String.format("SNAP-VIEW: Async loading complete for %s", new Object[] {
                    a
                }), new Object[0]);
                db = d;
                flag2 = b;
                PG.a();
                db.e();
                if (!dd.b) goto _L2; else goto _L1
_L1:
                boolean flag1;
                Timber.d(DB.a, "SNAP-VIEW: Video decryption error, media is possibly corrupt", new Object[0]);
                db.f.a(com.snapchat.android.rendering.SnapMediaRenderer.ErrorCode.CANNOT_DECRYPT_MEDIA_ERROR);
                dd.d();
                flag1 = false;
_L4:
                if (flag1)
                {
                    Timber.c(DB.f(), String.format("SNAP-VIEW: Starting %s at %d ms", new Object[] {
                        a, Integer.valueOf(c.d)
                    }), new Object[0]);
                    DB.a(d).a(c.d);
                }
                return;
_L2:
label0:
                {
                    if (dd.a() == null)
                    {
                        Timber.d(DB.a, "SNAP-VIEW: getVideoUri() return null, the video is not available locally", new Object[0]);
                        db.f.a(com.snapchat.android.rendering.SnapMediaRenderer.ErrorCode.MEDIA_UNAVAILABLE_LOCALLY);
                        dd.d();
                        flag1 = false;
                        continue; /* Loop/switch isn't completed */
                    }
                    String s = dd.a();
                    if (db.b.a(Uri.fromFile(new File(s))))
                    {
                        if (db.g == null)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (!flag1)
                        {
                            break label0;
                        }
                    }
                    dd.d();
                    flag1 = false;
                    continue; /* Loop/switch isn't completed */
                }
                db.c.setVisibility(0);
                db.e.setVisibility(0);
                if (dd.b() != null && !flag2)
                {
                    db.d.setImageBitmap(dd.b());
                }
                db.h = dd;
                flag1 = true;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                d = DB.this;
                a = s;
                b = flag;
                c = st;
                super();
            }
        });
        dc.b.executeOnExecutor(dc.a, new Void[0]);
    }

    public final void a(boolean flag)
    {
        String s = a;
        Object obj;
        if (g == null)
        {
            obj = null;
        } else
        {
            obj = g.a;
        }
        Timber.c(s, "SNAP-VIEW: Toggle pause %s (%b)", new Object[] {
            obj, Boolean.valueOf(flag)
        });
        PG.a();
        b.b(flag);
    }

    public final void b()
    {
        String s = a;
        Object obj;
        if (g == null)
        {
            obj = null;
        } else
        {
            obj = g.a;
        }
        Timber.c(s, "SNAP-VIEW: Stop %s", new Object[] {
            obj
        });
        PG.a();
        obj = k;
        if (((DC) (obj)).b != null)
        {
            ((DC) (obj)).b.cancel(false);
            obj.b = null;
        }
        f = null;
        g = null;
        e();
        b.e();
        d.setVisibility(8);
    }

    public final void b(boolean flag)
    {
        b.a(flag);
    }

    public final void c()
    {
        String s = a;
        Object obj;
        if (g == null)
        {
            obj = null;
        } else
        {
            obj = g.a;
        }
        Timber.c(s, "SNAP-VIEW: Show %s", new Object[] {
            obj
        });
        PG.a();
        d.setVisibility(0);
        c.setVisibility(0);
        e.setVisibility(8);
        m.bringToFront();
    }

    public final void d()
    {
        String s = a;
        Object obj;
        if (g == null)
        {
            obj = null;
        } else
        {
            obj = g.a;
        }
        Timber.c(s, "SNAP-VIEW: Hide %s", new Object[] {
            obj
        });
        PG.a();
        d.setVisibility(8);
        c.setVisibility(8);
        e();
    }

    final void e()
    {
        PG.a();
        d.setImageBitmap(null);
        if (h != null)
        {
            h.d();
            h = null;
        }
    }

}
