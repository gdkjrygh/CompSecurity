.class final Lcom/c/b/bq$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/c/b/bq;

.field private b:I

.field private c:Z

.field private d:Ljava/util/Iterator;


# direct methods
.method private constructor <init>(Lcom/c/b/bq;)V
    .locals 1

    .prologue
    .line 532
    iput-object p1, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 534
    const/4 v0, -0x1

    iput v0, p0, Lcom/c/b/bq$c;->b:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/bq;B)V
    .locals 0

    .prologue
    .line 532
    invoke-direct {p0, p1}, Lcom/c/b/bq$c;-><init>(Lcom/c/b/bq;)V

    return-void
.end method

.method private a()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 577
    iget-object v0, p0, Lcom/c/b/bq$c;->d:Ljava/util/Iterator;

    if-nez v0, :cond_0

    .line 578
    iget-object v0, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v0}, Lcom/c/b/bq;->c(Lcom/c/b/bq;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bq$c;->d:Ljava/util/Iterator;

    .line 580
    :cond_0
    iget-object v0, p0, Lcom/c/b/bq$c;->d:Ljava/util/Iterator;

    return-object v0
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .prologue
    .line 540
    iget v0, p0, Lcom/c/b/bq$c;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v1}, Lcom/c/b/bq;->b(Lcom/c/b/bq;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/c/b/bq$c;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 532
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/c/b/bq$c;->c:Z

    iget v0, p0, Lcom/c/b/bq$c;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/c/b/bq$c;->b:I

    iget-object v1, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v1}, Lcom/c/b/bq;->b(Lcom/c/b/bq;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v0}, Lcom/c/b/bq;->b(Lcom/c/b/bq;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/c/b/bq$c;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/c/b/bq$c;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    goto :goto_0
.end method

.method public final remove()V
    .locals 3

    .prologue
    .line 557
    iget-boolean v0, p0, Lcom/c/b/bq$c;->c:Z

    if-nez v0, :cond_0

    .line 558
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() was called before next()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 560
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/c/b/bq$c;->c:Z

    .line 561
    iget-object v0, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v0}, Lcom/c/b/bq;->a(Lcom/c/b/bq;)V

    .line 563
    iget v0, p0, Lcom/c/b/bq$c;->b:I

    iget-object v1, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    invoke-static {v1}, Lcom/c/b/bq;->b(Lcom/c/b/bq;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 564
    iget-object v0, p0, Lcom/c/b/bq$c;->a:Lcom/c/b/bq;

    iget v1, p0, Lcom/c/b/bq$c;->b:I

    add-int/lit8 v2, v1, -0x1

    iput v2, p0, Lcom/c/b/bq$c;->b:I

    invoke-static {v0, v1}, Lcom/c/b/bq;->a(Lcom/c/b/bq;I)Ljava/lang/Object;

    .line 568
    :goto_0
    return-void

    .line 566
    :cond_1
    invoke-direct {p0}, Lcom/c/b/bq$c;->a()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0
.end method
