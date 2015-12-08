.class Lorg/chromium/base/ObserverList$ObserverListIterator;
.super Ljava/lang/Object;
.source "ObserverList.java"

# interfaces
.implements Lorg/chromium/base/ObserverList$RewindableIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/base/ObserverList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ObserverListIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lorg/chromium/base/ObserverList$RewindableIterator",
        "<TE;>;"
    }
.end annotation


# instance fields
.field private mIndex:I

.field private mIsExhausted:Z

.field private mListEndMarker:I

.field final synthetic this$0:Lorg/chromium/base/ObserverList;


# direct methods
.method private constructor <init>(Lorg/chromium/base/ObserverList;)V
    .locals 1

    .prologue
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    const/4 v0, 0x0

    .line 190
    iput-object p1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    iput v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    .line 188
    iput-boolean v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIsExhausted:Z

    .line 191
    # invokes: Lorg/chromium/base/ObserverList;->incrementIterationDepth()V
    invoke-static {p1}, Lorg/chromium/base/ObserverList;->access$100(Lorg/chromium/base/ObserverList;)V

    .line 192
    # invokes: Lorg/chromium/base/ObserverList;->capacity()I
    invoke-static {p1}, Lorg/chromium/base/ObserverList;->access$200(Lorg/chromium/base/ObserverList;)I

    move-result v0

    iput v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    .line 193
    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/base/ObserverList;Lorg/chromium/base/ObserverList$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/base/ObserverList;
    .param p2, "x1"    # Lorg/chromium/base/ObserverList$1;

    .prologue
    .line 185
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    invoke-direct {p0, p1}, Lorg/chromium/base/ObserverList$ObserverListIterator;-><init>(Lorg/chromium/base/ObserverList;)V

    return-void
.end method

.method private compactListIfNeeded()V
    .locals 1

    .prologue
    .line 237
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    iget-boolean v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIsExhausted:Z

    if-nez v0, :cond_0

    .line 238
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIsExhausted:Z

    .line 239
    iget-object v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    # invokes: Lorg/chromium/base/ObserverList;->decrementIterationDepthAndCompactIfNeeded()V
    invoke-static {v0}, Lorg/chromium/base/ObserverList;->access$400(Lorg/chromium/base/ObserverList;)V

    .line 241
    :cond_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    .prologue
    .line 206
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    iget v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    .line 207
    .local v0, "lookupIndex":I
    :goto_0
    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    # invokes: Lorg/chromium/base/ObserverList;->getObserverAt(I)Ljava/lang/Object;
    invoke-static {v1, v0}, Lorg/chromium/base/ObserverList;->access$300(Lorg/chromium/base/ObserverList;I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 209
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 211
    :cond_0
    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    if-ge v0, v1, :cond_1

    const/4 v1, 0x1

    .line 215
    :goto_1
    return v1

    .line 214
    :cond_1
    invoke-direct {p0}, Lorg/chromium/base/ObserverList$ObserverListIterator;->compactListIfNeeded()V

    .line 215
    const/4 v1, 0x0

    goto :goto_1
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 221
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    :goto_0
    iget v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    # invokes: Lorg/chromium/base/ObserverList;->getObserverAt(I)Ljava/lang/Object;
    invoke-static {v0, v1}, Lorg/chromium/base/ObserverList;->access$300(Lorg/chromium/base/ObserverList;I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 222
    iget v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    goto :goto_0

    .line 224
    :cond_0
    iget v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    iget v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    # invokes: Lorg/chromium/base/ObserverList;->getObserverAt(I)Ljava/lang/Object;
    invoke-static {v0, v1}, Lorg/chromium/base/ObserverList;->access$300(Lorg/chromium/base/ObserverList;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 227
    :cond_1
    invoke-direct {p0}, Lorg/chromium/base/ObserverList$ObserverListIterator;->compactListIfNeeded()V

    .line 228
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 233
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public rewind()V
    .locals 2

    .prologue
    .local p0, "this":Lorg/chromium/base/ObserverList$ObserverListIterator;, "Lorg/chromium/base/ObserverList<TE;>.ObserverListIterator;"
    const/4 v1, 0x0

    .line 197
    invoke-direct {p0}, Lorg/chromium/base/ObserverList$ObserverListIterator;->compactListIfNeeded()V

    .line 198
    iget-object v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    # invokes: Lorg/chromium/base/ObserverList;->incrementIterationDepth()V
    invoke-static {v0}, Lorg/chromium/base/ObserverList;->access$100(Lorg/chromium/base/ObserverList;)V

    .line 199
    iget-object v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->this$0:Lorg/chromium/base/ObserverList;

    # invokes: Lorg/chromium/base/ObserverList;->capacity()I
    invoke-static {v0}, Lorg/chromium/base/ObserverList;->access$200(Lorg/chromium/base/ObserverList;)I

    move-result v0

    iput v0, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mListEndMarker:I

    .line 200
    iput-boolean v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIsExhausted:Z

    .line 201
    iput v1, p0, Lorg/chromium/base/ObserverList$ObserverListIterator;->mIndex:I

    .line 202
    return-void
.end method
