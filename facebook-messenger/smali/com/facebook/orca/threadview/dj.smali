.class Lcom/facebook/orca/threadview/dj;
.super Ljava/lang/Object;
.source "ThreadViewMessagesAdapterUpdater.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/dh;

.field private b:Ljava/util/SortedSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/SortedSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedSet",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadview/dh;)V
    .locals 1

    .prologue
    .line 45
    iput-object p1, p0, Lcom/facebook/orca/threadview/dj;->a:Lcom/facebook/orca/threadview/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-static {}, Lcom/google/common/a/kl;->c()Ljava/util/TreeSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/dj;->b:Ljava/util/SortedSet;

    .line 47
    invoke-static {}, Lcom/google/common/a/kl;->c()Ljava/util/TreeSet;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/dj;->c:Ljava/util/SortedSet;

    .line 48
    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/threadview/dh;Lcom/facebook/orca/threadview/di;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/dj;-><init>(Lcom/facebook/orca/threadview/dh;)V

    return-void
.end method

.method private a(ILjava/util/SortedSet;Z)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/SortedSet",
            "<",
            "Ljava/lang/Integer;",
            ">;Z)I"
        }
    .end annotation

    .prologue
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-interface {p2}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    .line 69
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 71
    if-ge v0, p1, :cond_0

    .line 72
    add-int/lit8 v0, v1, 0x1

    :goto_1
    move v1, v0

    .line 79
    goto :goto_0

    .line 73
    :cond_0
    if-eqz p3, :cond_1

    if-gt v0, p1, :cond_1

    .line 75
    add-int/lit8 v0, v1, 0x1

    goto :goto_1

    .line 80
    :cond_1
    return v1
.end method


# virtual methods
.method public a(I)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/facebook/orca/threadview/dj;->b:Ljava/util/SortedSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 52
    return-void
.end method

.method public b(I)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/threadview/dj;->c:Ljava/util/SortedSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/SortedSet;->add(Ljava/lang/Object;)Z

    .line 56
    return-void
.end method

.method public c(I)I
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/threadview/dj;->b:Ljava/util/SortedSet;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/dj;->a(ILjava/util/SortedSet;Z)I

    move-result v0

    return v0
.end method

.method public d(I)I
    .locals 2

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/threadview/dj;->c:Ljava/util/SortedSet;

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/dj;->a(ILjava/util/SortedSet;Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0xa

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1e

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 86
    iget-object v1, p0, Lcom/facebook/orca/threadview/dj;->b:Ljava/util/SortedSet;

    invoke-interface {v1}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 87
    const-string v2, "deleteSortedSet:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 89
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/threadview/dj;->c:Ljava/util/SortedSet;

    invoke-interface {v1}, Ljava/util/SortedSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 92
    const-string v2, "\nmarkDeleteSortedSet:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 94
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
