.class public final Lcom/cmcm/adsdk/b/d/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/adsdk/b/d/d;


# static fields
.field private static b:Lcom/cmcm/adsdk/b/d/a;


# instance fields
.field public a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/cmcm/adsdk/b/d/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    .line 18
    return-void
.end method

.method public static declared-synchronized a()Lcom/cmcm/adsdk/b/d/a;
    .locals 2

    .prologue
    .line 21
    const-class v1, Lcom/cmcm/adsdk/b/d/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/cmcm/adsdk/b/d/a;->b:Lcom/cmcm/adsdk/b/d/a;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lcom/cmcm/adsdk/b/d/a;

    invoke-direct {v0}, Lcom/cmcm/adsdk/b/d/a;-><init>()V

    sput-object v0, Lcom/cmcm/adsdk/b/d/a;->b:Lcom/cmcm/adsdk/b/d/a;

    .line 24
    :cond_0
    sget-object v0, Lcom/cmcm/adsdk/b/d/a;->b:Lcom/cmcm/adsdk/b/d/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 21
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 51
    iget-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 73
    :goto_0
    return-void

    .line 54
    :cond_0
    iget-object v1, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    monitor-enter v1

    .line 58
    :try_start_0
    invoke-static {p1}, Lcom/cmcm/adsdk/b/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 59
    iget-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/d/b;

    .line 60
    if-eqz v0, :cond_1

    .line 61
    invoke-interface {v0, p1}, Lcom/cmcm/adsdk/b/d/b;->c(Ljava/lang/String;)V

    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 66
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/d/b;

    .line 67
    if-eqz v0, :cond_3

    .line 68
    invoke-interface {v0, p1}, Lcom/cmcm/adsdk/b/d/b;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 73
    :cond_4
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/cmcm/adsdk/b/d/b;)V
    .locals 2

    .prologue
    .line 28
    iget-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    if-nez v0, :cond_0

    .line 35
    :goto_0
    return-void

    .line 31
    :cond_0
    iget-object v1, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/b/d/a;->a:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    new-instance v0, Lcom/cmcm/adsdk/b/d/c;

    invoke-direct {v0, p1, p2, p0}, Lcom/cmcm/adsdk/b/d/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/cmcm/adsdk/b/d/d;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/d/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
