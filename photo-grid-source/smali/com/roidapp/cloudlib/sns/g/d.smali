.class public abstract Lcom/roidapp/cloudlib/sns/g/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(II)I
    .locals 1

    .prologue
    .line 11
    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_0

    .line 14
    :goto_0
    return p1

    :cond_0
    move p1, p0

    goto :goto_0
.end method

.method static a(IIZ)I
    .locals 1

    .prologue
    .line 26
    const/high16 v0, -0x80000000

    if-ne p0, v0, :cond_2

    .line 27
    if-eqz p2, :cond_1

    add-int/lit8 v0, p1, 0x1

    .line 32
    :goto_0
    if-gez v0, :cond_0

    .line 33
    const/4 v0, 0x0

    .line 35
    :cond_0
    return v0

    .line 27
    :cond_1
    add-int/lit8 v0, p1, -0x1

    goto :goto_0

    .line 30
    :cond_2
    if-eqz p2, :cond_3

    add-int/lit8 v0, p0, 0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v0, p0, -0x1

    goto :goto_0
.end method
