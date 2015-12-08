.class public final Lcom/roidapp/photogrid/release/ic;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Lcom/roidapp/photogrid/release/lc;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/roidapp/photogrid/release/ig;II)Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    .line 17
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    if-eqz v0, :cond_0

    .line 18
    iput p3, p0, Lcom/roidapp/photogrid/release/ic;->d:I

    .line 19
    iput p4, p0, Lcom/roidapp/photogrid/release/ic;->e:I

    .line 22
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v0, v0, Lcom/roidapp/photogrid/release/lc;->l:F

    int-to-float v1, p3

    mul-float/2addr v0, v1

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 23
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ic;->b:Lcom/roidapp/photogrid/release/lc;

    iget v1, v1, Lcom/roidapp/photogrid/release/lc;->m:F

    int-to-float v2, p4

    mul-float/2addr v1, v2

    div-float/2addr v1, v3

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 24
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {p2, v1, v0, v2}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 1046
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_0

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 27
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    return-object v0

    .line 1048
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1050
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    .line 1051
    invoke-static {p1}, Lcom/roidapp/photogrid/filter/b;->b(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p2}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1056
    :goto_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    if-eq v0, v1, :cond_0

    .line 1057
    iput-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    goto :goto_0

    .line 1053
    :cond_2
    invoke-static {p1}, Lcom/roidapp/photogrid/filter/b;->a(Landroid/content/Context;)Lcom/roidapp/imagelib/e/b;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-static {v0, v1, p2}, Lcom/roidapp/photogrid/filter/b;->a(Lcom/roidapp/imagelib/e/b;Landroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_1
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ic;->a:Landroid/graphics/Bitmap;

    .line 65
    :cond_0
    return-void
.end method
