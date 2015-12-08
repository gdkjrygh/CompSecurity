// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.view.accessibility.AccessibilityManager;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore

class this._cls0 extends ContentObserver
{

    final ContentViewCore this$0;

    public void onChange(boolean flag, Uri uri)
    {
        setAccessibilityState(ContentViewCore.access$2200(ContentViewCore.this).isEnabled());
    }

    (Handler handler)
    {
        this$0 = ContentViewCore.this;
        super(handler);
    }
}
