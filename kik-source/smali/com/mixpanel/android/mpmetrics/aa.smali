.class final Lcom/mixpanel/android/mpmetrics/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/mixpanel/android/mpmetrics/v$c;


# direct methods
.method constructor <init>(Lcom/mixpanel/android/mpmetrics/v$c;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 1430
    iput-object p1, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    iput-object p2, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 1434
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a()Ljava/util/concurrent/locks/ReentrantLock;

    move-result-object v2

    .line 1435
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 1437
    :try_start_0
    invoke-static {}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->b()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 1490
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 1491
    :goto_0
    return-void

    .line 1441
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->a:Lcom/mixpanel/android/mpmetrics/InAppNotification;

    .line 1442
    if-nez v0, :cond_7

    .line 1443
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iget-object v1, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/v;->d()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    :goto_1
    move-object v1, v0

    .line 1445
    :goto_2
    if-nez v1, :cond_2

    .line 1490
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1443
    :cond_1
    :try_start_2
    iget-object v1, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v1}, Lcom/mixpanel/android/mpmetrics/v;->b(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/h;

    move-result-object v1

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->e(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/t;->e()Z

    move-result v0

    invoke-virtual {v1, v0}, Lcom/mixpanel/android/mpmetrics/h;->b(Z)Lcom/mixpanel/android/mpmetrics/InAppNotification;

    move-result-object v0

    goto :goto_1

    .line 1449
    :cond_2
    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->c()Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    move-result-object v3

    .line 1450
    sget-object v0, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->c:Lcom/mixpanel/android/mpmetrics/InAppNotification$a;

    if-ne v3, v0, :cond_3

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/f;->a(Landroid/content/Context;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    if-nez v0, :cond_3

    .line 1490
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1454
    :cond_3
    :try_start_3
    iget-object v4, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    const/high16 v0, -0x1000000

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lcom/mixpanel/android/a/a;->a(Landroid/app/Activity;IIZ)Landroid/graphics/Bitmap;

    move-result-object v4

    if-eqz v4, :cond_4

    const/4 v0, 0x0

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v0

    :cond_4
    invoke-static {v0}, Lcom/mixpanel/android/a/a;->a(I)I

    move-result v0

    .line 1455
    new-instance v4, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    invoke-direct {v4, v1, v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;-><init>(Lcom/mixpanel/android/mpmetrics/InAppNotification;I)V

    .line 1457
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v$c;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v5, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iget-object v5, v5, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v5}, Lcom/mixpanel/android/mpmetrics/v;->c(Lcom/mixpanel/android/mpmetrics/v;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v0, v5}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->a(Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result v4

    .line 1458
    if-gtz v4, :cond_5

    .line 1459
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_0

    .line 1463
    :cond_5
    :try_start_4
    sget-object v0, Lcom/mixpanel/android/mpmetrics/v$1;->a:[I

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/InAppNotification$a;->ordinal()I

    move-result v5

    aget v0, v0, v5

    packed-switch v0, :pswitch_data_0

    .line 1484
    const-string v0, "MixpanelAPI"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Unrecognized notification type "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " can\'t be shown"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1486
    :goto_3
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-static {v0}, Lcom/mixpanel/android/mpmetrics/v;->e(Lcom/mixpanel/android/mpmetrics/v;)Lcom/mixpanel/android/mpmetrics/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/t;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1487
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    const-string v3, "$campaign_delivery"

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->a()Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/mixpanel/android/mpmetrics/v;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    iget-object v0, v0, Lcom/mixpanel/android/mpmetrics/v$c;->a:Lcom/mixpanel/android/mpmetrics/v;

    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/v;->c()Lcom/mixpanel/android/mpmetrics/v$b;

    move-result-object v0

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/aa;->c:Lcom/mixpanel/android/mpmetrics/v$c;

    invoke-virtual {v3}, Lcom/mixpanel/android/mpmetrics/v$c;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/mixpanel/android/mpmetrics/v$b;->b(Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/v$b;

    move-result-object v3

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->a()Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v4

    :try_start_5
    const-string v5, "$time"

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_4
    :try_start_6
    const-string v0, "$campaigns"

    invoke-virtual {v1}, Lcom/mixpanel/android/mpmetrics/InAppNotification;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Lcom/mixpanel/android/mpmetrics/v$b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "$notifications"

    invoke-interface {v3, v0, v4}, Lcom/mixpanel/android/mpmetrics/v$b;->a(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1490
    :cond_6
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto/16 :goto_0

    .line 1465
    :pswitch_0
    :try_start_7
    invoke-static {v4}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->b(I)Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;

    move-result-object v0

    .line 1466
    new-instance v3, Lcom/mixpanel/android/mpmetrics/k;

    invoke-direct {v3}, Lcom/mixpanel/android/mpmetrics/k;-><init>()V

    .line 1467
    invoke-virtual {v0}, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState;->c()Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState;

    move-result-object v0

    check-cast v0, Lcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;

    invoke-virtual {v3, v4, v0}, Lcom/mixpanel/android/mpmetrics/k;->a(ILcom/mixpanel/android/mpmetrics/UpdateDisplayState$DisplayState$InAppNotificationState;)V

    .line 1468
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/mixpanel/android/mpmetrics/k;->setRetainInstance(Z)V

    .line 1469
    iget-object v0, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    .line 1470
    const/4 v4, 0x0

    sget v5, Lcom/mixpanel/android/a$a;->b:I

    invoke-virtual {v0, v4, v5}, Landroid/app/FragmentTransaction;->setCustomAnimations(II)Landroid/app/FragmentTransaction;

    .line 1471
    const v4, 0x1020002

    invoke-virtual {v0, v4, v3}, Landroid/app/FragmentTransaction;->add(ILandroid/app/Fragment;)Landroid/app/FragmentTransaction;

    .line 1472
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commit()I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_3

    .line 1490
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    .line 1476
    :pswitch_1
    :try_start_8
    new-instance v0, Landroid/content/Intent;

    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-class v5, Lcom/mixpanel/android/surveys/SurveyActivity;

    invoke-direct {v0, v3, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1477
    const/high16 v3, 0x10000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1478
    const/high16 v3, 0x20000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1479
    const-string v3, "com.mixpanel.android.surveys.SurveyActivity.INTENT_ID_KEY"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1480
    iget-object v3, p0, Lcom/mixpanel/android/mpmetrics/aa;->b:Landroid/app/Activity;

    invoke-virtual {v3, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_3

    .line 1487
    :catch_0
    move-exception v0

    const-string v5, "MixpanelAPI"

    const-string v6, "Exception trying to track an in app notification seen"

    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_4

    :cond_7
    move-object v1, v0

    goto/16 :goto_2

    .line 1463
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
