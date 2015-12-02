.class public Lcom/qihoo360/common/utils/RandSignFile;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo360/common/utils/RandSignFile$a;
    }
.end annotation


# static fields
.field public static RFERR_BADKEY:I

.field public static RFERR_BADSIGN:I

.field public static RFERR_FILEOP:I

.field public static RFERR_FILETYPE:I

.field public static RFERR_INVALID_ARGS:I

.field public static RFERR_NOT_SUPPORT:I

.field public static RFERR_OK:I

.field public static RFERR_UNKNOWN:I

.field private static e:I

.field private static f:I

.field private static g:I


# instance fields
.field a:Lcom/qihoo360/common/utils/RandSignFile$a;

.field b:Ljava/io/RandomAccessFile;

.field private c:[B

.field private d:Ljava/security/PublicKey;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I

    .line 22
    const/4 v0, -0x1

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILETYPE:I

    .line 24
    const/4 v0, -0x2

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILEOP:I

    .line 26
    const/4 v0, -0x3

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_NOT_SUPPORT:I

    .line 28
    const/4 v0, -0x4

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_INVALID_ARGS:I

    .line 30
    const/4 v0, -0x5

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_UNKNOWN:I

    .line 32
    const/4 v0, -0x6

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_BADKEY:I

    .line 34
    const/4 v0, -0x7

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_BADSIGN:I

    .line 268
    const v0, 0x51334546

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->e:I

    .line 270
    const/4 v0, 0x1

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->f:I

    .line 272
    const/16 v0, 0x5a

    sput v0, Lcom/qihoo360/common/utils/RandSignFile;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .prologue
    const/4 v7, 0x2

    const/4 v6, 0x7

    const/16 v5, -0x17

    const/16 v4, -0x7f

    const/4 v3, 0x1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 262
    const/16 v0, 0xa2

    new-array v0, v0, [B

    const/4 v1, 0x0

    const/16 v2, 0x30

    aput-byte v2, v0, v1

    aput-byte v4, v0, v3

    const/16 v1, -0x61

    aput-byte v1, v0, v7

    const/4 v1, 0x3

    const/16 v2, 0x30

    aput-byte v2, v0, v1

    const/4 v1, 0x4

    const/16 v2, 0xd

    aput-byte v2, v0, v1

    const/4 v1, 0x5

    const/4 v2, 0x6

    aput-byte v2, v0, v1

    const/4 v1, 0x6

    const/16 v2, 0x9

    aput-byte v2, v0, v1

    const/16 v1, 0x2a

    aput-byte v1, v0, v6

    const/16 v1, 0x8

    const/16 v2, -0x7a

    aput-byte v2, v0, v1

    const/16 v1, 0x9

    const/16 v2, 0x48

    aput-byte v2, v0, v1

    const/16 v1, 0xa

    const/16 v2, -0x7a

    aput-byte v2, v0, v1

    const/16 v1, 0xb

    const/16 v2, -0x9

    aput-byte v2, v0, v1

    const/16 v1, 0xc

    const/16 v2, 0xd

    aput-byte v2, v0, v1

    const/16 v1, 0xd

    aput-byte v3, v0, v1

    const/16 v1, 0xe

    aput-byte v3, v0, v1

    const/16 v1, 0xf

    aput-byte v3, v0, v1

    const/16 v1, 0x10

    const/4 v2, 0x5

    aput-byte v2, v0, v1

    const/16 v1, 0x12

    const/4 v2, 0x3

    aput-byte v2, v0, v1

    const/16 v1, 0x13

    aput-byte v4, v0, v1

    const/16 v1, 0x14

    const/16 v2, -0x73

    aput-byte v2, v0, v1

    const/16 v1, 0x16

    const/16 v2, 0x30

    aput-byte v2, v0, v1

    const/16 v1, 0x17

    aput-byte v4, v0, v1

    const/16 v1, 0x18

    const/16 v2, -0x77

    aput-byte v2, v0, v1

    const/16 v1, 0x19

    aput-byte v7, v0, v1

    const/16 v1, 0x1a

    aput-byte v4, v0, v1

    const/16 v1, 0x1b

    aput-byte v4, v0, v1

    const/16 v1, 0x1d

    const/16 v2, -0x13

    aput-byte v2, v0, v1

    const/16 v1, 0x1e

    const/16 v2, 0x4c

    aput-byte v2, v0, v1

    const/16 v1, 0x1f

    const/16 v2, -0xb

    aput-byte v2, v0, v1

    const/16 v1, 0x20

    const/16 v2, -0x53

    aput-byte v2, v0, v1

    const/16 v1, 0x21

    const/16 v2, 0x24

    aput-byte v2, v0, v1

    const/16 v1, 0x22

    const/16 v2, -0x6e

    aput-byte v2, v0, v1

    const/16 v1, 0x23

    const/16 v2, -0x4b

    aput-byte v2, v0, v1

    const/16 v1, 0x24

    const/16 v2, 0x2d

    aput-byte v2, v0, v1

    const/16 v1, 0x25

    const/16 v2, -0x38

    aput-byte v2, v0, v1

    const/16 v1, 0x26

    const/16 v2, 0x24

    aput-byte v2, v0, v1

    const/16 v1, 0x27

    aput-byte v6, v0, v1

    const/16 v1, 0x28

    const/16 v2, -0x6b

    aput-byte v2, v0, v1

    const/16 v1, 0x29

    const/16 v2, -0x4b

    aput-byte v2, v0, v1

    const/16 v1, 0x2a

    const/16 v2, 0x42

    aput-byte v2, v0, v1

    const/16 v1, 0x2b

    const/16 v2, -0x66

    aput-byte v2, v0, v1

    const/16 v1, 0x2c

    const/16 v2, 0x38

    aput-byte v2, v0, v1

    const/16 v1, 0x2d

    const/16 v2, 0x69

    aput-byte v2, v0, v1

    const/16 v1, 0x2e

    const/16 v2, -0x48

    aput-byte v2, v0, v1

    const/16 v1, 0x2f

    const/16 v2, -0x22

    aput-byte v2, v0, v1

    const/16 v1, 0x30

    const/4 v2, -0x5

    aput-byte v2, v0, v1

    const/16 v1, 0x31

    const/16 v2, 0x6b

    aput-byte v2, v0, v1

    const/16 v1, 0x32

    const/16 v2, -0x6b

    aput-byte v2, v0, v1

    const/16 v1, 0x33

    const/16 v2, -0x66

    aput-byte v2, v0, v1

    const/16 v1, 0x34

    const/16 v2, -0x5b

    aput-byte v2, v0, v1

    const/16 v1, 0x35

    const/16 v2, -0x1b

    aput-byte v2, v0, v1

    const/16 v1, 0x36

    const/16 v2, 0x74

    aput-byte v2, v0, v1

    const/16 v1, 0x37

    const/16 v2, 0x25

    aput-byte v2, v0, v1

    const/16 v1, 0x38

    const/16 v2, -0x73

    aput-byte v2, v0, v1

    const/16 v1, 0x39

    const/16 v2, -0x2f

    aput-byte v2, v0, v1

    const/16 v1, 0x3a

    const/16 v2, 0x2d

    aput-byte v2, v0, v1

    const/16 v1, 0x3b

    const/16 v2, -0x2c

    aput-byte v2, v0, v1

    const/16 v1, 0x3c

    const/16 v2, -0x22

    aput-byte v2, v0, v1

    const/16 v1, 0x3d

    const/16 v2, 0x3e

    aput-byte v2, v0, v1

    const/16 v1, 0x3e

    const/16 v2, -0x38

    aput-byte v2, v0, v1

    const/16 v1, 0x3f

    const/16 v2, -0xd

    aput-byte v2, v0, v1

    const/16 v1, 0x40

    const/4 v2, 0x6

    aput-byte v2, v0, v1

    const/16 v1, 0x41

    const/16 v2, 0x75

    aput-byte v2, v0, v1

    const/16 v1, 0x42

    const/16 v2, 0x12

    aput-byte v2, v0, v1

    const/16 v1, 0x43

    const/4 v2, -0x8

    aput-byte v2, v0, v1

    const/16 v1, 0x44

    aput-byte v5, v0, v1

    const/16 v1, 0x45

    const/16 v2, 0xd

    aput-byte v2, v0, v1

    const/16 v1, 0x46

    const/16 v2, 0x37

    aput-byte v2, v0, v1

    const/16 v1, 0x47

    const/4 v2, -0x5

    aput-byte v2, v0, v1

    const/16 v1, 0x48

    const/16 v2, -0x1b

    aput-byte v2, v0, v1

    const/16 v1, 0x49

    const/16 v2, -0x13

    aput-byte v2, v0, v1

    const/16 v1, 0x4a

    const/16 v2, -0x32

    aput-byte v2, v0, v1

    const/16 v1, 0x4b

    aput-byte v6, v0, v1

    const/16 v1, 0x4c

    const/16 v2, -0x36

    aput-byte v2, v0, v1

    const/16 v1, 0x4d

    aput-byte v3, v0, v1

    const/16 v1, 0x4e

    const/16 v2, -0x3d

    aput-byte v2, v0, v1

    const/16 v1, 0x4f

    const/16 v2, -0x34

    aput-byte v2, v0, v1

    const/16 v1, 0x50

    const/16 v2, 0x55

    aput-byte v2, v0, v1

    const/16 v1, 0x51

    const/16 v2, -0x37

    aput-byte v2, v0, v1

    const/16 v1, 0x52

    const/16 v2, 0x61

    aput-byte v2, v0, v1

    const/16 v1, 0x53

    const/16 v2, -0x34

    aput-byte v2, v0, v1

    const/16 v1, 0x54

    const/16 v2, 0x7e

    aput-byte v2, v0, v1

    const/16 v1, 0x55

    const/16 v2, 0x2b

    aput-byte v2, v0, v1

    const/16 v1, 0x56

    aput-byte v5, v0, v1

    const/16 v1, 0x57

    const/16 v2, 0x70

    aput-byte v2, v0, v1

    const/16 v1, 0x58

    const/16 v2, -0x41

    aput-byte v2, v0, v1

    const/16 v1, 0x59

    const/16 v2, 0x63

    aput-byte v2, v0, v1

    const/16 v1, 0x5a

    const/16 v2, 0x55

    aput-byte v2, v0, v1

    const/16 v1, 0x5b

    const/16 v2, -0x47

    aput-byte v2, v0, v1

    const/16 v1, 0x5c

    const/16 v2, -0x70

    aput-byte v2, v0, v1

    const/16 v1, 0x5d

    const/16 v2, -0x45

    aput-byte v2, v0, v1

    const/16 v1, 0x5e

    const/16 v2, 0x5e

    aput-byte v2, v0, v1

    const/16 v1, 0x5f

    const/16 v2, -0x30

    aput-byte v2, v0, v1

    const/16 v1, 0x60

    const/16 v2, 0x40

    aput-byte v2, v0, v1

    const/16 v1, 0x61

    const/16 v2, 0x54

    aput-byte v2, v0, v1

    const/16 v1, 0x62

    const/16 v2, 0x29

    aput-byte v2, v0, v1

    const/16 v1, 0x63

    const/16 v2, 0x40

    aput-byte v2, v0, v1

    const/16 v1, 0x64

    const/16 v2, -0x1c

    aput-byte v2, v0, v1

    const/16 v1, 0x65

    aput-byte v5, v0, v1

    const/16 v1, 0x66

    const/16 v2, 0x3b

    aput-byte v2, v0, v1

    const/16 v1, 0x67

    const/16 v2, 0x3e

    aput-byte v2, v0, v1

    const/16 v1, 0x68

    const/16 v2, 0x2a

    aput-byte v2, v0, v1

    const/16 v1, 0x69

    const/16 v2, -0x26

    aput-byte v2, v0, v1

    const/16 v1, 0x6a

    const/16 v2, -0x49

    aput-byte v2, v0, v1

    const/16 v1, 0x6b

    const/16 v2, -0x2e

    aput-byte v2, v0, v1

    const/16 v1, 0x6c

    const/16 v2, 0x64

    aput-byte v2, v0, v1

    const/16 v1, 0x6d

    const/16 v2, 0x7d

    aput-byte v2, v0, v1

    const/16 v1, 0x6e

    const/16 v2, -0x72

    aput-byte v2, v0, v1

    const/16 v1, 0x6f

    const/16 v2, -0x64

    aput-byte v2, v0, v1

    const/16 v1, 0x70

    const/16 v2, -0x39

    aput-byte v2, v0, v1

    const/16 v1, 0x71

    const/16 v2, 0x65

    aput-byte v2, v0, v1

    const/16 v1, 0x72

    const/16 v2, -0x4c

    aput-byte v2, v0, v1

    const/16 v1, 0x73

    const/16 v2, -0x42

    aput-byte v2, v0, v1

    const/16 v1, 0x74

    const/16 v2, -0x3f

    aput-byte v2, v0, v1

    const/16 v1, 0x75

    const/16 v2, 0x2f

    aput-byte v2, v0, v1

    const/16 v1, 0x76

    const/16 v2, -0x7b

    aput-byte v2, v0, v1

    const/16 v1, 0x77

    const/16 v2, 0x61

    aput-byte v2, v0, v1

    const/16 v1, 0x78

    const/16 v2, 0x54

    aput-byte v2, v0, v1

    const/16 v1, 0x79

    const/16 v2, -0x30

    aput-byte v2, v0, v1

    const/16 v1, 0x7a

    const/16 v2, -0x5b

    aput-byte v2, v0, v1

    const/16 v1, 0x7b

    const/16 v2, -0x20

    aput-byte v2, v0, v1

    const/16 v1, 0x7c

    aput-byte v6, v0, v1

    const/16 v1, 0x7d

    const/16 v2, -0x72

    aput-byte v2, v0, v1

    const/16 v1, 0x7e

    const/16 v2, 0x10

    aput-byte v2, v0, v1

    const/16 v1, 0x7f

    aput-byte v6, v0, v1

    const/16 v1, 0x80

    const/16 v2, 0x15

    aput-byte v2, v0, v1

    const/16 v1, 0x81

    const/16 v2, -0x46

    aput-byte v2, v0, v1

    const/16 v1, 0x82

    const/16 v2, 0x43

    aput-byte v2, v0, v1

    const/16 v1, 0x83

    const/16 v2, -0x32

    aput-byte v2, v0, v1

    const/16 v1, 0x84

    const/16 v2, 0x7f

    aput-byte v2, v0, v1

    const/16 v1, 0x85

    const/16 v2, -0x14

    aput-byte v2, v0, v1

    const/16 v1, 0x86

    const/16 v2, -0x24

    aput-byte v2, v0, v1

    const/16 v1, 0x87

    const/16 v2, -0x48

    aput-byte v2, v0, v1

    const/16 v1, 0x88

    const/16 v2, -0x11

    aput-byte v2, v0, v1

    const/16 v1, 0x89

    const/16 v2, 0x1e

    aput-byte v2, v0, v1

    const/16 v1, 0x8a

    const/16 v2, 0x68

    aput-byte v2, v0, v1

    const/16 v1, 0x8b

    const/16 v2, -0x5e

    aput-byte v2, v0, v1

    const/16 v1, 0x8c

    const/16 v2, -0x70

    aput-byte v2, v0, v1

    const/16 v1, 0x8d

    aput-byte v5, v0, v1

    const/16 v1, 0x8e

    const/16 v2, 0x42

    aput-byte v2, v0, v1

    const/16 v1, 0x8f

    aput-byte v5, v0, v1

    const/16 v1, 0x90

    const/16 v2, -0x6b

    aput-byte v2, v0, v1

    const/16 v1, 0x91

    aput-byte v7, v0, v1

    const/16 v1, 0x92

    const/16 v2, 0x35

    aput-byte v2, v0, v1

    const/16 v1, 0x93

    const/16 v2, -0x55

    aput-byte v2, v0, v1

    const/16 v1, 0x94

    const/16 v2, -0x5a

    aput-byte v2, v0, v1

    const/16 v1, 0x95

    const/16 v2, 0x18

    aput-byte v2, v0, v1

    const/16 v1, 0x96

    const/16 v2, -0x6f

    aput-byte v2, v0, v1

    const/16 v1, 0x97

    const/16 v2, -0xb

    aput-byte v2, v0, v1

    const/16 v1, 0x98

    const/16 v2, -0x2e

    aput-byte v2, v0, v1

    const/16 v1, 0x99

    const/16 v2, -0x23

    aput-byte v2, v0, v1

    const/16 v1, 0x9a

    const/16 v2, -0x73

    aput-byte v2, v0, v1

    const/16 v1, 0x9b

    const/16 v2, 0x1e

    aput-byte v2, v0, v1

    const/16 v1, 0x9c

    const/16 v2, -0x77

    aput-byte v2, v0, v1

    const/16 v1, 0x9d

    aput-byte v7, v0, v1

    const/16 v1, 0x9e

    const/4 v2, 0x3

    aput-byte v2, v0, v1

    const/16 v1, 0x9f

    aput-byte v3, v0, v1

    const/16 v1, 0xa1

    aput-byte v3, v0, v1

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->c:[B

    .line 263
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;

    .line 264
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    .line 38
    return-void
.end method

.method public static L2B_int(I)I
    .locals 2

    .prologue
    .line 252
    and-int/lit16 v0, p0, 0xff

    shl-int/lit8 v0, v0, 0x18

    const v1, 0xff00

    and-int/2addr v1, p0

    shl-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    const/high16 v1, 0xff0000

    and-int/2addr v1, p0

    shr-int/lit8 v1, v1, 0x8

    add-int/2addr v0, v1

    shr-int/lit8 v1, p0, 0x18

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    return v0
.end method

.method public static L2B_short(S)S
    .locals 2

    .prologue
    .line 256
    and-int/lit16 v0, p0, 0xff

    shl-int/lit8 v0, v0, 0x8

    int-to-short v0, v0

    .line 257
    const v1, 0xff00

    and-int/2addr v1, p0

    shr-int/lit8 v1, v1, 0x8

    int-to-short v1, v1

    add-int/2addr v0, v1

    int-to-short v0, v0

    .line 258
    return v0
.end method

.method static synthetic a()I
    .locals 1

    .prologue
    .line 268
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->e:I

    return v0
.end method

.method static synthetic b()I
    .locals 1

    .prologue
    .line 270
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->f:I

    return v0
.end method

.method private c()I
    .locals 6

    .prologue
    .line 127
    :try_start_0
    const-string/jumbo v0, "SHA1WithRSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 128
    invoke-direct {p0}, Lcom/qihoo360/common/utils/RandSignFile;->d()Ljava/security/PublicKey;

    move-result-object v1

    .line 129
    if-nez v1, :cond_0

    .line 130
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_BADKEY:I

    .line 158
    :goto_0
    return v0

    .line 132
    :cond_0
    invoke-virtual {v0, v1}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 133
    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 136
    iget-object v2, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 137
    iget-object v2, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    const/4 v3, 0x0

    sget v4, Lcom/qihoo360/common/utils/RandSignFile;->g:I

    invoke-virtual {v2, v1, v3, v4}, Ljava/io/RandomAccessFile;->read([BII)I

    move-result v2

    .line 138
    sget v3, Lcom/qihoo360/common/utils/RandSignFile;->g:I

    if-eq v2, v3, :cond_1

    .line 139
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_BADSIGN:I

    goto :goto_0

    .line 140
    :cond_1
    const/4 v2, 0x0

    sget v3, Lcom/qihoo360/common/utils/RandSignFile;->g:I

    invoke-virtual {v0, v1, v2, v3}, Ljava/security/Signature;->update([BII)V

    .line 143
    iget-object v2, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    iget-object v3, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    iget v3, v3, Lcom/qihoo360/common/utils/RandSignFile$a;->b:I

    sget v4, Lcom/qihoo360/common/utils/RandSignFile;->g:I

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Ljava/io/RandomAccessFile;->skipBytes(I)I

    .line 144
    :goto_1
    iget-object v2, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v2, v1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    .line 148
    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    iget-object v1, v1, Lcom/qihoo360/common/utils/RandSignFile$a;->k:[B

    invoke-virtual {v0, v1}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    .line 149
    if-eqz v0, :cond_3

    .line 150
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I

    goto :goto_0

    .line 145
    :cond_2
    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/security/Signature;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 154
    :catch_0
    move-exception v0

    .line 158
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_UNKNOWN:I

    goto :goto_0

    .line 152
    :cond_3
    :try_start_1
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_BADSIGN:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0
.end method

.method private d()Ljava/security/PublicKey;
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;

    .line 183
    :goto_0
    return-object v0

    .line 173
    :cond_0
    :try_start_0
    new-instance v0, Ljava/security/spec/X509EncodedKeySpec;

    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->c:[B

    invoke-direct {v0, v1}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 174
    const-string/jumbo v1, "RSA"

    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    .line 175
    invoke-virtual {v1, v0}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;

    .line 177
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 179
    :catch_0
    move-exception v0

    .line 183
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public Close()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 110
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    .line 111
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_INVALID_ARGS:I

    .line 117
    :goto_0
    return v0

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V

    .line 114
    iput-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    .line 115
    iput-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    .line 116
    iput-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->d:Ljava/security/PublicKey;

    .line 117
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I

    goto :goto_0
.end method

.method public Open(Ljava/lang/String;)I
    .locals 2

    .prologue
    .line 48
    :try_start_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string/jumbo v1, "r"

    invoke-direct {v0, p1, v1}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    .line 49
    new-instance v0, Lcom/qihoo360/common/utils/RandSignFile$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo360/common/utils/RandSignFile$a;-><init>(Lcom/qihoo360/common/utils/RandSignFile;Lcom/qihoo360/common/utils/RandSignFile$a;)V

    iput-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    .line 52
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    invoke-virtual {v0}, Lcom/qihoo360/common/utils/RandSignFile$a;->a()I

    move-result v0

    .line 53
    if-eqz v0, :cond_1

    .line 69
    :cond_0
    :goto_0
    return v0

    .line 57
    :cond_1
    invoke-direct {p0}, Lcom/qihoo360/common/utils/RandSignFile;->c()I

    move-result v0

    .line 58
    if-nez v0, :cond_0

    .line 62
    invoke-virtual {p0}, Lcom/qihoo360/common/utils/RandSignFile;->SeekToData()I

    .line 63
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 65
    :catch_0
    move-exception v0

    .line 69
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_UNKNOWN:I

    goto :goto_0
.end method

.method public Read([B)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    if-nez v0, :cond_0

    .line 99
    const/4 v0, -0x1

    .line 101
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p1}, Ljava/io/RandomAccessFile;->read([B)I

    move-result v0

    goto :goto_0
.end method

.method public SeekToData()I
    .locals 4

    .prologue
    .line 77
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    if-nez v0, :cond_1

    .line 78
    :cond_0
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_FILEOP:I

    .line 88
    :goto_0
    return v0

    .line 81
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/common/utils/RandSignFile;->b:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/qihoo360/common/utils/RandSignFile;->a:Lcom/qihoo360/common/utils/RandSignFile$a;

    iget v1, v1, Lcom/qihoo360/common/utils/RandSignFile$a;->b:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 82
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_OK:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 84
    :catch_0
    move-exception v0

    .line 88
    sget v0, Lcom/qihoo360/common/utils/RandSignFile;->RFERR_UNKNOWN:I

    goto :goto_0
.end method
