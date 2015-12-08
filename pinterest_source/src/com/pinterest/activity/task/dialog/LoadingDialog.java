// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

public class LoadingDialog extends BaseDialog
{

    public static final String KEY = "loading";
    private String _waitText;

    public LoadingDialog()
    {
        this(0x7f070342);
    }

    public LoadingDialog(int i)
    {
        this(Resources.string(i));
    }

    public LoadingDialog(String s)
    {
        _key = "loading";
        _waitText = s;
    }

    public String getWaitText()
    {
        return _waitText;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = LayoutInflater.from(getActivity()).inflate(0x7f030097, null);
        ((TextView)bundle.findViewById(0x7f0f01ab)).setText(_waitText);
        setContent(bundle, 0);
        getDialog().setCanceledOnTouchOutside(false);
    }

    public void setWaitText(String s)
    {
        _waitText = s;
        s = getView();
        if (s != null)
        {
            s = (TextView)s.findViewById(0x7f0f01ab);
            if (s != null)
            {
                s.setText(_waitText);
            }
        }
    }
}
