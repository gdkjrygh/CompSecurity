// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.google.gson.JsonObject;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApiResponse
{

    public static final int ACCESS_DENIED = 7;
    public static final int ACCOUNT_ALREADY_LINKED = 101;
    public static final List ACCOUNT_FAILURE = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(30), Integer.valueOf(80), Integer.valueOf(85), Integer.valueOf(102), Integer.valueOf(103)
    }));
    public static final int API_DOWN = 13;
    public static final int API_MEHTOD_NOT_FOUND = 11;
    public static final int AUTHENTICATION_FAILED = 2;
    public static final int AUTHENTICATION_LEVEL_INVALID = 4;
    public static final int AUTHORIZATION_FAILED = 3;
    public static final int BOARD_FOLLOW_BLOCKED = 43;
    public static final int BOARD_FOLLOW_BLOCKING = 44;
    public static final int BOARD_FOLLOW_FAILED = 42;
    public static final int BOARD_NOT_FOUND = 40;
    public static final int BOOKMARK_NOT_FOUND = 10;
    public static final int CATEGORY_NOT_FOUND = 41;
    public static final int COMMENT_BLOCKED = 231;
    public static final int COMMENT_BLOCKING = 232;
    public static final int COMMENT_FAILED = 230;
    public static final int COMMENT_NOT_FOUND = 120;
    public static final int DOMAIN_NOT_FOUND = 70;
    public static final int EMAIL_TAKEN = 91;
    public static final int FACEBOOK_LINK_NOT_FOUND = 102;
    public static final int FIND_FRIENDS_TRY_AGAIN = 110;
    public static final int INVALID_ACCESS_TOKEN = 100;
    public static final int INVALID_PARAMS = 1;
    public static final int INVALID_USERNAME = 90;
    public static final int INVITE_CODE_NOT_FOUND = 820;
    public static final int LIKE_BLOCKED = 211;
    public static final int LIKE_BLOCKING = 212;
    public static final int LIKE_FAILED = 210;
    public static final int LIKE_NOT_FOUND = 60;
    public static final int LIMIT_EXCEEDED = 8;
    public static final int LOGIN_BAD_PASSWORD = 80;
    public static final int LOGIN_BAD_PASSWORD_ASK_RESET = 85;
    public static final int LOGIN_INVALID_TOKEN = 81;
    public static final int METHOD_NOT_ALLOWED = 5;
    public static final int NOT_AUTHORIZATION = 6;
    public static final int NUX_FEED_NOT_READY = 220;
    public static final int PINVITATIONAL_INVALID_INVITE_CODE = 804;
    public static final int PINVITATIONAL_MISSING_INVITE_CODE = 802;
    public static final int PIN_NOT_FOUND = 50;
    public static final int PRIVATE_BOARD_LIMIT = 45;
    public static final int REPIN_BLOCKED = 201;
    public static final int REPIN_BLOCKING = 202;
    public static final int REPIN_FAILED = 200;
    public static final int SERVER_ERROR = 12;
    public static final int SPAM_CONTENT = 14;
    public static final int SPAM_SERVICE_BLOCK = 9;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 16;
    public static final int TWITTER_LINK_NOT_FOUND = 103;
    public static final int USERNAME_TAKEN = 92;
    public static final int USER_ALREADY_EXISTS = 31;
    public static final int USER_FOLLOW_BLOCKED = 33;
    public static final int USER_FOLLOW_BLOCKING = 34;
    public static final int USER_FOLLOW_FAILED = 32;
    public static final int USER_NOT_FOUND = 30;
    public static final int VALIDATION_ERROR = 15;
    public static final int WRITE_BANNED = 19;
    protected String _bookmark;
    protected int _code;
    protected Object _data;
    protected PinterestJsonObject _developerError;
    protected String _generatedAt;
    protected String _message;
    protected String _messageDetail;
    protected String _nagMessage;
    protected String _nagTheme;
    protected PinterestJsonArray _nags;
    protected String _status;

    public ApiResponse()
    {
        _code = -1;
    }

    public ApiResponse(PinterestJsonObject pinterestjsonobject)
    {
        int i;
        i = 0;
        super();
        _code = -1;
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        setStatus(pinterestjsonobject.a("status", ""));
        setCode(pinterestjsonobject.a("code", 0));
        setBookmark(pinterestjsonobject.a("bookmark", ""));
        setGeneratedAt(pinterestjsonobject.a("generated_at", ""));
        setMessage(pinterestjsonobject.a("message", ""));
        setMessageDetail(pinterestjsonobject.a("message_detail", ""));
        setNags(pinterestjsonobject.e("nags"));
        setDeveloperError(pinterestjsonobject.c("error"));
        setData(pinterestjsonobject.a.get("data"));
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("search_nag");
        if (pinterestjsonobject1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        pinterestjsonobject1 = pinterestjsonobject1.c("nag");
        if (pinterestjsonobject1 == null) goto _L1; else goto _L3
_L3:
        pinterestjsonobject = "";
        PinterestJsonArray pinterestjsonarray = pinterestjsonobject1.e("messages");
        Object obj = pinterestjsonobject;
        if (pinterestjsonarray.a() <= 0) goto _L5; else goto _L4
_L4:
        int j = pinterestjsonarray.a();
_L6:
        obj = pinterestjsonobject;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = pinterestjsonobject;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        obj = (new StringBuilder()).append(pinterestjsonobject).append("<br/><br/>").toString();
        pinterestjsonobject = (new StringBuilder()).append(((String) (obj))).append(pinterestjsonarray.a(i)).toString();
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        try
        {
            setNagMessage(((String) (obj)));
            setNagTheme(pinterestjsonobject1.a("theme", ""));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            CrashReporting.a(pinterestjsonobject);
        }
        return;
    }

    public final String getBookmark()
    {
        return _bookmark;
    }

    public final int getCode()
    {
        return _code;
    }

    public Object getData()
    {
        return _data;
    }

    public PinterestJsonObject getDeveloperError()
    {
        return _developerError;
    }

    public final String getGeneratedAt()
    {
        return _generatedAt;
    }

    public final String getMessage()
    {
        return _message;
    }

    public String getMessageDetail()
    {
        return _messageDetail;
    }

    public final String getMessageDetailIfExist()
    {
        if (ModelHelper.isValid(_messageDetail))
        {
            return _messageDetail;
        } else
        {
            return _message;
        }
    }

    public final String getMessageDisplay()
    {
        return _message;
    }

    public String getNagMessage()
    {
        return _nagMessage;
    }

    public String getNagTheme()
    {
        return _nagTheme;
    }

    public PinterestJsonArray getNags()
    {
        return _nags;
    }

    public final String getStatus()
    {
        return _status;
    }

    public final void setBookmark(String s)
    {
        _bookmark = s;
    }

    public final void setCode(int i)
    {
        _code = i;
    }

    public void setData(Object obj)
    {
        _data = PinterestJsonObject.a(obj);
    }

    public void setDeveloperError(PinterestJsonObject pinterestjsonobject)
    {
        _developerError = pinterestjsonobject;
    }

    public final void setGeneratedAt(String s)
    {
        _generatedAt = s;
    }

    public final void setMessage(String s)
    {
        _message = s;
    }

    public void setMessageDetail(String s)
    {
        _messageDetail = s;
    }

    public void setNagMessage(String s)
    {
        _nagMessage = s;
    }

    public void setNagTheme(String s)
    {
        _nagTheme = s;
    }

    public void setNags(PinterestJsonArray pinterestjsonarray)
    {
        _nags = pinterestjsonarray;
    }

    public final void setStatus(String s)
    {
        _status = s;
    }

    public String toString()
    {
        return (new StringBuilder("ApiResponse{_status='")).append(_status).append('\'').append(", _code=").append(_code).append(", _data=").append(_data).append(", _message=").append(getMessageDetailIfExist()).append('}').toString();
    }

    protected void update(ApiResponse apiresponse)
    {
        _bookmark = apiresponse.getBookmark();
        _code = apiresponse.getCode();
        _status = apiresponse.getStatus();
        _message = apiresponse.getMessage();
        _generatedAt = apiresponse.getGeneratedAt();
        _nags = apiresponse.getNags();
    }

}
