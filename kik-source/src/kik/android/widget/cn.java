// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import com.android.volley.w;

// Referenced classes of package kik.android.widget:
//            KikNetworkedImageView, co

final class cn
    implements com.kik.cache.ad.d
{

    final boolean a;
    final KikNetworkedImageView b;

    cn(KikNetworkedImageView kiknetworkedimageview, boolean flag)
    {
        b = kiknetworkedimageview;
        a = flag;
        super();
    }

    public final void a(w w)
    {
        if (KikNetworkedImageView.a(b) != 0)
        {
            b.setImageResource(KikNetworkedImageView.a(b));
        }
    }

    public final void a(com.kik.cache.ad.c c, boolean flag)
    {
        if (flag && a)
        {
            b.post(new co(this, c));
            return;
        }
        KikNetworkedImageView kiknetworkedimageview = b;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        KikNetworkedImageView.a(kiknetworkedimageview, c, flag);
    }
}
