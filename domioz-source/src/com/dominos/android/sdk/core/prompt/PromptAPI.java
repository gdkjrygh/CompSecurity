// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.prompt;

import android.content.Context;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.NinaPromptModel;
import com.dominos.android.sdk.core.models.RootLevelPromptModel;
import com.dominos.android.sdk.core.models.json.RootLevelDeserializer;
import com.dominos.android.sdk.data.http.cdn.ContentRestClient;
import com.google.a.a.s;
import com.google.a.c.l;
import com.google.b.d;
import com.google.b.k;
import com.google.b.r;
import java.io.File;

public class PromptAPI
{

    private static final String TAG = com/dominos/android/sdk/core/prompt/PromptAPI.getSimpleName();
    ContentRestClient mContentRestClient;
    private Context mContext;

    public PromptAPI(Context context)
    {
        mContext = context;
    }

    private k getCustomGsonConverter()
    {
        return (new r()).b().e().a(d.d).d().a().c().a(com/dominos/android/sdk/core/models/RootLevelPromptModel, new RootLevelDeserializer()).f();
    }

    private File getPromptFile(String s1)
    {
        return new File(mContext.getFilesDir().getPath(), s1);
    }

    private NinaPromptModel getPromptFromDevice(String s1)
    {
        s1 = getPromptFile(s1);
        if (!s1.exists())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s1 = l.a(s1, s.c);
        if (!StringHelper.isNotEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        s1 = (NinaPromptModel)getCustomGsonConverter().a(s1, com/dominos/android/sdk/core/models/NinaPromptModel);
        return s1;
        s1;
        LogUtil.e(TAG, (new StringBuilder("Read prompt file failed: ")).append(s1).toString(), new Object[0]);
        return null;
    }

    private boolean isPromptOnDevice(String s1)
    {
        return (new File(s1)).exists();
    }

    private void savePromptToDevice(String s1, String s2)
    {
        try
        {
            s1 = getPromptFile(s1);
            s1.createNewFile();
            s1.setWritable(true);
            l.a(s2.getBytes(), s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            LogUtil.e(TAG, (new StringBuilder("Save prompt file failed: ")).append(s1).toString(), new Object[0]);
        }
    }

    public NinaPromptModel loadPrompts(String s1, String s2)
    {
        mContentRestClient.setRootUrl(s1);
        if (isPromptOnDevice(s2))
        {
            return getPromptFromDevice(s2);
        }
        s1 = mContentRestClient.getPrompts(s2);
        NinaPromptModel ninapromptmodel;
        try
        {
            ninapromptmodel = (NinaPromptModel)getCustomGsonConverter().a(s1, com/dominos/android/sdk/core/models/NinaPromptModel);
            savePromptToDevice(s2, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        return ninapromptmodel;
    }

}
