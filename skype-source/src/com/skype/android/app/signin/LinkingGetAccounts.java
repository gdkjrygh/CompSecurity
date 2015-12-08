// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.HttpUtil;
import java.util.ArrayList;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants, LinkingAccountsItem, LiveIdWebClient

public class LinkingGetAccounts
    implements SignInConstants, AsyncCallback
{
    public static interface LinkingCallback
    {

        public abstract void microsoftAccounts(String s, String s1, ArrayList arraylist, ArrayList arraylist1);

        public abstract void onLinkingError(String s);
    }


    private static final Logger log = Logger.getLogger("LinkingGetAccounts");
    private String accessToken;
    private LinkingCallback callback;
    private HttpUtil httpUtil;
    private ArrayList microsoftAccounts;
    private String refreshToken;
    private ArrayList suggestedAccounts;
    private LiveIdWebClient webClient;

    public LinkingGetAccounts(HttpUtil httputil)
    {
        suggestedAccounts = new ArrayList();
        microsoftAccounts = new ArrayList();
        httpUtil = httputil;
    }

    private void getMicrosoftAccounts(String s, String s1, String s2, String s3)
    {
        microsoftAccounts.add(new LinkingAccountsItem(s, s1, s2, s3));
        callback.microsoftAccounts(accessToken, refreshToken, microsoftAccounts, suggestedAccounts);
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            asyncresult = (LiveIdWebClient.ProfileInfo)asyncresult.a();
            getMicrosoftAccounts(asyncresult.getCid(), asyncresult.getFirstName(), asyncresult.getLastName(), asyncresult.getVisibleContactInfo());
            return;
        } else
        {
            log.warning((new StringBuilder("msft account info retrieve error: ")).append(asyncresult.c().getMessage()).toString());
            callback.onLinkingError(asyncresult.c().getMessage());
            return;
        }
    }

    public void getMsaInfo(String s, String s1, String s2, LinkingCallback linkingcallback)
    {
        accessToken = s;
        refreshToken = s1;
        callback = linkingcallback;
        webClient = new LiveIdWebClient(s, s2, httpUtil);
        webClient.getLiveIdInfoAsync(this);
    }

    public void setEvent(com.skype.android.gen.SkyLibListener.OnSuggestedAccountsResult onsuggestedaccountsresult)
    {
        String as[] = onsuggestedaccountsresult.getAvatars();
        String as1[] = onsuggestedaccountsresult.getFullnames();
        onsuggestedaccountsresult = onsuggestedaccountsresult.getSkypenames();
        for (int i = 0; i < onsuggestedaccountsresult.length; i++)
        {
            suggestedAccounts.add(new LinkingAccountsItem(as[i], as1[i], "", onsuggestedaccountsresult[i]));
        }

    }

}
