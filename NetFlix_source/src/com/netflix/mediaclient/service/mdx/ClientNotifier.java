// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.netflix.mediaclient.Log;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            NotifierInterface, MdxSharedState

public final class ClientNotifier
    implements NotifierInterface
{

    private static final String TAG = "nf_mdx";
    private final Context mContext;
    private final Map mSharedStateMap = new HashMap();

    ClientNotifier(Context context)
    {
        mContext = context;
        Log.v("nf_mdx", "Creating client notifier");
    }

    private void addSharedState(String s)
    {
        if (!mSharedStateMap.containsKey(s))
        {
            mSharedStateMap.put(s, new MdxSharedState(s));
        }
    }

    public void abortPinVerification(String s, boolean flag)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_NOT_REQUIRED")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("isPinVerified", flag);
        mContext.sendBroadcast(s);
    }

    public void audiosub(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_AUDIOSUB")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("stringBlob", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_AUDIOSUB sent");
    }

    public void capability(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_CAPABILITY")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("stringBlob", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_CAPABILITY sent");
    }

    public void commandPlayReceived(String s)
    {
        synchronized (mSharedStateMap)
        {
            addSharedState(s);
            ((MdxSharedState)mSharedStateMap.get(s)).notifyPlayCommandReceived();
        }
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void dialogCancel(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGCANCEL")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("stringBlob", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_DIALOGCANCEL sent");
    }

    public void dialogShow(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_DIALOGSHOW")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("stringBlob", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_DIALOGSHOW sent");
    }

    public void error(String s, int i, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_ERROR")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("errorCode", i).putExtra("errorDesc", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_ERROR sent");
    }

    public MdxSharedState getSharedState(String s)
    {
        synchronized (mSharedStateMap)
        {
            s = (MdxSharedState)mSharedStateMap.get(s);
        }
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void metaData(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_METADATA")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("stringBlob", s1);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_METADATA sent");
    }

    public void movieMetaData(String s, String s1, String s2, int i)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADA")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("catalogId", s1).putExtra("episodeId", s2).putExtra("duration", i);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_MOVIEDATA sent");
    }

    public void movieMetaDataAvailable(String s)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_MOVIEMETADATA_AVAILABLE")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MOVIEMETADATA_AVAILABLE sent");
    }

    public void notready()
    {
        Intent intent = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_NOTREADY")).addCategory("com.netflix.mediaclient.intent.category.MDX");
        mContext.sendBroadcast(intent);
        Log.v("nf_mdx", "Intent NOTREADY sent");
    }

    public void playbackEnd(String s, String s1)
    {
        synchronized (mSharedStateMap)
        {
            if (mSharedStateMap.get(s) != null)
            {
                ((MdxSharedState)mSharedStateMap.get(s)).notifyPlaybackEnd();
                mSharedStateMap.remove(s);
            }
        }
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s);
        if (!TextUtils.isEmpty(s1))
        {
            s.putExtra("postplayState", s1);
        }
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_PLAYBACKEND sent");
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void playbackStart(String s)
    {
        synchronized (mSharedStateMap)
        {
            addSharedState(s);
            ((MdxSharedState)mSharedStateMap.get(s)).notifyPlaybackStart();
        }
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_PLAYBACKSTART sent");
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void postplayState(String s, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("postplayState", s1);
        mContext.sendBroadcast(s);
    }

    public void ready()
    {
        Intent intent = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_READY")).addCategory("com.netflix.mediaclient.intent.category.MDX");
        mContext.sendBroadcast(intent);
        Log.v("nf_mdx", "Intent READY sent");
    }

    public void requestPinVerification(String s, String s1, int i, int j, String s2)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.PIN_VERIFICATION_SHOW")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("title", s1).putExtra("ancestorVideoType", s2).putExtra("videoId", i).putExtra("ancestorVideoId", j);
        mContext.sendBroadcast(s);
    }

    public void simplePlaybackState(String s, boolean flag, boolean flag1, String s1)
    {
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_SIMPLE_PLAYBACKSTATE")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("paused", flag).putExtra("transitioning", flag1).putExtra("postplayState", s1);
        mContext.sendBroadcast(s);
    }

    public void state(String s, String s1, int i, int j)
    {
        synchronized (mSharedStateMap)
        {
            if (mSharedStateMap.get(s) != null)
            {
                ((MdxSharedState)mSharedStateMap.get(s)).notifyPlaybackState(s1, i, j);
            }
        }
        s = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_STATE")).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", s).putExtra("currentState", s1).putExtra("time", i).putExtra("volume", j);
        mContext.sendBroadcast(s);
        Log.v("nf_mdx", "Intent MDXUPDATE_STATE sent");
        return;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void targetList()
    {
        Intent intent = (new Intent("com.netflix.mediaclient.intent.action.MDXUPDATE_TARGETLIST")).addCategory("com.netflix.mediaclient.intent.category.MDX");
        mContext.sendBroadcast(intent);
        Log.v("nf_mdx", "Intent MDXUPDATE_TARGETLISTY sent");
    }
}
