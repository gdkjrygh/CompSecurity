.class public final Lcom/google/android/gms/internal/kw;
.super Ljava/lang/Object;


# static fields
.field public static final aea:[I

.field public static final aeb:[J

.field public static final aec:[F

.field public static final aed:[D

.field public static final aee:[Z

.field public static final aef:[Ljava/lang/String;

.field public static final aeg:[[B

.field public static final aeh:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/kw;->aea:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/kw;->aeb:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/kw;->aec:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/kw;->aed:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/kw;->aee:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/kw;->aef:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/kw;->aeg:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/kw;->aeh:[B

    return-void
.end method

.method public static final b(Lcom/google/android/gms/internal/kn;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kn;->getPosition()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kn;->cQ(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/kn;->ms()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/kn;->mh()I

    move-result v2

    if-eq v2, p1, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/kn;->cT(I)V

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/kn;->cQ(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static de(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static df(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method static l(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method
