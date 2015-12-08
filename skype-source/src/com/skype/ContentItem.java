// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            ObjectInterface

public interface ContentItem
    extends ObjectInterface
{
    public static interface ContentItemIListener
    {
    }


    public abstract void addListener(ContentItemIListener contentitemilistener);

    public abstract void removeListener(ContentItemIListener contentitemilistener);
}
