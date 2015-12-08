// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package group.pals.android.lib.ui.lockpattern;

import group.pals.android.lib.ui.lockpattern.widget.LockPatternView;

// Referenced classes of package group.pals.android.lib.ui.lockpattern:
//            BaseLockPatternActivity

class this._cls0
    implements Runnable
{

    final BaseLockPatternActivity this$0;

    public void run()
    {
        mLockPatternView.clearPattern();
        BaseLockPatternActivity.access$100(BaseLockPatternActivity.this).onPatternCleared();
        mLockPatternView.setEnabled(true);
    }

    atternListener()
    {
        this$0 = BaseLockPatternActivity.this;
        super();
    }
}
