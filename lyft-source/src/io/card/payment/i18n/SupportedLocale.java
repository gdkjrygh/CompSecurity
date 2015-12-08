// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment.i18n;


public interface SupportedLocale
{

    public abstract String getAdaptedDisplay(Enum enum, String s);

    public abstract String getName();
}
