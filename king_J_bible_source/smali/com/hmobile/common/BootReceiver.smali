.class public Lcom/hmobile/common/BootReceiver;
.super Landroid/content/BroadcastReceiver;
.source "BootReceiver.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 14
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 20
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v11

    .line 21
    .local v11, "settings":Landroid/content/SharedPreferences;
    const-string v1, "notification_hour"

    const/16 v2, 0x8

    invoke-interface {v11, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v8

    .line 22
    .local v8, "h":I
    const-string v1, "notification_min"

    const/4 v2, 0x0

    invoke-interface {v11, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v9

    .line 24
    .local v9, "m":I
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v13

    .line 25
    .local v13, "updateTime":Ljava/util/Calendar;
    const/16 v1, 0xb

    invoke-virtual {v13, v1, v8}, Ljava/util/Calendar;->set(II)V

    .line 26
    const/16 v1, 0xc

    invoke-virtual {v13, v1, v9}, Ljava/util/Calendar;->set(II)V

    .line 28
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 29
    .local v7, "curTime":Ljava/util/Calendar;
    invoke-virtual {v13, v7}, Ljava/util/Calendar;->before(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 30
    const/4 v1, 0x5

    const/4 v2, 0x1

    invoke-virtual {v13, v1, v2}, Ljava/util/Calendar;->add(II)V

    .line 32
    :cond_0
    invoke-virtual {v13}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 33
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 32
    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    .line 35
    .local v12, "timeDiff":Ljava/lang/Long;
    new-instance v10, Landroid/content/Intent;

    const-class v1, Lcom/hmobile/common/MyDailyQuoteReceiver;

    invoke-direct {v10, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 37
    .local v10, "myIntent":Landroid/content/Intent;
    const/4 v1, 0x0

    .line 38
    const/high16 v2, 0x10000000

    .line 36
    invoke-static {p1, v1, v10, v2}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 39
    .local v6, "pendingIntent":Landroid/app/PendingIntent;
    const-string v1, "alarm"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 40
    .local v0, "am":Landroid/app/AlarmManager;
    invoke-virtual {v0, v6}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v2, v4

    .line 43
    const-wide/32 v4, 0x5265c00

    .line 41
    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    .line 47
    return-void
.end method
