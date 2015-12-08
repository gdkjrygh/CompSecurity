// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.text.InputFilter;
import android.text.TextWatcher;

interface Validator
    extends InputFilter, TextWatcher
{

    public abstract String getValue();

    public abstract boolean hasFullLength();

    public abstract boolean isValid();
}
