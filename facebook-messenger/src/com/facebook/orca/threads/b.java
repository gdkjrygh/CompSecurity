// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threads;

import com.facebook.auth.viewercontext.e;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.threads:
//            FolderType, FolderName

public class b
    implements a
{

    private final a a;
    private final e b;

    public b(a a1, e e1)
    {
        a = a1;
        b = e1;
    }

    public FolderName a()
    {
        return com.facebook.orca.threads.FolderName.a((FolderType)a.b(), b.c());
    }

    public Object b()
    {
        return a();
    }
}
