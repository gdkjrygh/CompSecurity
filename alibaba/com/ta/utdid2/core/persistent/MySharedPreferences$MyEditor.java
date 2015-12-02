// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ta.utdid2.core.persistent;


// Referenced classes of package com.ta.utdid2.core.persistent:
//            MySharedPreferences

public static interface 
{

    public abstract  clear();

    public abstract boolean commit();

    public abstract  putBoolean(String s, boolean flag);

    public abstract  putFloat(String s, float f);

    public abstract  putInt(String s, int i);

    public abstract  putLong(String s, long l);

    public abstract  putString(String s, String s1);

    public abstract  remove(String s);
}
