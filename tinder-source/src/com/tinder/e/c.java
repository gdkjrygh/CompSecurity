// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.e;

import com.tinder.enums.ReportCause;
import com.tinder.model.Match;

public interface c
{

    public abstract void a(Match match, ReportCause reportcause);

    public abstract void a(Match match, String s, String s1, ReportCause reportcause, boolean flag);

    public abstract void b();

    public abstract void c();
}
