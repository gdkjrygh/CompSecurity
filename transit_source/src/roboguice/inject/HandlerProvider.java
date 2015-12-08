// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.os.Handler;
import android.os.Looper;
import com.google.inject.Provider;

public class HandlerProvider
    implements Provider
{

    public HandlerProvider()
    {
    }

    public Handler get()
    {
        return new Handler(Looper.getMainLooper());
    }

    public volatile Object get()
    {
        return get();
    }
}
