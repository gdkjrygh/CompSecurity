// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;


// Referenced classes of package com.qihoo.security.ui.result.view:
//            ResultScrollView

class a
    implements Runnable
{

    final ResultScrollView a;

    public void run()
    {
        a.smoothScrollTo(0, ResultScrollView.a(a));
    }

    (ResultScrollView resultscrollview)
    {
        a = resultscrollview;
        super();
    }
}
