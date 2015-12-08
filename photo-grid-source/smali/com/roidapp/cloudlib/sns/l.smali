.class public final Lcom/roidapp/cloudlib/sns/l;
.super Lcom/roidapp/cloudlib/sns/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/o",
        "<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/i;",
            "Lcom/roidapp/baselib/e/j",
            "<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 16
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/o;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/i;Lcom/roidapp/baselib/e/j;)V

    .line 17
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/roidapp/baselib/e/j",
            "<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/o;-><init>(Ljava/lang/String;Lcom/roidapp/baselib/e/j;)V

    .line 13
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 9
    .line 1021
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1022
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/af;->a(Lorg/json/JSONObject;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1023
    if-eqz p2, :cond_0

    .line 1024
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/l;->b(Ljava/lang/String;)V

    .line 1026
    :cond_0
    return-object v0

    .line 1029
    :cond_1
    new-instance v1, Lcom/roidapp/cloudlib/sns/z;

    const-string v2, "code"

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-direct {v1, v0}, Lcom/roidapp/cloudlib/sns/z;-><init>(I)V

    throw v1
.end method
