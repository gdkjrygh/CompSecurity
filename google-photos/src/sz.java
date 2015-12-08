// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.Window;

class sz extends sy
{

    boolean o;

    sz(Context context, Window window, st st)
    {
        super(context, window, st);
        o = true;
    }

    android.view.Window.Callback a(android.view.Window.Callback callback)
    {
        return new ta(this, callback);
    }
}
