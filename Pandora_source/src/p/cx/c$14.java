// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.os.AsyncTask;
import com.pandora.radio.provider.i;
import p.cw.c;
import p.dn.b;

// Referenced classes of package p.cx:
//            c

class .AsyncTask extends AsyncTask
{

    final b a;
    final p.cx.c b;

    protected transient Void a(Void avoid[])
    {
        if (p.cx.c.c(b).y().d()) goto _L2; else goto _L1
_L1:
        c.a(b, 5);
_L4:
        return null;
_L2:
        if (b.d == null && com.pandora.radio.util.i.b() == null)
        {
            p.cx.c.b(b, 6);
        } else
        if (a.h() || c.d(b).p() || c.d(b).n())
        {
            p.cx.c.c(b, 2);
            if (a.h() && b.d == null)
            {
                c.a(b, true);
            }
            if (a.h())
            {
                c.e(b);
            }
        } else
        {
            c.d(b, 1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void a(Void void1)
    {
        b.d();
        b.T();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Void)obj);
    }

    Object(p.cx.c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }
}
