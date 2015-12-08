// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.b;

import com.bumptech.glide.g.e;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class j
{

    private final e a = new e(1000);

    j()
    {
    }

    public String a(c c1)
    {
        Object obj;
        synchronized (a)
        {
            obj = (String)a.b(c1);
        }
        obj1 = obj;
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj1 = MessageDigest.getInstance("SHA-256");
        c1.a(((MessageDigest) (obj1)));
        obj1 = h.a(((MessageDigest) (obj1)).digest());
        obj = obj1;
_L4:
        synchronized (a)
        {
            a.b(c1, obj);
        }
        obj1 = obj;
_L2:
        return ((String) (obj1));
        c1;
        obj1;
        JVM INSTR monitorexit ;
        throw c1;
        obj1;
        ((UnsupportedEncodingException) (obj1)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj1;
        ((NoSuchAlgorithmException) (obj1)).printStackTrace();
        if (true) goto _L4; else goto _L3
_L3:
        c1;
        obj1;
        JVM INSTR monitorexit ;
        throw c1;
    }
}
