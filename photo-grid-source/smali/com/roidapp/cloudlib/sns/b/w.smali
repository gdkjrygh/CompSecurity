.class public Lcom/roidapp/cloudlib/sns/b/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# instance fields
.field public a:Lcom/roidapp/cloudlib/sns/b/d;

.field public b:Lcom/roidapp/cloudlib/sns/b/a/e;

.field public c:Lcom/roidapp/cloudlib/sns/b/a/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 23
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    const-string v1, "tagTop"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 26
    invoke-static {v1, v2, p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->a(Lorg/json/JSONArray;Lcom/roidapp/cloudlib/sns/b/a/e;Z)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/b/w;->b:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 28
    const-string v1, "data"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 29
    invoke-static {v1, v2, p2}, Lcom/roidapp/cloudlib/sns/b/a/e;->a(Lorg/json/JSONArray;Lcom/roidapp/cloudlib/sns/b/a/e;Z)Lcom/roidapp/cloudlib/sns/b/a/e;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/b/w;->c:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 31
    const-string v1, "landingpage"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/d;->a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/sns/b/d;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/w;->a:Lcom/roidapp/cloudlib/sns/b/d;

    .line 34
    :cond_0
    return-void
.end method
