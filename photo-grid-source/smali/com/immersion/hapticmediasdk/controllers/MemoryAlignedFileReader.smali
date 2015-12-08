.class public Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;


# static fields
.field private static final a:Ljava/lang/String; = "MemoryAlignedFileReader"

.field public static b0415ЕЕ0415ЕЕ:I = 0xa

.field public static bЕ041504150415ЕЕ:I = 0x1

.field public static bЕ0415Е0415ЕЕ:I = 0x0

.field public static bЕЕ04150415ЕЕ:I = 0x2

.field private static h:I = 0x0

.field private static i:I = 0x0

.field private static final k:I = 0x400

.field private static final l:I = 0xc00

.field private static final t:I = 0x10


# instance fields
.field private b:Ljava/io/File;

.field private c:Ljava/nio/channels/FileChannel;

.field private d:Lrrrrrr/rcrcrr;

.field private e:Lrrrrrr/rcrcrr;

.field private f:I

.field private g:I

.field private j:Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

.field private m:Ljava/lang/String;

.field private n:Lcom/immersion/hapticmediasdk/utils/FileManager;

.field private o:Lcom/immersion/content/HeaderUtils;

.field private p:[B

.field private final q:Lcom/immersion/hapticmediasdk/utils/Profiler;

.field private r:I

.field private s:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x50

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I

    const/4 v0, 0x0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/immersion/content/HeaderUtils;)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->p:[B

    new-instance v0, Lcom/immersion/hapticmediasdk/utils/Profiler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-direct {v0}, Lcom/immersion/hapticmediasdk/utils/Profiler;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->q:Lcom/immersion/hapticmediasdk/utils/Profiler;

    iput-object p1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v0, 0x5c

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    :try_start_2
    iput-object p2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/immersion/hapticmediasdk/utils/FileManager;I)V
    .locals 2

    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b04150415Е0415ЕЕ()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    iput v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->p:[B

    new-instance v0, Lcom/immersion/hapticmediasdk/utils/Profiler;

    invoke-direct {v0}, Lcom/immersion/hapticmediasdk/utils/Profiler;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->q:Lcom/immersion/hapticmediasdk/utils/Profiler;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iput-object p1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    iput-object p2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    new-instance v0, Lcom/immersion/content/HapticHeaderUtils;

    invoke-direct {v0}, Lcom/immersion/content/HapticHeaderUtils;-><init>()V

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    iput p3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private a(Lrrrrrr/rcrcrr;I)I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :try_start_0
    iget v0, p1, Lrrrrrr/rcrcrr;->mHapticDataOffset:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-int v0, p2, v0

    :try_start_1
    iget-object v1, p1, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v1}, Ljava/nio/MappedByteBuffer;->capacity()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v1

    :try_start_2
    rem-int/2addr v0, v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private a()Z
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->j:Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b:Ljava/io/File;

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/immersion/hapticmediasdk/utils/FileManager;->getHapticStorageFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iput-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b:Ljava/io/File;

    :cond_2
    :goto_1
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    if-nez v2, :cond_3

    new-instance v2, Ljava/io/RandomAccessFile;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b:Ljava/io/File;

    const-string v4, "r"

    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object v1, v2

    :cond_3
    :try_start_2
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v2, :cond_4

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v1, 0x60

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_2
    :try_start_3
    const-string v2, "MemoryAlignedFileReader"

    const-string v3, "FileNotFoundException"

    invoke-static {v2, v3}, Lcom/immersion/hapticmediasdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    invoke-virtual {v2, v1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :try_start_4
    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    invoke-virtual {v1, v2}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    throw v0

    :catch_2
    move-exception v1

    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    :cond_4
    :try_start_6
    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b()Z

    move-result v0

    goto :goto_0

    :cond_5
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->m:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b:Ljava/io/File;
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_1

    :catch_3
    move-exception v0

    throw v0

    :catch_4
    move-exception v1

    move-object v1, v2

    goto :goto_2
.end method

.method private a(I)Z
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b04150415Е0415ЕЕ()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x1f

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v0, 0x11

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :try_start_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->g:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lt v0, p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0
.end method

.method private b(I)I
    .locals 2

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    if-eqz v0, :cond_0

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x35

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v0, 0x55

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v0, p1}, Lcom/immersion/content/HeaderUtils;->calculateByteOffsetIntoHapticData(I)I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private b()Z
    .locals 7

    const/4 v4, 0x4

    const/4 v6, 0x0

    const/4 v0, 0x4

    :try_start_0
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    const-wide/16 v2, 0x10

    invoke-virtual {v1, v0, v2, v3}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I

    move-result v1

    if-eq v1, v4, :cond_2

    :cond_0
    :goto_0
    return v6

    :cond_1
    const/4 v3, 0x4

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    add-int/lit8 v3, v3, 0x8

    sub-int/2addr v3, v1

    iput v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I

    iput v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->s:I

    const/16 v1, 0x14

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->p:[B

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->p:[B

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v1, v2, v0}, Lcom/immersion/content/HeaderUtils;->setEncryptedHSI(Ljava/nio/ByteBuffer;I)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v0}, Lcom/immersion/content/HeaderUtils;->calculateBlockSize()I

    move-result v0

    if-lez v0, :cond_0

    mul-int/lit8 v0, v0, 0x2

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v0}, Lcom/immersion/content/HeaderUtils;->calculateBlockRate()I

    move-result v0

    if-lez v0, :cond_0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I

    :goto_1
    goto/32 :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    add-int/lit8 v1, v0, 0x1c

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v2, v4, v5}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;J)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eq v3, v1, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0
.end method

.method private static b(Lrrrrrr/rcrcrr;I)Z
    .locals 3

    iget v0, p0, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    if-ge p1, v0, :cond_1

    const/4 v0, 0x1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е0415Е0415Е()I

    move-result v2

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x16

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b04150415Е0415ЕЕ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static b0415Е04150415ЕЕ()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method public static b0415Е0415Е0415Е()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bЕ04150415Е0415Е()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private c(I)I
    .locals 2

    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->s:I

    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    if-nez v0, :cond_0

    :goto_0
    goto/32 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget v0, v0, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    add-int/lit16 v0, v0, 0x400

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iput-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    div-int/lit8 v1, v1, 0x2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    sub-int/2addr v0, v1

    :try_start_2
    invoke-direct {p0, v0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d(I)Lrrrrrr/rcrcrr;

    move-result-object v0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private static c(Lrrrrrr/rcrcrr;I)Z
    .locals 3

    :try_start_0
    iget v0, p0, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    iget-object v1, p0, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v1}, Ljava/nio/MappedByteBuffer;->capacity()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    add-int/2addr v0, v1

    if-lt p1, v0, :cond_1

    const/4 v0, 0x1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ04150415Е0415Е()I

    move-result v2

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0
.end method

.method private d()I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v0}, Lcom/immersion/content/HeaderUtils;->getNumChannels()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v1

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private d(I)Lrrrrrr/rcrcrr;
    .locals 7

    const/4 v6, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->q:Lcom/immersion/hapticmediasdk/utils/Profiler;

    invoke-virtual {v0}, Lcom/immersion/hapticmediasdk/utils/Profiler;->startTiming()V

    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I

    if-ge p1, v0, :cond_3

    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->s:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int v2, v0, p1

    :try_start_1
    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    add-int/lit16 v1, p1, 0x400

    add-int/2addr v1, v0

    :try_start_2
    iget v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-gt v1, v3, :cond_1

    add-int/lit16 v0, v0, 0x400

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v1, v3, :cond_0

    const/16 v1, 0x1f

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v1, 0x45

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    move v4, v0

    :goto_0
    add-int v0, p1, v4

    :try_start_3
    iget v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->g:I

    if-le v0, v1, :cond_2

    new-instance v0, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;

    const-string v1, "Not enough bytes available yet."

    invoke-direct {v0, v1}, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    throw v0

    :cond_1
    :try_start_4
    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    sub-int/2addr v0, p1

    move v4, v0

    goto :goto_0

    :cond_2
    :try_start_5
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    sget-object v1, Ljava/nio/channels/FileChannel$MapMode;->READ_ONLY:Ljava/nio/channels/FileChannel$MapMode;

    int-to-long v2, v2

    int-to-long v4, v4

    invoke-virtual/range {v0 .. v5}, Ljava/nio/channels/FileChannel;->map(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result-object v1

    if-eqz v1, :cond_3

    :try_start_6
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v0}, Ljava/nio/MappedByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    new-instance v0, Lrrrrrr/rcrcrr;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lrrrrrr/rcrcrr;-><init>(Lrrrrrr/crrcrr;)V

    iput-object v1, v0, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    iput p1, v0, Lrrrrrr/rcrcrr;->mHapticDataOffset:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    :goto_1
    return-object v0

    :catch_1
    move-exception v0

    throw v0

    :cond_3
    move-object v0, v6

    goto :goto_1
.end method

.method private static d(Lrrrrrr/rcrcrr;I)Z
    .locals 2

    invoke-static {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b(Lrrrrrr/rcrcrr;I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c(Lrrrrrr/rcrcrr;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v0, 0x18

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private e()V
    .locals 4

    const-string v0, "MemoryAlignedFileReader"

    const-string v1, "%%%%%%%%%%% logBufferState %%%%%%%%%%%"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    if-eqz v0, :cond_1

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mCurrentMMW capacity = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->capacity()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mCurrentMMW position = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mCurrentMMW remaining = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mCurrentMMW mHapticDataOffset = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget v2, v2, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mCurrentMMW mHapticDataOffset + position = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget v2, v2, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v3, v3, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v3}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v0, "MemoryAlignedFileReader"

    const-string v1, "--------------------------------------"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    if-eqz v0, :cond_2

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mNextMMW capacity = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->capacity()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mNextMMW position = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "mNextMMW remaining = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mNextMMW mHapticDataOffset = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget v2, v2, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "MemoryAlignedFileReader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "mNextMMW mHapticDataOffset + position = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b04150415Е0415ЕЕ()I

    move-result v3

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v2, v3, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget v2, v2, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget-object v3, v3, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v3}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v3

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    const-string v0, "MemoryAlignedFileReader"

    const-string v1, "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const-string v0, "MemoryAlignedFileReader"

    const-string v1, "mCurrentMMW is null"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_2
    const-string v0, "MemoryAlignedFileReader"

    const-string v1, "mNextMMW is null"

    invoke-static {v0, v1}, Lcom/immersion/hapticmediasdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1
.end method

.method private static e(Lrrrrrr/rcrcrr;I)Z
    .locals 3

    :try_start_0
    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v2, v1

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    const/4 v1, 0x4

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v1, 0x3e

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    add-int/2addr v0, p1

    :try_start_1
    invoke-static {p0, v0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c(Lrrrrrr/rcrcrr;I)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private f()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    add-int/lit16 v1, v0, 0x400

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    div-int/lit8 v2, v2, 0x2

    rem-int/2addr v1, v2

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x10

    goto :goto_0

    :cond_0
    return v0
.end method


# virtual methods
.method public bufferAtPlaybackPosition(I)Z
    .locals 7

    const/4 v1, 0x1

    const/4 v0, 0x0

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->a()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b(I)I

    move-result v2

    iget v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    invoke-static {v3, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d(Lrrrrrr/rcrcrr;I)Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_2
    :try_start_0
    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    invoke-static {v3, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d(Lrrrrrr/rcrcrr;I)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    invoke-static {v3, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e(Lrrrrrr/rcrcrr;I)Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_3
    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget v3, v3, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    if-eq v3, v2, :cond_5

    :cond_4
    invoke-direct {p0, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d(I)Lrrrrrr/rcrcrr;

    move-result-object v3

    iput-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    :cond_5
    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    if-eqz v3, :cond_7

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    iget v3, v3, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    add-int/lit16 v4, v2, 0x400

    sget v5, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    div-int/lit8 v5, v5, 0x2
    :try_end_0
    .catch Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v4, v5

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v5

    sget v6, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v5, v6

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v6

    mul-int/2addr v5, v6

    sget v6, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v5, v6

    sget v6, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v5, v6, :cond_6

    const/16 v5, 0x62

    sput v5, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v5, 0x49

    sput v5, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_6
    if-eq v3, v4, :cond_8

    :cond_7
    add-int/lit16 v2, v2, 0x400

    :try_start_1
    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-direct {p0, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d(I)Lrrrrrr/rcrcrr;

    move-result-object v2

    iput-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->e:Lrrrrrr/rcrcrr;

    :cond_8
    move v0, v1

    goto :goto_0

    :cond_9
    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c()V
    :try_end_1
    .catch Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_a
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v0, v0, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    invoke-direct {p0, v3, v2}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->a(Lrrrrrr/rcrcrr;I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_b
    move v0, v1

    goto/16 :goto_0

    :catch_0
    move-exception v1

    goto/16 :goto_0

    :catch_1
    move-exception v1

    goto/16 :goto_0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->n:Lcom/immersion/hapticmediasdk/utils/FileManager;

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c:Ljava/nio/channels/FileChannel;

    invoke-virtual {v0, v1}, Lcom/immersion/hapticmediasdk/utils/FileManager;->closeCloseable(Ljava/io/Closeable;)V

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->o:Lcom/immersion/content/HeaderUtils;

    invoke-virtual {v0}, Lcom/immersion/content/HeaderUtils;->dispose()V

    return-void
.end method

.method public getBlockOffset(J)J
    .locals 5

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I

    int-to-long v0, v0

    rem-long v0, p1, v0

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v2, 0x28

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    const-wide/16 v2, 0x10

    mul-long/2addr v0, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getBlockSizeMS()I
    .locals 3

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x39

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    const/16 v1, 0x5e

    sput v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    return v0
.end method

.method public getBufferForPlaybackPosition(I)[B
    .locals 6

    const/4 v2, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b(I)I

    move-result v3

    iget v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->r:I

    sget v4, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    sub-int/2addr v1, v4

    if-ge v3, v1, :cond_0

    :try_start_0
    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    new-array v1, v1, [B

    iget-object v4, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v4, v4, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v4}, Ljava/nio/MappedByteBuffer;->remaining()I

    move-result v4

    sget v5, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    if-ge v4, v5, :cond_2

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->c()V

    :cond_2
    iget-object v4, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v4, v4, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v4}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v4

    iget-object v5, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget v5, v5, Lrrrrrr/rcrcrr;->mHapticDataOffset:I

    add-int/2addr v4, v5

    if-lt v4, v3, :cond_3

    if-le v4, v3, :cond_4

    :cond_3
    sub-int/2addr v3, v4

    iget-object v4, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v4, v4, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v4}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v4

    add-int/2addr v3, v4

    if-gez v3, :cond_6

    :goto_1
    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v3, v3, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_4
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->remaining()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    sget v4, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ041504150415ЕЕ:I

    add-int/2addr v4, v3

    mul-int/2addr v3, v4

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е0415Е0415Е()I

    move-result v4

    rem-int/2addr v3, v4

    packed-switch v3, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v3

    sput v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v3

    sput v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    :try_start_1
    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v3, v3, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    const/4 v4, 0x0

    sget v5, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    if-ge v2, v5, :cond_5

    :goto_2
    invoke-virtual {v3, v1, v4, v2}, Ljava/nio/MappedByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    iget-object v3, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v3, v3, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v3}, Ljava/nio/MappedByteBuffer;->position()I

    move-result v3

    sget v4, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    div-int/lit8 v4, v4, 0x2

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/nio/MappedByteBuffer;->position(I)Ljava/nio/Buffer;

    move-object v0, v1

    goto/16 :goto_0

    :cond_5
    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->i:I

    goto :goto_2

    :cond_6
    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->limit()I

    move-result v2

    if-ge v2, v3, :cond_7

    iget-object v2, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d:Lrrrrrr/rcrcrr;

    iget-object v2, v2, Lrrrrrr/rcrcrr;->mMappedByteBuffer:Ljava/nio/MappedByteBuffer;

    invoke-virtual {v2}, Ljava/nio/MappedByteBuffer;->limit()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v2

    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    :cond_7
    move v2, v3

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getEncryptedHapticHeader()[B
    .locals 1

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->p:[B

    return-object v0
.end method

.method public getHapticBlockIndex(J)I
    .locals 5

    const/4 v4, 0x2

    long-to-int v0, p1

    :try_start_0
    invoke-direct {p0, v0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b(I)I

    move-result v0

    iget v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b04150415Е0415ЕЕ()I

    move-result v3

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    if-eq v2, v3, :cond_0

    sput v4, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v2

    sput v2, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :cond_0
    if-ne v1, v4, :cond_1

    :try_start_1
    div-int/lit8 v0, v0, 0x10

    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->f:I

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->d()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result v1

    mul-int/lit8 v1, v1, 0x10

    :try_start_2
    div-int/2addr v0, v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public getHapticFileInformation()Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
    .locals 1

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->j:Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

    return-object v0
.end method

.method public setBlockSizeMS(I)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b04150415Е0415ЕЕ()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕЕ04150415ЕЕ:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415ЕЕ0415ЕЕ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->b0415Е04150415ЕЕ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->bЕ0415Е0415ЕЕ:I

    :pswitch_0
    :try_start_0
    sput p1, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public setBytesAvailable(I)V
    .locals 1

    iput p1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->g:I

    iget v0, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->g:I

    if-gtz v0, :cond_0

    iput p1, p0, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->g:I

    invoke-direct {p0}, Lcom/immersion/hapticmediasdk/controllers/MemoryAlignedFileReader;->a()Z

    :cond_0
    return-void
.end method
