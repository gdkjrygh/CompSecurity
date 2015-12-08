// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.signin:
//            AccountInfo

public class AccountsList
{
    public static final class OutcomeResult extends Enum
    {

        private static final OutcomeResult $VALUES[];
        public static final OutcomeResult CANCELED;
        public static final OutcomeResult MSA_EXISTS;
        public static final OutcomeResult NO_ACCOUNT;
        public static final OutcomeResult NO_RESPONSE;
        public static final OutcomeResult SKYPE_EXISTS;
        public static final OutcomeResult SUGGESTIONS_FOUND;

        public static OutcomeResult valueOf(String s)
        {
            return (OutcomeResult)Enum.valueOf(com/skype/android/app/signin/AccountsList$OutcomeResult, s);
        }

        public static OutcomeResult[] values()
        {
            return (OutcomeResult[])$VALUES.clone();
        }

        static 
        {
            MSA_EXISTS = new OutcomeResult("MSA_EXISTS", 0);
            SKYPE_EXISTS = new OutcomeResult("SKYPE_EXISTS", 1);
            SUGGESTIONS_FOUND = new OutcomeResult("SUGGESTIONS_FOUND", 2);
            NO_ACCOUNT = new OutcomeResult("NO_ACCOUNT", 3);
            NO_RESPONSE = new OutcomeResult("NO_RESPONSE", 4);
            CANCELED = new OutcomeResult("CANCELED", 5);
            $VALUES = (new OutcomeResult[] {
                MSA_EXISTS, SKYPE_EXISTS, SUGGESTIONS_FOUND, NO_ACCOUNT, NO_RESPONSE, CANCELED
            });
        }

        private OutcomeResult(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String JSON_PARAM_ACCOUNTS = "accounts";
    private static final String JSON_PARAM_OUTCOME = "outcome";
    private ArrayList accounts;
    private OutcomeResult outcome;

    private AccountsList(OutcomeResult outcomeresult)
    {
        outcome = OutcomeResult.NO_ACCOUNT;
        accounts = new ArrayList();
        outcome = outcomeresult;
    }

    public static AccountsList emptyList()
    {
        return new AccountsList(OutcomeResult.NO_ACCOUNT);
    }

    public static AccountsList fromJson(String s)
        throws JSONException
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = new AccountsList(OutcomeResult.NO_RESPONSE);
_L4:
        return s;
_L2:
        s = new JSONObject(s);
        AccountsList accountslist = new AccountsList(OutcomeResult.valueOf(s.getString("outcome")));
        JSONArray jsonarray = s.getJSONArray("accounts");
        int i = 0;
        do
        {
            s = accountslist;
            if (i >= jsonarray.length())
            {
                continue;
            }
            accountslist.accounts.add(new AccountInfo(jsonarray.getJSONObject(i)));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String localSearchResult(String s, boolean flag)
    {
        Object obj;
        SignInConstants.AccountType accounttype;
        if (flag)
        {
            obj = OutcomeResult.SKYPE_EXISTS;
        } else
        {
            obj = OutcomeResult.MSA_EXISTS;
        }
        if (flag)
        {
            accounttype = SignInConstants.AccountType.SKYPE;
        } else
        {
            accounttype = SignInConstants.AccountType.MSA;
        }
        obj = new AccountsList(((OutcomeResult) (obj)));
        ((AccountsList) (obj)).add(0, new AccountInfo(s, accounttype));
        return ((AccountsList) (obj)).toJson().toString();
    }

    public void add(int i, AccountInfo accountinfo)
    {
        accounts.add(i, accountinfo);
    }

    public boolean contains(AccountInfo accountinfo)
    {
        for (Iterator iterator = accounts.iterator(); iterator.hasNext();)
        {
            if (TextUtils.equals(((AccountInfo)iterator.next()).getUsername(), accountinfo.getUsername()))
            {
                return true;
            }
        }

        return false;
    }

    public AccountInfo get(String s)
    {
        for (Iterator iterator = accounts.iterator(); iterator.hasNext();)
        {
            AccountInfo accountinfo = (AccountInfo)iterator.next();
            if (TextUtils.equals(accountinfo.getUsername(), s))
            {
                return accountinfo;
            }
        }

        return null;
    }

    public List getAccounts()
    {
        return accounts;
    }

    public OutcomeResult getOutcome()
    {
        return outcome;
    }

    public int indexOf(String s)
    {
        int i = -1;
        for (Iterator iterator = accounts.iterator(); iterator.hasNext();)
        {
            AccountInfo accountinfo = (AccountInfo)iterator.next();
            int j = i + 1;
            i = j;
            if (TextUtils.equals(accountinfo.getUsername(), s))
            {
                return j;
            }
        }

        return i;
    }

    public AccountInfo remove(int i)
    {
        if (i < 0 || i > accounts.size())
        {
            return null;
        } else
        {
            return (AccountInfo)accounts.remove(i);
        }
    }

    public boolean remove(AccountInfo accountinfo)
    {
        for (Iterator iterator = accounts.iterator(); iterator.hasNext();)
        {
            if (TextUtils.equals(((AccountInfo)iterator.next()).getUsername(), accountinfo.getUsername()))
            {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public int size()
    {
        return accounts.size();
    }

    public JSONObject toJson()
    {
        Object obj = new JSONObject();
        JSONArray jsonarray;
        try
        {
            ((JSONObject) (obj)).put("outcome", outcome);
            jsonarray = new JSONArray();
            for (Iterator iterator = accounts.iterator(); iterator.hasNext(); jsonarray.put(((AccountInfo)iterator.next()).toJson())) { }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return ((JSONObject) (obj));
        }
        ((JSONObject) (obj)).put("accounts", jsonarray);
        return ((JSONObject) (obj));
    }
}
