.class public Lcom/capitalone/mobile/banking/session/SessionManager;
.super Ljava/lang/Object;
.source "SessionManager.java"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroid/os/Handler$Callback;


# static fields
.field private static final MESSAGE_ID:I = 0x8

.field private static final TAG:Ljava/lang/String; = "SessionManager"


# instance fields
.field private context:Landroid/content/Context;

.field private handler:Landroid/os/Handler;

.field private mElapsedTime:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    .line 40
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 42
    return-void
.end method

.method private startTimeout()V
    .locals 4

    .prologue
    .line 98
    const-string v0, "SessionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Adding timeout for 300000 milliseconds starting "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 101
    iget-object v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    const/16 v1, 0x8

    const-wide/32 v2, 0x493e0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 102
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 63
    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 64
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 65
    const-string v1, "SessionManager"

    const-string v2, "handleMessage() - Timeout met, firing broadcast"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    const-class v2, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 67
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 69
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    const/4 v1, 0x1

    return v1
.end method

.method public isTimeoutScheduled()Z
    .locals 2

    .prologue
    .line 91
    iget-object v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    return v0
.end method

.method public removeTimeout()V
    .locals 2

    .prologue
    .line 84
    const-string v0, "SessionManager"

    const-string v1, "Removing all timeouts"

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 87
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 88
    return-void
.end method

.method public resetTimeout()V
    .locals 0

    .prologue
    .line 76
    invoke-virtual {p0}, Lcom/capitalone/mobile/banking/session/SessionManager;->removeTimeout()V

    .line 77
    invoke-direct {p0}, Lcom/capitalone/mobile/banking/session/SessionManager;->startTimeout()V

    .line 78
    return-void
.end method

.method public restartTimer()V
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/16 v8, 0x8

    .line 114
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    iget-wide v6, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    sub-long v0, v4, v6

    .line 115
    .local v0, "msElapsed":J
    const-string v4, "SessionManager"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Time elapsed ms: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    const-wide/16 v2, 0x0

    .line 117
    .local v2, "remainder":J
    cmp-long v4, v0, v10

    if-lez v4, :cond_0

    .line 118
    const-wide/32 v4, 0x493e0

    sub-long v2, v4, v0

    .line 121
    :cond_0
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    invoke-virtual {v4, v8}, Landroid/os/Handler;->removeMessages(I)V

    .line 122
    cmp-long v4, v2, v10

    if-lez v4, :cond_1

    .line 123
    const-string v4, "SessionManager"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Restarting timer for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " milliseconds"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    invoke-virtual {v4, v8, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 129
    :goto_0
    return-void

    .line 126
    :cond_1
    const-string v4, "SessionManager"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Timer expired send msg - remaining ms: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    iget-object v4, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->handler:Landroid/os/Handler;

    invoke-virtual {v4, v8}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method

.method public run()V
    .locals 4

    .prologue
    .line 52
    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 53
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 54
    const-string v1, "SessionManager"

    const-string v2, "Timeout met, firing broadcast"

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    const-class v2, Lcom/capitalone/mobile/banking/session/TimeoutBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->context:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 58
    .end local v0    # "intent":Landroid/content/Intent;
    :cond_0
    return-void
.end method

.method public saveTime()V
    .locals 4

    .prologue
    .line 136
    iget-wide v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 137
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    .line 138
    const-string v0, "SessionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Saving time: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    :goto_0
    return-void

    .line 141
    :cond_0
    const-string v0, "SessionManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Not resetting elapsed time already set to: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lcom/capitalone/mobile/banking/session/SessionManager;->mElapsedTime:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " ms"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
