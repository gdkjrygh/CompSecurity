// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.squareup.picasso.Downloader;
import java.util.concurrent.ExecutorService;

public final class gvt
{

    public final Context a;
    public Downloader b;
    public ExecutorService c;
    public gvd d;
    public gvv e;

    public gvt(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            a = context.getApplicationContext();
            return;
        }
    }
}
