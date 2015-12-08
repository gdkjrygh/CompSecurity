.class final Lcom/roidapp/photogrid/video/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/b;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/a;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/a;)V
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private declared-synchronized a()V
    .locals 2

    .prologue
    .line 44
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/a;->b(Lcom/roidapp/photogrid/video/a;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/roidapp/baselib/e/b;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_0
    monitor-exit p0

    return-void

    .line 44
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final declared-synchronized a(I)V
    .locals 1

    .prologue
    .line 34
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 35
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/roidapp/baselib/e/b;->a(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 34
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 40
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/roidapp/photogrid/video/b;->a:Lcom/roidapp/photogrid/video/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/photogrid/video/a;)Lcom/roidapp/baselib/e/b;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/roidapp/baselib/e/b;->a(ILjava/lang/Exception;)V

    .line 53
    :cond_0
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/b;->a()V

    return-void
.end method
