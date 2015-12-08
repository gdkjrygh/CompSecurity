// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class moi
    implements mnh
{

    private final AccountManager a;
    private final List b;

    moi(Context context)
    {
        a = AccountManager.get(context);
        b = olm.c(context, mng);
    }

    static void a(moi moi1, am am1, Intent intent)
    {
        ay ay1 = am1.h();
        mol mol1 = (mol)ay1.a("new.account.launcher");
        am1 = mol1;
        if (mol1 == null)
        {
            am1 = new mol();
            ay1.a().a(am1, "new.account.launcher").c();
        }
        b.a(new mok(moi1, am1, intent));
    }

    public final mne a(String s)
    {
        mne amne[] = a();
        int j = amne.length;
        for (int i = 0; i < j; i++)
        {
            mne mne1 = amne[i];
            if (mne1.a.equals(s))
            {
                return mne1;
            }
        }

        return null;
    }

    public final void a(am am1)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        a.addAccount("com.google", "webupdates", null, bundle, null, new moj(this, am1), null);
    }

    public final mne[] a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.addAll(((mng)iterator.next()).a())) { }
        return (mne[])arraylist.toArray(new mne[arraylist.size()]);
    }
}
