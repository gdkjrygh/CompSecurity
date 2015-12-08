// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.experience;

import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.experience:
//            SurveyHelper

final class ialog
    implements com.pinterest.activity.task.dialog.smissListener
{

    public final void onDismiss(BaseDialog basedialog)
    {
        SurveyHelper.a();
    }

    ialog()
    {
    }
}
