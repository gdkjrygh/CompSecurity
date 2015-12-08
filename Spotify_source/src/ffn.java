// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.support.v4.app.Fragment;

public final class ffn
{

    public final Fragment a;

    public ffn(Fragment fragment)
    {
        a = fragment;
    }

    public final void a()
    {
        a.a(new Intent("android.settings.SETTINGS"));
    }
}
