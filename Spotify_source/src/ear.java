// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public class ear
    implements dmx
{

    public final ArrayList a = new ArrayList();
    private final Context b;

    public ear(Context context)
    {
        b = context;
    }

    public final void a()
    {
        Intent intent = new Intent("com.spotify.mobile.android.service.media.EVENT_CONNECTION_LABELS");
        intent.putExtra("connections", a);
        b.sendBroadcast(intent);
    }
}
