// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

class this._cls0
    implements Runnable
{

    final AppCompatDelegateImplV7 this$0;

    public void run()
    {
        if ((AppCompatDelegateImplV7.access$000(AppCompatDelegateImplV7.this) & 1) != 0)
        {
            AppCompatDelegateImplV7.access$100(AppCompatDelegateImplV7.this, 0);
        }
        if ((AppCompatDelegateImplV7.access$000(AppCompatDelegateImplV7.this) & 0x1000) != 0)
        {
            AppCompatDelegateImplV7.access$100(AppCompatDelegateImplV7.this, 108);
        }
        AppCompatDelegateImplV7.access$202(AppCompatDelegateImplV7.this, false);
        AppCompatDelegateImplV7.access$002(AppCompatDelegateImplV7.this, 0);
    }

    ()
    {
        this$0 = AppCompatDelegateImplV7.this;
        super();
    }
}
