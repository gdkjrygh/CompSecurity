// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;


// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView

final class a
    implements Runnable
{

    private Throwable a;
    private SnapEditorView b;

    public final void run()
    {
        SnapEditorView.a(b, SnapEditorView.g(b), SnapEditorView.h(b), a.toString());
    }

    (SnapEditorView snapeditorview, Throwable throwable)
    {
        b = snapeditorview;
        a = throwable;
        super();
    }
}
