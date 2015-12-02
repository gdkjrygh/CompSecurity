// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.fragment;

import android.content.Intent;

// Referenced classes of package com.facebook.base.fragment:
//            c, NavigableFragmentController, b

class d
    implements c
{

    final NavigableFragmentController a;

    d(NavigableFragmentController navigablefragmentcontroller)
    {
        a = navigablefragmentcontroller;
        super();
    }

    public void a(b b, Intent intent)
    {
        NavigableFragmentController.a(a, b, intent);
    }
}
