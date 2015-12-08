// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.sso.service.operation;

import android.content.Context;
import android.os.Bundle;
import com.microsoft.onlineid.internal.m;
import com.microsoft.onlineid.internal.ui.AccountPickerActivity;
import com.microsoft.onlineid.sts.a;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.microsoft.onlineid.internal.sso.service.operation:
//            j, e

public final class c extends j
{

    public c(Context context, Bundle bundle, a a1, com.microsoft.onlineid.internal.f.a a2)
    {
        super(context, bundle, a1, a2);
    }

    public final Bundle a()
    {
        java.util.ArrayList arraylist = b().getStringArrayList("com.microsoft.onlineid.cid_exclusion_list");
        String s = b().getString("com.microsoft.onlineid.preferred_membername_type");
        String s1 = b().getString("com.microsoft.onlineid.cobranding_id");
        HashSet hashset = new HashSet();
        if (arraylist != null)
        {
            hashset.addAll(arraylist);
        }
        if (!j().a(hashset).isEmpty())
        {
            return com.microsoft.onlineid.internal.sso.a.a(a(AccountPickerActivity.a(i(), arraylist, s, s1, c(), f())).a(i()).a());
        } else
        {
            return (new e(i(), b(), j(), k())).a();
        }
    }
}
