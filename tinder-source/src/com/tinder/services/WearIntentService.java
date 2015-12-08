// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ai;
import android.text.TextUtils;
import com.google.android.gms.common.api.c;
import com.google.android.gms.wearable.d;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.l;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.p;
import com.tinder.activities.ActivityMain;
import com.tinder.e.t;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.w;
import com.tinder.managers.z;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import java.text.DateFormat;
import java.util.Date;

public class WearIntentService extends IntentService
    implements com.google.android.gms.common.api.c.b, com.google.android.gms.wearable.d.b, com.google.android.gms.wearable.k.a, com.google.android.gms.wearable.n.a, t
{

    public c a;
    z b;
    w c;

    public WearIntentService()
    {
        this("WearIntentService");
    }

    public WearIntentService(String s)
    {
        super(s);
        ManagerApp.h().a(this);
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
    }

    public final void b(Message message)
    {
    }

    public final void c(Message message)
    {
    }

    public void onDataChanged(f f)
    {
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        obj = intent.getStringExtra("path");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return;
        }
        if (!((String) (obj)).contains("/api/matches/send_message/")) goto _L2; else goto _L1
_L1:
        String s = ((String) (obj)).substring(((String) (obj)).lastIndexOf("/") + 1);
        obj = null;
        Bundle bundle = ai.a(intent);
        intent = ((Intent) (obj));
        if (bundle != null)
        {
            intent = bundle.get("chat_msg").toString();
        }
        obj = DateUtils.b();
        if (!TextUtils.isEmpty(intent))
        {
            Date date = new Date();
            String s1 = b.b().getId();
            intent = new Message(s, ((DateFormat) (obj)).format(date), s1, intent, true, date.getTime());
            c.a(this, intent);
        }
_L4:
        p.c.b(a, this);
        p.d.b(a, this);
        p.a.b(a, this);
        a.c();
        return;
_L2:
        if (((String) (obj)).equals("/start/profile/match"))
        {
            obj = (Match)intent.getExtras().getParcelable("match");
            if (obj != null)
            {
                intent = new Bundle();
                intent.putBoolean("from_push", true);
                intent.putParcelable("match", ((android.os.Parcelable) (obj)));
                intent.putSerializable("is_message", Boolean.valueOf(true));
                obj = new Intent(getApplicationContext(), com/tinder/activities/ActivityMain);
                ((Intent) (obj)).addFlags(0x14000000);
                ((Intent) (obj)).putExtras(intent);
                startActivity(((Intent) (obj)));
            }
        } else
        {
            p.c.a(a, "", ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onMessageReceived(l l)
    {
    }

    public void onPeerConnected(m m)
    {
    }

    public void onPeerDisconnected(m m)
    {
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        a = (new com.google.android.gms.common.api.c.a(this)).a(p.l).a(this).b();
        a.b();
        p.c.a(a, this);
        p.d.a(a, this);
        p.a.a(a, this);
        return super.onStartCommand(intent, i, j);
    }
}
