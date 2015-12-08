.class final Lcom/cmcm/adsdk/nativead/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/e;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/e;)V
    .locals 0

    .prologue
    .line 22
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 24
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/e;->c:Lcom/cmcm/adsdk/nativead/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    iget-boolean v0, v0, Lcom/cmcm/adsdk/nativead/e;->b:Z

    if-eqz v0, :cond_0

    .line 25
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/e;->c:Lcom/cmcm/adsdk/nativead/g;

    invoke-interface {v0}, Lcom/cmcm/adsdk/nativead/g;->a()V

    .line 26
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    iget-object v0, v0, Lcom/cmcm/adsdk/nativead/e;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/f;->a:Lcom/cmcm/adsdk/nativead/e;

    invoke-static {v1}, Lcom/cmcm/adsdk/nativead/e;->a(Lcom/cmcm/adsdk/nativead/e;)J

    move-result-wide v2

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 30
    :cond_0
    return-void
.end method
