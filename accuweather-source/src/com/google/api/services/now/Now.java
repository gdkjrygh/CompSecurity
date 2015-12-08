// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now;

import com.google.api.client.googleapis.GoogleUtils;
import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.services.now.model.Card;
import com.google.api.services.now.model.Context;
import com.google.api.services.now.model.ListCardsResponse;
import com.google.api.services.now.model.ListContextsResponse;
import java.io.IOException;

// Referenced classes of package com.google.api.services.now:
//            NowRequestInitializer, NowRequest

public class Now extends AbstractGoogleJsonClient
{
    public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder
    {

        public volatile AbstractGoogleClient build()
        {
            return build();
        }

        public volatile AbstractGoogleJsonClient build()
        {
            return build();
        }

        public Now build()
        {
            return new Now(this);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setApplicationName(String s)
        {
            return setApplicationName(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setApplicationName(String s)
        {
            return setApplicationName(s);
        }

        public Builder setApplicationName(String s)
        {
            return (Builder)super.setApplicationName(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleclientrequestinitializer)
        {
            return (Builder)super.setGoogleClientRequestInitializer(googleclientrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setHttpRequestInitializer(httprequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setHttpRequestInitializer(httprequestinitializer);
        }

        public Builder setHttpRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return (Builder)super.setHttpRequestInitializer(httprequestinitializer);
        }

        public Builder setNowRequestInitializer(NowRequestInitializer nowrequestinitializer)
        {
            return (Builder)super.setGoogleClientRequestInitializer(nowrequestinitializer);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setRootUrl(String s)
        {
            return setRootUrl(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setRootUrl(String s)
        {
            return setRootUrl(s);
        }

        public Builder setRootUrl(String s)
        {
            return (Builder)super.setRootUrl(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setServicePath(String s)
        {
            return setServicePath(s);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setServicePath(String s)
        {
            return setServicePath(s);
        }

        public Builder setServicePath(String s)
        {
            return (Builder)super.setServicePath(s);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressAllChecks(boolean flag)
        {
            return setSuppressAllChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressAllChecks(boolean flag)
        {
            return setSuppressAllChecks(flag);
        }

        public Builder setSuppressAllChecks(boolean flag)
        {
            return (Builder)super.setSuppressAllChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressPatternChecks(boolean flag)
        {
            return setSuppressPatternChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressPatternChecks(boolean flag)
        {
            return setSuppressPatternChecks(flag);
        }

        public Builder setSuppressPatternChecks(boolean flag)
        {
            return (Builder)super.setSuppressPatternChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.AbstractGoogleClient.Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return setSuppressRequiredParameterChecks(flag);
        }

        public volatile com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return setSuppressRequiredParameterChecks(flag);
        }

        public Builder setSuppressRequiredParameterChecks(boolean flag)
        {
            return (Builder)super.setSuppressRequiredParameterChecks(flag);
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory, HttpRequestInitializer httprequestinitializer)
        {
            super(httptransport, jsonfactory, "https://www.googleapis.com/", "now/v1/", httprequestinitializer, false);
        }
    }

    public class Contexts
    {

        final Now this$0;

        public Create create(Context context)
            throws IOException
        {
            context = new Create(context);
            initialize(context);
            return context;
        }

        public Delete delete(String s)
            throws IOException
        {
            s = new Delete(s);
            initialize(s);
            return s;
        }

        public Get get(String s)
            throws IOException
        {
            s = new Get(s);
            initialize(s);
            return s;
        }

        public List list()
            throws IOException
        {
            List list1 = new List();
            initialize(list1);
            return list1;
        }

        public Contexts()
        {
            this$0 = Now.this;
            super();
        }
    }

    public class Contexts.Create extends NowRequest
    {

        private static final String REST_PATH = "contexts";
        final Contexts this$1;

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Create set(String s, Object obj)
        {
            return (Contexts.Create)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Create setAlt(String s)
        {
            return (Contexts.Create)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Contexts.Create setFields(String s)
        {
            return (Contexts.Create)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Contexts.Create setKey(String s)
        {
            return (Contexts.Create)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Contexts.Create setOauthToken(String s)
        {
            return (Contexts.Create)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Contexts.Create setPrettyPrint(Boolean boolean1)
        {
            return (Contexts.Create)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Contexts.Create setQuotaUser(String s)
        {
            return (Contexts.Create)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Contexts.Create setUserIp(String s)
        {
            return (Contexts.Create)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Contexts.Create(Context context)
        {
            this$1 = Contexts.this;
            super(_fld0, "POST", "contexts", context, com/google/api/services/now/model/Context);
        }
    }

    public class Contexts.Delete extends NowRequest
    {

        private static final String REST_PATH = "contexts/{contextId}";
        private String contextId;
        final Contexts this$1;

        public String getContextId()
        {
            return contextId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Delete set(String s, Object obj)
        {
            return (Contexts.Delete)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Delete setAlt(String s)
        {
            return (Contexts.Delete)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Contexts.Delete setContextId(String s)
        {
            contextId = s;
            return this;
        }

        public Contexts.Delete setFields(String s)
        {
            return (Contexts.Delete)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Contexts.Delete setKey(String s)
        {
            return (Contexts.Delete)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Contexts.Delete setOauthToken(String s)
        {
            return (Contexts.Delete)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Contexts.Delete setPrettyPrint(Boolean boolean1)
        {
            return (Contexts.Delete)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Contexts.Delete setQuotaUser(String s)
        {
            return (Contexts.Delete)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Contexts.Delete setUserIp(String s)
        {
            return (Contexts.Delete)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Contexts.Delete(String s)
        {
            this$1 = Contexts.this;
            super(_fld0, "DELETE", "contexts/{contextId}", null, java/lang/Void);
            contextId = (String)Preconditions.checkNotNull(s, "Required parameter contextId must be specified.");
        }
    }

    public class Contexts.Get extends NowRequest
    {

        private static final String REST_PATH = "contexts/{contextId}";
        private String contextId;
        final Contexts this$1;

        public HttpRequest buildHttpRequestUsingHead()
            throws IOException
        {
            return super.buildHttpRequestUsingHead();
        }

        public HttpResponse executeUsingHead()
            throws IOException
        {
            return super.executeUsingHead();
        }

        public String getContextId()
        {
            return contextId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Get set(String s, Object obj)
        {
            return (Contexts.Get)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.Get setAlt(String s)
        {
            return (Contexts.Get)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Contexts.Get setContextId(String s)
        {
            contextId = s;
            return this;
        }

        public Contexts.Get setFields(String s)
        {
            return (Contexts.Get)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Contexts.Get setKey(String s)
        {
            return (Contexts.Get)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Contexts.Get setOauthToken(String s)
        {
            return (Contexts.Get)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Contexts.Get setPrettyPrint(Boolean boolean1)
        {
            return (Contexts.Get)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Contexts.Get setQuotaUser(String s)
        {
            return (Contexts.Get)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Contexts.Get setUserIp(String s)
        {
            return (Contexts.Get)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Contexts.Get(String s)
        {
            this$1 = Contexts.this;
            super(_fld0, "GET", "contexts/{contextId}", null, com/google/api/services/now/model/Context);
            contextId = (String)Preconditions.checkNotNull(s, "Required parameter contextId must be specified.");
        }
    }

    public class Contexts.List extends NowRequest
    {

        private static final String REST_PATH = "contexts";
        private Integer pageSize;
        private String pageToken;
        final Contexts this$1;

        public HttpRequest buildHttpRequestUsingHead()
            throws IOException
        {
            return super.buildHttpRequestUsingHead();
        }

        public HttpResponse executeUsingHead()
            throws IOException
        {
            return super.executeUsingHead();
        }

        public Integer getPageSize()
        {
            return pageSize;
        }

        public String getPageToken()
        {
            return pageToken;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.List set(String s, Object obj)
        {
            return (Contexts.List)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Contexts.List setAlt(String s)
        {
            return (Contexts.List)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Contexts.List setFields(String s)
        {
            return (Contexts.List)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Contexts.List setKey(String s)
        {
            return (Contexts.List)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Contexts.List setOauthToken(String s)
        {
            return (Contexts.List)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Contexts.List setPageSize(Integer integer)
        {
            pageSize = integer;
            return this;
        }

        public Contexts.List setPageToken(String s)
        {
            pageToken = s;
            return this;
        }

        public Contexts.List setPrettyPrint(Boolean boolean1)
        {
            return (Contexts.List)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Contexts.List setQuotaUser(String s)
        {
            return (Contexts.List)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Contexts.List setUserIp(String s)
        {
            return (Contexts.List)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Contexts.List()
        {
            this$1 = Contexts.this;
            super(_fld0, "GET", "contexts", null, com/google/api/services/now/model/ListContextsResponse);
        }
    }

    public class Users
    {

        final Now this$0;

        public Cards cards()
        {
            return new Cards();
        }

        public Users()
        {
            this$0 = Now.this;
            super();
        }
    }

    public class Users.Cards
    {

        final Users this$1;

        public Create create(String s, Card card)
            throws IOException
        {
            s = new Create(s, card);
            initialize(s);
            return s;
        }

        public Delete delete(String s, String s1)
            throws IOException
        {
            s = new Delete(s, s1);
            initialize(s);
            return s;
        }

        public Get get(String s, String s1)
            throws IOException
        {
            s = new Get(s, s1);
            initialize(s);
            return s;
        }

        public List list(String s)
            throws IOException
        {
            s = new List(s);
            initialize(s);
            return s;
        }

        public Patch patch(String s, String s1, Card card)
            throws IOException
        {
            s = new Patch(s, s1, card);
            initialize(s);
            return s;
        }

        public Update update(String s, String s1, Card card)
            throws IOException
        {
            s = new Update(s, s1, card);
            initialize(s);
            return s;
        }

        public Users.Cards()
        {
            this$1 = Users.this;
            super();
        }
    }

    public class Users.Cards.Create extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        final Users.Cards this$2;
        private String userId;

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Create set(String s, Object obj)
        {
            return (Users.Cards.Create)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Create setAlt(String s)
        {
            return (Users.Cards.Create)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.Create setFields(String s)
        {
            return (Users.Cards.Create)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.Create setKey(String s)
        {
            return (Users.Cards.Create)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.Create setOauthToken(String s)
        {
            return (Users.Cards.Create)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.Create setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.Create)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.Create setQuotaUser(String s)
        {
            return (Users.Cards.Create)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.Create setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.Create setUserIp(String s)
        {
            return (Users.Cards.Create)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.Create(String s, Card card)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "POST", "users/{userId}/cards", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Users.Cards.Delete extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Users.Cards this$2;
        private String userId;

        public String getCardId()
        {
            return cardId;
        }

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Delete set(String s, Object obj)
        {
            return (Users.Cards.Delete)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Delete setAlt(String s)
        {
            return (Users.Cards.Delete)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.Delete setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Users.Cards.Delete setFields(String s)
        {
            return (Users.Cards.Delete)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.Delete setKey(String s)
        {
            return (Users.Cards.Delete)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.Delete setOauthToken(String s)
        {
            return (Users.Cards.Delete)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.Delete setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.Delete)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.Delete setQuotaUser(String s)
        {
            return (Users.Cards.Delete)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.Delete setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.Delete setUserIp(String s)
        {
            return (Users.Cards.Delete)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.Delete(String s, String s1)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "DELETE", "users/{userId}/cards/{cardId}", null, java/lang/Void);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Users.Cards.Get extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Users.Cards this$2;
        private String userId;

        public HttpRequest buildHttpRequestUsingHead()
            throws IOException
        {
            return super.buildHttpRequestUsingHead();
        }

        public HttpResponse executeUsingHead()
            throws IOException
        {
            return super.executeUsingHead();
        }

        public String getCardId()
        {
            return cardId;
        }

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Get set(String s, Object obj)
        {
            return (Users.Cards.Get)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Get setAlt(String s)
        {
            return (Users.Cards.Get)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.Get setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Users.Cards.Get setFields(String s)
        {
            return (Users.Cards.Get)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.Get setKey(String s)
        {
            return (Users.Cards.Get)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.Get setOauthToken(String s)
        {
            return (Users.Cards.Get)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.Get setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.Get)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.Get setQuotaUser(String s)
        {
            return (Users.Cards.Get)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.Get setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.Get setUserIp(String s)
        {
            return (Users.Cards.Get)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.Get(String s, String s1)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "GET", "users/{userId}/cards/{cardId}", null, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Users.Cards.List extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        private Integer pageSize;
        private String pageToken;
        final Users.Cards this$2;
        private String userId;

        public HttpRequest buildHttpRequestUsingHead()
            throws IOException
        {
            return super.buildHttpRequestUsingHead();
        }

        public HttpResponse executeUsingHead()
            throws IOException
        {
            return super.executeUsingHead();
        }

        public Integer getPageSize()
        {
            return pageSize;
        }

        public String getPageToken()
        {
            return pageToken;
        }

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.List set(String s, Object obj)
        {
            return (Users.Cards.List)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.List setAlt(String s)
        {
            return (Users.Cards.List)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.List setFields(String s)
        {
            return (Users.Cards.List)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.List setKey(String s)
        {
            return (Users.Cards.List)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.List setOauthToken(String s)
        {
            return (Users.Cards.List)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.List setPageSize(Integer integer)
        {
            pageSize = integer;
            return this;
        }

        public Users.Cards.List setPageToken(String s)
        {
            pageToken = s;
            return this;
        }

        public Users.Cards.List setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.List)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.List setQuotaUser(String s)
        {
            return (Users.Cards.List)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.List setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.List setUserIp(String s)
        {
            return (Users.Cards.List)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.List(String s)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "GET", "users/{userId}/cards", null, com/google/api/services/now/model/ListCardsResponse);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Users.Cards.Patch extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Users.Cards this$2;
        private String userId;

        public String getCardId()
        {
            return cardId;
        }

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Patch set(String s, Object obj)
        {
            return (Users.Cards.Patch)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Patch setAlt(String s)
        {
            return (Users.Cards.Patch)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.Patch setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Users.Cards.Patch setFields(String s)
        {
            return (Users.Cards.Patch)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.Patch setKey(String s)
        {
            return (Users.Cards.Patch)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.Patch setOauthToken(String s)
        {
            return (Users.Cards.Patch)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.Patch setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.Patch)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.Patch setQuotaUser(String s)
        {
            return (Users.Cards.Patch)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.Patch setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.Patch setUserIp(String s)
        {
            return (Users.Cards.Patch)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.Patch(String s, String s1, Card card)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "PATCH", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Users.Cards.Update extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Users.Cards this$2;
        private String userId;

        public String getCardId()
        {
            return cardId;
        }

        public String getUserId()
        {
            return userId;
        }

        public volatile AbstractGoogleClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile AbstractGoogleJsonClientRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Update set(String s, Object obj)
        {
            return (Users.Cards.Update)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Users.Cards.Update setAlt(String s)
        {
            return (Users.Cards.Update)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Users.Cards.Update setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Users.Cards.Update setFields(String s)
        {
            return (Users.Cards.Update)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Users.Cards.Update setKey(String s)
        {
            return (Users.Cards.Update)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Users.Cards.Update setOauthToken(String s)
        {
            return (Users.Cards.Update)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Users.Cards.Update setPrettyPrint(Boolean boolean1)
        {
            return (Users.Cards.Update)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Users.Cards.Update setQuotaUser(String s)
        {
            return (Users.Cards.Update)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Users.Cards.Update setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Users.Cards.Update setUserIp(String s)
        {
            return (Users.Cards.Update)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Users.Cards.Update(String s, String s1, Card card)
        {
            this$2 = Users.Cards.this;
            super(_fld0, "PUT", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }


    public static final String DEFAULT_BASE_URL = "https://www.googleapis.com/now/v1/";
    public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";
    public static final String DEFAULT_SERVICE_PATH = "now/v1/";

    public Now(HttpTransport httptransport, JsonFactory jsonfactory, HttpRequestInitializer httprequestinitializer)
    {
        this(new Builder(httptransport, jsonfactory, httprequestinitializer));
    }

    Now(Builder builder)
    {
        super(builder);
    }

    public Contexts contexts()
    {
        return new Contexts();
    }

    protected void initialize(AbstractGoogleClientRequest abstractgoogleclientrequest)
        throws IOException
    {
        super.initialize(abstractgoogleclientrequest);
    }

    public Users users()
    {
        return new Users();
    }

    static 
    {
        boolean flag;
        if (GoogleUtils.MAJOR_VERSION.intValue() == 1 && GoogleUtils.MINOR_VERSION.intValue() >= 15)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.20.0-SNAPSHOT of the Google Now API library.", new Object[] {
            GoogleUtils.VERSION
        });
    }
}
