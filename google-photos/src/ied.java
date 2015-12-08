// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

final class ied
{

    static final Intent a = a("android.intent.action.SEND", "text/plain");
    static final Intent b = a("android.intent.action.SEND", "application/vnd.google.panorama360+jpg");
    final noe c;
    final myf d;

    public ied(Context context)
    {
        c = (noe)olm.a(context, noe);
        d = (myf)olm.a(context, myf);
    }

    static Intent a(String s, String s1)
    {
        s = new Intent(s);
        s.setType(s1);
        return s;
    }

}
