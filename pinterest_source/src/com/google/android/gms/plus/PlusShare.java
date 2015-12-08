// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.pi;
import com.google.android.gms.plus.model.people.Person;

public final class PlusShare
{

    public static final String EXTRA_CALL_TO_ACTION = "com.google.android.apps.plus.CALL_TO_ACTION";
    public static final String EXTRA_CONTENT_DEEP_LINK_ID = "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID";
    public static final String EXTRA_CONTENT_DEEP_LINK_METADATA = "com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA";
    public static final String EXTRA_CONTENT_URL = "com.google.android.apps.plus.CONTENT_URL";
    public static final String EXTRA_IS_INTERACTIVE_POST = "com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST";
    public static final String EXTRA_SENDER_ID = "com.google.android.apps.plus.SENDER_ID";
    public static final String KEY_CALL_TO_ACTION_DEEP_LINK_ID = "deepLinkId";
    public static final String KEY_CALL_TO_ACTION_LABEL = "label";
    public static final String KEY_CALL_TO_ACTION_URL = "url";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_DESCRIPTION = "description";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_THUMBNAIL_URL = "thumbnailUrl";
    public static final String KEY_CONTENT_DEEP_LINK_METADATA_TITLE = "title";
    public static final String PARAM_CONTENT_DEEP_LINK_ID = "deep_link_id";

    protected PlusShare()
    {
        throw new AssertionError();
    }

    public static Bundle a(String s, String s1, Uri uri)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("description", s1);
        if (uri != null)
        {
            bundle.putString("thumbnailUrl", uri.toString());
        }
        return bundle;
    }

    protected static boolean cg(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            Log.e("GooglePlusPlatform", "The provided deep-link ID is empty.");
            return false;
        }
        if (s.contains(" "))
        {
            Log.e("GooglePlusPlatform", "Spaces are not allowed in deep-link IDs.");
            return false;
        } else
        {
            return true;
        }
    }

    public static Person createPerson(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("MinimalPerson ID must not be empty.");
        }
        if (TextUtils.isEmpty(s1))
        {
            throw new IllegalArgumentException("Display name must not be empty.");
        } else
        {
            return new pi(s1, s, null, 0, null);
        }
    }

    public static String getDeepLinkId(Intent intent)
    {
        Object obj = null;
        String s = obj;
        if (intent != null)
        {
            s = obj;
            if (intent.getData() != null)
            {
                s = intent.getData().getQueryParameter("deep_link_id");
            }
        }
        return s;
    }
}
