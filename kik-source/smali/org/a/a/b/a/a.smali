.class public final Lorg/a/a/b/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/ThreadLocal;


# instance fields
.field private final b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 108
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lorg/a/a/b/a/a;->a:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 516
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 509
    const/4 v0, 0x0

    iput v0, p0, Lorg/a/a/b/a/a;->c:I

    .line 517
    const/16 v0, 0x25

    iput v0, p0, Lorg/a/a/b/a/a;->b:I

    .line 518
    const/16 v0, 0x11

    iput v0, p0, Lorg/a/a/b/a/a;->c:I

    .line 519
    return-void
.end method


# virtual methods
.method public final a([B)Lorg/a/a/b/a/a;
    .locals 5

    .prologue
    .line 629
    if-nez p1, :cond_1

    .line 630
    iget v0, p0, Lorg/a/a/b/a/a;->c:I

    iget v1, p0, Lorg/a/a/b/a/a;->b:I

    mul-int/2addr v0, v1

    iput v0, p0, Lorg/a/a/b/a/a;->c:I

    .line 636
    :cond_0
    return-object p0

    .line 632
    :cond_1
    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-byte v2, p1, v0

    .line 633
    iget v3, p0, Lorg/a/a/b/a/a;->c:I

    iget v4, p0, Lorg/a/a/b/a/a;->b:I

    mul-int/2addr v3, v4

    add-int/2addr v2, v3

    iput v2, p0, Lorg/a/a/b/a/a;->c:I

    .line 632
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public final hashCode()I
    .locals 1

    .prologue
    .line 958
    iget v0, p0, Lorg/a/a/b/a/a;->c:I

    return v0
.end method
