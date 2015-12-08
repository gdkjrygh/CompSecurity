// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.content.SearchRecentSuggestionsProvider;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.network.f;
import java.util.ArrayList;

public class MySuggestionProvider extends SearchRecentSuggestionsProvider
{

    public static final Uri a = Uri.parse("content://com.cardinalblue.piccollage.google.suggestionprovider/photo/0");
    public static final Uri b = Uri.parse("content://com.cardinalblue.piccollage.google.suggestionprovider/background/0");
    static final String c[] = {
        "_id", "suggest_text_1", "suggest_intent_data", "suggest_intent_action", "suggest_shortcut_id"
    };
    private static UriMatcher d;
    private ArrayList e;
    private ArrayList f;

    public MySuggestionProvider()
    {
        setupSuggestions("com.cardinalblue.piccollage.google.suggestionprovider", 1);
    }

    static Object[] a(Integer integer, String s)
    {
        return (new Object[] {
            integer, s, s, "android.intent.action.SEARCH", "_-1"
        });
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        int i;
        i = 0;
        s = as1[0];
        as = new ArrayList();
        int j = d.match(uri);
        j;
        JVM INSTR tableswitch 1 2: default 48
    //                   1 100
    //                   2 155;
           goto _L1 _L2 _L3
_L1:
        uri = as;
_L5:
        as = new MatrixCursor(c);
        for (; i < uri.size(); i++)
        {
            as.addRow(a(Integer.valueOf(i), (String)uri.get(i)));
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (TextUtils.isEmpty(s))
        {
            if (e == null || e.size() == 0)
            {
                e = com.cardinalblue.android.piccollage.controller.network.f.f();
            }
            uri = e;
            continue; /* Loop/switch isn't completed */
        }
        uri = com.cardinalblue.android.piccollage.controller.network.f.c(s);
        continue; /* Loop/switch isn't completed */
        uri;
        try
        {
            uri = com.cardinalblue.android.piccollage.controller.network.f.f();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            com.cardinalblue.android.piccollage.a.f.a(uri);
            uri = as;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (TextUtils.isEmpty(s))
        {
            if (f == null || f.size() == 0)
            {
                f = com.cardinalblue.android.piccollage.controller.network.f.g();
            }
            uri = f;
            continue; /* Loop/switch isn't completed */
        }
        uri = com.cardinalblue.android.piccollage.controller.network.f.c(s);
        continue; /* Loop/switch isn't completed */
        uri;
        uri = com.cardinalblue.android.piccollage.controller.network.f.g();
        if (true) goto _L5; else goto _L4
_L4:
        return as;
    }

    static 
    {
        d = new UriMatcher(-1);
        d.addURI("com.cardinalblue.piccollage.google.suggestionprovider", "photo/*", 1);
        d.addURI("com.cardinalblue.piccollage.google.suggestionprovider", "background/*", 2);
    }
}
