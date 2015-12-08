.class public abstract Lkik/android/net/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/android/e/e;


# instance fields
.field protected a:I

.field protected b:Ljava/util/List;

.field private c:I

.field private d:I

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput v3, p0, Lkik/android/net/a/b;->c:I

    .line 15
    iput v3, p0, Lkik/android/net/a/b;->d:I

    .line 16
    iput v3, p0, Lkik/android/net/a/b;->e:I

    .line 17
    iput v3, p0, Lkik/android/net/a/b;->a:I

    .line 18
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Integer;

    const/16 v1, 0x19c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const/4 v1, 0x1

    const/16 v2, 0x19d

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lkik/android/net/a/b;->b:Ljava/util/List;

    .line 19
    iput-boolean v3, p0, Lkik/android/net/a/b;->f:Z

    return-void
.end method

.method protected static b(I)Z
    .locals 1

    .prologue
    .line 44
    const/16 v0, 0x19a

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected abstract a(I)Z
.end method

.method abstract c()I
.end method

.method final c(I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 61
    const/16 v2, 0xc8

    if-ne p1, v2, :cond_0

    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    .line 75
    :goto_1
    return v0

    :cond_0
    move v2, v1

    .line 61
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {p1}, Lkik/android/net/a/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    iget v0, p0, Lkik/android/net/a/b;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/net/a/b;->a:I

    :goto_2
    move v0, v1

    .line 75
    goto :goto_1

    .line 68
    :cond_2
    invoke-virtual {p0, p1}, Lkik/android/net/a/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 69
    iget v0, p0, Lkik/android/net/a/b;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/net/a/b;->d:I

    goto :goto_2

    .line 72
    :cond_3
    iget v0, p0, Lkik/android/net/a/b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/net/a/b;->e:I

    goto :goto_2
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()V
.end method

.method final f()V
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lkik/android/net/a/b;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/net/a/b;->c:I

    .line 57
    return-void
.end method

.method g()Z
    .locals 2

    .prologue
    .line 80
    iget-boolean v0, p0, Lkik/android/net/a/b;->f:Z

    if-nez v0, :cond_0

    iget v0, p0, Lkik/android/net/a/b;->e:I

    if-gtz v0, :cond_0

    iget v0, p0, Lkik/android/net/a/b;->d:I

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    iget v0, p0, Lkik/android/net/a/b;->c:I

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method h()V
    .locals 1

    .prologue
    .line 85
    iget v0, p0, Lkik/android/net/a/b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lkik/android/net/a/b;->e:I

    .line 86
    return-void
.end method

.method public abstract i()V
.end method

.method public abstract j()V
.end method

.method public abstract k()V
.end method

.method public abstract l()Lcom/kik/g/p;
.end method

.method public abstract m()J
.end method
