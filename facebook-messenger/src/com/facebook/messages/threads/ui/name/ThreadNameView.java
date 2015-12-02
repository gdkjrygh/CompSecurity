// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.threads.ui.name;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.facebook.inject.t;
import com.facebook.q;
import com.facebook.widget.text.l;
import com.facebook.widget.text.m;

// Referenced classes of package com.facebook.messages.threads.ui.name:
//            d, e, DefaultThreadNameViewComputer, NamesOnlyThreadNameViewComputer

public class ThreadNameView extends m
{

    private e a;

    public ThreadNameView(Context context)
    {
        super(context);
        a(context, null);
    }

    public ThreadNameView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public ThreadNameView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context, attributeset);
    }

    private void a(Context context, AttributeSet attributeset)
    {
        context = getContext().obtainStyledAttributes(attributeset, q.ThreadNameView);
        int i = context.getInteger(q.ThreadNameView_nameOption, d.access$000(d.USE_THREAD_NAME_IF_AVAILABLE));
        context.recycle();
        context = t.a(getContext());
        if (i == d.access$000(d.USE_THREAD_NAME_IF_AVAILABLE))
        {
            a = (e)context.a(com/facebook/messages/threads/ui/name/e, com/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer);
            return;
        }
        if (i == d.access$000(d.USE_PARTICIPANTS_NAMES_ONLY))
        {
            a = (e)context.a(com/facebook/messages/threads/ui/name/e, com/facebook/messages/threads/ui/name/NamesOnlyThreadNameViewComputer);
            return;
        } else
        {
            a = (e)context.a(com/facebook/messages/threads/ui/name/e, com/facebook/messages/threads/ui/name/DefaultThreadNameViewComputer);
            return;
        }
    }

    protected l getVariableTextLayoutComputer()
    {
        return a;
    }
}
