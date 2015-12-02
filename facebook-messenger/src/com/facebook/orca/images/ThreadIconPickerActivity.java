// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.images;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.q;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.analytics.d;
import com.facebook.analytics.f.a;
import com.facebook.base.activity.i;
import com.facebook.fbservice.ops.BlueServiceFragment;
import com.facebook.fbservice.ops.aa;
import com.facebook.fbservice.ops.j;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.photos.picking.PickMediaOperation;
import com.facebook.orca.photos.picking.PickMediaParams;
import com.facebook.orca.photos.picking.b;
import com.facebook.orca.server.an;
import com.facebook.orca.server.aq;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.f;
import com.facebook.ui.media.attachments.g;
import java.io.File;

// Referenced classes of package com.facebook.orca.images:
//            j, k

public class ThreadIconPickerActivity extends i
    implements d
{

    private q p;
    private av q;
    private PickMediaOperation r;
    private BlueServiceFragment s;
    private boolean t;
    private String u;
    private boolean v;

    public ThreadIconPickerActivity()
    {
    }

    static void a(ThreadIconPickerActivity threadiconpickeractivity, File file)
    {
        threadiconpickeractivity.a(file);
    }

    private void a(File file)
    {
        if (s.b() != j.INIT)
        {
            return;
        }
        Object obj = null;
        if (file != null)
        {
            obj = MediaResource.a().a(g.PHOTO).a(Uri.fromFile(file)).i();
        }
        file = (new an()).a(u).b(true).a(((MediaResource) (obj))).h();
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("modifyThreadParams", file);
        s.a(aq.v, ((Bundle) (obj)));
        q.a((new cb("set")).a(g_()).b("thread_id", u).f("thread_image"));
    }

    private void j()
    {
        PickMediaParams pickmediaparams = new PickMediaParams(false);
        pickmediaparams.a(true).a(200).b(200).c(1).d(1).a(b.CAMERA).a(b.GALLERY).a(b.IMAGE_SEARCH);
        if (v)
        {
            pickmediaparams.a(b.REMOVE);
        }
        r.a(pickmediaparams);
    }

    public void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = i();
        p = (q)bundle.a(android/support/v4/app/q);
        q = (av)bundle.a(com/facebook/analytics/av);
        bundle = getIntent();
        u = bundle.getStringExtra("threadId");
        v = bundle.getBooleanExtra("hasPictureHash", false);
        r = (PickMediaOperation)p.a("pickMediaOperation");
        if (r == null)
        {
            r = new PickMediaOperation();
            a("pickMediaOperation", r);
        }
        r.a(new com.facebook.orca.images.j(this));
        s = BlueServiceFragment.a(this, "setPhotoOperation");
        s.a(new k(this));
        s.a(new aa(this, o.thread_icon_picker_progress));
    }

    public a g_()
    {
        return a.THREAD_ICON_PICKER_ACTIVITY_NAME;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        t = bundle.getBoolean("showedDialog");
    }

    protected void onResume()
    {
        super.onResume();
        if (!t)
        {
            j();
            t = true;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("showedDialog", t);
    }
}
