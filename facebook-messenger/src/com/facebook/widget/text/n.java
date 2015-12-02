// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.text;


// Referenced classes of package com.facebook.widget.text:
//            m

class n
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public boolean onPreDraw()
    {
        return m.a(a);
    }
}
