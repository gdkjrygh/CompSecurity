.class public Lcom/cleanmaster/ui/app/market/data/filter/c;
.super Lcom/cleanmaster/ui/app/market/data/filter/b;
.source "SourceFile"


# instance fields
.field e:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 10
    invoke-direct {p0}, Lcom/cleanmaster/ui/app/market/data/filter/b;-><init>()V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cleanmaster/ui/app/market/data/filter/c;->e:Ljava/util/ArrayList;

    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/cleanmaster/ui/app/market/data/filter/c;
    .locals 5

    .prologue
    .line 20
    new-instance v0, Lcom/cleanmaster/ui/app/market/data/filter/c;

    invoke-direct {v0}, Lcom/cleanmaster/ui/app/market/data/filter/c;-><init>()V

    .line 23
    :try_start_0
    const-string v1, "app_installed_condition"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 24
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 25
    iget-object v3, v0, Lcom/cleanmaster/ui/app/market/data/filter/c;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 28
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 29
    const/4 v0, 0x0

    .line 31
    :cond_0
    return-object v0
.end method


# virtual methods
.method protected b(Lcom/cleanmaster/ui/app/market/data/filter/a;)Z
    .locals 2

    .prologue
    .line 15
    invoke-virtual {p1}, Lcom/cleanmaster/ui/app/market/data/filter/a;->e()Ljava/util/Set;

    move-result-object v0

    .line 16
    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/data/filter/c;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, v1}, Lcom/cleanmaster/ui/app/market/data/filter/c;->a(Ljava/util/Set;Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method
