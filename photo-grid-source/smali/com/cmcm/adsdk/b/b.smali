.class final Lcom/cmcm/adsdk/b/b;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cmcm/adsdk/b/a;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/b/a;)V
    .locals 0

    .prologue
    .line 214
    iput-object p1, p0, Lcom/cmcm/adsdk/b/b;->a:Lcom/cmcm/adsdk/b/a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 214
    .line 2217
    iget-object v0, p0, Lcom/cmcm/adsdk/b/b;->a:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/b/a;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 214
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 214
    check-cast p1, Ljava/lang/Boolean;

    .line 1222
    iget-object v0, p0, Lcom/cmcm/adsdk/b/b;->a:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1223
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1224
    const-string v0, "RequestConfig"

    const-string v1, "read config from cache..."

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1225
    iget-object v0, p0, Lcom/cmcm/adsdk/b/b;->a:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/cmcm/adsdk/b/d;->b()V

    .line 1226
    :cond_0
    :goto_0
    return-void

    .line 1228
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/b/b;->a:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/cmcm/adsdk/b/d;->a()V

    goto :goto_0
.end method
