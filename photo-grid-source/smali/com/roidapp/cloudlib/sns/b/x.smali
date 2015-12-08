.class public Lcom/roidapp/cloudlib/sns/b/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# instance fields
.field public a:J
    .annotation runtime Lcom/google/a/a/b;
        a = "uid"
    .end annotation
.end field

.field public b:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "nickname"
    .end annotation
.end field

.field public c:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "name"
    .end annotation
.end field

.field public d:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "gender"
    .end annotation
.end field

.field public e:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "birthDay"
    .end annotation
.end field

.field public f:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "email"
    .end annotation
.end field

.field public g:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "locale"
    .end annotation
.end field

.field public h:Ljava/lang/String;
    .annotation runtime Lcom/google/a/a/b;
        a = "avatar"
    .end annotation
.end field

.field public i:I
    .annotation runtime Lcom/google/a/a/b;
        a = "postCount"
    .end annotation
.end field

.field public j:I
    .annotation runtime Lcom/google/a/a/b;
        a = "fansCount"
    .end annotation
.end field

.field public k:I
    .annotation runtime Lcom/google/a/a/b;
        a = "followsCount"
    .end annotation
.end field

.field public l:I
    .annotation runtime Lcom/google/a/a/b;
        a = "likeCount"
    .end annotation
.end field

.field public m:I
    .annotation runtime Lcom/google/a/a/b;
        a = "commentCount"
    .end annotation
.end field

.field public n:J
    .annotation runtime Lcom/google/a/a/b;
        a = "createTime"
    .end annotation
.end field

.field public o:J
    .annotation runtime Lcom/google/a/a/b;
        a = "activeTime"
    .end annotation
.end field

.field public p:J
    .annotation runtime Lcom/google/a/a/b;
        a = "modifyTime"
    .end annotation
.end field

.field public q:Lcom/roidapp/cloudlib/sns/b/c;
    .annotation runtime Lcom/google/a/a/b;
        a = "followed"
    .end annotation
.end field

.field public r:Z
    .annotation runtime Lcom/google/a/a/b;
        a = "isReg"
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

.method public static a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 107
    if-nez p0, :cond_1

    .line 108
    const/4 p1, 0x0

    .line 137
    :cond_0
    :goto_0
    return-object p1

    .line 111
    :cond_1
    if-nez p1, :cond_2

    .line 112
    new-instance p1, Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p1}, Lcom/roidapp/cloudlib/sns/b/x;-><init>()V

    .line 115
    :cond_2
    const-string v0, "uid"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    .line 116
    const-string v0, "nickname"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    .line 117
    const-string v0, "name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->c:Ljava/lang/String;

    .line 118
    const-string v0, "gender"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->d:Ljava/lang/String;

    .line 119
    const-string v0, "birthDay"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->e:Ljava/lang/String;

    .line 120
    const-string v0, "email"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->f:Ljava/lang/String;

    .line 121
    const-string v0, "locale"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->g:Ljava/lang/String;

    .line 122
    const-string v0, "avatar"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    .line 123
    const-string v0, "postCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    .line 124
    const-string v0, "fansCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    .line 125
    const-string v0, "followsCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    .line 126
    const-string v0, "likeCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->l:I

    .line 127
    const-string v0, "commentCount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->m:I

    .line 128
    const-string v0, "createTime"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->n:J

    .line 129
    const-string v0, "activeTime"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->o:J

    .line 130
    const-string v0, "modifyTime"

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->p:J

    .line 131
    const-string v0, "followed"

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    :goto_1
    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    .line 132
    const-string v0, "isReg"

    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->r:Z

    .line 134
    if-eqz p2, :cond_0

    .line 135
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;)V

    goto/16 :goto_0

    .line 131
    :cond_3
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    goto :goto_1
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 1

    .prologue
    .line 94
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 95
    if-eqz v0, :cond_0

    .line 96
    invoke-static {v0, p0, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    .line 98
    :cond_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 142
    if-ne p0, p1, :cond_1

    .line 151
    :cond_0
    :goto_0
    return v0

    .line 145
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 146
    goto :goto_0

    .line 149
    :cond_3
    check-cast p1, Lcom/roidapp/cloudlib/sns/b/x;

    .line 151
    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    .line 157
    iget-wide v0, p0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    const/16 v4, 0x20

    ushr-long/2addr v2, v4

    xor-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
