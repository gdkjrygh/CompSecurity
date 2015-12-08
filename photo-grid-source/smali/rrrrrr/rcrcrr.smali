.class public Lrrrrrr/rcrcrr;
.super Ljava/lang/Object;


# static fields
.field public static b044A044A044A044A044Aъ:I = 0x2

.field public static b044Aъ044A044A044Aъ:I = 0x0

.field public static bъ044A044A044A044Aъ:I = 0x1

.field public static bъъ044A044A044Aъ:I = 0x20


# instance fields
.field public mHapticDataOffset:I

.field public mMappedByteBuffer:Ljava/nio/MappedByteBuffer;


# direct methods
.method private constructor <init>()V
    .locals 2

    sget v0, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    sget v1, Lrrrrrr/rcrcrr;->bъ044A044A044A044Aъ:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrcrr;->b044A044A044A044A044Aъ:I

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrcrr;->b044Aъ044A044A044Aъ:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lrrrrrr/rcrcrr;->bъъъъъ044A()I

    move-result v0

    sput v0, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    const/16 v0, 0x5f

    sput v0, Lrrrrrr/rcrcrr;->b044Aъ044A044A044Aъ:I

    :cond_0
    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0
.end method

.method public synthetic constructor <init>(Lrrrrrr/crrcrr;)V
    .locals 2

    sget v0, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    invoke-static {}, Lrrrrrr/rcrcrr;->b044Aъъъъ044A()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    mul-int/2addr v0, v1

    invoke-static {}, Lrrrrrr/rcrcrr;->bъ044Aъъъ044A()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/rcrcrr;->b044Aъ044A044A044Aъ:I

    if-ne v0, v1, :cond_0

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lrrrrrr/rcrcrr;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :cond_0
    invoke-static {}, Lrrrrrr/rcrcrr;->bъъъъъ044A()I

    move-result v0

    sput v0, Lrrrrrr/rcrcrr;->bъъ044A044A044Aъ:I

    invoke-static {}, Lrrrrrr/rcrcrr;->bъъъъъ044A()I

    move-result v0

    sput v0, Lrrrrrr/rcrcrr;->b044Aъ044A044A044Aъ:I

    goto :goto_0
.end method

.method public static b044Aъъъъ044A()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bъ044Aъъъ044A()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bъъъъъ044A()I
    .locals 1

    const/16 v0, 0xd

    return v0
.end method
