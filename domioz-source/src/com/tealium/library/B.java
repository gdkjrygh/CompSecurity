// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

// Referenced classes of package com.tealium.library:
//            RemoteCommand

final class B
{

    private static final Pattern a = Pattern.compile("^tealium://.+", 2);
    private final String b;
    private final RemoteCommand.Response c;

    B(String s)
    {
        JSONObject jsonobject = null;
        Object obj = null;
        super();
        if (!a(s))
        {
            throw new IllegalArgumentException("Given url must not be null.");
        }
        int i = s.indexOf("?request=");
        if (i == -1)
        {
            b = s.substring(10).toLowerCase(Locale.ROOT);
            s = null;
        } else
        {
            b = s.substring(10, i).toLowerCase(Locale.ROOT);
            s = s.substring(i + 9);
            try
            {
                s = URLDecoder.decode(s, "UTF-8");
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new RuntimeException(s);
            }
            if (s.length() == 0)
            {
                s = new JSONObject();
            } else
            {
                s = new JSONObject(s);
            }
        }
        if (!RemoteCommand.a(b))
        {
            throw new IllegalArgumentException("The command id provided by the request is not a valid command id.");
        }
        if (s == null)
        {
            s = null;
        } else
        {
            obj = s.optJSONObject("config");
            if (obj == null)
            {
                obj = jsonobject;
            } else
            {
                obj = ((JSONObject) (obj)).optString("response_id", null);
            }
            jsonobject = s.optJSONObject("payload");
            s = ((String) (obj));
            obj = jsonobject;
        }
        c = new _cls1(b, s, ((JSONObject) (obj)));
    }

    static boolean a(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return a.matcher(s).matches();
        }
    }

    final String a()
    {
        return b;
    }

    final RemoteCommand.Response b()
    {
        return c;
    }


    private class _cls1 extends RemoteCommand.Response
    {

        public final void send()
        {
            super.send();
            if (getId() != null)
            {
                String s = getCommandId();
                int i = getStatus();
                String s2 = getBody();
                u.a(String.format(Locale.ROOT, "Remote Command \"%s\" returning %d with message \"%s\"", new Object[] {
                    s, Integer.valueOf(i), s2
                }));
                if (getBody() == null)
                {
                    s = String.format(Locale.ROOT, "try {\tutag.mobile.remote_api.response[\"%s\"][\"%s\"](%d);} catch(err) {\tconsole.error(err);};", new Object[] {
                        getCommandId(), getId(), Integer.valueOf(getStatus())
                    });
                } else
                {
                    s = String.format(Locale.ROOT, "try {\tutag.mobile.remote_api.response[\"%s\"][\"%s\"](%d, %s);} catch(err) {\tconsole.error(err);};", new Object[] {
                        getCommandId(), getId(), Integer.valueOf(getStatus()), JSONObject.quote(getBody())
                    });
                }
                d.a(false, s);
                return;
            } else
            {
                String s1 = getCommandId();
                u.c(String.format(Locale.ROOT, "Unable to perform the TagBridge callback for the command \"%s\". No response_id was specified in the request.", new Object[] {
                    s1
                }));
                return;
            }
        }

        _cls1(String s, String s1, JSONObject jsonobject)
        {
            super(s, s1, jsonobject);
        }
    }

}
