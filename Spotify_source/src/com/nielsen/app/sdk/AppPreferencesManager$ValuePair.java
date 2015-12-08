// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;


// Referenced classes of package com.nielsen.app.sdk:
//            AppPreferencesManager

public class mValue
{

    final AppPreferencesManager a;
    public char mType;
    public Object mValue;

    char a()
    {
        return mType;
    }

    void a(char c)
    {
        mType = c;
    }

    void a(Object obj)
    {
        mValue = obj;
    }

    Object b()
    {
        return mValue;
    }

    _cls9(AppPreferencesManager apppreferencesmanager, char c, Object obj)
    {
        a = apppreferencesmanager;
        super();
        mType = 'U';
        mValue = null;
        mType = c;
        mValue = obj;
    }
}
