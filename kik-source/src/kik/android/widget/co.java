// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            cn, KikNetworkedImageView

final class co
    implements Runnable
{

    final com.kik.cache.ad.c a;
    final cn b;

    co(cn cn1, com.kik.cache.ad.c c)
    {
        b = cn1;
        a = c;
        super();
    }

    public final void run()
    {
        KikNetworkedImageView.a(b.b, a, false);
    }
}
