// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.contacts;

import android.view.View;
import android.widget.Button;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.pinterest.activity.contacts:
//            UploadContactsFragment

final class val.target extends DebouncingOnClickListener
{

    final UploadContactsFragment val$target;

    public final void doClick(View view)
    {
        val$target.onCancelClick((Button)view);
    }

    ()
    {
        val$target = uploadcontactsfragment;
        super();
    }
}
