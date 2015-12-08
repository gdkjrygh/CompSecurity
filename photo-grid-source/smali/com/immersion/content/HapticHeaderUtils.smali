.class public Lcom/immersion/content/HapticHeaderUtils;
.super Lcom/immersion/content/HeaderUtils;


# static fields
.field private static final b:Ljava/lang/String; = "HapticHeaderUtils"

.field public static b042104210421С04210421:I = 0x21

.field public static b04210421С042104210421:I = 0x0

.field public static b0421СС042104210421:I = 0x2

.field public static bССС042104210421:I = 0x1


# instance fields
.field a:J

.field private c:[B

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->bССС042104210421:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2b

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->bССС042104210421:I

    :pswitch_0
    :try_start_0
    invoke-direct {p0}, Lcom/immersion/content/HeaderUtils;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b0421С0421042104210421()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bС0421С042104210421()I
    .locals 1

    const/16 v0, 0x50

    return v0
.end method

.method public static bСС0421042104210421()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method private native calculateBlockRateNative(J)I
.end method

.method private native calculateBlockSizeNative(J)I
.end method

.method private native calculateByteOffsetIntoHapticDataNative(JI)I
.end method

.method private native disposeNative(J)V
.end method

.method private native getContentIdNative(J)Ljava/lang/String;
.end method

.method private native getEncryptionNative(J)I
.end method

.method private native getMajorVersionNumberNative(J)I
.end method

.method private native getMinorVersionNumberNative(J)I
.end method

.method private native getNumChannelsNative(J)I
.end method

.method private native init([BI)J
.end method


# virtual methods
.method public calculateBlockRate()I
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->b0421С0421042104210421()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bСС0421042104210421()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    const/16 v0, 0xc

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->calculateBlockRateNative(J)I

    move-result v0

    return v0
.end method

.method public calculateBlockSize()I
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->bССС042104210421:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    const/16 v0, 0x54

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->calculateBlockSizeNative(J)I

    move-result v0

    return v0
.end method

.method public calculateByteOffsetIntoHapticData(I)I
    .locals 4

    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v2

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->bССС042104210421:I

    add-int/2addr v3, v2

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v2, v3

    packed-switch v2, :pswitch_data_0

    const/16 v2, 0x59

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v2

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :pswitch_0
    invoke-direct {p0, v0, v1, p1}, Lcom/immersion/content/HapticHeaderUtils;->calculateByteOffsetIntoHapticDataNative(JI)I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public dispose()V
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->b0421С0421042104210421()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    const/16 v0, 0x5c

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->disposeNative(J)V

    return-void
.end method

.method public getContentUUID()Ljava/lang/String;
    .locals 4

    :try_start_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v2, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->b0421С0421042104210421()I

    move-result v3

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v2, v3

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bСС0421042104210421()I

    move-result v3

    if-eq v2, v3, :cond_0

    const/16 v2, 0x2e

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    const/16 v2, 0x2b

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    :try_start_1
    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->getContentIdNative(J)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public getEncryption()I
    .locals 4

    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    sget v2, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->bССС042104210421:I

    add-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v2, v3

    sget v3, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    if-eq v2, v3, :cond_0

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v2

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v2

    sput v2, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->getEncryptionNative(J)I

    move-result v0

    return v0
.end method

.method public getMajorVersionNumber()I
    .locals 2

    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->getMajorVersionNumberNative(J)I

    move-result v0

    return v0
.end method

.method public getMinorVersionNumber()I
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->b0421С0421042104210421()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    :try_start_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->getMinorVersionNumberNative(J)I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    return v0

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method public getNumChannels()I
    .locals 2

    sget v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->b0421С0421042104210421()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b0421СС042104210421:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x5c

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b042104210421С04210421:I

    invoke-static {}, Lcom/immersion/content/HapticHeaderUtils;->bС0421С042104210421()I

    move-result v0

    sput v0, Lcom/immersion/content/HapticHeaderUtils;->b04210421С042104210421:I

    :cond_0
    :try_start_0
    iget-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->getNumChannelsNative(J)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public setEncryptedHSI(Ljava/nio/ByteBuffer;I)V
    .locals 3

    iput p2, p0, Lcom/immersion/content/HapticHeaderUtils;->d:I

    iget v0, p0, Lcom/immersion/content/HapticHeaderUtils;->d:I

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/immersion/content/HapticHeaderUtils;->c:[B

    iget-object v0, p0, Lcom/immersion/content/HapticHeaderUtils;->c:[B

    const/4 v1, 0x0

    iget v2, p0, Lcom/immersion/content/HapticHeaderUtils;->d:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v0, p0, Lcom/immersion/content/HapticHeaderUtils;->c:[B

    iget v1, p0, Lcom/immersion/content/HapticHeaderUtils;->d:I

    invoke-direct {p0, v0, v1}, Lcom/immersion/content/HapticHeaderUtils;->init([BI)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/immersion/content/HapticHeaderUtils;->a:J

    return-void
.end method
