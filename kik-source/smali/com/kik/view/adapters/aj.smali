.class public final Lcom/kik/view/adapters/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/af;


# instance fields
.field private final a:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kik/view/adapters/aj;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 32
    iget-object v1, p0, Lcom/kik/view/adapters/aj;->a:Ljava/util/List;

    monitor-enter v1

    .line 33
    :try_start_0
    iget-object v0, p0, Lcom/kik/view/adapters/aj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/ag;

    .line 34
    invoke-interface {v0}, Lcom/kik/view/adapters/ag;->g_()V

    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method public final a(Lcom/kik/view/adapters/ag;)V
    .locals 2

    .prologue
    .line 16
    iget-object v1, p0, Lcom/kik/view/adapters/aj;->a:Ljava/util/List;

    monitor-enter v1

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/kik/view/adapters/aj;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
