// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public final class CV
    implements CU
{

    private final Intent a;
    private final String b;

    public CV(Intent intent)
    {
        a = intent;
        b = intent.getStringExtra("url");
    }

    public final Intent getIntent()
    {
        return a;
    }

    public final void postProcess(Context context)
    {
    }

    public final void process(Context context)
    {
        context = b;
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        throw new IllegalArgumentException();
        (new DefaultHttpClient()).execute(new HttpGet(context));
        return;
        context;
    }
}
