// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import java.io.Serializable;
import p.cw.c;

public interface j
    extends Serializable
{

    public abstract CharSequence a();

    public abstract void a(MusicSearchData musicsearchdata, String s, c c);

    public abstract void a(String s);

    public abstract void a(String s, String s1, c c, p.cx.x.e e, SearchDescriptor searchdescriptor);
}
