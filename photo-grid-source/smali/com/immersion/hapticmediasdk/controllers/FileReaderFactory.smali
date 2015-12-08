.class public Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "FileReaderFactory"

.field public static b044604460446ц0446ц:I = 0x2

.field public static b0446ц044604460446ц:I = 0x0

.field public static b0446ц0446ц0446ц:I = 0x48

.field public static bц0446ц04460446ц:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bц04460446ц0446ц()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b044604460446ц0446ц:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b044604460446ц0446ц:I

    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private static a(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    :try_start_0
    invoke-virtual {p1, p0}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getHapticStorageFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_2

    const/4 v0, -0x1

    :cond_0
    :goto_1
    return v0

    :cond_1
    if-eqz p0, :cond_0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    throw v0

    :cond_2
    :try_start_2
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v3, "r"

    invoke-direct {v2, v1, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->a(Ljava/nio/channels/FileChannel;)I

    move-result v0

    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    const/4 v1, 0x0

    :try_start_3
    invoke-virtual {v1}, Ljava/lang/String;->length()I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_2

    :catch_2
    move-exception v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    goto :goto_1
.end method

.method private static a(Ljava/nio/channels/FileChannel;)I
    .locals 6

    const/4 v4, 0x4

    const/4 v0, 0x0

    const/4 v1, 0x4

    :try_start_0
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bц04460446ц0446ц()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v3

    mul-int/2addr v2, v3

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bц0446044604460446ц()I

    move-result v3

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц044604460446ц:I

    if-eq v2, v3, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    const/16 v2, 0x5d

    sput v2, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц044604460446ц:I

    :cond_0
    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const-wide/16 v2, 0x10

    invoke-virtual {p0, v1, v2, v3}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result v2

    if-eq v2, v4, :cond_2

    :goto_0
    return v0

    :cond_1
    const/4 v2, 0x4

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->getInt()I

    const/16 v2, 0x14

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-instance v2, Lcom/immersion/content/HapticHeaderUtils;

    invoke-direct {v2}, Lcom/immersion/content/HapticHeaderUtils;-><init>()V

    invoke-virtual {v2, v3, v1}, Lcom/immersion/content/HeaderUtils;->setEncryptedHSI(Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v2}, Lcom/immersion/content/HeaderUtils;->getMajorVersionNumber()I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    :cond_2
    :try_start_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    add-int/lit8 v2, v1, 0x1c

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    sget-object v4, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v3, v4, v5}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-result v4

    if-eq v4, v2, :cond_1

    goto :goto_0
.end method

.method public static b0446цц04460446ц()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static bц0446044604460446ц()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bц04460446ц0446ц()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bццц04460446ц()I
    .locals 1

    const/16 v0, 0x2f

    return v0
.end method

.method public static getHapticFileReaderInstance(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;)Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->a(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    const-string v1, "FileReaderFactory"

    const-string v2, "Unsupported HAPT file version"

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-object v0

    :pswitch_1
    const-string v1, "FileReaderFactory"

    const-string v2, "Can\'t retrieve Major version! Not enough bytes available yet."

    invoke-static {v1, v2}, Lcom/immersion/hapticmediasdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Error;->printStackTrace()V

    sget v1, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bц0446ц04460446ц:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b044604460446ц0446ц:I

    rem-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446цц04460446ц()I

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->b0446ц0446ц0446ц:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bццц04460446ц()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/FileReaderFactory;->bц0446ц04460446ц:I

    goto :goto_0

    :pswitch_2
    :try_start_1
    new-instance v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;

    const/4 v2, 0x2

    invoke-direct {v1, p0, p1, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;-><init>(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;I)V

    move-object v0, v1

    goto :goto_0

    :pswitch_3
    new-instance v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;

    const/4 v2, 0x3

    invoke-direct {v1, p0, p1, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;-><init>(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;I)V

    move-object v0, v1

    goto :goto_0

    :pswitch_4
    new-instance v1, Lcom/immersion/hapticmediasdk/controllers/MemoryMappedFileReader;

    invoke-direct {v1, p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryMappedFileReader;-><init>(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;)V
    :try_end_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
