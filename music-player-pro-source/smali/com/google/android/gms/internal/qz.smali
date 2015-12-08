.class public final Lcom/google/android/gms/internal/qz;
.super Ljava/lang/Object;


# static fields
.field public static final azj:[I

.field public static final azk:[J

.field public static final azl:[F

.field public static final azm:[D

.field public static final azn:[Z

.field public static final azo:[Ljava/lang/String;

.field public static final azp:[[B

.field public static final azq:[B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/qz;->azj:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/qz;->azk:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/qz;->azl:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/qz;->azm:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/qz;->azn:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/qz;->azo:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/qz;->azp:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/qz;->azq:[B

    return-void
.end method

.method public static final b(Lcom/google/android/gms/internal/qo;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qo;->getPosition()I

    move-result v1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qo;->gQ(I)Z

    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/qo;->rz()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/qo;->gQ(I)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/qo;->gU(I)V

    return v0
.end method

.method static hk(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static hl(I)I
    .locals 1

    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method

.method static y(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method
