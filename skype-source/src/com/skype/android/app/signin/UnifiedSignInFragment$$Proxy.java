// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.widget.TextView;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import com.skype.android.widget.ProgressCircleView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.signin:
//            UnifiedSignInFragment

public class  extends com.skype.android.ent..Proxy
{

    public void clearViews()
    {
        super.ws();
        ((UnifiedSignInFragment)getTarget()).progressCircleView = null;
        ((UnifiedSignInFragment)getTarget()).createAccountBtn = null;
        ((UnifiedSignInFragment)getTarget()).signInMessage = null;
        ((UnifiedSignInFragment)getTarget()).signInLabel = null;
        ((UnifiedSignInFragment)getTarget()).signInLogo = null;
        ((UnifiedSignInFragment)getTarget()).signInNextBtn = null;
        ((UnifiedSignInFragment)getTarget()).signInContent = null;
        ((UnifiedSignInFragment)getTarget()).userIdEdit = null;
    }

    public void injectViews()
    {
        super.ews();
        ((UnifiedSignInFragment)getTarget()).progressCircleView = (ProgressCircleView)findViewById(0x7f1004d0);
        ((UnifiedSignInFragment)getTarget()).createAccountBtn = findViewById(0x7f1003aa);
        ((UnifiedSignInFragment)getTarget()).signInMessage = (TextView)findViewById(0x7f10056c);
        ((UnifiedSignInFragment)getTarget()).signInLabel = (TextView)findViewById(0x7f1003ae);
        ((UnifiedSignInFragment)getTarget()).signInLogo = findViewById(0x7f100516);
        ((UnifiedSignInFragment)getTarget()).signInNextBtn = (SymbolView)findViewById(0x7f10056d);
        ((UnifiedSignInFragment)getTarget()).signInContent = findViewById(0x7f1003ad);
        ((UnifiedSignInFragment)getTarget()).userIdEdit = (AccessibleAutoCompleteTextView)findViewById(0x7f10056b);
    }

    public (UnifiedSignInFragment unifiedsigninfragment)
    {
        super(unifiedsigninfragment);
    }
}
