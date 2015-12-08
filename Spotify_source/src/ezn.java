// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.cosmos.android.Resolver;
import java.lang.ref.WeakReference;

public final class ezn
{

    public final WeakReference a;
    public final Resolver b;

    public ezn(Context context, Resolver resolver)
    {
        a = new WeakReference(context);
        b = (Resolver)ctz.a(resolver);
    }
}
