.class public final Lcom/cmcm/adsdk/b/a/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/cmcm/adsdk/b/a/a;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Lcom/cmcm/adsdk/b/a/a;

    invoke-direct {v0}, Lcom/cmcm/adsdk/b/a/a;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/b/a/e;->a:Lcom/cmcm/adsdk/b/a/a;

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/b/a/e;->b:Ljava/util/List;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a/e;
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 45
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 76
    :goto_0
    return-object v0

    .line 50
    :cond_0
    :try_start_0
    new-instance v2, Lcom/cmcm/adsdk/b/a/e;

    invoke-direct {v2}, Lcom/cmcm/adsdk/b/a/e;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    const-string v1, "poslist"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    .line 55
    if-eqz v6, :cond_2

    move v5, v4

    .line 56
    :goto_1
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 57
    invoke-virtual {v6, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 58
    const-string v0, "info"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    .line 59
    if-eqz v8, :cond_1

    move v3, v4

    .line 60
    :goto_2
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 61
    new-instance v0, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {v0}, Lcom/cmcm/adsdk/b/a/c;-><init>()V

    invoke-virtual {v0, v7}, Lcom/cmcm/adsdk/b/a/c;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 62
    invoke-virtual {v8, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 63
    new-instance v9, Lcom/cmcm/adsdk/b/a/b;

    invoke-direct {v9}, Lcom/cmcm/adsdk/b/a/b;-><init>()V

    invoke-virtual {v9, v1}, Lcom/cmcm/adsdk/b/a/b;->a(Lorg/json/JSONObject;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/cmcm/adsdk/b/a/b;

    .line 64
    iget-object v9, v1, Lcom/cmcm/adsdk/b/a/b;->a:Ljava/lang/String;

    iput-object v9, v0, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    .line 65
    iget-object v9, v1, Lcom/cmcm/adsdk/b/a/b;->b:Ljava/lang/String;

    iput-object v9, v0, Lcom/cmcm/adsdk/b/a/c;->c:Ljava/lang/String;

    .line 66
    iget v1, v1, Lcom/cmcm/adsdk/b/a/b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/cmcm/adsdk/b/a/c;->e:Ljava/lang/Integer;

    .line 67
    iget-object v1, v2, Lcom/cmcm/adsdk/b/a/e;->b:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 60
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v0, v5, 0x1

    move v5, v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 75
    goto :goto_0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    :goto_3
    const-string v2, "ConfigResponse"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ConfigResponse fromJson error..."

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 73
    :catch_1
    move-exception v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_3
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 41
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a/e;->b:Ljava/util/List;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a/e;->a:Lcom/cmcm/adsdk/b/a/a;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, ":poslist{"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget-object v0, p0, Lcom/cmcm/adsdk/b/a/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 89
    invoke-virtual {v0}, Lcom/cmcm/adsdk/b/a/c;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    const-string v0, ","

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 92
    :cond_0
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
