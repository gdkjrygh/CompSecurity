.class public Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;
.super Ljava/lang/Object;
.source "WLDroidGap.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/worklight/androidgap/WLDroidGap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "PrepackagedAssetsManager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$Checksum;
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/worklight/androidgap/WLDroidGap;


# direct methods
.method public constructor <init>(Lcom/worklight/androidgap/WLDroidGap;)V
    .locals 0

    .prologue
    .line 383
    iput-object p1, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;)V
    .locals 0

    .prologue
    .line 385
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopyIfNeeded()V

    return-void
.end method

.method private copyPrepackagedAssetsToLocalCopy()V
    .locals 28

    .prologue
    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v22, v0

    invoke-virtual/range {v22 .. v22}, Lcom/worklight/androidgap/WLDroidGap;->getApplicationContext()Landroid/content/Context;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    .line 422
    .local v4, "assetManager":Landroid/content/res/AssetManager;
    :try_start_0
    new-instance v22, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->deleteDirectory(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 429
    :goto_0
    const-string v22, "Started copying files to local storage..."

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 431
    const/4 v14, 0x0

    .line 434
    .local v14, "is":Ljava/io/InputStream;
    const/16 v16, 0x0

    .line 436
    .local v16, "isResourcesZipExists":Z
    :try_start_1
    const-string v22, "www"

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v19

    .line 437
    .local v19, "stringArray":[Ljava/lang/String;
    invoke-static/range {v19 .. v19}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    const-string v23, "resources.zip"

    invoke-interface/range {v22 .. v23}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v16

    .line 438
    if-eqz v16, :cond_0

    .line 439
    const-string v22, "www/resources.zip"

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v14

    .line 445
    .end local v19    # "stringArray":[Ljava/lang/String;
    :cond_0
    :goto_1
    if-eqz v16, :cond_4

    .line 446
    const-string v22, "Found resources.zip file. Starting decryption and unzipping process."

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 448
    const-string v18, "JfnnlDI7RTiF9RgfG2JNCw=="

    .line 449
    .local v18, "keyInBase64":Ljava/lang/String;
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->getBytes()[B

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/utils/Base64;->decode([B)[B

    move-result-object v17

    .line 453
    .local v17, "key":[B
    :try_start_2
    const-string v22, "www/resources.zip"

    move-object/from16 v0, v22

    invoke-virtual {v4, v0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v20

    .line 454
    .local v20, "resourcesZipFileSize":J
    invoke-static {}, Lcom/worklight/common/WLUtils;->getFreeSpaceOnDevice()J

    move-result-wide v12

    .line 457
    .local v12, "freeSpaceOnDevice":J
    const-wide/16 v22, 0x3

    mul-long v22, v22, v20

    cmp-long v22, v22, v12

    if-gez v22, :cond_1

    const/4 v15, 0x1

    .line 459
    .local v15, "isEnoughSpaceForUnzip":Z
    :goto_2
    const-wide/16 v22, 0x0

    cmp-long v22, v20, v22

    if-gtz v22, :cond_2

    .line 460
    const-string v22, "Failed unzipping Resources.zip. File seems to be corruptted."

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    .line 495
    .end local v12    # "freeSpaceOnDevice":J
    .end local v15    # "isEnoughSpaceForUnzip":Z
    .end local v17    # "key":[B
    .end local v18    # "keyInBase64":Ljava/lang/String;
    .end local v20    # "resourcesZipFileSize":J
    :goto_3
    return-void

    .line 423
    .end local v14    # "is":Ljava/io/InputStream;
    .end local v16    # "isResourcesZipExists":Z
    :catch_0
    move-exception v10

    .line 424
    .local v10, "e1":Ljava/lang/Exception;
    const-string v22, "Problem deleting directory %s. This might happen if the application was installed, then the shareduserID was changed, and the application was redeployed"

    .line 425
    const/16 v23, 0x1

    move/from16 v0, v23

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v23, v0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v25, v0

    invoke-virtual/range {v25 .. v25}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v25

    aput-object v25, v23, v24

    .line 424
    invoke-static/range {v22 .. v23}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    .line 426
    const/16 v22, 0x0

    invoke-static/range {v22 .. v22}, Ljava/lang/System;->exit(I)V

    goto :goto_0

    .line 441
    .end local v10    # "e1":Ljava/lang/Exception;
    .restart local v14    # "is":Ljava/io/InputStream;
    .restart local v16    # "isResourcesZipExists":Z
    :catch_1
    move-exception v9

    .line 442
    .local v9, "e":Ljava/io/IOException;
    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "I/O failure while reading resources.zip from application package."

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_1

    .line 457
    .end local v9    # "e":Ljava/io/IOException;
    .restart local v12    # "freeSpaceOnDevice":J
    .restart local v17    # "key":[B
    .restart local v18    # "keyInBase64":Ljava/lang/String;
    .restart local v20    # "resourcesZipFileSize":J
    :cond_1
    const/4 v15, 0x0

    goto :goto_2

    .line 462
    .restart local v15    # "isEnoughSpaceForUnzip":Z
    :cond_2
    if-eqz v15, :cond_3

    .line 463
    :try_start_3
    move-object/from16 v0, v17

    invoke-static {v14, v0}, Lcom/worklight/utils/SecurityUtils;->decryptData(Ljava/io/InputStream;[B)Ljava/io/InputStream;

    move-result-object v8

    .line 464
    .local v8, "decryptedZipInputStream":Ljava/io/InputStream;
    new-instance v22, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v23

    invoke-direct/range {v22 .. v23}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v0, v22

    invoke-static {v8, v0}, Lcom/worklight/common/WLUtils;->unpack(Ljava/io/InputStream;Ljava/io/File;)V

    .line 482
    const-string v22, "Resources.zip unzipped"

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 494
    .end local v8    # "decryptedZipInputStream":Ljava/io/InputStream;
    .end local v12    # "freeSpaceOnDevice":J
    .end local v15    # "isEnoughSpaceForUnzip":Z
    .end local v17    # "key":[B
    .end local v18    # "keyInBase64":Ljava/lang/String;
    .end local v20    # "resourcesZipFileSize":J
    :goto_4
    const-string v22, "Finished copying files to local storage..."

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto :goto_3

    .line 466
    .restart local v12    # "freeSpaceOnDevice":J
    .restart local v15    # "isEnoughSpaceForUnzip":Z
    .restart local v17    # "key":[B
    .restart local v18    # "keyInBase64":Ljava/lang/String;
    .restart local v20    # "resourcesZipFileSize":J
    :cond_3
    :try_start_4
    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "Resources.zip cannot be unzipped. Not enough space available on the device. Required size: "

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v24, 0x3

    mul-long v24, v24, v20

    move-object/from16 v0, v22

    move-wide/from16 v1, v24

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v22

    const-string v23, " Available size: "

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    move-object/from16 v0, v22

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 467
    const-wide/high16 v6, 0x4130000000000000L    # 1048576.0

    .line 468
    .local v6, "bytesToMB":D
    new-instance v5, Ljava/text/DecimalFormat;

    const-string v22, "#.##"

    move-object/from16 v0, v22

    invoke-direct {v5, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 469
    .local v5, "decimalFormat":Ljava/text/DecimalFormat;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v22, v0

    const-string v23, "Error"

    new-instance v24, Ljava/lang/StringBuilder;

    const-string v25, "The application needs "

    invoke-direct/range {v24 .. v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-wide/16 v26, 0x3

    mul-long v26, v26, v20

    move-wide/from16 v0, v26

    long-to-double v0, v0

    move-wide/from16 v26, v0

    div-double v26, v26, v6

    move-wide/from16 v0, v26

    invoke-virtual {v5, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    const-string v25, " MB to initialize, but only "

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    long-to-double v0, v12

    move-wide/from16 v26, v0

    div-double v26, v26, v6

    move-wide/from16 v0, v26

    invoke-virtual {v5, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    .line 470
    const-string v25, " MB are available. Please free some space and try again."

    invoke-virtual/range {v24 .. v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v24

    invoke-virtual/range {v24 .. v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    const-string v25, "Exit"

    new-instance v26, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$1;

    move-object/from16 v0, v26

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager$1;-><init>(Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;)V

    .line 469
    invoke-static/range {v22 .. v26}, Lcom/worklight/common/WLUtils;->showDialog(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 478
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v22, v0

    const/16 v23, 0x1

    invoke-static/range {v22 .. v23}, Lcom/worklight/androidgap/WLDroidGap;->access$1(Lcom/worklight/androidgap/WLDroidGap;Z)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto/16 :goto_3

    .line 483
    .end local v5    # "decimalFormat":Ljava/text/DecimalFormat;
    .end local v6    # "bytesToMB":D
    .end local v12    # "freeSpaceOnDevice":J
    .end local v15    # "isEnoughSpaceForUnzip":Z
    .end local v20    # "resourcesZipFileSize":J
    :catch_2
    move-exception v11

    .line 484
    .local v11, "ioe":Ljava/io/IOException;
    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "Error while unpacking resources.zip file."

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 485
    invoke-virtual {v11}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_4

    .line 486
    .end local v11    # "ioe":Ljava/io/IOException;
    :catch_3
    move-exception v9

    .line 487
    .local v9, "e":Ljava/lang/Exception;
    new-instance v22, Ljava/lang/StringBuilder;

    const-string v23, "Error during decryption of resources.zip file."

    invoke-direct/range {v22 .. v23}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v22 .. v23}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 490
    .end local v9    # "e":Ljava/lang/Exception;
    .end local v17    # "key":[B
    .end local v18    # "keyInBase64":Ljava/lang/String;
    :cond_4
    const-string v22, "www"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageRoot()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct {v0, v4, v1, v2}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopy(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    const-string v22, "wlclient.properties"

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Lcom/worklight/androidgap/WLDroidGap;->getLocalStorageWebRoot()Ljava/lang/String;

    move-result-object v23

    move-object/from16 v0, p0

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct {v0, v4, v1, v2}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopy(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4
.end method

.method private copyPrepackagedAssetsToLocalCopy(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1, "assetManager"    # Landroid/content/res/AssetManager;
    .param p2, "relativePath"    # Ljava/lang/String;
    .param p3, "targetRootPath"    # Ljava/lang/String;

    .prologue
    .line 498
    const/4 v3, 0x0

    .line 499
    .local v3, "in":Ljava/io/InputStream;
    const/4 v4, 0x0

    .line 500
    .local v4, "out":Ljava/io/OutputStream;
    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, "/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 511
    .local v6, "targetFile":Ljava/io/File;
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    .line 512
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    .end local v4    # "out":Ljava/io/OutputStream;
    .local v5, "out":Ljava/io/OutputStream;
    :try_start_1
    invoke-static {v3, v5}, Lcom/worklight/common/WLUtils;->copyFile(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v4, v5

    .line 528
    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v4    # "out":Ljava/io/OutputStream;
    :cond_0
    if-eqz v3, :cond_1

    .line 529
    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 535
    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    .line 536
    :try_start_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 542
    :cond_2
    :goto_1
    return-void

    .line 517
    :catch_0
    move-exception v0

    .line 518
    .local v0, "e":Ljava/io/IOException;
    :goto_2
    :try_start_4
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 519
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 520
    .local v1, "files":[Ljava/lang/String;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_3
    array-length v7, v1

    if-ge v2, v7, :cond_0

    .line 521
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v8, "/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    aget-object v8, v1, v2

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, p1, v7, p3}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopy(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 520
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 524
    .end local v0    # "e":Ljava/io/IOException;
    .end local v1    # "files":[Ljava/lang/String;
    .end local v2    # "i":I
    :catch_1
    move-exception v0

    .line 525
    .local v0, "e":Ljava/lang/Exception;
    :goto_4
    :try_start_5
    new-instance v7, Ljava/lang/RuntimeException;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "PrepackagedAssetsManager Failure. Failed copying prepackaged assets to local storage. The exception occurred when copying the following file/directory: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 526
    .end local v0    # "e":Ljava/lang/Exception;
    :catchall_0
    move-exception v7

    .line 528
    :goto_5
    if-eqz v3, :cond_3

    .line 529
    :try_start_6
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 535
    :cond_3
    :goto_6
    if-eqz v4, :cond_4

    .line 536
    :try_start_7
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3

    .line 541
    :cond_4
    :goto_7
    throw v7

    .line 531
    :catch_2
    move-exception v0

    .line 532
    .local v0, "e":Ljava/io/IOException;
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failed close file input stream: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ". "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_6

    .line 538
    .end local v0    # "e":Ljava/io/IOException;
    :catch_3
    move-exception v0

    .line 539
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Failed close file output stream: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ". "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto :goto_7

    .line 531
    .end local v0    # "e":Ljava/io/IOException;
    :catch_4
    move-exception v0

    .line 532
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failed close file input stream: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ". "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 538
    .end local v0    # "e":Ljava/io/IOException;
    :catch_5
    move-exception v0

    .line 539
    .restart local v0    # "e":Ljava/io/IOException;
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failed close file output stream: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ". "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 526
    .end local v0    # "e":Ljava/io/IOException;
    .end local v4    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    :catchall_1
    move-exception v7

    move-object v4, v5

    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v4    # "out":Ljava/io/OutputStream;
    goto/16 :goto_5

    .line 524
    .end local v4    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    :catch_6
    move-exception v0

    move-object v4, v5

    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v4    # "out":Ljava/io/OutputStream;
    goto/16 :goto_4

    .line 517
    .end local v4    # "out":Ljava/io/OutputStream;
    .restart local v5    # "out":Ljava/io/OutputStream;
    :catch_7
    move-exception v0

    move-object v4, v5

    .end local v5    # "out":Ljava/io/OutputStream;
    .restart local v4    # "out":Ljava/io/OutputStream;
    goto/16 :goto_2
.end method

.method private copyPrepackagedAssetsToLocalCopyIfNeeded()V
    .locals 1

    .prologue
    .line 387
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->isNewPackage()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 388
    const-string v0, "New installation/upgrade detected, copying resources and saving new checksum"

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->debug(Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v0}, Lcom/worklight/androidgap/WLDroidGap;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/worklight/common/WLUtils;->clearWLPref(Landroid/content/Context;)V

    .line 390
    invoke-direct {p0}, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->copyPrepackagedAssetsToLocalCopy()V

    .line 392
    :cond_0
    iget-object v0, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    # invokes: Lcom/worklight/androidgap/WLDroidGap;->testResourcesChecksum()V
    invoke-static {v0}, Lcom/worklight/androidgap/WLDroidGap;->access$0(Lcom/worklight/androidgap/WLDroidGap;)V

    .line 393
    return-void
.end method

.method private isNewPackage()Z
    .locals 14

    .prologue
    .line 396
    const/4 v11, 0x0

    .line 398
    .local v11, "result":Z
    :try_start_0
    const-string v0, "appInstallTime"

    .line 399
    .local v0, "APP_INSTALL_TIME_KEY":Ljava/lang/String;
    iget-object v12, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v12}, Lcom/worklight/androidgap/WLDroidGap;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    .line 400
    .local v7, "pm":Landroid/content/pm/PackageManager;
    iget-object v12, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    invoke-virtual {v12}, Lcom/worklight/androidgap/WLDroidGap;->getPackageName()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    invoke-virtual {v7, v12, v13}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 401
    .local v2, "appInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v1, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 402
    .local v1, "appFile":Ljava/lang/String;
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    .line 403
    .local v4, "appInstallTime":J
    iget-object v12, p0, Lcom/worklight/androidgap/WLDroidGap$PrepackagedAssetsManager;->this$0:Lcom/worklight/androidgap/WLDroidGap;

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lcom/worklight/androidgap/WLDroidGap;->getPreferences(I)Landroid/content/SharedPreferences;

    move-result-object v10

    .line 404
    .local v10, "preferences":Landroid/content/SharedPreferences;
    const-wide/16 v12, 0x0

    invoke-interface {v10, v0, v12, v13}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    .line 406
    .local v8, "lastAppInstallTime":J
    cmp-long v12, v4, v8

    if-lez v12, :cond_0

    .line 407
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 408
    .local v6, "editor":Landroid/content/SharedPreferences$Editor;
    invoke-interface {v6, v0, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 409
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    const/4 v11, 0x1

    .line 415
    .end local v6    # "editor":Landroid/content/SharedPreferences$Editor;
    :cond_0
    return v11

    .line 412
    .end local v0    # "APP_INSTALL_TIME_KEY":Ljava/lang/String;
    .end local v1    # "appFile":Ljava/lang/String;
    .end local v2    # "appInfo":Landroid/content/pm/ApplicationInfo;
    .end local v4    # "appInstallTime":J
    .end local v7    # "pm":Landroid/content/pm/PackageManager;
    .end local v8    # "lastAppInstallTime":J
    .end local v10    # "preferences":Landroid/content/SharedPreferences;
    :catch_0
    move-exception v3

    .line 413
    .local v3, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    new-instance v12, Ljava/lang/RuntimeException;

    const-string v13, "PrepackagedAssetsManager Failure. Can\'t retrieve ApplicationInfo - something fundumental went wrong here."

    invoke-direct {v12, v13, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v12
.end method
