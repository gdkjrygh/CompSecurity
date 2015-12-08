.class final Lcom/cmcm/adsdk/nativead/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/adsdk/nativead/g;


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/nativead/n;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/o;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 209
    const-string v0, "CMPicksNativeAd"

    const-string v1, "picks trySendImpression"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/o;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->d(Lcom/cmcm/adsdk/nativead/n;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/o;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/n;->l()V

    .line 213
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/o;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->c(Lcom/cmcm/adsdk/nativead/n;)V

    .line 214
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/o;->a:Lcom/cmcm/adsdk/nativead/n;

    invoke-static {v0}, Lcom/cmcm/adsdk/nativead/n;->b(Lcom/cmcm/adsdk/nativead/n;)V

    .line 216
    :cond_0
    return-void
.end method
