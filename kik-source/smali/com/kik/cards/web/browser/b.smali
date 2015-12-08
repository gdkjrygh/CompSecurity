.class final Lcom/kik/cards/web/browser/b;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lcom/kik/cards/web/browser/WebHistoryPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/browser/WebHistoryPlugin;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/kik/cards/web/browser/b;->b:Lcom/kik/cards/web/browser/WebHistoryPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/browser/b;->a:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 8

    .prologue
    .line 37
    check-cast p1, Ljava/util/List;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/i/h$a;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "id"

    invoke-virtual {v0}, Lkik/a/i/h$a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "url"

    invoke-virtual {v0}, Lkik/a/i/h$a;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "title"

    invoke-virtual {v0}, Lkik/a/i/h$a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "iconUrl"

    invoke-virtual {v0}, Lkik/a/i/h$a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "timestamp"

    invoke-virtual {v0}, Lkik/a/i/h$a;->e()J

    move-result-wide v6

    invoke-virtual {v3, v4, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v0, p0, Lcom/kik/cards/web/browser/b;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x1f4

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    :goto_1
    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kik/cards/web/browser/b;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v2, Lcom/kik/cards/web/plugin/j;

    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "items"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v2}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 65
    iget-object v0, p0, Lcom/kik/cards/web/browser/b;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x1f4

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 66
    return-void
.end method
