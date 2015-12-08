.class final Lkik/a/g/al;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/g/v;


# direct methods
.method constructor <init>(Lkik/a/g/v;)V
    .locals 0

    .prologue
    .line 513
    iput-object p1, p0, Lkik/a/g/al;->a:Lkik/a/g/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 517
    iget-object v0, p0, Lkik/a/g/al;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->d(Lkik/a/g/v;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    .line 518
    :try_start_0
    iget-object v0, p0, Lkik/a/g/al;->a:Lkik/a/g/v;

    invoke-static {v0}, Lkik/a/g/v;->e(Lkik/a/g/v;)Ljava/util/concurrent/ScheduledFuture;

    .line 519
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 521
    iget-object v0, p0, Lkik/a/g/al;->a:Lkik/a/g/v;

    invoke-virtual {v0}, Lkik/a/g/v;->o()V

    .line 522
    return-void

    .line 519
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
