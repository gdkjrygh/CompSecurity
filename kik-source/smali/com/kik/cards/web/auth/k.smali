.class final Lcom/kik/cards/web/auth/k;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/kik/cards/web/auth/AuthPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/auth/AuthPlugin;Lcom/kik/cards/web/plugin/a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 275
    iput-object p1, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/auth/k;->a:Lcom/kik/cards/web/plugin/a;

    iput-object p3, p0, Lcom/kik/cards/web/auth/k;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/kik/cards/web/auth/k;->c:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/16 v4, 0x1f4

    .line 275
    check-cast p1, Lcom/kik/cards/util/UserDataParcelable;

    iget-object v0, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v0}, Lcom/kik/cards/web/auth/AuthPlugin;->c(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/a/e/d;

    move-result-object v0

    invoke-interface {v0}, Lkik/a/e/d;->c()Ljava/security/interfaces/RSAPrivateKey;

    move-result-object v0

    iget-object v1, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/auth/AuthPlugin;->c(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/a/e/d;

    move-result-object v1

    invoke-interface {v1}, Lkik/a/e/d;->b()Ljava/net/URL;

    move-result-object v1

    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/auth/k;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "kikUsr"

    iget-object v2, p1, Lcom/kik/cards/util/UserDataParcelable;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/kik/cards/web/auth/k;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/kik/cards/web/bf;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "kikCrdDm"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/kik/cards/web/auth/k;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/kik/cards/web/bf;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v2}, Lcom/kik/cards/web/auth/AuthPlugin;->b(Lcom/kik/cards/web/auth/AuthPlugin;)Lcom/kik/cards/web/browser/BrowserPlugin$a;

    move-result-object v2

    invoke-interface {v2}, Lcom/kik/cards/web/browser/BrowserPlugin$a;->h()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "kikDbg"

    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :try_start_0
    iget-object v2, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v2}, Lcom/kik/cards/web/auth/AuthPlugin;->c(Lcom/kik/cards/web/auth/AuthPlugin;)Lkik/a/e/d;

    move-result-object v2

    iget-object v3, p0, Lcom/kik/cards/web/auth/k;->c:Ljava/lang/String;

    invoke-interface {v2, v0, v3}, Lkik/a/e/d;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string v3, "signedRequest"

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "username"

    iget-object v3, p1, Lcom/kik/cards/util/UserDataParcelable;->a:Ljava/lang/String;

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "host"

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    iget-object v0, p0, Lcom/kik/cards/web/auth/k;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/kik/cards/web/auth/k;->d:Lcom/kik/cards/web/auth/AuthPlugin;

    invoke-static {v1}, Lcom/kik/cards/web/auth/AuthPlugin;->e(Lcom/kik/cards/web/auth/AuthPlugin;)Lorg/c/b;

    move-result-object v1

    const-string v2, "Failed to sign"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v1, "GenerateSignedRequestException"

    invoke-virtual {v0}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/a/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/kik/cards/web/auth/k;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v1, v4}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 329
    iget-object v0, p0, Lcom/kik/cards/web/auth/k;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x1f4

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 330
    return-void
.end method
