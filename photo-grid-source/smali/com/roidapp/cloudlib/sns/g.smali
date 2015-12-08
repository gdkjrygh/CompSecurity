.class public final Lcom/roidapp/cloudlib/sns/g;
.super Lcom/roidapp/cloudlib/sns/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/o",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private e:J


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/sns/w;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/cloudlib/sns/w",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 25
    const-string v0, "https://cmbackup.cmcm.com/v2/batch"

    sget-object v1, Lcom/roidapp/baselib/e/i;->b:Lcom/roidapp/baselib/e/i;

    new-instance v2, Lcom/roidapp/cloudlib/sns/x;

    invoke-direct {v2, p1}, Lcom/roidapp/cloudlib/sns/x;-><init>(Lcom/roidapp/cloudlib/sns/w;)V

    invoke-direct {p0, v0, v1, v2}, Lcom/roidapp/cloudlib/sns/o;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 26
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/g;->a(Z)Lcom/roidapp/cloudlib/sns/o;

    .line 27
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/g;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 28
    return-void
.end method

.method private u()Ljava/lang/String;
    .locals 6

    .prologue
    .line 60
    const/4 v0, 0x0

    .line 62
    :try_start_0
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "android_id"

    invoke-static {v1, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 66
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 68
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 69
    const-string v2, "uuid"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string v0, "cnl"

    const-string v2, "89d3a1d6d3aaf135e120cb3ff19ab3f3"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    const-string v0, "cv"

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 73
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "{\"user\":{},\"device\":%s,\"tstamp\":\"%s\",\"ops\":{\"/invite/getpubcode\":{}}}"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v4

    const/4 v1, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-static {v0, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "3fb9b607905d870e352c963c11f65a8a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/c/n;->b(Ljava/lang/String;)J

    move-result-wide v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    iput-wide v2, p0, Lcom/roidapp/cloudlib/sns/g;->e:J

    .line 77
    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 1085
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "/invite/getpubcode"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "invcode"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    return-object v0
.end method

.method protected final e()[Lcom/roidapp/baselib/c/x;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lcom/roidapp/baselib/c/x",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 42
    iget-wide v0, p0, Lcom/roidapp/cloudlib/sns/g;->e:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 43
    const/4 v0, 0x1

    new-array v0, v0, [Lcom/roidapp/baselib/c/x;

    const/4 v1, 0x0

    new-instance v2, Lcom/roidapp/baselib/c/x;

    const-string v3, "Vc"

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/g;->e:J

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/roidapp/baselib/c/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v0, v1

    .line 45
    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/o;->e()[Lcom/roidapp/baselib/c/x;

    move-result-object v0

    goto :goto_0
.end method

.method public final run()V
    .locals 1

    .prologue
    .line 33
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/g;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/g;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    :goto_0
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/o;->run()V

    .line 38
    return-void

    .line 35
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method
