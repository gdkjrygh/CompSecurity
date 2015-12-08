// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.facebook.Session;

public final class apb
{

    private final Context a;

    public apb(Context context)
    {
        a = context;
    }

    public final Session a()
    {
        return new Session(a, (byte)0);
    }
}
