.class public Lcom/facebook/ads/internal/server/b;
.super Ljava/lang/Object;


# static fields
.field private static a:Lcom/facebook/ads/internal/server/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/ads/internal/server/b;

    invoke-direct {v0}, Lcom/facebook/ads/internal/server/b;-><init>()V

    sput-object v0, Lcom/facebook/ads/internal/server/b;->a:Lcom/facebook/ads/internal/server/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized a()Lcom/facebook/ads/internal/server/b;
    .locals 2

    const-class v0, Lcom/facebook/ads/internal/server/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/facebook/ads/internal/server/b;->a:Lcom/facebook/ads/internal/server/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private a(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/server/d;
    .locals 8

    const/4 v1, 0x0

    new-instance v2, Lcom/facebook/ads/internal/server/d;

    invoke-direct {v2}, Lcom/facebook/ads/internal/server/d;-><init>()V

    const-string v0, "code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    const-string v0, "placements"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    const-string v0, "meta"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :goto_0
    iget-object v4, v2, Lcom/facebook/ads/internal/server/d;->a:Lcom/facebook/ads/internal/dto/b;

    invoke-virtual {v4, v0}, Lcom/facebook/ads/internal/dto/b;->a(Ljava/lang/String;)V

    const-string v0, "definition"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/dto/c;->a(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/dto/c;

    move-result-object v0

    iget-object v4, v2, Lcom/facebook/ads/internal/server/d;->a:Lcom/facebook/ads/internal/dto/b;

    invoke-virtual {v4, v0}, Lcom/facebook/ads/internal/dto/b;->a(Lcom/facebook/ads/internal/dto/c;)V

    invoke-virtual {v0}, Lcom/facebook/ads/internal/dto/c;->a()Lcom/facebook/ads/internal/server/AdPlacementType;

    move-result-object v4

    const-string v0, "ads"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "ads"

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    move v0, v1

    :goto_1
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_2

    new-instance v1, Lcom/facebook/ads/internal/dto/a;

    invoke-direct {v1, v4}, Lcom/facebook/ads/internal/dto/a;-><init>(Lcom/facebook/ads/internal/server/AdPlacementType;)V

    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "adapter"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/facebook/ads/internal/dto/a;->a(Ljava/lang/String;)V

    const-string v6, "data"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "trackers"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v7, "trackers"

    invoke-virtual {v6, v7, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-virtual {v1, v6}, Lcom/facebook/ads/internal/dto/a;->a(Lorg/json/JSONObject;)V

    iget-object v5, v2, Lcom/facebook/ads/internal/server/d;->a:Lcom/facebook/ads/internal/dto/b;

    invoke-virtual {v5, v1}, Lcom/facebook/ads/internal/dto/b;->a(Lcom/facebook/ads/internal/dto/a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    const-string v4, "plid"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private b(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/server/e;
    .locals 2

    const-string v0, "message"

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "code"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    new-instance v1, Lcom/facebook/ads/internal/server/e;

    invoke-direct {v1, v0}, Lcom/facebook/ads/internal/server/e;-><init>(Ljava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/ads/internal/server/c;
    .locals 4

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "type"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v0, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v0, :pswitch_data_0

    const-string v0, "error"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/b;->b(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/server/e;

    move-result-object v0

    :goto_1
    return-object v0

    :sswitch_0
    const-string v3, "ads"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :sswitch_1
    const-string v3, "error"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :pswitch_0
    invoke-direct {p0, v1}, Lcom/facebook/ads/internal/server/b;->a(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/server/d;

    move-result-object v0

    goto :goto_1

    :pswitch_1
    invoke-direct {p0, v1}, Lcom/facebook/ads/internal/server/b;->b(Lorg/json/JSONObject;)Lcom/facebook/ads/internal/server/e;

    move-result-object v0

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/facebook/ads/internal/server/c;

    sget-object v1, Lcom/facebook/ads/internal/server/c$a;->a:Lcom/facebook/ads/internal/server/c$a;

    invoke-direct {v0, v1}, Lcom/facebook/ads/internal/server/c;-><init>(Lcom/facebook/ads/internal/server/c$a;)V

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0x178b0 -> :sswitch_0
        0x5c4d208 -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
