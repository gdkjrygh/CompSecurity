// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;


class mCallback
    implements android.media.tionUpdateListener
{

    protected final mCallback mCallback;

    public void onPlaybackPositionUpdate(long l)
    {
        mCallback.mCallback(l);
    }

    public ( )
    {
        mCallback = ;
    }
}
