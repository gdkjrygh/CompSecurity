// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.migration;

import android.database.sqlite.SQLiteDatabase;

// Referenced classes of package com.fitbit.data.repo.greendao.migration:
//            MigrationRulesProcessor, Rule_96_ProfileCountry, Rule_97_GoalStoringApproach, Rule_100_GoalValueStoringApproach, 
//            Rule_96_DeviceEncryptedParameter, Rule_110_Notifications, Rule_99_TrackerSettings, Rule_112_Friends, 
//            Rule_106_AwakeRestless, Rule_103_ProfileUnits, Rule_113_Locale, Rule_111_FirmwareVersion, 
//            Rule_114_NeutrinoSettings, Rule_115_DeviceSupportedSettings, Rule_117_DeviceEntityStatus, Rule_122_DeviceWireId, 
//            Rule_116_ProfileLocale, Rule_117_ActiveMinutes, Rule_122_PedometerMinuteData, Rule_123_TrackerData, 
//            Rule_124_Invite, Rule_124_ContactToUser, Rule_125_RankedUserIsFromContactBook, Rule_126_DailyGoal, 
//            Rule_127_DeviceImageUrl, Rule_129_ProfileStateAndCity, Rule_129_AddProgramNameToNotification, Rule_130_TrackerSettingsAdditions, 
//            Rule_131_RankedUserDateOfBirth, Rule_132_FoodLocale, Rule_133_ChallengesBetaProfile, Rule_134_MobileRunRule, 
//            Rule_135_HeartRateSummary, Rule_136_ProtonSettings, Rule_137_RankedUserIsChallengesBeta, Rule_138_ActivityLogV11EndPoint, 
//            Rule_140_FavoriteFood, Rule_141_LightServing, Rule_141_NewApiFoodSupport, Rule_141_NewApiFoodLogsSupport, 
//            Rule_141_FoodRelation, Rule_141_NewApiMealItemSupport, Rule_142_FoodLocaleBarcodeSupporting, Rule_143_FoodLocaleImageUploadFlag, 
//            Rule_144_FoodRelationDisplayIndex, Rule_145_TimeZonesSync, Rule_146_RankedUserIsFromFacebookAndActive, Rule_147_Badges, 
//            Rule_148_BondInfo, Rule_149_NewApiFoodSupport, Rule_150_DeviceFwUpdate, Rule_151_WatchCheckSetting, 
//            Rule_152_Index, Rule_153_AutoLapSetting, Rule_2_ActivityLogHeartRateInZones, Rule_3_ActivityLogLastModified, 
//            Rule_4_ActivityLogActiveMinutes, Rule_5_Activity_Index, Rule_6_ActivityLogAverageHeartRateAndName, Rule_2_Food_Index, 
//            Rule_2_Logging_Index, Rule_2_MobileTrack_Index, Rule_Social_2_Friend_Badges

public final class MigrationHelper
{

    public MigrationHelper()
    {
    }

    public static boolean migrate(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_96_ProfileCountry());
        migrationrulesprocessor.addMigrationRule(new Rule_97_GoalStoringApproach());
        migrationrulesprocessor.addMigrationRule(new Rule_100_GoalValueStoringApproach());
        migrationrulesprocessor.addMigrationRule(new Rule_96_DeviceEncryptedParameter());
        migrationrulesprocessor.addMigrationRule(new Rule_110_Notifications());
        migrationrulesprocessor.addMigrationRule(new Rule_99_TrackerSettings());
        migrationrulesprocessor.addMigrationRule(new Rule_112_Friends());
        migrationrulesprocessor.addMigrationRule(new Rule_106_AwakeRestless());
        migrationrulesprocessor.addMigrationRule(new Rule_103_ProfileUnits());
        migrationrulesprocessor.addMigrationRule(new Rule_113_Locale());
        migrationrulesprocessor.addMigrationRule(new Rule_111_FirmwareVersion());
        migrationrulesprocessor.addMigrationRule(new Rule_114_NeutrinoSettings());
        migrationrulesprocessor.addMigrationRule(new Rule_115_DeviceSupportedSettings());
        migrationrulesprocessor.addMigrationRule(new Rule_117_DeviceEntityStatus());
        migrationrulesprocessor.addMigrationRule(new Rule_122_DeviceWireId());
        migrationrulesprocessor.addMigrationRule(new Rule_116_ProfileLocale());
        migrationrulesprocessor.addMigrationRule(new Rule_117_ActiveMinutes());
        migrationrulesprocessor.addMigrationRule(new Rule_122_PedometerMinuteData());
        migrationrulesprocessor.addMigrationRule(new Rule_123_TrackerData());
        migrationrulesprocessor.addMigrationRule(new Rule_124_Invite());
        migrationrulesprocessor.addMigrationRule(new Rule_124_ContactToUser());
        migrationrulesprocessor.addMigrationRule(new Rule_125_RankedUserIsFromContactBook());
        migrationrulesprocessor.addMigrationRule(new Rule_126_DailyGoal());
        migrationrulesprocessor.addMigrationRule(new Rule_127_DeviceImageUrl());
        migrationrulesprocessor.addMigrationRule(new Rule_129_ProfileStateAndCity());
        migrationrulesprocessor.addMigrationRule(new Rule_129_AddProgramNameToNotification());
        migrationrulesprocessor.addMigrationRule(new Rule_130_TrackerSettingsAdditions());
        migrationrulesprocessor.addMigrationRule(new Rule_131_RankedUserDateOfBirth());
        migrationrulesprocessor.addMigrationRule(new Rule_132_FoodLocale());
        migrationrulesprocessor.addMigrationRule(new Rule_133_ChallengesBetaProfile());
        migrationrulesprocessor.addMigrationRule(new Rule_134_MobileRunRule());
        migrationrulesprocessor.addMigrationRule(new Rule_135_HeartRateSummary());
        migrationrulesprocessor.addMigrationRule(new Rule_136_ProtonSettings());
        migrationrulesprocessor.addMigrationRule(new Rule_137_RankedUserIsChallengesBeta());
        migrationrulesprocessor.addMigrationRule(new Rule_138_ActivityLogV11EndPoint());
        migrationrulesprocessor.addMigrationRule(new Rule_140_FavoriteFood());
        migrationrulesprocessor.addMigrationRule(new Rule_141_LightServing());
        migrationrulesprocessor.addMigrationRule(new Rule_141_NewApiFoodSupport());
        migrationrulesprocessor.addMigrationRule(new Rule_141_NewApiFoodLogsSupport());
        migrationrulesprocessor.addMigrationRule(new Rule_141_FoodRelation());
        migrationrulesprocessor.addMigrationRule(new Rule_141_NewApiMealItemSupport());
        migrationrulesprocessor.addMigrationRule(new Rule_142_FoodLocaleBarcodeSupporting());
        migrationrulesprocessor.addMigrationRule(new Rule_143_FoodLocaleImageUploadFlag());
        migrationrulesprocessor.addMigrationRule(new Rule_144_FoodRelationDisplayIndex());
        migrationrulesprocessor.addMigrationRule(new Rule_145_TimeZonesSync());
        migrationrulesprocessor.addMigrationRule(new Rule_146_RankedUserIsFromFacebookAndActive());
        migrationrulesprocessor.addMigrationRule(new Rule_147_Badges());
        migrationrulesprocessor.addMigrationRule(new Rule_148_BondInfo());
        migrationrulesprocessor.addMigrationRule(new Rule_149_NewApiFoodSupport());
        migrationrulesprocessor.addMigrationRule(new Rule_150_DeviceFwUpdate());
        migrationrulesprocessor.addMigrationRule(new Rule_151_WatchCheckSetting());
        migrationrulesprocessor.addMigrationRule(new Rule_152_Index());
        migrationrulesprocessor.addMigrationRule(new Rule_153_AutoLapSetting());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }

    public static boolean migrateActivityDB(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_2_ActivityLogHeartRateInZones());
        migrationrulesprocessor.addMigrationRule(new Rule_3_ActivityLogLastModified());
        migrationrulesprocessor.addMigrationRule(new Rule_4_ActivityLogActiveMinutes());
        migrationrulesprocessor.addMigrationRule(new Rule_5_Activity_Index());
        migrationrulesprocessor.addMigrationRule(new Rule_6_ActivityLogAverageHeartRateAndName());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }

    public static boolean migrateFoodDB(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_2_Food_Index());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }

    public static boolean migrateLoggingDB(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_2_Logging_Index());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }

    public static boolean migrateMobileTrackDB(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_2_MobileTrack_Index());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }

    public static boolean migrateSocialDB(SQLiteDatabase sqlitedatabase, int i, int j)
    {
        MigrationRulesProcessor migrationrulesprocessor = new MigrationRulesProcessor();
        migrationrulesprocessor.addMigrationRule(new Rule_Social_2_Friend_Badges());
        return migrationrulesprocessor.execute(sqlitedatabase, i, j);
    }
}
