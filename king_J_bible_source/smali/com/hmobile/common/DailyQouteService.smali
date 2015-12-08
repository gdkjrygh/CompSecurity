.class public Lcom/hmobile/common/DailyQouteService;
.super Landroid/app/Service;
.source "DailyQouteService.java"


# static fields
.field static m_isrunning:Z

.field static phoneid:Ljava/lang/String;

.field static remoteViews:Landroid/widget/RemoteViews;


# instance fields
.field con:Landroid/content/Context;

.field editor:Landroid/content/SharedPreferences$Editor;

.field settings:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    sput-boolean v0, Lcom/hmobile/common/DailyQouteService;->m_isrunning:Z

    .line 35
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private ShowNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 161
    const/4 v0, 0x1

    .line 163
    .local v0, "NOTIFICATION_ID":I
    new-instance v5, Landroid/content/Intent;

    const-class v9, Lcom/hmobile/biblekjv/TodayActivity;

    invoke-direct {v5, p1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 164
    .local v5, "resultIntent":Landroid/content/Intent;
    const/high16 v9, 0x24000000

    invoke-virtual {v5, v9}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 167
    const/4 v9, 0x0

    const/high16 v10, 0x8000000

    .line 166
    invoke-static {p1, v9, v5, v10}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 169
    .local v6, "resultPendingIntent":Landroid/app/PendingIntent;
    new-instance v7, Landroid/content/Intent;

    const-class v9, Lcom/hmobile/biblekjv/SettingsActivity;

    invoke-direct {v7, p1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 170
    .local v7, "settingIntent":Landroid/content/Intent;
    const/high16 v9, 0x24000000

    invoke-virtual {v7, v9}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 173
    const/4 v9, 0x0

    const/high16 v10, 0x8000000

    .line 172
    invoke-static {p1, v9, v7, v10}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v8

    .line 175
    .local v8, "settingPendingIntent":Landroid/app/PendingIntent;
    new-instance v1, Landroid/content/Intent;

    const-class v9, Lcom/hmobile/common/CancelNotification;

    invoke-direct {v1, p1, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    .local v1, "cancelIntent":Landroid/content/Intent;
    const-string v9, "notificationId"

    invoke-virtual {v1, v9, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 180
    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 179
    invoke-static {p1, v9, v1, v10}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 183
    .local v2, "cancelPendingIntent":Landroid/app/PendingIntent;
    :try_start_0
    new-instance v9, Landroid/app/Notification$Builder;

    invoke-direct {v9, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 184
    invoke-virtual {v9, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 185
    invoke-virtual {v9, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 186
    const v10, 0x7f020065

    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 187
    invoke-virtual {v9, v6}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 188
    new-instance v10, Landroid/app/Notification$BigTextStyle;

    invoke-direct {v10}, Landroid/app/Notification$BigTextStyle;-><init>()V

    invoke-virtual {v10, p3}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 190
    invoke-virtual {v9, p3}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 191
    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 192
    const v10, 0x7f020098

    const-string v11, "Settings"

    invoke-virtual {v9, v10, v11, v8}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 194
    const v10, 0x7f02005e

    const-string v11, "Dismiss"

    invoke-virtual {v9, v10, v11, v2}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v9

    .line 195
    invoke-virtual {v9}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v3

    .line 197
    .local v3, "n":Landroid/app/Notification;
    iget v9, v3, Landroid/app/Notification;->defaults:I

    or-int/lit8 v9, v9, 0x1

    iput v9, v3, Landroid/app/Notification;->defaults:I

    .line 198
    const-string v9, "notification"

    invoke-virtual {p0, v9}, Lcom/hmobile/common/DailyQouteService;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/app/NotificationManager;

    .line 200
    .local v4, "notificationManager":Landroid/app/NotificationManager;
    invoke-virtual {v4, v0, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 281
    .end local v3    # "n":Landroid/app/Notification;
    .end local v4    # "notificationManager":Landroid/app/NotificationManager;
    :goto_0
    return-void

    .line 201
    :catch_0
    move-exception v9

    goto :goto_0
.end method

.method public static cancelNotification(Landroid/content/Context;I)V
    .locals 2
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "notifyId"    # I

    .prologue
    .line 296
    const-string v1, "notification"

    .line 298
    .local v1, "ns":Ljava/lang/String;
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 297
    check-cast v0, Landroid/app/NotificationManager;

    .line 299
    .local v0, "nMgr":Landroid/app/NotificationManager;
    invoke-virtual {v0, p1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 300
    return-void
.end method


# virtual methods
.method handleStart(Landroid/content/Intent;I)V
    .locals 22
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "startId"    # I

    .prologue
    .line 73
    const-string v17, "In handleStart ::: "

    invoke-static/range {v17 .. v17}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 74
    invoke-static/range {p0 .. p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    .line 75
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v17

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "is_notification"

    const/16 v19, 0x1

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v17

    if-nez v17, :cond_1

    .line 156
    :cond_0
    :goto_0
    return-void

    .line 85
    :cond_1
    new-instance v13, Lcom/hmobile/model/TodayInfo;

    invoke-direct {v13}, Lcom/hmobile/model/TodayInfo;-><init>()V

    .line 86
    .local v13, "info":Lcom/hmobile/model/TodayInfo;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "TodayVerse"

    const-string v19, ""

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    iput-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    .line 87
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "BookName"

    const-string v19, ""

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    iput-object v0, v13, Lcom/hmobile/model/TodayInfo;->BookName:Ljava/lang/String;

    .line 88
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "TodayDate"

    const-string v19, ""

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    iput-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    .line 89
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "BookCount"

    const/16 v19, 0x1

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v17

    move/from16 v0, v17

    iput v0, v13, Lcom/hmobile/model/TodayInfo;->BookCount:I

    .line 90
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "ChapterCount"

    const/16 v19, 0x1

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v17

    move/from16 v0, v17

    iput v0, v13, Lcom/hmobile/model/TodayInfo;->ChapterCount:I

    .line 91
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->settings:Landroid/content/SharedPreferences;

    move-object/from16 v17, v0

    const-string v18, "VerseCount"

    const/16 v19, 0x1

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v17

    move/from16 v0, v17

    iput v0, v13, Lcom/hmobile/model/TodayInfo;->VerseCount:I

    .line 92
    iget-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    move-object/from16 v17, v0

    const-string v18, ""

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_0

    .line 93
    iget-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    move-object/from16 v17, v0

    const-string v18, ""

    invoke-virtual/range {v17 .. v18}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v17

    if-nez v17, :cond_0

    .line 95
    if-eqz v13, :cond_0

    .line 97
    :try_start_0
    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    .line 98
    .local v6, "d":Ljava/util/Date;
    new-instance v14, Ljava/text/SimpleDateFormat;

    const-string v17, "MM/dd/yyyy"

    move-object/from16 v0, v17

    invoke-direct {v14, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 100
    .local v14, "sdf":Ljava/text/SimpleDateFormat;
    invoke-virtual {v14, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 101
    .local v11, "dt":Ljava/lang/String;
    invoke-virtual {v14, v11}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    .line 102
    .local v8, "date1":Ljava/util/Date;
    iget-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayDate:Ljava/lang/String;

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Ljava/util/Date;->parse(Ljava/lang/String;)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v14, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 103
    .local v10, "date2str":Ljava/lang/String;
    invoke-virtual {v14, v10}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v9

    .line 104
    .local v9, "date2":Ljava/util/Date;
    invoke-virtual {v8, v9}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v17

    if-nez v17, :cond_2

    .line 106
    iget-object v0, v13, Lcom/hmobile/model/TodayInfo;->TodayVerse:Ljava/lang/String;

    move-object/from16 v17, v0

    invoke-static/range {v17 .. v17}, Lcom/hmobile/model/VerseInfo;->getVerseInfoByVerse(Ljava/lang/String;)Lcom/hmobile/model/VerseInfo;

    move-result-object v16

    .line 107
    .local v16, "todayverse":Lcom/hmobile/model/VerseInfo;
    if-eqz v16, :cond_0

    .line 110
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->BookId:I

    move/from16 v17, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v17

    .line 109
    invoke-static/range {v17 .. v17}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v5

    .line 111
    .local v5, "bookname":Ljava/lang/String;
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v18, " "

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 112
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->ChapterNumber:I

    move/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, ":"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 113
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/VerseInfo;->VerseNumber:I

    move/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 111
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 114
    .local v15, "title":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/common/DailyQouteService;->getApplicationContext()Landroid/content/Context;

    move-result-object v17

    .line 115
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/hmobile/model/VerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v18, v0

    .line 114
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v15, v2}, Lcom/hmobile/common/DailyQouteService;->ShowNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 150
    .end local v5    # "bookname":Ljava/lang/String;
    .end local v6    # "d":Ljava/util/Date;
    .end local v8    # "date1":Ljava/util/Date;
    .end local v9    # "date2":Ljava/util/Date;
    .end local v10    # "date2str":Ljava/lang/String;
    .end local v11    # "dt":Ljava/lang/String;
    .end local v14    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v15    # "title":Ljava/lang/String;
    .end local v16    # "todayverse":Lcom/hmobile/model/VerseInfo;
    :catch_0
    move-exception v17

    goto/16 :goto_0

    .line 118
    .restart local v6    # "d":Ljava/util/Date;
    .restart local v8    # "date1":Ljava/util/Date;
    .restart local v9    # "date2":Ljava/util/Date;
    .restart local v10    # "date2str":Ljava/lang/String;
    .restart local v11    # "dt":Ljava/lang/String;
    .restart local v14    # "sdf":Ljava/text/SimpleDateFormat;
    :cond_2
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getTodayVerse()Lcom/hmobile/model/TodayVerseInfo;

    move-result-object v16

    .line 119
    .local v16, "todayverse":Lcom/hmobile/model/TodayVerseInfo;
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getTodayBook()Lcom/hmobile/model/BookInfo;

    move-result-object v4

    .line 120
    .local v4, "Todaybook":Lcom/hmobile/model/BookInfo;
    if-eqz v16, :cond_0

    .line 121
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "TodayVerse"

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v19, v0

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 122
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "BookName"

    iget-object v0, v4, Lcom/hmobile/model/BookInfo;->BookName:Ljava/lang/String;

    move-object/from16 v19, v0

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "BookCount"

    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    move/from16 v19, v0

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 124
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "ChapterCount"

    .line 125
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    move/from16 v19, v0

    .line 124
    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 126
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "VerseCount"

    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    move/from16 v19, v0

    invoke-interface/range {v17 .. v19}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 128
    new-instance v7, Ljava/util/Date;

    invoke-direct {v7}, Ljava/util/Date;-><init>()V

    .line 129
    .local v7, "d1":Ljava/util/Date;
    invoke-virtual {v14, v7}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    .line 131
    .local v12, "dt1":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "TodayDate"

    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-interface {v0, v1, v12}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    const-string v18, "notification_millis"

    .line 134
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v20

    .line 133
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    move-wide/from16 v2, v20

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 135
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/hmobile/common/DailyQouteService;->editor:Landroid/content/SharedPreferences$Editor;

    move-object/from16 v17, v0

    invoke-interface/range {v17 .. v17}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 137
    if-eqz v16, :cond_0

    .line 140
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    move/from16 v17, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v17

    .line 139
    invoke-static/range {v17 .. v17}, Lcom/hmobile/common/Utils;->ConvertToLong(Ljava/lang/String;)J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v5

    .line 141
    .restart local v5    # "bookname":Ljava/lang/String;
    new-instance v17, Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    invoke-direct/range {v17 .. v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v18, " "

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 142
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    move/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v17

    const-string v18, ":"

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 143
    move-object/from16 v0, v16

    iget v0, v0, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    move/from16 v18, v0

    invoke-virtual/range {v17 .. v18}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v17

    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    .line 145
    .restart local v15    # "title":Ljava/lang/String;
    invoke-virtual/range {p0 .. p0}, Lcom/hmobile/common/DailyQouteService;->getApplicationContext()Landroid/content/Context;

    move-result-object v17

    .line 146
    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    move-object/from16 v18, v0

    .line 145
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-direct {v0, v1, v15, v2}, Lcom/hmobile/common/DailyQouteService;->ShowNotification(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1
    .param p1, "arg0"    # Landroid/content/Intent;

    .prologue
    .line 286
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()V
    .locals 1

    .prologue
    .line 41
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 42
    invoke-virtual {p0}, Lcom/hmobile/common/DailyQouteService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/common/DailyQouteService;->con:Landroid/content/Context;

    .line 44
    return-void
.end method

.method public onStart(Landroid/content/Intent;I)V
    .locals 0
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "startId"    # I

    .prologue
    .line 68
    invoke-virtual {p0, p1, p2}, Lcom/hmobile/common/DailyQouteService;->handleStart(Landroid/content/Intent;I)V

    .line 70
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .prologue
    .line 48
    invoke-virtual {p0, p1, p3}, Lcom/hmobile/common/DailyQouteService;->handleStart(Landroid/content/Intent;I)V

    .line 49
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    .line 51
    .local v1, "b":Landroid/os/Bundle;
    if-eqz v1, :cond_0

    .line 52
    const-string v3, "do_action"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 53
    .local v0, "action":Ljava/lang/String;
    const-string v3, "Dismiss"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 54
    invoke-virtual {p0}, Lcom/hmobile/common/DailyQouteService;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const/16 v4, 0x3e9

    invoke-static {v3, v4}, Lcom/hmobile/common/DailyQouteService;->cancelNotification(Landroid/content/Context;I)V

    .line 63
    .end local v0    # "action":Ljava/lang/String;
    :cond_0
    :goto_0
    const/4 v3, 0x2

    return v3

    .line 56
    .restart local v0    # "action":Ljava/lang/String;
    :cond_1
    const-string v3, "Setting"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 57
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/hmobile/common/DailyQouteService;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 58
    const-class v4, Lcom/hmobile/biblekjv/SettingsActivity;

    .line 57
    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 59
    .local v2, "in":Landroid/content/Intent;
    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 60
    invoke-virtual {p0, v2}, Lcom/hmobile/common/DailyQouteService;->startActivity(Landroid/content/Intent;)V

    goto :goto_0
.end method
