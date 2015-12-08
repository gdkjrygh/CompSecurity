// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.base;

import android.view.View;

public interface ViewAndroidDelegate
{

    public abstract View acquireAnchorView();

    public abstract void releaseAnchorView(View view);

    public abstract void setAnchorViewPosition(View view, float f, float f1, float f2, float f3);
}
