.class Lcom/scannerfire/utils/EncodeUtils$EncodeTask;
.super Landroid/os/AsyncTask;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/EncodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EncodeTask"
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
.field final synthetic this$0:Lcom/scannerfire/utils/EncodeUtils;


# direct methods
.method private constructor <init>(Lcom/scannerfire/utils/EncodeUtils;)V
    .locals 0

    .prologue
    .line 370
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scannerfire/utils/EncodeUtils;Lcom/scannerfire/utils/EncodeUtils$EncodeTask;)V
    .locals 0

    .prologue
    .line 370
    invoke-direct {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;-><init>(Lcom/scannerfire/utils/EncodeUtils;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 25
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 375
    new-instance v3, Lcom/google/zxing/qrcode/QRCodeWriter;

    invoke-direct {v3}, Lcom/google/zxing/qrcode/QRCodeWriter;-><init>()V

    .line 376
    .local v3, "writer":Lcom/google/zxing/qrcode/QRCodeWriter;
    const/high16 v18, -0x1000000

    .line 377
    .local v18, "colorBack":I
    const/16 v19, -0x1

    .line 381
    .local v19, "colorFront":I
    :try_start_0
    new-instance v8, Ljava/util/EnumMap;

    const-class v4, Lcom/google/zxing/EncodeHintType;

    invoke-direct {v8, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 382
    .local v8, "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    sget-object v4, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    const-string v5, "UTF-8"

    invoke-virtual {v8, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    const/4 v4, 0x0

    aget-object v4, p1, v4

    sget-object v5, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    const/16 v6, 0x15e

    const/16 v7, 0x15e

    invoke-virtual/range {v3 .. v8}, Lcom/google/zxing/qrcode/QRCodeWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;

    move-result-object v17

    .line 384
    .local v17, "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v12

    .line 385
    .local v12, "width":I
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v16

    .line 386
    .local v16, "height":I
    mul-int v4, v12, v16

    new-array v10, v4, [I

    .line 387
    .local v10, "pixels":[I
    const/16 v24, 0x0

    .local v24, "y":I
    :goto_0
    move/from16 v0, v24

    move/from16 v1, v16

    if-lt v0, v1, :cond_0

    .line 397
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v0, v16

    invoke-static {v12, v0, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 398
    .local v9, "bitmap":Landroid/graphics/Bitmap;
    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v15, v12

    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 399
    new-instance v21, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v4, v4, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const-class v5, Lcom/QRBS/activity/MyEncodeActivity;

    move-object/from16 v0, v21

    invoke-direct {v0, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 400
    .local v21, "i":Landroid/content/Intent;
    const-string v4, "image"

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 401
    const-string v4, "parametro"

    const/4 v5, 0x0

    aget-object v5, p1, v5

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 402
    const-string v4, "text"

    const/4 v5, 0x1

    aget-object v5, p1, v5

    move-object/from16 v0, v21

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v4, v4, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    move-object/from16 v0, v21

    invoke-virtual {v4, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Lcom/google/zxing/WriterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 411
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v9    # "bitmap":Landroid/graphics/Bitmap;
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v21    # "i":Landroid/content/Intent;
    .end local v24    # "y":I
    :goto_1
    const-string v4, "OK"

    return-object v4

    .line 389
    .restart local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .restart local v10    # "pixels":[I
    .restart local v12    # "width":I
    .restart local v16    # "height":I
    .restart local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .restart local v24    # "y":I
    :cond_0
    mul-int v22, v24, v12

    .line 390
    .local v22, "offset":I
    const/16 v23, 0x0

    .local v23, "x":I
    :goto_2
    move/from16 v0, v23

    if-lt v0, v12, :cond_1

    .line 387
    add-int/lit8 v24, v24, 0x1

    goto :goto_0

    .line 393
    :cond_1
    add-int v5, v22, v23

    :try_start_1
    move-object/from16 v0, v17

    move/from16 v1, v23

    move/from16 v2, v24

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v4

    if-eqz v4, :cond_2

    move/from16 v4, v18

    :goto_3
    aput v4, v10, v5
    :try_end_1
    .catch Lcom/google/zxing/WriterException; {:try_start_1 .. :try_end_1} :catch_0

    .line 390
    add-int/lit8 v23, v23, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, v19

    .line 393
    goto :goto_3

    .line 406
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v22    # "offset":I
    .end local v23    # "x":I
    .end local v24    # "y":I
    :catch_0
    move-exception v20

    .line 408
    .local v20, "e":Lcom/google/zxing/WriterException;
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/WriterException;->printStackTrace()V

    goto :goto_1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 418
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v0, v0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 420
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 424
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$EncodeTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 428
    return-void
.end method
