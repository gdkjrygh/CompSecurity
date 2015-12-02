// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.leak;

import com.qihoo360.common.utils.TEA;
import com.qihoo360.common.utils.Utils;

public class b
{

    public static String a = a("000000247d289d211b690fe2e3767a12ef1c702ba58d0f3188d28f45fd2aee1e0644d607f3d03f9090649412");
    public static String b = a("000000367d289d211b690fe2e3767a12ef1c702bc878fe44d02f3f0089f6af9f49726e49332d2ffd2a011985729b8b3dcca26fe2e7102f8079dc13be");

    private static String a(String s)
    {
        return new String((new TEA(Utils.hexStringToBytes("b1003b8fc038cbbf01d92b91166661a1"))).decrypt(Utils.hexStringToBytes(s)));
    }

}
