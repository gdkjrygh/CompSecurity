// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;


// Referenced classes of package com.google.android.apps.translate.widget:
//            SizeListeningView, au

final class at
    implements Runnable
{

    final int a;
    final int b;
    final int c;
    final int d;
    final SizeListeningView e;

    at(SizeListeningView sizelisteningview, int i, int j, int k, int l)
    {
        e = sizelisteningview;
        a = i;
        b = j;
        c = k;
        d = l;
        super();
    }

    public final void run()
    {
        if (SizeListeningView.a(e) != null)
        {
            SizeListeningView.a(e).a(a, b);
        }
    }
}
