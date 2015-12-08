// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.services.now.model.Card;
import com.google.api.services.now.model.ListCardsResponse;
import java.io.IOException;

// Referenced classes of package com.google.api.services.now:
//            Now, NowRequest

public class this._cls1
{
    public class Create extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        final Now.Users.Cards this$2;
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

        public Create set(String s, Object obj)
        {
            return (Create)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Create setAlt(String s)
        {
            return (Create)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Create setFields(String s)
        {
            return (Create)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Create setKey(String s)
        {
            return (Create)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Create setOauthToken(String s)
        {
            return (Create)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Create setPrettyPrint(Boolean boolean1)
        {
            return (Create)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Create setQuotaUser(String s)
        {
            return (Create)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Create setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Create setUserIp(String s)
        {
            return (Create)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Create(String s, Card card)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "POST", "users/{userId}/cards", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Delete extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Now.Users.Cards this$2;
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

        public Delete set(String s, Object obj)
        {
            return (Delete)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Delete setAlt(String s)
        {
            return (Delete)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Delete setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Delete setFields(String s)
        {
            return (Delete)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Delete setKey(String s)
        {
            return (Delete)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Delete setOauthToken(String s)
        {
            return (Delete)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Delete setPrettyPrint(Boolean boolean1)
        {
            return (Delete)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Delete setQuotaUser(String s)
        {
            return (Delete)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Delete setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Delete setUserIp(String s)
        {
            return (Delete)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Delete(String s, String s1)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "DELETE", "users/{userId}/cards/{cardId}", null, java/lang/Void);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Get extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Now.Users.Cards this$2;
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

        public Get set(String s, Object obj)
        {
            return (Get)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Get setAlt(String s)
        {
            return (Get)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Get setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Get setFields(String s)
        {
            return (Get)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Get setKey(String s)
        {
            return (Get)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Get setOauthToken(String s)
        {
            return (Get)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Get setPrettyPrint(Boolean boolean1)
        {
            return (Get)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Get setQuotaUser(String s)
        {
            return (Get)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Get setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Get setUserIp(String s)
        {
            return (Get)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Get(String s, String s1)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "GET", "users/{userId}/cards/{cardId}", null, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class List extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        private Integer pageSize;
        private String pageToken;
        final Now.Users.Cards this$2;
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

        public List set(String s, Object obj)
        {
            return (List)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public List setAlt(String s)
        {
            return (List)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public List setFields(String s)
        {
            return (List)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public List setKey(String s)
        {
            return (List)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public List setOauthToken(String s)
        {
            return (List)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public List setPageSize(Integer integer)
        {
            pageSize = integer;
            return this;
        }

        public List setPageToken(String s)
        {
            pageToken = s;
            return this;
        }

        public List setPrettyPrint(Boolean boolean1)
        {
            return (List)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public List setQuotaUser(String s)
        {
            return (List)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public List setUserId(String s)
        {
            userId = s;
            return this;
        }

        public List setUserIp(String s)
        {
            return (List)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected List(String s)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "GET", "users/{userId}/cards", null, com/google/api/services/now/model/ListCardsResponse);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Patch extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Now.Users.Cards this$2;
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

        public Patch set(String s, Object obj)
        {
            return (Patch)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Patch setAlt(String s)
        {
            return (Patch)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Patch setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Patch setFields(String s)
        {
            return (Patch)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Patch setKey(String s)
        {
            return (Patch)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Patch setOauthToken(String s)
        {
            return (Patch)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Patch setPrettyPrint(Boolean boolean1)
        {
            return (Patch)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Patch setQuotaUser(String s)
        {
            return (Patch)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Patch setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Patch setUserIp(String s)
        {
            return (Patch)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Patch(String s, String s1, Card card)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "PATCH", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Update extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Now.Users.Cards this$2;
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

        public Update set(String s, Object obj)
        {
            return (Update)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Update setAlt(String s)
        {
            return (Update)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Update setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Update setFields(String s)
        {
            return (Update)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Update setKey(String s)
        {
            return (Update)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Update setOauthToken(String s)
        {
            return (Update)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Update setPrettyPrint(Boolean boolean1)
        {
            return (Update)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Update setQuotaUser(String s)
        {
            return (Update)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Update setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Update setUserIp(String s)
        {
            return (Update)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Update(String s, String s1, Card card)
        {
            this$2 = Now.Users.Cards.this;
            super(this$0, "PUT", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Pre