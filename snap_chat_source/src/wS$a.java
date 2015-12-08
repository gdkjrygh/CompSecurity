// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.CheckBox;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.analytics.ProfileEventAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.util.AlertDialogUtils;
import java.util.Set;

final class c
    implements android.view.OnClickListener
{

    private final Friend a;
    private final Set b;
    private final util.Set c;
    private wS d;

    public final void onClick(View view)
    {
        view = d.s.d();
        if (view != null && !d.s.l)
        {
            d.a(d.s.b(), view.length(), d.s.c());
            d.s.l = true;
        }
        d.m.setChecked(true);
        view = a.mPhoneNumber;
        String s = d.u.getString(0x7f080163, new Object[] {
            Bt.q()
        });
        Object obj = d.u;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((new StringBuilder("smsto:")).append(view).toString()));
        intent.putExtra("address", view);
        intent.putExtra("sms_body", s);
        intent.putExtra("android.intent.extra.TEXT", s);
        try
        {
            ((Context) (obj)).startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            AlertDialogUtils.a(0x7f08019d, ((Context) (obj)));
        }
        if (b.contains(view)) goto _L2; else goto _L1
_L1:
        b.add(view);
        AnalyticsEvents.a(FriendAction.INVITE, c.c().name(), a, com.snapchat.android.analytics.ticsEvents.AddFriendSourceType.CONTACTS, c.E_().name());
        view = d.A;
        obj = c.c();
        com.snapchat.android.analytics.leEventAnalytics._cls1..SwitchMap.com.snapchat.android.analytics.AnalyticsEvents.AnalyticsContext[((com.snapchat.android.analytics.ticsEvents.AnalyticsContext) (obj)).ordinal()];
        JVM INSTR tableswitch 8 9: default 300
    //                   8 328
    //                   9 311;
           goto _L2 _L3 _L4
_L2:
        return;
_L4:
        it it1 = new it();
        ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(it1);
        return;
_L3:
        ia ia1 = new ia();
        ((ProfileEventAnalytics) (view)).mBlizzardEventLogger.a(ia1);
        return;
    }

    public >(wS ws, Friend friend, Set set, Set set1)
    {
        d = ws;
        super();
        a = friend;
        b = set;
        c = set1;
    }
}
