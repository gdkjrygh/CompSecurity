.class public final Lcom/google/android/gms/internal/gm;
.super Ljava/lang/Object;


# static fields
.field static final uA:I

.field static final uB:I

.field public static final uC:[I

.field public static final uD:[J

.field public static final uE:[F

.field public static final uF:[D

.field public static final uG:[Z

.field public static final uH:[Ljava/lang/String;

.field public static final uI:[[B

.field public static final uJ:[B

.field static final uy:I

.field static final uz:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/gm;->e(II)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/gm;->uy:I

    const/4 v0, 0x4

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/gm;->e(II)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/gm;->uz:I

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/gm;->e(II)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/gm;->uA:I

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/gm;->e(II)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/gm;->uB:I

    new-array v0, v1, [I

    sput-object v0, Lcom/google/android/gms/internal/gm;->uC:[I

    new-array v0, v1, [J

    sput-object v0, Lcom/google/android/gms/internal/gm;->uD:[J

    new-array v0, v1, [F

    sput-object v0, Lcom/google/android/gms/internal/gm;->uE:[F

    new-array v0, v1, [D

    sput-object v0, Lcom/google/android/gms/internal/gm;->uF:[D

    new-array v0, v1, [Z

    sput-object v0, Lcom/google/android/gms/internal/gm;->uG:[Z

    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/internal/gm;->uH:[Ljava/lang/String;

    new-array v0, v1, [[B

    sput-object v0, Lcom/google/android/gms/internal/gm;->uI:[[B

    new-array v0, v1, [B

    sput-object v0, Lcom/google/android/gms/internal/gm;->uJ:[B

    return-void
.end method

.method static e(II)I
    .locals 1

    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method
