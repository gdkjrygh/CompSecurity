// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.actions;

import android.support.v4.util.Pair;

// Referenced classes of package com.pinterest.ui.actions:
//            ScrollableListener

public interface Scrollable
{

    public abstract Pair getScrollPosition();

    public abstract void scrollTo(int i, int j);

    public abstract void setScrollListener(ScrollableListener scrollablelistener);
}
