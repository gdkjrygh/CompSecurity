// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import eu;
import fl;
import fo;
import fp;
import fq;
import fu;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.media.session:
//            PlaybackStateCompat

public final class MediaSessionCompat
{

    public final fo a;
    public final ArrayList b;

    public MediaSessionCompat(Context context, fo fo1)
    {
        b = new ArrayList();
        a = fo1;
        new eu(context, this);
    }

    public MediaSessionCompat(Context context, String s, ComponentName componentname, PendingIntent pendingintent)
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
            a = new fp(context, s);
            a.a(pendingintent1);
        } else
        {
            a = new fq(context, s, componentname, pendingintent1);
        }
        new eu(context, this);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(Bundle bundle)
    {
        a.a(bundle);
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        a.a(mediametadatacompat);
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        a.a(playbackstatecompat);
    }

    public final void a(fl fl)
    {
        a.a(fl, new Handler());
    }

    public final void a(boolean flag)
    {
        a.a(flag);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((fu)iterator.next()).a()) { }
    }

    public final boolean b()
    {
        return a.b();
    }

    public final void c()
    {
        a.c();
    }

    public final Token d()
    {
        return a.d();
    }

    public final Object e()
    {
        return a.f();
    }
}
