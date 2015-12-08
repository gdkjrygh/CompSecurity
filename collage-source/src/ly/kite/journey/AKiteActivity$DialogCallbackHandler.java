// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.journey;

import android.content.DialogInterface;

// Referenced classes of package ly.kite.journey:
//            AKiteActivity

private class mNegativeRunnable
    implements android.content.mNegativeRunnable, android.content.mNegativeRunnable
{

    private Runnable mNegativeRunnable;
    private Runnable mPositiveRunnable;
    final AKiteActivity this$0;

    private void performNegativeAction()
    {
        if (mNegativeRunnable != null)
        {
            mNegativeRunnable.run();
        }
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        performNegativeAction();
        AKiteActivity.access$000(AKiteActivity.this);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        i;
        JVM INSTR tableswitch -2 -1: default 24
    //                   -2 51
    //                   -1 32;
           goto _L1 _L2 _L3
_L1:
        AKiteActivity.access$000(AKiteActivity.this);
        return;
_L3:
        if (mPositiveRunnable != null)
        {
            mPositiveRunnable.run();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        performNegativeAction();
        if (true) goto _L1; else goto _L4
_L4:
    }

    _cls9(Runnable runnable, Runnable runnable1)
    {
        this$0 = AKiteActivity.this;
        super();
        mPositiveRunnable = runnable;
        mNegativeRunnable = runnable1;
    }
}
