.class final Lcom/roidapp/cloudlib/google/p;
.super Lcom/roidapp/cloudlib/ad;
.source "SourceFile"


# instance fields
.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/google/i;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic f:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

.field private g:I


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/google/SearchPhotoFragment;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 329
    iput-object p1, p0, Lcom/roidapp/cloudlib/google/p;->f:Lcom/roidapp/cloudlib/google/SearchPhotoFragment;

    .line 330
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/ad;-><init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V

    .line 326
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/cloudlib/google/p;->g:I

    .line 327
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    .line 331
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 368
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    .line 369
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/i;

    .line 370
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/i;->a()Ljava/lang/String;

    move-result-object v0

    .line 372
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final b()I
    .locals 1

    .prologue
    .line 354
    iget v0, p0, Lcom/roidapp/cloudlib/google/p;->g:I

    return v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    .line 378
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/google/i;

    .line 379
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/google/i;->c()Ljava/lang/String;

    move-result-object v0

    .line 381
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method public final d(I)V
    .locals 2

    .prologue
    const/16 v1, 0x64

    .line 358
    if-lez p1, :cond_0

    .line 359
    iput p1, p0, Lcom/roidapp/cloudlib/google/p;->g:I

    .line 361
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/google/p;->g:I

    if-le v0, v1, :cond_1

    .line 362
    iput v1, p0, Lcom/roidapp/cloudlib/google/p;->g:I

    .line 364
    :cond_1
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 342
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Lcom/roidapp/cloudlib/google/p;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 350
    int-to-long v0, p1

    return-wide v0
.end method
