// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.graphics.Bitmap;
import p.cm.t;

// Referenced classes of package com.pandora.android.audio:
//            RemoteControlClientManager, d

private class <init> extends t
{

    final RemoteControlClientManager a;

    protected void a(Bitmap bitmap)
    {
    }

    protected void b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            a.c.a(false).a(100, bitmap).a();
            return;
        }
    }

    protected void onCancelled(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onPostExecute(Object obj)
    {
        b((Bitmap)obj);
    }

    private (RemoteControlClientManager remotecontrolclientmanager)
    {
        a = remotecontrolclientmanager;
        super();
    }

    a(RemoteControlClientManager remotecontrolclientmanager, a a1)
    {
        this(remotecontrolclientmanager);
    }
}
