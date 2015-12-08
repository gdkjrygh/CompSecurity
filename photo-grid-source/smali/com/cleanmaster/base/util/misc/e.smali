.class final Lcom/cleanmaster/base/util/misc/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field final a:I

.field b:I

.field c:I

.field d:Z

.field final synthetic e:Lcom/cleanmaster/base/util/misc/d;


# direct methods
.method constructor <init>(Lcom/cleanmaster/base/util/misc/d;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    iput-object p1, p0, Lcom/cleanmaster/base/util/misc/e;->e:Lcom/cleanmaster/base/util/misc/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-boolean v0, p0, Lcom/cleanmaster/base/util/misc/e;->d:Z

    .line 42
    iput v0, p0, Lcom/cleanmaster/base/util/misc/e;->a:I

    .line 43
    invoke-virtual {p1}, Lcom/cleanmaster/base/util/misc/d;->a()I

    move-result v0

    iput v0, p0, Lcom/cleanmaster/base/util/misc/e;->b:I

    .line 44
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .prologue
    .line 48
    iget v0, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    iget v1, p0, Lcom/cleanmaster/base/util/misc/e;->b:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/e;->e:Lcom/cleanmaster/base/util/misc/d;

    iget v1, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    invoke-virtual {v0, v1}, Lcom/cleanmaster/base/util/misc/d;->a(I)Ljava/lang/Object;

    move-result-object v0

    .line 54
    iget v1, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    .line 55
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/cleanmaster/base/util/misc/e;->d:Z

    .line 56
    return-object v0
.end method

.method public final remove()V
    .locals 2

    .prologue
    .line 61
    iget-boolean v0, p0, Lcom/cleanmaster/base/util/misc/e;->d:Z

    if-nez v0, :cond_0

    .line 62
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 64
    :cond_0
    iget v0, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    .line 65
    iget v0, p0, Lcom/cleanmaster/base/util/misc/e;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/cleanmaster/base/util/misc/e;->b:I

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cleanmaster/base/util/misc/e;->d:Z

    .line 67
    iget-object v0, p0, Lcom/cleanmaster/base/util/misc/e;->e:Lcom/cleanmaster/base/util/misc/d;

    iget v1, p0, Lcom/cleanmaster/base/util/misc/e;->c:I

    invoke-virtual {v0, v1}, Lcom/cleanmaster/base/util/misc/d;->b(I)V

    .line 68
    return-void
.end method
