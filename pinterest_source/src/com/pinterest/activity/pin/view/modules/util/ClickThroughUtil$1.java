// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.util.Pair;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.pin.view.modules.util:
//            ClickThroughUtil

final class val.extra extends ApiResponseHandler
{

    final Pair val$extra;
    final boolean val$fromRepin;
    final String val$link;
    final Pin val$pin;

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        if (val$pin != null && !val$fromRepin)
        {
            Pinalytics.a(EventType.PIN_CLICKTHROUGH, val$pin.getUid());
        }
        StopWatch.get().complete("clickthrough_verify");
        final String clickThroughUid = (PinterestJsonObject)apiresponse.getData();
        String s = clickThroughUid.a("redirect_status", "");
        final Object url = clickThroughUid.a("url", val$link);
        apiresponse = clickThroughUid.a("message", Resources.string(0x7f070419));
        clickThroughUid = clickThroughUid.a("clickthrough_uuid", "");
        if (s.equalsIgnoreCase("blocked"))
        {
            url = new BaseDialog();
            ((BaseDialog) (url)).setTitle(0x7f070564);
            ((BaseDialog) (url)).setMessage(apiresponse);
            ((BaseDialog) (url)).setPositiveButton(0x7f0703d2, null);
            Events.post(new DialogEvent(((BaseDialog) (url))));
            return;
        }
        if (s.equalsIgnoreCase("suspicious"))
        {
            BaseDialog basedialog = new BaseDialog();
            basedialog.setTitle(0x7f0705e7);
            basedialog.setMessage(apiresponse);
            basedialog.setNegativeButton(0x7f0700af, null);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final ClickThroughUtil._cls1 this$0;
                final String val$clickThroughUid;
                final String val$url;

                public void onClick(View view)
                {
                    ClickThroughUtil.access$000(super._fld1, pin, clickThroughUid, extra);
                }

            _cls1()
            {
                this$0 = ClickThroughUtil._cls1.this;
                url = s;
                clickThroughUid = s1;
                super();
            }
            }

            basedialog.setPositiveButton(0x7f070524, new _cls1());
            Events.post(new DialogEvent(basedialog));
            return;
        } else
        {
            ClickThroughUtil.access$000(((String) (url)), val$pin, clickThroughUid, val$extra);
            return;
        }
    }

    _cls1(Pair pair)
    {
        val$pin = pin1;
        val$fromRepin = flag1;
        val$link = s;
        val$extra = pair;
        super(final_flag);
    }
}
