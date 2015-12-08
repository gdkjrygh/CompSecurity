.class final Lcom/cmcm/adsdk/nativead/ad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/aa;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 274
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 277
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->i(Lcom/cmcm/adsdk/nativead/aa;)Ljava/util/Map;

    move-result-object v1

    monitor-enter v1

    .line 278
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->i(Lcom/cmcm/adsdk/nativead/aa;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 280
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->j(Lcom/cmcm/adsdk/nativead/aa;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0xfa0

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 281
    const-string v0, "CMCMADSDK"

    const-string v2, "now load no callback , to issue next "

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 282
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->k(Lcom/cmcm/adsdk/nativead/aa;)V

    .line 287
    :goto_0
    monitor-exit v1

    return-void

    .line 284
    :cond_0
    const-string v0, "CMCMADSDK"

    const-string v2, "has callback,remove no callback task"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/ad;->a:Lcom/cmcm/adsdk/nativead/aa;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/aa;->j(Lcom/cmcm/adsdk/nativead/aa;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 287
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
