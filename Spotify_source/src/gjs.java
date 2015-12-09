// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.Map;

public abstract class gjs
{

    protected Context a;
    public Map b;

    gjs()
    {
        b = Collections.emptyMap();
    }

    public gjs(Context context)
    {
        b = Collections.emptyMap();
        ctz.a(context);
        a = context;
    }

    public abstract void a();
}
