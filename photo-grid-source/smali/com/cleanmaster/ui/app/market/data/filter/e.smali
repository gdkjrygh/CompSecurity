.class public Lcom/cleanmaster/ui/app/market/data/filter/e;
.super Lcom/cleanmaster/ui/app/market/data/filter/c;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 7
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/data/filter/c;-><init>()V

    return-void
.end method

.method public static c(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/e;
    .locals 5

    .prologue
    .line 15
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/filter/e;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/filter/e;-><init>()V

    .line 17
    :try_start_0
    const-string v1, "app_uninstalled_condition"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 18
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 19
    iget-object v3, v0, Lcom/cleanmaster/ui/app/market/data/filter/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 23
    const/4 v0, 0x0

    .line 25
    :cond_0
    return-object v0
.end method


# virtual methods
.method protected b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 1

    .prologue
    .line 11
    invoke-super {p0, p1}, Lcom/cleanmaster/ui/app/market/data/filter/c;->b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
