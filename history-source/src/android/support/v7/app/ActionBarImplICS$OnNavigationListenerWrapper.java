// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            ActionBarImplICS

static class mWrappedListener
    implements android.app.nerWrapper
{

    private final emSelected mWrappedListener;

    public boolean onNavigationItemSelected(int i, long l)
    {
        return mWrappedListener.emSelected(i, l);
    }

    public I(I i)
    {
        mWrappedListener = i;
    }
}
