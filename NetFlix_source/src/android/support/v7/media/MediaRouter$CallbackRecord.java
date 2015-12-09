// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//            MediaRouter, MediaRouteSelector

private static final class mSelector
{

    public final mSelector mCallback;
    public int mFlags;
    public final MediaRouter mRouter;
    public MediaRouteSelector mSelector;

    public boolean filterRouteEvent(mSelector mselector)
    {
        return (mFlags & 2) != 0 || mselector.esSelector(mSelector);
    }

    public _cls9(MediaRouter mediarouter, _cls9 _pcls9)
    {
        mRouter = mediarouter;
        mCallback = _pcls9;
        mSelector = MediaRouteSelector.EMPTY;
    }
}
