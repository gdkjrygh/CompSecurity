.class public Lcom/QRBS/activity/FromURL;
.super Lcom/actionbarsherlock/app/SherlockActivity;
.source "FromURL.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/QRBS/activity/FromURL$DecodeTask;
    }
.end annotation


# instance fields
.field private app:Lcom/actionbarsherlock/app/SherlockActivity;

.field private editUrl:Landroid/widget/EditText;

.field private myBitmap:Landroid/graphics/Bitmap;

.field private qrImage:Landroid/widget/ImageView;

.field private utils:Lcom/scannerfire/utils/Utils;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/actionbarsherlock/app/SherlockActivity;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/QRBS/activity/FromURL;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/QRBS/activity/FromURL;->editUrl:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic access$1(Lcom/QRBS/activity/FromURL;)Lcom/scannerfire/utils/Utils;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;

    return-object v0
.end method

.method static synthetic access$2(Lcom/QRBS/activity/FromURL;)Lcom/actionbarsherlock/app/SherlockActivity;
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;

    return-object v0
.end method

.method static synthetic access$3(Lcom/QRBS/activity/FromURL;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/QRBS/activity/FromURL;->qrImage:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$4(Lcom/QRBS/activity/FromURL;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic access$5(Lcom/QRBS/activity/FromURL;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 232
    invoke-direct {p0, p1}, Lcom/QRBS/activity/FromURL;->decodeBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method private decodeBitmap(Landroid/graphics/Bitmap;)V
    .locals 12
    .param p1, "bMap"    # Landroid/graphics/Bitmap;

    .prologue
    .line 235
    :try_start_0
    new-instance v8, Lcom/QRBS/camera/RGBLuminanceSource;

    invoke-direct {v8, p1}, Lcom/QRBS/camera/RGBLuminanceSource;-><init>(Landroid/graphics/Bitmap;)V

    .line 236
    .local v8, "source":Lcom/QRBS/camera/RGBLuminanceSource;
    new-instance v1, Lcom/google/zxing/BinaryBitmap;

    new-instance v9, Lcom/google/zxing/common/HybridBinarizer;

    invoke-direct {v9, v8}, Lcom/google/zxing/common/HybridBinarizer;-><init>(Lcom/google/zxing/LuminanceSource;)V

    invoke-direct {v1, v9}, Lcom/google/zxing/BinaryBitmap;-><init>(Lcom/google/zxing/Binarizer;)V

    .line 238
    .local v1, "bitmap":Lcom/google/zxing/BinaryBitmap;
    new-instance v5, Lcom/google/zxing/MultiFormatReader;

    invoke-direct {v5}, Lcom/google/zxing/MultiFormatReader;-><init>()V

    .line 240
    .local v5, "reader":Lcom/google/zxing/Reader;
    const-string v9, ""

    const-string v10, "dentro try"

    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 241
    invoke-interface {v5, v1}, Lcom/google/zxing/Reader;->decode(Lcom/google/zxing/BinaryBitmap;)Lcom/google/zxing/Result;

    move-result-object v6

    .line 243
    .local v6, "result":Lcom/google/zxing/Result;
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/scannerfire/utils/Utils;->getAutomaticRedPref(Landroid/content/Context;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 245
    invoke-static {v6}, Lcom/google/zxing/client/result/ResultParser;->parseResult(Lcom/google/zxing/Result;)Lcom/google/zxing/client/result/ParsedResult;

    move-result-object v4

    .line 246
    .local v4, "pr":Lcom/google/zxing/client/result/ParsedResult;
    invoke-virtual {v6}, Lcom/google/zxing/Result;->getBarcodeFormat()Lcom/google/zxing/BarcodeFormat;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/zxing/BarcodeFormat;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "QR_CODE"

    if-ne v9, v10, :cond_0

    invoke-virtual {v4}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "URI"

    if-ne v9, v10, :cond_0

    .line 248
    invoke-virtual {v6}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v7

    .line 254
    .local v7, "s":Ljava/lang/String;
    invoke-static {p0, v6}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V
    :try_end_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_5

    .line 256
    :try_start_1
    new-instance v9, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v9}, Lcom/QRBS/activity/FromURL;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Lcom/google/zxing/NotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_5

    .line 261
    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->finish()V

    .line 302
    .end local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v5    # "reader":Lcom/google/zxing/Reader;
    .end local v6    # "result":Lcom/google/zxing/Result;
    .end local v7    # "s":Ljava/lang/String;
    .end local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :goto_1
    return-void

    .line 258
    .restart local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .restart local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .restart local v5    # "reader":Lcom/google/zxing/Reader;
    .restart local v6    # "result":Lcom/google/zxing/Result;
    .restart local v7    # "s":Ljava/lang/String;
    .restart local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_0
    move-exception v3

    .line 259
    .local v3, "ex":Landroid/content/ActivityNotFoundException;
    const v9, 0x7f080157

    invoke-virtual {p0, v9}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {p0, v9}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/google/zxing/NotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_5

    goto :goto_0

    .line 286
    .end local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v3    # "ex":Landroid/content/ActivityNotFoundException;
    .end local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v5    # "reader":Lcom/google/zxing/Reader;
    .end local v6    # "result":Lcom/google/zxing/Result;
    .end local v7    # "s":Ljava/lang/String;
    .end local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_1
    move-exception v2

    .line 288
    .local v2, "e":Lcom/google/zxing/NotFoundException;
    invoke-virtual {v2}, Lcom/google/zxing/NotFoundException;->printStackTrace()V

    goto :goto_1

    .line 264
    .end local v2    # "e":Lcom/google/zxing/NotFoundException;
    .restart local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .restart local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .restart local v5    # "reader":Lcom/google/zxing/Reader;
    .restart local v6    # "result":Lcom/google/zxing/Result;
    .restart local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :cond_0
    :try_start_3
    invoke-virtual {v4}, Lcom/google/zxing/client/result/ParsedResult;->getType()Lcom/google/zxing/client/result/ParsedResultType;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/zxing/client/result/ParsedResultType;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "PRODUCT"

    if-ne v9, v10, :cond_1

    .line 265
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "http://www.google.com/m/products?q="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/google/zxing/Result;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 266
    .restart local v7    # "s":Ljava/lang/String;
    invoke-static {p0, v6}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V
    :try_end_3
    .catch Lcom/google/zxing/NotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_5

    .line 268
    :try_start_4
    new-instance v9, Landroid/content/Intent;

    const-string v10, "android.intent.action.VIEW"

    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v9}, Lcom/QRBS/activity/FromURL;->startActivity(Landroid/content/Intent;)V
    :try_end_4
    .catch Landroid/content/ActivityNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Lcom/google/zxing/NotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_5

    .line 273
    :goto_2
    :try_start_5
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->finish()V
    :try_end_5
    .catch Lcom/google/zxing/NotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_1

    .line 289
    .end local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v5    # "reader":Lcom/google/zxing/Reader;
    .end local v6    # "result":Lcom/google/zxing/Result;
    .end local v7    # "s":Ljava/lang/String;
    .end local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_2
    move-exception v2

    .line 291
    .local v2, "e":Lcom/google/zxing/ChecksumException;
    invoke-virtual {v2}, Lcom/google/zxing/ChecksumException;->printStackTrace()V

    goto :goto_1

    .line 270
    .end local v2    # "e":Lcom/google/zxing/ChecksumException;
    .restart local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .restart local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .restart local v5    # "reader":Lcom/google/zxing/Reader;
    .restart local v6    # "result":Lcom/google/zxing/Result;
    .restart local v7    # "s":Ljava/lang/String;
    .restart local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_3
    move-exception v3

    .line 271
    .restart local v3    # "ex":Landroid/content/ActivityNotFoundException;
    const v9, 0x7f080157

    :try_start_6
    invoke-virtual {p0, v9}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {p0, v9}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_6
    .catch Lcom/google/zxing/NotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_2

    .line 292
    .end local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v3    # "ex":Landroid/content/ActivityNotFoundException;
    .end local v4    # "pr":Lcom/google/zxing/client/result/ParsedResult;
    .end local v5    # "reader":Lcom/google/zxing/Reader;
    .end local v6    # "result":Lcom/google/zxing/Result;
    .end local v7    # "s":Ljava/lang/String;
    .end local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_4
    move-exception v2

    .line 294
    .local v2, "e":Lcom/google/zxing/FormatException;
    invoke-virtual {v2}, Lcom/google/zxing/FormatException;->printStackTrace()V

    goto :goto_1

    .line 281
    .end local v2    # "e":Lcom/google/zxing/FormatException;
    .restart local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .restart local v5    # "reader":Lcom/google/zxing/Reader;
    .restart local v6    # "result":Lcom/google/zxing/Result;
    .restart local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :cond_1
    :try_start_7
    invoke-static {v6}, Lcom/scannerfire/utils/Utils;->makeBundle(Lcom/google/zxing/Result;)Landroid/os/Bundle;

    move-result-object v0

    .line 282
    .local v0, "b":Landroid/os/Bundle;
    invoke-static {p0, v0, p1}, Lcom/scannerfire/utils/Utils;->launchResultActivity(Landroid/content/Context;Landroid/os/Bundle;Landroid/graphics/Bitmap;)V

    .line 283
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->getApplication()Landroid/app/Application;

    move-result-object v9

    invoke-static {v9, v6}, Lcom/scannerfire/utils/Utils;->saveInDB(Landroid/content/Context;Lcom/google/zxing/Result;)V
    :try_end_7
    .catch Lcom/google/zxing/NotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Lcom/google/zxing/ChecksumException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Lcom/google/zxing/FormatException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_1

    .line 298
    .end local v0    # "b":Landroid/os/Bundle;
    .end local v1    # "bitmap":Lcom/google/zxing/BinaryBitmap;
    .end local v5    # "reader":Lcom/google/zxing/Reader;
    .end local v6    # "result":Lcom/google/zxing/Result;
    .end local v8    # "source":Lcom/QRBS/camera/RGBLuminanceSource;
    :catch_5
    move-exception v2

    .line 299
    .local v2, "e":Ljava/lang/OutOfMemoryError;
    const v9, 0x7f080111

    invoke-virtual {p0, v9}, Lcom/QRBS/activity/FromURL;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {p0, v9}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_1
.end method


# virtual methods
.method public getBitmapFromURL(Ljava/lang/String;)Landroid/net/Uri;
    .locals 9
    .param p1, "s"    # Ljava/lang/String;

    .prologue
    .line 188
    const-string v6, ""

    const-string v7, "dentro getBitmapFromUrl"

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 192
    :try_start_0
    new-instance v6, Ljava/net/URL;

    invoke-direct {v6, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v3

    check-cast v3, Ljava/net/HttpURLConnection;

    .line 193
    .local v3, "httpurlconnection":Ljava/net/HttpURLConnection;
    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 194
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 195
    const-string v6, ""

    const-string v7, "check"

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 196
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-static {v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v6

    iput-object v6, p0, Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;

    .line 197
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 198
    .local v0, "bytearrayoutputstream":Ljava/io/ByteArrayOutputStream;
    iget-object v6, p0, Lcom/QRBS/activity/FromURL;->myBitmap:Landroid/graphics/Bitmap;

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v8, 0x28

    invoke-virtual {v6, v7, v8, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 199
    new-instance v1, Ljava/io/File;

    const-string v6, "data/data/com.ScannerPro.SCAN/downloadCache"

    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 200
    .local v1, "file":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_0

    .line 202
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 204
    :cond_0
    new-instance v2, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "test.jpg"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 205
    .local v2, "file1":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    .line 206
    const-string v6, ""

    const-string v7, "check4"

    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    .line 216
    .end local v0    # "bytearrayoutputstream":Ljava/io/ByteArrayOutputStream;
    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "file1":Ljava/io/File;
    .end local v3    # "httpurlconnection":Ljava/net/HttpURLConnection;
    :goto_0
    return-object v5

    .line 212
    :catch_0
    move-exception v4

    .line 214
    .local v4, "ioexception":Ljava/io/IOException;
    const/4 v5, 0x0

    goto :goto_0
.end method

.method public getCorrectUrl(Landroid/widget/EditText;)Ljava/lang/String;
    .locals 3
    .param p1, "edittext"    # Landroid/widget/EditText;

    .prologue
    .line 221
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 222
    .local v0, "s":Ljava/lang/String;
    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 226
    :cond_0
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5
    .param p1, "bundle"    # Landroid/os/Bundle;

    .prologue
    .line 53
    invoke-super {p0, p1}, Lcom/actionbarsherlock/app/SherlockActivity;->onCreate(Landroid/os/Bundle;)V

    .line 54
    const v3, 0x7f030041

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/FromURL;->setContentView(I)V

    .line 56
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->getSupportActionBar()Lcom/actionbarsherlock/app/ActionBar;

    move-result-object v0

    .line 57
    .local v0, "ab":Lcom/actionbarsherlock/app/ActionBar;
    const v3, 0x7f0200d4

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setIcon(I)V

    .line 58
    const v3, 0x7f0800b1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setTitle(I)V

    .line 59
    const v3, 0x7f0800d3

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setSubtitle(I)V

    .line 60
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Lcom/actionbarsherlock/app/ActionBar;->setHomeButtonEnabled(Z)V

    .line 63
    const v3, 0x7f0d0061

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/FromURL;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/ads/AdView;

    .line 64
    .local v2, "adView":Lcom/google/android/gms/ads/AdView;
    new-instance v3, Lcom/google/android/gms/ads/AdRequest$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/AdRequest$Builder;->build()Lcom/google/android/gms/ads/AdRequest;

    move-result-object v1

    .line 65
    .local v1, "adRequest":Lcom/google/android/gms/ads/AdRequest;
    invoke-virtual {v2, v1}, Lcom/google/android/gms/ads/AdView;->loadAd(Lcom/google/android/gms/ads/AdRequest;)V

    .line 67
    new-instance v3, Lcom/scannerfire/utils/Utils;

    invoke-direct {v3}, Lcom/scannerfire/utils/Utils;-><init>()V

    iput-object v3, p0, Lcom/QRBS/activity/FromURL;->utils:Lcom/scannerfire/utils/Utils;

    .line 68
    iput-object p0, p0, Lcom/QRBS/activity/FromURL;->app:Lcom/actionbarsherlock/app/SherlockActivity;

    .line 69
    const v3, 0x7f0d00e7

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/FromURL;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/QRBS/activity/FromURL;->editUrl:Landroid/widget/EditText;

    .line 70
    const v3, 0x7f0d00e8

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/FromURL;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, p0, Lcom/QRBS/activity/FromURL;->qrImage:Landroid/widget/ImageView;

    .line 71
    const v3, 0x7f0d00e6

    invoke-virtual {p0, v3}, Lcom/QRBS/activity/FromURL;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    new-instance v4, Lcom/QRBS/activity/FromURL$1;

    invoke-direct {v4, p0}, Lcom/QRBS/activity/FromURL$1;-><init>(Lcom/QRBS/activity/FromURL;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    return-void
.end method

.method public onOptionsItemSelected(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 1
    .param p1, "menuitem"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    .line 306
    invoke-virtual {p0}, Lcom/QRBS/activity/FromURL;->finish()V

    .line 307
    const/4 v0, 0x1

    return v0
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 104
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->onPause()V

    .line 105
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 109
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->onResume()V

    .line 110
    return-void
.end method

.method protected onStart()V
    .locals 0

    .prologue
    .line 114
    invoke-super {p0}, Lcom/actionbarsherlock/app/SherlockActivity;->onStart()V

    .line 115
    return-void
.end method
