.class public abstract Lkik/a/d/a/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(ZZ)V
    .locals 1

    .prologue
    .line 22
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/a/d/a/g;-><init>(ZZI)V

    .line 23
    return-void
.end method

.method public constructor <init>(ZZI)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-boolean p1, p0, Lkik/a/d/a/g;->b:Z

    .line 28
    iput p3, p0, Lkik/a/d/a/g;->a:I

    .line 29
    iput-boolean p2, p0, Lkik/a/d/a/g;->c:Z

    .line 30
    return-void
.end method

.method public static a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;
    .locals 3

    .prologue
    .line 40
    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    .line 42
    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 46
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Lkik/a/d/s;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 51
    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v3

    move v1, v2

    .line 52
    :goto_0
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 53
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    iget-boolean v0, v0, Lkik/a/d/a/g;->b:Z

    if-eqz v0, :cond_1

    .line 54
    const/4 v2, 0x1

    .line 57
    :cond_0
    return v2

    .line 52
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public static b(Lkik/a/d/s;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 68
    invoke-virtual {p0}, Lkik/a/d/s;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    :cond_0
    :goto_0
    return v2

    .line 73
    :cond_1
    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v3

    move v1, v2

    .line 74
    :goto_1
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 75
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    iget-boolean v0, v0, Lkik/a/d/a/g;->c:Z

    if-eqz v0, :cond_2

    .line 76
    const/4 v2, 0x1

    goto :goto_0

    .line 74
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1
.end method

.method public static c(Lkik/a/d/s;)I
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 84
    invoke-virtual {p0}, Lkik/a/d/s;->l()Ljava/util/Vector;

    move-result-object v3

    move v1, v0

    move v2, v0

    .line 86
    :goto_0
    invoke-virtual {v3}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 87
    invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/g;

    iget v0, v0, Lkik/a/d/a/g;->a:I

    or-int/2addr v2, v0

    .line 86
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 89
    :cond_0
    return v2
.end method
