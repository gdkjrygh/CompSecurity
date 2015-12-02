// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import android.os.Bundle;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.orca.threads.FolderName;

// Referenced classes of package com.facebook.orca.l:
//            v, a

class l
    implements v
{

    final Bundle a;
    final OperationType b;
    final e c;
    final a d;

    l(a a1, Bundle bundle, OperationType operationtype, e e1)
    {
        d = a1;
        a = bundle;
        b = operationtype;
        c = e1;
        super();
    }

    public OperationResult a(FolderName foldername)
    {
        Bundle bundle = (Bundle)a.clone();
        bundle.putParcelable("folderName", foldername);
        foldername = new ad(b, bundle);
        return c.a(foldername);
    }
}
