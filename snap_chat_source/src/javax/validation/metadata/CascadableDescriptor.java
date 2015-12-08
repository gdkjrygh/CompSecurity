// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.metadata;

import java.util.Set;

public interface CascadableDescriptor
{

    public abstract Set getGroupConversions();

    public abstract boolean isCascaded();
}
