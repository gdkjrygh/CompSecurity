.class public Lcom/qihoo/security/h/c;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/h/c$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;

.field private static e:Lcom/qihoo/security/h/c;


# instance fields
.field private b:I

.field private c:Z

.field private d:Landroid/content/Context;

.field private f:Landroid/os/Handler;

.field private final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/qihoo/security/h/c$a;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/qihoo/security/h/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/h/c;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/h/c;->b:I

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/h/c;->c:Z

    .line 68
    new-instance v0, Lcom/qihoo/security/h/c$1;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/h/c$1;-><init>(Lcom/qihoo/security/h/c;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/h/c;->f:Landroid/os/Handler;

    .line 197
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/h/c;->g:Ljava/util/ArrayList;

    .line 52
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/h/c;->d:Landroid/content/Context;

    .line 53
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/h/c;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 18
    iget-object v0, p0, Lcom/qihoo/security/h/c;->d:Landroid/content/Context;

    return-object v0
.end method

.method public static a()Lcom/qihoo/security/h/c;
    .locals 3

    .prologue
    .line 43
    const-class v1, Lcom/qihoo/security/h/c;

    monitor-enter v1

    .line 44
    :try_start_0
    sget-object v0, Lcom/qihoo/security/h/c;->e:Lcom/qihoo/security/h/c;

    if-nez v0, :cond_0

    .line 45
    new-instance v0, Lcom/qihoo/security/h/c;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/qihoo/security/h/c;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/h/c;->e:Lcom/qihoo/security/h/c;

    .line 47
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    sget-object v0, Lcom/qihoo/security/h/c;->e:Lcom/qihoo/security/h/c;

    return-object v0

    .line 47
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private a(I)V
    .locals 3

    .prologue
    .line 236
    iget-object v0, p0, Lcom/qihoo/security/h/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 237
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 238
    iget-object v0, p0, Lcom/qihoo/security/h/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 239
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/h/c$a;

    .line 240
    if-nez v0, :cond_0

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/h/c;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 242
    add-int/lit8 v2, v2, -0x1

    .line 243
    add-int/lit8 v0, v1, -0x1

    move v1, v2

    .line 237
    :goto_1
    add-int/lit8 v0, v0, 0x1

    move v2, v1

    move v1, v0

    goto :goto_0

    .line 245
    :cond_0
    invoke-interface {v0, p1}, Lcom/qihoo/security/h/c$a;->a(I)V

    move v0, v1

    move v1, v2

    goto :goto_1

    .line 248
    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/h/c;I)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Lcom/qihoo/security/h/c;->a(I)V

    return-void
.end method


# virtual methods
.method public a(Z)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 61
    iget v0, p0, Lcom/qihoo/security/h/c;->b:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    move v0, v2

    .line 65
    :goto_0
    return v0

    .line 64
    :cond_0
    iget-object v3, p0, Lcom/qihoo/security/h/c;->f:Landroid/os/Handler;

    if-eqz p1, :cond_1

    const-wide/16 v0, 0xa

    :goto_1
    invoke-virtual {v3, v2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 65
    const/4 v0, 0x1

    goto :goto_0

    .line 64
    :cond_1
    const-wide/16 v0, 0x898

    goto :goto_1
.end method

.method public b()I
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lcom/qihoo/security/h/c;->b:I

    return v0
.end method

.method public declared-synchronized c()V
    .locals 6

    .prologue
    const/4 v1, 0x4

    .line 120
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lcom/qihoo/security/h/c;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    .line 195
    :goto_0
    monitor-exit p0

    return-void

    .line 124
    :cond_0
    const/4 v0, 0x2

    :try_start_1
    iput v0, p0, Lcom/qihoo/security/h/c;->b:I

    .line 125
    iget-object v0, p0, Lcom/qihoo/security/h/c;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo/security/h/c;->b:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 131
    invoke-static {}, Lcom/qihoo/security/h/f;->a()Lcom/qihoo/security/h/f;

    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lcom/qihoo/security/h/f;->d()V

    .line 135
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/qihoo/security/h/c;->c:Z

    .line 145
    invoke-virtual {v0}, Lcom/qihoo/security/h/f;->b()Z

    move-result v1

    .line 160
    const/4 v2, 0x3

    iput v2, p0, Lcom/qihoo/security/h/c;->b:I

    .line 161
    iget-object v2, p0, Lcom/qihoo/security/h/c;->f:Landroid/os/Handler;

    const/4 v3, 0x1

    iget v4, p0, Lcom/qihoo/security/h/c;->b:I

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 163
    if-eqz v1, :cond_1

    .line 164
    invoke-virtual {v0}, Lcom/qihoo/security/h/f;->c()V

    .line 184
    :cond_1
    const/4 v0, 0x4

    iput v0, p0, Lcom/qihoo/security/h/c;->b:I

    .line 185
    iget-object v0, p0, Lcom/qihoo/security/h/c;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    iget v2, p0, Lcom/qihoo/security/h/c;->b:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 188
    const-class v1, Lcom/qihoo/security/h/c;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    :try_start_2
    const-class v0, Lcom/qihoo/security/h/c;

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 190
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 194
    :try_start_3
    invoke-static {}, Ljava/lang/System;->gc()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 190
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0
.end method
