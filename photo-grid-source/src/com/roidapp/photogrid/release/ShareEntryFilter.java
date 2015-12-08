// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roidapp.baselib.c.b;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import com.roidapp.cloudlib.a.a;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.b.g;
import com.roidapp.photogrid.cloud.aj;
import com.roidapp.photogrid.cloud.w;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.ag;
import com.roidapp.photogrid.common.ak;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageEditGLESActivity;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageShowActivity;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryBase, PhotoGridActivity, ig, ih, 
//            qx

public class ShareEntryFilter extends ShareEntryBase
{

    public ShareEntryFilter()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        obj = null;
        super.onCreate(bundle);
        c.a();
        if (c.b(this)) goto _L2; else goto _L1
_L1:
        bundle = new Intent(this, com/roidapp/photogrid/MainPage);
        bundle.setFlags(0x4000000);
        bundle.putExtra("isFilterFromShareGallery", true);
        finish();
        startActivity(bundle);
_L8:
        return;
_L2:
        bundle = getIntent();
        if (bundle == null || bundle.getAction() == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        boolean flag1;
        obj1 = bundle.getStringExtra("pgMode");
        if (com/roidapp/photogrid/release/PhotoGridActivity.getName().equalsIgnoreCase(((String) (obj1))) || com/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity.getName().equalsIgnoreCase(((String) (obj1))))
        {
            obj = new Intent();
            ((Intent) (obj)).putExtra("shareEntry", getClass().getName());
            ((Intent) (obj)).putExtra("mime", bundle.getType());
            ((Intent) (obj)).putExtra("uri", bundle.getParcelableExtra("android.intent.extra.STREAM"));
            setResult(-1, ((Intent) (obj)));
            finish();
            return;
        }
        if (com/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity.getName().equalsIgnoreCase(((String) (obj1))))
        {
            flag1 = true;
        } else
        {
            flag1 = bundle.getBooleanExtra("shareToSelf", false);
        }
        if (!bundle.getAction().equals("android.intent.action.SEND"))
        {
            break MISSING_BLOCK_LABEL_717;
        }
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM")) goto _L6; else goto _L5
_L5:
        obj1 = (Uri)bundle.getParcelable("android.intent.extra.STREAM");
        if (obj1 == null)
        {
            finish();
            return;
        }
        if ("com.google.android.apps.docs.storage.legacy".equals(((Uri) (obj1)).getAuthority()))
        {
            a();
            return;
        }
        bundle = ((Bundle) (obj1));
        if (!"com.google.android.apps.photos.contentprovider".equals(((Uri) (obj1)).getAuthority()))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i;
        bundle = Uri.decode(((Uri) (obj1)).toString());
        i = bundle.indexOf("content://media/");
        if (i < 0)
        {
            try
            {
                finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                bundle.printStackTrace();
            }
            finish();
            return;
        }
        bundle = Uri.parse(bundle.substring(i, bundle.indexOf("/ACTUAL")));
        if (bundle == null) goto _L8; else goto _L7
_L7:
        boolean flag;
        bundle = a(bundle);
        if (bundle != null)
        {
            obj = bundle.substring(0, bundle.lastIndexOf("/"));
            bundle = (new ig[] {
                new ig(bundle)
            });
            flag = true;
            i = 1;
        } else
        {
            i = 0;
            bundle = null;
            flag = false;
        }
_L9:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        a.a(this).a();
        w.a(this, an.a(this)).b();
        (new aj()).a(this);
        if (a.a(this).a("other", "enableCrittercism50", false))
        {
            ak.a();
        }
        com.roidapp.cloudlib.push.a.a(getApplicationContext());
        if (bundle.length == 1)
        {
            az.q = 5;
        } else
        {
            az.q = 0;
        }
        az.B = com.roidapp.photogrid.common.a.a().c(this);
        ih.C().D();
        ih.C().h(true);
        ih.C().a(bundle);
        ih.C().d(((String) (obj)));
        ih.C().i(0);
        ih.C().F();
        ih.C().j("ShareEntryFilter");
        com.roidapp.photogrid.release.qx.a().d();
        ih.C().j(15);
        az.z = false;
        f.a(g.m);
        f.a("FilterPage_View", "_Filter");
        af.a(this, "OpenPG");
        b.a("Share/Filter");
        ag.a().a(this);
        com.roidapp.photogrid.common.b.a((new StringBuilder("FromShareEntryFilter/")).append(i).toString());
        bundle = new Intent(this, com/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity);
        bundle.putExtra("edit_image_index", 0);
        bundle.putExtra("entry_type", 0);
        bundle.putExtra("edit_suppot_filter", true);
        bundle.setFlags(0x4000000);
        bundle.putExtra("shareToSelf", flag1);
        if (flag1)
        {
            if (n.a())
            {
                i = 2;
            } else
            {
                i = 3;
            }
            bundle.putExtra("entry_from", i);
        } else
        {
            bundle.putExtra("entry_from", 4);
        }
        startActivity(bundle);
_L4:
        finish();
        return;
_L6:
        i = 0;
        bundle = null;
        flag = false;
          goto _L9
        if (!c) goto _L8; else goto _L10
_L10:
        finish();
        return;
        i = 0;
        bundle = null;
        flag = false;
          goto _L9
    }
}
