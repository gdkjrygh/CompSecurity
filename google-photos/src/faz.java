// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public final class faz extends Enum
{

    public static final faz a;
    public static final faz b;
    public static final faz c;
    private static final faz d[];

    private faz(String s, int i)
    {
        super(s, i);
    }

    public static faz a(Intent intent)
    {
        intent = intent.getExtras();
        if (intent != null && intent.containsKey("com.google.android.apps.photos.destination.Destination"))
        {
            return valueOf(intent.getString("com.google.android.apps.photos.destination.Destination"));
        } else
        {
            return null;
        }
    }

    public static faz valueOf(String s)
    {
        return (faz)Enum.valueOf(faz, s);
    }

    public static faz[] values()
    {
        return (faz[])d.clone();
    }

    static 
    {
        a = new faz("ASSISTANT", 0);
        b = new faz("PHOTOS", 1);
        c = new faz("COLLECTIONS", 2);
        d = (new faz[] {
            a, b, c
        });
    }
}
