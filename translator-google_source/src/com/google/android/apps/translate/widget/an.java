// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.widget;


// Referenced classes of package com.google.android.apps.translate.widget:
//            PhrasebookView, SearchTextBox

final class an
    implements Runnable
{

    final PhrasebookView a;

    an(PhrasebookView phrasebookview)
    {
        a = phrasebookview;
        super();
    }

    public final void run()
    {
        PhrasebookView.c(a).a();
    }
}
