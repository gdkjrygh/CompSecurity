// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Application;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.util.j;
import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.SkyLib;
import com.skype.android.app.token.SkypeTokenAccess;
import com.skype.android.app.token.SkypeTokenCallback;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.FileUtil;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.Charsets;
import com.skype.android.util.HttpUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import org.json.JSONObject;

public class JoinRequestHelper
    implements SkypeTokenCallback
{
    private static final class a
    {

        final String address;
        final AsyncCallback callback;
        final Conversation conversation;
        final boolean isPhone;
        String url;

        a(Conversation conversation1, AsyncCallback asynccallback, String s, boolean flag)
        {
            conversation = conversation1;
            callback = asynccallback;
            address = s;
            isPhone = flag;
        }
    }


    private static final String EXTRA_SMS_BODY = "sms_body";
    private static final String GOOGLE_PLAY_URI = "https://play.google.com/store/apps/details?id=com.skype.raider";
    private static final String HTTPS_SCHEME = "https";
    private static final String KEY_ACCEPT = "Accept";
    private static final String KEY_ACCEPT_ENCODING = "Accept-Encoding";
    private static final String KEY_BASE_DOMAIN = "baseDomain";
    private static final String KEY_CONTENT_SIZE = "Content-Size";
    private static final String KEY_CONTENT_TYPE = "Content-Type";
    private static final String KEY_JOIN_URL = "JoinUrl";
    private static final String KEY_SKYPETOKEN = "X-Skypetoken";
    private static final String KEY_THREAD_ID = "threadId";
    private static final String METHOD_POST = "POST";
    private static final String REFERRER_KEY = "referrer";
    private static final String REFERRER_VALUE = "utm_source=invite&utm_content=";
    private static final String SCHEME_EMAIL = "mailto";
    private static final String SCHEME_SMS = "sms";
    private static final String THREADS_ENDPOINT = "api.scheduler.skype.com";
    private static final String THREADS_PATH = "threads";
    private static final String VALUE_ACCEPT_DEFLATE = "deflate";
    private static final String VALUE_BASE_DOMAIN_URI = "https://join.skype.com/launch/";
    private static final String VALUE_CONTENT_TYPE_JSON = "application/json; charset=utf-8";
    private final AsyncService asyncService;
    private j completedRequest;
    private HttpUtil httpUtil;
    private SkyLib lib;
    private Logger log;
    private ObjectIdMap map;
    private j outboundRequests;
    private final Resources resources;
    private String skypeToken;

    public JoinRequestHelper(HttpUtil httputil, SkypeTokenAccess skypetokenaccess, SkyLib skylib, ObjectIdMap objectidmap, AsyncService asyncservice, Application application)
    {
        log = Logger.getLogger("JoinRequestHelper");
        outboundRequests = new j();
        completedRequest = new j();
        httpUtil = httputil;
        lib = skylib;
        map = objectidmap;
        asyncService = asyncservice;
        resources = application.getResources();
        (new EventSubscriberBinder(EventBusInstance.a(), this)).bind();
        skypetokenaccess.requestSkypeToken(this);
    }

    private String getConversationIdentity(Conversation conversation)
    {
        String s1 = conversation.getAltIdentityProp();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = conversation.getIdentityProp();
        }
        return s;
    }

    private void getInviteIntentAsync(final a request)
    {
        final String identity = getConversationIdentity(request.conversation);
        if (isJoinableIdentity(identity))
        {
            asyncService.a(new Callable() {

                final JoinRequestHelper this$0;
                final String val$identity;
                final a val$request;

                public final Intent call()
                    throws Exception
                {
                    String s = requestJoinUrl(identity);
                    if (s == null)
                    {
                        throw new RuntimeException("Failed to get JoinUrl!");
                    } else
                    {
                        request.url = s;
                        completedRequest.a(request.conversation.getObjectID(), request);
                        return getJoinIntentToShare(s, request.address, request.isPhone);
                    }
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = JoinRequestHelper.this;
                identity = s;
                request = a1;
                super();
            }
            }, request.callback);
            return;
        } else
        {
            waitFor(request);
            return;
        }
    }

    private Future requestJoinUrlAsync(final String identity, AsyncCallback asynccallback)
    {
        return asyncService.a(new Callable() {

            final JoinRequestHelper this$0;
            final String val$identity;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final String call()
                throws Exception
            {
                return requestJoinUrl(identity);
            }

            
            {
                this$0 = JoinRequestHelper.this;
                identity = s;
                super();
            }
        }, asynccallback);
    }

    private a stopWaitingFor(int i)
    {
        j j1 = outboundRequests;
        j1;
        JVM INSTR monitorenter ;
        a a1 = (a)outboundRequests.a(i);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        outboundRequests.c(i);
        j1;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void waitFor(a a1)
    {
        synchronized (outboundRequests)
        {
            outboundRequests.a(a1.conversation.getObjectID(), a1);
        }
        return;
        a1;
        j1;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private boolean waitingFor(int i)
    {
        j j1 = outboundRequests;
        j1;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (outboundRequests.a(i) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        j1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean canCreateJoinUrl(Conversation conversation)
    {
        return isJoinableIdentity(getConversationIdentity(conversation));
    }

    public Conversation createJoinableConversation(String s)
    {
        ConversationImpl conversationimpl = new ConversationImpl();
        if (lib.createConference(conversationimpl))
        {
            map.b(conversationimpl);
            map.a(conversationimpl);
            conversationimpl.setTopic(s);
            conversationimpl.join();
            conversationimpl.setOption(PROPKEY.CONVERSATION_OPT_JOINING_ENABLED, 1);
            return conversationimpl;
        } else
        {
            return null;
        }
    }

    public Intent getCompletedShareIntent(int i)
    {
        a a1 = (a)completedRequest.a(i);
        if (a1 != null)
        {
            return getJoinIntentToShare(a1.url, a1.address, a1.isPhone);
        } else
        {
            return null;
        }
    }

    public void getInviteIntentAsync(Conversation conversation, final String address, final boolean isPhone, AsyncCallback asynccallback)
    {
        final a request = (a)completedRequest.a(conversation.getObjectID());
        if (request != null)
        {
            asyncService.a(new Callable() {

                final JoinRequestHelper this$0;
                final String val$address;
                final boolean val$isPhone;
                final a val$request;

                public final Intent call()
                    throws Exception
                {
                    return getJoinIntentToShare(request.url, address, isPhone);
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = JoinRequestHelper.this;
                request = a1;
                address = s;
                isPhone = flag;
                super();
            }
            }, asynccallback);
            return;
        } else
        {
            getInviteIntentAsync(new a(conversation, asynccallback, address, isPhone));
            return;
        }
    }

    public Intent getJoinIntentToShare(String s, String s1, boolean flag)
    {
        Uri.parse("https://play.google.com/store/apps/details?id=com.skype.raider").buildUpon().appendQueryParameter("referrer", (new StringBuilder("utm_source=invite&utm_content=")).append(s).toString());
        StringBuilder stringbuilder = new StringBuilder(resources.getString(0x7f080572, new Object[] {
            s
        }));
        StringBuilder stringbuilder1 = new StringBuilder();
        if (flag)
        {
            s = "sms";
        } else
        {
            s = "mailto";
        }
        s = new Intent("android.intent.action.VIEW", Uri.parse(stringbuilder1.append(s).append(':').append(s1).toString()));
        if (flag)
        {
            s.putExtra("sms_body", stringbuilder.toString());
        } else
        {
            s.putExtra("android.intent.extra.SUBJECT", resources.getString(0x7f080571));
        }
        s.putExtra("android.intent.extra.TEXT", stringbuilder.toString());
        return s;
    }

    public String getJoinUrl(Conversation conversation)
    {
        Object obj = null;
        String s = getConversationIdentity(conversation);
        conversation = obj;
        if (isJoinableIdentity(s))
        {
            conversation = requestJoinUrl(s);
        }
        return conversation;
    }

    boolean isJoinableIdentity(String s)
    {
        return s != null && s.startsWith("19:");
    }

    public boolean onAcceptEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_IDENTITY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONVERSATION_ALT_IDENTITY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.PROPKEY[onpropertychange.getPropKey().ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            return waitingFor(onpropertychange.getSender().getObjectID());
        }
    }

    public void onEvent(com.skype.android.gen.ConversationListener.OnPropertyChange onpropertychange)
    {
        Conversation conversation = (Conversation)onpropertychange.getSender();
        if (waitingFor(conversation.getObjectID()) && canCreateJoinUrl(conversation))
        {
            getInviteIntentAsync(stopWaitingFor(onpropertychange.getSender().getObjectID()));
        }
    }

    public void onSkypeTokenRetrieved(String s)
    {
        skypeToken = s;
    }

    String requestJoinUrl(String s)
    {
        byte abyte0[];
        int i;
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("threadId", s);
        jsonobject.put("baseDomain", "https://join.skype.com/launch/");
        abyte0 = jsonobject.toString().getBytes(Charsets.a);
        i = abyte0.length;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        obj5 = null;
        s = null;
        obj3 = null;
        obj4 = null;
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        Object obj6 = new android.net.Uri.Builder();
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((android.net.Uri.Builder) (obj6)).scheme("https").authority("api.scheduler.skype.com").appendPath("threads");
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        obj6 = httpUtil.a(((android.net.Uri.Builder) (obj6)).build().toString());
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).setRequestMethod("POST");
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).addRequestProperty("Accept", "deflate");
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).addRequestProperty("Content-Type", "application/json; charset=utf-8");
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).addRequestProperty("Content-Size", Integer.toString(i));
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).addRequestProperty("X-Skypetoken", skypeToken);
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).addRequestProperty("Accept-Encoding", "deflate");
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).setUseCaches(false);
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).setDoOutput(true);
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        ((HttpURLConnection) (obj6)).setDoInput(true);
        obj1 = obj3;
        obj = s;
        obj2 = obj5;
        s = ((HttpURLConnection) (obj6)).getOutputStream();
        obj1 = obj3;
        obj = s;
        obj2 = s;
        obj3 = new BufferedOutputStream(s);
        ((BufferedOutputStream) (obj3)).write(abyte0);
        ((BufferedOutputStream) (obj3)).flush();
        obj = null;
        obj1 = httpUtil.a(((HttpURLConnection) (obj6)));
        obj = obj1;
_L4:
        obj = (new JSONObject(((String) (obj)))).optString("JoinUrl");
        FileUtil.closeStream(s);
        FileUtil.closeStream(((java.io.Closeable) (obj3)));
        return ((String) (obj));
        obj1;
        obj1 = new BufferedInputStream(((HttpURLConnection) (obj6)).getErrorStream());
        obj2 = new StringBuilder();
_L3:
        char c = (char)((BufferedInputStream) (obj1)).read();
        if (c == '\uFFFF') goto _L2; else goto _L1
_L1:
        ((StringBuilder) (obj2)).append(c);
          goto _L3
        obj1;
        obj = obj3;
        obj2 = s;
        obj3 = obj1;
        s = ((String) (obj));
_L6:
        obj1 = s;
        obj = obj2;
        ((Exception) (obj3)).printStackTrace();
        obj1 = s;
        obj = obj2;
        throw obj3;
        Exception exception;
        exception;
        s = ((String) (obj));
_L5:
        try
        {
            FileUtil.closeStream(s);
            FileUtil.closeStream(((java.io.Closeable) (obj1)));
            throw exception;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        return null;
_L2:
        log.warning((new StringBuilder("request failure:")).append(((HttpURLConnection) (obj6)).getResponseCode()).append(':').append(exception.toString()).toString());
          goto _L4
        exception;
        obj1 = obj3;
          goto _L5
        obj3;
        s = obj4;
          goto _L6
    }

}
