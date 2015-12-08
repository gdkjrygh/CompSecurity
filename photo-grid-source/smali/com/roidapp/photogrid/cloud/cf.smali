.class final Lcom/roidapp/photogrid/cloud/cf;
.super Lcom/roidapp/photogrid/cloud/a/l;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/br;

.field private b:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/photogrid/cloud/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/cloud/br;Landroid/content/Context;Lcom/roidapp/photogrid/cloud/a/t;)V
    .locals 1

    .prologue
    .line 217
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cf;->a:Lcom/roidapp/photogrid/cloud/br;

    .line 218
    const v0, 0xabc1

    invoke-direct {p0, p2, v0, p3}, Lcom/roidapp/photogrid/cloud/a/l;-><init>(Landroid/content/Context;ILcom/roidapp/photogrid/cloud/a/t;)V

    .line 220
    invoke-static {p1}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/roidapp/photogrid/cloud/br;)Ljava/util/Collection;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/cf;->b:Ljava/util/Collection;

    .line 221
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 225
    if-nez p1, :cond_0

    move-object v0, v2

    .line 248
    :goto_0
    return-object v0

    .line 227
    :cond_0
    if-eqz p2, :cond_5

    .line 228
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/cloud/cf;

    if-nez v0, :cond_5

    move-object v3, v2

    .line 234
    :goto_1
    if-eqz v3, :cond_1

    .line 235
    :goto_2
    if-nez v3, :cond_2

    move-object v0, v2

    .line 236
    goto :goto_0

    .line 234
    :cond_1
    const v0, 0x7f030027

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    goto :goto_2

    .line 238
    :cond_2
    const v0, 0x7f0d00dd

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 239
    const v1, 0x7f0d00de

    invoke-virtual {v3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 240
    if-eqz v0, :cond_3

    if-nez v1, :cond_4

    :cond_3
    move-object v0, v2

    .line 241
    goto :goto_0

    .line 242
    :cond_4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 243
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 244
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/cf;->a:Lcom/roidapp/photogrid/cloud/br;

    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/cf;->b:Ljava/util/Collection;

    invoke-static {v2, p1, v0, v1, v4}, Lcom/roidapp/photogrid/cloud/br;->a(Lcom/roidapp/photogrid/cloud/br;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/view/ViewGroup;Ljava/util/Collection;)V

    .line 246
    invoke-virtual {v3, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v0, v3

    .line 248
    goto :goto_0

    :cond_5
    move-object v3, p2

    goto :goto_1
.end method
