.class final Lcom/c/a/c/m;
.super Lcom/c/a/c/b;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/c/m$a;
    }
.end annotation


# instance fields
.field private final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Lcom/c/a/c/b;-><init>()V

    .line 48
    iput p1, p0, Lcom/c/a/c/m;->a:I

    .line 49
    return-void
.end method


# virtual methods
.method public final a()Lcom/c/a/c/k;
    .locals 2

    .prologue
    .line 56
    new-instance v0, Lcom/c/a/c/m$a;

    iget v1, p0, Lcom/c/a/c/m;->a:I

    invoke-direct {v0, v1}, Lcom/c/a/c/m$a;-><init>(I)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x0

    .line 66
    instance-of v1, p1, Lcom/c/a/c/m;

    if-eqz v1, :cond_0

    .line 67
    check-cast p1, Lcom/c/a/c/m;

    .line 68
    iget v1, p0, Lcom/c/a/c/m;->a:I

    iget v2, p1, Lcom/c/a/c/m;->a:I

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    .line 70
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iget v1, p0, Lcom/c/a/c/m;->a:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 61
    iget v0, p0, Lcom/c/a/c/m;->a:I

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Hashing.murmur3_128("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
