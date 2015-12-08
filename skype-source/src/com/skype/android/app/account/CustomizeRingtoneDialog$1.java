// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app.account:
//            CustomizeRingtoneDialog

final class this._cls0 extends ArrayAdapter
{

    final CustomizeRingtoneDialog this$0;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return (TextView)super.getView(i, view, viewgroup);
    }

    (Context context, int i)
    {
        this$0 = CustomizeRingtoneDialog.this;
        super(context, i);
    }
}
