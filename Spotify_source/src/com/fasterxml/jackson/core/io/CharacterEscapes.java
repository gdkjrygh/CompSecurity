// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.Serializable;

public abstract class CharacterEscapes
    implements Serializable
{

    public abstract int[] getEscapeCodesForAscii();

    public abstract SerializableString getEscapeSequence(int i);
}
