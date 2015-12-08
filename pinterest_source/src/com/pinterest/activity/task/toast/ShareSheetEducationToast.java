// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.toast;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.toast.view.ToastContainer;
import com.pinterest.activity.web.WebViewActivity;
import com.pinterest.api.remote.ExperiencesApi;
import com.pinterest.experience.DisplayData;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.kit.application.Resources;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.task.toast:
//            BaseToast

public class ShareSheetEducationToast extends BaseToast
{

    private ExperienceValue _exp;

    public ShareSheetEducationToast(ExperienceValue experiencevalue)
    {
        _exp = experiencevalue;
    }

    public static void goWebView(Context context, Uri uri, String s)
    {
        Intent intent = new Intent(context, com/pinterest/activity/web/WebViewActivity);
        intent.setData(uri);
        intent.putExtra("com.pinterest.EXTRA_HAS_URL", true);
        intent.putExtra("com.pinterest.EXTRA_ALLOW_REDIRECT_BACK", true);
        if (!StringUtils.isEmpty(s))
        {
            intent.putExtra("com.pinterest.EXTRA_WEB_TITLE_STRING", s);
        }
        context.startActivity(intent);
    }

    public View getView(ToastContainer toastcontainer)
    {
        if (_exp.f instanceof DisplayData)
        {
            DisplayData displaydata = (DisplayData)_exp.f;
            setMessage(displaydata.j);
            setSecondaryMessage(displaydata.k);
        }
        setButtonDrawable(0x7f0201d5);
        setButtonBackgroundResource(0x7f02009b);
        setLayoutGravity(81);
        setDuration(7000);
        ExperiencesApi.b(_exp.d);
        return super.getView(toastcontainer);
    }

    public void onToastCancelled(Context context)
    {
        super.onToastCancelled(context);
        if (_exp != null)
        {
            _exp.b();
        }
    }

    public void onToastClicked(Context context)
    {
        goWebView(context, ActivityHelper.getValidUri(Resources.string(0x7f07074d)), Resources.string(0x7f070520));
        if (_exp != null)
        {
            _exp.b();
        }
    }

    public void onToastCompleted(Context context)
    {
        super.onToastCompleted(context);
        if (_exp != null)
        {
            _exp.b();
        }
    }
}
