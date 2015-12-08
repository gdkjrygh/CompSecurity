// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            SelectActionModeCallback

public static interface I
{

    public abstract void copy();

    public abstract void cut();

    public abstract boolean isSelectionEditable();

    public abstract boolean isSelectionPassword();

    public abstract boolean isShareAvailable();

    public abstract boolean isWebSearchAvailable();

    public abstract void onDestroyActionMode();

    public abstract void paste();

    public abstract void search();

    public abstract void selectAll();

    public abstract void share();
}
