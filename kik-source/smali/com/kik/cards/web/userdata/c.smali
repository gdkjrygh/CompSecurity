.class final Lcom/kik/cards/web/userdata/c;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lcom/kik/cards/web/userdata/UserDataPlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/userdata/UserDataPlugin;Lcom/kik/cards/web/plugin/a;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/kik/cards/web/userdata/c;->b:Lcom/kik/cards/web/userdata/UserDataPlugin;

    iput-object p2, p0, Lcom/kik/cards/web/userdata/c;->a:Lcom/kik/cards/web/plugin/a;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/kik/cards/web/userdata/c;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v1, Lcom/kik/cards/web/plugin/j;

    const/16 v2, 0x1f4

    invoke-direct {v1, v2}, Lcom/kik/cards/web/plugin/j;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 210
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 168
    check-cast p1, Ljava/util/List;

    const/4 v2, 0x0

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/util/UserDataParcelable;

    invoke-static {v0}, Lcom/kik/cards/util/UserDataParcelable;->a(Lcom/kik/cards/util/UserDataParcelable;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v5, v0

    move-object v0, v1

    move-object v1, v5

    :goto_1
    invoke-static {}, Lcom/kik/cards/web/userdata/UserDataPlugin;->c()Lorg/c/b;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error firing back event: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    :goto_2
    iget-object v1, p0, Lcom/kik/cards/web/userdata/c;->a:Lcom/kik/cards/web/plugin/a;

    new-instance v2, Lcom/kik/cards/web/plugin/j;

    invoke-direct {v2, v0}, Lcom/kik/cards/web/plugin/j;-><init>(Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    return-void

    :cond_0
    :try_start_2
    const-string v0, "userDataList"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_1
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 178
    invoke-direct {p0}, Lcom/kik/cards/web/userdata/c;->d()V

    .line 179
    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 184
    invoke-direct {p0}, Lcom/kik/cards/web/userdata/c;->d()V

    .line 185
    return-void
.end method
