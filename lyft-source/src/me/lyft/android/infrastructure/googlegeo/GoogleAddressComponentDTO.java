// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googlegeo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;

public class GoogleAddressComponentDTO
{

    public final String longName;
    public final String shortName;
    public final List types;

    public GoogleAddressComponentDTO(String s, String s1, ArrayList arraylist)
    {
        longName = Strings.nullToEmpty(s);
        shortName = Strings.nullToEmpty(s1);
        types = (List)Objects.firstNonNull(arraylist, Collections.emptyList());
    }
}
