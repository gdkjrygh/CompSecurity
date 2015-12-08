.class final Lb/a/a/a/a/c/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/a/a/a/a/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field final a:Ljava/util/LinkedList;

.field b:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 246
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 247
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a/c/a$c;->a:Ljava/util/LinkedList;

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .prologue
    .line 246
    invoke-direct {p0}, Lb/a/a/a/a/c/a$c;-><init>()V

    return-void
.end method


# virtual methods
.method protected final declared-synchronized a()V
    .locals 2

    .prologue
    .line 266
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/c/a$c;->a:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    iput-object v0, p0, Lb/a/a/a/a/c/a$c;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 267
    sget-object v0, Lb/a/a/a/a/c/a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Lb/a/a/a/a/c/a$c;->b:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    :cond_0
    monitor-exit p0

    return-void

    .line 266
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized execute(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 251
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/c/a$c;->a:Ljava/util/LinkedList;

    new-instance v1, Lb/a/a/a/a/c/e;

    invoke-direct {v1, p0, p1}, Lb/a/a/a/a/c/e;-><init>(Lb/a/a/a/a/c/a$c;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->offer(Ljava/lang/Object;)Z

    .line 260
    iget-object v0, p0, Lb/a/a/a/a/c/a$c;->b:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 261
    invoke-virtual {p0}, Lb/a/a/a/a/c/a$c;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    :cond_0
    monitor-exit p0

    return-void

    .line 251
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
