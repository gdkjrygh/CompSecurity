.class public final Lcom/roidapp/photogrid/release/hv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Landroid/graphics/Bitmap;

.field protected b:I

.field protected c:I

.field protected d:Ljava/lang/String;

.field protected e:Lcom/roidapp/photogrid/release/ig;


# direct methods
.method public constructor <init>(IILcom/roidapp/photogrid/release/ig;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput p1, p0, Lcom/roidapp/photogrid/release/hv;->b:I

    .line 16
    iput p2, p0, Lcom/roidapp/photogrid/release/hv;->c:I

    .line 17
    iput-object p3, p0, Lcom/roidapp/photogrid/release/hv;->e:Lcom/roidapp/photogrid/release/ig;

    .line 18
    invoke-virtual {p3}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hv;->d:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method protected final a()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 22
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hv;->d:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/release/hv;->b:I

    iget v2, p0, Lcom/roidapp/photogrid/release/hv;->c:I

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hv;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bb;->a(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    .line 23
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 30
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hv;->a:Landroid/graphics/Bitmap;

    .line 31
    return-void
.end method
