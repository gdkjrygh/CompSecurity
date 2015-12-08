.class Lcom/scannerfire/utils/EncodeUtils$ShareTask;
.super Landroid/os/AsyncTask;
.source "EncodeUtils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/utils/EncodeUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ShareTask"
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
    .line 434
    iput-object p1, p0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/scannerfire/utils/EncodeUtils;Lcom/scannerfire/utils/EncodeUtils$ShareTask;)V
    .locals 0

    .prologue
    .line 434
    invoke-direct {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;-><init>(Lcom/scannerfire/utils/EncodeUtils;)V

    return-void
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 27
    .param p1, "params"    # [Ljava/lang/String;

    .prologue
    .line 439
    new-instance v3, Lcom/google/zxing/qrcode/QRCodeWriter;

    invoke-direct {v3}, Lcom/google/zxing/qrcode/QRCodeWriter;-><init>()V

    .line 440
    .local v3, "writer":Lcom/google/zxing/qrcode/QRCodeWriter;
    const/high16 v18, -0x1000000

    .line 441
    .local v18, "colorBack":I
    const/16 v19, -0x1

    .line 445
    .local v19, "colorFront":I
    :try_start_0
    new-instance v8, Ljava/util/EnumMap;

    const-class v4, Lcom/google/zxing/EncodeHintType;

    invoke-direct {v8, v4}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    .line 446
    .local v8, "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    sget-object v4, Lcom/google/zxing/EncodeHintType;->CHARACTER_SET:Lcom/google/zxing/EncodeHintType;

    const-string v5, "UTF-8"

    invoke-virtual {v8, v4, v5}, Ljava/util/EnumMap;->put(Ljava/lang/Enum;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    const/4 v4, 0x0

    aget-object v4, p1, v4

    sget-object v5, Lcom/google/zxing/BarcodeFormat;->QR_CODE:Lcom/google/zxing/BarcodeFormat;

    const/16 v6, 0x15e

    const/16 v7, 0x15e

    invoke-virtual/range {v3 .. v8}, Lcom/google/zxing/qrcode/QRCodeWriter;->encode(Ljava/lang/String;Lcom/google/zxing/BarcodeFormat;IILjava/util/Map;)Lcom/google/zxing/common/BitMatrix;

    move-result-object v17

    .line 448
    .local v17, "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getWidth()I

    move-result v12

    .line 449
    .local v12, "width":I
    invoke-virtual/range {v17 .. v17}, Lcom/google/zxing/common/BitMatrix;->getHeight()I

    move-result v16

    .line 450
    .local v16, "height":I
    mul-int v4, v12, v16

    new-array v10, v4, [I

    .line 451
    .local v10, "pixels":[I
    const/16 v26, 0x0

    .local v26, "y":I
    :goto_0
    move/from16 v0, v26

    move/from16 v1, v16

    if-lt v0, v1, :cond_0

    .line 461
    const/4 v4, 0x0

    aget-object v23, p1, v4

    .line 462
    .local v23, "text":Ljava/lang/String;
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v0, v16

    invoke-static {v12, v0, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 463
    .local v9, "bmp":Landroid/graphics/Bitmap;
    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v15, v12

    invoke-virtual/range {v9 .. v16}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 464
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v4, v4, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    invoke-virtual {v4}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v9}, Lcom/scannerfire/utils/EncodeUtils;->getImageUri(Landroid/content/Context;Landroid/graphics/Bitmap;)Landroid/net/Uri;

    move-result-object v24

    .line 465
    .local v24, "u":Landroid/net/Uri;
    if-nez v24, :cond_3

    .line 467
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v4, v4, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const-string v5, "Error"

    invoke-static {v4, v5}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/google/zxing/WriterException; {:try_start_0 .. :try_end_0} :catch_0

    .line 468
    const-string v4, "ERROR"

    .line 483
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v9    # "bmp":Landroid/graphics/Bitmap;
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v23    # "text":Ljava/lang/String;
    .end local v24    # "u":Landroid/net/Uri;
    .end local v26    # "y":I
    :goto_1
    return-object v4

    .line 453
    .restart local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .restart local v10    # "pixels":[I
    .restart local v12    # "width":I
    .restart local v16    # "height":I
    .restart local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .restart local v26    # "y":I
    :cond_0
    mul-int v21, v26, v12

    .line 454
    .local v21, "offset":I
    const/16 v25, 0x0

    .local v25, "x":I
    :goto_2
    move/from16 v0, v25

    if-lt v0, v12, :cond_1

    .line 451
    add-int/lit8 v26, v26, 0x1

    goto :goto_0

    .line 457
    :cond_1
    add-int v5, v21, v25

    :try_start_1
    move-object/from16 v0, v17

    move/from16 v1, v25

    move/from16 v2, v26

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v4

    if-eqz v4, :cond_2

    move/from16 v4, v18

    :goto_3
    aput v4, v10, v5

    .line 454
    add-int/lit8 v25, v25, 0x1

    goto :goto_2

    :cond_2
    move/from16 v4, v19

    .line 457
    goto :goto_3

    .line 470
    .end local v21    # "offset":I
    .end local v25    # "x":I
    .restart local v9    # "bmp":Landroid/graphics/Bitmap;
    .restart local v23    # "text":Ljava/lang/String;
    .restart local v24    # "u":Landroid/net/Uri;
    :cond_3
    new-instance v22, Landroid/content/Intent;

    invoke-direct/range {v22 .. v22}, Landroid/content/Intent;-><init>()V

    .line 471
    .local v22, "shareIntent":Landroid/content/Intent;
    const-string v4, "android.intent.action.SEND"

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 472
    const-string v4, "android.intent.extra.STREAM"

    move-object/from16 v0, v22

    move-object/from16 v1, v24

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 473
    const-string v4, "android.intent.extra.SUBJECT"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Powered by "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v6, v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v6, v6, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v7, 0x7f0800b1

    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " - http://goo.gl/pTAlm4"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v22

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 474
    const-string v4, "android.intent.extra.EMAIL"

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 475
    const-string v4, "android.intent.extra.TEXT"

    move-object/from16 v0, v22

    move-object/from16 v1, v23

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 476
    const-string v4, "image/jpeg"

    move-object/from16 v0, v22

    invoke-virtual {v0, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 477
    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v4, v4, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v5, v5, Lcom/scannerfire/utils/EncodeUtils;->activity:Landroid/app/Activity;

    const v6, 0x7f080112

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v22

    invoke-static {v0, v5}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Lcom/google/zxing/WriterException; {:try_start_1 .. :try_end_1} :catch_0

    .line 483
    .end local v8    # "hint":Ljava/util/EnumMap;, "Ljava/util/EnumMap<Lcom/google/zxing/EncodeHintType;Ljava/lang/Object;>;"
    .end local v9    # "bmp":Landroid/graphics/Bitmap;
    .end local v10    # "pixels":[I
    .end local v12    # "width":I
    .end local v16    # "height":I
    .end local v17    # "bitMatrix":Lcom/google/zxing/common/BitMatrix;
    .end local v22    # "shareIntent":Landroid/content/Intent;
    .end local v23    # "text":Ljava/lang/String;
    .end local v24    # "u":Landroid/net/Uri;
    .end local v26    # "y":I
    :goto_4
    const-string v4, "OK"

    goto/16 :goto_1

    .line 478
    :catch_0
    move-exception v20

    .line 480
    .local v20, "e":Lcom/google/zxing/WriterException;
    invoke-virtual/range {v20 .. v20}, Lcom/google/zxing/WriterException;->printStackTrace()V

    goto :goto_4
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 490
    iget-object v0, p0, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->this$0:Lcom/scannerfire/utils/EncodeUtils;

    iget-object v0, v0, Lcom/scannerfire/utils/EncodeUtils;->prog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 492
    return-void
.end method

.method protected onPreExecute()V
    .locals 0

    .prologue
    .line 496
    return-void
.end method

.method protected bridge varargs synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/scannerfire/utils/EncodeUtils$ShareTask;->onProgressUpdate([Ljava/lang/Void;)V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Void;)V
    .locals 0
    .param p1, "values"    # [Ljava/lang/Void;

    .prologue
    .line 500
    return-void
.end method
