// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.content.UriMatcher;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.wear:
//            EventHandler

public class CommandHandlerUriMatcher extends UriMatcher
{

    private int codeIndex;
    private final Map commandHandlers = new HashMap();

    public CommandHandlerUriMatcher()
    {
        super(-1);
        codeIndex = 0;
    }

    public void addURI(String s, String s1, EventHandler eventhandler)
    {
        int i = codeIndex + 1;
        codeIndex = i;
        StringBuilder stringbuilder = (new StringBuilder()).append(s);
        if (TextUtils.isEmpty(s1))
        {
            s = "";
        } else
        {
            s = (new StringBuilder("/")).append(s1).toString();
        }
        super.addURI("skype.com", stringbuilder.append(s).toString(), i);
        commandHandlers.put(Integer.valueOf(i), eventhandler);
    }

    public EventHandler match(String s)
    {
        return (EventHandler)commandHandlers.get(Integer.valueOf(super.match(Uri.parse((new StringBuilder("skype://skype.com")).append(s).toString()))));
    }
}
