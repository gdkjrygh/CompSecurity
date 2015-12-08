.class public Lrrrrrr/ccrrrr;
.super Ljava/lang/Object;


# static fields
.field public static b0415041504150415Е0415:I = 0x0

.field public static b04150415ЕЕ04150415:I = 0x2

.field public static bЕ041504150415Е0415:I = 0x63

.field public static bЕЕЕЕ04150415:I = 0x1


# instance fields
.field public mHapticDataOffset:I

.field public mMappedByteBuffer:Ljava/nio/MappedByteBuffer;


# direct methods
.method private constructor <init>()V
    .locals 2

    sget v0, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    sget v1, Lrrrrrr/ccrrrr;->bЕЕЕЕ04150415:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    mul-int/2addr v0, v1

    invoke-static {}, Lrrrrrr/ccrrrr;->b0415ЕЕЕ04150415()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrrrr;->b0415041504150415Е0415:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lrrrrrr/ccrrrr;->bЕ0415ЕЕ04150415()I

    move-result v0

    sput v0, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    const/16 v0, 0x4d

    sput v0, Lrrrrrr/ccrrrr;->b0415041504150415Е0415:I

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrrrrrr/cccrrr;)V
    .locals 2

    sget v0, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    sget v1, Lrrrrrr/ccrrrr;->bЕЕЕЕ04150415:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrrrr;->b04150415ЕЕ04150415:I

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/ccrrrr;->b0415041504150415Е0415:I

    if-ne v0, v1, :cond_0

    :goto_0
    invoke-direct {p0}, Lrrrrrr/ccrrrr;-><init>()V

    return-void

    :cond_0
    invoke-static {}, Lrrrrrr/ccrrrr;->bЕ0415ЕЕ04150415()I

    move-result v0

    sput v0, Lrrrrrr/ccrrrr;->bЕ041504150415Е0415:I

    const/16 v0, 0x3e

    sput v0, Lrrrrrr/ccrrrr;->b0415041504150415Е0415:I

    goto :goto_0
.end method

.method public static b0415ЕЕЕ04150415()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bЕ0415ЕЕ04150415()I
    .locals 1

    const/16 v0, 0x44

    return v0
.end method
