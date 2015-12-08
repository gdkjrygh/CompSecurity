.class public Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private buffer:Ljava/nio/ByteBuffer;

.field initialPos:I

.field position:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 5
    const-class v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    .line 12
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->buffer:Ljava/nio/ByteBuffer;

    .line 13
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->initialPos:I

    .line 14
    return-void
.end method


# virtual methods
.method public writeBits(II)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 17
    sget-boolean v0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    shl-int v0, v1, p2

    add-int/lit8 v0, v0, -0x1

    if-le p1, v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    const-string v3, "Trying to write a value bigger (%s) than the number bits (%s) allows. Please mask the value before writing it and make your code is really working as intended."

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    .line 18
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    shl-int v2, v1, p2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 20
    :cond_0
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    rem-int/lit8 v0, v0, 0x8

    rsub-int/lit8 v3, v0, 0x8

    .line 21
    if-gt p2, v3, :cond_3

    .line 22
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->buffer:Ljava/nio/ByteBuffer;

    iget v4, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->initialPos:I

    iget v5, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    div-int/lit8 v5, v5, 0x8

    add-int/2addr v4, v5

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    .line 23
    if-gez v0, :cond_1

    add-int/lit16 v0, v0, 0x100

    .line 24
    :cond_1
    sub-int/2addr v3, p2

    shl-int v3, p1, v3

    add-int/2addr v0, v3

    .line 25
    iget-object v3, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->buffer:Ljava/nio/ByteBuffer;

    iget v4, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->initialPos:I

    iget v5, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    div-int/lit8 v5, v5, 0x8

    add-int/2addr v4, v5

    const/16 v5, 0x7f

    if-le v0, v5, :cond_2

    add-int/lit16 v0, v0, -0x100

    :cond_2
    int-to-byte v0, v0

    invoke-virtual {v3, v4, v0}, Ljava/nio/ByteBuffer;->put(IB)Ljava/nio/ByteBuffer;

    .line 26
    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    add-int/2addr v0, p2

    iput v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    .line 32
    :goto_0
    iget-object v3, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->buffer:Ljava/nio/ByteBuffer;

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->initialPos:I

    iget v4, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    div-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v0

    iget v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->position:I

    rem-int/lit8 v0, v0, 0x8

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    add-int/2addr v0, v4

    invoke-virtual {v3, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 33
    return-void

    .line 28
    :cond_3
    sub-int v0, p2, v3

    .line 29
    shr-int v4, p1, v0

    invoke-virtual {p0, v4, v3}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    .line 30
    shl-int v3, v1, v0

    add-int/lit8 v3, v3, -0x1

    and-int/2addr v3, p1

    invoke-virtual {p0, v3, v0}, Lcom/googlecode/mp4parser/boxes/mp4/objectdescriptors/BitWriterBuffer;->writeBits(II)V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 32
    goto :goto_1
.end method
