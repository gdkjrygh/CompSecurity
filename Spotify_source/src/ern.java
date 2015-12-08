// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.service.ConnectDevice;

public final class ern
{

    public final Context a;

    public ern(Context context)
    {
        a = context;
    }

    public final Drawable a(ConnectDevice connectdevice, int i, float f)
    {
        connectdevice = connectdevice.r;
        connectdevice = new dfz(a, connectdevice, f);
        connectdevice.a(i);
        return connectdevice;
    }
}
