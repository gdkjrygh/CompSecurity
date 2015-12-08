.class public final Lcom/roidapp/cloudlib/sns/b/a/i;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/f",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/x;",
        ">;>;"
    }
.end annotation


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method

.method public static a(Lorg/json/JSONArray;Z)Lcom/roidapp/cloudlib/sns/b/a/i;
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v1, 0x0

    .line 27
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v3

    .line 44
    :goto_0
    return-object v0

    .line 32
    :cond_1
    new-instance v2, Lcom/roidapp/cloudlib/sns/b/a/i;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/sns/b/a/i;-><init>()V

    move v0, v1

    .line 35
    :goto_1
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v0, v4, :cond_2

    .line 36
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 37
    new-instance v5, Lcom/roidapp/cloudlib/sns/b/f;

    invoke-direct {v5}, Lcom/roidapp/cloudlib/sns/b/f;-><init>()V

    .line 38
    invoke-static {v4, v3, p1}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v6

    iput-object v6, v5, Lcom/roidapp/cloudlib/sns/b/f;->a:Ljava/lang/Object;

    .line 39
    const-string v6, "time"

    invoke-static {v4, v6}, Lcom/roidapp/baselib/c/n;->a(Lorg/json/JSONObject;Ljava/lang/String;)J

    move-result-wide v6

    iput-wide v6, v5, Lcom/roidapp/cloudlib/sns/b/f;->b:J

    .line 40
    invoke-virtual {v2, v5}, Lcom/roidapp/cloudlib/sns/b/a/i;->add(Ljava/lang/Object;)Z

    .line 35
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/a/i;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    iput-boolean v1, v2, Lcom/roidapp/cloudlib/sns/b/a/i;->a:Z

    move-object v0, v2

    .line 44
    goto :goto_0
.end method
