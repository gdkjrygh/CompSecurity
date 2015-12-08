// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerInternalError;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            ResolverPlayer

public class PlayerSession
{

    private boolean mPlayWasCalled;
    private final WeakReference mPlayerWeakReference;
    private String mSessionUri;

    PlayerSession(ResolverPlayer resolverplayer)
    {
        mPlayerWeakReference = new WeakReference(resolverplayer);
    }

    public void destroy()
    {
        ResolverPlayer resolverplayer = (ResolverPlayer)mPlayerWeakReference.get();
        if (resolverplayer != null)
        {
            resolverplayer.destroyPlayerSession(this, new Player.PlayCallback() {

                final PlayerSession this$0;

                public void onPlayForbidden(List list)
                {
                }

                public void onPlaySuccess()
                {
                    mSessionUri = null;
                }

            
            {
                this$0 = PlayerSession.this;
                super();
            }
            });
        }
    }

    protected void finalize()
    {
        if (mSessionUri != null)
        {
            throw new PlayerInternalError(new Throwable(String.format(" Session '%s' has not been destroyed", new Object[] {
                mSessionUri
            })));
        } else
        {
            return;
        }
    }

    String getSessionUri()
    {
        return mSessionUri;
    }

    public void play()
    {
        if (mSessionUri == null)
        {
            mPlayWasCalled = true;
        } else
        {
            ResolverPlayer resolverplayer = (ResolverPlayer)mPlayerWeakReference.get();
            if (resolverplayer != null)
            {
                resolverplayer.play(this);
                return;
            }
        }
    }

    void setSessionUri(String s)
    {
        mSessionUri = s;
        if (mPlayWasCalled)
        {
            play();
        }
    }


/*
    static String access$002(PlayerSession playersession, String s)
    {
        playersession.mSessionUri = s;
        return s;
    }

*/
}
