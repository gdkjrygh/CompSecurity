// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi23

static class <init> extends <init>
{

    public void onPlayFromUri(Uri uri, Bundle bundle)
    {
        ((<init>)mCallback).yFromUri(uri, bundle);
    }

    public ( )
    {
        super();
    }
}
