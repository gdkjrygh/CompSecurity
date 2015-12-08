.class public final Lcom/b/a/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:I

.field static final b:I

.field static final c:I

.field static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 172
    const/16 v0, 0xb

    sput v0, Lcom/b/a/y;->a:I

    .line 174
    const/16 v0, 0xc

    sput v0, Lcom/b/a/y;->b:I

    .line 176
    const/16 v0, 0x10

    sput v0, Lcom/b/a/y;->c:I

    .line 178
    const/16 v0, 0x1a

    sput v0, Lcom/b/a/y;->d:I

    return-void
.end method

.method public static a(I)I
    .locals 1

    .prologue
    .line 79
    and-int/lit8 v0, p0, 0x7

    return v0
.end method

.method public static a(II)I
    .locals 1

    .prologue
    .line 89
    shl-int/lit8 v0, p0, 0x3

    or-int/2addr v0, p1

    return v0
.end method

.method public static b(I)I
    .locals 1

    .prologue
    .line 84
    ushr-int/lit8 v0, p0, 0x3

    return v0
.end method
