// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import p.df.a;

// Referenced classes of package p.bx:
//            a, c

class .Object
    implements p.bx.a
{

    final Activity a;
    final pp.Activity b;
    final c c;

    public void a()
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharingInternal() : EnablePublicProfileListener.onEnabled() --> enableFaceookAutoSharingInternal(...)");
        p.bx.c.a(c, a, b);
    }

    public void b()
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharing() : enableFaceookAutoSharingInternal.onDeclined() --> user chose to keep profile private");
        b.b();
    }

    ty(c c1, Activity activity, ty ty)
    {
        c = c1;
        a = activity;
        b = ty;
        super();
    }
}
