.class public Lcom/qihoo/security/services/d;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field private a:I

.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private volatile d:Z

.field private volatile e:Lcom/qihoo/security/services/a;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/qihoo/security/services/d;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/services/d;->d:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    iput-object p1, p0, Lcom/qihoo/security/services/d;->b:Landroid/content/Context;

    iput v1, p0, Lcom/qihoo/security/services/d;->a:I

    iput-object p2, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    return-void
.end method

.method private f()V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    if-nez v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    const/16 v2, 0xa

    if-lt v0, v2, :cond_1

    :cond_0
    :goto_1
    return-void

    :cond_1
    const-wide/16 v2, 0xc8

    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/services/a;
    .locals 4

    iget-boolean v0, p0, Lcom/qihoo/security/services/d;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/services/d;->f()V

    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    invoke-interface {v1, p1}, Lcom/qihoo/security/services/a;->h(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x1

    const/16 v2, 0xa

    if-lt v0, v2, :cond_1

    :cond_0
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    return-object v0

    :cond_1
    const-wide/16 v2, 0xc8

    :try_start_1
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public a()Z
    .locals 6

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/qihoo/security/services/d;->b:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lcom/qihoo/security/services/d;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/services/ScanEngineService;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2, p0, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    const/4 v2, 0x4

    const-wide/16 v4, 0x157c

    invoke-virtual {v1, v2, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/services/d;->a:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/services/d;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/qihoo/security/services/d;->a:I

    invoke-virtual {p0}, Lcom/qihoo/security/services/d;->a()Z

    :cond_0
    return-void
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/services/d;->d:Z

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/services/d;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Lcom/qihoo/security/services/a;
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/services/d;->d:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/services/d;->f()V

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    return-object v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/services/d;->d:Z

    invoke-static {p2}, Lcom/qihoo/security/services/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/services/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    iget-object v0, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 8

    const-wide/16 v6, 0x3e8

    const/4 v4, 0x2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/services/d;->e:Lcom/qihoo/security/services/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/services/d;->a:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    iget-boolean v2, p0, Lcom/qihoo/security/services/d;->d:Z

    if-eqz v2, :cond_0

    cmp-long v0, v0, v6

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/services/d;->c:Landroid/os/Handler;

    invoke-virtual {v0, v4, v6, v7}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method
