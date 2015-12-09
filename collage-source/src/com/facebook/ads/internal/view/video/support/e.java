// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video.support;

import android.net.Uri;
import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view.video.support:
//            b

interface e
{

    public abstract void a(View view, Uri uri);

    public abstract int getCurrentPosition();

    public abstract void pause();

    public abstract void setFrameVideoViewListener(b b);

    public abstract void start();
}
