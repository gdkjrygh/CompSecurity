.class abstract Lcom/google/zxing/aztec/encoder/Token;
.super Ljava/lang/Object;


# static fields
.field static final EMPTY:Lcom/google/zxing/aztec/encoder/Token;


# instance fields
.field private final previous:Lcom/google/zxing/aztec/encoder/Token;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/google/zxing/aztec/encoder/SimpleToken;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/zxing/aztec/encoder/SimpleToken;-><init>(Lcom/google/zxing/aztec/encoder/Token;II)V

    sput-object v0, Lcom/google/zxing/aztec/encoder/Token;->EMPTY:Lcom/google/zxing/aztec/encoder/Token;

    return-void
.end method

.method constructor <init>(Lcom/google/zxing/aztec/encoder/Token;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/zxing/aztec/encoder/Token;->previous:Lcom/google/zxing/aztec/encoder/Token;

    return-void
.end method


# virtual methods
.method final add(II)Lcom/google/zxing/aztec/encoder/Token;
    .locals 1

    new-instance v0, Lcom/google/zxing/aztec/encoder/SimpleToken;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/zxing/aztec/encoder/SimpleToken;-><init>(Lcom/google/zxing/aztec/encoder/Token;II)V

    return-object v0
.end method

.method final addBinaryShift(II)Lcom/google/zxing/aztec/encoder/Token;
    .locals 2

    mul-int/lit8 v1, p2, 0x8

    const/16 v0, 0x1f

    if-gt p2, v0, :cond_0

    const/16 v0, 0xa

    :goto_0
    add-int/2addr v0, v1

    new-instance v0, Lcom/google/zxing/aztec/encoder/BinaryShiftToken;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/zxing/aztec/encoder/BinaryShiftToken;-><init>(Lcom/google/zxing/aztec/encoder/Token;II)V

    return-object v0

    :cond_0
    const/16 v0, 0x3e

    if-gt p2, v0, :cond_1

    const/16 v0, 0x14

    goto :goto_0

    :cond_1
    const/16 v0, 0x15

    goto :goto_0
.end method

.method abstract appendTo(Lcom/google/zxing/common/BitArray;[B)V
.end method

.method final getPrevious()Lcom/google/zxing/aztec/encoder/Token;
    .locals 1

    iget-object v0, p0, Lcom/google/zxing/aztec/encoder/Token;->previous:Lcom/google/zxing/aztec/encoder/Token;

    return-object v0
.end method
