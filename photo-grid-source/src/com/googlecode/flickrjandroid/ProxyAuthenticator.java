// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class ProxyAuthenticator extends Authenticator
{

    String passWord;
    String userName;

    public ProxyAuthenticator(String s, String s1)
    {
        userName = "";
        passWord = "";
        userName = s;
        passWord = s1;
    }

    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(userName, passWord.toCharArray());
    }
}
