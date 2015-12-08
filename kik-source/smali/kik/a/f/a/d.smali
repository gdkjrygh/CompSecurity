.class final Lkik/a/f/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/a/f/a/g;

.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Lkik/a/f/a/c;


# direct methods
.method constructor <init>(Lkik/a/f/a/c;Lkik/a/f/a/g;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lkik/a/f/a/d;->c:Lkik/a/f/a/c;

    iput-object p2, p0, Lkik/a/f/a/d;->a:Lkik/a/f/a/g;

    iput-object p3, p0, Lkik/a/f/a/d;->b:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 63
    iget-object v0, p0, Lkik/a/f/a/d;->a:Lkik/a/f/a/g;

    iget-boolean v0, v0, Lkik/a/f/a/g;->d:Z

    if-eqz v0, :cond_0

    .line 80
    :goto_0
    return-void

    .line 67
    :cond_0
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 68
    iget-object v2, p0, Lkik/a/f/a/d;->a:Lkik/a/f/a/g;

    invoke-virtual {v2}, Lkik/a/f/a/g;->a()V

    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    iget-object v0, p0, Lkik/a/f/a/d;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Lkik/a/f/a/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lkik/a/f/a/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :goto_1
    iget-object v0, p0, Lkik/a/f/a/d;->c:Lkik/a/f/a/c;

    iget-object v1, v0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    monitor-enter v1

    .line 79
    :try_start_1
    iget-object v0, p0, Lkik/a/f/a/d;->c:Lkik/a/f/a/c;

    iget-object v0, v0, Lkik/a/f/a/c;->b:Ljava/util/Map;

    iget-object v2, p0, Lkik/a/f/a/d;->a:Lkik/a/f/a/g;

    invoke-virtual {v2}, Lkik/a/f/a/g;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_1

    .line 73
    :catch_1
    move-exception v0

    goto :goto_1
.end method
