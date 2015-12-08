// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.sts.a;
import com.microsoft.onlineid.sts.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j

public final class d extends j
{

    public d(Context context, Bundle bundle, a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = j().b().iterator(); iterator.hasNext(); arraylist.add(com.microsoft.onlineid.internal.sso.a.a((b)iterator.next()))) { }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("com.microsoft.onlineid.all_users", arraylist);
        return bundle;
    }
}
