// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.photos.allphotos.ui.AllPhotosBar;

public final class dsj
    implements hgo
{

    private final int a;
    private int b;
    private dsk c;

    public dsj(int i)
    {
        a = i;
    }

    public final int a()
    {
        return c.ch;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn)
    {
        int i;
        c = (dsk)afn;
        afn = dsk.a(c);
        i = a;
        dsh.a[i - 1];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 62
    //                   2 113;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalStateException("Unknown status");
_L2:
        ((AllPhotosBar) (afn)).a.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        ((AllPhotosBar) (afn)).a.setText(b.jc);
        ((AllPhotosBar) (afn)).b.setVisibility(0);
_L5:
        if (b > 0)
        {
            dsk.a(c).a(b);
        }
        return;
_L3:
        ((AllPhotosBar) (afn)).a.setCompoundDrawablesWithIntrinsicBounds(b.iZ, 0, 0, 0);
        ((AllPhotosBar) (afn)).a.setText(b.jb);
        if (((AllPhotosBar) (afn)).b.isIndeterminate())
        {
            ((AllPhotosBar) (afn)).b.setIndeterminate(false);
        }
        afn.b(100);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return 0x8000000000000000L;
    }

    public final void c(int i)
    {
        b = i;
        if (c != null)
        {
            dsk.a(c).a(b);
        }
    }
}
