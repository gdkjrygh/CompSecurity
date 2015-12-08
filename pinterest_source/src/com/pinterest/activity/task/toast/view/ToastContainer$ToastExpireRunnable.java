// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast.view;

import android.util.SparseArray;
import android.view.View;

// Referenced classes of package com.pinterest.activity.task.toast.view:
//            ToastContainer

class v
    implements Runnable
{

    final ToastContainer this$0;
    private View v;

    public void run()
    {
        if (ToastContainer.access$200(ToastContainer.this, v))
        {
            ToastContainer.access$300(v);
        }
        ToastContainer.access$400(ToastContainer.this).delete(v.getId());
    }

    public (View view)
    {
        this$0 = ToastContainer.this;
        super();
        v = view;
    }
}
