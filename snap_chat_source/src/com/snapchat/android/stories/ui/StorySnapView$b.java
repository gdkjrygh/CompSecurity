// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;


// Referenced classes of package com.snapchat.android.stories.ui:
//            StorySnapView

final class <init>
    implements Runnable
{

    private StorySnapView a;

    public final void run()
    {
        StorySnapView.f(a);
        a.c();
    }

    private (StorySnapView storysnapview)
    {
        a = storysnapview;
        super();
    }

    a(StorySnapView storysnapview, byte byte0)
    {
        this(storysnapview);
    }
}
