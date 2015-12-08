.class final Lcom/kik/cards/web/plugin/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/plugin/a;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/plugin/h;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/plugin/h;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 233
    iput-object p1, p0, Lcom/kik/cards/web/plugin/i;->c:Lcom/kik/cards/web/plugin/h;

    iput-object p2, p0, Lcom/kik/cards/web/plugin/i;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/kik/cards/web/plugin/i;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kik/cards/web/plugin/j;)V
    .locals 5

    .prologue
    .line 237
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 240
    :try_start_0
    const-string v0, "status"

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/j;->a()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 241
    const-string v0, "data"

    invoke-virtual {p1}, Lcom/kik/cards/web/plugin/j;->b()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/plugin/i;->c:Lcom/kik/cards/web/plugin/h;

    invoke-static {v0}, Lcom/kik/cards/web/plugin/h;->b(Lcom/kik/cards/web/plugin/h;)Lcom/kik/cards/web/plugin/b;

    move-result-object v0

    iget-object v2, p0, Lcom/kik/cards/web/plugin/i;->b:Ljava/lang/String;

    invoke-interface {v0, v2, v1}, Lcom/kik/cards/web/plugin/b;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 248
    return-void

    .line 243
    :catch_0
    move-exception v0

    .line 244
    invoke-static {}, Lcom/kik/cards/web/plugin/h;->e()Lorg/c/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error creating response for async method: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/kik/cards/web/plugin/i;->a:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
