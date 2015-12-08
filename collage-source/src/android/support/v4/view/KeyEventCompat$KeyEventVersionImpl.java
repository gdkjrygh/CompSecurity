// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            KeyEventCompat

static interface 
{

    public abstract boolean dispatch(KeyEvent keyevent, android.view.ersionImpl ersionimpl, Object obj, Object obj1);

    public abstract Object getKeyDispatcherState(View view);

    public abstract boolean isTracking(KeyEvent keyevent);

    public abstract boolean metaStateHasModifiers(int i, int j);

    public abstract boolean metaStateHasNoModifiers(int i);

    public abstract int normalizeMetaState(int i);

    public abstract void startTracking(KeyEvent keyevent);
}
