// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.ViewGroup;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.a.a;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.g;
import com.roidapp.photogrid.cloud.aj;
import com.roidapp.photogrid.cloud.w;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.ag;
import com.roidapp.photogrid.common.ak;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.videolib.core.l;
import com.roidapp.videolib.e;
import com.roidapp.videolib.f;
import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryBase, qw, ig, ih, 
//            qx, PhotoGridActivity

public class ShareEntryVideo extends ShareEntryBase
{

    private Handler d;

    public ShareEntryVideo()
    {
        d = new qw(this);
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        s = null;
        super.onCreate(bundle);
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("hideVideo", false)) goto _L2; else goto _L1
_L1:
        int i;
        i = f.c;
        c.a();
        boolean flag1 = c.b(this);
        c.a().a(a.a(getApplicationContext()).c("opengl", "gpu_white_list"));
        if (!flag1)
        {
            i = f.b;
            i = 0;
        } else
        {
            c.a();
            if (c.a(getApplicationContext()))
            {
                c.a();
                c.a(d, this, (ViewGroup)findViewById(0x1020002));
                i = e.a().a(this, a.a(this).c("video", "black_list"));
                if (i == f.b)
                {
                    i = 0;
                } else
                {
                    if (i != f.a)
                    {
                        break MISSING_BLOCK_LABEL_250;
                    }
                    i = 1;
                }
            } else
            {
label0:
                {
                    if (!c.a().c(getApplicationContext()))
                    {
                        break label0;
                    }
                    i = e.a().a(this, a.a(this).c("video", "black_list"));
                    if (i == f.c)
                    {
                        i = 0;
                    } else
                    if (i == f.a)
                    {
                        i = 1;
                    } else
                    {
                        i = 0;
                    }
                }
            }
        }
_L4:
        if (i != 0) goto _L3; else goto _L2
_L2:
        bundle = new Intent(this, com/roidapp/photogrid/MainPage);
        bundle.setFlags(0x4000000);
        bundle.putExtra("isFromShareGallery", true);
        finish();
        startActivity(bundle);
_L12:
        return;
        i = f.b;
        i = 0;
          goto _L4
_L3:
        l.a();
        if (!l.d())
        {
            bundle = new Intent(this, com/roidapp/photogrid/MainPage);
            bundle.setFlags(0x4000000);
            bundle.putExtra("isFromShareGalleryVideoNotReady", true);
            finish();
            startActivity(bundle);
            return;
        }
        bundle = getIntent();
        if (bundle == null || bundle.getAction() == null) goto _L6; else goto _L5
_L5:
        if (!bundle.getAction().equals("android.intent.action.SEND_MULTIPLE"))
        {
            break MISSING_BLOCK_LABEL_795;
        }
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM")) goto _L8; else goto _L7
_L7:
        bundle = bundle.getParcelableArrayList("android.intent.extra.STREAM");
        if (bundle == null) goto _L10; else goto _L9
_L9:
        int j;
        j = bundle.size();
        bundle = a(bundle, j);
        if (a) goto _L12; else goto _L11
_L11:
        boolean flag;
        if (bundle != null)
        {
            s = ((ig) (bundle[0])).n.substring(0, ((ig) (bundle[0])).n.lastIndexOf("/"));
            flag = true;
        } else
        {
            flag = false;
        }
_L13:
        if (flag)
        {
            a.a(this).a();
            w.a(this, an.a(this)).b();
            (new aj()).a(this);
            if (a.a(this).a("other", "enableCrittercism50", false))
            {
                ak.a();
            }
            com.roidapp.cloudlib.push.a.a(getApplicationContext());
            az.q = 6;
            az.B = com.roidapp.photogrid.common.a.a().c(this);
            ih.C().D();
            ih.C().h(true);
            ih.C().a(bundle);
            ih.C().d(s);
            ih.C().i(0);
            ih.C().F();
            ih.C().j("ShareEntryVideo");
            com.roidapp.photogrid.release.qx.a().d();
            ih.C().j(50);
            az.z = false;
            com.roidapp.photogrid.b.f.a(g.n);
            com.roidapp.photogrid.b.f.a("EditPage_View", "SystemGallery_Edit");
            af.a(this, "OpenPG");
            b.a("Share/Video");
            ag.a().a(this);
            com.roidapp.photogrid.common.b.a((new StringBuilder("FromShare/Video/")).append(j).toString());
            ih.C().n(0);
            ih.C().j(false);
            ih.C().o(0);
            PreferenceManager.getDefaultSharedPreferences(this).edit().putBoolean("first_in", true).apply();
            ih.C().l(true);
            ih.C().f("Music: Love PhotoGrid - PhotoGrid");
            ih.C().g((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(getString(0x7f07002e)).append("/.music/Love PhotoGrid-L.mp3").toString());
            bundle = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
            bundle.setFlags(0x4000000);
            bundle.putExtra("moreThan9", b);
            finish();
            startActivity(bundle);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        j = 0;
        bundle = null;
        flag = false;
          goto _L13
_L8:
        j = 0;
        bundle = null;
        flag = false;
          goto _L13
        if (!c) goto _L12; else goto _L14
_L14:
        finish();
        return;
_L6:
        finish();
        return;
        j = 0;
        bundle = null;
        flag = false;
          goto _L13
    }
}
