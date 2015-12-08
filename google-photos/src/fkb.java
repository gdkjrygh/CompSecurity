// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.List;

public final class fkb
    implements mti, omb, opl, opr, ops, opv
{

    public static final ekk a = (new ekm()).a(hpg).b(elt).a();
    private static ekk j = (new ekm()).a(elj).a();
    public final ar b;
    public mtj c;
    public mmr d;
    public noz e;
    public Uri f;
    public String g;
    public int h;
    public boolean i;
    private fay k;
    private ekr l;
    private noz m;

    public fkb(ar ar1, opd opd1)
    {
        p.a(ar1);
        b = ar1;
        opd1.a(this);
    }

    private ekq a(int i1)
    {
        Object obj;
        try
        {
            obj = (List)l.a(fux.b(-1), j).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (((List) (obj)).size() != 1)
        {
            i1 = ((List) (obj)).size();
            throw new IllegalStateException((new StringBuilder(47)).append("Unexpected number of camera folders ").append(i1).toString());
        } else
        {
            return (ekq)((List) (obj)).get(0);
        }
    }

    private ekq c()
    {
        if (d.e())
        {
            return b.a(d.d(), null);
        } else
        {
            return a(-1);
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = ((mtj)olm1.a(mtj)).a(this);
        d = (mmr)olm1.a(mmr);
        k = (fay)olm1.a(fay);
        l = b.b(context, fux.a(d.d()));
        e = noz.a(b, 3, "ExtMediaViewingMixin", new String[0]);
        m = noz.a(context, "ExtMediaViewingMixin", new String[0]);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            f = (Uri)bundle.getParcelable("ExternalMediaViewingMixin.uri");
            g = bundle.getString("ExternalMediaViewingMixin.content_type");
            h = bundle.getInt("ExternalMediaViewingMixin.flags");
            i = bundle.getBoolean("ExternalMediaViewingMixin.ready_to_finish");
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag4 = false;
        if (!ele.a(b.pC).equals(s)) goto _L2; else goto _L1
_L1:
        if (mue1 == null || mue1.c()) goto _L4; else goto _L3
_L3:
        mue1 = mue1.a();
        s = mue1.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        mue1 = (ekq)mue1.getParcelable("com.google.android.apps.photos.core.media_collection");
        if (s == null || s.isEmpty()) goto _L6; else goto _L5
_L5:
        String s1;
        Object obj;
        mua = (ekp)s.get(0);
        obj = b.getIntent();
        s1 = ((Intent) (obj)).getAction();
        obj = ((Intent) (obj)).getData();
        if (!"com.android.camera.action.REVIEW".equals(s1)) goto _L8; else goto _L7
_L7:
        s = c();
        if (s != null) goto _L10; else goto _L9
_L9:
        b();
_L12:
        return;
_L10:
        mue1 = b.getIntent().getData();
        int i1 = d.d();
        mua = c;
        int j1 = b.pD;
        hpm hpm1 = new hpm();
        hpm1.b = mue1.toString();
        mua.a(new fkx(j1, i1, s, hpm1.a()));
        return;
_L8:
        boolean flag;
        boolean flag1;
        boolean flag3;
        if (mua.c() == euv.c && s.size() == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (mua.c() == euv.c)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        s = (new gne(b, d.d())).a(((Uri) (obj)), g).a(mua).a(mue1);
        ((gne) (s)).a.putExtra("com.google.android.apps.photos.pager.prevent_background_fragment", flag3);
        s = s.c(true).e(true).f(true);
        if ("content".equals(f.getScheme()) && "media".equals(f.getAuthority()) || "file".equals(f.getScheme()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = flag4;
        if (!flag)
        {
            flag3 = true;
        }
        s = s.g(flag3).d(true).b(true).a(true).h(flag1);
        ((gne) (s)).a.putExtra("com.google.android.apps.photos.pager.prevent_add_to_album", true);
        s = s.a(h);
        b.startActivity(((gne) (s)).a);
        i = true;
        return;
_L6:
        b();
        return;
_L4:
        b();
        return;
_L2:
        if (fkx.a(b.pD).equals(s))
        {
            if (mue1 == null || mue1.c())
            {
                s = null;
            } else
            {
                s = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
            }
            mue1 = c();
            if (mue1 == null)
            {
                b();
                return;
            }
            s = (new gne(b, d.d())).a(f, g).a(s).a(mue1);
            boolean flag2;
            if (!d.e())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            s = s.b(flag2);
            ((gne) (s)).a.putExtra("com.google.android.apps.photos.pager.allow_delete_device_copy", true);
            s = s.a(false);
            ((gne) (s)).a.putExtra("exit_on_back", true);
            mue1 = k.a(d.d(), faz.b);
            mue1.addFlags(0x4000000);
            ((gne) (s)).a.putExtra("custom_up_intent", mue1);
            s = s.a(h);
            b.startActivity(((gne) (s)).a);
            b.finish();
            return;
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

    public final void al_()
    {
        if (i)
        {
            b.finish();
        }
    }

    public void b()
    {
        boolean flag;
        if (b.c(f) || "content".equals(f.getScheme()) && "media".equals(f.getAuthority()) && ("vnd.android.cursor.dir/image".equals(g) || "vnd.android.cursor.dir/video".equals(g)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Intent intent = k.a(d.d(), faz.b);
            b.startActivity(intent);
            i = true;
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            if (e.a())
            {
                noy.a("uri", f);
            }
            String s = b.getResources().getString(b.pE);
            Toast.makeText(b, s, 0).show();
            b.finish();
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("ExternalMediaViewingMixin.uri", f);
        bundle.putString("ExternalMediaViewingMixin.content_type", g);
        bundle.putInt("ExternalMediaViewingMixin.flags", h);
        bundle.putBoolean("ExternalMediaViewingMixin.ready_to_finish", i);
    }

}
