// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.Intent;
import android.net.Uri;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.StringUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Payload
{
    public static class Action
    {

        public static final String ADD2QUEUE = "ADD2QUEUE";
        public static final String CUSTOM = "CUSTOM";
        public static final String MDP = "MDP";
        public static final String PLAY = "PLAY";
        public String guid;
        public String icon;
        public String key;
        public String payload;
        public String text;

        public static boolean isSupportedActionKey(String s)
        {
            while (s == null || !"MDP".equals(s) && !"PLAY".equals(s) && !"ADD2QUEUE".equals(s) && !"CUSTOM".equals(s)) 
            {
                return false;
            }
            return true;
        }

        public int getIcon()
        {
            return 0x7f0200de;
        }

        public Uri getPayload()
        {
            Uri uri;
            try
            {
                uri = Payload.parsePayload(payload, key);
            }
            catch (Throwable throwable)
            {
                Log.e("nf_push", (new StringBuilder()).append("Action.Payload URI is wrong: ").append(payload).toString(), throwable);
                return null;
            }
            return uri;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Action [key=").append(key).append(", text=").append(text).append(", payload=").append(payload).append(", icon=").append(icon).append("]").toString();
        }

        public Action(String s)
        {
            guid = s;
        }
    }


    private static final String ACTION_HOME = "action=home&source=pn";
    private static final String BROWSE = "nflx://www.netflix.com/Browse?q=";
    public static final String DEFAULT_sound_KEY = "default";
    public static final String PARAM_GUID = "guid";
    public static final String PARAM_MESSAGE_GUID = "messageGuid";
    public static final String PARAM_ORIGINATOR = "originator";
    private static final String PARAM_actionIcon = "actionIcon.";
    private static final String PARAM_actionKey = "actionKey.";
    private static final String PARAM_actionPayload = "actionPayload.";
    private static final String PARAM_actionText = "actionText.";
    private static final String PARAM_bigViewPicture = "bigViewPicture";
    private static final String PARAM_bigViewSummary = "bigViewSummary";
    private static final String PARAM_bigViewText = "bigViewText";
    private static final String PARAM_bigViewTitle = "bigViewTitle";
    private static final String PARAM_defaultActionKey = "defaultActionKey";
    private static final String PARAM_defaultActionPayload = "defaultActionPayload";
    private static final String PARAM_info = "info";
    private static final String PARAM_largeIcon = "largeIcon";
    private static final String PARAM_ledColor = "ledColor";
    private static final String PARAM_smallIcon = "smallIcon";
    private static final String PARAM_sound = "sound";
    private static final String PARAM_subtext = "subtext";
    private static final String PARAM_text = "text";
    private static final String PARAM_ticker = "ticker";
    private static final String PARAM_title = "title";
    private static final String PARAM_vibrate = "vibrate";
    private static final String PARAM_when = "when";
    private static final String PROTOCOL_HTTP = "http://";
    private static final String PROTOCOL_HTTPS = "https://";
    private static final String PROTOCOL_NFLX = "nflx://";
    private static final String TAG = "nf_push";
    private static final String TARGET_URL = "target_url=";
    protected List actions;
    public String bigViewPicture;
    public String bigViewSummary;
    public String bigViewText;
    public String bigViewTitle;
    public String defaultActionKey;
    private String defaultActionPayload;
    public String guid;
    public String info;
    public String largeIcon;
    public int ledColor;
    public String messageGuid;
    public String originator;
    public String smallIcon;
    public String sound;
    public String subtext;
    public String text;
    private String ticker;
    private String title;
    public String vibrate;
    private long when;

    public Payload(Intent intent)
    {
        actions = new ArrayList();
        if (intent.hasExtra("bigViewPicture"))
        {
            bigViewPicture = intent.getStringExtra("bigViewPicture");
        }
        if (intent.hasExtra("bigViewSummary"))
        {
            bigViewSummary = intent.getStringExtra("bigViewSummary");
        }
        if (intent.hasExtra("bigViewText"))
        {
            bigViewText = intent.getStringExtra("bigViewText");
        }
        if (intent.hasExtra("bigViewTitle"))
        {
            bigViewTitle = intent.getStringExtra("bigViewTitle");
        }
        if (intent.hasExtra("defaultActionKey"))
        {
            defaultActionKey = intent.getStringExtra("defaultActionKey");
        }
        if (intent.hasExtra("defaultActionPayload"))
        {
            defaultActionPayload = intent.getStringExtra("defaultActionPayload");
        }
        if (intent.hasExtra("info"))
        {
            info = intent.getStringExtra("info");
        }
        if (intent.hasExtra("largeIcon"))
        {
            largeIcon = intent.getStringExtra("largeIcon");
        }
        if (intent.hasExtra("smallIcon"))
        {
            smallIcon = intent.getStringExtra("smallIcon");
        }
        if (intent.hasExtra("ledColor"))
        {
            ledColor = intent.getIntExtra("ledColor", 0);
        }
        if (intent.hasExtra("sound"))
        {
            sound = intent.getStringExtra("sound");
        }
        if (intent.hasExtra("subtext"))
        {
            subtext = intent.getStringExtra("subtext");
        }
        if (intent.hasExtra("text"))
        {
            text = intent.getStringExtra("text");
        }
        if (intent.hasExtra("ticker"))
        {
            ticker = intent.getStringExtra("ticker");
        }
        if (intent.hasExtra("title"))
        {
            title = intent.getStringExtra("title");
        }
        if (intent.hasExtra("vibrate"))
        {
            vibrate = intent.getStringExtra("vibrate");
        }
        if (intent.hasExtra("when"))
        {
            when = intent.getLongExtra("when", 0L);
        }
        if (intent.hasExtra("guid"))
        {
            guid = intent.getStringExtra("guid");
        }
        if (intent.hasExtra("messageGuid"))
        {
            messageGuid = intent.getStringExtra("messageGuid");
        }
        originator = extractOriginator(defaultActionPayload);
        for (int i = 0; i > -1;)
        {
            String s = (new StringBuilder()).append("actionKey.").append(i).toString();
            if (intent.hasExtra(s))
            {
                Action action = new Action(guid);
                action.key = intent.getStringExtra(s);
                s = (new StringBuilder()).append("actionIcon.").append(i).toString();
                if (intent.hasExtra(s))
                {
                    action.icon = intent.getStringExtra(s);
                }
                s = (new StringBuilder()).append("actionPayload.").append(i).toString();
                if (intent.hasExtra(s))
                {
                    action.payload = intent.getStringExtra(s);
                }
                s = (new StringBuilder()).append("actionText.").append(i).toString();
                if (intent.hasExtra(s))
                {
                    action.text = intent.getStringExtra(s);
                }
                i++;
                if (action.payload == null || action.text == null || !Action.isSupportedActionKey(action.key))
                {
                    Log.e("nf_push", (new StringBuilder()).append("Invalid action: ").append(action).toString());
                } else
                {
                    actions.add(action);
                }
            } else
            {
                i = -1;
            }
        }

        validate();
    }

    private static String extractOriginator(String s)
    {
        int i;
        int j;
        int k;
        if (s != null)
        {
            if ((i = s.toLowerCase().indexOf("source=")) >= 0 && (j = i + 7) < s.length() && (k = i - 1) >= 0)
            {
                k = s.charAt(k);
                if (k == '?' || k == '&')
                {
                    s = s.substring(j);
                    i = s.indexOf('&');
                    if (i < 0)
                    {
                        return s.trim();
                    } else
                    {
                        return s.substring(0, i);
                    }
                }
                i += 7;
                if (i < s.length())
                {
                    return extractOriginator(s.substring(i));
                }
            }
        }
        return null;
    }

    private static Uri parsePayload(String s, String s1)
        throws UnsupportedEncodingException
    {
        if (StringUtils.isEmpty(s))
        {
            Log.d("nf_push", "Empty payload, return URI that will launch our application to HOME page");
            s = (new StringBuilder()).append("nflx://www.netflix.com/Browse?q=").append(URLEncoder.encode("action=home&source=pn", "UTF-8")).toString();
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload for home page ").append(s).toString());
            }
            return Uri.parse(s);
        }
        if (s1 != null && "CUSTOM".equalsIgnoreCase(s1.trim()))
        {
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Custom action. Just pass through ").append(s).toString());
            }
            return Uri.parse(s);
        }
        if (s.toLowerCase(Locale.US).startsWith("nflx://"))
        {
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload using nflx. Just pass through: ").append(s).toString());
            }
            s = (new StringBuilder()).append("nflx://www.netflix.com/Browse?q=").append(URLEncoder.encode((new StringBuilder()).append("target_url=").append(s).toString(), "UTF-8")).toString();
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload for MDP page ").append(s).toString());
            }
            return Uri.parse(s);
        }
        if (s.toLowerCase(Locale.US).startsWith("https://"))
        {
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload using https : ").append(s).append(". Just pass through.").toString());
            }
            return Uri.parse(s);
        }
        if (s.toLowerCase(Locale.US).startsWith("http://"))
        {
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload using http : ").append(s).toString());
            }
            s = (new StringBuilder()).append("nflx://").append(s.substring("http://".length())).toString();
            s = (new StringBuilder()).append("nflx://www.netflix.com/Browse?q=").append(URLEncoder.encode((new StringBuilder()).append("target_url=").append(s).toString(), "UTF-8")).toString();
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Payload for MDP page ").append(s).toString());
            }
            return Uri.parse(s);
        }
        Log.d("nf_push", "Unsuported protocol, return URI that will launch our application to HOME page");
        s = (new StringBuilder()).append("nflx://www.netflix.com/Browse?q=").append(URLEncoder.encode("action=home&source=pn", "UTF-8")).toString();
        if (Log.isLoggable("nf_push", 3))
        {
            Log.d("nf_push", (new StringBuilder()).append("Payload for home page ").append(s).toString());
        }
        return Uri.parse(s);
    }

    private void validate()
    {
        if (title == null)
        {
            throw new IllegalArgumentException("Payload:: title is missing!");
        }
        if (text == null)
        {
            throw new IllegalArgumentException("Payload:: text is missing!");
        }
        if (defaultActionPayload == null)
        {
            throw new IllegalArgumentException("Payload:: defaultActionPayload is missing!");
        } else
        {
            return;
        }
    }

    public Action[] getActions()
    {
        return (Action[])actions.toArray(new Action[actions.size()]);
    }

    public Uri getDefaultActionPayload()
    {
        Uri uri;
        try
        {
            uri = parsePayload(defaultActionPayload, defaultActionKey);
        }
        catch (Throwable throwable)
        {
            Log.e("nf_push", (new StringBuilder()).append("defaultActionPayload URI is wrong: ").append(defaultActionPayload).toString(), throwable);
            return null;
        }
        return uri;
    }

    public String getTicker(String s)
    {
        if (ticker != null)
        {
            s = ticker;
        }
        return s;
    }

    public String getTitle(String s)
    {
        if (title != null)
        {
            s = title;
        }
        return s;
    }

    public long getWhen()
    {
        long l = System.currentTimeMillis();
        if (when >= l)
        {
            l = when;
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("Post notification later: ").append(l).toString());
            }
            return l;
        } else
        {
            Log.d("nf_push", "Post notification now!");
            return l;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append("Payload [title=").append(title).append(", text=").append(text).append(", subtext=").append(subtext).append(", info=").append(info).append(", ticker=").append(ticker).append(", ledColor=").append(ledColor).append(", sound=").append(sound).append(", vibrate=").append(vibrate).append(", when=").append(when).append(", smallIcon=").append(smallIcon).append(", largeIcon=").append(largeIcon).append(", bigViewText=").append(bigViewText).append(", bigViewPicture=").append(bigViewPicture).append(", bigViewTitle=").append(bigViewTitle).append(", bigViewSummary=").append(bigViewSummary).append(", defaultActionKey=").append(defaultActionKey).append(", defaultActionPayload=").append(defaultActionPayload).append(", actions=").append(actions).append(", guid=").append(guid).append(", messageGuid=").append(messageGuid).append("]").toString();
    }

}
