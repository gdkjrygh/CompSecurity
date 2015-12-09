// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class this._cls0
    implements Runnable
{

    final AppCompatDelegateImplV7 this$0;

    public final void run()
    {
        if ((mInvalidatePanelMenuFeatures & 1) != 0)
        {
            AppCompatDelegateImplV7.access$100(AppCompatDelegateImplV7.this, 0);
        }
        if ((mInvalidatePanelMenuFeatures & 0x100) != 0)
        {
            AppCompatDelegateImplV7.access$100(AppCompatDelegateImplV7.this, 8);
        }
        mInvalidatePanelMenuPosted = false;
        mInvalidatePanelMenuFeatures = 0;
    }

    ()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
