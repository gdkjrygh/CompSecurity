// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Parcelable;
import android.text.style.URLSpan;
import com.facebook.messages.model.share.Share;

// Referenced classes of package com.facebook.orca.threadview:
//            ad

public interface r
{

    public abstract void a(Share share);

    public abstract void a(ad ad);

    public abstract void a(ad ad, Parcelable parcelable);

    public abstract boolean a(URLSpan urlspan);

    public abstract boolean b(ad ad);

    public abstract void c(ad ad);
}
