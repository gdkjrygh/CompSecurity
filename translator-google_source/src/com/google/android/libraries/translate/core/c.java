// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.core;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

// Referenced classes of package com.google.android.libraries.translate.core:
//            k, Singleton

final class c extends k
{

    c()
    {
    }

    protected final Object a()
    {
        return (AccessibilityManager)Singleton.a().getSystemService("accessibility");
    }
}
