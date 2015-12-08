// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class lng extends lmu
{

    public final void a(int i, Bundle bundle, Bundle bundle1)
    {
        if (b.r(3))
        {
            (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1).toString();
            b.r(3);
        }
        if (i != 0)
        {
            b.c("PeopleClient", "Non-success data changed callback received.");
            return;
        } else
        {
            new kah(bundle1.getString("account"), bundle1.getString("pagegaiaid"), bundle1.getInt("scope"));
            throw new NullPointerException();
        }
    }
}
