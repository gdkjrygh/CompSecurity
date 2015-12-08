.class public Lcom/immersion/hapticmediasdk/utils/FileManager;
.super Ljava/lang/Object;


# static fields
.field public static final HAPTIC_STORAGE_FILENAME:Ljava/lang/String; = "dat.hapt"

.field public static final TAG:Ljava/lang/String; = "FileManager"

.field public static b0427042704270427Ч0427:I = 0x4b

.field public static b0427Ч04270427Ч0427:I = 0x1

.field public static bЧ042704270427Ч0427:I = 0x2

.field public static bЧЧЧЧ04270427:I


# instance fields
.field a:Landroid/content/Context;

.field private b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :goto_0
    goto/32 :goto_0
.end method

.method public static b0427ЧЧЧ04270427()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static bЧ0427ЧЧ04270427()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bЧЧ04270427Ч0427()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method


# virtual methods
.method public closeCloseable(Ljava/io/Closeable;)V
    .locals 2

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v0

    sget v1, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ0427ЧЧ04270427()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    :cond_0
    if-eqz p1, :cond_1

    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v0

    throw v0
.end method

.method public deleteHapticStorage()V
    .locals 7

    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getInternalHapticPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v0

    sget v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v2, v0

    mul-int/2addr v0, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v0, v2

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x3f

    sput v0, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    :pswitch_0
    :try_start_1
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->b:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "dat.hapt"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result v4

    if-eqz v4, :cond_0

    :try_start_4
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getHapticStorageFile(Ljava/lang/String;)Ljava/io/File;
    .locals 6

    :try_start_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getUniqueFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "dat.hapt"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    sget v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    sget v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v4, v5

    sget v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    mul-int/2addr v4, v5

    sget v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v4, v5

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427ЧЧЧ04270427()I

    move-result v5

    if-eq v4, v5, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v4

    sput v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v4

    sput v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    :cond_0
    :try_start_3
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public getInternalHapticPath()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v1

    sget v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/16 v1, 0x41

    sput v1, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    :pswitch_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getUniqueFileName(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V

    const-string v1, "%032x_%d"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    new-instance v4, Ljava/math/BigInteger;

    const/4 v5, 0x1

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-direct {v4, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V

    aput-object v4, v2, v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    sget v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    sget v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    mul-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v3, v4

    sget v4, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    if-eq v3, v4, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v3

    sput v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    const/16 v3, 0x3b

    sput v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    :cond_0
    :try_start_1
    iget v3, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public makeOutputStream(Ljava/lang/String;)Ljava/io/BufferedOutputStream;
    .locals 7

    const/4 v0, 0x0

    const/16 v1, 0x400

    new-array v3, v1, [B

    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    sget v6, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v6, v5

    mul-int/2addr v5, v6

    sget v6, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v5, v6

    packed-switch v5, :pswitch_data_0

    const/16 v5, 0x49

    sput v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v5

    sput v5, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    :pswitch_0
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getUniqueFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "dat.hapt"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->a:Landroid/content/Context;

    const/4 v5, 0x0

    invoke-virtual {v2, v1, v5}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v2

    :try_start_2
    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v1

    :goto_0
    if-lez v1, :cond_0

    invoke-virtual {v4, v3}, Ljava/io/FileInputStream;->read([B)I

    move-result v1

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v1}, Ljava/io/FileOutputStream;->write([BII)V

    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :goto_1
    if-eqz v2, :cond_1

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    :cond_1
    return-object v0

    :catch_0
    move-exception v1

    move-object v2, v0

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public makeOutputStreamForStreaming(Ljava/lang/String;)Ljava/io/BufferedOutputStream;
    .locals 4

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getUniqueFileName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "dat.hapt"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    :try_start_1
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/utils/FileManager;->a:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v1

    :try_start_2
    new-instance v0, Ljava/io/BufferedOutputStream;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    sget v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    sget v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427Ч04270427Ч0427:I

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧ042704270427Ч0427:I

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    if-eq v2, v3, :cond_0

    const/16 v2, 0x17

    sput v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->b0427042704270427Ч0427:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧ04270427Ч0427()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/utils/FileManager;->bЧЧЧЧ04270427:I

    :cond_0
    :try_start_3
    invoke-direct {v0, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const/4 v0, 0x0

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v0

    throw v0
.end method
