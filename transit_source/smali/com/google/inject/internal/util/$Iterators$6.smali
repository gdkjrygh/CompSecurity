.class final Lcom/google/inject/internal/util/$Iterators$6;
.super Lcom/google/inject/internal/util/$UnmodifiableIterator;
.source "Iterators.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/inject/internal/util/$Iterators;->forArray([Ljava/lang/Object;)Lcom/google/inject/internal/util/$UnmodifiableIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/inject/internal/util/$UnmodifiableIterator",
        "<TT;>;"
    }
.end annotation


# instance fields
.field i:I

.field final length:I

.field final synthetic val$array:[Ljava/lang/Object;


# direct methods
.method constructor <init>([Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 230
    iput-object p1, p0, Lcom/google/inject/internal/util/$Iterators$6;->val$array:[Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/inject/internal/util/$UnmodifiableIterator;-><init>()V

    .line 231
    iget-object v0, p0, Lcom/google/inject/internal/util/$Iterators$6;->val$array:[Ljava/lang/Object;

    array-length v0, v0

    iput v0, p0, Lcom/google/inject/internal/util/$Iterators$6;->length:I

    .line 232
    const/4 v0, 0x0

    iput v0, p0, Lcom/google/inject/internal/util/$Iterators$6;->i:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    .line 234
    iget v0, p0, Lcom/google/inject/internal/util/$Iterators$6;->i:I

    iget v1, p0, Lcom/google/inject/internal/util/$Iterators$6;->length:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public next()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 239
    :try_start_0
    iget-object v2, p0, Lcom/google/inject/internal/util/$Iterators$6;->val$array:[Ljava/lang/Object;

    iget v3, p0, Lcom/google/inject/internal/util/$Iterators$6;->i:I

    aget-object v1, v2, v3

    .line 240
    .local v1, "t":Ljava/lang/Object;, "TT;"
    iget v2, p0, Lcom/google/inject/internal/util/$Iterators$6;->i:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/google/inject/internal/util/$Iterators$6;->i:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    return-object v1

    .line 242
    .end local v1    # "t":Ljava/lang/Object;, "TT;"
    :catch_0
    move-exception v0

    .line 243
    .local v0, "e":Ljava/lang/ArrayIndexOutOfBoundsException;
    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-direct {v2}, Ljava/util/NoSuchElementException;-><init>()V

    throw v2
.end method
