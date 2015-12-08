.class final Lcom/cm/kinfoc/r;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 188
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/cm/kinfoc/r;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0}, Lcom/cm/kinfoc/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 192
    sget-object v1, Lcom/cm/kinfoc/r;->a:Ljava/lang/Object;

    monitor-enter v1

    .line 193
    :try_start_0
    invoke-static {}, Lcom/cm/kinfoc/q;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 194
    monitor-exit v1

    .line 214
    :goto_0
    return-void

    .line 198
    :cond_0
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->e()Z

    move-result v0

    invoke-static {v0}, Lcom/cm/kinfoc/q;->a(Z)Z

    .line 201
    invoke-static {}, Lcom/cm/kinfoc/a/e;->a()Lcom/cm/kinfoc/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cm/kinfoc/a/e;->b()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/ag;->a(Landroid/content/Context;)Z

    move-result v0

    .line 202
    if-nez v0, :cond_1

    .line 203
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/cm/kinfoc/q;->b(Z)V

    .line 204
    monitor-exit v1

    goto :goto_0

    .line 214
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 208
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/cm/kinfoc/ag;->a()Z

    move-result v0

    .line 209
    if-eqz v0, :cond_2

    .line 210
    const/4 v0, 0x1

    invoke-static {v0}, Lcom/cm/kinfoc/q;->b(Z)V

    .line 214
    :goto_1
    monitor-exit v1

    goto :goto_0

    .line 212
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/cm/kinfoc/q;->b(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1
.end method
