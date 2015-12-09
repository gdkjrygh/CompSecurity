// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.lang.ref.WeakReference;

public class gff
    implements dmx
{

    static final String a[] = {
        "server_time"
    };
    private WeakReference b;

    public gff(Context context)
    {
        b = new WeakReference(context);
    }

    public final void a(gfh gfh)
    {
        Context context = (Context)b.get();
        if (context == null)
        {
            return;
        } else
        {
            (new gfg(context, gfh)).execute(new Void[0]);
            return;
        }
    }

}
