// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.ContentResolver;
import android.content.Context;
import com.google.inject.Provider;

public class ContentResolverProvider
    implements Provider
{

    protected Context context;

    public ContentResolverProvider()
    {
    }

    public ContentResolver get()
    {
        return context.getContentResolver();
    }

    public volatile Object get()
    {
        return get();
    }
}
