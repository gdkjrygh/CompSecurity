// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Intent;
import android.content.SharedPreferences;
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
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageEditGLESActivity;
import com.roidapp.photogrid.filter.selfiecam.SelfieCamImageShowActivity;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ShareEntryBase, PhotoGridActivity, ig, ih, 
//            qx

public class ShareEntrySingle extends ShareEntryBase
{

    public ShareEntrySingle()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        Object obj;
        obj = null;
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null || bundle.getAction() == null) goto _L2; else goto _L1
_L1:
        Object obj1 = bundle.getStringExtra("pgMode");
        if (!com/roidapp/photogrid/filter/selfiecam/SelfieCamImageEditGLESActivity.getName().equalsIgnoreCase(((String) (obj1))) && !com/roidapp/photogrid/filter/selfiecam/SelfieCamImageShowActivity.getName().equalsIgnoreCase(((String) (obj1)))) goto _L4; else goto _L3
_L3:
        obj = new Intent();
        ((Intent) (obj)).putExtra("shareEntry", getClass().getName());
        ((Intent) (obj)).putExtra("mime", bundle.getType());
        ((Intent) (obj)).putExtra("uri", bundle.getParcelableExtra("android.intent.extra.STREAM"));
        setResult(-1, ((Intent) (obj)));
        finish();
_L10:
        return;
_L4:
        boolean flag1;
        if (com/roidapp/photogrid/release/PhotoGridActivity.getName().equalsIgnoreCase(((String) (obj1))))
        {
            flag1 = true;
        } else
        {
            flag1 = bundle.getBooleanExtra("shareToSelf", false);
        }
        if (!bundle.getAction().equals("android.intent.action.SEND")) goto _L6; else goto _L5
_L5:
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM")) goto _L8; else goto _L7
_L7:
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
        if (bundle == null) goto _L10; else goto _L9
_L9:
        boolean flag;
        int j;
        bundle = a(bundle);
        if (bundle != null)
        {
            obj = bundle.substring(0, bundle.lastIndexOf("/"));
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
            ih.C().d(((String) (obj)));
            ih.C().i(0);
            ih.C().F();
            ih.C().j("ShareEntrySingle");
            com.roidapp.photogrid.release.qx.a().d();
            ih.C().j(15);
            az.z = false;
            f.a(g.j);
            f.a("EditPage_View", "SystemGallery_Edit");
            af.a(this, "OpenPG");
            b.a("Share/Single");
            ag.a().a(this);
            com.roidapp.photogrid.common.b.a((new StringBuilder("FromShare/Single/")).append(j).toString());
            getSharedPreferences("state_single", 0).edit().putInt("single_mode", 1).apply();
            bundle = new Intent(this, com/roidapp/photogrid/release/PhotoGridActivity);
            bundle.setFlags(0x4000000);
            bundle.putExtra("moreThan9", b);
            bundle.putExtra("shareToSelf", flag1);
            finish();
            startActivity(bundle);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        j = 0;
        bundle = null;
        flag = false;
          goto _L11
_L6:
        if (!bundle.getAction().equals("android.intent.action.SEND_MULTIPLE"))
        {
            break MISSING_BLOCK_LABEL_768;
        }
        bundle = bundle.getExtras();
        if (bundle == null || !bundle.containsKey("android.intent.extra.STREAM"))
        {
            break MISSING_BLOCK_LABEL_733;
        }
        bundle = bundle.getParcelableArrayList("android.intent.extra.STREAM");
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_722;
        }
        j = bundle.size();
        bundle = a(bundle, j);
        if (a) goto _L10; else goto _L12
_L12:
        if (bundle != null)
        {
            obj = ((ig) (bundle[0])).n.substring(0, ((ig) (bundle[0])).n.lastIndexOf("/"));
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
