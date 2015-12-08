.class final Lcom/roidapp/photogrid/cloud/ae;
.super Lcom/roidapp/cloudlib/ads/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/ads/g",
        "<",
        "Lcom/roidapp/photogrid/cloud/aa;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/aa;)V
    .locals 0

    .prologue
    .line 95
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/ads/g;-><init>(Ljava/lang/Object;)V

    .line 96
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 92
    check-cast p1, Lcom/roidapp/photogrid/cloud/aa;

    .line 2100
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aa;->a(Lcom/roidapp/photogrid/cloud/aa;)Lcom/roidapp/cloudlib/ads/i;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2102
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    const v1, 0x9c48

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ads/f;->a(I)Lcom/cmcm/a/a/a;

    move-result-object v0

    .line 2103
    if-eqz v0, :cond_0

    .line 2108
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aa;->a(Lcom/roidapp/photogrid/cloud/aa;)Lcom/roidapp/cloudlib/ads/i;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2111
    new-instance v1, Lcom/roidapp/cloudlib/ads/j;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/ads/j;-><init>()V

    .line 2112
    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/ads/j;->a(Ljava/lang/Object;)V

    .line 2113
    invoke-virtual {v1, p1}, Lcom/roidapp/cloudlib/ads/j;->a(Lcom/roidapp/cloudlib/ads/k;)V

    .line 2114
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aa;->a(Lcom/roidapp/photogrid/cloud/aa;)Lcom/roidapp/cloudlib/ads/i;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/roidapp/cloudlib/ads/i;->a(Lcom/roidapp/cloudlib/ads/j;)I

    .line 92
    :cond_0
    return-void
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/cmcm/a/a/a;)V
    .locals 3

    .prologue
    .line 92
    check-cast p1, Lcom/roidapp/photogrid/cloud/aa;

    .line 1126
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aa;->b(Lcom/roidapp/photogrid/cloud/aa;)Landroid/util/SparseArray;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1128
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/aa;->b(Lcom/roidapp/photogrid/cloud/aa;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1129
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1130
    const/4 v1, 0x4

    const/4 v2, 0x6

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 92
    :cond_0
    return-void
.end method

.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 92
    return-void
.end method
