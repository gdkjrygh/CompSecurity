.class final Lcom/b/a/c/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/atomic/AtomicLong;

.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/b/a/c/c;->a:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method public constructor <init>(La/a/a/a/a/b/x;)V
    .locals 13

    .prologue
    const/4 v12, 0x4

    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v9, 0x1

    const/4 v8, 0x0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const/16 v0, 0xa

    new-array v0, v0, [B

    .line 1050
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 1051
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 1052
    const-wide/16 v4, 0x3e8

    div-long v4, v2, v4

    .line 1053
    const-wide/16 v6, 0x3e8

    rem-long/2addr v2, v6

    .line 1079
    invoke-static {v12}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 1080
    long-to-int v4, v4

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 1081
    sget-object v4, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 1082
    invoke-virtual {v1, v8}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 1084
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    .line 1055
    aget-byte v4, v1, v8

    aput-byte v4, v0, v8

    .line 1056
    aget-byte v4, v1, v9

    aput-byte v4, v0, v9

    .line 1057
    aget-byte v4, v1, v10

    aput-byte v4, v0, v10

    .line 1058
    aget-byte v1, v1, v11

    aput-byte v1, v0, v11

    .line 1060
    invoke-static {v2, v3}, Lcom/b/a/c/c;->a(J)[B

    move-result-object v1

    .line 1061
    aget-byte v2, v1, v8

    aput-byte v2, v0, v12

    .line 1062
    const/4 v2, 0x5

    aget-byte v1, v1, v9

    aput-byte v1, v0, v2

    .line 2066
    sget-object v1, Lcom/b/a/c/c;->a:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/b/a/c/c;->a(J)[B

    move-result-object v1

    .line 2067
    const/4 v2, 0x6

    aget-byte v3, v1, v8

    aput-byte v3, v0, v2

    .line 2068
    const/4 v2, 0x7

    aget-byte v1, v1, v9

    aput-byte v1, v0, v2

    .line 2072
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .line 2073
    invoke-virtual {v1}, Ljava/lang/Integer;->shortValue()S

    move-result v1

    int-to-long v2, v1

    invoke-static {v2, v3}, Lcom/b/a/c/c;->a(J)[B

    move-result-object v1

    .line 2074
    const/16 v2, 0x8

    aget-byte v3, v1, v8

    aput-byte v3, v0, v2

    .line 2075
    const/16 v2, 0x9

    aget-byte v1, v1, v9

    aput-byte v1, v0, v2

    .line 41
    invoke-virtual {p1}, La/a/a/a/a/b/x;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/a/a/a/a/b/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 42
    invoke-static {v0}, La/a/a/a/a/b/l;->a([B)Ljava/lang/String;

    move-result-object v0

    .line 44
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v3, "%s-%s-%s-%s"

    new-array v4, v12, [Ljava/lang/Object;

    const/16 v5, 0xc

    invoke-virtual {v0, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v8

    const/16 v5, 0xc

    const/16 v6, 0x10

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v9

    const/16 v5, 0x10

    const/16 v6, 0x14

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    aput-object v0, v4, v10

    const/16 v0, 0xc

    invoke-virtual {v1, v8, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v11

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/b/a/c/c;->b:Ljava/lang/String;

    .line 47
    return-void
.end method

.method private static a(J)[B
    .locals 2

    .prologue
    .line 88
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 89
    long-to-int v1, p0

    int-to-short v1, v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 90
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 91
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 93
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    sget-object v0, Lcom/b/a/c/c;->b:Ljava/lang/String;

    return-object v0
.end method
