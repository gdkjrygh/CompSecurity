.class final Lcom/google/common/a/bi;
.super Ljava/lang/Object;
.source "Count.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation


# instance fields
.field private a:I


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/common/a/bi;-><init>(I)V

    .line 34
    return-void
.end method

.method constructor <init>(I)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lcom/google/common/a/bi;->a:I

    .line 38
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 41
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    return v0
.end method

.method public a(I)I
    .locals 2

    .prologue
    .line 45
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    .line 46
    add-int v1, v0, p1

    iput v1, p0, Lcom/google/common/a/bi;->a:I

    .line 47
    return v0
.end method

.method public b(I)I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/common/a/bi;->a:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 55
    iput p1, p0, Lcom/google/common/a/bi;->a:I

    .line 56
    return-void
.end method

.method public d(I)I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    .line 60
    iput p1, p0, Lcom/google/common/a/bi;->a:I

    .line 61
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 71
    instance-of v0, p1, Lcom/google/common/a/bi;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/common/a/bi;

    iget v0, p1, Lcom/google/common/a/bi;->a:I

    iget v1, p0, Lcom/google/common/a/bi;->a:I

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget v0, p0, Lcom/google/common/a/bi;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
