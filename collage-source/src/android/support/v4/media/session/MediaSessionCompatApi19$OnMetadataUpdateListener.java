// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.Rating;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi19

static class mCallback
    implements android.media.dataUpdateListener
{

    protected final mCallback mCallback;

    public void onMetadataUpdate(int i, Object obj)
    {
        if (i == 0x10000001 && (obj instanceof Rating))
        {
            mCallback.mCallback(obj);
        }
    }

    public ( )
    {
        mCallback = ;
    }
}
