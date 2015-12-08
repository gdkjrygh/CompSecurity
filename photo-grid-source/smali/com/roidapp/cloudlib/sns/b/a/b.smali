.class public Lcom/roidapp/cloudlib/sns/b/a/b;
.super Ljava/util/ArrayList;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/b/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList",
        "<",
        "Lcom/roidapp/cloudlib/sns/b/x;",
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
    .line 19
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Z)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 52
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 53
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    move v0, v1

    .line 54
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v0, v3, :cond_1

    .line 55
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 56
    if-eqz v3, :cond_0

    .line 57
    const/4 v4, 0x0

    invoke-static {v3, v4, p2}, Lcom/roidapp/cloudlib/sns/b/x;->a(Lorg/json/JSONObject;Lcom/roidapp/cloudlib/sns/b/x;Z)Lcom/roidapp/cloudlib/sns/b/x;

    move-result-object v3

    .line 58
    if-eqz v3, :cond_0

    .line 59
    invoke-virtual {p0, v3}, Lcom/roidapp/cloudlib/sns/b/a/b;->add(Ljava/lang/Object;)Z

    .line 54
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 63
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/b/a/b;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/b/a/b;->a:Z

    .line 65
    :cond_3
    return-void
.end method
