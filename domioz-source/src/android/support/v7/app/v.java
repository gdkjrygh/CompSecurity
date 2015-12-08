// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.Rect;
import android.support.v7.internal.widget.ad;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class v
    implements ad
{

    final AppCompatDelegateImplV7 a;

    v(AppCompatDelegateImplV7 appcompatdelegateimplv7)
    {
        a = appcompatdelegateimplv7;
        super();
    }

    public final void a(Rect rect)
    {
        rect.top = AppCompatDelegateImplV7.b(a, rect.top);
    }
}
