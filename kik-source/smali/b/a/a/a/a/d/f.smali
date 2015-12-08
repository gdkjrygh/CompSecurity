.class public abstract Lb/a/a/a/a/d/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/d/m;


# instance fields
.field protected final a:Landroid/content/Context;

.field protected final b:Ljava/util/concurrent/ScheduledExecutorService;

.field protected c:Lb/a/a/a/a/d/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lb/a/a/a/a/d/n;Lb/a/a/a/a/d/d;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/d/f;->a:Landroid/content/Context;

    .line 39
    iput-object p4, p0, Lb/a/a/a/a/d/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 40
    iput-object p2, p0, Lb/a/a/a/a/d/f;->c:Lb/a/a/a/a/d/n;

    .line 42
    invoke-virtual {p3, p0}, Lb/a/a/a/a/d/d;->a(Lb/a/a/a/a/d/m;)V

    .line 43
    return-void
.end method


# virtual methods
.method protected abstract a()Lb/a/a/a/a/d/n;
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 64
    new-instance v0, Lb/a/a/a/a/d/h;

    invoke-direct {v0, p0, p1}, Lb/a/a/a/a/d/h;-><init>(Lb/a/a/a/a/d/f;Ljava/lang/Object;)V

    :try_start_0
    iget-object v1, p0, Lb/a/a/a/a/d/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :goto_0
    return-void

    .line 64
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/f;->a:Landroid/content/Context;

    const-string v1, "Failed to run events task"

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;Z)V
    .locals 1

    .prologue
    .line 46
    new-instance v0, Lb/a/a/a/a/d/g;

    invoke-direct {v0, p0, p1, p2}, Lb/a/a/a/a/d/g;-><init>(Lb/a/a/a/a/d/f;Ljava/lang/Object;Z)V

    invoke-virtual {p0, v0}, Lb/a/a/a/a/d/f;->a(Ljava/lang/Runnable;)V

    .line 61
    return-void
.end method

.method protected final a(Ljava/lang/Runnable;)V
    .locals 2

    .prologue
    .line 118
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/a/d/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_0
    return-void

    .line 120
    :catch_0
    move-exception v0

    iget-object v0, p0, Lb/a/a/a/a/d/f;->a:Landroid/content/Context;

    const-string v1, "Failed to submit events task"

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 79
    new-instance v0, Lb/a/a/a/a/d/i;

    invoke-direct {v0, p0}, Lb/a/a/a/a/d/i;-><init>(Lb/a/a/a/a/d/f;)V

    invoke-virtual {p0, v0}, Lb/a/a/a/a/d/f;->a(Ljava/lang/Runnable;)V

    .line 89
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 92
    new-instance v0, Lb/a/a/a/a/d/j;

    invoke-direct {v0, p0}, Lb/a/a/a/a/d/j;-><init>(Lb/a/a/a/a/d/f;)V

    invoke-virtual {p0, v0}, Lb/a/a/a/a/d/f;->a(Ljava/lang/Runnable;)V

    .line 104
    return-void
.end method
