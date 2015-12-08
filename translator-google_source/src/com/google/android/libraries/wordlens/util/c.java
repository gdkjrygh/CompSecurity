// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.util;

import android.graphics.Paint;

// Referenced classes of package com.google.android.libraries.wordlens.util:
//            AndroidFontRenderer

final class c extends ThreadLocal
{

    c()
    {
    }

    protected final Object initialValue()
    {
        return ((Paint)AndroidFontRenderer.access$200().get()).getFontMetrics();
    }
}
