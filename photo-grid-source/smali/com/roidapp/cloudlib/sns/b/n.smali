.class public Lcom/roidapp/cloudlib/sns/b/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# instance fields
.field public a:Lcom/roidapp/cloudlib/sns/b/o;

.field public b:Lcom/roidapp/cloudlib/sns/b/x;

.field public c:Lcom/roidapp/cloudlib/sns/b/a/a;

.field public d:Lcom/roidapp/cloudlib/sns/b/a/i;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:Lcom/roidapp/cloudlib/sns/b/g;

.field public g:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/n;Z)Lcom/roidapp/cloudlib/sns/b/n;
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 135
    if-nez p0, :cond_1

    move-object p1, v0

    .line 168
    :cond_0
    :goto_0
    return-object p1

    .line 139
    :cond_1
    if-nez p1, :cond_2

    .line 140
    new-instance p1, Lcom/roidapp/cloudlib/sns/b/n;

    invoke-direct {p1}, Lcom/roidapp/cloudlib/sns/b/n;-><init>()V

    .line 144
    :cond_2
    const-string v2, "isRecommend"

    invoke-virtual {p0, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->g:Z

    .line 145
    invoke-static {p0}, Lcom/roidapp/cloudlib/sns/b/o;->a(Lorg/json/JSONObject;)Lcom/roidapp/cloudlib/sns/b/o;

    move-result-object v2

    iput-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->a:Lcom/roidapp/cloudlib/sns/b/o;

    .line 146
    const-string v2, "user"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2, v0, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v2

    iput-object v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 148
    iget-boolean v2, p1, Lcom/roidapp/cloudlib/sns/b/n;->g:Z

    if-nez v2, :cond_4

    .line 149
    const-string v2, "commentlist"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v2, v0, p2}, Lcom/roidapp/cloudlib/sns/b/a/a;->a(Lorg/json/JSONArray;Lcom/roidapp/cloudlib/sns/b/a/a;Z)Lcom/roidapp/cloudlib/sns/b/a/a;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->c:Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 150
    const-string v0, "likelist"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/roidapp/cloudlib/sns/b/a/i;->a(Lorg/json/JSONArray;Z)Lcom/roidapp/cloudlib/sns/b/a/i;

    move-result-object v0

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->d:Lcom/roidapp/cloudlib/sns/b/a/i;

    .line 151
    const-string v0, "liked"

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->b:Lcom/roidapp/cloudlib/sns/b/g;

    :goto_1
    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->f:Lcom/roidapp/cloudlib/sns/b/g;

    .line 152
    const-string v0, "taglist"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 153
    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 154
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p1, Lcom/roidapp/cloudlib/sns/b/n;->e:Ljava/util/List;

    move v0, v1

    .line 155
    :goto_2
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 156
    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/n;->e:Ljava/util/List;

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 151
    :cond_3
    sget-object v0, Lcom/roidapp/cloudlib/sns/b/g;->c:Lcom/roidapp/cloudlib/sns/b/g;

    goto :goto_1

    .line 165
    :cond_4
    if-eqz p2, :cond_0

    .line 166
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/n;)V

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 1

    .prologue
    .line 128
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 129
    if-eqz v0, :cond_0

    .line 130
    invoke-static {v0, p0, p2}, Lcom/roidapp/cloudlib/sns/b/n;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/n;Z)Lcom/roidapp/cloudlib/sns/b/n;

    .line 132
    :cond_0
    return-void
.end method
