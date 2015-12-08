// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;


// Referenced classes of package android.support.v4.app:
//            FragmentManagerImpl

final class val.id
    implements Runnable
{

    final FragmentManagerImpl this$0;
    final int val$flags = 1;
    final int val$id;

    public final void run()
    {
        FragmentManagerImpl fragmentmanagerimpl = FragmentManagerImpl.this;
        FragmentActivity fragmentactivity = mActivity;
        fragmentmanagerimpl.popBackStackState$68507953$44bd8ea3(val$id, val$flags);
    }

    ()
    {
        this$0 = final_fragmentmanagerimpl;
        val$id = i;
        super();
    }
}
