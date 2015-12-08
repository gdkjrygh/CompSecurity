.class Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;
.super Landroid/os/AsyncTask;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/EncodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ChangeColorTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field activity:Lcom/QRBS/activity/MyEncodeActivity;

.field bmp:Landroid/graphics/Bitmap;

.field image:Landroid/widget/ImageView;

.field newColor:I

.field final synthetic this$0:Lcom/scannerfire/utils/EncodeUtils;


# direct methods
.method protected constructor <init>(Lcom/scannerfire/utils/EncodeUtils;ILandroid/widget/ImageView;Lcom/QRBS/activity/MyEncodeActivity;)V
    .locals 0
    .param p2, "color"    # I
    .param p3, "v"    # Landroid/widget/ImageView;
    .param p4, "a"    # Lcom/QRBS/activity/MyEncodeActivity;

    .prologue
    .line 513
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 514
    iput p2, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->newColor:I

    .line 515
    iput-object p3, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->image:Landroid/widget/ImageView;

    .line 516
    iput-object p4, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->activity:Lcom/QRBS/activity/MyEncodeActivity;

    .line 517
    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 23
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 522
    new-instance v3, Lcom/google/zxing/qrcode/QRCodeWriter;

    invoke-direct {v3}, Lcom/google/zxing/qrcode/QRCodeWriter;-><init>()V

    .line 523
    .local v3, "writer":Lcom/google/zxing/qrcode/QRCodeWriter;
    const/16 v18, -0x1

    .line 527
    .local v18, "colorFront":I
    :try_start_0
    new-instance v8, Ljava/util/EnumMap;

    const-class v4, Lcom/google/zxing/EncodeHintType;

    invoke-direct {v8, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 528
    .local v8, "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    sget-object v4, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    const-string v5, "UTF-8"

    invoke-virtual {v8, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    const/4 v4, 0x0

    aget-object v4, p1, v4

    sget-object v5, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    const/16 v6, 0x15e

    const/16 v7, 0x15e

    invoke-virtual/range {v3 .. v8}, Lcom/google/zxing/qrcode/QRCodeWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;

    move-result-object v17

    .line 530
    .local v17, "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v12

    .line 531
    .local v12, "width":I
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v16

    .line 532
    .local v16, "height":I
    mul-int v4, v12, v16

    new-array v10, v4, [I

    .line 533
    .local v10, "pixels":[I
    const/16 v22, 0x0

    .local v22, "y":I
    :goto_0
    move/from16 v0, v22

    move/from16 v1, v16

    if-lt v0, v1, :cond_0

    .line 543
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v0, v16

    invoke-static {v12, v0, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    move-object/from16 v0, p0

    iput-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->bmp:Landroid/graphics/Bitmap;

    .line 544
    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->bmp:Landroid/graphics/Bitmap;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v15, v12

    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V
    :try_end_0
    .catch Lcom/google/zxing/WriterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v22    # "y":I
    :goto_1
    const-string v4, "OK"

    return-object v4

    .line 535
    .restart local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .restart local v10    # "pixels":[I
    .restart local v12    # "width":I
    .restart local v16    # "height":I
    .restart local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .restart local v22    # "y":I
    :cond_0
    mul-int v20, v22, v12

    .line 536
    .local v20, "offset":I
    const/16 v21, 0x0

    .local v21, "x":I
    :goto_2
    move/from16 v0, v21

    if-lt v0, v12, :cond_1

    .line 533
    add-int/lit8 v22, v22, 0x1

    goto :goto_0

    .line 539
    :cond_1
    add-int v5, v20, v21

    :try_start_1
    move-object/from16 v0, v17

    move/from16 v1, v21

    move/from16 v2, v22

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v0, p0

    iget v4, v0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->newColor:I

    :goto_3
    aput v4, v10, v5
    :try_end_1
    .catch Lcom/google/zxing/WriterException; {:try_start_1 .. :try_end_1} :catch_0

    .line 536
    add-int/lit8 v21, v21, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, v18

    .line 539
    goto :goto_3

    .line 547
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v20    # "offset":I
    .end local v21    # "x":I
    .end local v22    # "y":I
    :catch_0
    move-exception v19

    .line 549
    .local v19, "e":Lcom/google/zxing/WriterException;
    invoke-virtual/range {v19 .. v19}, Lcom/google/zxing/WriterException;->printStackTrace()V

    goto :goto_1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 2
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 559
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v0, v0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 560
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->image:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->bmp:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 561
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->activity:Lcom/QRBS/activity/MyEncodeActivity;

    iget-object v1, p0, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->bmp:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/MyEncodeActivity;->changeBmp(Landroid/graphics/Bitmap;)V

    .line 562
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 566
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ChangeColorTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 570
    return-void
.end method
