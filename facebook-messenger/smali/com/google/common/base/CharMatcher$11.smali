.class final Lcom/google/common/base/CharMatcher$11;
.super Lcom/google/common/base/CharMatcher;
.source "CharMatcher.java"


# instance fields
.field final synthetic val$chars:[C


# direct methods
.method constructor <init>([C)V
    .locals 0

    .prologue
    .line 482
    iput-object p1, p0, Lcom/google/common/base/CharMatcher$11;->val$chars:[C

    invoke-direct {p0}, Lcom/google/common/base/CharMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 482
    check-cast p1, Ljava/lang/Character;

    invoke-super {p0, p1}, Lcom/google/common/base/CharMatcher;->apply(Ljava/lang/Character;)Z

    move-result v0

    return v0
.end method

.method public matches(C)Z
    .locals 1

    .prologue
    .line 484
    iget-object v0, p0, Lcom/google/common/base/CharMatcher$11;->val$chars:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method setBits(Lcom/google/common/base/CharMatcher$LookupTable;)V
    .locals 4

    .prologue
    .line 488
    iget-object v1, p0, Lcom/google/common/base/CharMatcher$11;->val$chars:[C

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-char v3, v1, v0

    .line 489
    invoke-virtual {p1, v3}, Lcom/google/common/base/CharMatcher$LookupTable;->set(C)V

    .line 488
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 491
    :cond_0
    return-void
.end method
