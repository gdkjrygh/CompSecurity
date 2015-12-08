// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.ArrayList;

final class igw extends mtf
{

    public igw()
    {
        super("LoadRecentAppsTask");
    }

    protected final mue a(Context context)
    {
        context = (igz)olm.a(context, igz);
        mue mue1;
        try
        {
            context = new ArrayList(context.a());
            mue1 = new mue(true);
            mue1.a().putStringArrayList("recent_list", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return mue1;
    }
}
