.class public final Lcom/google/android/gms/internal/mh;
.super Ljava/lang/Object;


# static fields
.field public static final and:[I

.field public static final ane:[J

.field public static final anf:[F

.field public static final ang:[D

.field public static final anh:[Z

.field public static final ani:[Ljava/lang/String;

.field public static final anj:[[B

.field public static final ank:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/mh;->and:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/mh;->ane:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/mh;->anf:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/mh;->ang:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/mh;->anh:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/mh;->ani:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/mh;->anj:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/mh;->ank:[B

    return-void
.end method

.method public static final b(Lcom/google/android/gms/internal/ly;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ly;->getPosition()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ly;->ev(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ly;->nN()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ly;->nB()I

    move-result v2

    if-eq v2, p1, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ly;->ez(I)V

    return v0

    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ly;->ev(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method static eN(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static eO(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method static u(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method
