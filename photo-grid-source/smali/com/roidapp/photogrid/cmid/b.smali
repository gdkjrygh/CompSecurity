.class public final Lcom/roidapp/photogrid/cmid/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cmid/a;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cmid/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 201
    iput-object p1, p0, Lcom/roidapp/photogrid/cmid/b;->a:Lcom/roidapp/photogrid/cmid/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 203
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 204
    const-string v1, "sid"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1224
    iput-object v1, p0, Lcom/roidapp/photogrid/cmid/b;->c:Ljava/lang/String;

    .line 205
    const-string v1, "sso_token"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 2216
    iput-object v0, p0, Lcom/roidapp/photogrid/cmid/b;->b:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 209
    :goto_0
    return-void

    .line 207
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/roidapp/photogrid/cmid/b;->c:Ljava/lang/String;

    return-object v0
.end method
