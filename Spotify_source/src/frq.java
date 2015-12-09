// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.lang.ref.WeakReference;

public final class frq
{

    WeakReference a;
    final frr b;

    public frq(Activity activity, frr frr)
    {
        a = new WeakReference(activity);
        b = frr;
    }
}
