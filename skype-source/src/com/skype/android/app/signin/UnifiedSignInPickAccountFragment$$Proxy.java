// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.support.v7.widget.RecyclerView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInPickAccountFragment

public class  extends com.skype.android.ent..Proxy
{

    public void clearViews()
    {
        super.Proxy();
        ((UnifiedSignInPickAccountFragment)getTarget()).rootView = null;
        ((UnifiedSignInPickAccountFragment)getTarget()).accountsListView = null;
        ((UnifiedSignInPickAccountFragment)getTarget()).backButton = null;
    }

    public void injectViews()
    {
        super.Proxy();
        ((UnifiedSignInPickAccountFragment)getTarget()).rootView = findViewById(0x7f10056e);
        ((UnifiedSignInPickAccountFragment)getTarget()).accountsListView = (RecyclerView)findViewById(0x7f10056f);
        ((UnifiedSignInPickAccountFragment)getTarget()).backButton = (SymbolView)findViewById(0x7f100301);
    }

    public (UnifiedSignInPickAccountFragment unifiedsigninpickaccountfragment)
    {
        super(unifiedsigninpickaccountfragment);
    }
}
