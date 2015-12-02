.class public Lcom/facebook/push/PushInitializer;
.super Lcom/facebook/auth/a/a;
.source "PushInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/app/AlarmManager;

.field private final d:Landroid/os/Handler;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/f;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 33
    const-class v0, Lcom/facebook/push/PushInitializer;

    sput-object v0, Lcom/facebook/push/PushInitializer;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/app/AlarmManager;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/app/AlarmManager;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/push/f;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/facebook/auth/a/a;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/push/PushInitializer;->b:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/facebook/push/PushInitializer;->c:Landroid/app/AlarmManager;

    .line 50
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/push/PushInitializer;->d:Landroid/os/Handler;

    .line 51
    iput-object p3, p0, Lcom/facebook/push/PushInitializer;->e:Ljava/util/Set;

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/facebook/push/PushInitializer;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/push/PushInitializer;->j()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/push/PushInitializer;Z)Z
    .locals 0

    .prologue
    .line 31
    iput-boolean p1, p0, Lcom/facebook/push/PushInitializer;->f:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/push/PushInitializer;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/facebook/push/PushInitializer;->d:Landroid/os/Handler;

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/facebook/push/PushInitializer;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/f;

    .line 74
    invoke-interface {v0}, Lcom/facebook/push/f;->b()V

    goto :goto_0

    .line 77
    :cond_0
    invoke-direct {p0}, Lcom/facebook/push/PushInitializer;->l()V

    .line 78
    return-void
.end method

.method private k()V
    .locals 2

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/push/PushInitializer;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/f;

    .line 82
    invoke-interface {v0}, Lcom/facebook/push/f;->c()V

    goto :goto_0

    .line 84
    :cond_0
    return-void
.end method

.method private l()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 87
    iget-boolean v0, p0, Lcom/facebook/push/PushInitializer;->f:Z

    if-eqz v0, :cond_0

    .line 99
    :goto_0
    return-void

    .line 93
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/push/PushInitializer;->b:Landroid/content/Context;

    const-class v2, Lcom/facebook/push/PushInitializer$LocalBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 94
    const-string v1, "com.facebook.orca.push.ACTION_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    iget-object v1, p0, Lcom/facebook/push/PushInitializer;->b:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 96
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    add-long/2addr v1, v3

    .line 97
    iget-object v3, p0, Lcom/facebook/push/PushInitializer;->c:Landroid/app/AlarmManager;

    invoke-virtual {v3, v5, v1, v2, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 98
    iput-boolean v5, p0, Lcom/facebook/push/PushInitializer;->f:Z

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 56
    sget-object v0, Lcom/facebook/push/PushInitializer;->a:Ljava/lang/Class;

    const-string v1, "PushInitializer.init"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 57
    invoke-direct {p0}, Lcom/facebook/push/PushInitializer;->j()V

    .line 58
    return-void
.end method

.method public d()V
    .locals 0

    .prologue
    .line 69
    invoke-direct {p0}, Lcom/facebook/push/PushInitializer;->k()V

    .line 70
    return-void
.end method

.method public i()V
    .locals 2

    .prologue
    .line 61
    sget-object v0, Lcom/facebook/push/PushInitializer;->a:Ljava/lang/Class;

    const-string v1, "PushInitializer.onLogin"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/facebook/push/PushInitializer;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/push/f;

    .line 63
    invoke-interface {v0}, Lcom/facebook/push/f;->a()V

    goto :goto_0

    .line 65
    :cond_0
    return-void
.end method
