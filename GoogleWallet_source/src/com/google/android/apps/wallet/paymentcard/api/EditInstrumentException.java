// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.api;


public final class EditInstrumentException extends Exception
{

    public EditInstrumentException()
    {
        super("Could not create an Intent to edit the given instrument");
    }
}
