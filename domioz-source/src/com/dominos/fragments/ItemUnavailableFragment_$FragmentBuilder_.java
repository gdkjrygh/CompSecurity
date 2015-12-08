// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.os.Bundle;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.fragments:
//            ItemUnavailableFragment_, ItemUnavailableFragment

public class  extends d
{

    public ItemUnavailableFragment build()
    {
        ItemUnavailableFragment_ itemunavailablefragment_ = new ItemUnavailableFragment_();
        itemunavailablefragment_.setArguments(args);
        return itemunavailablefragment_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mMoreInfoContent(String s)
    {
        args.putString("mMoreInfoContent", s);
        return this;
    }

    public args mSummary(String s)
    {
        args.putString("mSummary", s);
        return this;
    }

    public ()
    {
    }
}
