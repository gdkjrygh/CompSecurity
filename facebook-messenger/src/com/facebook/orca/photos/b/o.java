// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.abtest.qe.f.b;
import com.facebook.auth.userscope.UserScoped;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsNewPhotoUploadEnabled;
import com.facebook.orca.annotations.MessengerImageResizer;

// Referenced classes of package com.facebook.orca.photos.b:
//            g, f, k, v, 
//            h, q, ab, u, 
//            aa, s, x, t, 
//            d, a, r

public class o extends c
{

    public o()
    {
    }

    protected void a()
    {
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsNewPhotoUploadEnabled).c(com/facebook/orca/photos/b/g);
        a(com/facebook/j/a/a/a).a(com/facebook/orca/annotations/MessengerImageResizer).c(com/facebook/orca/photos/b/f);
        a(com/facebook/orca/photos/b/k).a(new v(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/photos/b/h).a(new q(this, null)).a();
        a(com/facebook/orca/photos/b/ab).a(new u(this, null)).a();
        a(com/facebook/orca/photos/b/aa).a(new s(this, null)).a();
        a(com/facebook/orca/photos/b/x).a(new t(this, null));
        c(com/facebook/abtest/qe/f/b).a(com/facebook/orca/photos/b/d);
        a(com/facebook/orca/photos/b/a).a(new r(this, null)).a();
    }
}
