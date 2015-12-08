.class final Lcom/roidapp/cloudlib/facebook/aj;
.super Lcom/roidapp/cloudlib/ad;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/cloudlib/facebook/af;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 310
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/aj;->e:Lcom/roidapp/cloudlib/facebook/FbPhotoFragment;

    .line 311
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/ad;-><init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V

    .line 308
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    .line 312
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 342
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/af;

    .line 343
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/af;->b()Ljava/lang/String;

    move-result-object v0

    .line 345
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/facebook/af;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 315
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 316
    if-eqz p2, :cond_1

    .line 317
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 320
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/facebook/aj;->notifyDataSetChanged()V

    .line 322
    :cond_0
    return-void

    .line 319
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    goto :goto_0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 351
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/facebook/af;

    .line 352
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/facebook/af;->a()Ljava/lang/String;

    move-result-object v0

    .line 354
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 326
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/aj;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 336
    int-to-long v0, p1

    return-wide v0
.end method
