// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.ArrayList;

public class cn
    implements ds
{

    public static final int A = 0x7f0900f9;
    public static final int B = 0x7f0900f8;
    public static final int C = 0x7f0900f7;
    public static final int D = 0x7f090097;
    public static final int E = 0x7f090098;
    public static final int F = 0x7f090434;
    public static final int G = 0x7f090432;
    public static final int H = 0x7f090406;
    public static final int I = 0x7f090389;
    public static final int J = 0x7f0901bc;
    public static final int K = 0x7f09017d;
    public static final int L = 0x7f0900bd;
    public static final int M = 0x7f0903bd;
    public static final int N = 0x7f090170;
    public static final int O = 0x7f090278;
    public static final int P = 0x7f09022c;
    public static final int Q = 0x7f0901b2;
    public static final int R = 0x7f090233;
    public static final int S = 0x7f09022f;
    public static final int T = 0x7f0903c1;
    public static final int U = 0x7f090171;
    public static final int V = 0x7f0903bc;
    public static final int x = 0x7f09043b;
    public static final int y = 0x7f0901bf;
    public static final int z = 0x7f0901be;
    public Context a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public Bitmap e;
    public CharSequence f;
    public int g;
    boolean h;
    public cy i;
    public CharSequence j;
    int k;
    int l;
    boolean m;
    public String n;
    public boolean o;
    public ArrayList p;
    boolean q;
    public String r;
    public int s;
    public int t;
    public Notification u;
    public Notification v;
    public ArrayList w;

    cn()
    {
    }

    public cn(Context context)
    {
        h = true;
        p = new ArrayList();
        q = false;
        s = 0;
        t = 0;
        v = new Notification();
        a = context;
        v.when = System.currentTimeMillis();
        v.audioStreamType = -1;
        g = 0;
        w = new ArrayList();
    }

    protected static CharSequence f(CharSequence charsequence)
    {
        while (charsequence == null || charsequence.length() <= 5120) 
        {
            return charsequence;
        }
        return charsequence.subSequence(0, 5120);
    }

    public final Notification a()
    {
        return cj.a().a(this, new co());
    }

    public final cn a(int i1)
    {
        v.icon = i1;
        return this;
    }

    public final cn a(int i1, int j1, boolean flag)
    {
        k = i1;
        l = j1;
        m = flag;
        return this;
    }

    public final cn a(long l1)
    {
        v.when = l1;
        return this;
    }

    public final cn a(PendingIntent pendingintent)
    {
        v.deleteIntent = pendingintent;
        return this;
    }

    public final cn a(Uri uri)
    {
        v.sound = uri;
        v.audioStreamType = -1;
        return this;
    }

    public final cn a(cy cy1)
    {
        if (i != cy1)
        {
            i = cy1;
            if (i != null)
            {
                cy1 = i;
                if (cy1.b != this)
                {
                    cy1.b = this;
                    if (cy1.b != null)
                    {
                        cy1.b.a(cy1);
                    }
                }
            }
        }
        return this;
    }

    public final cn a(CharSequence charsequence)
    {
        b = f(charsequence);
        return this;
    }

    public void a_(int i1, boolean flag)
    {
        if (flag)
        {
            Notification notification = v;
            notification.flags = notification.flags | i1;
            return;
        } else
        {
            Notification notification1 = v;
            notification1.flags = notification1.flags & ~i1;
            return;
        }
    }

    public final cn b(int i1)
    {
        v.defaults = i1;
        if ((i1 & 4) != 0)
        {
            Notification notification = v;
            notification.flags = notification.flags | 1;
        }
        return this;
    }

    public final cn b(CharSequence charsequence)
    {
        c = f(charsequence);
        return this;
    }

    public final cn c(CharSequence charsequence)
    {
        j = f(charsequence);
        return this;
    }

    public final cn d(CharSequence charsequence)
    {
        f = f(charsequence);
        return this;
    }

    public final cn e(CharSequence charsequence)
    {
        v.tickerText = f(charsequence);
        return this;
    }
}
