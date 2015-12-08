.class public final Lorg/a/a/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/Object;

.field public static final b:[Ljava/lang/Class;

.field public static final c:[Ljava/lang/String;

.field public static final d:[J

.field public static final e:[Ljava/lang/Long;

.field public static final f:[I

.field public static final g:[Ljava/lang/Integer;

.field public static final h:[S

.field public static final i:[Ljava/lang/Short;

.field public static final j:[B

.field public static final k:[Ljava/lang/Byte;

.field public static final l:[D

.field public static final m:[Ljava/lang/Double;

.field public static final n:[F

.field public static final o:[Ljava/lang/Float;

.field public static final p:[Z

.field public static final q:[Ljava/lang/Boolean;

.field public static final r:[C

.field public static final s:[Ljava/lang/Character;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 49
    new-array v0, v1, [Ljava/lang/Object;

    sput-object v0, Lorg/a/a/b/a;->a:[Ljava/lang/Object;

    .line 53
    new-array v0, v1, [Ljava/lang/Class;

    sput-object v0, Lorg/a/a/b/a;->b:[Ljava/lang/Class;

    .line 57
    new-array v0, v1, [Ljava/lang/String;

    sput-object v0, Lorg/a/a/b/a;->c:[Ljava/lang/String;

    .line 61
    new-array v0, v1, [J

    sput-object v0, Lorg/a/a/b/a;->d:[J

    .line 65
    new-array v0, v1, [Ljava/lang/Long;

    sput-object v0, Lorg/a/a/b/a;->e:[Ljava/lang/Long;

    .line 69
    new-array v0, v1, [I

    sput-object v0, Lorg/a/a/b/a;->f:[I

    .line 73
    new-array v0, v1, [Ljava/lang/Integer;

    sput-object v0, Lorg/a/a/b/a;->g:[Ljava/lang/Integer;

    .line 77
    new-array v0, v1, [S

    sput-object v0, Lorg/a/a/b/a;->h:[S

    .line 81
    new-array v0, v1, [Ljava/lang/Short;

    sput-object v0, Lorg/a/a/b/a;->i:[Ljava/lang/Short;

    .line 85
    new-array v0, v1, [B

    sput-object v0, Lorg/a/a/b/a;->j:[B

    .line 89
    new-array v0, v1, [Ljava/lang/Byte;

    sput-object v0, Lorg/a/a/b/a;->k:[Ljava/lang/Byte;

    .line 93
    new-array v0, v1, [D

    sput-object v0, Lorg/a/a/b/a;->l:[D

    .line 97
    new-array v0, v1, [Ljava/lang/Double;

    sput-object v0, Lorg/a/a/b/a;->m:[Ljava/lang/Double;

    .line 101
    new-array v0, v1, [F

    sput-object v0, Lorg/a/a/b/a;->n:[F

    .line 105
    new-array v0, v1, [Ljava/lang/Float;

    sput-object v0, Lorg/a/a/b/a;->o:[Ljava/lang/Float;

    .line 109
    new-array v0, v1, [Z

    sput-object v0, Lorg/a/a/b/a;->p:[Z

    .line 113
    new-array v0, v1, [Ljava/lang/Boolean;

    sput-object v0, Lorg/a/a/b/a;->q:[Ljava/lang/Boolean;

    .line 117
    new-array v0, v1, [C

    sput-object v0, Lorg/a/a/b/a;->r:[C

    .line 121
    new-array v0, v1, [Ljava/lang/Character;

    sput-object v0, Lorg/a/a/b/a;->s:[Ljava/lang/Character;

    return-void
.end method

.method public static a([C)Z
    .locals 1

    .prologue
    .line 3276
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 320
    if-nez p0, :cond_0

    .line 321
    const/4 v0, 0x0

    .line 323
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;

    goto :goto_0
.end method

.method public static b([Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1403
    if-nez p0, :cond_1

    .line 1416
    :cond_0
    return-void

    .line 1406
    :cond_1
    const/4 v1, 0x0

    .line 1407
    array-length v0, p0

    add-int/lit8 v0, v0, -0x1

    .line 1409
    :goto_0
    if-le v0, v1, :cond_0

    .line 1410
    aget-object v2, p0, v0

    .line 1411
    aget-object v3, p0, v1

    aput-object v3, p0, v0

    .line 1412
    aput-object v2, p0, v1

    .line 1413
    add-int/lit8 v0, v0, -0x1

    .line 1414
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method
