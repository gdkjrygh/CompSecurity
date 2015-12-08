.class Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;
.super Lcom/google/inject/internal/util/$UnmodifiableIterator;
.source "ImmutableCollection.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->iterator()Lcom/google/inject/internal/util/$UnmodifiableIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/util/$UnmodifiableIterator",
        "<TE;>;"
    }
.end annotation


# instance fields
.field i:I

.field final synthetic this$0:Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;


# direct methods
.method constructor <init>(Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;)V
    .locals 1

    .prologue
    .line 224
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection.1;"
    iput-object p1, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->this$0:Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;

    invoke-direct {p0}, Lcom/google/inject/internal/util/$UnmodifiableIterator;-><init>()V

    .line 225
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->i:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    .line 227
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection.1;"
    iget v0, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->i:I

    iget-object v1, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->this$0:Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;

    # getter for: Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->elements:[Ljava/lang/Object;
    invoke-static {v1}, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->access$300(Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;)[Ljava/lang/Object;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 230
    .local p0, "this":Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;, "Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection.1;"
    invoke-virtual {p0}, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 231
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->this$0:Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;

    # getter for: Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->elements:[Ljava/lang/Object;
    invoke-static {v0}, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;->access$300(Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->i:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/inject/internal/util/$ImmutableCollection$ArrayImmutableCollection$1;->i:I

    aget-object v0, v0, v1

    return-object v0
.end method
