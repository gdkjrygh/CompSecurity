// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.databind.JsonNode;

public interface doz
{

    public abstract int getDefaultCardGridMaxRows();

    public abstract JsonNode getExtraData();

    public abstract dps getViews();

    public abstract boolean shouldAdjustCardGridRows();
}
