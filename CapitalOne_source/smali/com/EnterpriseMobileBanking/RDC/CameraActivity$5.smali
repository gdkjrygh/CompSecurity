.class Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;
.super Ljava/lang/Object;
.source "CameraActivity.java"

# interfaces
.implements Landroid/hardware/Camera$PictureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/RDC/CameraActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPictureTaken([BLandroid/hardware/Camera;)V
    .locals 13
    .param p1, "data"    # [B
    .param p2, "camera"    # Landroid/hardware/Camera;

    .prologue
    .line 261
    const-string v10, "CameraActivity"

    const-string v11, "onPictureTaken()"

    invoke-static {v10, v11}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    if-eqz p2, :cond_0

    .line 264
    invoke-virtual {p2}, Landroid/hardware/Camera;->stopPreview()V

    .line 267
    :cond_0
    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 269
    .local v6, "opts":Landroid/graphics/BitmapFactory$Options;
    const/16 v10, 0x4000

    new-array v10, v10, [B

    iput-object v10, v6, Landroid/graphics/BitmapFactory$Options;->inTempStorage:[B

    .line 270
    invoke-virtual {p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v7

    .line 271
    .local v7, "parameters":Landroid/hardware/Camera$Parameters;
    invoke-virtual {v7}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v8

    .line 272
    .local v8, "size":Landroid/hardware/Camera$Size;
    iget v1, v8, Landroid/hardware/Camera$Size;->height:I

    .line 273
    .local v1, "height":I
    iget v9, v8, Landroid/hardware/Camera$Size;->width:I

    .line 274
    .local v9, "width":I
    mul-int v5, v9, v1

    .line 275
    .local v5, "numPixels":I
    mul-int/lit8 v4, v5, 0x3

    .line 276
    .local v4, "numBytes":I
    int-to-float v10, v4

    const/high16 v11, 0x497a0000    # 1024000.0f

    div-float v3, v10, v11

    .line 278
    .local v3, "mb":F
    const/high16 v10, 0x40800000    # 4.0f

    cmpl-float v10, v3, v10

    if-lez v10, :cond_1

    .line 280
    const/4 v10, 0x4

    iput v10, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 292
    :goto_0
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    const/4 v11, 0x0

    array-length v12, p1

    # invokes: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->decodeByteArrayMemCheck([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    invoke-static {v10, p1, v11, v12, v6}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1600(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 293
    .local v2, "image":Landroid/graphics/Bitmap;
    if-nez v2, :cond_3

    .line 306
    :goto_1
    return-void

    .line 282
    .end local v2    # "image":Landroid/graphics/Bitmap;
    :cond_1
    const/high16 v10, 0x40400000    # 3.0f

    cmpl-float v10, v3, v10

    if-lez v10, :cond_2

    .line 284
    const/4 v10, 0x2

    iput v10, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_0

    .line 288
    :cond_2
    const/4 v10, 0x1

    iput v10, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    goto :goto_0

    .line 297
    .restart local v2    # "image":Landroid/graphics/Bitmap;
    :cond_3
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    invoke-virtual {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-direct {v0, v10, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 298
    .local v0, "d":Landroid/graphics/drawable/Drawable;
    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOuterRL:Landroid/widget/RelativeLayout;
    invoke-static {}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$600()Landroid/widget/RelativeLayout;

    move-result-object v10

    invoke-virtual {v10, v0}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 300
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mUseRetakeLayout:Landroid/widget/LinearLayout;
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$900(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/LinearLayout;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 301
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mTakePicture:Landroid/widget/ImageButton;
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/ImageButton;

    move-result-object v10

    const/16 v11, 0x8

    invoke-virtual {v10, v11}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 302
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayUseRetake:Landroid/view/View;
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1000(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Landroid/view/View;->setVisibility(I)V

    .line 303
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mOverlayTake:Landroid/view/View;
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1100(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/view/View;

    move-result-object v10

    const/16 v11, 0x8

    invoke-virtual {v10, v11}, Landroid/view/View;->setVisibility(I)V

    .line 304
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # getter for: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->mLabel:Landroid/widget/TextView;
    invoke-static {v10}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1300(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;)Landroid/widget/TextView;

    move-result-object v10

    const-string v11, "PREVIEW"

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    iget-object v10, p0, Lcom/EnterpriseMobileBanking/RDC/CameraActivity$5;->this$0:Lcom/EnterpriseMobileBanking/RDC/CameraActivity;

    # invokes: Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->compressImage([B)V
    invoke-static {v10, p1}, Lcom/EnterpriseMobileBanking/RDC/CameraActivity;->access$1700(Lcom/EnterpriseMobileBanking/RDC/CameraActivity;[B)V

    goto :goto_1
.end method
