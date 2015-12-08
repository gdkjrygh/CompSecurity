// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.widget.ProgressBar;
import com.google.android.libraries.social.media.ui.MediaView;
import java.util.ArrayList;

public final class nkc
    implements nxe
{

    public boolean a;
    private njt b;
    private MediaView c;

    public nkc(MediaView mediaview)
    {
        c = mediaview;
        super();
    }

    public final void a(nxb nxb1)
    {
        nxb1.i;
        JVM INSTR tableswitch 1 5: default 40
    //                   1 93
    //                   2 48
    //                   3 40
    //                   4 40
    //                   5 432;
           goto _L1 _L2 _L3 _L1 _L1 _L4
_L1:
        c.invalidate();
        return;
_L3:
        if (MediaView.e(c) != null && MediaView.f(c))
        {
            ((nbc)nxb1).d = c;
            MediaView.e(c).setIndeterminate(true);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        MediaView.d(c);
        Object obj = nxb1.h;
        if (obj instanceof nag)
        {
            MediaView.a(c, new naf((nag)obj, MediaView.h().a.i()));
            obj = (naf)MediaView.g(c);
            if (!((qwd) (obj)).d)
            {
                obj.d = true;
                if (((qwd) (obj)).d)
                {
                    ((qwd) (obj)).start();
                } else
                {
                    ((qwd) (obj)).stop();
                }
            }
            ((naf)MediaView.g(c)).c = MediaView.h(c);
            if (MediaView.i(c) >= 0)
            {
                ((naf)MediaView.g(c)).f = MediaView.i(c);
            }
            MediaView.g(c).setCallback(c);
            MediaView.c(c, true);
        } else
        if (obj instanceof naz)
        {
            obj = ((naz)obj).a;
            if (obj == null)
            {
                MediaView.j(c).i = 5;
            } else
            {
                MediaView.a(c, new g(((android.support.rastermill.FrameSequence) (obj)), c));
                if (MediaView.i(c) != 1)
                {
                    ((g)MediaView.g(c)).g = 2;
                }
                MediaView.g(c).setCallback(c);
                MediaView.c(c, true);
                ((g)MediaView.g(c)).start();
            }
        }
        MediaView.b(c, true);
        MediaView.a(c, false);
        ((nbc)nxb1).d = null;
        c.d();
        if (MediaView.k(c) != null)
        {
            MediaView.k(c).a();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        MediaView.j(c).i = 5;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void b()
    {
        int i = MediaView.a(c);
        if (a)
        {
            i |= 0x40000;
        } else
        {
            MediaView.a(c, true);
        }
        b = MediaView.a(c, i, MediaView.b(c), this);
    }

    public final void c()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        njt njt;
        njt = b;
        b.u();
        njt.r();
        if (((nxb) (njt)).n != this || ((nxb) (njt)).o != null && (((nxb) (njt)).o == null || !((nxb) (njt)).o.equals(null))) goto _L4; else goto _L3
_L3:
        njt.n = null;
        njt.o = null;
        ((nxb) (njt)).f.b(njt);
_L6:
        b = null;
_L2:
        if (MediaView.c(c))
        {
            MediaView.b(c, false);
            c.invalidate();
        }
        MediaView.a(c, false);
        MediaView.d(c);
        return;
_L4:
        int i;
        int j;
        if (((nxb) (njt)).p == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = ((nxb) (njt)).p.size();
        i = 0;
_L7:
label0:
        {
            if (i < j)
            {
                if (!((nxc)((nxb) (njt)).p.get(i)).a(this, null))
                {
                    break label0;
                }
                ((nxb) (njt)).p.remove(i);
            }
            if (((nxb) (njt)).p.isEmpty())
            {
                ((nxb) (njt)).f.b(njt);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
        if (true) goto _L6; else goto _L8
_L8:
    }
}
