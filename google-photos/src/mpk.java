// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mpk
    implements mps, omb, opp, opr, opv
{

    private mqb a;
    private final SparseArray b;
    private mpr c;

    public mpk(opd opd1)
    {
        this(opd1, (byte)0);
    }

    public mpk(opd opd1, byte byte0)
    {
        b = new SparseArray();
        opd1.a(this);
    }

    static mpr a(mpk mpk1)
    {
        return mpk1.c;
    }

    static void a(mpk mpk1, int i, mph mph1)
    {
        mpk1 = (mpj)mpk1.b.get(i);
        if (mpk1 != null)
        {
            mpk1.a(mph1.b, mph1.c);
        }
    }

    public final mpk a(int i, mpj mpj1)
    {
        if (b.get(i) != null)
        {
            mpj1 = String.valueOf("Cannot register more than one handler for a given  id: ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(mpj1).length() + 11)).append(mpj1).append(i).toString());
        } else
        {
            b.put(i, mpj1);
            return this;
        }
    }

    public final void a(int i, Intent intent)
    {
        if (TextUtils.isEmpty(a.c.a(i)))
        {
            throw new IllegalArgumentException("You must use a resource id as the request code to guarantee overlap does not occur");
        }
        if (intent == null)
        {
            throw new NullPointerException("Intent must not be null!");
        }
        if ((mpj)b.get(i) == null)
        {
            throw new IllegalStateException((new StringBuilder(124)).append("You must register a result handler for request code").append(i).append(" before starting an activity for result with that request code").toString());
        }
        mqb mqb1 = a;
        Integer integer = mqb1.b.a(Integer.valueOf(i));
        Object obj = integer;
        if (integer == null)
        {
            obj = mqb1.a;
            int j = ((mqj) (obj)).a;
            obj.a = j + 1;
            obj = Integer.valueOf(j);
            mqb1.b.a.put(Integer.valueOf(i), obj);
        }
        i = ((Integer) (obj)).intValue();
        c.a.startActivityForResult(intent, i);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mpr)olm1.a(mpr);
        olm1.a(mqj);
        a = (mqb)olm1.a(mqb);
    }

    public final boolean a(mph mph1)
    {
        mqb mqb1 = a;
        int i = mph1.a;
        mph1 = new mpm(this, mph1);
        for (Iterator iterator = mqb1.b.a().iterator(); iterator.hasNext();)
        {
            Integer integer = (Integer)iterator.next();
            if (mqb1.b.a(integer).intValue() == i)
            {
                mph1.a(integer.intValue());
                return true;
            }
        }

        return false;
    }

    public final void al_()
    {
        c.b.add(this);
        mqb mqb1 = a;
        mpl mpl1 = new mpl(this);
        Integer integer;
        Integer integer1;
        for (Iterator iterator = (new ArrayList(mqb1.b.a())).iterator(); iterator.hasNext(); mpl1.a(integer.intValue(), integer1.intValue()))
        {
            integer = (Integer)iterator.next();
            integer1 = mqb1.b.a(integer);
        }

    }

    public final void am_()
    {
        c.b.remove(this);
    }
}
