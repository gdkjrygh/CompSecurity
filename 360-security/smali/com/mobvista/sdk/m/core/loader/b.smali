.class public final Lcom/mobvista/sdk/m/core/loader/b;
.super Lcom/mobvista/sdk/m/a/a/c/a;
.source "360Security"


# instance fields
.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/mobvista/sdk/m/a/a/c/a;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/loader/b;->c:Landroid/content/Context;

    .line 31
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 80
    const-string/jumbo v0, "AdWallIconLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "RESPONSE: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mobvista/sdk/m/a/b/a/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 85
    const-string/jumbo v1, "status"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    .line 86
    const-string/jumbo v2, "msg"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 88
    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    .line 90
    const-string/jumbo v1, "data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 92
    const-string/jumbo v1, "image"

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 106
    :goto_0
    return-object v0

    .line 100
    :cond_0
    const-string/jumbo v0, "AdWallIconLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "APILoader error: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 106
    :cond_1
    :goto_1
    const-string/jumbo v0, ""

    goto :goto_0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1
.end method

.method private a([B)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 115
    if-eqz p1, :cond_0

    array-length v1, p1

    if-lez v1, :cond_0

    .line 116
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1}, Ljava/lang/String;-><init>([B)V

    .line 117
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 122
    :cond_0
    :goto_0
    return-object v0

    .line 120
    :cond_1
    invoke-static {v1}, Lcom/mobvista/sdk/m/core/loader/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b()Ljava/lang/String;
    .locals 2

    .prologue
    .line 134
    new-instance v0, Lcom/mobvista/sdk/m/a/f/e;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/a/f/e;-><init>()V

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/e;->a(Ljava/lang/String;)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/e;->d(I)Lcom/mobvista/sdk/m/a/f/e;

    move-result-object v0

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/loader/b;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/a/f/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/util/Map;[B)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/core/loader/b;->a([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected final a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "http://net.rayjump.com/image?"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/loader/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 49
    return-object v0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/loader/b;->c:Landroid/content/Context;

    .line 35
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/loader/b;->d:Ljava/lang/String;

    .line 36
    return-void
.end method
