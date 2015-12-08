// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.Iterator;
import java.util.List;

public final class fex
    implements dhf, mti, nug, nus, omb, opn, opv
{

    private final am a;
    private grn b;
    private ejz c;
    private Context d;
    private mtj e;
    private MenuItem f;
    private nwm g;
    private mmr h;

    public fex(am am1)
    {
        a = am1;
    }

    private static String a(grn grn1)
    {
        grn1 = (hpg)grn1.b.b(hpg);
        if (grn1 == null)
        {
            return null;
        }
        grn1 = grn1.b();
        if (grn1 == null || !grn1.a())
        {
            return null;
        } else
        {
            return ((hpk) (grn1)).c;
        }
    }

    private void b()
    {
        Object obj1 = b.b;
        Object obj;
        if (((ekp) (obj1)).c() == euv.c)
        {
            obj = nup.l;
        } else
        {
            obj = nup.k;
        }
        if (!b.w(d))
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.apps.photos.core.media", ((android.os.Parcelable) (obj1)));
            obj1 = a.h();
            nuq nuq1 = new nuq();
            nuq1.a = ((nup) (obj));
            nuq1.c = "OfflineRetryTagDownloadPhotos";
            nuq1.b = bundle;
            nuq1.e = true;
            nuo.a(((ay) (obj1)), nuq1);
            return;
        }
        ekq ekq1 = c.b();
        obj1 = null;
        obj = obj1;
        if (ekq1 != null)
        {
            obj = obj1;
            if (ekq1.b(iks) != null)
            {
                obj = ((iks)ekq1.b(iks)).a;
            }
        }
        obj = new few(h.d(), a(b), ((String) (obj)));
        e.a(((mtf) (obj)));
    }

    private boolean d()
    {
        boolean flag;
        Object obj2 = b.b;
        if (obj2 == null)
        {
            return false;
        }
        Object obj1 = (hpg)((ekp) (obj2)).b(hpg);
        Object obj;
        if (obj1 == null)
        {
            obj = null;
        } else
        {
            obj = ((hpg) (obj1)).a;
        }
        obj2 = (feu)((ekp) (obj2)).b(feu);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = ((List) (obj)).iterator();
_L6:
        if (!((Iterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        if (!((hpk)((Iterator) (obj1)).next()).a()) goto _L6; else goto _L5
_L5:
        flag = true;
_L14:
        if (!flag) goto _L2; else goto _L7
_L7:
        obj = ((List) (obj)).iterator();
_L11:
        if (!((Iterator) (obj)).hasNext()) goto _L9; else goto _L8
_L8:
        if (!((hpk)((Iterator) (obj)).next()).e()) goto _L11; else goto _L10
_L10:
        flag = true;
_L12:
        if (!flag && obj2 != null && !TextUtils.isEmpty(((feu) (obj2)).a))
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L9:
        flag = false;
        if (true) goto _L12; else goto _L2
_L2:
        return false;
        if (true) goto _L14; else goto _L13
_L13:
    }

    public final String a()
    {
        return "OfflineRetryTagDownloadPhotos";
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        b = (grn)olm1.a(grn);
        b.a.a(this, false);
        c = (ejz)olm1.a(ejz);
        g = (nwm)olm1.a(nwm);
        e = (mtj)olm1.a(mtj);
        e.a(this);
        h = (mmr)olm1.a(mmr);
    }

    public final void a(MenuItem menuitem)
    {
        f = menuitem;
        menuitem.setVisible(d());
    }

    public final void a(String s, mue mue1, mua mua)
    {
label0:
        {
            if (s.equals("RequestVideoDownloadUrlTask"))
            {
                if (mue1 != null && !mue1.c())
                {
                    break label0;
                }
                Toast.makeText(d, b.nR, 1).show();
            }
            return;
        }
        mue1 = mue1.a().getString("downloadUrl");
        s = (feu)b.b.b(feu);
        if (s != null)
        {
            s = ((feu) (s)).b;
        } else
        {
            s = null;
        }
        if (TextUtils.isEmpty(mue1))
        {
            Toast.makeText(d, b.nQ, 1).show();
            return;
        } else
        {
            e.a(new fey(mue1, s));
            return;
        }
    }

    public final void b(MenuItem menuitem)
    {
        b();
    }

    public final void b_(Object obj)
    {
        b = (grn)obj;
        if (f != null && a.equals(g.b()))
        {
            f.setVisible(d());
        }
    }

    public final void c()
    {
        b.a.a(this);
    }

    public final void c_(Bundle bundle)
    {
        bundle = (ekp)bundle.getParcelable("com.google.android.apps.photos.core.media");
        ekp ekp1 = b.b;
        if (ekp1 != null && ekp1.equals(bundle))
        {
            b();
        }
    }
}
