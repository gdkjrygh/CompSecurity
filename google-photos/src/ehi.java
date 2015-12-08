// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class ehi extends AsyncTask
{

    private ehb a;

    ehi(ehb ehb1)
    {
        a = ehb1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (ehj[])aobj;
        ehb ehb1 = a;
        Object obj = aobj[0];
        b.v();
        if (((ehj) (obj)).c)
        {
            aobj = ehb1.e.a();
        } else
        {
            aobj = ehb1.e.a(((ehj) (obj)).b);
        }
        ((ehj) (obj)).a.a(ehb1.a, ((java.util.Map) (aobj)));
        if (((ehj) (obj)).a.h() && !((ehj) (obj)).a.i())
        {
            ((ehj) (obj)).a.a();
        }
        return null;
    }
}
