.class public Lcom/QRBS/activity/QrActivity;
.super Lcom/google/zxing/client/android/CaptureActivity;
.source "QrActivity.java"


# static fields
.field private static final SCAN_DELAY_MS:J = 0x7d0L


# instance fields
.field continuousScan:Z

.field flash:Landroid/widget/ImageView;

.field flashOn:Z

.field private result:Lcom/google/zxing/Result;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/google/zxing/client/android/CaptureActivity;-><init>()V

    .line 32
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/QRBS/activity/QrActivity;->flashOn:Z

    .line 33
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/QRBS/activity/QrActivity;->continuousScan:Z

    .line 27
    return-void
.end method

.method private playBeep()V
    .locals 1

    .prologue
    .line 184
    invoke-static {}, Lcom/scannerfire/utils/SoundControl;->isSoundLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 185
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/scannerfire/utils/SoundControl;->playSound(I)V

    .line 186
    :cond_0
    return-void
.end method


# virtual methods
.method public handleDecode(Lcom/google/zxing/Result;Landroid/graphics/Bitmap;F)V
    .locals 22
    .param p1, "rawResult"    # Lcom/google/zxing/Result;
    .param p2, "barcode"    # Landroid/graphics/Bitmap;
    .param p3, "scaleFactor"    # F

    .prologue
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v8

    .line 77
    .local v8, "code":Ljava/lang/String;
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    .line 78
    invoke-static {}, Lcom/scannerfire/utils/SharedVars;->getInstance()Lcom/scannerfire/utils/SharedVars;

    move-result-object v18

    move-object/from16 v0, v18

    move-object/from16 v1, p0

    invoke-virtual {v0, v1, v8}, Lcom/scannerfire/utils/SharedVars;->addSavedCode(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    new-instance v11, Landroid/content/Intent;

    const-class v18, Lcom/QRBS/activity/MyResultActivity;

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-direct {v11, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 82
    .local v11, "i":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v18, v0

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v5

    .line 83
    .local v5, "b":Landroid/os/Bundle;
    new-instance v6, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v6}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 84
    .local v6, "baos":Ljava/io/ByteArrayOutputStream;
    sget-object v18, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v19, 0x64

    move-object/from16 v0, p2

    move-object/from16 v1, v18

    move/from16 v2, v19

    invoke-virtual {v0, v1, v2, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 85
    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    .line 86
    .local v7, "bytetopass":[B
    const-string v18, "picture"

    move-object/from16 v0, v18

    invoke-virtual {v11, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 87
    invoke-virtual {v11, v5}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 88
    const-string v18, ""

    const-string v19, "INIZIO SALVATAGGIO"

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v19, v0

    invoke-static/range {v18 .. v19}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V

    .line 91
    const-string v18, ""

    const-string v19, "FINE SALVATAGGIO"

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->getSoundPref(Landroid/content/Context;)Z

    move-result v18

    if-eqz v18, :cond_0

    .line 94
    invoke-direct/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->playBeep()V

    .line 95
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->getVibratePref(Landroid/content/Context;)Z

    move-result v18

    if-eqz v18, :cond_1

    .line 96
    const-string v18, "vibrator"

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/os/Vibrator;

    .line 97
    .local v17, "vib":Landroid/os/Vibrator;
    const-wide/16 v18, 0x3c

    invoke-virtual/range {v17 .. v19}, Landroid/os/Vibrator;->vibrate(J)V

    .line 100
    .end local v17    # "vib":Landroid/os/Vibrator;
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->getContinuousPref(Landroid/content/Context;)Z

    move-result v18

    if-eqz v18, :cond_3

    .line 101
    const-wide/16 v18, 0x7d0

    move-object/from16 v0, p0

    move-wide/from16 v1, v18

    invoke-virtual {v0, v1, v2}, Lcom/QRBS/activity/QrActivity;->restartPreviewAfterDelay(J)V

    .line 102
    const v18, 0x7f0d005e

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v16

    check-cast v16, Landroid/widget/TextView;

    .line 103
    .local v16, "t":Landroid/widget/TextView;
    const v18, 0x7f080153

    move-object/from16 v0, v16

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 164
    .end local v16    # "t":Landroid/widget/TextView;
    :cond_2
    :goto_0
    return-void

    .line 108
    :cond_3
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/QRBS/activity/QrActivity;->flashOn:Z

    move/from16 v18, v0

    if-eqz v18, :cond_4

    .line 109
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->turnOff()V

    .line 111
    :cond_4
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->getClipboardPref(Landroid/content/Context;)Z

    move-result v18

    if-eqz v18, :cond_5

    .line 112
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    const-string v19, "label"

    move-object/from16 v0, v19

    invoke-virtual {v5, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Lcom/scannerfire/utils/Utils;->copyToClipboard(Landroid/content/Context;Ljava/lang/String;)V

    .line 115
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/scannerfire/utils/Utils;->getAutomaticRedPref(Landroid/content/Context;)Z

    move-result v18

    if-eqz v18, :cond_8

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v18, v0

    invoke-static/range {v18 .. v18}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v12

    .line 118
    .local v12, "pr":Lcom/google/zxing/client/result/ParsedResult;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "QR_CODE"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_7

    invoke-virtual {v12}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "URI"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_7

    .line 120
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v15

    .line 121
    .local v15, "str":Ljava/lang/String;
    if-eqz v15, :cond_2

    .line 122
    const-string v18, "http://"

    move-object/from16 v0, v18

    invoke-static {v15, v0}, Lcom/scannerfire/utils/Utils;->URICorrection(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 123
    .local v9, "correctURI":Ljava/lang/String;
    const-string v18, "market://details?id="

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v18

    if-eqz v18, :cond_6

    .line 125
    const-string v18, "="

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v14

    .line 127
    .local v14, "split":[Ljava/lang/String;
    :try_start_0
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "SPLIT 1->"

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v20, 0x0

    aget-object v20, v14, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const-string v20, " SPLIT 2->"

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    const/16 v20, 0x1

    aget-object v20, v14, v20

    invoke-virtual/range {v19 .. v20}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 128
    new-instance v18, Landroid/content/Intent;

    const-string v19, "android.intent.action.VIEW"

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    invoke-direct/range {v18 .. v20}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->finish()V

    goto/16 :goto_0

    .line 129
    :catch_0
    move-exception v4

    .line 130
    .local v4, "anfe":Landroid/content/ActivityNotFoundException;
    new-instance v18, Landroid/content/Intent;

    const-string v19, "android.intent.action.VIEW"

    new-instance v20, Ljava/lang/StringBuilder;

    const-string v21, "http://play.google.com/store/apps/details?id="

    invoke-direct/range {v20 .. v21}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v21, 0x1

    aget-object v21, v14, v21

    invoke-virtual/range {v20 .. v21}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    invoke-direct/range {v18 .. v20}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 136
    .end local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    .end local v14    # "split":[Ljava/lang/String;
    :cond_6
    move-object v13, v9

    .line 138
    .local v13, "s":Ljava/lang/String;
    :try_start_1
    new-instance v18, Landroid/content/Intent;

    const-string v19, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    invoke-direct/range {v18 .. v20}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 144
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->finish()V

    goto/16 :goto_0

    .line 140
    :catch_1
    move-exception v4

    .line 141
    .restart local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    const v18, 0x7f080157

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->getString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 142
    const-string v18, ""

    new-instance v19, Ljava/lang/StringBuilder;

    const-string v20, "ActivityNotFoundException: url is ->"

    invoke-direct/range {v19 .. v20}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v19

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v18 .. v19}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 147
    .end local v4    # "anfe":Landroid/content/ActivityNotFoundException;
    .end local v9    # "correctURI":Ljava/lang/String;
    .end local v13    # "s":Ljava/lang/String;
    .end local v15    # "str":Ljava/lang/String;
    :cond_7
    invoke-virtual {v12}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v18

    const-string v19, "PRODUCT"

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    if-ne v0, v1, :cond_8

    .line 148
    new-instance v18, Ljava/lang/StringBuilder;

    const-string v19, "http://www.google.com/m/products?q="

    invoke-direct/range {v18 .. v19}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/QRBS/activity/QrActivity;->result:Lcom/google/zxing/Result;

    move-object/from16 v19, v0

    invoke-virtual/range {v19 .. v19}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 150
    .restart local v13    # "s":Ljava/lang/String;
    :try_start_2
    new-instance v18, Landroid/content/Intent;

    const-string v19, "android.intent.action.VIEW"

    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    invoke-direct/range {v18 .. v20}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 155
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->finish()V

    goto/16 :goto_0

    .line 152
    :catch_2
    move-exception v10

    .line 153
    .local v10, "e":Landroid/content/ActivityNotFoundException;
    const v18, 0x7f080157

    move-object/from16 v0, p0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Lcom/QRBS/activity/QrActivity;->getString(I)Ljava/lang/String;

    move-result-object v18

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    invoke-static {v0, v1}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_3

    .line 162
    .end local v10    # "e":Landroid/content/ActivityNotFoundException;
    .end local v12    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v13    # "s":Ljava/lang/String;
    :cond_8
    move-object/from16 v0, p0

    invoke-virtual {v0, v11}, Lcom/QRBS/activity/QrActivity;->startActivity(Landroid/content/Intent;)V

    .line 163
    invoke-virtual/range {p0 .. p0}, Lcom/QRBS/activity/QrActivity;->finish()V

    goto/16 :goto_0
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 171
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->finish()V

    .line 173
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 37
    const v1, 0x7f070076

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/QrActivity;->setTheme(I)V

    .line 38
    invoke-super {p0, p1}, Lcom/google/zxing/client/android/CaptureActivity;->onCreate(Landroid/os/Bundle;)V

    .line 39
    const v1, 0x7f030018

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/QrActivity;->setContentView(I)V

    .line 41
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/scannerfire/utils/SoundControl;->init(Landroid/content/Context;)V

    .line 43
    const v1, 0x7f0d005d

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/QrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/QRBS/activity/QrActivity;->flash:Landroid/widget/ImageView;

    .line 44
    iget-object v1, p0, Lcom/QRBS/activity/QrActivity;->flash:Landroid/widget/ImageView;

    new-instance v2, Lcom/QRBS/activity/QrActivity$1;

    invoke-direct {v2, p0}, Lcom/QRBS/activity/QrActivity$1;-><init>(Lcom/QRBS/activity/QrActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/scannerfire/utils/Utils;->getContinuousPref(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    const v1, 0x7f0d005e

    invoke-virtual {p0, v1}, Lcom/QRBS/activity/QrActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 69
    .local v0, "t":Landroid/widget/TextView;
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 70
    const v1, 0x7f080153

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 72
    .end local v0    # "t":Landroid/widget/TextView;
    :cond_0
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2
    .param p1, "menu"    # Landroid/view/Menu;

    .prologue
    .line 178
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0f0006

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 179
    const/4 v0, 0x1

    return v0
.end method

.method public turnOff()V
    .locals 2

    .prologue
    .line 195
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->getCameraManager()Lcom/google/zxing/client/android/camera/CameraManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/zxing/client/android/camera/CameraManager;->setTorch(Z)V

    .line 196
    return-void
.end method

.method public turnOn()V
    .locals 2

    .prologue
    .line 191
    invoke-virtual {p0}, Lcom/QRBS/activity/QrActivity;->getCameraManager()Lcom/google/zxing/client/android/camera/CameraManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/zxing/client/android/camera/CameraManager;->setTorch(Z)V

    .line 192
    return-void
.end method
