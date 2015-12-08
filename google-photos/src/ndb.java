// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.social.ingest.ui.MtpFullscreenView;
import com.google.android.libraries.social.ingest.ui.MtpImageView;

public final class ndb extends md
{

    private LayoutInflater b;
    private int c;
    private ncy d;
    private ndl e;
    private int f;
    private MtpFullscreenView g;

    public ndb(Context context, ncy ncy1)
    {
        c = 0;
        f = ndn.b;
        g = null;
        b = LayoutInflater.from(context);
        d = ncy1;
    }

    public final int a(int i)
    {
        if (e != null)
        {
            Object obj = e;
            int j = f;
            obj = ((ndl) (obj)).d;
            if (obj != null)
            {
                if (j == ndn.a)
                {
                    obj = ((ndr) (obj)).c[((ndr) (obj)).a[i]];
                    j = i;
                    if (((ndd) (obj)).b == i)
                    {
                        j = i + 1;
                    }
                    return (((ndd) (obj)).d + j) - 1 - ((ndd) (obj)).b;
                }
                j = ((ndr) (obj)).a.length - 1 - i;
                ndd ndd1 = ((ndr) (obj)).c[((ndr) (obj)).a[j]];
                i = j;
                if (ndd1.c == j)
                {
                    i = j - 1;
                }
                return (((ndr) (obj)).b.length - 1 - ndd1.d - i) + ndd1.b;
            }
        }
        return -1;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        ndg ndg = null;
        MtpFullscreenView mtpfullscreenview;
        Object obj;
        int j;
        if (g != null)
        {
            mtpfullscreenview = g;
            g = null;
        } else
        {
            mtpfullscreenview = (MtpFullscreenView)b.inflate(b.FL, viewgroup, false);
        }
        obj = e;
        j = f;
        obj = ((ndl) (obj)).d;
        if (obj != null)
        {
            if (j == ndn.a)
            {
                ndg = ((ndr) (obj)).b[i];
            } else
            {
                ndg = ((ndr) (obj)).b[((ndr) (obj)).b.length - 1 - i];
            }
        }
        mtpfullscreenview.a.a(e.b(), ndg, c);
        mtpfullscreenview.a(i, d);
        viewgroup.addView(mtpfullscreenview);
        return mtpfullscreenview;
    }

    public final void a(ViewGroup viewgroup)
    {
        g = null;
        super.a(viewgroup);
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        obj = (MtpFullscreenView)obj;
        viewgroup.removeView(((View) (obj)));
        d.a(((ncz) (obj)));
        g = ((MtpFullscreenView) (obj));
    }

    public final void a(ndl ndl1)
    {
        e = ndl1;
        c();
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (e != null)
        {
            ndr ndr1 = e.d;
            i = ((flag) ? 1 : 0);
            if (ndr1 != null)
            {
                i = ndr1.b.length;
            }
        }
        return i;
    }

    public final void c()
    {
        c = c + 1;
        super.c();
    }
}
