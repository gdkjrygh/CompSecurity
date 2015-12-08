// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.coremedia.iso.boxes.sampleentry;

import com.coremedia.iso.boxes.Box;

public interface SampleEntry
    extends Box
{

    public abstract int getDataReferenceIndex();

    public abstract void setDataReferenceIndex(int i);
}
