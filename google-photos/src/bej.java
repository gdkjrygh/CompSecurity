// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;
import com.google.android.apps.consumerphotoeditor.contentprovider.CachedFileProvider;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;
import java.util.concurrent.TimeUnit;

public final class bej extends am
    implements iuv, mti
{

    private static final long e;
    private static final long f;
    mtj a;
    private CountDownTimer ad;
    private CountDownTimer ae;
    private noz af;
    private noz ag;
    private String ah;
    public final bdo b = new bdo();
    volatile boolean c;
    boolean d;
    private bfu g;
    private mmr h;

    public bej()
    {
        ad = null;
        ae = null;
        c = false;
        d = false;
    }

    static CountDownTimer a(bej bej1, CountDownTimer countdowntimer)
    {
        bej1.ae = null;
        return null;
    }

    static mtj a(bej bej1)
    {
        return bej1.a;
    }

    static void a(bej bej1, String s1)
    {
        bej1.a(s1);
    }

    static void a(bej bej1, String s1, boolean flag)
    {
        bej1.a(s1, true);
    }

    private void a(ConsumerPhotoEditorActivity consumerphotoeditoractivity)
    {
        a = (mtj)((ome) (consumerphotoeditoractivity)).f.a(mtj);
        a.b(this);
        a.a(this);
        a.b.a(this);
        h = (mmr)((ome) (consumerphotoeditoractivity)).f.a(mmr);
    }

    private void a(String s1)
    {
        a.b.a(s1);
    }

    static boolean a(bej bej1, boolean flag)
    {
        bej1.c = false;
        return false;
    }

    static CountDownTimer b(bej bej1, CountDownTimer countdowntimer)
    {
        bej1.ad = null;
        return null;
    }

    static noz b(bej bej1)
    {
        return bej1.af;
    }

    private void b(String s1, int i)
    {
        if (s1 != null)
        {
            ((bdr)super.B.a(s1)).a_(i);
        }
    }

    static void c(bej bej1)
    {
        bej1.v();
    }

    private void v()
    {
        int i;
        if (b.i.g().f())
        {
            i = com.google.android.apps.consumerphotoeditor.R.string.cpe_editor_load_remote_fullsize_error_message;
        } else
        {
            i = com.google.android.apps.consumerphotoeditor.R.string.cpe_editor_load_local_fullsize_error_message;
        }
        bfj.b(com.google.android.apps.consumerphotoeditor.R.string.cpe_editor_load_fullsize_error_title, i).a(h(), null);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = (ConsumerPhotoEditorActivity)O_();
        af = noz.a(bundle, 3, "EditSessionFragment", new String[0]);
        ag = noz.a(bundle, "EditSessionFragment", new String[0]);
        a(((ConsumerPhotoEditorActivity) (bundle)));
        a.a(new bfz(O_().getIntent(), b, h.d()));
        ad = new bel(this, 1500L, 1500L);
        ad.start();
    }

    public final void a(String s1, int i)
    {
        if (g != null)
        {
            a.b.a(g, false);
            b.z = s1;
            b.A = i;
            return;
        } else
        {
            b(s1, i);
            return;
        }
    }

    public final void a(String s1, mue mue1, mua mua1)
    {
        if (!s1.equals("LoadPhotoTask")) goto _L2; else goto _L1
_L1:
        a("LoadPhotoTag");
        mua1 = (ConsumerPhotoEditorActivity)O_();
        if (b.a(mue1, s1, ag)) goto _L4; else goto _L3
_L3:
        Toast.makeText(mua1, com.google.android.apps.consumerphotoeditor.R.string.cpe_editor_loading_error, 1).show();
        mua1.finish();
        mua1.overridePendingTransition(0, 0);
_L6:
        return;
_L4:
        ah = mua1.getIntent().getData().toString();
        mua1.f();
        if (!mue1.a().getBoolean("edit_list_success"))
        {
            (new bfb()).a(mua1.c(), "InvalidEditListDialogFragment");
        }
        g = new bfu(b);
        a.a(g);
        s1 = (bem)super.B.a("EditorFragment");
        if (s1 != null)
        {
            ((bem) (s1)).d.queueEvent(new bet(s1));
            if (guc.a.name().equals(O_().getIntent().getStringExtra("com.google.android.apps.photos.photoeditor.contract.external_action")))
            {
                s1.c(2);
                return;
            } else
            {
                s1.f(2);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (!s1.equals("ComputeEditingDataTask"))
        {
            break; /* Loop/switch isn't completed */
        }
        a("LoadPhotoTag");
        s1 = super.B;
        mue1 = (bem)s1.a("EditorFragment");
        if (mue1 != null)
        {
            ((bem) (mue1)).d.queueEvent(new beu(mue1));
            s1 = (bee)s1.a("CropToolbarFragment");
            if (s1 != null)
            {
                s1.r();
            }
            g = null;
            b(b.z, b.A);
            b.z = null;
            s();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (s1.equals("ComputeResultImageTask"))
        {
            a("SavePhotoTag");
            if (!b.a(mue1, s1, ag))
            {
                s1 = (ConsumerPhotoEditorActivity)O_();
                Toast.makeText(s1, com.google.android.apps.consumerphotoeditor.R.string.cpe_editor_saving_error, 1).show();
                s1.setResult(0);
                s1.finish();
                s1.overridePendingTransition(0, 0);
                return;
            }
            s1 = mue1.a().getString("saved_file_path");
            if (af.a())
            {
                noy.a("filepath", s1);
            }
            mue1 = mue1.a().getByteArray("edit_list_bytes");
            mua1 = ah;
            Intent intent = new Intent();
            ConsumerPhotoEditorActivity consumerphotoeditoractivity = (ConsumerPhotoEditorActivity)O_();
            intent.setDataAndType(CachedFileProvider.a(consumerphotoeditoractivity, s1), "image/jpeg");
            intent.addFlags(1);
            p.b(mua1, "When saving originalURI should not be empty");
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.original_for_edit_list", mua1);
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.edit_list", mue1);
            intent.putExtra("com.google.android.apps.photos.photoeditor.contract.save_as_copy", d);
            consumerphotoeditoractivity.setResult(-1, intent);
            consumerphotoeditoractivity.finish();
            consumerphotoeditoractivity.overridePendingTransition(0, 0);
            return;
        }
        if (!s1.equals("LoadFullSizePhotoTask"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!b.a(mue1, s1, ag))
        {
            a("SavePhotoTag");
            if (c)
            {
                v();
                return;
            }
        } else
        {
            t();
            return;
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!s1.equals("InitializeFullSizeRendererTask")) goto _L6; else goto _L7
_L7:
        if (!b.a(mue1, s1, ag))
        {
            a("SavePhotoTag");
            return;
        }
        if (c)
        {
            r();
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    void a(String s1, boolean flag)
    {
        a.b.a(null, null, s1, flag);
    }

    public final void a_(Bundle bundle)
    {
        if ("LoadPhotoTag".equals(bundle.getString("arg_task_tag")))
        {
            O_().finish();
            O_().overridePendingTransition(0, 0);
        }
    }

    public final void l()
    {
        super.l();
        a((ConsumerPhotoEditorActivity)O_());
    }

    public final void n()
    {
        super.n();
        a.a(new bfw(b));
        if (ad != null)
        {
            ad.cancel();
        }
        if (ae != null)
        {
            ae.cancel();
        }
    }

    void r()
    {
        a.a(new bfv(b));
    }

    void s()
    {
        if (!b.v && !b.s && !a.a("LoadFullSizePhotoTask"))
        {
            a.a(new bfy(b));
        }
    }

    void t()
    {
        if (!b.v && !b.t && !a.a("InitializeFullSizeRendererTask"))
        {
            a.a(new bfx(b));
        }
    }

    void u()
    {
        long l1;
        if (b.i.g().f())
        {
            l1 = e;
        } else
        {
            l1 = f;
        }
        ae = new bek(this, l1, l1);
        ae.start();
    }

    static 
    {
        e = TimeUnit.SECONDS.toMillis(30L);
        f = TimeUnit.SECONDS.toMillis(30L);
    }
}
