// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skype.android.app.data.DataAdapter;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity

final class _cls1.onCreateViewHolder extends DataAdapter
{

    private final Context context;
    private ArrayList list;
    final CallForwardingActivity this$0;

    public final List getList()
    {
        return list;
    }

    public <init>(final Context context, int i, ArrayList arraylist)
    {
        this.this$0 = CallForwardingActivity.this;
        super();
        this.context = context;
        list = arraylist;
        setItemViewAdapter(0, new com.skype.android.app.data.DataAdapter.ItemViewAdapter() {

            final CallForwardingActivity.a this$1;
            final Context val$context;
            final CallForwardingActivity val$this$0;

            protected final int getItemId(com.skype.android.util.CallForwarding.Number number)
            {
                return number.a;
            }

            protected final volatile int getItemId(Object obj)
            {
                return getItemId((com.skype.android.util.CallForwarding.Number)obj);
            }

            protected final View onCreateView(ViewGroup viewgroup)
            {
                return LayoutInflater.from(context).inflate(0x7f03002c, viewgroup, false);
            }

            protected final CallForwardingActivity.b onCreateViewHolder(View view)
            {
                return new CallForwardingActivity.b(CallForwardingActivity.a.this.this$0, view);
            }

            protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
            {
                return onCreateViewHolder(view);
            }

            
            {
                this$1 = CallForwardingActivity.a.this;
                this$0 = callforwardingactivity;
                context = context1;
                super();
            }
        });
    }
}
