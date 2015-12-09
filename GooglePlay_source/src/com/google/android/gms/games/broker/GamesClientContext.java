// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.cache.GamePlayerCacheKey;
import com.google.android.gms.games.internal.GamesConstants;

// Referenced classes of package com.google.android.gms.games.broker:
//            Agents

public final class GamesClientContext
{
    public static final class Builder
    {

        boolean mBackground;
        final ClientContext mClientContext;
        private final Context mContext;
        public String mExternalCurrentPlayerId;
        public String mExternalOwningGameId;
        public String mExternalTargetGameId;
        public String mExternalTargetPlayerId;
        public boolean mForceReload;

        public final GamesClientContext build()
        {
            return new GamesClientContext(mContext, mClientContext, mExternalOwningGameId, mExternalTargetGameId, mExternalCurrentPlayerId, mExternalTargetPlayerId, mForceReload, mBackground, (byte)0);
        }

        public Builder(Context context, ClientContext clientcontext)
        {
            mContext = context;
            mClientContext = clientcontext;
            mExternalCurrentPlayerId = null;
            mExternalOwningGameId = null;
            mExternalTargetGameId = null;
            mExternalTargetPlayerId = null;
            mBackground = false;
            mForceReload = false;
        }
    }


    public final ClientContext mClientContext;
    public final Context mContext;
    private long mCurrentPlayerId;
    public final String mExternalCurrentPlayerId;
    final String mExternalOwningGameId;
    public final String mExternalTargetGameId;
    public final String mExternalTargetPlayerId;
    public final boolean mForceReload;
    public final boolean mIsFirstParty;
    final boolean mIsFirstPartyBackground;
    private long mOwningGameId;
    private long mTargetGameId;
    long mTargetPlayerId;

    private GamesClientContext(Context context, ClientContext clientcontext, String s, String s1, String s2, String s3, boolean flag, 
            boolean flag1)
    {
        mContext = context;
        mClientContext = clientcontext;
        mForceReload = flag;
        mOwningGameId = -1L;
        mTargetGameId = -1L;
        mCurrentPlayerId = -1L;
        mTargetPlayerId = -1L;
        mExternalCurrentPlayerId = s2;
        mExternalOwningGameId = s;
        mExternalTargetGameId = s1;
        mExternalTargetPlayerId = s3;
        boolean flag2 = clientcontext.isCurrentContext();
        boolean flag3 = isFirstPartyAppId(clientcontext, s);
        if (s == null || s.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must provide a valid owning Game ID, or null for 'GmsCore'");
        if (s1 == null || s1.length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must provide a valid target Game ID, or null for 'all games'");
        if (flag2)
        {
            if (s == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "GmsCore context should have a null owning game ID");
        } else
        if (s == null)
        {
            Preconditions.checkArgument(flag2, "If the owning game is not provided, then we must be in GmsCore context");
        } else
        if (!s.equals(s1))
        {
            Preconditions.checkArgument(flag3, "Only 1P apps can make request for other games");
        }
        if (flag1)
        {
            if (flag2 && !flag3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Only GmsCore context can create background operations");
        }
        if (s1 == null)
        {
            if (flag2 || flag3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Only Gms or 1P app contexts can request a null target games ID");
        }
        if (flag2 || flag3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsFirstParty = flag;
        if (mIsFirstParty && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsFirstPartyBackground = flag;
        if (mIsFirstParty)
        {
            context = "https://www.googleapis.com/auth/games.firstparty";
        } else
        {
            context = "https://www.googleapis.com/auth/games";
        }
        Preconditions.checkState(clientcontext.hasScope(context));
    }

    GamesClientContext(Context context, ClientContext clientcontext, String s, String s1, String s2, String s3, boolean flag, 
            boolean flag1, byte byte0)
    {
        this(context, clientcontext, s, s1, s2, s3, flag, flag1);
    }

    public static GamesClientContext buildContextFor3P(Context context, ClientContext clientcontext, String s, String s1, boolean flag)
    {
        boolean flag2 = true;
        boolean flag1;
        if (s != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "External game ID cannot be null");
        if (s1 != null)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "External player ID cannot be null");
        context = new Builder(context, clientcontext);
        context.mExternalCurrentPlayerId = s1;
        context.mForceReload = flag;
        context.mExternalOwningGameId = s;
        context.mExternalTargetGameId = s;
        return context.build();
    }

    public static GamesClientContext buildContextForTargetGame(Context context, ClientContext clientcontext, String s)
    {
        String s1;
        if (clientcontext.isCurrentContext())
        {
            s1 = null;
        } else
        {
            s1 = s;
        }
        context = new Builder(context, clientcontext);
        context.mExternalOwningGameId = s1;
        context.mExternalTargetGameId = s;
        return context.build();
    }

    public static boolean isFirstPartyAppId(ClientContext clientcontext, String s)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (!GamesConstants.isFirstPartyAppId(s, false))
            {
                flag = flag1;
                if (!"522219980416".equals(s))
                {
                    break label0;
                }
                flag = flag1;
                if (!clientcontext.hasScope("https://www.googleapis.com/auth/games.firstparty"))
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public static boolean isPlayerIdGPlusEnabled(String s)
    {
        return !TextUtils.isEmpty(s) && !s.startsWith("__NON_PLUS_PLAYER_ID__");
    }

    public final boolean canResolveCurrentPlayerId()
    {
        if (mCurrentPlayerId != -1L)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (mExternalCurrentPlayerId != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        mCurrentPlayerId = Agents.resolveExternalPlayerId(mContext, mClientContext, mExternalCurrentPlayerId);
        if (mCurrentPlayerId == -1L) goto _L1; else goto _L3
_L3:
        return true;
        return true;
    }

    public final boolean canResolveTargetPlayerId()
    {
        if (mTargetPlayerId != -1L)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (mExternalTargetPlayerId != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        mTargetPlayerId = Agents.resolveExternalPlayerId(mContext, mClientContext, mExternalTargetPlayerId);
        if (mTargetPlayerId == -1L) goto _L1; else goto _L3
_L3:
        return true;
        return true;
    }

    public final Builder getBuilder()
    {
        Builder builder = new Builder(mContext, mClientContext);
        builder.mBackground = mIsFirstPartyBackground;
        builder.mExternalCurrentPlayerId = mExternalCurrentPlayerId;
        builder.mForceReload = mForceReload;
        builder.mExternalOwningGameId = mExternalOwningGameId;
        builder.mExternalTargetGameId = mExternalTargetGameId;
        builder.mExternalTargetPlayerId = mExternalTargetPlayerId;
        return builder;
    }

    public final Builder getBuilder(Context context, ClientContext clientcontext)
    {
        context = new Builder(context, clientcontext);
        context.mBackground = mIsFirstPartyBackground;
        context.mForceReload = mForceReload;
        context.mExternalCurrentPlayerId = mExternalCurrentPlayerId;
        context.mExternalTargetGameId = mExternalTargetGameId;
        context.mExternalTargetPlayerId = mExternalTargetPlayerId;
        if (!clientcontext.isCurrentContext())
        {
            context.mExternalOwningGameId = mExternalOwningGameId;
        }
        return context;
    }

    public final GamePlayerCacheKey getCacheKey()
    {
        return new GamePlayerCacheKey(getExternalGameId(), getExternalPlayerId());
    }

    public final String getExternalGameId()
    {
        if (mIsFirstParty)
        {
            return mExternalTargetGameId;
        } else
        {
            return mExternalOwningGameId;
        }
    }

    public final String getExternalPlayerId()
    {
        if (mIsFirstParty && !mIsFirstPartyBackground)
        {
            return mExternalTargetPlayerId;
        } else
        {
            return mExternalCurrentPlayerId;
        }
    }

    public final String getNoGPlusPlayerId()
    {
        String s = mClientContext.mResolvedAccount.name;
        return (new StringBuilder("__NON_PLUS_PLAYER_ID___")).append(s).toString();
    }

    public final GamesClientContext getWithForceReload$528fa945()
    {
        Object obj = this;
        if (!mForceReload)
        {
            obj = getBuilder();
            obj.mForceReload = true;
            obj = ((Builder) (obj)).build();
        }
        return ((GamesClientContext) (obj));
    }

    public final boolean hasTargetGameId()
    {
        return mExternalTargetGameId != null;
    }

    public final boolean isTargetingCurrentPlayer()
    {
        return mExternalCurrentPlayerId != null && mExternalCurrentPlayerId.equals(mExternalTargetPlayerId);
    }

    public final long resolveCurrentPlayerId()
    {
        Preconditions.checkArgument(canResolveCurrentPlayerId(), (new StringBuilder("Missing local player ID for ")).append(mExternalCurrentPlayerId).toString());
        return mCurrentPlayerId;
    }

    public final long resolveOwningGameId()
    {
        boolean flag = false;
        if (mOwningGameId != -1L) goto _L2; else goto _L1
_L1:
        if (mExternalOwningGameId != null) goto _L4; else goto _L3
_L3:
        Preconditions.checkArgument(flag, (new StringBuilder("Missing local game ID for ")).append(mExternalOwningGameId).toString());
        return mOwningGameId;
_L4:
        mOwningGameId = Agents.forceResolveExternalGameId(mContext, mClientContext, mExternalOwningGameId);
        if (mOwningGameId == -1L)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = true;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final long resolveTargetGameId()
    {
        boolean flag = false;
        if (mTargetGameId != -1L) goto _L2; else goto _L1
_L1:
        if (mExternalTargetGameId != null) goto _L4; else goto _L3
_L3:
        Preconditions.checkArgument(flag, (new StringBuilder("Missing local game ID for ")).append(mExternalTargetGameId).toString());
        return mTargetGameId;
_L4:
        mTargetGameId = Agents.forceResolveExternalGameId(mContext, mClientContext, mExternalTargetGameId);
        if (mTargetGameId == -1L)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = true;
        if (true) goto _L3; else goto _L5
_L5:
    }
}
