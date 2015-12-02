// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.prefs.shared;

import android.database.sqlite.SQLiteDatabase;
import com.google.common.a.kl;
import java.util.Set;

// Referenced classes of package com.facebook.prefs.shared:
//            FbSharedPreferencesContentProvider

class g
{

    final FbSharedPreferencesContentProvider a;
    private int b;
    private Set c;

    public g(FbSharedPreferencesContentProvider fbsharedpreferencescontentprovider)
    {
        a = fbsharedpreferencescontentprovider;
        super();
        c = kl.a();
    }

    public Set a()
    {
        return c;
    }

    public void a(String s)
    {
        c.add(s);
    }

    public int b()
    {
        return b;
    }

    public void c()
    {
        FbSharedPreferencesContentProvider.a(a).beginTransaction();
        b = b + 1;
    }

    public void d()
    {
        FbSharedPreferencesContentProvider.a(a).setTransactionSuccessful();
    }

    public void e()
    {
        FbSharedPreferencesContentProvider.a(a).endTransaction();
        b = b - 1;
    }
}
