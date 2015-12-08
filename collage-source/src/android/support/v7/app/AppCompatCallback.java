// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.view.ActionMode;

public interface AppCompatCallback
{

    public abstract void onSupportActionModeFinished(ActionMode actionmode);

    public abstract void onSupportActionModeStarted(ActionMode actionmode);

    public abstract ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback);
}
