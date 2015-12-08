// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class mnv
    implements mnd
{

    mnv(mnn mnn)
    {
    }

    public final String a()
    {
        return "add_skinny_page_boolean";
    }

    public final void a(Context context, mmz mmz1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (!mmz1.c("is_google_plus"))
        {
            flag = flag1;
            if (mmz1.a("page_count", 0) > 0)
            {
                flag = true;
            }
        }
        mmz1.b("gplus_skinny_page", flag);
    }
}
