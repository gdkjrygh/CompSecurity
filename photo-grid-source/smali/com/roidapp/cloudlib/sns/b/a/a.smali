.class public Lcom/roidapp/cloudlib/sns/b/a/a;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/a;",
        ">;",
        "Lcom/roidapp/cloudlib/sns/b/v;"
    }
.end annotation


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONArray;Lcom/roidapp/cloudlib/sns/b/a/a;Z)Lcom/roidapp/cloudlib/sns/b/a/a;
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 36
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object p1, v2

    .line 51
    :goto_0
    return-object p1

    .line 40
    :cond_1
    if-nez p1, :cond_2

    .line 41
    new-instance p1, Lcom/roidapp/cloudlib/sns/b/a/a;

    invoke-direct {p1}, Lcom/roidapp/cloudlib/sns/b/a/a;-><init>()V

    :cond_2
    move v0, v1

    .line 44
    :goto_1
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 45
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    invoke-static {v3, v2, p2}, Lcom/roidapp/cloudlib/sns/b/a;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/a;Z)Lcom/roidapp/cloudlib/sns/b/a;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/roidapp/cloudlib/sns/b/a/a;->add(Ljava/lang/Object;)Z

    .line 44
    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 50
    :cond_4
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/a;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v1, 0x1

    :cond_5
    iput-boolean v1, p1, Lcom/roidapp/cloudlib/sns/b/a/a;->a:Z

    goto :goto_0
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 2

    .prologue
    .line 29
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 31
    invoke-static {v0, p0, p2}, Lcom/roidapp/cloudlib/sns/b/a/a;->a(Lorg/json/JSONArray;Lcom/roidapp/cloudlib/sns/b/a/a;Z)Lcom/roidapp/cloudlib/sns/b/a/a;

    .line 33
    :cond_0
    return-void
.end method
