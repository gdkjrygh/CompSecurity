.class public final Lcom/roidapp/cloudlib/instagram/p;
.super Lcom/roidapp/cloudlib/ad;
.source "SourceFile"


# instance fields
.field final synthetic e:Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

.field private f:Lcom/roidapp/cloudlib/instagram/r;


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 200
    iput-object p1, p0, Lcom/roidapp/cloudlib/instagram/p;->e:Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    .line 201
    invoke-direct {p0, p1, p2}, Lcom/roidapp/cloudlib/ad;-><init>(Lcom/roidapp/cloudlib/t;Landroid/app/Activity;)V

    .line 202
    new-instance v0, Lcom/roidapp/cloudlib/instagram/r;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/instagram/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    .line 203
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/instagram/p;)Lcom/roidapp/cloudlib/instagram/r;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    return-object v0
.end method


# virtual methods
.method public final a(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/instagram/r;->a(I)Lcom/roidapp/cloudlib/instagram/m;

    move-result-object v0

    .line 220
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/m;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/instagram/r;->a(I)Lcom/roidapp/cloudlib/instagram/m;

    move-result-object v0

    .line 225
    if-nez v0, :cond_0

    .line 226
    const/4 v0, 0x0

    .line 227
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/instagram/m;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    .line 1060
    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 232
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/p;->f:Lcom/roidapp/cloudlib/instagram/r;

    .line 1045
    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 207
    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 211
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 215
    int-to-long v0, p1

    return-wide v0
.end method
