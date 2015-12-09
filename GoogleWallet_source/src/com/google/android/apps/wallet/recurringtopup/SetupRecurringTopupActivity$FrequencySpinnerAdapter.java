// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            SetupRecurringTopupActivity

final class setDropDownViewResource extends ArrayAdapter
{

    final SetupRecurringTopupActivity this$0;

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getDropDownView(i, view, viewgroup);
        view.setText(((setDropDownViewResource)getItem(i)).getItem());
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getView(i, view, viewgroup);
        view.setText(((getItem)getItem(i)).getItem());
        return view;
    }

    public ()
    {
        this$0 = SetupRecurringTopupActivity.this;
        super(SetupRecurringTopupActivity.this, 0x1090008, com.google.android.apps.wallet.recurringtopup.this._mth0());
        setDropDownViewResource(0x1090009);
    }
}
