// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.a.a;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.b.g;
import com.roidapp.photogrid.cloud.aj;
import com.roidapp.photogrid.cloud.w;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.ag;
import com.roidapp.photogrid.common.ak;
import com.roidapp.photogrid.common.an;
import com.roidapp.photogrid.common.az;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryBase, ig, ih, qx, 
//            PhotoGridActivity

public class ShareEntryGrid extends ShareEntryBase
{

    public ShareEntryGrid()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        String s;
        s = null;
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null || bundle.getAction() == null) goto _L2; else goto _L1
_L1:
        if (!bundle.getAction().equals("android.intent.action.SEND")) goto _L4; else goto _L3
_L3:
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM")) goto _L6; else goto _L5
_L5:
        Uri uri = (Uri)bundle.getParcelable("android.intent.extra.STREAM");
        if (uri != null) goto _L8; else goto _L7
_L7:
        finish();
_L10:
        return;
_L8:
        if ("com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority()))
        {
            a();
            return;
        }
        bundle = uri;
        if (!"com.google.android.apps.photos.contentprovider".equals(uri.getAuthority()))
        {
            continue; /* Loop/switch isn't completed */
        }
        int i;
        bundle = Uri.decode(uri.toString());
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
        if (bundle == null) goto _L10; else goto _L9
_L9:
        boolean flag;
        int j;
        bundle = a(bundle);
        if (bundle != null)
        {
            s = bundle.substring(0, bundle.lastIndexOf("/"));
            bundle = (new ig[] {
                new ig(bundle)
            });
            flag = true;
            j = 1;
        } else
        {
            j = 0;
            bundle = null;
            flag = false;
        }
_L11:
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
            ih.C().d(s);
            ih.C().i(0);
            ih.C().F();
            ih.C().j("ShareEntryGrid");
            com.roidapp.photogrid.release.qx.a().d();
            ih.C().j(15);
            az.z = false;
            f.a(g.l);
            f.a("EditPage_View", "SystemGallery_Edit");
            af.a(this, "OpenPG");
            b.a("Share/Grid");
            ag.a().a(this);
            com.roidapp.photogrid.common.b.a((new StringBuilder("FromShare/Grid/")).append(j).toString());
            bundle = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
            bundle.setFlags(0x4000000);
            bundle.putExtra("moreThan9", b);
            finish();
            startActivity(bundle);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        j = 0;
        bundle = null;
        flag = false;
          goto _L11
_L4:
        if (!bundle.getAction().equals("android.intent.action.SEND_MULTIPLE"))
        {
            break MISSING_BLOCK_LABEL_613;
        }
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM"))
        {
            break MISSING_BLOCK_LABEL_578;
        }
        bundle = bundle.getParcelableArrayList("android.intent.extra.STREAM");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        j = bundle.size();
        bundle = a(bundle, j);
        if (a) goto _L10; else goto _L12
_L12:
        if (bundle != null)
        {
            s = ((ig) (bundle[0])).n.substring(0, ((ig) (bundle[0])).n.lastIndexOf("/"));
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L11
        j = 0;
        bundle = null;
        flag = false;
          goto _L11
        j = 0;
        bundle = null;
        flag = false;
          goto _L11
        if (!c) goto _L10; else goto _L13
_L13:
        finish();
        return;
_L2:
        finish();
        return;
        j = 0;
        bundle = null;
        flag = false;
          goto _L11
    }
}
