.class public Lcom/roidapp/cloudlib/sns/b/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# instance fields
.field public a:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "token"
    .end annotation
.end field

.field public b:Lcom/roidapp/cloudlib/sns/b/x;
    .annotation runtime Lcom/google/a/a/b;
        a = "info"
    .end annotation
.end field

.field public c:J
    .annotation runtime Lcom/google/a/a/b;
        a = "ttl"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 4

    .prologue
    .line 77
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    const-string v1, "token"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    .line 80
    const-string v1, "ttl"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/p;->c:J

    .line 81
    const-string v1, "info"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 82
    const/4 v1, 0x0

    invoke-static {v0, v1, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 84
    :cond_0
    return-void
.end method
