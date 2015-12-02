.class public Lcom/facebook/common/w/s;
.super Ljava/lang/Object;
.source "Tuple.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T0:",
        "Ljava/lang/Object;",
        "T1:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT0;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT0;TT1;)V"
        }
    .end annotation

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    .line 18
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 37
    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/facebook/common/w/s;

    if-nez v1, :cond_1

    .line 62
    :cond_0
    :goto_0
    return v0

    .line 43
    :cond_1
    check-cast p1, Lcom/facebook/common/w/s;

    .line 50
    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    iget-object v2, p1, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    iget-object v2, p1, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    :cond_2
    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    iget-object v2, p1, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    if-eq v1, v2, :cond_3

    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    iget-object v2, p1, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 62
    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 22
    const/4 v0, 0x0

    .line 24
    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 25
    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 27
    :cond_0
    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 28
    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    .line 31
    :cond_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 67
    const-string v0, "<"

    .line 68
    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/w/s;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    if-eqz v1, :cond_1

    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/common/w/s;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 75
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    return-object v0
.end method
