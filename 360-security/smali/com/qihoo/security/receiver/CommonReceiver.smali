.class public Lcom/qihoo/security/receiver/CommonReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/receiver/CommonReceiver$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private final b:Lcom/qihoo/security/notify/b;

.field private c:J

.field private final d:Lcom/qihoo/security/receiver/CommonReceiver$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const-class v0, Lcom/qihoo/security/receiver/CommonReceiver;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/receiver/CommonReceiver;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/notify/b;Lcom/qihoo/security/receiver/CommonReceiver$a;)V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/qihoo/security/receiver/CommonReceiver;->b:Lcom/qihoo/security/notify/b;

    .line 40
    iput-object p2, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->c:J

    .line 42
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 121
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    const-string/jumbo v1, "android.intent.action.SCREEN_OFF"

    invoke-direct {v0, v1}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 123
    const-string/jumbo v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 124
    const-string/jumbo v1, "android.intent.action.PHONE_STATE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 126
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 127
    const-string/jumbo v2, "com.qihoo.security.action.RELOAD_CONFIG"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 130
    const-string/jumbo v0, "com.qihoo.security.lite.PERMISSION"

    const/4 v2, 0x0

    invoke-virtual {p1, p0, v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 136
    :goto_0
    return-void

    .line 131
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 140
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :goto_0
    return-void

    .line 141
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 6

    .prologue
    .line 46
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 51
    :cond_1
    const-string/jumbo v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 57
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    if-eqz v0, :cond_2

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    invoke-interface {v0}, Lcom/qihoo/security/receiver/CommonReceiver$a;->a()V

    .line 61
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 62
    iget-wide v2, p0, Lcom/qihoo/security/receiver/CommonReceiver;->c:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x7530

    cmp-long v2, v2, v4

    if-gez v2, :cond_3

    iget-wide v2, p0, Lcom/qihoo/security/receiver/CommonReceiver;->c:J

    cmp-long v2, v0, v2

    if-gtz v2, :cond_0

    .line 70
    :cond_3
    iput-wide v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->c:J

    .line 73
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/b;->a()V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->b:Lcom/qihoo/security/notify/b;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->b:Lcom/qihoo/security/notify/b;

    invoke-virtual {v0}, Lcom/qihoo/security/notify/b;->c()V

    goto :goto_0

    .line 81
    :cond_4
    const-string/jumbo v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 86
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    invoke-interface {v0}, Lcom/qihoo/security/receiver/CommonReceiver$a;->c()V

    goto :goto_0

    .line 89
    :cond_5
    const-string/jumbo v1, "android.intent.action.PHONE_STATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 91
    iget-object v0, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    if-eqz v0, :cond_0

    .line 92
    const-string/jumbo v0, "phone"

    invoke-static {p1, v0}, Lcom/qihoo360/common/utils/Utils;->getSystemService(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 94
    iget-object v1, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getCallState()I

    move-result v0

    invoke-interface {v1, v0}, Lcom/qihoo/security/receiver/CommonReceiver$a;->a(I)V

    goto :goto_0

    .line 97
    :cond_6
    const-string/jumbo v1, "com.qihoo.security.action.RELOAD_CONFIG"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 100
    if-eqz v0, :cond_0

    .line 103
    const-string/jumbo v1, "CONFIG_FILENAME"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 113
    iget-object v1, p0, Lcom/qihoo/security/receiver/CommonReceiver;->d:Lcom/qihoo/security/receiver/CommonReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/receiver/CommonReceiver$a;->c(Ljava/lang/String;)V

    goto/16 :goto_0
.end method
