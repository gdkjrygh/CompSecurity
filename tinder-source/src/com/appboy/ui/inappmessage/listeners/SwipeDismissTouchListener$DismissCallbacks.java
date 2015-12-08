// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//            SwipeDismissTouchListener

public static interface 
{

    public abstract boolean canDismiss(Object obj);

    public abstract void onDismiss(View view, Object obj);
}
