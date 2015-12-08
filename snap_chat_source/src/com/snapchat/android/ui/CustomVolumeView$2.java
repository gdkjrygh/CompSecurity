// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.ObjectAnimator;

// Referenced classes of package com.snapchat.android.ui:
//            CustomVolumeView

final class a
    implements Runnable
{

    private CustomVolumeView a;

    public final void run()
    {
        CustomVolumeView.a(a).start();
    }

    (CustomVolumeView customvolumeview)
    {
        a = customvolumeview;
        super();
    }
}
