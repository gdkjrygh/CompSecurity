.class public Lcom/qihoo360/common/utils/TLVBuilder;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/TLVBuilder$DataType;,
        Lcom/qihoo360/common/utils/TLVBuilder$a;,
        Lcom/qihoo360/common/utils/TLVBuilder$b;,
        Lcom/qihoo360/common/utils/TLVBuilder$c;,
        Lcom/qihoo360/common/utils/TLVBuilder$d;,
        Lcom/qihoo360/common/utils/TLVBuilder$e;
    }
.end annotation


# static fields
.field public static final ERR_INVALID_ID_TYPE:I = -0x3e8

.field public static final TLV_BYTES_ID:I = 0x4

.field public static final TLV_INT_ID:I = 0x1

.field public static final TLV_LONG_ID:I = 0x2

.field public static final TLV_STRING_ID:I = 0x3

.field private static a:I

.field private static synthetic d:[I


# instance fields
.field private b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo360/common/utils/TLVBuilder$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const/4 v0, -0x1

    sput v0, Lcom/qihoo360/common/utils/TLVBuilder;->a:I

    .line 382
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 377
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 43
    return-void
.end method

.method public constructor <init>(Lcom/qihoo360/common/utils/TLVBuilder;)V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 377
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 48
    if-eqz p1, :cond_0

    .line 49
    iget-object v0, p1, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p1, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 53
    :cond_0
    iget v0, p1, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    .line 54
    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 377
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    .line 66
    invoke-direct {p0}, Lcom/qihoo360/common/utils/TLVBuilder;->b()Lcom/qihoo360/common/utils/TLVParseHelper;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder;->a([BLcom/qihoo360/common/utils/TLVParseHelper;)V

    .line 67
    return-void
.end method

.method public constructor <init>([BLcom/qihoo360/common/utils/TLVParseHelper;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 376
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 377
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    .line 62
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder;->a([BLcom/qihoo360/common/utils/TLVParseHelper;)V

    .line 63
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 320
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 329
    :cond_0
    return-void

    .line 323
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 324
    add-int/lit8 v0, v0, -0x1

    move v1, v0

    :goto_0
    const/4 v0, -0x1

    if-le v1, v0, :cond_0

    .line 325
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$a;

    iget v0, v0, Lcom/qihoo360/common/utils/TLVBuilder$a;->a:I

    if-ne v0, p1, :cond_2

    .line 326
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 324
    :cond_2
    add-int/lit8 v0, v1, -0x1

    move v1, v0

    goto :goto_0
.end method

.method private a([BLcom/qihoo360/common/utils/TLVParseHelper;)V
    .locals 8

    .prologue
    const/4 v7, 0x4

    .line 70
    if-nez p1, :cond_1

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 73
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    .line 75
    const/4 v0, 0x0

    :goto_1
    add-int/lit8 v1, v0, 0x4

    array-length v2, p1

    if-gt v1, v2, :cond_0

    .line 76
    invoke-static {p1, v0, v7}, Lcom/qihoo360/common/utils/ByteConvertor;->subBytes([BII)[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/ByteConvertor;->toInt([B)I

    move-result v2

    .line 77
    sget v1, Lcom/qihoo360/common/utils/TLVBuilder;->a:I

    if-eq v2, v1, :cond_0

    .line 80
    add-int/lit8 v1, v0, 0x4

    invoke-static {p1, v1, v7}, Lcom/qihoo360/common/utils/ByteConvertor;->subBytes([BII)[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/ByteConvertor;->toInt([B)I

    move-result v3

    .line 81
    array-length v1, p1

    if-gt v3, v1, :cond_0

    if-ltz v3, :cond_0

    .line 85
    invoke-virtual {p2, v2}, Lcom/qihoo360/common/utils/TLVParseHelper;->getDataTypeFromId(I)Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v4

    .line 86
    if-nez v4, :cond_2

    .line 87
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 88
    const/16 v0, -0x3e8

    iput v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    goto :goto_0

    .line 91
    :cond_2
    const/4 v1, 0x0

    .line 92
    add-int/lit8 v5, v0, 0x8

    invoke-static {p1, v5, v3}, Lcom/qihoo360/common/utils/ByteConvertor;->subBytes([BII)[B

    move-result-object v5

    .line 93
    invoke-static {}, Lcom/qihoo360/common/utils/TLVBuilder;->a()[I

    move-result-object v6

    invoke-virtual {v4}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->ordinal()I

    move-result v4

    aget v4, v6, v4

    packed-switch v4, :pswitch_data_0

    .line 111
    :goto_2
    if-eqz v1, :cond_3

    .line 112
    iget-object v2, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_3
    add-int/lit8 v1, v3, 0x8

    add-int/2addr v0, v1

    goto :goto_1

    .line 95
    :pswitch_0
    new-instance v1, Lcom/qihoo360/common/utils/TLVBuilder$c;

    invoke-direct {v1, p0, v2, v5}, Lcom/qihoo360/common/utils/TLVBuilder$c;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    goto :goto_2

    .line 99
    :pswitch_1
    new-instance v1, Lcom/qihoo360/common/utils/TLVBuilder$d;

    invoke-direct {v1, p0, v2, v5}, Lcom/qihoo360/common/utils/TLVBuilder$d;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    goto :goto_2

    .line 103
    :pswitch_2
    new-instance v1, Lcom/qihoo360/common/utils/TLVBuilder$e;

    invoke-direct {v1, p0, v2, v5}, Lcom/qihoo360/common/utils/TLVBuilder$e;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    goto :goto_2

    .line 107
    :pswitch_3
    new-instance v1, Lcom/qihoo360/common/utils/TLVBuilder$b;

    invoke-direct {v1, p0, v2, v5}, Lcom/qihoo360/common/utils/TLVBuilder$b;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    goto :goto_2

    .line 93
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a()[I
    .locals 3

    .prologue
    .line 33
    sget-object v0, Lcom/qihoo360/common/utils/TLVBuilder;->d:[I

    if-eqz v0, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->values()[Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_0
    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-virtual {v1}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_3

    :goto_1
    :try_start_1
    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-virtual {v1}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_2

    :goto_2
    :try_start_2
    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-virtual {v1}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    :try_start_3
    sget-object v1, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    invoke-virtual {v1}, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_0

    :goto_4
    sput-object v0, Lcom/qihoo360/common/utils/TLVBuilder;->d:[I

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_4

    :catch_1
    move-exception v1

    goto :goto_3

    :catch_2
    move-exception v1

    goto :goto_2

    :catch_3
    move-exception v1

    goto :goto_1
.end method

.method private b()Lcom/qihoo360/common/utils/TLVParseHelper;
    .locals 1

    .prologue
    .line 119
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$1;

    invoke-direct {v0, p0}, Lcom/qihoo360/common/utils/TLVBuilder$1;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;)V

    return-object v0
.end method


# virtual methods
.method public Add(II)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 282
    invoke-virtual {p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder;->add(II)Lcom/qihoo360/common/utils/TLVBuilder;

    move-result-object v0

    return-object v0
.end method

.method public Add(IJ)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 287
    invoke-virtual {p0, p1, p2, p3}, Lcom/qihoo360/common/utils/TLVBuilder;->add(IJ)Lcom/qihoo360/common/utils/TLVBuilder;

    move-result-object v0

    return-object v0
.end method

.method public Add(ILjava/lang/String;)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 277
    invoke-virtual {p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder;->add(ILjava/lang/String;)Lcom/qihoo360/common/utils/TLVBuilder;

    move-result-object v0

    return-object v0
.end method

.method public Add(I[B)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 292
    invoke-virtual {p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder;->add(I[B)Lcom/qihoo360/common/utils/TLVBuilder;

    move-result-object v0

    return-object v0
.end method

.method public add(II)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 302
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$c;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;II)V

    .line 303
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    return-object p0
.end method

.method public add(IJ)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 308
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qihoo360/common/utils/TLVBuilder$d;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;IJ)V

    .line 309
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 310
    return-object p0
.end method

.method public add(ILjava/lang/String;)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 296
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$e;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;ILjava/lang/String;)V

    .line 297
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    return-object p0
.end method

.method public add(I[B)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 314
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$b;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    .line 315
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 316
    return-object p0
.end method

.method public findItem(I)Lcom/qihoo360/common/utils/TLVBuilder$a;
    .locals 3

    .prologue
    .line 267
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 272
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 267
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$a;

    .line 268
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->a()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0
.end method

.method public getBytes()[B
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 360
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 361
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 370
    sget v0, Lcom/qihoo360/common/utils/TLVBuilder;->a:I

    invoke-static {v0}, Lcom/qihoo360/common/utils/ByteConvertor;->toBytes(I)[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 371
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 372
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 373
    return-object v0

    .line 361
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$a;

    .line 362
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->d()I

    move-result v3

    .line 363
    if-lez v3, :cond_0

    .line 364
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->a()I

    move-result v4

    invoke-static {v4}, Lcom/qihoo360/common/utils/ByteConvertor;->toBytes(I)[B

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 365
    invoke-static {v3}, Lcom/qihoo360/common/utils/ByteConvertor;->toBytes(I)[B

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 366
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->c()[B

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto :goto_0
.end method

.method public getBytes(I)[B
    .locals 1

    .prologue
    .line 248
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder;->getBytes(I[B)[B

    move-result-object v0

    return-object v0
.end method

.method public getBytes(I[B)[B
    .locals 3

    .prologue
    .line 258
    invoke-virtual {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->findItem(I)Lcom/qihoo360/common/utils/TLVBuilder$a;

    move-result-object v0

    .line 259
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v1

    sget-object v2, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_BYTES:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    if-ne v1, v2, :cond_0

    .line 260
    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$b;

    .line 261
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$b;->e()[B

    move-result-object p2

    .line 263
    :cond_0
    return-object p2
.end method

.method public getErrCode()I
    .locals 1

    .prologue
    .line 385
    iget v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->c:I

    return v0
.end method

.method public getInt(I)I
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder;->getInt(II)I

    move-result v0

    return v0
.end method

.method public getInt(II)I
    .locals 3

    .prologue
    .line 210
    invoke-virtual {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->findItem(I)Lcom/qihoo360/common/utils/TLVBuilder$a;

    move-result-object v0

    .line 211
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v1

    sget-object v2, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_INT:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    if-ne v1, v2, :cond_0

    .line 212
    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$c;

    .line 213
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$c;->e()I

    move-result p2

    .line 215
    :cond_0
    return p2
.end method

.method public getLong(I)J
    .locals 2

    .prologue
    .line 224
    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lcom/qihoo360/common/utils/TLVBuilder;->getLong(IJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public getLong(IJ)J
    .locals 4

    .prologue
    .line 234
    invoke-virtual {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->findItem(I)Lcom/qihoo360/common/utils/TLVBuilder$a;

    move-result-object v0

    .line 235
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v1

    sget-object v2, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_LONG:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    if-ne v1, v2, :cond_0

    .line 236
    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$d;

    .line 237
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$d;->e()J

    move-result-wide p2

    .line 239
    :cond_0
    return-wide p2
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 176
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/qihoo360/common/utils/TLVBuilder;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getString(ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 186
    invoke-virtual {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->findItem(I)Lcom/qihoo360/common/utils/TLVBuilder$a;

    move-result-object v0

    .line 187
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->b()Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    move-result-object v1

    sget-object v2, Lcom/qihoo360/common/utils/TLVBuilder$DataType;->DT_STRING:Lcom/qihoo360/common/utils/TLVBuilder$DataType;

    if-ne v1, v2, :cond_0

    .line 188
    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$e;

    .line 189
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$e;->e()Ljava/lang/String;

    move-result-object p2

    .line 191
    :cond_0
    return-object p2
.end method

.method public getTLVItemValues()Ljava/util/LinkedHashMap;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap",
            "<",
            "Ljava/lang/Integer;",
            "[B>;"
        }
    .end annotation

    .prologue
    .line 157
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 158
    const/4 v0, 0x0

    .line 167
    :goto_0
    return-object v0

    .line 161
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 163
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, v1

    .line 167
    goto :goto_0

    .line 163
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/utils/TLVBuilder$a;

    .line 164
    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/TLVBuilder$a;->c()[B

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method public size()I
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 151
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 566
    iget-object v0, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v0

    .line 567
    return-object v0
.end method

.method public update(II)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 339
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->a(I)V

    .line 340
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$c;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;II)V

    .line 341
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    return-object p0
.end method

.method public update(IJ)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 346
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->a(I)V

    .line 347
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$d;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qihoo360/common/utils/TLVBuilder$d;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;IJ)V

    .line 348
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    return-object p0
.end method

.method public update(ILjava/lang/String;)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 332
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->a(I)V

    .line 333
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$e;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$e;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;ILjava/lang/String;)V

    .line 334
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    return-object p0
.end method

.method public update(I[B)Lcom/qihoo360/common/utils/TLVBuilder;
    .locals 2

    .prologue
    .line 353
    invoke-direct {p0, p1}, Lcom/qihoo360/common/utils/TLVBuilder;->a(I)V

    .line 354
    new-instance v0, Lcom/qihoo360/common/utils/TLVBuilder$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo360/common/utils/TLVBuilder$b;-><init>(Lcom/qihoo360/common/utils/TLVBuilder;I[B)V

    .line 355
    iget-object v1, p0, Lcom/qihoo360/common/utils/TLVBuilder;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    return-object p0
.end method
