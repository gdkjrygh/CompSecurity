// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import com.facebook.auth.annotations.LoggedInUserKey;
import com.facebook.auth.b.b;
import com.facebook.inject.d;
import com.facebook.orca.annotations.CurrentFolder;
import com.facebook.orca.f.ad;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.g;
import com.facebook.orca.threads.i;
import com.facebook.orca.threads.x;
import com.facebook.user.UserKey;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class di extends d
{

    final h a;

    private di(h h)
    {
        a = h;
        super();
    }

    di(h h, com.facebook.orca.app.i j)
    {
        this(h);
    }

    public ad a()
    {
        return new ad((b)a(com/facebook/auth/b/b), (i)a(com/facebook/orca/threads/i), (x)a(com/facebook/orca/threads/x), b(com/facebook/user/UserKey, com/facebook/auth/annotations/LoggedInUserKey), b(com/facebook/orca/threads/FolderName, com/facebook/orca/annotations/CurrentFolder), (g)a(com/facebook/orca/threads/g));
    }

    public Object b()
    {
        return a();
    }
}
