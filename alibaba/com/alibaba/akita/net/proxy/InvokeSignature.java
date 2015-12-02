// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.proxy;

import com.alibaba.akita.net.annotation.AkSignature;
import java.util.ArrayList;
import java.util.HashMap;

public interface InvokeSignature
{

    public abstract String getSignatureParamName();

    public abstract String signature(AkSignature aksignature, String s, ArrayList arraylist, HashMap hashmap);

    public abstract String signature(String s, ArrayList arraylist);
}
