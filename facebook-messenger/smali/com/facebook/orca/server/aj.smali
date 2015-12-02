.class public Lcom/facebook/orca/server/aj;
.super Ljava/lang/Object;
.source "MessagesServiceManager.java"


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

.field private final c:Lcom/facebook/common/v/a;

.field private final d:Landroid/content/BroadcastReceiver;

.field private final e:Landroid/os/Handler;

.field private f:Z

.field private g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/orca/server/aj;

    sput-object v0, Lcom/facebook/orca/server/aj;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/v/a;)V
    .locals 3

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/facebook/orca/server/aj;->b:Landroid/content/Context;

    .line 42
    iput-object p2, p0, Lcom/facebook/orca/server/aj;->c:Lcom/facebook/common/v/a;

    .line 43
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/server/aj;->e:Landroid/os/Handler;

    .line 46
    new-instance v0, Lcom/facebook/orca/server/ak;

    invoke-direct {v0, p0}, Lcom/facebook/orca/server/ak;-><init>(Lcom/facebook/orca/server/aj;)V

    iput-object v0, p0, Lcom/facebook/orca/server/aj;->d:Landroid/content/BroadcastReceiver;

    .line 52
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 53
    sget-object v1, Lcom/facebook/common/v/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 54
    invoke-static {p1}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v1

    .line 55
    iget-object v2, p0, Lcom/facebook/orca/server/aj;->d:Landroid/content/BroadcastReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/a/e;->a(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 56
    return-void
.end method

.method private a()V
    .locals 9

    .prologue
    const-wide/16 v7, 0x7530

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 59
    sget-object v0, Lcom/facebook/orca/server/aj;->a:Ljava/lang/Class;

    const-string v3, "maybeStartStopBlueService"

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/server/aj;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lcom/facebook/orca/server/aj;->c:Lcom/facebook/common/v/a;

    invoke-virtual {v0}, Lcom/facebook/common/v/a;->d()J

    move-result-wide v5

    sub-long/2addr v3, v5

    cmp-long v0, v3, v7

    if-gez v0, :cond_3

    :cond_0
    move v0, v2

    .line 63
    :goto_0
    if-eqz v0, :cond_4

    .line 64
    iget-boolean v0, p0, Lcom/facebook/orca/server/aj;->f:Z

    if-nez v0, :cond_1

    .line 65
    sget-object v0, Lcom/facebook/orca/server/aj;->a:Ljava/lang/Class;

    const-string v1, "Starting BlueService"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 66
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/server/aj;->b:Landroid/content/Context;

    const-class v3, Lcom/facebook/fbservice/service/DefaultBlueService;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 67
    const-string v1, "Orca.START"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    iget-object v1, p0, Lcom/facebook/orca/server/aj;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 69
    iput-boolean v2, p0, Lcom/facebook/orca/server/aj;->f:Z

    .line 71
    :cond_1
    iget-boolean v0, p0, Lcom/facebook/orca/server/aj;->g:Z

    if-nez v0, :cond_2

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/server/aj;->e:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/server/al;

    invoke-direct {v1, p0}, Lcom/facebook/orca/server/al;-><init>(Lcom/facebook/orca/server/aj;)V

    invoke-virtual {v0, v1, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 79
    iput-boolean v2, p0, Lcom/facebook/orca/server/aj;->g:Z

    .line 90
    :cond_2
    :goto_1
    return-void

    :cond_3
    move v0, v1

    .line 60
    goto :goto_0

    .line 82
    :cond_4
    iget-boolean v0, p0, Lcom/facebook/orca/server/aj;->f:Z

    if-eqz v0, :cond_2

    .line 83
    sget-object v0, Lcom/facebook/orca/server/aj;->a:Ljava/lang/Class;

    const-string v2, "Stopping BlueService"

    invoke-static {v0, v2}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 84
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/server/aj;->b:Landroid/content/Context;

    const-class v3, Lcom/facebook/fbservice/service/DefaultBlueService;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 85
    const-string v2, "Orca.STOP"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 86
    iget-object v2, p0, Lcom/facebook/orca/server/aj;->b:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 87
    iput-boolean v1, p0, Lcom/facebook/orca/server/aj;->f:Z

    goto :goto_1
.end method

.method static synthetic a(Lcom/facebook/orca/server/aj;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/orca/server/aj;->b()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/server/aj;Z)Z
    .locals 0

    .prologue
    .line 24
    iput-boolean p1, p0, Lcom/facebook/orca/server/aj;->g:Z

    return p1
.end method

.method private b()V
    .locals 2

    .prologue
    .line 93
    sget-object v0, Lcom/facebook/orca/server/aj;->a:Ljava/lang/Class;

    const-string v1, "onActivityBroadcast"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 94
    invoke-direct {p0}, Lcom/facebook/orca/server/aj;->a()V

    .line 95
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/server/aj;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Lcom/facebook/orca/server/aj;->a()V

    return-void
.end method
