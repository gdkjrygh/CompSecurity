// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.droidguard.internal.DroidGuardClientImpl;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            GamesClientContext

public final class GamesDroidGuard
{

    public static String getDroidGuardSubmitScoreData(GamesClientContext gamesclientcontext, String s, long l, String s1)
    {
        boolean flag;
        if (!((Boolean)G.capturingNetwork.get()).booleanValue() && ((Double)G.signLeaderboardScoresPercent.get()).doubleValue() != 0.0D && Math.random() <= ((Double)G.signLeaderboardScoresPercent.get()).doubleValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return "";
        }
        com.google.android.gms.games.proto.PlayGamesDroidGuard.GamesDroidGuardSignedData gamesdroidguardsigneddata = new com.google.android.gms.games.proto.PlayGamesDroidGuard.GamesDroidGuardSignedData();
        gamesdroidguardsigneddata.submittedScore = new com.google.android.gms.games.proto.PlayGamesDroidGuard.DroidGuardSubmittedScore();
        gamesdroidguardsigneddata.submittedScore.externalGameId = gamesclientcontext.mExternalOwningGameId;
        gamesdroidguardsigneddata.submittedScore.externalLeaderboardId = s;
        gamesdroidguardsigneddata.submittedScore.packageName = gamesclientcontext.mClientContext.mCallingPackageName;
        gamesdroidguardsigneddata.submittedScore.scoreValue = l;
        com.google.android.gms.games.proto.PlayGamesDroidGuard.DroidGuardSubmittedScore droidguardsubmittedscore = gamesdroidguardsigneddata.submittedScore;
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        droidguardsubmittedscore.scoreTag = s;
        s = new ArrayMap();
        s.put("SIGNED_DATA", Base64Utils.encodeUrlSafe(com.google.android.gms.games.proto.PlayGamesDroidGuard.GamesDroidGuardSignedData.toByteArray(gamesdroidguardsigneddata)));
        s1 = AndroidUtils.getPackageCertificateHashBytes(gamesclientcontext.mContext, gamesclientcontext.mClientContext.mCallingPackageName);
        if (s1 != null)
        {
            try
            {
                s.put("PACKAGE_SIGNATURE", Base64Utils.encodeUrlSafe(s1));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                GamesLog.e("GamesDroidGuard", s1.getMessage());
            }
        }
        return (new DroidGuardClientImpl(gamesclientcontext.mContext)).getResults("playGamesScore", s);
    }
}
