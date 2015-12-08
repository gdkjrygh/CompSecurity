.class public Lcom/flurry/sdk/ip;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/kx;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/flurry/sdk/kx",
        "<",
        "Lcom/flurry/sdk/hp;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 21
    const-class v0, Lcom/flurry/sdk/ip;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/ip;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 145
    if-nez p1, :cond_0

    .line 146
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Null Json object"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 149
    :cond_0
    if-eqz p3, :cond_1

    .line 150
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    :goto_0
    return-void

    .line 152
    :cond_1
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;)Lcom/flurry/sdk/hp;
    .locals 2

    .prologue
    .line 158
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Deserialize not supported for request"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Ljava/io/OutputStream;Lcom/flurry/sdk/hp;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 50
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 54
    :cond_1
    new-instance v2, Lcom/flurry/sdk/ip$1;

    invoke-direct {v2, p0, p1}, Lcom/flurry/sdk/ip$1;-><init>(Lcom/flurry/sdk/ip;Ljava/io/OutputStream;)V

    .line 61
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 63
    :try_start_0
    const-string v0, "project_key"

    iget-object v4, p2, Lcom/flurry/sdk/hp;->a:Ljava/lang/String;

    invoke-direct {p0, v3, v0, v4}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string v0, "bundle_id"

    iget-object v4, p2, Lcom/flurry/sdk/hp;->b:Ljava/lang/String;

    invoke-direct {p0, v3, v0, v4}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string v0, "app_version"

    iget-object v4, p2, Lcom/flurry/sdk/hp;->c:Ljava/lang/String;

    invoke-direct {p0, v3, v0, v4}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    const-string v0, "sdk_version"

    iget v4, p2, Lcom/flurry/sdk/hp;->d:I

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 67
    const-string v0, "platform"

    iget v4, p2, Lcom/flurry/sdk/hp;->e:I

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 68
    const-string v0, "platform_version"

    iget-object v4, p2, Lcom/flurry/sdk/hp;->f:Ljava/lang/String;

    invoke-direct {p0, v3, v0, v4}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    const-string v0, "limit_ad_tracking"

    iget-boolean v4, p2, Lcom/flurry/sdk/hp;->g:Z

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 73
    iget-object v0, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    if-eqz v0, :cond_7

    .line 74
    iget-object v0, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v0, v0, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    if-eqz v0, :cond_7

    .line 75
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 76
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 78
    const-string v5, "model"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->a:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    const-string v5, "brand"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->b:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    const-string v5, "id"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->c:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    const-string v5, "device"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->d:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    const-string v5, "product"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->e:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    const-string v5, "version_release"

    iget-object v6, p2, Lcom/flurry/sdk/hp;->h:Lcom/flurry/sdk/hs;

    iget-object v6, v6, Lcom/flurry/sdk/hs;->a:Lcom/flurry/sdk/hm;

    iget-object v6, v6, Lcom/flurry/sdk/hm;->f:Ljava/lang/String;

    invoke-direct {p0, v4, v5, v6}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string v5, "com.flurry.proton.generated.avro.v2.AndroidTags"

    invoke-virtual {v0, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    :goto_1
    if-eqz v0, :cond_2

    .line 89
    const-string v4, "device_tags"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 95
    :goto_2
    new-instance v4, Lorg/json/JSONArray;

    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 97
    iget-object v0, p2, Lcom/flurry/sdk/hp;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/hr;

    .line 98
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 99
    const-string v7, "type"

    iget v8, v0, Lcom/flurry/sdk/hr;->a:I

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 100
    const-string v7, "id"

    iget-object v0, v0, Lcom/flurry/sdk/hr;->b:Ljava/lang/String;

    invoke-direct {p0, v6, v7, v0}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 137
    :catch_0
    move-exception v0

    .line 138
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Invalid Json"

    invoke-direct {v1, v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    throw v0

    .line 91
    :cond_2
    :try_start_2
    const-string v0, "device_tags"

    sget-object v4, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 105
    :cond_3
    const-string v0, "device_ids"

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    iget-object v0, p2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    if-eqz v0, :cond_6

    .line 109
    iget-object v0, p2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v0, v0, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    if-eqz v0, :cond_6

    .line 110
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 111
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 112
    const-string v4, "latitude"

    iget-object v5, p2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v5, v5, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    iget-wide v6, v5, Lcom/flurry/sdk/hv;->a:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    const-string v4, "longitude"

    iget-object v5, p2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v5, v5, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    iget-wide v6, v5, Lcom/flurry/sdk/hv;->b:D

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    const-string v4, "accuracy"

    iget-object v5, p2, Lcom/flurry/sdk/hp;->j:Lcom/flurry/sdk/hw;

    iget-object v5, v5, Lcom/flurry/sdk/hw;->a:Lcom/flurry/sdk/hv;

    iget v5, v5, Lcom/flurry/sdk/hv;->c:F

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    const-string v4, "com.flurry.proton.generated.avro.v2.Geolocation"

    invoke-virtual {v0, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    :goto_4
    if-eqz v0, :cond_4

    .line 119
    const-string v1, "geo"

    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    :goto_5
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 125
    iget-object v1, p2, Lcom/flurry/sdk/hp;->k:Lcom/flurry/sdk/hz;

    if-eqz v1, :cond_5

    .line 126
    const-string v1, "string"

    iget-object v4, p2, Lcom/flurry/sdk/hp;->k:Lcom/flurry/sdk/hz;

    iget-object v4, v4, Lcom/flurry/sdk/hz;->a:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v4}, Lcom/flurry/sdk/ip;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 127
    const-string v1, "publisher_user_id"

    invoke-virtual {v3, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    :goto_6
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/ip;->a:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Proton Request String: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v1, v4}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 135
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 136
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->flush()V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V

    goto/16 :goto_0

    .line 121
    :cond_4
    :try_start_3
    const-string v0, "geo"

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_5

    .line 130
    :cond_5
    const-string v0, "publisher_user_id"

    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :cond_6
    move-object v0, v1

    goto :goto_4

    :cond_7
    move-object v0, v1

    goto/16 :goto_1
.end method

.method public bridge synthetic a(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 20
    check-cast p2, Lcom/flurry/sdk/hp;

    invoke-virtual {p0, p1, p2}, Lcom/flurry/sdk/ip;->a(Ljava/io/OutputStream;Lcom/flurry/sdk/hp;)V

    return-void
.end method

.method public synthetic b(Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/ip;->a(Ljava/io/InputStream;)Lcom/flurry/sdk/hp;

    move-result-object v0

    return-object v0
.end method
