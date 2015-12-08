.class public final Lb/a/a/a/a/c/i;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:I

.field public static final enum b:I

.field public static final enum c:I

.field public static final enum d:I

.field private static final synthetic e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v0, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    .line 24
    sput v3, Lb/a/a/a/a/c/i;->a:I

    .line 25
    sput v4, Lb/a/a/a/a/c/i;->b:I

    .line 26
    sput v5, Lb/a/a/a/a/c/i;->c:I

    .line 27
    sput v0, Lb/a/a/a/a/c/i;->d:I

    .line 23
    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Lb/a/a/a/a/c/i;->a:I

    aput v2, v0, v1

    sget v1, Lb/a/a/a/a/c/i;->b:I

    aput v1, v0, v3

    sget v1, Lb/a/a/a/a/c/i;->c:I

    aput v1, v0, v4

    sget v1, Lb/a/a/a/a/c/i;->d:I

    aput v1, v0, v5

    sput-object v0, Lb/a/a/a/a/c/i;->e:[I

    return-void
.end method

.method static a(Lb/a/a/a/a/c/n;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 38
    instance-of v0, p1, Lb/a/a/a/a/c/n;

    if-eqz v0, :cond_0

    .line 39
    check-cast p1, Lb/a/a/a/a/c/n;

    invoke-interface {p1}, Lb/a/a/a/a/c/n;->a()I

    move-result v0

    .line 44
    :goto_0
    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0}, Lb/a/a/a/a/c/n;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    sub-int/2addr v0, v1

    return v0

    .line 41
    :cond_0
    sget v0, Lb/a/a/a/a/c/i;->b:I

    goto :goto_0
.end method
