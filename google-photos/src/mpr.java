// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mpr
    implements opj, opl, ops, opv
{

    final Activity a;
    final Set b = new HashSet();
    mpz c;

    public mpr(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    public final void a(int i, int j, Intent intent)
    {
        mph mph1 = new mph(i, j, intent);
        intent = b.iterator();
        j = 0;
        do
        {
            if (!intent.hasNext())
            {
                break;
            }
            if (((mps)intent.next()).a(mph1))
            {
                j = 1;
            }
        } while (true);
        if (j == 0)
        {
            mpz mpz1 = c;
            Integer integer = Integer.valueOf(i);
            List list = (List)mpz1.a.get(integer);
            intent = list;
            if (list == null)
            {
                intent = new ArrayList();
                mpz1.a.put(integer, intent);
            }
            intent.add(mph1);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = (mpz)bundle.getParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results");
            return;
        } else
        {
            c = new mpz(mph);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("com.google.android.libraries.social.activityresult.ActivityResultManager.Results", c);
    }
}
