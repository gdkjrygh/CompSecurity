// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.help;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.translate.help:
//            i

final class h extends BitmapDrawable
{

    final WeakReference a;

    public h(Resources resources, i i)
    {
        super(resources, null);
        a = new WeakReference(i);
    }
}
