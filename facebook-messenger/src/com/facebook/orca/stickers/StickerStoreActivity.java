// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.q;
import com.facebook.base.activity.i;
import com.facebook.debug.log.b;
import com.facebook.k;
import com.facebook.o;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

// Referenced classes of package com.facebook.orca.stickers:
//            StickerStoreFragment, StickerPack, StickerStorePackFragment, x

public class StickerStoreActivity extends i
{

    private static final Class p = com/facebook/orca/stickers/StickerStoreActivity;
    private a q;
    private StickerStoreFragment r;
    private StickerStorePackFragment s;

    public StickerStoreActivity()
    {
    }

    private void a(com.facebook.base.fragment.b b1, Intent intent)
    {
        if (intent == null)
        {
            finish();
        } else
        if (b1 instanceof StickerStoreFragment)
        {
            a((StickerPack)intent.getParcelableExtra("stickerPack"), intent.getBooleanExtra("isOwned", false), true);
            return;
        }
    }

    private void a(StickerPack stickerpack, boolean flag, boolean flag1)
    {
        q q1 = f();
        if (!q1.c())
        {
            com.facebook.debug.log.b.e(p, "Unable to safely commit fragment transactions--aborting operation.");
        } else
        if (l())
        {
            s.a(stickerpack, flag);
            stickerpack = q1.a();
            stickerpack.b(f().a("storeFragment"));
            stickerpack.c(s);
            if (flag1)
            {
                stickerpack.a("packFragment");
            }
            stickerpack.a();
            return;
        }
    }

    static void a(StickerStoreActivity stickerstoreactivity, com.facebook.base.fragment.b b1, Intent intent)
    {
        stickerstoreactivity.a(b1, intent);
    }

    private void j()
    {
        Object obj = f();
        if (!((q) (obj)).c())
        {
            com.facebook.debug.log.b.e(p, "Unable to safely commit fragment transactions--aborting operation.");
        } else
        if (k())
        {
            obj = ((q) (obj)).a();
            ((ad) (obj)).c(r);
            ((ad) (obj)).a();
            return;
        }
    }

    private boolean k()
    {
        q q1 = f();
        r = (StickerStoreFragment)q1.a("storeFragment");
        if (r != null)
        {
            return true;
        }
        if (!q1.c())
        {
            com.facebook.debug.log.b.e(p, "Unable to safely commit fragment transactions--aborting operation.");
            return false;
        } else
        {
            r = new StickerStoreFragment();
            ad ad1 = q1.a();
            ad1.a(com.facebook.i.container, r, "storeFragment");
            ad1.b(r);
            ad1.a();
            q1.b();
            return true;
        }
    }

    private boolean l()
    {
        q q1 = f();
        s = (StickerStorePackFragment)q1.a("packFragment");
        if (s != null)
        {
            return true;
        }
        if (!q1.c())
        {
            com.facebook.debug.log.b.e(p, "Unable to safely commit fragment transactions--aborting operation.");
            return false;
        } else
        {
            s = new StickerStorePackFragment();
            ad ad1 = q1.a();
            ad1.a(com.facebook.i.container, s, "packFragment");
            ad1.b(s);
            ad1.a();
            q1.b();
            return true;
        }
    }

    public void a(Fragment fragment)
    {
        super.a(fragment);
        if (!(fragment instanceof com.facebook.base.fragment.b))
        {
            return;
        } else
        {
            ((com.facebook.base.fragment.b)fragment).a(new x(this));
            return;
        }
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(k.orca_sticker_store);
        c.a(this);
        q = (a)b(com.facebook.i.titlebar);
        q.setTitle(o.sticker_store_title);
        bundle = null;
        Intent intent = getIntent();
        if (intent != null)
        {
            bundle = (StickerPack)intent.getParcelableExtra("stickerPack");
        }
        if (bundle == null)
        {
            j();
            return;
        } else
        {
            a(bundle, false, false);
            return;
        }
    }

}
