// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.server.SetSettingsParams;
import com.google.common.a.hq;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class az
    implements f
{

    public az()
    {
    }

    private String b(SetSettingsParams setsettingsparams)
    {
        return Long.toString(setsettingsparams.b().d());
    }

    public n a(SetSettingsParams setsettingsparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("format", "json"));
        if (setsettingsparams.a())
        {
            arraylist.add(new BasicNameValuePair("mute_until", b(setsettingsparams)));
        }
        return new n("setUserSettings", "POST", "method/messaging.setsettings", arraylist, t.STRING);
    }

    public volatile n a(Object obj)
    {
        return a((SetSettingsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((SetSettingsParams)obj, r1);
    }

    public Void a(SetSettingsParams setsettingsparams, r r1)
    {
        r1.f();
        return null;
    }
}
