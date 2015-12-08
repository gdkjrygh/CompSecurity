.class public Lcom/roidapp/cloudlib/sns/b/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# instance fields
.field public a:J

.field public b:J

.field public c:Ljava/lang/String;

.field public d:Lcom/roidapp/cloudlib/sns/b/x;

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/a;Z)Lcom/roidapp/cloudlib/sns/b/a;
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 51
    if-nez p0, :cond_1

    move-object p1, v0

    .line 67
    :cond_0
    :goto_0
    return-object p1

    .line 54
    :cond_1
    if-nez p1, :cond_2

    .line 55
    new-instance p1, Lcom/roidapp/cloudlib/sns/b/a;

    invoke-direct {p1}, Lcom/roidapp/cloudlib/sns/b/a;-><init>()V

    .line 58
    :cond_2
    const-string v1, "cid"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p1, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    .line 59
    const-string v1, "createTime"

    invoke-static {p0, v1}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p1, Lcom/roidapp/cloudlib/sns/b/a;->b:J

    .line 60
    const-string v1, "content"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/roidapp/cloudlib/sns/b/a;->c:Ljava/lang/String;

    .line 62
    const-string v1, "user"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 63
    if-eqz v1, :cond_0

    .line 64
    invoke-static {v1, v0, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/a;->d:Lcom/roidapp/cloudlib/sns/b/x;

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 1

    .prologue
    .line 44
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    invoke-static {v0, p0, p2}, Lcom/roidapp/cloudlib/sns/b/a;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/a;Z)Lcom/roidapp/cloudlib/sns/b/a;

    .line 48
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 72
    if-ne p0, p1, :cond_1

    .line 77
    :cond_0
    :goto_0
    return v0

    .line 73
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    .line 75
    :cond_3
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/a;

    .line 77
    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    iget-wide v4, p1, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    .line 83
    iget-wide v0, p0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/a;->a:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
