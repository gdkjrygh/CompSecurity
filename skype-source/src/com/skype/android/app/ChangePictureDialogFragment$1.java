// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Referenced classes of package com.skype.android.app:
//            ChangePictureDialogFragment

final class this._cls0 extends ArrayAdapter
{

    final ChangePictureDialogFragment this$0;

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        return (TextView)super.getView(i, view, viewgroup);
    }

    _cls9(Context context, int i)
    {
        this$0 = ChangePictureDialogFragment.this;
        super(context, i);
    }
}
