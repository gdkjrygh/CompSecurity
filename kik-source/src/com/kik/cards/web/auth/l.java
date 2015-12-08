// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.auth;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public final class l
{

    public static KeyPair a()
    {
        KeyPairGenerator keypairgenerator = null;
        KeyPairGenerator keypairgenerator1 = KeyPairGenerator.getInstance("RSA");
        keypairgenerator = keypairgenerator1;
_L2:
        keypairgenerator.initialize(2048);
        return keypairgenerator.genKeyPair();
        NoSuchAlgorithmException nosuchalgorithmexception;
        nosuchalgorithmexception;
        nosuchalgorithmexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
