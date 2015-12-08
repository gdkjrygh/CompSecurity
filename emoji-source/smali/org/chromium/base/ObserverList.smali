.class public Lorg/chromium/base/ObserverList;
.super Ljava/lang/Object;
.source "ObserverList.java"

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/base/ObserverList$1;,
        Lorg/chromium/base/ObserverList$ObserverListIterator;,
        Lorg/chromium/base/ObserverList$RewindableIterator;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<TE;>;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/NotThreadSafe;
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private mCount:I

.field private mIterationDepth:I

.field public final mObservers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<TE;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lorg/chromium/base/ObserverList;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/base/ObserverList;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    .line 47
    iput v1, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    .line 48
    iput v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    .line 50
    return-void
.end method

.method static synthetic access$100(Lorg/chromium/base/ObserverList;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/base/ObserverList;

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/chromium/base/ObserverList;->incrementIterationDepth()V

    return-void
.end method

.method static synthetic access$200(Lorg/chromium/base/ObserverList;)I
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/ObserverList;

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/chromium/base/ObserverList;->capacity()I

    move-result v0

    return v0
.end method

.method static synthetic access$300(Lorg/chromium/base/ObserverList;I)Ljava/lang/Object;
    .locals 1
    .param p0, "x0"    # Lorg/chromium/base/ObserverList;
    .param p1, "x1"    # I

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lorg/chromium/base/ObserverList;->getObserverAt(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$400(Lorg/chromium/base/ObserverList;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/base/ObserverList;

    .prologue
    .line 32
    invoke-direct {p0}, Lorg/chromium/base/ObserverList;->decrementIterationDepthAndCompactIfNeeded()V

    return-void
.end method

.method private capacity()I
    .locals 1

    .prologue
    .line 178
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget-object v0, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method private compact()V
    .locals 2

    .prologue
    .line 155
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    sget-boolean v1, Lorg/chromium/base/ObserverList;->$assertionsDisabled:Z

    if-nez v1, :cond_0

    iget v1, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 156
    :cond_0
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v0, v1, -0x1

    .local v0, "i":I
    :goto_0
    if-ltz v0, :cond_2

    .line 157
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 158
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 156
    :cond_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 161
    :cond_2
    return-void
.end method

.method private decrementIterationDepthAndCompactIfNeeded()V
    .locals 1

    .prologue
    .line 168
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    .line 169
    sget-boolean v0, Lorg/chromium/base/ObserverList;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 170
    :cond_0
    iget v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    if-nez v0, :cond_1

    invoke-direct {p0}, Lorg/chromium/base/ObserverList;->compact()V

    .line 171
    :cond_1
    return-void
.end method

.method private getObserverAt(I)Ljava/lang/Object;
    .locals 1
    .param p1, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 182
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget-object v0, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private incrementIterationDepth()V
    .locals 1

    .prologue
    .line 164
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    .line 165
    return-void
.end method


# virtual methods
.method public addObserver(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 62
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    .local p1, "obs":Ljava/lang/Object;, "TE;"
    if-eqz p1, :cond_0

    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 63
    :cond_0
    const/4 v1, 0x0

    .line 72
    :goto_0
    return v1

    .line 68
    :cond_1
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 69
    .local v0, "result":Z
    sget-boolean v1, Lorg/chromium/base/ObserverList;->$assertionsDisabled:Z

    if-nez v1, :cond_2

    if-nez v0, :cond_2

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 71
    :cond_2
    iget v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    .line 72
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public clear()V
    .locals 4

    .prologue
    .line 107
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    const/4 v2, 0x0

    iput v2, p0, Lorg/chromium/base/ObserverList;->mCount:I

    .line 109
    iget v2, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    if-nez v2, :cond_1

    .line 110
    iget-object v2, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 118
    :cond_0
    return-void

    .line 114
    :cond_1
    iget-object v2, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    .line 115
    .local v1, "size":I
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-ge v0, v1, :cond_0

    .line 116
    iget-object v2, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v0, v3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 115
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public hasObserver(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .line 103
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    .local p1, "obs":Ljava/lang/Object;, "TE;"
    iget-object v0, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 146
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget v0, p0, Lorg/chromium/base/ObserverList;->mCount:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 122
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    new-instance v0, Lorg/chromium/base/ObserverList$ObserverListIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/chromium/base/ObserverList$ObserverListIterator;-><init>(Lorg/chromium/base/ObserverList;Lorg/chromium/base/ObserverList$1;)V

    return-object v0
.end method

.method public removeObserver(Ljava/lang/Object;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)Z"
        }
    .end annotation

    .prologue
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    .local p1, "obs":Ljava/lang/Object;, "TE;"
    const/4 v1, 0x0

    .line 81
    if-nez p1, :cond_1

    .line 99
    :cond_0
    :goto_0
    return v1

    .line 85
    :cond_1
    iget-object v2, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    .line 86
    .local v0, "index":I
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 90
    iget v1, p0, Lorg/chromium/base/ObserverList;->mIterationDepth:I

    if-nez v1, :cond_2

    .line 92
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 96
    :goto_1
    iget v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    .line 97
    sget-boolean v1, Lorg/chromium/base/ObserverList;->$assertionsDisabled:Z

    if-nez v1, :cond_3

    iget v1, p0, Lorg/chromium/base/ObserverList;->mCount:I

    if-gez v1, :cond_3

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    .line 94
    :cond_2
    iget-object v1, p0, Lorg/chromium/base/ObserverList;->mObservers:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 99
    :cond_3
    const/4 v1, 0x1

    goto :goto_0
.end method

.method public rewindableIterator()Lorg/chromium/base/ObserverList$RewindableIterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/chromium/base/ObserverList$RewindableIterator",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 131
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    new-instance v0, Lorg/chromium/base/ObserverList$ObserverListIterator;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/chromium/base/ObserverList$ObserverListIterator;-><init>(Lorg/chromium/base/ObserverList;Lorg/chromium/base/ObserverList$1;)V

    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 139
    .local p0, "this":Lorg/chromium/base/ObserverList;, "Lorg/chromium/base/ObserverList<TE;>;"
    iget v0, p0, Lorg/chromium/base/ObserverList;->mCount:I

    return v0
.end method
