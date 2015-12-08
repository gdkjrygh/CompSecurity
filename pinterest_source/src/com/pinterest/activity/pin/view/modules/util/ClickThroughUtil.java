// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.view.modules.util;

import android.util.Pair;
import com.google.gson.JsonPrimitive;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.SiteApi;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import org.apache.commons.lang3.StringUtils;

public class ClickThroughUtil
{

    public ClickThroughUtil()
    {
    }

    public static void gotoPinLink(String s, Pin pin, String s1)
    {
        gotoPinLink(s, pin, s1, null, false);
    }

    public static void gotoPinLink(String s, Pin pin, String s1, Pair pair, boolean flag)
    {
        if (StringUtils.isEmpty(s))
        {
            StopWatch.get().invalidate("clickthrough_verify");
            return;
        } else
        {
            SiteApi.a(s, pin, new _cls1(pair), s1);
            return;
        }
    }

    private static void gotoVerifiedLink(String s, Pin pin, String s1, Pair pair)
    {
        if (!ModelHelper.isValid(s))
        {
            return;
        }
        Navigation navigation = new Navigation(Location.BROWSER, s);
        if (pin != null)
        {
            navigation.putExtra("Referer", pin.getPinterestLink());
            navigation.putExtra("CLOSEUP_PIN_ID", pin.getUid());
        }
        navigation.putExtra("com.pinterest.EXTRA_WEBPAGE_PINNABLE", Boolean.valueOf(true));
        if (pair != null)
        {
            navigation.putExtra((String)pair.first, pair.second);
        }
        Events.post(navigation);
        pair = StopWatch.get().start("webview_pageload");
        if (pin != null)
        {
            pin = pin.getUid();
        } else
        {
            pin = "";
        }
        pair.putAuxData("webview_pageload", "pin_uid", new JsonPrimitive(pin)).putAuxData("webview_pageload", "url", new JsonPrimitive(s)).putAuxData("webview_pageload", "clickthrough_uuid", new JsonPrimitive(s1));
    }


    private class _cls1 extends ApiResponseHandler
    {

        final Pair val$extra;
        final boolean val$fromRepin;
        final String val$link;
        final Pin val$pin;

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            if (pin != null && !fromRepin)
            {
                Pinalytics.a(EventType.PIN_CLICKTHROUGH, pin.getUid());
            }
            StopWatch.get().complete("clickthrough_verify");
            final String clickThroughUid = (PinterestJsonObject)apiresponse.getData();
            String s = clickThroughUid.a("redirect_status", "");
            final Object url = clickThroughUid.a("url", link);
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

                    final _cls1 this$0;
                    final String val$clickThroughUid;
                    final String val$url;

                    public void onClick(View view)
                    {
                        ClickThroughUtil.gotoVerifiedLink(url, pin, clickThroughUid, extra);
                    }

                _cls1()
                {
                    this$0 = _cls1.this;
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
                ClickThroughUtil.gotoVerifiedLink(((String) (url)), pin, clickThroughUid, extra);
                return;
            }
        }

        _cls1(Pair pair)
        {
            pin = pin1;
            fromRepin = flag1;
            link = s;
            extra = pair;
            super(final_flag);
        }
    }

}
