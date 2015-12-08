.class public Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;
.super Landroid/appwidget/AppWidgetProvider;
.source "HolyBibleWidgetSmall.java"


# static fields
.field public static ACTION_WIDGET_CONFIGURE:Ljava/lang/String; = null

.field public static ACTION_WIDGET_RECEIVER:Ljava/lang/String; = null

.field public static final PREFS_NAME:Ljava/lang/String; = "MyPrefsFile"

.field static book_id:I

.field static chap_id:I

.field static configIntent:Landroid/content/Intent;

.field static configPendingIntent:Landroid/app/PendingIntent;

.field static isLowLightDarkFont:Z

.field static settings:Landroid/content/SharedPreferences;

.field static verse_id:I

.field static widget_backgroundImage:I

.field static widget_fontSize:F

.field static widget_fontstyle:I


# instance fields
.field countdown:Landroid/os/CountDownTimer;

.field private m_appmanager:Landroid/appwidget/AppWidgetManager;

.field m_widgetid:I

.field remoteViews:Landroid/widget/RemoteViews;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 32
    const-string v0, "ActionReceiverWidget"

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->ACTION_WIDGET_RECEIVER:Ljava/lang/String;

    .line 33
    const-string v0, "ConfigureWidget"

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->ACTION_WIDGET_CONFIGURE:Ljava/lang/String;

    .line 47
    sput v1, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->book_id:I

    .line 49
    sput v1, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->chap_id:I

    .line 51
    sput v1, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->verse_id:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->m_appmanager:Landroid/appwidget/AppWidgetManager;

    .line 29
    return-void
.end method

.method private getRemoteViews(Landroid/content/Context;)Landroid/widget/RemoteViews;
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 65
    iget-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->remoteViews:Landroid/widget/RemoteViews;

    if-nez v0, :cond_0

    .line 66
    new-instance v0, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 67
    const v2, 0x7f030038

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 66
    iput-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->remoteViews:Landroid/widget/RemoteViews;

    .line 69
    :cond_0
    iget-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->remoteViews:Landroid/widget/RemoteViews;

    return-object v0
.end method

.method private static getTodayInfo()Lcom/hmobile/model/TodayVerseInfo;
    .locals 13

    .prologue
    .line 185
    new-instance v7, Lcom/hmobile/model/TodayVerseInfo;

    invoke-direct {v7}, Lcom/hmobile/model/TodayVerseInfo;-><init>()V

    .line 187
    .local v7, "info":Lcom/hmobile/model/TodayVerseInfo;
    :try_start_0
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v11, "TodayDate"

    const-string v12, ""

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 188
    .local v9, "today":Ljava/lang/String;
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 189
    .local v0, "d":Ljava/util/Date;
    new-instance v8, Ljava/text/SimpleDateFormat;

    const-string v10, "MM/dd/yyyy"

    invoke-direct {v8, v10}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 191
    .local v8, "sdf":Ljava/text/SimpleDateFormat;
    invoke-virtual {v8, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 192
    .local v4, "dt":Ljava/lang/String;
    invoke-virtual {v8, v4}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 193
    .local v1, "date1":Ljava/util/Date;
    invoke-static {v9}, Ljava/util/Date;->parse(Ljava/lang/String;)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v8, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 194
    .local v3, "date2str":Ljava/lang/String;
    invoke-virtual {v8, v3}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 195
    .local v2, "date2":Ljava/util/Date;
    invoke-virtual {v1, v2}, Ljava/util/Date;->compareTo(Ljava/util/Date;)I

    move-result v10

    if-nez v10, :cond_1

    .line 196
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v11, "TodayVerse"

    const-string v12, ""

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iput-object v10, v7, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    .line 197
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v11, "BookCount"

    const/4 v12, 0x1

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v10

    iput v10, v7, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    .line 198
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v11, "ChapterCount"

    const/4 v12, 0x1

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v10

    iput v10, v7, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    .line 199
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v11, "VerseCount"

    const/4 v12, 0x1

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v10

    iput v10, v7, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    .line 200
    iget-object v10, v7, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    const-string v11, ""

    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 201
    const/4 v7, 0x0

    .line 216
    .end local v0    # "d":Ljava/util/Date;
    .end local v1    # "date1":Ljava/util/Date;
    .end local v2    # "date2":Ljava/util/Date;
    .end local v3    # "date2str":Ljava/lang/String;
    .end local v4    # "dt":Ljava/lang/String;
    .end local v7    # "info":Lcom/hmobile/model/TodayVerseInfo;
    .end local v8    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v9    # "today":Ljava/lang/String;
    :cond_0
    :goto_0
    return-object v7

    .line 204
    .restart local v0    # "d":Ljava/util/Date;
    .restart local v1    # "date1":Ljava/util/Date;
    .restart local v2    # "date2":Ljava/util/Date;
    .restart local v3    # "date2str":Ljava/lang/String;
    .restart local v4    # "dt":Ljava/lang/String;
    .restart local v7    # "info":Lcom/hmobile/model/TodayVerseInfo;
    .restart local v8    # "sdf":Ljava/text/SimpleDateFormat;
    .restart local v9    # "today":Ljava/lang/String;
    :cond_1
    sget-object v10, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 205
    .local v6, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-static {}, Lcom/hmobile/model/BookInfo;->getTodayVerse()Lcom/hmobile/model/TodayVerseInfo;

    move-result-object v7

    .line 206
    const-string v10, "TodayVerse"

    iget-object v11, v7, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-interface {v6, v10, v11}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 207
    const-string v10, "BookCount"

    iget v11, v7, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    invoke-interface {v6, v10, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 208
    const-string v10, "ChapterCount"

    iget v11, v7, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-interface {v6, v10, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 209
    const-string v10, "VerseCount"

    iget v11, v7, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-interface {v6, v10, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 210
    const-string v10, "TodayDate"

    invoke-interface {v6, v10, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 211
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 213
    .end local v0    # "d":Ljava/util/Date;
    .end local v1    # "date1":Ljava/util/Date;
    .end local v2    # "date2":Ljava/util/Date;
    .end local v3    # "date2str":Ljava/lang/String;
    .end local v4    # "dt":Ljava/lang/String;
    .end local v6    # "editor":Landroid/content/SharedPreferences$Editor;
    .end local v8    # "sdf":Ljava/text/SimpleDateFormat;
    .end local v9    # "today":Ljava/lang/String;
    :catch_0
    move-exception v5

    .line 214
    .local v5, "e":Ljava/lang/Exception;
    invoke-virtual {v5}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V
    .locals 13
    .param p0, "remoteViewsLocal"    # Landroid/widget/RemoteViews;
    .param p1, "context1"    # Landroid/content/Context;
    .param p2, "manager"    # Landroid/appwidget/AppWidgetManager;

    .prologue
    const/4 v12, -0x1

    const/high16 v11, -0x1000000

    const v10, 0x7f0e013c

    const v9, 0x7f0e00ac

    const/4 v8, 0x0

    .line 98
    if-nez p2, :cond_0

    .line 182
    :goto_0
    return-void

    .line 101
    :cond_0
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleApplication;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 104
    .local v1, "context":Landroid/content/Context;
    invoke-static {}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->getTodayInfo()Lcom/hmobile/model/TodayVerseInfo;

    move-result-object v2

    .line 105
    .local v2, "info":Lcom/hmobile/model/TodayVerseInfo;
    if-eqz v2, :cond_2

    .line 106
    iget v5, v2, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->book_id:I

    .line 107
    iget v5, v2, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->chap_id:I

    .line 108
    iget v5, v2, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->verse_id:I

    .line 117
    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v5

    sput-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    .line 119
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_low_light"

    invoke-interface {v5, v6, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    sput-boolean v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->isLowLightDarkFont:Z

    .line 121
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_font_style"

    invoke-interface {v5, v6, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_fontstyle:I

    .line 123
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    const-string v6, "widget_font_size"

    const/16 v7, 0x10

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    int-to-float v5, v5

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_fontSize:F

    .line 125
    new-instance v3, Landroid/text/SpannableString;

    iget-object v5, v2, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-direct {v3, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 126
    .local v3, "verseString":Landroid/text/SpannableString;
    new-instance v5, Landroid/text/style/StyleSpan;

    sget v6, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_fontstyle:I

    invoke-direct {v5, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 127
    iget-object v6, v2, Lcom/hmobile/model/TodayVerseInfo;->Verse:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v7, 0x12

    .line 126
    invoke-virtual {v3, v5, v8, v6, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 129
    sget-boolean v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->isLowLightDarkFont:Z

    if-eqz v5, :cond_1

    .line 130
    invoke-virtual {p0, v9, v11}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 131
    invoke-virtual {p0, v10, v11}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 132
    const v5, 0x7f0200ae

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_backgroundImage:I

    .line 139
    :goto_1
    const v5, 0x7f0e0139

    .line 140
    const-string v6, "setBackgroundResource"

    sget v7, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_backgroundImage:I

    .line 139
    invoke-virtual {p0, v5, v6, v7}, Landroid/widget/RemoteViews;->setInt(ILjava/lang/String;I)V

    .line 141
    invoke-virtual {p0, v9, v3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 142
    const-string v5, "setTextSize"

    .line 143
    sget v6, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_fontSize:F

    .line 142
    invoke-virtual {p0, v9, v5, v6}, Landroid/widget/RemoteViews;->setFloat(ILjava/lang/String;F)V

    .line 145
    new-instance v5, Ljava/lang/StringBuilder;

    iget v6, v2, Lcom/hmobile/model/TodayVerseInfo;->BookId:I

    int-to-long v6, v6

    invoke-static {v6, v7}, Lcom/hmobile/model/BookInfo;->getBookNameByBookid(J)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 146
    iget v6, v2, Lcom/hmobile/model/TodayVerseInfo;->ChapterNumber:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ":"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, v2, Lcom/hmobile/model/TodayVerseInfo;->VerseNumber:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 145
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 147
    .local v0, "book_info":Ljava/lang/String;
    invoke-virtual {p0, v10, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 149
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/MainBookActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sput-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    .line 153
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const-string v6, "book_id"

    sget v7, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->book_id:I

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 154
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const-string v6, "chap_id"

    sget v7, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->chap_id:I

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 155
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const-string v6, "verse_id"

    sget v7, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->verse_id:I

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 156
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const-string v6, "isFromWidget"

    const/4 v7, 0x1

    invoke-virtual {v5, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 158
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const/high16 v6, 0x4000000

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 159
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    sget-object v6, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->ACTION_WIDGET_CONFIGURE:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 161
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    const/high16 v6, 0x8000000

    .line 160
    invoke-static {v1, v8, v5, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    sput-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configPendingIntent:Landroid/app/PendingIntent;

    .line 171
    .end local v0    # "book_info":Ljava/lang/String;
    .end local v3    # "verseString":Landroid/text/SpannableString;
    :goto_2
    const v5, 0x7f0e0139

    .line 172
    sget-object v6, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configPendingIntent:Landroid/app/PendingIntent;

    .line 171
    invoke-virtual {p0, v5, v6}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 174
    new-instance v4, Landroid/content/ComponentName;

    .line 175
    const-class v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;

    .line 174
    invoke-direct {v4, v1, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    .local v4, "widgetComponent":Landroid/content/ComponentName;
    if-eqz p2, :cond_3

    .line 177
    const-string v5, "AppWidgetMAnager GOT"

    invoke-static {v5}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    .line 178
    invoke-virtual {p2, v4, p0}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(Landroid/content/ComponentName;Landroid/widget/RemoteViews;)V

    goto/16 :goto_0

    .line 134
    .end local v4    # "widgetComponent":Landroid/content/ComponentName;
    .restart local v3    # "verseString":Landroid/text/SpannableString;
    :cond_1
    invoke-virtual {p0, v9, v12}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 135
    invoke-virtual {p0, v10, v12}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 136
    const v5, 0x7f0200b0

    sput v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->widget_backgroundImage:I

    goto/16 :goto_1

    .line 164
    .end local v3    # "verseString":Landroid/text/SpannableString;
    :cond_2
    const-string v5, "Please check your internet connection"

    .line 163
    invoke-virtual {p0, v9, v5}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 165
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/hmobile/biblekjv/TodayActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sput-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    .line 166
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    sget-object v6, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->ACTION_WIDGET_CONFIGURE:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 168
    sget-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configIntent:Landroid/content/Intent;

    .line 167
    invoke-static {v1, v8, v5, v8}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    sput-object v5, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->configPendingIntent:Landroid/app/PendingIntent;

    goto :goto_2

    .line 180
    .restart local v4    # "widgetComponent":Landroid/content/ComponentName;
    :cond_3
    const-string v5, "AppWidgetMAnager is null"

    invoke-static {v5}, Lcom/hmobile/common/Utils;->LogInfo(Ljava/lang/String;)V

    goto/16 :goto_0
.end method


# virtual methods
.method public onDeleted(Landroid/content/Context;[I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appWidgetIds"    # [I

    .prologue
    .line 85
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onDeleted(Landroid/content/Context;[I)V

    .line 86
    return-void
.end method

.method public onDisabled(Landroid/content/Context;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v4, 0x0

    .line 74
    .line 75
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/hmobile/biblekjv/WidgetUpdateService;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    invoke-static {p1, v4, v2, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 78
    .local v1, "widgetUpdateService":Landroid/app/PendingIntent;
    const-string v2, "alarm"

    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 77
    check-cast v0, Landroid/app/AlarmManager;

    .line 79
    .local v0, "am":Landroid/app/AlarmManager;
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 80
    invoke-super {p0, p1}, Landroid/appwidget/AppWidgetProvider;->onDisabled(Landroid/content/Context;)V

    .line 81
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 90
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    sput-object v0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    .line 91
    invoke-direct {p0, p1}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->getRemoteViews(Landroid/content/Context;)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->remoteViews:Landroid/widget/RemoteViews;

    .line 92
    iget-object v0, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->remoteViews:Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->m_appmanager:Landroid/appwidget/AppWidgetManager;

    invoke-static {v0, p1, v1}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->updateWidget(Landroid/widget/RemoteViews;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;)V

    .line 93
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 94
    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "appWidgetManager"    # Landroid/appwidget/AppWidgetManager;
    .param p3, "appWidgetIds"    # [I

    .prologue
    .line 56
    move-object v0, p1

    .line 57
    .local v0, "c":Landroid/content/Context;
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    sput-object v1, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->settings:Landroid/content/SharedPreferences;

    .line 58
    iput-object p2, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->m_appmanager:Landroid/appwidget/AppWidgetManager;

    .line 59
    const/4 v1, 0x0

    aget v1, p3, v1

    iput v1, p0, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->m_widgetid:I

    .line 60
    invoke-direct {p0, p1}, Lcom/hmobile/biblekjv/HolyBibleWidgetSmall;->getRemoteViews(Landroid/content/Context;)Landroid/widget/RemoteViews;

    move-result-object v1

    invoke-virtual {p2, p3, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget([ILandroid/widget/RemoteViews;)V

    .line 61
    invoke-super {p0, p1, p2, p3}, Landroid/appwidget/AppWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    .line 62
    return-void
.end method
