.class final Lcom/kik/cards/web/auth/j;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/auth/i;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/i;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 7

    .prologue
    const/16 v6, 0x1f4

    .line 186
    check-cast p1, Lcom/kik/m/o;

    iget-object v0, p1, Lcom/kik/m/o;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/kik/m/o;->b:Ljava/lang/Object;

    check-cast v1, [B

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v0, v0, Lcom/kik/cards/web/auth/i;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v6}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    :goto_0
    return-void

    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "kikAnonId"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v3, v3, Lcom/kik/cards/web/auth/i;->a:Ljava/lang/String;

    invoke-static {v3}, Lcom/kik/cards/web/bf;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "kikCrdDm"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v4, v4, Lcom/kik/cards/web/auth/i;->a:Ljava/lang/String;

    invoke-static {v4}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v4, v4, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v4}, Lcom/kik/cards/web/auth/AuthPlugin;->b(Lcom/kik/cards/web/auth/AuthPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;

    move-result-object v4

    invoke-interface {v4}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "kikDbg"

    const/4 v5, 0x1

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :try_start_0
    iget-object v4, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v4, v4, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v4}, Lcom/kik/cards/web/auth/AuthPlugin;->c(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/a/e/d;

    move-result-object v4

    iget-object v5, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v5, v5, Lcom/kik/cards/web/auth/i;->c:Ljava/lang/String;

    invoke-interface {v4, v2, v5, v1}, Lkik/a/e/d;->a(Ljava/util/Map;Ljava/lang/String;[B)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string v4, "signedRequest"

    invoke-virtual {v2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "anonymousId"

    invoke-virtual {v2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "host"

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v0, v0, Lcom/kik/cards/web/auth/i;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    iget-object v0, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v0, v0, Lcom/kik/cards/web/auth/i;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v6}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto :goto_0

    :catch_1
    move-exception v0

    iget-object v1, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v1, v1, Lcom/kik/cards/web/auth/i;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/auth/AuthPlugin;->d(Lcom/kik/cards/web/auth/AuthPlugin;)Lorg/c/b;

    move-result-object v1

    const-string v2, "Failed to sign (anonymous)"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "GenerateSignedRequestException"

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kik/cards/web/auth/j;->a:Lcom/kik/cards/web/auth/i;

    iget-object v0, v0, Lcom/kik/cards/web/auth/i;->b:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v6}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto/16 :goto_0
.end method
