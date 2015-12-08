.class public Lcom/cleanmaster/ui/app/market/data/filter/f;
.super Lcom/cleanmaster/ui/app/market/data/filter/b;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/data/filter/b;-><init>()V

    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/f;
    .locals 2

    .prologue
    .line 15
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/filter/f;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/filter/f;-><init>()V

    .line 17
    :try_start_0
    const-string v1, "free_space_condition"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Lcom/cleanmaster/ui/app/market/data/filter/f;->a(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/b;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    :goto_0
    return-object v0

    .line 20
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 21
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/filter/a;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/data/filter/f;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/filter/a;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/cleanmaster/ui/app/market/data/filter/f;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 11
    :goto_0
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    goto :goto_0
.end method
