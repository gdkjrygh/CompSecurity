// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import java.util.Collections;

public final class ala
{

    public final akm a;

    public ala(akm akm1)
    {
        a = akm1;
    }

    public final void a(Activity activity, com.crashlytics.android.answers.SessionEvent.Type type)
    {
        gya.a().a("Answers", (new StringBuilder("Logged lifecycle event: ")).append(type.name()).toString());
        akm akm1 = a;
        activity = Collections.singletonMap("activity", activity.getClass().getName());
        type = new alc(type);
        type.c = activity;
        akm1.a(type, false, false);
    }
}
