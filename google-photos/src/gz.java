// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public class gz
    implements mau
{

    public final hd a;
    private final ArrayList b;

    public gz()
    {
    }

    public gz(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
    {
        b = new ArrayList();
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        PendingIntent pendingintent1 = pendingintent;
        if (pendingintent == null)
        {
            pendingintent = new Intent("android.intent.action.MEDIA_BUTTON");
            pendingintent.setComponent(componentname);
            pendingintent1 = PendingIntent.getBroadcast(context, 0, pendingintent, 0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new he(context, s);
            a.a(pendingintent1);
        } else
        {
            a = new hf(context, s, componentname, pendingintent1);
        }
        new gj(context, this);
    }

    public final hq a()
    {
        return a.b();
    }

    public lzx a(jyw jyw)
    {
        return new mgk(this, jyw);
    }

    public final void a(ha ha)
    {
        a.a(ha, new Handler());
    }

    public final void a(boolean flag)
    {
        a.a(true);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((hl)iterator.next()).a()) { }
    }
}
