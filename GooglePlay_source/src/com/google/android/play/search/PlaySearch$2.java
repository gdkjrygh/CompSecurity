// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;


// Referenced classes of package com.google.android.play.search:
//            PlaySearch, PlaySearchController

final class this._cls0
    implements Runnable
{

    final PlaySearch this$0;

    public final void run()
    {
        if (PlaySearch.access$000(PlaySearch.this) != null && !hasFocus())
        {
            PlaySearch.access$000(PlaySearch.this).switchToSteadyStateMode();
        }
    }

    troller()
    {
        this$0 = PlaySearch.this;
        super();
    }
}
