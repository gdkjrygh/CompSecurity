// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            DestinationGameSearchActivity

public class GamesSuggestionProvider extends ContentProvider
{

    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gms.games.ui.destination.games.search_suggestion_provider/search");
    private static final String SEARCH_SUGGEST_COLUMNS[] = {
        "_id", "suggest_text_1", "suggest_intent_action", "suggest_intent_extra_data"
    };
    private static final UriMatcher uriMatcher;

    public GamesSuggestionProvider()
    {
    }

    public static String getSuggestedQueryText(Intent intent)
    {
        return intent.getExtras().getString("intent_extra_data_key");
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri)
    {
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown URL ")).append(uri).toString());

        case 1: // '\001'
            return "vnd.android.cursor.dir/vnd.android.search.suggest";
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException();
    }

    public boolean onCreate()
    {
        return true;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        if (as1 == null || as1.length == 0)
        {
            throw new IllegalArgumentException((new StringBuilder("SelectionArgs must be provided for the Uri: ")).append(uri).toString());
        }
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown Uri: ")).append(uri).toString());

        case 1: // '\001'
            as = as1[0].toLowerCase();
            break;
        }
        uri = new MatrixCursor(SEARCH_SUGGEST_COLUMNS);
        as = DestinationGameSearchActivity.getSuggestions(as);
        if (as != null)
        {
            for (int i = 0; i < as.length; i++)
            {
                uri.addRow(new String[] {
                    String.valueOf(i), as[i], "com.google.android.gms.games.ui.destination.games.SUGGESTION_SELECTED", as[i]
                });
            }

        }
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        UriMatcher urimatcher = new UriMatcher(-1);
        uriMatcher = urimatcher;
        urimatcher.addURI("com.google.android.gms.games.ui.destination.games.search_suggestion_provider", "search_suggest_query", 1);
        uriMatcher.addURI("com.google.android.gms.games.ui.destination.games.search_suggestion_provider", "search_suggest_query/*", 1);
    }
}
