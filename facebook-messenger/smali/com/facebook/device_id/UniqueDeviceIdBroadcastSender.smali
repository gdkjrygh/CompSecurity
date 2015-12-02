.class public Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;
.super Lcom/facebook/auth/a/a;
.source "UniqueDeviceIdBroadcastSender.java"


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
.field private final b:Lcom/facebook/device_id/l;

.field private final c:Lcom/facebook/common/time/a;

.field private final d:Landroid/content/Context;

.field private final e:Landroid/app/AlarmManager;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/device_id/g;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/device_id/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const-class v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;

    sput-object v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/device_id/l;Lcom/facebook/common/time/a;Landroid/content/Context;Landroid/app/AlarmManager;Ljavax/inject/a;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/device_id/l;",
            "Lcom/facebook/common/time/a;",
            "Landroid/content/Context;",
            "Landroid/app/AlarmManager;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/device_id/g;",
            ">;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/device_id/a;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 50
    invoke-direct {p0}, Lcom/facebook/auth/a/a;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->b:Lcom/facebook/device_id/l;

    .line 52
    iput-object p2, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->c:Lcom/facebook/common/time/a;

    .line 53
    iput-object p3, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->d:Landroid/content/Context;

    .line 54
    iput-object p4, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->e:Landroid/app/AlarmManager;

    .line 55
    iput-object p5, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->f:Ljavax/inject/a;

    .line 56
    iput-object p6, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->g:Ljava/util/Set;

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)Lcom/facebook/device_id/l;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->b:Lcom/facebook/device_id/l;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)Ljava/util/Set;
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->g:Ljava/util/Set;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->i()V

    return-void
.end method

.method private i()V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 93
    sget-object v0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->a:Ljava/lang/Class;

    const-string v1, "querying other apps for unique id"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 95
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 96
    const-string v0, "com.facebook.GET_UNIQUE_ID"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    iget-object v0, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/facebook/device_id/g;

    .line 99
    new-instance v0, Lcom/facebook/device_id/j;

    invoke-direct {v0, p0}, Lcom/facebook/device_id/j;-><init>(Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;)V

    invoke-virtual {v3, v0}, Lcom/facebook/device_id/g;->a(Lcom/facebook/device_id/h;)V

    .line 114
    iget-object v0, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->d:Landroid/content/Context;

    const-string v2, "com.facebook.receiver.permission.ACCESS"

    const/4 v5, 0x1

    move-object v6, v4

    move-object v7, v4

    invoke-virtual/range {v0 .. v7}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V

    .line 116
    return-void
.end method

.method private j()J
    .locals 7

    .prologue
    .line 119
    new-instance v0, Ljava/util/Random;

    iget-object v1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->c:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V

    .line 120
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    add-int/lit8 v1, v1, -0x6

    int-to-long v1, v1

    const-wide/32 v3, 0x36ee80

    mul-long/2addr v1, v3

    const/16 v3, 0x3c

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1e

    int-to-long v3, v0

    const-wide/32 v5, 0xea60

    mul-long/2addr v3, v5

    add-long v0, v1, v3

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/facebook/auth/protocol/AuthenticationResult;)V
    .locals 5
    .param p1    # Lcom/facebook/auth/protocol/AuthenticationResult;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 72
    iget-object v0, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->b:Lcom/facebook/device_id/l;

    invoke-virtual {v0}, Lcom/facebook/device_id/l;->d()Lcom/facebook/device_id/i;

    move-result-object v0

    .line 73
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->c:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    invoke-virtual {v0}, Lcom/facebook/device_id/i;->b()J

    move-result-wide v3

    sub-long v0, v1, v3

    const-wide/32 v2, 0xa4cb800

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 86
    :goto_0
    return-void

    .line 78
    :cond_0
    invoke-direct {p0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->i()V

    .line 81
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->d:Landroid/content/Context;

    const-class v2, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender$LocalBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    const-string v1, "com.facebook.GET_UNIQUE_ID"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 83
    iget-object v1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->d:Landroid/content/Context;

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->c:Lcom/facebook/common/time/a;

    invoke-interface {v1}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    add-long/2addr v1, v3

    invoke-direct {p0}, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->j()J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 85
    iget-object v3, p0, Lcom/facebook/device_id/UniqueDeviceIdBroadcastSender;->e:Landroid/app/AlarmManager;

    const/4 v4, 0x1

    invoke-virtual {v3, v4, v1, v2, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    goto :goto_0
.end method
