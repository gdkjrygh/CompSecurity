.class Lcom/hmobile/biblekjv/SettingsActivity$1;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/app/TimePickerDialog$OnTimeSetListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/biblekjv/SettingsActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SettingsActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    .line 474
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTimeSet(Landroid/widget/TimePicker;II)V
    .locals 11
    .param p1, "arg0"    # Landroid/widget/TimePicker;
    .param p2, "h"    # I
    .param p3, "m"    # I

    .prologue
    const/4 v1, 0x0

    .line 478
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "notification_hour"

    invoke-interface {v2, v3, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 479
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "notification_min"

    invoke-interface {v2, v3, p3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 480
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "is_notification"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 481
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 483
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    # invokes: Lcom/hmobile/biblekjv/SettingsActivity;->setTime(II)V
    invoke-static {v2, p2, p3}, Lcom/hmobile/biblekjv/SettingsActivity;->access$0(Lcom/hmobile/biblekjv/SettingsActivity;II)V

    .line 485
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v3, "notification_millis"

    const-wide/16 v4, 0x0

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 486
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v2, v2, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 488
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v10

    .line 489
    .local v10, "updateTime":Ljava/util/Calendar;
    const/16 v2, 0xb

    invoke-virtual {v10, v2, p2}, Ljava/util/Calendar;->set(II)V

    .line 490
    const/16 v2, 0xc

    invoke-virtual {v10, v2, p3}, Ljava/util/Calendar;->set(II)V

    .line 492
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v7

    .line 493
    .local v7, "curTime":Ljava/util/Calendar;
    invoke-virtual {v10}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 494
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    .line 493
    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    .line 496
    .local v9, "timeDiff":Ljava/lang/Long;
    new-instance v8, Landroid/content/Intent;

    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    .line 497
    const-class v3, Lcom/hmobile/common/MyDailyQuoteReceiver;

    .line 496
    invoke-direct {v8, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 499
    .local v8, "myIntent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    .line 500
    const/high16 v3, 0x10000000

    .line 498
    invoke-static {v2, v1, v8, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v6

    .line 501
    .local v6, "pendingIntent":Landroid/app/PendingIntent;
    iget-object v2, p0, Lcom/hmobile/biblekjv/SettingsActivity$1;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    const-string v3, "alarm"

    invoke-virtual {v2, v3}, Lcom/hmobile/biblekjv/SettingsActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 502
    .local v0, "am":Landroid/app/AlarmManager;
    invoke-virtual {v0, v6}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 503
    invoke-virtual {v7}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    .line 504
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    add-long/2addr v2, v4

    const-wide/32 v4, 0x5265c00

    .line 503
    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V

    .line 508
    return-void
.end method
