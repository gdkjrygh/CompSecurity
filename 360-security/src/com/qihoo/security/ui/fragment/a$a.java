// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

// Referenced classes of package com.qihoo.security.ui.fragment:
//            a

static final class tantiate
{

    private final String a;
    private final Fragment b;

    static String a(tantiate tantiate)
    {
        return tantiate.b();
    }

    private String b()
    {
        return a;
    }

    public Fragment a()
    {
        return b;
    }

    (Context context, String s, Class class1, Bundle bundle)
    {
        a = s;
        b = Fragment.instantiate(context, class1.getName(), bundle);
    }
}
