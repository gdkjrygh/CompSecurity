// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.settings.SettingProtoManager;
import com.google.android.apps.wallet.user.UserInfoManager;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

public class TosAcceptanceOracle
{

    private static final String TAG = com/google/android/apps/wallet/usersetup/TosAcceptanceOracle.getSimpleName();
    private final AppControl appControl;
    private final SettingProtoManager settingProtoManager;
    private final UserInfoManager userInfoManager;

    public TosAcceptanceOracle(UserInfoManager userinfomanager, SettingProtoManager settingprotomanager, AppControl appcontrol)
    {
        userInfoManager = userinfomanager;
        settingProtoManager = settingprotomanager;
        appControl = appcontrol;
    }

    private void downloadLatestUserInfo()
    {
        try
        {
            userInfoManager.downloadAndPersistUserInfo();
            return;
        }
        catch (Exception exception)
        {
            throw new RuntimeException("Could not get UserInfo while trying to recover from (b/7190064)");
        }
    }

    private Optional getLatestLegalDocument()
    {
        if (appControl.getString(AppControlKey.TOS_V2_LEGAL_DOC_TUPLE).equals(""))
        {
            return userInfoManager.loadLatestLegalDocument();
        }
        String s = appControl.getString(AppControlKey.TOS_V2_LEGAL_DOC_TUPLE);
        String as[] = s.split("\\|", 3);
        if (as.length != 3)
        {
            throw new RuntimeException(String.format("Overriden TOS appcontrol value, %s, is invalid.", new Object[] {
                s
            }));
        } else
        {
            com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument = new com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument();
            latestlegaldocument.documentId = as[0];
            latestlegaldocument.documentUrl = as[1];
            latestlegaldocument.bancorpTosUrl = as[2];
            return Optional.of(latestlegaldocument);
        }
    }

    private String getLocalAcceptedTosId()
    {
        return settingProtoManager.getStringSetting(3);
    }

    private boolean isTosAccepted(String s)
    {
        String s1 = getLocalAcceptedTosId();
        if (Strings.isNullOrEmpty(s1))
        {
            return false;
        } else
        {
            return s1.equals(s);
        }
    }

    public final Optional lookupLegalDocumentToAccept()
    {
        Optional optional;
label0:
        {
            Optional optional1 = getLatestLegalDocument();
            if (!optional1.isPresent())
            {
                WLog.v(TAG, "No latest legal document, skipping TOS check");
                return Optional.absent();
            }
            if (((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional1.get()).documentId != null && ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional1.get()).bancorpTosUrl != null)
            {
                optional = optional1;
                if (((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional1.get()).documentUrl != null)
                {
                    break label0;
                }
            }
            downloadLatestUserInfo();
            optional = getLatestLegalDocument();
        }
        String s;
        boolean flag;
        if (((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).documentId != null && ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).documentUrl != null && ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).bancorpTosUrl != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Latest legal document has required fields that are not set, cannot show tos.  Latest legal document id: %s doc url: %s bancorp url: %s", new Object[] {
            ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).documentId, ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).documentUrl, ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).bancorpTosUrl
        });
        s = ((com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument)optional.get()).documentId;
        if (isTosAccepted(s))
        {
            WLog.vfmt(TAG, "TOS is already accepted.  Document ID: %s", new Object[] {
                s
            });
            return Optional.absent();
        } else
        {
            return optional;
        }
    }

    public final void setLocalAcceptedTosState(com.google.wallet.proto.NanoWalletEntities.LatestLegalDocument latestlegaldocument)
    {
        settingProtoManager.setStringSetting(3, latestlegaldocument.documentId);
    }

}
