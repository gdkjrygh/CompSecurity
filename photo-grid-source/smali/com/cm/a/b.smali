.class final Lcom/cm/a/b;
.super Lcom/cm/a/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/cm/a/d",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/cm/a/a;


# direct methods
.method constructor <init>(Lcom/cm/a/a;)V
    .locals 0

    .prologue
    .line 699
    iput-object p1, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-direct {p0}, Lcom/cm/a/d;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()I
    .locals 1

    .prologue
    .line 702
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    iget v0, v0, Lcom/cm/a/a;->i:I

    return v0
.end method

.method protected final a(Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 712
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {v0}, Lcom/cm/a/a;->a()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/cm/a/a;->a(Ljava/lang/Object;I)I

    move-result v0

    goto :goto_0
.end method

.method protected final a(II)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 707
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    iget-object v0, v0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    shl-int/lit8 v1, p1, 0x1

    add-int/2addr v1, p2

    aget-object v0, v0, v1

    return-object v0
.end method

.method protected final a(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .prologue
    .line 732
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    .line 1397
    shl-int/lit8 v1, p1, 0x1

    add-int/lit8 v1, v1, 0x1

    .line 1398
    iget-object v2, v0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    aget-object v2, v2, v1

    .line 1399
    iget-object v0, v0, Lcom/cm/a/a;->h:[Ljava/lang/Object;

    aput-object p2, v0, v1

    .line 732
    return-object v2
.end method

.method protected final a(I)V
    .locals 1

    .prologue
    .line 737
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {v0, p1}, Lcom/cm/a/a;->a(I)Ljava/lang/Object;

    .line 738
    return-void
.end method

.method protected final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 727
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {v0, p1, p2}, Lcom/cm/a/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 728
    return-void
.end method

.method protected final b(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 717
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {v0, p1}, Lcom/cm/a/a;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method protected final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 722
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    return-object v0
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 742
    iget-object v0, p0, Lcom/cm/a/b;->a:Lcom/cm/a/a;

    invoke-virtual {v0}, Lcom/cm/a/a;->clear()V

    .line 743
    return-void
.end method
