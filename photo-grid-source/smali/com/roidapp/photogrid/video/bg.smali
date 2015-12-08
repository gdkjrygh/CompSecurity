.class public final Lcom/roidapp/photogrid/video/bg;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/photogrid/video/bg;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field public static final enum e:I

.field public static final enum f:I

.field private static final synthetic g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 252
    sput v3, Lcom/roidapp/photogrid/video/bg;->a:I

    .line 253
    sput v4, Lcom/roidapp/photogrid/video/bg;->b:I

    .line 254
    sput v5, Lcom/roidapp/photogrid/video/bg;->c:I

    .line 255
    sput v6, Lcom/roidapp/photogrid/video/bg;->d:I

    .line 256
    sput v7, Lcom/roidapp/photogrid/video/bg;->e:I

    .line 257
    const/4 v0, 0x6

    sput v0, Lcom/roidapp/photogrid/video/bg;->f:I

    .line 251
    const/4 v0, 0x6

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/roidapp/photogrid/video/bg;->a:I

    aput v2, v0, v1

    sget v1, Lcom/roidapp/photogrid/video/bg;->b:I

    aput v1, v0, v3

    sget v1, Lcom/roidapp/photogrid/video/bg;->c:I

    aput v1, v0, v4

    sget v1, Lcom/roidapp/photogrid/video/bg;->d:I

    aput v1, v0, v5

    sget v1, Lcom/roidapp/photogrid/video/bg;->e:I

    aput v1, v0, v6

    sget v1, Lcom/roidapp/photogrid/video/bg;->f:I

    aput v1, v0, v7

    sput-object v0, Lcom/roidapp/photogrid/video/bg;->g:[I

    return-void
.end method
