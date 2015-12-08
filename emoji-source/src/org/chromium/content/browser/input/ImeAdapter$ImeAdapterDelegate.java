// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser.input;

import android.os.ResultReceiver;
import android.view.View;

// Referenced classes of package org.chromium.content.browser.input:
//            ImeAdapter

public static interface 
{

    public abstract View getAttachedView();

    public abstract ResultReceiver getNewShowKeyboardReceiver();

    public abstract void onDismissInput();

    public abstract void onImeEvent();
}
