.class public final Lcom/cmcm/adsdk/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/cmcm/adsdk/b/e;


# instance fields
.field private b:Lcom/cmcm/adsdk/b/d/a;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Landroid/app/PendingIntent;

.field private g:Lcom/cmcm/adsdk/b/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    sput-object v0, Lcom/cmcm/adsdk/b/e;->a:Lcom/cmcm/adsdk/b/e;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/b/e;->e:Z

    .line 41
    iput-object p1, p0, Lcom/cmcm/adsdk/b/e;->c:Landroid/content/Context;

    .line 42
    invoke-static {}, Lcom/cmcm/adsdk/b/d/a;->a()Lcom/cmcm/adsdk/b/d/a;

    move-result-object v0

    iput-object v0, p0, Lcom/cmcm/adsdk/b/e;->b:Lcom/cmcm/adsdk/b/d/a;

    .line 43
    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/e;
    .locals 2

    .prologue
    .line 47
    const-class v1, Lcom/cmcm/adsdk/b/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cmcm/adsdk/b/e;->a:Lcom/cmcm/adsdk/b/e;

    if-nez v0, :cond_0

    .line 48
    new-instance v0, Lcom/cmcm/adsdk/b/e;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/b/e;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/cmcm/adsdk/b/e;->a:Lcom/cmcm/adsdk/b/e;

    .line 50
    :cond_0
    sget-object v0, Lcom/cmcm/adsdk/b/e;->a:Lcom/cmcm/adsdk/b/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/b/e;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/cmcm/adsdk/b/e;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/cmcm/adsdk/b/e;)Lcom/cmcm/adsdk/b/d/a;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/cmcm/adsdk/b/e;->b:Lcom/cmcm/adsdk/b/d/a;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)V
    .locals 7

    .prologue
    const-wide/32 v4, 0x6ddd00

    .line 54
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/cmcm/adsdk/b/e;->e:Z

    if-eqz v0, :cond_0

    .line 55
    const-string v0, "ConfigChangeMonitor"

    const-string v1, "has start monitor, avoid repeat monitor ..."

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :goto_0
    monitor-exit p0

    return-void

    .line 58
    :cond_0
    :try_start_1
    const-string v0, "ConfigChangeMonitor"

    const-string v1, "start monitor..."

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    iput-object p1, p0, Lcom/cmcm/adsdk/b/e;->d:Ljava/lang/String;

    .line 60
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/b/e;->e:Z

    .line 61
    iget-object v0, p0, Lcom/cmcm/adsdk/b/e;->g:Lcom/cmcm/adsdk/b/f;

    if-nez v0, :cond_1

    .line 62
    new-instance v0, Lcom/cmcm/adsdk/b/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/cmcm/adsdk/b/f;-><init>(Lcom/cmcm/adsdk/b/e;B)V

    iput-object v0, p0, Lcom/cmcm/adsdk/b/e;->g:Lcom/cmcm/adsdk/b/f;

    .line 64
    :cond_1
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 65
    const-string v1, "com.cmcm.adsdk.ConfigMonitor_Action"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :try_start_2
    iget-object v1, p0, Lcom/cmcm/adsdk/b/e;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/b/e;->g:Lcom/cmcm/adsdk/b/f;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :goto_1
    :try_start_3
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 72
    const-string v1, "com.cmcm.adsdk.ConfigMonitor_Action"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 73
    iget-object v1, p0, Lcom/cmcm/adsdk/b/e;->f:Landroid/app/PendingIntent;

    if-nez v1, :cond_2

    .line 74
    iget-object v1, p0, Lcom/cmcm/adsdk/b/e;->c:Landroid/content/Context;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, p0, Lcom/cmcm/adsdk/b/e;->f:Landroid/app/PendingIntent;

    .line 76
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/b/e;->c:Landroid/content/Context;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v4

    .line 78
    const/4 v1, 0x1

    const-wide/32 v4, 0x6ddd00

    iget-object v6, p0, Lcom/cmcm/adsdk/b/e;->f:Landroid/app/PendingIntent;

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setRepeating(IJJLandroid/app/PendingIntent;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 69
    :catch_0
    move-exception v0

    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_1
.end method
