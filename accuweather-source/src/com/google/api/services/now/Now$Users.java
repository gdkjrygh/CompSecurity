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

public class this._cls0
{
    public class Cards
    {

        final Now.Users this$1;

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

        public Cards()
        {
            this$1 = Now.Users.this;
            super();
        }
    }

    public class Cards.Create extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        final Cards this$2;
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

        public Cards.Create set(String s, Object obj)
        {
            return (Cards.Create)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.Create setAlt(String s)
        {
            return (Cards.Create)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.Create setFields(String s)
        {
            return (Cards.Create)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.Create setKey(String s)
        {
            return (Cards.Create)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.Create setOauthToken(String s)
        {
            return (Cards.Create)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.Create setPrettyPrint(Boolean boolean1)
        {
            return (Cards.Create)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.Create setQuotaUser(String s)
        {
            return (Cards.Create)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.Create setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.Create setUserIp(String s)
        {
            return (Cards.Create)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.Create(String s, Card card)
        {
            this$2 = Cards.this;
            super(this$0, "POST", "users/{userId}/cards", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Cards.Delete extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Cards this$2;
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

        public Cards.Delete set(String s, Object obj)
        {
            return (Cards.Delete)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.Delete setAlt(String s)
        {
            return (Cards.Delete)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.Delete setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Cards.Delete setFields(String s)
        {
            return (Cards.Delete)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.Delete setKey(String s)
        {
            return (Cards.Delete)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.Delete setOauthToken(String s)
        {
            return (Cards.Delete)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.Delete setPrettyPrint(Boolean boolean1)
        {
            return (Cards.Delete)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.Delete setQuotaUser(String s)
        {
            return (Cards.Delete)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.Delete setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.Delete setUserIp(String s)
        {
            return (Cards.Delete)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.Delete(String s, String s1)
        {
            this$2 = Cards.this;
            super(this$0, "DELETE", "users/{userId}/cards/{cardId}", null, java/lang/Void);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Cards.Get extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Cards this$2;
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

        public Cards.Get set(String s, Object obj)
        {
            return (Cards.Get)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.Get setAlt(String s)
        {
            return (Cards.Get)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.Get setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Cards.Get setFields(String s)
        {
            return (Cards.Get)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.Get setKey(String s)
        {
            return (Cards.Get)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.Get setOauthToken(String s)
        {
            return (Cards.Get)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.Get setPrettyPrint(Boolean boolean1)
        {
            return (Cards.Get)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.Get setQuotaUser(String s)
        {
            return (Cards.Get)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.Get setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.Get setUserIp(String s)
        {
            return (Cards.Get)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.Get(String s, String s1)
        {
            this$2 = Cards.this;
            super(this$0, "GET", "users/{userId}/cards/{cardId}", null, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Cards.List extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards";
        private Integer pageSize;
        private String pageToken;
        final Cards this$2;
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

        public Cards.List set(String s, Object obj)
        {
            return (Cards.List)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.List setAlt(String s)
        {
            return (Cards.List)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.List setFields(String s)
        {
            return (Cards.List)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.List setKey(String s)
        {
            return (Cards.List)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.List setOauthToken(String s)
        {
            return (Cards.List)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.List setPageSize(Integer integer)
        {
            pageSize = integer;
            return this;
        }

        public Cards.List setPageToken(String s)
        {
            pageToken = s;
            return this;
        }

        public Cards.List setPrettyPrint(Boolean boolean1)
        {
            return (Cards.List)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.List setQuotaUser(String s)
        {
            return (Cards.List)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.List setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.List setUserIp(String s)
        {
            return (Cards.List)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.List(String s)
        {
            this$2 = Cards.this;
            super(this$0, "GET", "users/{userId}/cards", null, com/google/api/services/now/model/ListCardsResponse);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
        }
    }

    public class Cards.Patch extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Cards this$2;
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

        public Cards.Patch set(String s, Object obj)
        {
            return (Cards.Patch)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.Patch setAlt(String s)
        {
            return (Cards.Patch)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.Patch setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Cards.Patch setFields(String s)
        {
            return (Cards.Patch)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.Patch setKey(String s)
        {
            return (Cards.Patch)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.Patch setOauthToken(String s)
        {
            return (Cards.Patch)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.Patch setPrettyPrint(Boolean boolean1)
        {
            return (Cards.Patch)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.Patch setQuotaUser(String s)
        {
            return (Cards.Patch)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.Patch setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.Patch setUserIp(String s)
        {
            return (Cards.Patch)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.Patch(String s, String s1, Card card)
        {
            this$2 = Cards.this;
            super(this$0, "PATCH", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }

    public class Cards.Update extends NowRequest
    {

        private static final String REST_PATH = "users/{userId}/cards/{cardId}";
        private String cardId;
        final Cards this$2;
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

        public Cards.Update set(String s, Object obj)
        {
            return (Cards.Update)super.set(s, obj);
        }

        public volatile NowRequest set(String s, Object obj)
        {
            return set(s, obj);
        }

        public Cards.Update setAlt(String s)
        {
            return (Cards.Update)super.setAlt(s);
        }

        public volatile NowRequest setAlt(String s)
        {
            return setAlt(s);
        }

        public Cards.Update setCardId(String s)
        {
            cardId = s;
            return this;
        }

        public Cards.Update setFields(String s)
        {
            return (Cards.Update)super.setFields(s);
        }

        public volatile NowRequest setFields(String s)
        {
            return setFields(s);
        }

        public Cards.Update setKey(String s)
        {
            return (Cards.Update)super.setKey(s);
        }

        public volatile NowRequest setKey(String s)
        {
            return setKey(s);
        }

        public Cards.Update setOauthToken(String s)
        {
            return (Cards.Update)super.setOauthToken(s);
        }

        public volatile NowRequest setOauthToken(String s)
        {
            return setOauthToken(s);
        }

        public Cards.Update setPrettyPrint(Boolean boolean1)
        {
            return (Cards.Update)super.setPrettyPrint(boolean1);
        }

        public volatile NowRequest setPrettyPrint(Boolean boolean1)
        {
            return setPrettyPrint(boolean1);
        }

        public Cards.Update setQuotaUser(String s)
        {
            return (Cards.Update)super.setQuotaUser(s);
        }

        public volatile NowRequest setQuotaUser(String s)
        {
            return setQuotaUser(s);
        }

        public Cards.Update setUserId(String s)
        {
            userId = s;
            return this;
        }

        public Cards.Update setUserIp(String s)
        {
            return (Cards.Update)super.setUserIp(s);
        }

        public volatile NowRequest setUserIp(String s)
        {
            return setUserIp(s);
        }

        protected Cards.Update(String s, String s1, Card card)
        {
            this$2 = Cards.this;
            super(this$0, "PUT", "users/{userId}/cards/{cardId}", card, com/google/api/services/now/model/Card);
            userId = (String)Preconditions.checkNotNull(s, "Required parameter userId must be specified.");
            cardId = (String)Preconditions.checkNotNull(s1, "Required parameter cardId must be specified.");
        }
    }


    final Now this$0;

    public Cards cards()
    {
        return new Cards();
    }

    public Cards.this._cls1()
    {
        this$0 = Now.this;
        super();
    }
}
