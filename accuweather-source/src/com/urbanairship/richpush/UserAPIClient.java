// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.richpush;

import android.content.ContentValues;
import com.urbanairship.AirshipConfigOptions;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.http.Request;
import com.urbanairship.http.RequestFactory;
import com.urbanairship.http.Response;
import com.urbanairship.util.UAStringUtil;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.richpush:
//            UserResponse, MessageListResponse

class UserAPIClient
{

    private static final String DELETE_MESSAGES_PATH = "api/user/%s/messages/delete/";
    private static final String MARK_READ_MESSAGES_PATH = "api/user/%s/messages/unread/";
    private static final String MESSAGES_PATH = "api/user/%s/messages/";
    private static final String USER_CREATION_PATH = "api/user/";
    private static final String USER_UPDATE_PATH = "api/user/%s/";
    private RequestFactory requestFactory;

    UserAPIClient()
    {
        this(new RequestFactory());
    }

    UserAPIClient(RequestFactory requestfactory)
    {
        requestFactory = requestfactory;
    }

    private transient URL getUserURL(String s, Object aobj[])
    {
        String s1 = UAirship.shared().getAirshipConfigOptions().hostURL;
        s = String.format((new StringBuilder()).append(s1).append(s).toString(), aobj);
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error("Invalid userURL", s);
            return null;
        }
        return s;
    }

    private ContentValues[] messagesFromResponse(String s)
        throws JSONException
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        JSONArray jsonarray = (new JSONObject(s)).getJSONArray("messages");
        int j = jsonarray.length();
        ContentValues acontentvalues[] = new ContentValues[j];
        int i = 0;
        do
        {
            s = acontentvalues;
            if (i >= j)
            {
                continue;
            }
            s = jsonarray.getJSONObject(i);
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("timestamp", s.getString("message_sent"));
            contentvalues.put("message_id", s.getString("message_id"));
            contentvalues.put("message_url", s.getString("message_url"));
            contentvalues.put("message_body_url", s.getString("message_body_url"));
            contentvalues.put("message_read_url", s.getString("message_read_url"));
            contentvalues.put("title", s.getString("title"));
            contentvalues.put("unread_orig", Boolean.valueOf(s.getBoolean("unread")));
            contentvalues.put("extra", s.getJSONObject("extra").toString());
            contentvalues.put("raw_message_object", s.toString());
            if (s.has("message_expiry"))
            {
                contentvalues.put("expiration_timestamp", s.getString("message_expiry"));
            }
            acontentvalues[i] = contentvalues;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    UserResponse createUser(JSONObject jsonobject)
    {
        String s = UAirship.shared().getAirshipConfigOptions().getAppKey();
        String s2 = UAirship.shared().getAirshipConfigOptions().getAppSecret();
        URL url = getUserURL("api/user/", new Object[0]);
        if (url == null)
        {
            return null;
        }
        Logger.verbose((new StringBuilder()).append("Creating Rich Push user with payload: ").append(jsonobject).toString());
        jsonobject = requestFactory.createRequest("POST", url).setCredentials(s, s2).setRequestBody(jsonobject.toString(), "application/json").setHeader("Accept", "application/vnd.urbanairship+json; version=3;").execute();
        if (jsonobject == null)
        {
            Logger.verbose("Failed to receive response for Rich Push user creation.");
            return null;
        }
        if (jsonobject.getStatus() == 201)
        {
            String s1;
            String s3;
            try
            {
                s1 = (new JSONObject(jsonobject.getResponseBody())).getString("user_id");
                s3 = (new JSONObject(jsonobject.getResponseBody())).getString("password");
            }
            catch (JSONException jsonexception)
            {
                Logger.error((new StringBuilder()).append("Unable to parse Rich Push user response: ").append(jsonobject).toString());
                return null;
            }
            return new UserResponse(s1, s3);
        } else
        {
            Logger.verbose((new StringBuilder()).append("Rich Push user creation failed: ").append(jsonobject).toString());
            return null;
        }
    }

    boolean deleteMessages(JSONObject jsonobject, String s, String s1)
    {
        boolean flag = true;
        if (UAStringUtil.isEmpty(s) || UAStringUtil.isEmpty(s1))
        {
            Logger.error("Unable to delete messages with a null userId or null userToken.");
        } else
        {
            URL url = getUserURL("api/user/%s/messages/delete/", new Object[] {
                s
            });
            if (url != null)
            {
                Logger.verbose((new StringBuilder()).append("Deleting inbox messages with payload: ").append(jsonobject).toString());
                jsonobject = requestFactory.createRequest("POST", url).setCredentials(s, s1).setRequestBody(jsonobject.toString(), "application/json").setHeader("Accept", "application/vnd.urbanairship+json; version=3;").execute();
                Logger.verbose((new StringBuilder()).append("Delete inbox messages response: ").append(jsonobject).toString());
                if (jsonobject == null || jsonobject.getStatus() != 200)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    MessageListResponse getMessages(String s, String s1, long l)
    {
        if (UAStringUtil.isEmpty(s) || UAStringUtil.isEmpty(s1))
        {
            Logger.error("Unable to get messages with a null userId or null userToken.");
        } else
        {
            URL url = getUserURL("api/user/%s/messages/", new Object[] {
                s
            });
            if (url != null)
            {
                Logger.verbose("Fetching inbox messages.");
                s = requestFactory.createRequest("GET", url).setCredentials(s, s1).setHeader("Accept", "application/vnd.urbanairship+json; version=3;").setIfModifiedSince(l).execute();
                Logger.verbose((new StringBuilder()).append("Fetch inbox messages response: ").append(s).toString());
                if (s != null)
                {
                    try
                    {
                        s = new MessageListResponse(messagesFromResponse(s.getResponseBody()), s.getStatus(), s.getLastModifiedTime());
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        Logger.error("Unable to parse messages.");
                        return null;
                    }
                    return s;
                }
            }
        }
        return null;
    }

    boolean markMessagesRead(JSONObject jsonobject, String s, String s1)
    {
        boolean flag = true;
        if (UAStringUtil.isEmpty(s) || UAStringUtil.isEmpty(s1))
        {
            Logger.error("Unable to mark messages read with a null userId or null userToken.");
        } else
        {
            URL url = getUserURL("api/user/%s/messages/unread/", new Object[] {
                s
            });
            if (url != null)
            {
                Logger.verbose((new StringBuilder()).append("Marking inbox messages read request with payload: ").append(jsonobject).toString());
                jsonobject = requestFactory.createRequest("POST", url).setCredentials(s, s1).setRequestBody(jsonobject.toString(), "application/json").setHeader("Accept", "application/vnd.urbanairship+json; version=3;").execute();
                Logger.verbose((new StringBuilder()).append("Mark inbox messages read response: ").append(jsonobject).toString());
                if (jsonobject == null || jsonobject.getStatus() != 200)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }

    boolean updateUser(JSONObject jsonobject, String s, String s1)
    {
        boolean flag = true;
        if (UAStringUtil.isEmpty(s) || UAStringUtil.isEmpty(s1))
        {
            Logger.error("Unable to update user with a null userId or null userToken.");
        } else
        {
            URL url = getUserURL("api/user/%s/", new Object[] {
                s
            });
            if (url != null)
            {
                Logger.verbose((new StringBuilder()).append("Updating user with payload: ").append(jsonobject).toString());
                jsonobject = requestFactory.createRequest("POST", url).setCredentials(s, s1).setRequestBody(jsonobject.toString(), "application/json").setHeader("Accept", "application/vnd.urbanairship+json; version=3;").execute();
                Logger.verbose((new StringBuilder()).append("Update Rich Push user response: ").append(jsonobject).toString());
                if (jsonobject == null || jsonobject.getStatus() != 200)
                {
                    flag = false;
                }
                return flag;
            }
        }
        return false;
    }
}
