.class final Lcom/roidapp/photogrid/cloud/a/j;
.super Lcom/roidapp/cloudlib/ads/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/ads/g",
        "<",
        "Lcom/roidapp/photogrid/cloud/a/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/ads/g;-><init>(Ljava/lang/Object;)V

    .line 160
    return-void
.end method

.method private static a(Lcom/roidapp/photogrid/cloud/a/a;)V
    .locals 1

    .prologue
    .line 186
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/cloud/a/a;->a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/cmcm/a/a/a;)Lcom/cmcm/a/a/a;

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/a/a;->d:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 188
    invoke-static {p0}, Lcom/roidapp/photogrid/cloud/a/a;->c(Lcom/roidapp/photogrid/cloud/a/a;)V

    .line 189
    :cond_0
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 156
    check-cast p1, Lcom/roidapp/photogrid/cloud/a/a;

    .line 2164
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a/a;->a(Lcom/roidapp/photogrid/cloud/a/a;)Lcom/cmcm/a/a/d;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2166
    invoke-static {}, Lcom/roidapp/cloudlib/ads/f;->a()Lcom/roidapp/cloudlib/ads/f;

    move-result-object v0

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a/a;->b(Lcom/roidapp/photogrid/cloud/a/a;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/ads/f;->a(I)Lcom/cmcm/a/a/a;

    move-result-object v0

    .line 2167
    if-nez v0, :cond_1

    .line 2168
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a/j;->a(Lcom/roidapp/photogrid/cloud/a/a;)V

    .line 2169
    :cond_0
    :goto_0
    return-void

    .line 2172
    :cond_1
    const/4 v1, 0x6

    iput v1, p1, Lcom/roidapp/photogrid/cloud/a/a;->b:I

    .line 2175
    invoke-static {p1, v0}, Lcom/roidapp/photogrid/cloud/a/a;->a(Lcom/roidapp/photogrid/cloud/a/a;Lcom/cmcm/a/a/a;)Lcom/cmcm/a/a/a;

    .line 2176
    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/roidapp/photogrid/cloud/a/a;->c:Z

    .line 2180
    invoke-virtual {p1}, Lcom/roidapp/photogrid/cloud/a/a;->b()V

    goto :goto_0
.end method

.method public final synthetic a(Ljava/lang/Object;Lcom/cmcm/a/a/a;)V
    .locals 1

    .prologue
    .line 156
    check-cast p1, Lcom/roidapp/photogrid/cloud/a/a;

    .line 1194
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/roidapp/photogrid/cloud/a/a;->onClick(Landroid/view/View;)V

    .line 156
    return-void
.end method

.method public final synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 156
    check-cast p1, Lcom/roidapp/photogrid/cloud/a/a;

    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/a/j;->a(Lcom/roidapp/photogrid/cloud/a/a;)V

    return-void
.end method
