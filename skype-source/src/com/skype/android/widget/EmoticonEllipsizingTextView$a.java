// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.view.ViewTreeObserver;

// Referenced classes of package com.skype.android.widget:
//            EmoticonEllipsizingTextView

private final class <init>
    implements android.view.ener
{

    final EmoticonEllipsizingTextView a;

    public final boolean onPreDraw()
    {
        a.getViewTreeObserver().removeOnPreDrawListener(this);
        EmoticonEllipsizingTextView.a(a, a.getLayout());
        return true;
    }

    private (EmoticonEllipsizingTextView emoticonellipsizingtextview)
    {
        a = emoticonellipsizingtextview;
        super();
    }

    a(EmoticonEllipsizingTextView emoticonellipsizingtextview, byte byte0)
    {
        this(emoticonellipsizingtextview);
    }
}
