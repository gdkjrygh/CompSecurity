// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.media.JPlayer.AdaptiveMediaDecoderHelper;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.PreferenceUtils;

public final class PlayerTypeFactory
{

    private static final String PREFERENCE_PLAYER_TYPE = "nflx_player_type";
    private static final String PREFERENCE_PLAYER_TYPE_QA_OVERRIDE = "nflx_player_type_qa";
    private static final String TAG = "nf-playertypefactory";
    private static int cryptoFactoryType;
    private static PlayerType currentType;

    private PlayerTypeFactory()
    {
    }

    public static void clearRecords(Context context)
    {
        PreferenceUtils.removePref(context, "nflx_player_type");
    }

    public static PlayerType findDefaultPlayerType()
    {
        int i = AndroidUtils.getAndroidVersion();
        if (Log.isLoggable("nf-playertypefactory", 3))
        {
            Log.d("nf-playertypefactory", (new StringBuilder()).append("Crypto factory type (CDM is 2): ").append(cryptoFactoryType).toString());
        }
        if (i > 18 && AdaptiveMediaDecoderHelper.isAvcDecoderSupportsAdaptivePlayback())
        {
            Log.d("nf-playertypefactory", "JB MR2+, Default to JPlayer2");
            return PlayerType.device12;
        }
        if (i >= 18 && isWidevineSupported())
        {
            Log.d("nf-playertypefactory", "JB MR2 with WV, Default to JPlayer2");
            return PlayerType.device12;
        }
        if (i >= 17 && AndroidUtils.isPropertyStreamingVideoDrs())
        {
            Log.d("nf-playertypefactory", "JB+ with ro.streaming.video.drs presented and true, Default to JPlayer2 ");
            return PlayerType.device12;
        }
        if (i >= 17)
        {
            Log.d("nf-playertypefactory", "JB MR1+, Default to JPlayer");
            return PlayerType.device10;
        } else
        {
            Log.d("nf-playertypefactory", "Default to OpenMax AL (XAL)");
            return PlayerType.device7;
        }
    }

    public static PlayerType getCurrentType(Context context)
    {
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorenter ;
        if (currentType == null)
        {
            Log.d("nf-playertypefactory", "First call getCurrentType(). Initiate it. Check if it is saved to preferences before.");
            currentType = getPlayerTypeFromPreferences(context);
        }
        if (currentType == null)
        {
            Log.d("nf-playertypefactory", "Current type was not saved to preferences before. Find default player.");
            currentType = findDefaultPlayerType();
        }
        if (!isValidPlayerType(context))
        {
            Log.e("nf-playertypefactory", "Current type is not valid! Replace it with default!");
            PreferenceUtils.removePref(context, "nflx_player_type");
            currentType = findDefaultPlayerType();
        }
        context = currentType;
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static PlayerType getJPlayer()
    {
        return PlayerType.device10;
    }

    public static PlayerType getJPlayer2()
    {
        return PlayerType.device12;
    }

    public static PlayerType getJPlayerBase()
    {
        return PlayerType.device11;
    }

    private static PlayerType getPlayerTypeFromPreferences(Context context)
    {
        int i = -1;
        if (-1 < 1)
        {
            Log.d("nf-playertypefactory", "Check for configuration override override");
            i = PreferenceUtils.getIntPref(context, "nflx_player_type", -1);
        }
        if (i < 1)
        {
            Log.d("nf-playertypefactory", "Player type was not saved in preferences before, no override.");
            context = null;
        } else
        {
            PlayerType playertype = PlayerType.toPlayerType(i);
            context = playertype;
            if (playertype == null)
            {
                Log.e("nf-playertypefactory", (new StringBuilder()).append("Player not found for type ").append(i).toString());
                return null;
            }
        }
        return context;
    }

    public static PlayerType getXalPlayer()
    {
        return PlayerType.device7;
    }

    public static PlayerType getXalmpPlayer()
    {
        return PlayerType.device8;
    }

    public static void initialize(EsnProvider esnprovider)
    {
        cryptoFactoryType = esnprovider.getCryptoFactoryType();
    }

    public static boolean isDefault(Context context)
    {
        return PreferenceUtils.getIntPref(context, "nflx_player_type", -1) == -1;
    }

    public static boolean isJPlayer(PlayerType playertype)
    {
        return PlayerType.device10.equals(playertype);
    }

    public static boolean isJPlayer2(PlayerType playertype)
    {
        return PlayerType.device12.equals(playertype);
    }

    public static boolean isJPlayerBase(PlayerType playertype)
    {
        return PlayerType.device11.equals(playertype);
    }

    public static boolean isPlayerTypeSupported(PlayerType playertype)
    {
        return isValidPlayerType(playertype);
    }

    private static boolean isValidPlayerType(Context context)
    {
        if (currentType == null)
        {
            currentType = findDefaultPlayerType();
        }
        return isValidPlayerType(currentType);
    }

    private static boolean isValidPlayerType(PlayerType playertype)
    {
        boolean flag = true;
        if (playertype != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        int i;
        i = AndroidUtils.getAndroidVersion();
        switch (playertype.getValue())
        {
        case 9: // '\t'
        default:
            Log.d("nf-playertypefactory", (new StringBuilder()).append("Not supported type ").append(playertype).append(" for this device!").toString());
            return false;

        case 7: // '\007'
            Log.d("nf-playertypefactory", (new StringBuilder()).append("XAL player ").append(i).toString());
            if (i <= 13)
            {
                return false;
            }
            break;

        case 8: // '\b'
            Log.d("nf-playertypefactory", (new StringBuilder()).append("XAL Main Profile player ").append(i).toString());
            if (i <= 13)
            {
                return false;
            }
            break;

        case 10: // '\n'
        case 11: // '\013'
            Log.d("nf-playertypefactory", (new StringBuilder()).append("JPlayer ").append(i).toString());
            if (i <= 15)
            {
                return false;
            }
            break;

        case 12: // '\f'
            Log.d("nf-playertypefactory", (new StringBuilder()).append("JPlayer2 ").append(i).toString());
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i >= 16) goto _L4; else goto _L5
_L5:
        return false;
    }

    private static boolean isWidevineSupported()
    {
        return cryptoFactoryType == 2;
    }

    public static boolean isXalPlayer(PlayerType playertype)
    {
        return PlayerType.device7.equals(playertype);
    }

    public static boolean isXalmpPlayer(PlayerType playertype)
    {
        return PlayerType.device8.equals(playertype);
    }

    public static PlayerType resetPlayerTypeByQA(Context context)
    {
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorenter ;
        Log.d("nf-playertypefactory", "Removing player type QA override from preferences");
        PreferenceUtils.removePref(context, "nflx_player_type_qa");
        currentType = findDefaultPlayerType();
        context = getCurrentType(context);
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void setPlayerType(Context context, PlayerType playertype)
    {
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorenter ;
        if (playertype != null) goto _L2; else goto _L1
_L1:
        Log.w("nf-playertypefactory", "Type is null, do nothing!");
_L3:
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("nf-playertypefactory", 3))
        {
            Log.d("nf-playertypefactory", (new StringBuilder()).append("Updating player type ").append(playertype).toString());
        }
        if (isValidPlayerType(playertype))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Log.e("nf-playertypefactory", "Invalid player type for this device. We should never be here!");
          goto _L3
        context;
        throw context;
label0:
        {
            if (currentType == null || currentType.getValue() != playertype.getValue())
            {
                break label0;
            }
            Log.d("nf-playertypefactory", "Already known player type, used for playback currently. Do nothing");
        }
          goto _L3
        if (Log.isLoggable("nf-playertypefactory", 3))
        {
            Log.d("nf-playertypefactory", (new StringBuilder()).append("Saving to persistence new player type ").append(playertype).toString());
        }
        currentType = playertype;
        PreferenceUtils.putIntPref(context, "nflx_player_type", playertype.getValue());
          goto _L3
    }

    public static void setPlayerTypeForQAOverride(Context context, PlayerType playertype)
    {
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorenter ;
        if (playertype != null) goto _L2; else goto _L1
_L1:
        Log.w("nf-playertypefactory", "setPlayerTypeForQAOverride: Type is null, do nothing!");
_L3:
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable("nf-playertypefactory", 3))
        {
            Log.d("nf-playertypefactory", (new StringBuilder()).append("setPlayerTypeForQAOverride: Updating player type ").append(playertype).toString());
        }
        if (isValidPlayerType(playertype))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        Log.e("nf-playertypefactory", "setPlayerTypeForQAOverride: Invalid player type for this device. We should never be here!");
          goto _L3
        context;
        throw context;
label0:
        {
            if (currentType == null || currentType.getValue() != playertype.getValue())
            {
                break label0;
            }
            Log.d("nf-playertypefactory", "setPlayerTypeForQAOverride: Already known player type, used for playback currently. Do nothing");
        }
          goto _L3
        if (Log.isLoggable("nf-playertypefactory", 3))
        {
            Log.d("nf-playertypefactory", (new StringBuilder()).append("SsetPlayerTypeForQAOverride: aving to persistence new player type ").append(playertype).toString());
        }
        currentType = playertype;
        PreferenceUtils.putIntPref(context, "nflx_player_type_qa", playertype.getValue());
          goto _L3
    }

    public static void updateDevicePlayerType(Context context, String s)
    {
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorenter ;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (PlayerType.toPlayerType(Integer.parseInt(s)) == null) goto _L2; else goto _L3
_L3:
        setPlayerType(context, PlayerType.toPlayerType(Integer.parseInt(s)));
_L5:
        com/netflix/mediaclient/service/configuration/PlayerTypeFactory;
        JVM INSTR monitorexit ;
        return;
_L2:
        clearRecords(context);
        if (true) goto _L5; else goto _L4
_L4:
        context;
        throw context;
    }
}
