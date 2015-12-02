.class public final Lcom/fasterxml/jackson/core/sym/NameN;
.super Lcom/fasterxml/jackson/core/sym/Name;
.source "NameN.java"


# instance fields
.field final mQuadLen:I

.field final mQuads:[I


# direct methods
.method constructor <init>(Ljava/lang/String;I[II)V
    .locals 2

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Lcom/fasterxml/jackson/core/sym/Name;-><init>(Ljava/lang/String;I)V

    .line 19
    const/4 v0, 0x3

    if-ge p4, v0, :cond_0

    .line 20
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Qlen must >= 3"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 22
    :cond_0
    iput-object p3, p0, Lcom/fasterxml/jackson/core/sym/NameN;->mQuads:[I

    .line 23
    iput p4, p0, Lcom/fasterxml/jackson/core/sym/NameN;->mQuadLen:I

    .line 24
    return-void
.end method


# virtual methods
.method public equals(I)Z
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    return v0
.end method

.method public equals(II)Z
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    return v0
.end method

.method public equals([II)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 37
    iget v1, p0, Lcom/fasterxml/jackson/core/sym/NameN;->mQuadLen:I

    if-eq p2, v1, :cond_1

    .line 66
    :cond_0
    :goto_0
    return v0

    :cond_1
    move v1, v0

    .line 61
    :goto_1
    if-ge v1, p2, :cond_2

    .line 62
    aget v2, p1, v1

    iget-object v3, p0, Lcom/fasterxml/jackson/core/sym/NameN;->mQuads:[I

    aget v3, v3, v1

    if-ne v2, v3, :cond_0

    .line 61
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 66
    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method
