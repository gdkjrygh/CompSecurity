// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity

final class nit> extends com.skype.android.app.data.
{

    final onCreateViewHolder this$1;
    final Context val$context;
    final CallForwardingActivity val$this$0;

    protected final int getItemId(com.skype.android.util.ty.a._cls1 _pcls1)
    {
        return _pcls1._fld1;
    }

    protected final volatile int getItemId(Object obj)
    {
        return getItemId((com.skype.android.util.ty.a._cls1.getItemId)obj);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(val$context).inflate(0x7f03002c, viewgroup, false);
    }

    protected final val.context onCreateViewHolder(View view)
    {
        return new nit>(_fld0, view);
    }

    protected final volatile com.skype.android.app.data.._cls1 onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    ()
    {
        this$1 = final_;
        val$this$0 = callforwardingactivity;
        val$context = Context.this;
        super();
    }
}
