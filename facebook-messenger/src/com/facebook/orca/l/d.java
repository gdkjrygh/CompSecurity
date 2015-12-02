// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.l:
//            v, a

class d
    implements v
{

    final ad a;
    final e b;
    final a c;

    d(a a1, ad ad, e e)
    {
        c = a1;
        a = ad;
        b = e;
        super();
    }

    public OperationResult a(FolderName foldername)
    {
        return com.facebook.orca.l.a.a(c, a, foldername, b);
    }
}
