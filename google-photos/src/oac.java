// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.LabelPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class oac
{

    public final Context a;
    private PreferenceScreen b;

    public oac(Context context)
    {
        a = context;
        b = ((oau)olm.a(context, oau)).b();
    }

    private PreferenceScreen a()
    {
        if (b == null)
        {
            throw new NullPointerException();
        } else
        {
            return b;
        }
    }

    public final PreferenceCategory a(int i)
    {
        PreferenceCategory preferencecategory = a(((CharSequence) (a.getString(i))));
        a().b(preferencecategory);
        return preferencecategory;
    }

    public final PreferenceCategory a(CharSequence charsequence)
    {
        PreferenceCategory preferencecategory = new PreferenceCategory(a);
        preferencecategory.b(charsequence);
        return preferencecategory;
    }

    public final nzw a(CharSequence charsequence, CharSequence charsequence1)
    {
        nzw nzw1 = new nzw(a);
        nzw1.b(charsequence);
        nzw1.a_(charsequence1);
        return nzw1;
    }

    public final nzw a(CharSequence charsequence, CharSequence charsequence1, Intent intent)
    {
        charsequence = a(charsequence, charsequence1);
        charsequence.o = intent;
        return charsequence;
    }

    public final void a(CharSequence charsequence, Intent intent)
    {
        a().b(a(charsequence, null, intent));
    }

    public final LabelPreference b(CharSequence charsequence, CharSequence charsequence1)
    {
        LabelPreference labelpreference = new LabelPreference(a);
        labelpreference.b(charsequence);
        labelpreference.a_(charsequence1);
        return labelpreference;
    }

    public final oay c(CharSequence charsequence, CharSequence charsequence1)
    {
        oay oay1 = new oay(a);
        oay1.b(charsequence);
        oay1.a_(charsequence1);
        return oay1;
    }

    public final nzm d(CharSequence charsequence, CharSequence charsequence1)
    {
        nzm nzm1 = new nzm(a);
        nzm1.b(charsequence);
        nzm1.a = charsequence;
        nzm1.a_(charsequence1);
        int i = s.cp;
        nzm1.b = ((nzw) (nzm1)).g.getString(i);
        i = s.co;
        nzm1.c = ((nzw) (nzm1)).g.getString(i);
        return nzm1;
    }

    public final nzp e(CharSequence charsequence, CharSequence charsequence1)
    {
        nzp nzp1 = new nzp(a);
        nzp1.b(charsequence);
        nzp1.a = charsequence;
        nzp1.a_(charsequence1);
        return nzp1;
    }
}
