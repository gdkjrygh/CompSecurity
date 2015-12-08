.class final Lcom/bumptech/glide/g/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/bumptech/glide/g/b;",
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

.field public static final enum g:I

.field public static final enum h:I

.field private static final synthetic i:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 42
    sput v3, Lcom/bumptech/glide/g/b;->a:I

    .line 44
    sput v4, Lcom/bumptech/glide/g/b;->b:I

    .line 46
    sput v5, Lcom/bumptech/glide/g/b;->c:I

    .line 48
    sput v6, Lcom/bumptech/glide/g/b;->d:I

    .line 50
    sput v7, Lcom/bumptech/glide/g/b;->e:I

    .line 52
    const/4 v0, 0x6

    sput v0, Lcom/bumptech/glide/g/b;->f:I

    .line 54
    const/4 v0, 0x7

    sput v0, Lcom/bumptech/glide/g/b;->g:I

    .line 56
    const/16 v0, 0x8

    sput v0, Lcom/bumptech/glide/g/b;->h:I

    .line 40
    const/16 v0, 0x8

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lcom/bumptech/glide/g/b;->a:I

    aput v2, v0, v1

    sget v1, Lcom/bumptech/glide/g/b;->b:I

    aput v1, v0, v3

    sget v1, Lcom/bumptech/glide/g/b;->c:I

    aput v1, v0, v4

    sget v1, Lcom/bumptech/glide/g/b;->d:I

    aput v1, v0, v5

    sget v1, Lcom/bumptech/glide/g/b;->e:I

    aput v1, v0, v6

    sget v1, Lcom/bumptech/glide/g/b;->f:I

    aput v1, v0, v7

    const/4 v1, 0x6

    sget v2, Lcom/bumptech/glide/g/b;->g:I

    aput v2, v0, v1

    const/4 v1, 0x7

    sget v2, Lcom/bumptech/glide/g/b;->h:I

    aput v2, v0, v1

    sput-object v0, Lcom/bumptech/glide/g/b;->i:[I

    return-void
.end method
