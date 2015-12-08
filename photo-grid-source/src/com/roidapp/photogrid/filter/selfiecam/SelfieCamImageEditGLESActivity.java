// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.n;
import com.roidapp.imagelib.a.h;
import com.roidapp.imagelib.filter.aj;
import com.roidapp.imagelib.filter.aq;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.imagelib.filter.groupinfo.b;
import com.roidapp.photogrid.FacebookMessengerActivity;
import com.roidapp.photogrid.MainPage;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.filter.ImageEditGLESActivity;
import com.roidapp.photogrid.filter.e;
import com.roidapp.photogrid.release.CameraPreviewActivity;
import com.roidapp.photogrid.release.hw;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import java.util.Arrays;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            o, c, d, b, 
//            a, e, ab

public class SelfieCamImageEditGLESActivity extends ImageEditGLESActivity
{

    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private o o;

    public SelfieCamImageEditGLESActivity()
    {
    }

    static String a(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity)
    {
        return selfiecamimageeditglesactivity.i;
    }

    static void a(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity, boolean flag, aq aq)
    {
        selfiecamimageeditglesactivity.a(flag, aq);
    }

    private void a(boolean flag, aq aq)
    {
        k = flag;
        String s = "/Save/Save/Click";
        if (flag)
        {
            s = "/Share/Save/Click";
        }
        String s2 = s;
        if (h != null)
        {
            s2 = h.concat(s);
        }
        af.c(this, s2);
        if (a != null)
        {
            IGroupInfo igroupinfo = a.i();
            if (com.roidapp.imagelib.filter.groupinfo.b.a(igroupinfo))
            {
                StringBuilder stringbuilder = new StringBuilder();
                StringBuilder stringbuilder1 = stringbuilder.append(h);
                String s1;
                if (flag)
                {
                    s1 = "/Share/Save/Filter/";
                } else
                {
                    s1 = "/Save/Save/Filter/";
                }
                stringbuilder1.append(s1).append(igroupinfo.a().b());
                af.c(this, stringbuilder.toString());
            }
        }
        a(aq);
    }

    private void a(boolean flag, boolean flag1)
    {
        o = new o(this, new c(this, flag), j(), flag, flag1);
        o.show();
    }

    static boolean b(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity)
    {
        return selfiecamimageeditglesactivity.n;
    }

    static void c(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity)
    {
        selfiecamimageeditglesactivity.i();
    }

    static String d(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity)
    {
        return selfiecamimageeditglesactivity.i;
    }

    private int[] j()
    {
        int i = getResources().getDisplayMetrics().widthPixels;
        if (i >= 1080)
        {
            if (i < 1440)
            {
                return (new int[] {
                    720, 1024, 1080, 1660, 1920, 2048
                });
            } else
            {
                return (new int[] {
                    720, 1024, 1080, 1660, 1920, 2048, 2560
                });
            }
        } else
        {
            return hw.bd(this);
        }
    }

    private void k()
    {
        i();
        Intent intent = new Intent(this, com/roidapp/photogrid/release/CameraPreviewActivity);
        Bundle bundle = new Bundle();
        bundle.putString("current_mode", "MainPage");
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    private void l()
    {
        i();
        startActivity(new Intent(this, com/roidapp/photogrid/MainPage));
        finish();
    }

    private void m()
    {
        (new Handler()).postDelayed(new d(this), 500L);
    }

    private void n()
    {
        int i;
        int i1;
        i1 = hw.c(this);
        i = i1;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (!n) goto _L4; else goto _L3
_L3:
        Integer ainteger[];
        Object obj;
        int ai[];
        int j1;
        if (getResources().getDisplayMetrics().widthPixels >= 1080)
        {
            i = 1920;
        } else
        {
            i = 720;
        }
_L2:
        ai = j();
        obj = null;
        j1 = ai.length;
        i1 = 0;
_L6:
        ainteger = obj;
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (ai[i1] == i)
        {
            ai = Arrays.copyOfRange(ai, 0, i1 + 1);
            int k1 = ai.length;
            Integer ainteger1[] = new Integer[k1];
            i1 = 0;
            do
            {
                ainteger = ainteger1;
                if (i1 >= k1)
                {
                    break;
                }
                ainteger1[i1] = Integer.valueOf(ai[k1 - 1 - i1]);
                i1++;
            } while (true);
            break; /* Loop/switch isn't completed */
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        a(true, false);
        return;
        if (true) goto _L6; else goto _L5
_L5:
        Integer ainteger2[] = ainteger;
        if (ainteger == null)
        {
            ainteger2 = new Integer[1];
            ainteger2[0] = Integer.valueOf(i);
        }
        a(true, new com.roidapp.photogrid.filter.selfiecam.b(this, ainteger2, this.i, hw.b(this), n));
        return;
    }

    public final void a(Uri uri, String s, com.roidapp.imagelib.b.b b1, IGroupInfo igroupinfo, int i)
    {
        if (isFinishing())
        {
            return;
        }
        if (uri != null)
        {
            sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
        }
        if (n)
        {
            FacebookMessengerActivity.a(uri.getPath(), "image/jpeg");
            finish();
            return;
        }
        g.setVisibility(8);
        ((TextView)g.findViewById(0x7f0d01ac)).setText(0x7f0701a0);
        s = ih.C().M();
        if (uri != null && s != null && s.length > 0)
        {
            s[b].b = uri.getPath();
            s[b].j = igroupinfo;
            s[b].i = b1;
            s[b].l = i;
        }
        if (x == null)
        {
            x = new a(this, h);
        }
        if (k)
        {
            x.a();
            return;
        } else
        {
            x.b();
            return;
        }
    }

    public final void a(Object obj)
    {
        switch (((Integer)obj).intValue())
        {
        default:
            return;

        case 2131558967: 
            n();
            return;

        case 2131558458: 
            break;
        }
        if (n)
        {
            n();
            return;
        } else
        {
            o = new o(this, new com.roidapp.photogrid.filter.selfiecam.e(this), j(), false, false);
            o.show();
            return;
        }
    }

    protected final Fragment d()
    {
        return new ab();
    }

    protected final void f()
    {
        l();
    }

    protected final void g()
    {
        if (l)
        {
            l();
            return;
        }
        switch (c)
        {
        default:
            return;

        case 2: // '\002'
            k();
            return;

        case 4: // '\004'
            i();
            finish();
            if (!l)
            {
                m = true;
            }
            com.roidapp.photogrid.b.f.a("MainPage_View", "_Home");
            return;

        case 3: // '\003'
            m();
            return;
        }
    }

    protected void onActivityResult(int i, int i1, Intent intent)
    {
        super.onActivityResult(i, i1, intent);
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   8262: 37
    //                   52225: 256;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i1;
        JVM INSTR tableswitch 34816 34825: default 92
    //                   34816 93
    //                   34817 119
    //                   34818 92
    //                   34819 239
    //                   34820 181
    //                   34821 92
    //                   34822 244
    //                   34823 92
    //                   34824 92
    //                   34825 114;
           goto _L4 _L5 _L6 _L4 _L7 _L8 _L4 _L9 _L4 _L4 _L10
_L4:
        return;
_L5:
        intent = ih.C().M();
        if (intent == null || intent.length == 0)
        {
            l();
            return;
        } else
        {
            a(false);
            a(e.a, intent[b].e(), ((ig) (intent[b])).i, ((ig) (intent[b])).j, true, ((ig) (intent[b])).l);
            return;
        }
_L10:
        finish();
        return;
_L6:
        a(k, true);
          goto _L5
_L8:
        switch (c)
        {
        default:
            return;

        case 2: // '\002'
            k();
            return;

        case 4: // '\004'
            if (com.roidapp.baselib.c.n.a())
            {
                k();
                return;
            } else
            {
                m();
                return;
            }

        case 3: // '\003'
            m();
            return;
        }
_L7:
        l();
        return;
_L9:
        try
        {
            startActivity(intent);
            finish();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
_L3:
        if (o != null)
        {
            o.a(i, i1, intent);
            return;
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        h = "SelfieCam";
        n = FacebookMessengerActivity.a(this);
        h.a();
        if (getIntent() != null)
        {
            l = getIntent().getBooleanExtra("shareToSelf", false);
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (m)
        {
            Process.killProcess(Process.myPid());
        }
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
