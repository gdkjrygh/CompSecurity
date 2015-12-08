// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding;

import android.view.View;

// Referenced classes of package android.databinding:
//            ViewDataBinding

class this._cls0
    implements Runnable
{

    final ViewDataBinding this$0;

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        ViewDataBinding.access$202(ViewDataBinding.this, false);
        this;
        JVM INSTR monitorexit ;
        Exception exception;
        if (android.os.INT >= 19 && !ViewDataBinding.access$300(ViewDataBinding.this).isAttachedToWindow())
        {
            ViewDataBinding.access$300(ViewDataBinding.this).removeOnAttachStateChangeListener(ViewDataBinding.access$400());
            ViewDataBinding.access$300(ViewDataBinding.this).addOnAttachStateChangeListener(ViewDataBinding.access$400());
            return;
        } else
        {
            executePendingBindings();
            return;
        }
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = ViewDataBinding.this;
        super();
    }
}
