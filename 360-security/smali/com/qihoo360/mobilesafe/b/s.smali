.class public Lcom/qihoo360/mobilesafe/b/s;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/text/NumberFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 676
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/b/s;->a:Ljava/text/NumberFormat;

    .line 677
    sget-object v0, Lcom/qihoo360/mobilesafe/b/s;->a:Ljava/text/NumberFormat;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 678
    return-void
.end method

.method public static a(JJ)I
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    .line 1709
    cmp-long v0, p0, v2

    if-lez v0, :cond_0

    cmp-long v0, p2, v2

    if-lez v0, :cond_0

    .line 1710
    const-wide/16 v0, 0x64

    mul-long/2addr v0, p2

    div-long/2addr v0, p0

    long-to-int v0, v0

    .line 1712
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Ljava/io/InputStream;)J
    .locals 5

    .prologue
    .line 2570
    const/4 v1, 0x0

    .line 2572
    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, p0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2573
    :try_start_1
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 2574
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    .line 2579
    if-eqz v2, :cond_0

    .line 2580
    :try_start_2
    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    .line 2582
    :cond_0
    if-eqz p0, :cond_1

    .line 2583
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 2590
    :cond_1
    :goto_0
    return-wide v0

    .line 2585
    :catch_0
    move-exception v2

    .line 2586
    const-string/jumbo v3, "Utils"

    const-string/jumbo v4, ""

    invoke-static {v3, v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 2575
    :catch_1
    move-exception v0

    .line 2576
    :goto_1
    :try_start_3
    const-string/jumbo v2, "Utils"

    const-string/jumbo v3, ""

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 2579
    if-eqz v1, :cond_2

    .line 2580
    :try_start_4
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    .line 2582
    :cond_2
    if-eqz p0, :cond_3

    .line 2583
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 2590
    :cond_3
    :goto_2
    const-wide/16 v0, 0x0

    goto :goto_0

    .line 2585
    :catch_2
    move-exception v0

    .line 2586
    const-string/jumbo v1, "Utils"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_2

    .line 2578
    :catchall_0
    move-exception v0

    .line 2579
    :goto_3
    if-eqz v1, :cond_4

    .line 2580
    :try_start_5
    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    .line 2582
    :cond_4
    if-eqz p0, :cond_5

    .line 2583
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 2587
    :cond_5
    :goto_4
    throw v0

    .line 2585
    :catch_3
    move-exception v1

    .line 2586
    const-string/jumbo v2, "Utils"

    const-string/jumbo v3, ""

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    .line 2578
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_3

    .line 2575
    :catch_4
    move-exception v0

    move-object v1, v2

    goto :goto_1
.end method

.method public static a(Landroid/app/Activity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 2272
    if-eqz p0, :cond_0

    .line 2273
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 2275
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/app/Activity;I)Landroid/view/View;
    .locals 1

    .prologue
    .line 2236
    if-eqz p0, :cond_0

    .line 2237
    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2239
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 5

    .prologue
    .line 1240
    const/4 v1, 0x0

    .line 1243
    :try_start_0
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 1248
    new-instance v2, Ljavax/crypto/spec/DESKeySpec;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/b/s;->b([B)[B

    move-result-object v3

    invoke-direct {v2, v3}, Ljavax/crypto/spec/DESKeySpec;-><init>([B)V

    .line 1251
    const-string/jumbo v3, "DES"

    invoke-static {v3}, Ljavax/crypto/SecretKeyFactory;->getInstance(Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;

    move-result-object v3

    .line 1252
    invoke-virtual {v3, v2}, Ljavax/crypto/SecretKeyFactory;->generateSecret(Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;

    move-result-object v2

    .line 1255
    const-string/jumbo v3, "DES"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 1258
    const/4 v4, 0x2

    invoke-virtual {v3, v4, v2, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/SecureRandom;)V

    .line 1259
    new-instance v0, Ljavax/crypto/CipherInputStream;

    invoke-direct {v0, p0, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 1270
    :goto_0
    return-object v0

    .line 1260
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 1268
    goto :goto_0

    .line 1264
    :catch_1
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method

.method public static a()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1614
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 1615
    if-eqz v0, :cond_0

    .line 1616
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 1620
    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    .line 1618
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(F)Ljava/lang/String;
    .locals 6

    .prologue
    const/high16 v5, 0x41200000    # 10.0f

    const/4 v0, 0x0

    const/high16 v2, 0x447a0000    # 1000.0f

    const/4 v4, 0x1

    const/high16 v3, 0x44800000    # 1024.0f

    .line 2684
    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    move p0, v0

    .line 2687
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v1

    .line 2690
    cmpl-float v0, p0, v0

    if-nez v0, :cond_1

    .line 2691
    const-string/jumbo v0, "0MB"

    .line 2750
    :goto_0
    return-object v0

    .line 2692
    :cond_1
    cmpg-float v0, p0, v2

    if-gez v0, :cond_2

    .line 2694
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2695
    float-to-double v2, p0

    invoke-virtual {v1, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2696
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "B"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2697
    :cond_2
    cmpg-float v0, p0, v3

    if-gtz v0, :cond_3

    .line 2698
    div-float v0, p0, v3

    .line 2700
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2701
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "KB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2703
    :cond_3
    const/high16 v0, 0x49800000    # 1048576.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_6

    .line 2704
    div-float v0, p0, v3

    .line 2706
    cmpl-float v2, v0, v2

    if-ltz v2, :cond_4

    .line 2707
    div-float/2addr v0, v3

    .line 2708
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2709
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 2712
    :cond_4
    cmpl-float v2, v0, v5

    if-lez v2, :cond_5

    .line 2713
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2717
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "KB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 2715
    :cond_5
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_1

    .line 2719
    :cond_6
    const/high16 v0, 0x4e800000

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_9

    .line 2720
    div-float v0, p0, v3

    div-float/2addr v0, v3

    .line 2722
    cmpl-float v2, v0, v2

    if-ltz v2, :cond_7

    .line 2723
    div-float/2addr v0, v3

    .line 2724
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2725
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "GB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 2728
    :cond_7
    cmpl-float v2, v0, v5

    if-lez v2, :cond_8

    .line 2729
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2733
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "MB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 2731
    :cond_8
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_2

    .line 2736
    :cond_9
    div-float v0, p0, v3

    div-float/2addr v0, v3

    div-float/2addr v0, v3

    .line 2738
    cmpl-float v2, v0, v2

    if-ltz v2, :cond_a

    .line 2739
    div-float/2addr v0, v3

    .line 2740
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2741
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "TB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 2744
    :cond_a
    cmpl-float v2, v0, v5

    if-lez v2, :cond_b

    .line 2745
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2749
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    float-to-double v4, v0

    invoke-virtual {v1, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "GB"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 2747
    :cond_b
    invoke-virtual {v1, v4}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_3
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1039
    invoke-static {p0}, Lcom/qihoo360/common/utils/SecurityUtil;->getMD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1061
    invoke-static {p0, p1}, Lcom/qihoo360/common/utils/SecurityUtil;->DES_decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1026
    invoke-static {p0}, Lcom/qihoo360/common/utils/ByteConvertor;->bytesToHexString([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v13, 0x1

    const/4 v2, 0x0

    .line 1524
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1525
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_5

    .line 1527
    :try_start_0
    const-string/jumbo v0, "storage"

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 1528
    if-eqz v5, :cond_3

    .line 1529
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string/jumbo v3, "getVolumeList"

    const/4 v0, 0x0

    check-cast v0, [Ljava/lang/Class;

    invoke-virtual {v1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 1530
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string/jumbo v3, "getVolumeState"

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Class;

    const/4 v7, 0x0

    const-class v8, Ljava/lang/String;

    aput-object v8, v6, v7

    invoke-virtual {v0, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    .line 1531
    if-eqz v1, :cond_3

    .line 1532
    const/4 v0, 0x0

    check-cast v0, [Ljava/lang/Object;

    invoke-virtual {v1, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    .line 1533
    if-eqz v0, :cond_3

    array-length v1, v0

    if-lez v1, :cond_3

    .line 1534
    const/4 v1, 0x0

    aget-object v3, v0, v1

    .line 1535
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string/jumbo v8, "isEmulated"

    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Class;

    invoke-virtual {v7, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    .line 1536
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-string/jumbo v8, "getPath"

    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Class;

    invoke-virtual {v3, v8, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    .line 1537
    array-length v9, v0

    move v3, v2

    :goto_0
    if-ge v3, v9, :cond_1

    aget-object v10, v0, v3

    .line 1539
    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {v7, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1540
    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {v8, v10, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1541
    const-string/jumbo v10, "mounted"

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    aput-object v1, v11, v12

    invoke-virtual {v6, v5, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    .line 1542
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1537
    :cond_0
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    .line 1546
    :cond_1
    array-length v3, v0

    :goto_1
    if-ge v2, v3, :cond_3

    aget-object v9, v0, v2

    .line 1548
    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {v7, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1549
    const/4 v1, 0x0

    check-cast v1, [Ljava/lang/Object;

    invoke-virtual {v8, v9, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1550
    const-string/jumbo v9, "mounted"

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v1, v10, v11

    invoke-virtual {v6, v5, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1551
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_1

    .line 1546
    :cond_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 1558
    :catch_0
    move-exception v0

    .line 1559
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1563
    :cond_3
    :goto_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v0, v13, :cond_4

    .line 1564
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->a()Ljava/lang/String;

    move-result-object v0

    .line 1565
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 1567
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1608
    :cond_4
    :goto_3
    return-object v4

    .line 1560
    :catch_1
    move-exception v0

    .line 1561
    invoke-virtual {v0}, Ljava/lang/Error;->printStackTrace()V

    goto :goto_2

    .line 1572
    :cond_5
    :try_start_1
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->a()Ljava/lang/String;

    move-result-object v0

    .line 1573
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 1575
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1578
    :cond_6
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v2, Ljava/io/FileInputStream;

    new-instance v3, Ljava/io/File;

    const-string/jumbo v5, "/proc/mounts"

    invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1581
    :cond_7
    :goto_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 1582
    const-string/jumbo v2, "uid=1000"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string/jumbo v2, "gid=1015"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string/jumbo v2, "asec"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 1587
    const-string/jumbo v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    .line 1588
    array-length v2, v1

    const/4 v3, 0x4

    if-lt v2, v3, :cond_7

    .line 1589
    const/4 v2, 0x1

    aget-object v1, v1, v2

    .line 1591
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    .line 1592
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_4

    .line 1602
    :catch_2
    move-exception v0

    goto :goto_3

    .line 1599
    :cond_8
    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_3

    .line 1600
    :catch_3
    move-exception v0

    goto :goto_3
.end method

.method public static a(Landroid/app/Dialog;)V
    .locals 2

    .prologue
    .line 2392
    if-nez p0, :cond_1

    .line 2409
    :cond_0
    :goto_0
    return-void

    .line 2395
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2396
    if-eqz v0, :cond_2

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 2397
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2401
    :cond_2
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2402
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2404
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;II)V
    .locals 1

    .prologue
    .line 2477
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 2478
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class",
            "<*>;",
            "Ljava/lang/String;",
            "Landroid/content/ServiceConnection;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 649
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 650
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v0, p1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 651
    invoke-virtual {v0, v1, p3, p4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 657
    :goto_0
    return-void

    .line 652
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 103
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;Ljava/io/File;)V

    .line 104
    return-void
.end method

.method public static a(Landroid/database/Cursor;)V
    .locals 1

    .prologue
    .line 2147
    if-eqz p0, :cond_0

    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2148
    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2152
    :cond_0
    :goto_0
    return-void

    .line 2150
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Ljava/io/InputStream;Ljava/io/File;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 112
    const/4 v2, 0x0

    .line 114
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 115
    const/16 v0, 0x400

    :try_start_1
    new-array v0, v0, [B

    .line 117
    :goto_0
    invoke-virtual {p0, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_2

    .line 118
    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v2}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 122
    :catchall_0
    move-exception v0

    :goto_1
    if-eqz v1, :cond_0

    .line 124
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 131
    :cond_0
    :goto_2
    if-eqz p0, :cond_1

    .line 133
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 138
    :cond_1
    :goto_3
    throw v0

    .line 120
    :cond_2
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 122
    if-eqz v1, :cond_3

    .line 124
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 131
    :cond_3
    :goto_4
    if-eqz p0, :cond_4

    .line 133
    :try_start_6
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 141
    :cond_4
    :goto_5
    return-void

    .line 125
    :catch_0
    move-exception v0

    goto :goto_4

    .line 134
    :catch_1
    move-exception v0

    goto :goto_5

    .line 125
    :catch_2
    move-exception v1

    goto :goto_2

    .line 134
    :catch_3
    move-exception v1

    goto :goto_3

    .line 122
    :catchall_1
    move-exception v0

    move-object v1, v2

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V
    .locals 1

    .prologue
    .line 661
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 667
    :goto_0
    return-void

    .line 662
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(II)Z
    .locals 9

    .prologue
    .line 2990
    if-ge p1, p0, :cond_0

    .line 2994
    const/4 v0, 0x0

    .line 3009
    :goto_0
    return v0

    .line 2996
    :cond_0
    new-instance v8, Ljava/util/GregorianCalendar;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/Locale;)V

    .line 2998
    new-instance v0, Ljava/util/GregorianCalendar;

    const/4 v1, 0x1

    invoke-virtual {v8, v1}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v1

    const/4 v2, 0x2

    invoke-virtual {v8, v2}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    invoke-virtual {v8, v3}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p0

    invoke-direct/range {v0 .. v6}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 3000
    new-instance v1, Ljava/util/GregorianCalendar;

    const/4 v2, 0x1

    invoke-virtual {v8, v2}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {v8, v3}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v3

    const/4 v4, 0x5

    invoke-virtual {v8, v4}, Ljava/util/GregorianCalendar;->get(I)I

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p1

    invoke-direct/range {v1 .. v7}, Ljava/util/GregorianCalendar;-><init>(IIIIII)V

    .line 3002
    invoke-virtual {v8, v0}, Ljava/util/GregorianCalendar;->compareTo(Ljava/util/Calendar;)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-virtual {v8, v1}, Ljava/util/GregorianCalendar;->compareTo(Ljava/util/Calendar;)I

    move-result v0

    if-gtz v0, :cond_1

    .line 3006
    const/4 v0, 0x1

    goto :goto_0

    .line 3009
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 228
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 232
    :goto_0
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0

    .line 229
    :catch_0
    move-exception v1

    .line 230
    const/4 v1, 0x0

    goto :goto_0
.end method

.method private static a(I)[Ljava/lang/String;
    .locals 9

    .prologue
    const/high16 v5, 0x42700000    # 60.0f

    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 2947
    .line 2948
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 2949
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v4

    .line 2950
    if-gt p0, v8, :cond_0

    .line 2951
    const v2, 0x7f0c0038

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 2952
    int-to-float v0, p0

    move-object v3, v2

    move v2, v0

    move v0, v1

    .line 2967
    :goto_0
    const/4 v5, 0x0

    cmpl-float v5, v2, v5

    if-lez v5, :cond_3

    .line 2968
    invoke-virtual {v4, v8}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2972
    :goto_1
    int-to-float v0, v0

    add-float/2addr v0, v2

    .line 2973
    float-to-double v6, v0

    invoke-virtual {v4, v6, v7}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2974
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    .line 2975
    aput-object v0, v2, v1

    .line 2976
    aput-object v3, v2, v8

    .line 2977
    return-object v2

    .line 2953
    :cond_0
    const/16 v2, 0x3c

    if-ge p0, v2, :cond_1

    .line 2954
    const v2, 0x7f0c0039

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 2955
    int-to-float v0, p0

    move-object v3, v2

    move v2, v0

    move v0, v1

    goto :goto_0

    .line 2956
    :cond_1
    const/16 v2, 0x42

    if-ge p0, v2, :cond_2

    .line 2957
    const v2, 0x7f0c003a

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 2958
    div-int/lit8 v0, p0, 0x3c

    .line 2959
    rem-int/lit8 v2, p0, 0x3c

    .line 2960
    int-to-float v2, v2

    div-float/2addr v2, v5

    .line 2961
    goto :goto_0

    .line 2962
    :cond_2
    const v2, 0x7f0c003b

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 2963
    div-int/lit8 v0, p0, 0x3c

    .line 2964
    rem-int/lit8 v2, p0, 0x3c

    .line 2965
    int-to-float v2, v2

    div-float/2addr v2, v5

    goto :goto_0

    .line 2970
    :cond_3
    invoke-virtual {v4, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_1
.end method

.method public static a(IJJ)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 2887
    invoke-static {p0, p1, p2, p3, p4}, Lcom/qihoo360/mobilesafe/b/s;->b(IJJ)I

    move-result v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(I)[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b()I
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    .line 1681
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->c()J

    move-result-wide v0

    .line 1682
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v2

    .line 1684
    cmp-long v4, v0, v6

    if-lez v4, :cond_0

    cmp-long v4, v2, v6

    if-lez v4, :cond_0

    .line 1685
    sub-long v2, v0, v2

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    div-long v0, v2, v0

    long-to-int v0, v0

    .line 1687
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(IJJ)I
    .locals 7

    .prologue
    const-wide/16 v4, 0x0

    const/16 v3, 0x14

    const/4 v0, 0x3

    .line 2902
    .line 2905
    const/4 v1, 0x0

    .line 2906
    cmp-long v2, p1, v4

    if-lez v2, :cond_6

    cmp-long v2, p3, v4

    if-lez v2, :cond_6

    .line 2907
    long-to-float v1, p3

    long-to-float v2, p1

    div-float/2addr v1, v2

    move v2, v1

    .line 2911
    :goto_0
    if-ge p0, v3, :cond_0

    .line 2912
    const/16 v1, 0x3e8

    .line 2926
    :goto_1
    mul-int/2addr v1, p0

    int-to-float v1, v1

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    float-to-int v1, v1

    .line 2927
    if-ge p0, v3, :cond_5

    if-ge v1, v0, :cond_5

    .line 2934
    :goto_2
    return v0

    .line 2913
    :cond_0
    const/16 v1, 0x1e

    if-ge p0, v1, :cond_1

    .line 2914
    const/16 v1, 0x2bc

    goto :goto_1

    .line 2915
    :cond_1
    const/16 v1, 0x32

    if-ge p0, v1, :cond_2

    .line 2916
    const/16 v1, 0x1f4

    goto :goto_1

    .line 2917
    :cond_2
    const/16 v1, 0x46

    if-ge p0, v1, :cond_3

    .line 2918
    const/16 v1, 0x190

    goto :goto_1

    .line 2919
    :cond_3
    const/16 v1, 0x5a

    if-ge p0, v1, :cond_4

    .line 2920
    const/16 v1, 0x12c

    goto :goto_1

    .line 2922
    :cond_4
    const/16 v1, 0xc8

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    move v2, v1

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    .prologue
    .line 411
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 412
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 413
    invoke-static {p0, p1, v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V

    .line 416
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ".timestamp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 417
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 418
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    .line 419
    invoke-static {p0, v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 427
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 429
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/s;->f(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 430
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/s;->g(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    .line 432
    cmp-long v1, v2, v4

    if-ltz v1, :cond_2

    .line 436
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 448
    :cond_2
    :goto_1
    if-nez v0, :cond_3

    .line 452
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-result-object v0

    .line 464
    :cond_3
    :goto_2
    return-object v0

    .line 441
    :catch_0
    move-exception v1

    goto :goto_1

    .line 457
    :catch_1
    move-exception v1

    goto :goto_2

    .line 421
    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1065
    invoke-static {p0, p1}, Lcom/qihoo360/common/utils/SecurityUtil;->DES_encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/app/Activity;I)V
    .locals 0

    .prologue
    .line 2283
    if-nez p0, :cond_0

    .line 2291
    :goto_0
    return-void

    .line 2290
    :cond_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 1

    .prologue
    .line 2114
    const-string/jumbo v0, "connectivity"

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/s;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 2116
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b([B)[B
    .locals 1

    .prologue
    .line 1031
    invoke-static {p0}, Lcom/qihoo360/common/utils/SecurityUtil;->MD5([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static b(F)[Ljava/lang/String;
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/high16 v3, 0x447a0000    # 1000.0f

    const/high16 v4, 0x44800000    # 1024.0f

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 2761
    cmpg-float v1, p0, v0

    if-gez v1, :cond_0

    move p0, v0

    .line 2764
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v2

    .line 2766
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    .line 2767
    cmpl-float v0, p0, v0

    if-nez v0, :cond_1

    .line 2768
    const-string/jumbo v0, "0"

    aput-object v0, v1, v7

    .line 2769
    const-string/jumbo v0, "MB"

    aput-object v0, v1, v6

    :goto_0
    move-object v0, v1

    .line 2842
    :goto_1
    return-object v0

    .line 2770
    :cond_1
    cmpg-float v0, p0, v3

    if-gez v0, :cond_2

    .line 2772
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2773
    float-to-double v4, p0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2774
    aput-object v0, v1, v7

    .line 2775
    const-string/jumbo v0, "B"

    aput-object v0, v1, v6

    goto :goto_0

    .line 2776
    :cond_2
    cmpg-float v0, p0, v4

    if-gtz v0, :cond_3

    .line 2777
    div-float v0, p0, v4

    .line 2779
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2780
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2781
    aput-object v0, v1, v7

    .line 2782
    const-string/jumbo v0, "KB"

    aput-object v0, v1, v6

    goto :goto_0

    .line 2783
    :cond_3
    const/high16 v0, 0x49800000    # 1048576.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_6

    .line 2784
    div-float v0, p0, v4

    .line 2787
    cmpl-float v3, v0, v3

    if-ltz v3, :cond_4

    .line 2788
    div-float/2addr v0, v4

    .line 2789
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2790
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2791
    aput-object v0, v1, v7

    .line 2792
    const-string/jumbo v0, "MB"

    aput-object v0, v1, v6

    move-object v0, v1

    .line 2793
    goto :goto_1

    .line 2795
    :cond_4
    const/high16 v3, 0x41200000    # 10.0f

    cmpl-float v3, v0, v3

    if-lez v3, :cond_5

    .line 2796
    invoke-virtual {v2, v7}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2800
    :goto_2
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2801
    aput-object v0, v1, v7

    .line 2802
    const-string/jumbo v0, "KB"

    aput-object v0, v1, v6

    goto :goto_0

    .line 2798
    :cond_5
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_2

    .line 2803
    :cond_6
    const/high16 v0, 0x4e800000

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_9

    .line 2804
    div-float v0, p0, v4

    div-float/2addr v0, v4

    .line 2806
    cmpl-float v3, v0, v3

    if-ltz v3, :cond_7

    .line 2807
    div-float/2addr v0, v4

    .line 2808
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2809
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2810
    aput-object v0, v1, v7

    .line 2811
    const-string/jumbo v0, "GB"

    aput-object v0, v1, v6

    move-object v0, v1

    .line 2812
    goto/16 :goto_1

    .line 2814
    :cond_7
    const/high16 v3, 0x41200000    # 10.0f

    cmpl-float v3, v0, v3

    if-lez v3, :cond_8

    .line 2815
    invoke-virtual {v2, v7}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2819
    :goto_3
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2820
    aput-object v0, v1, v7

    .line 2821
    const-string/jumbo v0, "MB"

    aput-object v0, v1, v6

    goto/16 :goto_0

    .line 2817
    :cond_8
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_3

    .line 2823
    :cond_9
    div-float v0, p0, v4

    div-float/2addr v0, v4

    div-float/2addr v0, v4

    .line 2825
    cmpl-float v3, v0, v3

    if-ltz v3, :cond_a

    .line 2826
    div-float/2addr v0, v4

    .line 2827
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2828
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2829
    aput-object v0, v1, v7

    .line 2830
    const-string/jumbo v0, "TB"

    aput-object v0, v1, v6

    move-object v0, v1

    .line 2831
    goto/16 :goto_1

    .line 2833
    :cond_a
    const/high16 v3, 0x41200000    # 10.0f

    cmpl-float v3, v0, v3

    if-lez v3, :cond_b

    .line 2834
    invoke-virtual {v2, v7}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 2838
    :goto_4
    float-to-double v4, v0

    invoke-virtual {v2, v4, v5}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    .line 2839
    aput-object v0, v1, v7

    .line 2840
    const-string/jumbo v0, "GB"

    aput-object v0, v1, v6

    goto/16 :goto_0

    .line 2836
    :cond_b
    invoke-virtual {v2, v6}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    goto :goto_4
.end method

.method public static c()J
    .locals 6

    .prologue
    const/4 v3, 0x0

    .line 1716
    const-wide/16 v0, -0x1

    .line 1719
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/FileReader;

    const-string/jumbo v5, "/proc/meminfo"

    invoke-direct {v4, v5}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1722
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 1723
    const-string/jumbo v5, "MemTotal:"

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1724
    const-string/jumbo v3, " +"

    invoke-virtual {v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    .line 1729
    :cond_1
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    .line 1737
    if-eqz v2, :cond_2

    .line 1739
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1746
    :cond_2
    :goto_0
    return-wide v0

    .line 1732
    :catch_0
    move-exception v2

    move-object v2, v3

    .line 1737
    :goto_1
    if-eqz v2, :cond_2

    .line 1739
    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_0

    .line 1740
    :catch_1
    move-exception v2

    goto :goto_0

    .line 1737
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_2
    if-eqz v2, :cond_3

    .line 1739
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 1742
    :cond_3
    :goto_3
    throw v0

    .line 1740
    :catch_2
    move-exception v2

    goto :goto_0

    :catch_3
    move-exception v1

    goto :goto_3

    .line 1737
    :catchall_1
    move-exception v0

    goto :goto_2

    .line 1732
    :catch_4
    move-exception v3

    goto :goto_1
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 671
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static c([B)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1035
    invoke-static {p0}, Lcom/qihoo360/common/utils/SecurityUtil;->getMD5([B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d()J
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/4 v3, 0x0

    .line 1750
    const-wide/16 v0, -0x1

    .line 1753
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v4, Ljava/io/FileReader;

    const-string/jumbo v5, "/proc/meminfo"

    invoke-direct {v4, v5}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1755
    const/4 v4, 0x0

    move v6, v4

    move-object v5, v3

    move-object v4, v3

    .line 1756
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    .line 1757
    const-string/jumbo v8, "MemFree"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 1758
    add-int/lit8 v6, v6, 0x1

    .line 1759
    const-string/jumbo v3, " +"

    invoke-virtual {v7, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x1

    aget-object v3, v3, v7

    .line 1760
    if-lt v6, v9, :cond_0

    .line 1780
    :cond_1
    :goto_0
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-static {v5}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    add-long/2addr v6, v8

    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-wide v0

    add-long/2addr v0, v6

    .line 1788
    if-eqz v2, :cond_2

    .line 1790
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 1797
    :cond_2
    :goto_1
    return-wide v0

    .line 1763
    :cond_3
    :try_start_3
    const-string/jumbo v8, "Buffers"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 1764
    add-int/lit8 v6, v6, 0x1

    .line 1765
    const-string/jumbo v5, " +"

    invoke-virtual {v7, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x1

    aget-object v5, v5, v7

    .line 1766
    if-lt v6, v9, :cond_0

    goto :goto_0

    .line 1769
    :cond_4
    const-string/jumbo v8, "Cached"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 1770
    add-int/lit8 v6, v6, 0x1

    .line 1771
    const-string/jumbo v4, " +"

    invoke-virtual {v7, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x1

    aget-object v4, v4, v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1772
    if-lt v6, v9, :cond_0

    goto :goto_0

    .line 1783
    :catch_0
    move-exception v2

    move-object v2, v3

    .line 1788
    :goto_2
    if-eqz v2, :cond_2

    .line 1790
    :try_start_4
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    .line 1791
    :catch_1
    move-exception v2

    goto :goto_1

    .line 1788
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_5

    .line 1790
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 1793
    :cond_5
    :goto_4
    throw v0

    .line 1791
    :catch_2
    move-exception v2

    goto :goto_1

    :catch_3
    move-exception v1

    goto :goto_4

    .line 1788
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 1783
    :catch_4
    move-exception v3

    goto :goto_2
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 760
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 761
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "package:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 762
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 763
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 774
    :goto_0
    return-void

    .line 765
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 766
    const-string/jumbo v1, "com.android.settings"

    const-string/jumbo v2, "com.android.settings.InstalledAppDetails"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 767
    const-string/jumbo v1, "com.android.settings.ApplicationPkgName"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 768
    const-string/jumbo v1, "pkg"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 769
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 771
    :catch_0
    move-exception v0

    .line 772
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public static e()I
    .locals 4

    .prologue
    .line 1820
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/s;->d()J

    move-result-wide v0

    .line 1821
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    .line 1822
    const/4 v0, -0x1

    .line 1825
    :goto_0
    return v0

    :cond_0
    long-to-float v0, v0

    const/high16 v1, 0x44800000    # 1024.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    goto :goto_0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)J
    .locals 4

    .prologue
    .line 1291
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/s;->f(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v0

    .line 1292
    invoke-static {p0, p1}, Lcom/qihoo360/mobilesafe/b/s;->g(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    .line 1294
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)J
    .locals 3

    .prologue
    .line 2555
    const/4 v0, 0x0

    .line 2557
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ".timestamp"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2561
    :goto_0
    if-eqz v0, :cond_0

    .line 2562
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;)J

    move-result-wide v0

    .line 2564
    :goto_1
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_1

    .line 2558
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static g(Landroid/content/Context;Ljava/lang/String;)J
    .locals 4

    .prologue
    .line 2595
    const/4 v0, 0x0

    .line 2597
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, ".timestamp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 2601
    :goto_0
    if-eqz v0, :cond_0

    .line 2602
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;)J

    move-result-wide v0

    .line 2604
    :goto_1
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_1

    .line 2598
    :catch_0
    move-exception v1

    goto :goto_0
.end method
