// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;


public interface EncryptionService
{
    public static interface EncryptionSession
    {

        public abstract Object encrypt(Object obj);

        public abstract Object getSessionMaterial();
    }


    public abstract EncryptionSession newSession();
}
