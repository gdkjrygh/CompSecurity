.class final Lcom/kik/cards/web/config/f;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lcom/kik/cards/web/config/XDataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/config/XDataPlugin;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 334
    iput-object p1, p0, Lcom/kik/cards/web/config/f;->b:Lcom/kik/cards/web/config/XDataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/config/f;->a:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 334
    check-cast p1, Ljava/util/List;

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "primaryKeys"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/config/f;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v2, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v2, v1}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v0, v2}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
