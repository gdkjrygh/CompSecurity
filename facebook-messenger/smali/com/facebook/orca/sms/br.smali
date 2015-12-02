.class public Lcom/facebook/orca/sms/br;
.super Ljava/lang/Object;
.source "SmsSendMessageHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/orca/sms/bn;

.field private final d:Lcom/facebook/orca/sms/af;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/orca/sms/br;

    sput-object v0, Lcom/facebook/orca/sms/br;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/sms/bn;Lcom/facebook/orca/sms/af;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    .line 48
    iput-object p2, p0, Lcom/facebook/orca/sms/br;->c:Lcom/facebook/orca/sms/bn;

    .line 49
    iput-object p3, p0, Lcom/facebook/orca/sms/br;->d:Lcom/facebook/orca/sms/af;

    .line 50
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/sms/br;)Lcom/facebook/orca/sms/af;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->d:Lcom/facebook/orca/sms/af;

    return-object v0
.end method


# virtual methods
.method a(Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)Lcom/facebook/messages/model/threads/Message;
    .locals 14

    .prologue
    .line 58
    new-instance v6, Ljava/util/concurrent/Semaphore;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 59
    new-instance v10, Lcom/facebook/orca/sms/bu;

    const/4 v0, 0x0

    invoke-direct {v10, v0}, Lcom/facebook/orca/sms/bu;-><init>(Lcom/facebook/orca/sms/bs;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    const-string v3, "SMS_SENT"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    .line 62
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    const/4 v1, 0x0

    new-instance v3, Landroid/content/Intent;

    const-string v4, "SMS_DELIVERED"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {v0, v1, v3, v4}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    .line 65
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object p2, v1, v3

    invoke-static {v1}, Lcom/google/common/a/kl;->a([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v1

    invoke-static {v0, v1}, Landroid_src/c/m;->a(Landroid/content/Context;Ljava/util/Set;)J

    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    .line 71
    :goto_0
    const/4 v0, 0x0

    .line 72
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->I()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 73
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->J()Lcom/google/common/a/ev;

    move-result-object v0

    const-string v1, "trigger"

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object v9, v0

    .line 76
    :goto_1
    new-instance v11, Lcom/facebook/orca/sms/bs;

    invoke-direct {v11, p0, v10, v6}, Lcom/facebook/orca/sms/bs;-><init>(Lcom/facebook/orca/sms/br;Lcom/facebook/orca/sms/bu;Ljava/util/concurrent/Semaphore;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v3, "SMS_SENT"

    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v11, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 85
    new-instance v12, Lcom/facebook/orca/sms/bt;

    invoke-direct {v12, p0, v8}, Lcom/facebook/orca/sms/bt;-><init>(Lcom/facebook/orca/sms/br;Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v3, "SMS_DELIVERED"

    invoke-direct {v1, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 95
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v0

    .line 96
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/telephony/SmsManager;->divideMessage(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 97
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 98
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v5

    .line 99
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v1, v13, :cond_0

    .line 100
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 103
    :cond_0
    const/4 v2, 0x0

    move-object/from16 v1, p2

    invoke-virtual/range {v0 .. v5}, Landroid/telephony/SmsManager;->sendMultipartTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x78

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v0, v1, v2, v3}, Ljava/util/concurrent/Semaphore;->tryAcquire(IJLjava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->d:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;)V

    .line 108
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Semaphore could not acquire requested permits"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 110
    :cond_1
    invoke-static {v10}, Lcom/facebook/orca/sms/bu;->a(Lcom/facebook/orca/sms/bu;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 111
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->d:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v10}, Lcom/facebook/orca/sms/bu;->a(Lcom/facebook/orca/sms/bu;)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, v9}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;ZILjava/lang/String;)V

    .line 116
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SMS send failed with code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v10}, Lcom/facebook/orca/sms/bu;->a(Lcom/facebook/orca/sms/bu;)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    invoke-virtual {v0, v11}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 119
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->b:Landroid/content/Context;

    invoke-virtual {v0, v12}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/sms/br;->c:Lcom/facebook/orca/sms/bn;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x2

    move-object/from16 v1, p2

    move-wide v5, v3

    invoke-virtual/range {v0 .. v7}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;Ljava/lang/String;JJI)J

    move-result-wide v0

    .line 128
    invoke-static {v0, v1}, Lcom/facebook/orca/threads/m;->b(J)Ljava/lang/String;

    move-result-object v0

    .line 129
    new-instance v1, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v1}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v1, p1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const-string v2, "sms"

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/messages/model/threads/c;->SMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0, v8}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/location/Coordinates;)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/messages/model/threads/e;->d(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 141
    iget-object v1, p0, Lcom/facebook/orca/sms/br;->d:Lcom/facebook/orca/sms/af;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v10}, Lcom/facebook/orca/sms/bu;->a(Lcom/facebook/orca/sms/bu;)I

    move-result v4

    invoke-virtual {v1, v2, v3, v4, v9}, Lcom/facebook/orca/sms/af;->a(Ljava/lang/String;ZILjava/lang/String;)V

    .line 146
    return-object v0

    :cond_3
    move-object v9, v0

    goto/16 :goto_1

    :cond_4
    move-object v8, v0

    goto/16 :goto_0
.end method
