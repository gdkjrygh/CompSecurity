// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class afd extends afb
    implements aeg
{

    public afd(Context context, adp adp)
    {
        super(context, adp);
    }

    public final void a(String s, String s1, String s2)
    {
        Object obj = b;
        obj = new Intent((new StringBuilder()).append(((agm) (obj)).a).append("#setMultimediaInfo(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2)").toString());
        ((Intent) (obj)).putExtra("arg0", s);
        ((Intent) (obj)).putExtra("arg1", s1);
        ((Intent) (obj)).putExtra("arg2", s2);
        agm.a(((Intent) (obj)));
    }
}
