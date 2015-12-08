// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.fitbit.data.domain.MealType;
import java.util.Date;

// Referenced classes of package com.fitbit.food.ui.logging:
//            LogFoodActivity_

public static class a
{

    private Context a;
    private final Intent b;
    private Fragment c;

    public Intent a()
    {
        return b;
    }

    public b a(int i)
    {
        b.setFlags(i);
        return this;
    }

    public b a(MealType mealtype)
    {
        b.putExtra("mealType", mealtype);
        return this;
    }

    public .Mode a(.Mode mode)
    {
        b.putExtra("mode", mode);
        return this;
    }

    public b a(Long long1)
    {
        b.putExtra("logEntryId", long1);
        return this;
    }

    public b a(Date date)
    {
        b.putExtra("logDate", date);
        return this;
    }

    public b a(boolean flag)
    {
        b.putExtra("isStartedFromScanned", flag);
        return this;
    }

    public b b(Long long1)
    {
        b.putExtra("foodEntityId", long1);
        return this;
    }

    public void b()
    {
        a.startActivity(b);
    }

    public void b(int i)
    {
        if (c != null)
        {
            c.startActivityForResult(b, i);
            return;
        }
        if (a instanceof Activity)
        {
            ((Activity)a).startActivityForResult(b, i);
            return;
        } else
        {
            a.startActivity(b);
            return;
        }
    }

    public b c(Long long1)
    {
        b.putExtra("foodServerId", long1);
        return this;
    }

    public .Mode(Context context)
    {
        a = context;
        b = new Intent(context, com/fitbit/food/ui/logging/LogFoodActivity_);
    }

    public b(Fragment fragment)
    {
        c = fragment;
        a = fragment.getActivity();
        b = new Intent(a, com/fitbit/food/ui/logging/LogFoodActivity_);
    }
}
