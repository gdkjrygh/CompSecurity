.class public final Lcom/google/zxing/aztec/decoder/Decoder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/zxing/aztec/decoder/Decoder$1;,
        Lcom/google/zxing/aztec/decoder/Decoder$Table;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final DIGIT_TABLE:[Ljava/lang/String;

.field private static final LOWER_TABLE:[Ljava/lang/String;

.field private static final MIXED_TABLE:[Ljava/lang/String;

.field private static final PUNCT_TABLE:[Ljava/lang/String;

.field private static final UPPER_TABLE:[Ljava/lang/String;


# instance fields
.field private ddata:Lcom/google/zxing/aztec/AztecDetectorResult;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-class v0, Lcom/google/zxing/aztec/decoder/Decoder;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lcom/google/zxing/aztec/decoder/Decoder;->$assertionsDisabled:Z

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/String;

    const-string v3, "CTRL_PS"

    aput-object v3, v0, v2

    const-string v3, " "

    aput-object v3, v0, v1

    const-string v3, "A"

    aput-object v3, v0, v5

    const-string v3, "B"

    aput-object v3, v0, v6

    const-string v3, "C"

    aput-object v3, v0, v7

    const/4 v3, 0x5

    const-string v4, "D"

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "E"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    const-string v4, "F"

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "G"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    const-string v4, "H"

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "I"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    const-string v4, "J"

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "K"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    const-string v4, "L"

    aput-object v4, v0, v3

    const/16 v3, 0xe

    const-string v4, "M"

    aput-object v4, v0, v3

    const/16 v3, 0xf

    const-string v4, "N"

    aput-object v4, v0, v3

    const/16 v3, 0x10

    const-string v4, "O"

    aput-object v4, v0, v3

    const/16 v3, 0x11

    const-string v4, "P"

    aput-object v4, v0, v3

    const/16 v3, 0x12

    const-string v4, "Q"

    aput-object v4, v0, v3

    const/16 v3, 0x13

    const-string v4, "R"

    aput-object v4, v0, v3

    const/16 v3, 0x14

    const-string v4, "S"

    aput-object v4, v0, v3

    const/16 v3, 0x15

    const-string v4, "T"

    aput-object v4, v0, v3

    const/16 v3, 0x16

    const-string v4, "U"

    aput-object v4, v0, v3

    const/16 v3, 0x17

    const-string v4, "V"

    aput-object v4, v0, v3

    const/16 v3, 0x18

    const-string v4, "W"

    aput-object v4, v0, v3

    const/16 v3, 0x19

    const-string v4, "X"

    aput-object v4, v0, v3

    const/16 v3, 0x1a

    const-string v4, "Y"

    aput-object v4, v0, v3

    const/16 v3, 0x1b

    const-string v4, "Z"

    aput-object v4, v0, v3

    const/16 v3, 0x1c

    const-string v4, "CTRL_LL"

    aput-object v4, v0, v3

    const/16 v3, 0x1d

    const-string v4, "CTRL_ML"

    aput-object v4, v0, v3

    const/16 v3, 0x1e

    const-string v4, "CTRL_DL"

    aput-object v4, v0, v3

    const/16 v3, 0x1f

    const-string v4, "CTRL_BS"

    aput-object v4, v0, v3

    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->UPPER_TABLE:[Ljava/lang/String;

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/String;

    const-string v3, "CTRL_PS"

    aput-object v3, v0, v2

    const-string v3, " "

    aput-object v3, v0, v1

    const-string v3, "a"

    aput-object v3, v0, v5

    const-string v3, "b"

    aput-object v3, v0, v6

    const-string v3, "c"

    aput-object v3, v0, v7

    const/4 v3, 0x5

    const-string v4, "d"

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "e"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    const-string v4, "f"

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "g"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    const-string v4, "h"

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "i"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    const-string v4, "j"

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "k"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    const-string v4, "l"

    aput-object v4, v0, v3

    const/16 v3, 0xe

    const-string v4, "m"

    aput-object v4, v0, v3

    const/16 v3, 0xf

    const-string v4, "n"

    aput-object v4, v0, v3

    const/16 v3, 0x10

    const-string v4, "o"

    aput-object v4, v0, v3

    const/16 v3, 0x11

    const-string v4, "p"

    aput-object v4, v0, v3

    const/16 v3, 0x12

    const-string v4, "q"

    aput-object v4, v0, v3

    const/16 v3, 0x13

    const-string v4, "r"

    aput-object v4, v0, v3

    const/16 v3, 0x14

    const-string v4, "s"

    aput-object v4, v0, v3

    const/16 v3, 0x15

    const-string v4, "t"

    aput-object v4, v0, v3

    const/16 v3, 0x16

    const-string v4, "u"

    aput-object v4, v0, v3

    const/16 v3, 0x17

    const-string v4, "v"

    aput-object v4, v0, v3

    const/16 v3, 0x18

    const-string v4, "w"

    aput-object v4, v0, v3

    const/16 v3, 0x19

    const-string v4, "x"

    aput-object v4, v0, v3

    const/16 v3, 0x1a

    const-string v4, "y"

    aput-object v4, v0, v3

    const/16 v3, 0x1b

    const-string v4, "z"

    aput-object v4, v0, v3

    const/16 v3, 0x1c

    const-string v4, "CTRL_US"

    aput-object v4, v0, v3

    const/16 v3, 0x1d

    const-string v4, "CTRL_ML"

    aput-object v4, v0, v3

    const/16 v3, 0x1e

    const-string v4, "CTRL_DL"

    aput-object v4, v0, v3

    const/16 v3, 0x1f

    const-string v4, "CTRL_BS"

    aput-object v4, v0, v3

    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->LOWER_TABLE:[Ljava/lang/String;

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/String;

    const-string v3, "CTRL_PS"

    aput-object v3, v0, v2

    const-string v3, " "

    aput-object v3, v0, v1

    const-string v3, "\u0001"

    aput-object v3, v0, v5

    const-string v3, "\u0002"

    aput-object v3, v0, v6

    const-string v3, "\u0003"

    aput-object v3, v0, v7

    const/4 v3, 0x5

    const-string v4, "\u0004"

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "\u0005"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    const-string v4, "\u0006"

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "\u0007"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    const-string v4, "\u0008"

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "\t"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    const-string v4, "\n"

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "\u000b"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    const-string v4, "\u000c"

    aput-object v4, v0, v3

    const/16 v3, 0xe

    const-string v4, "\r"

    aput-object v4, v0, v3

    const/16 v3, 0xf

    const-string v4, "\u001b"

    aput-object v4, v0, v3

    const/16 v3, 0x10

    const-string v4, "\u001c"

    aput-object v4, v0, v3

    const/16 v3, 0x11

    const-string v4, "\u001d"

    aput-object v4, v0, v3

    const/16 v3, 0x12

    const-string v4, "\u001e"

    aput-object v4, v0, v3

    const/16 v3, 0x13

    const-string v4, "\u001f"

    aput-object v4, v0, v3

    const/16 v3, 0x14

    const-string v4, "@"

    aput-object v4, v0, v3

    const/16 v3, 0x15

    const-string v4, "\\"

    aput-object v4, v0, v3

    const/16 v3, 0x16

    const-string v4, "^"

    aput-object v4, v0, v3

    const/16 v3, 0x17

    const-string v4, "_"

    aput-object v4, v0, v3

    const/16 v3, 0x18

    const-string v4, "`"

    aput-object v4, v0, v3

    const/16 v3, 0x19

    const-string v4, "|"

    aput-object v4, v0, v3

    const/16 v3, 0x1a

    const-string v4, "~"

    aput-object v4, v0, v3

    const/16 v3, 0x1b

    const-string v4, "\u007f"

    aput-object v4, v0, v3

    const/16 v3, 0x1c

    const-string v4, "CTRL_LL"

    aput-object v4, v0, v3

    const/16 v3, 0x1d

    const-string v4, "CTRL_UL"

    aput-object v4, v0, v3

    const/16 v3, 0x1e

    const-string v4, "CTRL_PL"

    aput-object v4, v0, v3

    const/16 v3, 0x1f

    const-string v4, "CTRL_BS"

    aput-object v4, v0, v3

    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->MIXED_TABLE:[Ljava/lang/String;

    const/16 v0, 0x20

    new-array v0, v0, [Ljava/lang/String;

    const-string v3, ""

    aput-object v3, v0, v2

    const-string v3, "\r"

    aput-object v3, v0, v1

    const-string v3, "\r\n"

    aput-object v3, v0, v5

    const-string v3, ". "

    aput-object v3, v0, v6

    const-string v3, ", "

    aput-object v3, v0, v7

    const/4 v3, 0x5

    const-string v4, ": "

    aput-object v4, v0, v3

    const/4 v3, 0x6

    const-string v4, "!"

    aput-object v4, v0, v3

    const/4 v3, 0x7

    const-string v4, "\""

    aput-object v4, v0, v3

    const/16 v3, 0x8

    const-string v4, "#"

    aput-object v4, v0, v3

    const/16 v3, 0x9

    const-string v4, "$"

    aput-object v4, v0, v3

    const/16 v3, 0xa

    const-string v4, "%"

    aput-object v4, v0, v3

    const/16 v3, 0xb

    const-string v4, "&"

    aput-object v4, v0, v3

    const/16 v3, 0xc

    const-string v4, "\'"

    aput-object v4, v0, v3

    const/16 v3, 0xd

    const-string v4, "("

    aput-object v4, v0, v3

    const/16 v3, 0xe

    const-string v4, ")"

    aput-object v4, v0, v3

    const/16 v3, 0xf

    const-string v4, "*"

    aput-object v4, v0, v3

    const/16 v3, 0x10

    const-string v4, "+"

    aput-object v4, v0, v3

    const/16 v3, 0x11

    const-string v4, ","

    aput-object v4, v0, v3

    const/16 v3, 0x12

    const-string v4, "-"

    aput-object v4, v0, v3

    const/16 v3, 0x13

    const-string v4, "."

    aput-object v4, v0, v3

    const/16 v3, 0x14

    const-string v4, "/"

    aput-object v4, v0, v3

    const/16 v3, 0x15

    const-string v4, ":"

    aput-object v4, v0, v3

    const/16 v3, 0x16

    const-string v4, ";"

    aput-object v4, v0, v3

    const/16 v3, 0x17

    const-string v4, "<"

    aput-object v4, v0, v3

    const/16 v3, 0x18

    const-string v4, "="

    aput-object v4, v0, v3

    const/16 v3, 0x19

    const-string v4, ">"

    aput-object v4, v0, v3

    const/16 v3, 0x1a

    const-string v4, "?"

    aput-object v4, v0, v3

    const/16 v3, 0x1b

    const-string v4, "["

    aput-object v4, v0, v3

    const/16 v3, 0x1c

    const-string v4, "]"

    aput-object v4, v0, v3

    const/16 v3, 0x1d

    const-string v4, "{"

    aput-object v4, v0, v3

    const/16 v3, 0x1e

    const-string v4, "}"

    aput-object v4, v0, v3

    const/16 v3, 0x1f

    const-string v4, "CTRL_UL"

    aput-object v4, v0, v3

    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->PUNCT_TABLE:[Ljava/lang/String;

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/String;

    const-string v3, "CTRL_PS"

    aput-object v3, v0, v2

    const-string v2, " "

    aput-object v2, v0, v1

    const-string v1, "0"

    aput-object v1, v0, v5

    const-string v1, "1"

    aput-object v1, v0, v6

    const-string v1, "2"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string v2, "3"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "4"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "5"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "6"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "7"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "8"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "9"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, ","

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "."

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "CTRL_UL"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "CTRL_US"

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->DIGIT_TABLE:[Ljava/lang/String;

    return-void

    :cond_0
    move v0, v2

    goto/16 :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private correctBits([Z)[Z
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/16 v0, 0x8

    const/4 v2, 0x1

    const/4 v3, 0x0

    iget-object v1, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v1}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    move-result v1

    const/4 v4, 0x2

    if-gt v1, v4, :cond_0

    const/4 v0, 0x6

    sget-object v1, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_6:Lcom/google/zxing/common/reedsolomon/GenericGF;

    :goto_0
    iget-object v4, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v4}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbDatablocks()I

    move-result v8

    array-length v4, p1

    div-int v6, v4, v0

    array-length v4, p1

    rem-int/2addr v4, v0

    sub-int v7, v6, v8

    new-array v9, v6, [I

    move v5, v4

    move v4, v3

    :goto_1
    if-ge v4, v6, :cond_3

    invoke-static {p1, v5, v0}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    move-result v10

    aput v10, v9, v4

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v5, v0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v1}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    move-result v1

    if-gt v1, v0, :cond_1

    sget-object v1, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_8:Lcom/google/zxing/common/reedsolomon/GenericGF;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v0}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    move-result v0

    const/16 v1, 0x16

    if-gt v0, v1, :cond_2

    const/16 v0, 0xa

    sget-object v1, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_10:Lcom/google/zxing/common/reedsolomon/GenericGF;

    goto :goto_0

    :cond_2
    const/16 v0, 0xc

    sget-object v1, Lcom/google/zxing/common/reedsolomon/GenericGF;->AZTEC_DATA_12:Lcom/google/zxing/common/reedsolomon/GenericGF;

    goto :goto_0

    :cond_3
    :try_start_0
    new-instance v4, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;

    invoke-direct {v4, v1}, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;-><init>(Lcom/google/zxing/common/reedsolomon/GenericGF;)V

    invoke-virtual {v4, v9, v7}, Lcom/google/zxing/common/reedsolomon/ReedSolomonDecoder;->decode([II)V
    :try_end_0
    .catch Lcom/google/zxing/common/reedsolomon/ReedSolomonException; {:try_start_0 .. :try_end_0} :catch_0

    shl-int v1, v2, v0

    add-int/lit8 v10, v1, -0x1

    move v4, v3

    move v1, v3

    :goto_2
    if-ge v4, v8, :cond_8

    aget v5, v9, v4

    if-eqz v5, :cond_4

    if-ne v5, v10, :cond_5

    :cond_4
    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    move-result-object v0

    throw v0

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/google/zxing/FormatException;->getFormatInstance()Lcom/google/zxing/FormatException;

    move-result-object v0

    throw v0

    :cond_5
    if-eq v5, v2, :cond_6

    add-int/lit8 v6, v10, -0x1

    if-ne v5, v6, :cond_7

    :cond_6
    add-int/lit8 v1, v1, 0x1

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_8
    mul-int v4, v8, v0

    sub-int v1, v4, v1

    new-array v11, v1, [Z

    move v7, v3

    move v4, v3

    :goto_3
    if-ge v7, v8, :cond_d

    aget v12, v9, v7

    if-eq v12, v2, :cond_9

    add-int/lit8 v1, v10, -0x1

    if-ne v12, v1, :cond_b

    :cond_9
    add-int v1, v4, v0

    add-int/lit8 v5, v1, -0x1

    if-le v12, v2, :cond_a

    move v1, v2

    :goto_4
    invoke-static {v11, v4, v5, v1}, Ljava/util/Arrays;->fill([ZIIZ)V

    add-int/lit8 v1, v0, -0x1

    add-int/2addr v1, v4

    :goto_5
    add-int/lit8 v4, v7, 0x1

    move v7, v4

    move v4, v1

    goto :goto_3

    :cond_a
    move v1, v3

    goto :goto_4

    :cond_b
    add-int/lit8 v1, v0, -0x1

    move v5, v1

    :goto_6
    if-ltz v5, :cond_f

    add-int/lit8 v6, v4, 0x1

    shl-int v1, v2, v5

    and-int/2addr v1, v12

    if-eqz v1, :cond_c

    move v1, v2

    :goto_7
    aput-boolean v1, v11, v4

    add-int/lit8 v1, v5, -0x1

    move v5, v1

    move v4, v6

    goto :goto_6

    :cond_c
    move v1, v3

    goto :goto_7

    :cond_d
    sget-boolean v0, Lcom/google/zxing/aztec/decoder/Decoder;->$assertionsDisabled:Z

    if-nez v0, :cond_e

    array-length v0, v11

    if-eq v4, v0, :cond_e

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_e
    return-object v11

    :cond_f
    move v1, v4

    goto :goto_5
.end method

.method private static getCharacter(Lcom/google/zxing/aztec/decoder/Decoder$Table;I)Ljava/lang/String;
    .locals 2

    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$1;->$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table:[I

    invoke-virtual {p0}, Lcom/google/zxing/aztec/decoder/Decoder$Table;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bad table"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->UPPER_TABLE:[Ljava/lang/String;

    aget-object v0, v0, p1

    :goto_0
    return-object v0

    :pswitch_1
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->LOWER_TABLE:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_0

    :pswitch_2
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->MIXED_TABLE:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_0

    :pswitch_3
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->PUNCT_TABLE:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_0

    :pswitch_4
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder;->DIGIT_TABLE:[Ljava/lang/String;

    aget-object v0, v0, p1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static getEncodedData([Z)Ljava/lang/String;
    .locals 11

    const/16 v10, 0xb

    const/16 v9, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x5

    array-length v2, p0

    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->UPPER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    sget-object v3, Lcom/google/zxing/aztec/decoder/Decoder$Table;->UPPER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v1, 0x14

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    move v1, v6

    move-object v5, v3

    move-object v3, v0

    :goto_0
    if-ge v1, v2, :cond_0

    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->BINARY:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    if-ne v5, v0, :cond_4

    sub-int v0, v2, v1

    if-ge v0, v4, :cond_1

    :cond_0
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-static {p0, v1, v4}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    move-result v0

    add-int/lit8 v1, v1, 0x5

    if-nez v0, :cond_2

    sub-int v0, v2, v1

    if-lt v0, v10, :cond_0

    invoke-static {p0, v1, v10}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    add-int/lit8 v1, v1, 0xb

    :cond_2
    move v5, v6

    :goto_1
    if-ge v5, v0, :cond_8

    sub-int v7, v2, v1

    if-ge v7, v9, :cond_3

    move v0, v2

    :goto_2
    move v1, v0

    move-object v5, v3

    goto :goto_0

    :cond_3
    invoke-static {p0, v1, v9}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    move-result v7

    int-to-char v7, v7

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v7, v1, 0x8

    add-int/lit8 v1, v5, 0x1

    move v5, v1

    move v1, v7

    goto :goto_1

    :cond_4
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->DIGIT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    if-ne v5, v0, :cond_6

    const/4 v0, 0x4

    :goto_3
    sub-int v7, v2, v1

    if-lt v7, v0, :cond_0

    invoke-static {p0, v1, v0}, Lcom/google/zxing/aztec/decoder/Decoder;->readCode([ZII)I

    move-result v7

    add-int/2addr v1, v0

    invoke-static {v5, v7}, Lcom/google/zxing/aztec/decoder/Decoder;->getCharacter(Lcom/google/zxing/aztec/decoder/Decoder$Table;I)Ljava/lang/String;

    move-result-object v5

    const-string v0, "CTRL_"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lcom/google/zxing/aztec/decoder/Decoder;->getTable(C)Lcom/google/zxing/aztec/decoder/Decoder$Table;

    move-result-object v0

    const/4 v7, 0x6

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x4c

    if-ne v5, v7, :cond_5

    move-object v3, v0

    :cond_5
    :goto_4
    move-object v5, v0

    goto :goto_0

    :cond_6
    move v0, v4

    goto :goto_3

    :cond_7
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, v3

    goto :goto_4

    :cond_8
    move v0, v1

    goto :goto_2
.end method

.method private static getTable(C)Lcom/google/zxing/aztec/decoder/Decoder$Table;
    .locals 1

    sparse-switch p0, :sswitch_data_0

    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->UPPER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    :goto_0
    return-object v0

    :sswitch_0
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->LOWER:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    goto :goto_0

    :sswitch_1
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->PUNCT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    goto :goto_0

    :sswitch_2
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->MIXED:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    goto :goto_0

    :sswitch_3
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->DIGIT:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    goto :goto_0

    :sswitch_4
    sget-object v0, Lcom/google/zxing/aztec/decoder/Decoder$Table;->BINARY:Lcom/google/zxing/aztec/decoder/Decoder$Table;

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x42 -> :sswitch_4
        0x44 -> :sswitch_3
        0x4c -> :sswitch_0
        0x4d -> :sswitch_2
        0x50 -> :sswitch_1
    .end sparse-switch
.end method

.method public static highLevelDecode([Z)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/zxing/aztec/decoder/Decoder;->getEncodedData([Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static readCode([ZII)I
    .locals 3

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    add-int v2, p1, p2

    if-ge v1, v2, :cond_1

    shl-int/lit8 v0, v0, 0x1

    aget-boolean v2, p0, v1

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private static totalBitsInLayer(IZ)I
    .locals 2

    if-eqz p1, :cond_0

    const/16 v0, 0x58

    :goto_0
    mul-int/lit8 v1, p0, 0x10

    add-int/2addr v0, v1

    mul-int/2addr v0, p0

    return v0

    :cond_0
    const/16 v0, 0x70

    goto :goto_0
.end method


# virtual methods
.method public decode(Lcom/google/zxing/aztec/AztecDetectorResult;)Lcom/google/zxing/common/DecoderResult;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/zxing/FormatException;
        }
    .end annotation

    const/4 v2, 0x0

    iput-object p1, p0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {p1}, Lcom/google/zxing/aztec/AztecDetectorResult;->getBits()Lcom/google/zxing/common/BitMatrix;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/zxing/aztec/decoder/Decoder;->extractBits(Lcom/google/zxing/common/BitMatrix;)[Z

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/zxing/aztec/decoder/Decoder;->correctBits([Z)[Z

    move-result-object v0

    invoke-static {v0}, Lcom/google/zxing/aztec/decoder/Decoder;->getEncodedData([Z)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/zxing/common/DecoderResult;

    invoke-direct {v1, v2, v0, v2, v2}, Lcom/google/zxing/common/DecoderResult;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v1
.end method

.method extractBits(Lcom/google/zxing/common/BitMatrix;)[Z
    .locals 19

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v3}, Lcom/google/zxing/aztec/AztecDetectorResult;->isCompact()Z

    move-result v9

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/google/zxing/aztec/decoder/Decoder;->ddata:Lcom/google/zxing/aztec/AztecDetectorResult;

    invoke-virtual {v3}, Lcom/google/zxing/aztec/AztecDetectorResult;->getNbLayers()I

    move-result v10

    if-eqz v9, :cond_0

    mul-int/lit8 v3, v10, 0x4

    add-int/lit8 v3, v3, 0xb

    :goto_0
    new-array v11, v3, [I

    invoke-static {v10, v9}, Lcom/google/zxing/aztec/decoder/Decoder;->totalBitsInLayer(IZ)I

    move-result v4

    new-array v12, v4, [Z

    if-eqz v9, :cond_1

    const/4 v4, 0x0

    :goto_1
    array-length v5, v11

    if-ge v4, v5, :cond_2

    aput v4, v11, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    mul-int/lit8 v3, v10, 0x4

    add-int/lit8 v3, v3, 0xe

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v3, 0x1

    div-int/lit8 v5, v3, 0x2

    add-int/lit8 v5, v5, -0x1

    div-int/lit8 v5, v5, 0xf

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    div-int/lit8 v5, v3, 0x2

    div-int/lit8 v6, v4, 0x2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v5, :cond_2

    div-int/lit8 v7, v4, 0xf

    add-int/2addr v7, v4

    sub-int v8, v5, v4

    add-int/lit8 v8, v8, -0x1

    sub-int v13, v6, v7

    add-int/lit8 v13, v13, -0x1

    aput v13, v11, v8

    add-int v8, v5, v4

    add-int/2addr v7, v6

    add-int/lit8 v7, v7, 0x1

    aput v7, v11, v8

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    const/4 v4, 0x0

    move v7, v4

    move v8, v5

    :goto_3
    if-ge v8, v10, :cond_6

    if-eqz v9, :cond_3

    sub-int v4, v10, v8

    mul-int/lit8 v4, v4, 0x4

    add-int/lit8 v4, v4, 0x9

    :goto_4
    mul-int/lit8 v13, v8, 0x2

    add-int/lit8 v5, v3, -0x1

    sub-int v14, v5, v13

    const/4 v5, 0x0

    move v6, v5

    :goto_5
    if-ge v6, v4, :cond_5

    mul-int/lit8 v15, v6, 0x2

    const/4 v5, 0x0

    :goto_6
    const/16 v16, 0x2

    move/from16 v0, v16

    if-ge v5, v0, :cond_4

    add-int v16, v7, v15

    add-int v16, v16, v5

    add-int v17, v13, v5

    aget v17, v11, v17

    add-int v18, v13, v6

    aget v18, v11, v18

    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v17

    aput-boolean v17, v12, v16

    mul-int/lit8 v16, v4, 0x2

    add-int v16, v16, v7

    add-int v16, v16, v15

    add-int v16, v16, v5

    add-int v17, v13, v6

    aget v17, v11, v17

    sub-int v18, v14, v5

    aget v18, v11, v18

    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v17

    aput-boolean v17, v12, v16

    mul-int/lit8 v16, v4, 0x4

    add-int v16, v16, v7

    add-int v16, v16, v15

    add-int v16, v16, v5

    sub-int v17, v14, v5

    aget v17, v11, v17

    sub-int v18, v14, v6

    aget v18, v11, v18

    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v17

    aput-boolean v17, v12, v16

    mul-int/lit8 v16, v4, 0x6

    add-int v16, v16, v7

    add-int v16, v16, v15

    add-int v16, v16, v5

    sub-int v17, v14, v6

    aget v17, v11, v17

    add-int v18, v13, v5

    aget v18, v11, v18

    move-object/from16 v0, p1

    move/from16 v1, v17

    move/from16 v2, v18

    invoke-virtual {v0, v1, v2}, Lcom/google/zxing/common/BitMatrix;->get(II)Z

    move-result v17

    aput-boolean v17, v12, v16

    add-int/lit8 v5, v5, 0x1

    goto :goto_6

    :cond_3
    sub-int v4, v10, v8

    mul-int/lit8 v4, v4, 0x4

    add-int/lit8 v4, v4, 0xc

    goto/16 :goto_4

    :cond_4
    add-int/lit8 v5, v6, 0x1

    move v6, v5

    goto/16 :goto_5

    :cond_5
    mul-int/lit8 v4, v4, 0x8

    add-int/2addr v4, v7

    add-int/lit8 v5, v8, 0x1

    move v7, v4

    move v8, v5

    goto/16 :goto_3

    :cond_6
    return-object v12
.end method
