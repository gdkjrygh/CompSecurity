// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.location.Location;

public class lgr
{

    public lgr()
    {
    }

    public Location a(jyn jyn)
    {
        jyn = lgu.a(jyn);
        try
        {
            jyn = ((lhm) (jyn)).b.a();
        }
        // Misplaced declaration of an exception variable
        catch (jyn jyn)
        {
            return null;
        }
        return jyn;
    }
}
