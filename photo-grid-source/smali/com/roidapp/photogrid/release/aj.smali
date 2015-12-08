.class final Lcom/roidapp/photogrid/release/aj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)V
    .locals 0

    .prologue
    .line 297
    iput-object p1, p0, Lcom/roidapp/photogrid/release/aj;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 300
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/aj;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->b(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/graphics/Bitmap;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 301
    sget v1, Lcom/roidapp/photogrid/common/az;->G:I

    add-int/lit8 v1, v1, 0x5a

    .line 302
    sput v1, Lcom/roidapp/photogrid/common/az;->G:I

    rem-int/lit16 v1, v1, 0x168

    sput v1, Lcom/roidapp/photogrid/common/az;->G:I

    .line 303
    iget-object v1, p0, Lcom/roidapp/photogrid/release/aj;->a:Lcom/roidapp/photogrid/release/BackgroundImageCrop;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/BackgroundImageCrop;->g(Lcom/roidapp/photogrid/release/BackgroundImageCrop;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 304
    return-void
.end method
