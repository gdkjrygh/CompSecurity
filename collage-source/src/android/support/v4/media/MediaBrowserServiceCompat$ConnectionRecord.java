// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import java.util.HashSet;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserServiceCompat, IMediaBrowserServiceCompatCallbacks

private class <init>
{

    IMediaBrowserServiceCompatCallbacks callbacks;
    String pkg;
    <init> root;
    Bundle rootHints;
    HashSet subscriptions;
    final MediaBrowserServiceCompat this$0;

    private I()
    {
        this$0 = MediaBrowserServiceCompat.this;
        super();
        subscriptions = new HashSet();
    }

    subscriptions(subscriptions subscriptions1)
    {
        this();
    }
}
