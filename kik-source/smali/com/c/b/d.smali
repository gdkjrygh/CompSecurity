.class abstract Lcom/c/b/d;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/au$c;


# instance fields
.field private a:Z


# direct methods
.method constructor <init>()V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 54
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/d;->a:Z

    .line 55
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .prologue
    .line 89
    iget-boolean v0, p0, Lcom/c/b/d;->a:Z

    return v0
.end method

.method public add(ILjava/lang/Object;)V
    .locals 0

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 66
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->add(ILjava/lang/Object;)V

    .line 67
    return-void
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 60
    invoke-super {p0, p1}, Ljava/util/AbstractList;->add(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public addAll(ILjava/util/Collection;)Z
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 78
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->addAll(ILjava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 71
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 72
    invoke-super {p0, p1}, Ljava/util/AbstractList;->addAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/d;->a:Z

    .line 95
    return-void
.end method

.method protected final c()V
    .locals 1

    .prologue
    .line 132
    iget-boolean v0, p0, Lcom/c/b/d;->a:Z

    if-nez v0, :cond_0

    .line 133
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    .line 135
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 0

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 84
    invoke-super {p0}, Ljava/util/AbstractList;->clear()V

    .line 85
    return-void
.end method

.method public remove(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 99
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 100
    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 106
    invoke-super {p0, p1}, Ljava/util/AbstractList;->remove(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 112
    invoke-super {p0, p1}, Ljava/util/AbstractList;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 118
    invoke-super {p0, p1}, Ljava/util/AbstractList;->retainAll(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method

.method public set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 123
    invoke-virtual {p0}, Lcom/c/b/d;->c()V

    .line 124
    invoke-super {p0, p1, p2}, Ljava/util/AbstractList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
