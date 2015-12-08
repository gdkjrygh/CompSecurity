// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class ExplicitConfirmDialog extends BaseDialog
{

    private String _checkBox;
    private OnClickListener _onClickListener;

    public ExplicitConfirmDialog()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setContent(LayoutInflater.from(getActivity()).inflate(0x7f030069, null));
    }

    public void setCheckBox(String s)
    {
        _checkBox = s;
    }

    public void setOnClickListener(OnClickListener onclicklistener)
    {
        _onClickListener = onclicklistener;
    }
}
