.class final Lcom/cmcm/adsdk/b/c;
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
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/cmcm/adsdk/b/a;


# direct methods
.method constructor <init>(Lcom/cmcm/adsdk/b/a;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 299
    iput-object p1, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    iput-object p2, p0, Lcom/cmcm/adsdk/b/c;->a:Ljava/util/List;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 299
    .line 2302
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/b/a;->a()Ljava/util/List;

    move-result-object v0

    .line 2303
    const-string v1, "RequestConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "old posbean list:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2304
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 2305
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 2306
    iget v0, v0, Lcom/cmcm/adsdk/b/a/c;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 2309
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/b/a;->b(Ljava/util/List;)Z

    move-result v0

    .line 2310
    const-string v1, "RequestConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "delete mPositionId data status:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2312
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->a(Lcom/cmcm/adsdk/b/a;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/cmcm/adsdk/b/b/a;->a(Landroid/content/Context;)Lcom/cmcm/adsdk/b/b/a;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/b/c;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/b/b/a;->a(Ljava/util/List;)Z

    move-result v0

    .line 2313
    const-string v1, "RequestConfig"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "save satus:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2314
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 299
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 299
    check-cast p1, Ljava/lang/Boolean;

    .line 1319
    const-string v0, "RequestConfig"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onPostExecute isSuccess:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1320
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1321
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1322
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/cmcm/adsdk/b/d;->b()V

    .line 1325
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->c(Lcom/cmcm/adsdk/b/a;)V

    .line 1326
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/a;->notifyObservers()V

    :cond_1
    :goto_0
    return-void

    .line 1328
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1329
    iget-object v0, p0, Lcom/cmcm/adsdk/b/c;->b:Lcom/cmcm/adsdk/b/a;

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->b(Lcom/cmcm/adsdk/b/a;)Lcom/cmcm/adsdk/b/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/cmcm/adsdk/b/d;->a()V

    goto :goto_0
.end method
