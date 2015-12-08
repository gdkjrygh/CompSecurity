// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.signin:
//            AccountInfo, AccountsList

public class SharedGlobalPreferences
{

    private final String CONVERSATIONS = "conversations";
    private final String EXISTING_ACCOUNTS = "existingAccounts";
    private final String INVITATIONS = "invitations";
    private final String SHARED_GLOBAL_PREFERENCES = "sharedGlobalPreferences";
    private SharedPreferences preferences;

    public SharedGlobalPreferences(Context context)
    {
        preferences = context.getSharedPreferences("sharedGlobalPreferences", 0);
    }

    public void addConversationBlob(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("conversations", s);
        editor.remove("invitations");
        editor.apply();
    }

    public void addExistingAccount(String s, SignInConstants.AccountType accounttype)
    {
        if (s == null || s.length() == 0)
        {
            return;
        } else
        {
            AccountsList accountslist = getExistingAccounts();
            s = new AccountInfo(s, accounttype);
            accountslist.remove(s);
            accountslist.add(0, s);
            s = preferences.edit();
            s.putString("existingAccounts", accountslist.toJson().toString());
            s.apply();
            return;
        }
    }

    public void addInvitation(String s)
    {
        android.content.SharedPreferences.Editor editor = preferences.edit();
        editor.putString("invitations", s);
        editor.apply();
    }

    public String getConversationBlob()
    {
        return preferences.getString("conversations", null);
    }

    public AccountsList getExistingAccounts()
    {
        Object obj;
        obj = preferences.getString("existingAccounts", null);
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_32;
        }
        obj = AccountsList.fromJson(((String) (obj)));
        return ((AccountsList) (obj));
        Exception exception;
        exception;
        exception.printStackTrace();
        return AccountsList.emptyList();
    }

    public String getInvitation()
    {
        return preferences.getString("invitations", null);
    }
}
