.class public abstract Lcom/c/a/b/m;
.super Lcom/c/a/b/k;
.source "SourceFile"

# interfaces
.implements Ljava/util/List;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/a/b/m$a;,
        Lcom/c/a/b/m$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/c/a/b/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lcom/c/a/b/ag;

    sget-object v1, Lcom/c/a/b/ae;->a:[Ljava/lang/Object;

    invoke-direct {v0, v1}, Lcom/c/a/b/ag;-><init>([Ljava/lang/Object;)V

    sput-object v0, Lcom/c/a/b/m;->a:Lcom/c/a/b/m;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 335
    invoke-direct {p0}, Lcom/c/a/b/k;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/c/a/b/m;
    .locals 3

    .prologue
    .line 225
    invoke-static {p0}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/Collection;

    instance-of v0, p0, Lcom/c/a/b/k;

    if-eqz v0, :cond_1

    check-cast p0, Lcom/c/a/b/k;

    invoke-virtual {p0}, Lcom/c/a/b/k;->c()Lcom/c/a/b/m;

    move-result-object v0

    invoke-virtual {v0}, Lcom/c/a/b/m;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/c/a/b/m;->toArray()[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v1}, Lcom/c/a/b/m;->b([Ljava/lang/Object;I)Lcom/c/a/b/m;

    move-result-object v0

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-interface {p0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/b/ae;->a([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    invoke-static {v0, v1}, Lcom/c/a/b/m;->b([Ljava/lang/Object;I)Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v0, Lcom/c/a/b/m;->a:Lcom/c/a/b/m;

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v1}, Lcom/c/a/b/m;->a(Ljava/lang/Object;)Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0

    :cond_4
    new-instance v2, Lcom/c/a/b/m$a;

    invoke-direct {v2}, Lcom/c/a/b/m$a;-><init>()V

    invoke-virtual {v2, v1}, Lcom/c/a/b/m$a;->c(Ljava/lang/Object;)Lcom/c/a/b/m$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/c/a/b/m$a;->b(Ljava/util/Iterator;)Lcom/c/a/b/m$a;

    move-result-object v0

    iget-object v1, v0, Lcom/c/a/b/m$a;->a:[Ljava/lang/Object;

    iget v0, v0, Lcom/c/a/b/m$a;->b:I

    invoke-static {v1, v0}, Lcom/c/a/b/m;->b([Ljava/lang/Object;I)Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Ljava/lang/Object;)Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 89
    new-instance v0, Lcom/c/a/b/al;

    invoke-direct {v0, p0}, Lcom/c/a/b/al;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method static a([Ljava/lang/Object;)Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 312
    array-length v0, p0

    invoke-static {p0, v0}, Lcom/c/a/b/m;->b([Ljava/lang/Object;I)Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method

.method private static b([Ljava/lang/Object;I)Lcom/c/a/b/m;
    .locals 2

    .prologue
    .line 320
    packed-switch p1, :pswitch_data_0

    .line 328
    array-length v0, p0

    if-ge p1, v0, :cond_0

    .line 329
    invoke-static {p0, p1}, Lcom/c/a/b/ae;->b([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    .line 331
    :cond_0
    new-instance v0, Lcom/c/a/b/ag;

    invoke-direct {v0, p0}, Lcom/c/a/b/ag;-><init>([Ljava/lang/Object;)V

    :goto_0
    return-object v0

    .line 322
    :pswitch_0
    sget-object v0, Lcom/c/a/b/m;->a:Lcom/c/a/b/m;

    goto :goto_0

    .line 325
    :pswitch_1
    new-instance v0, Lcom/c/a/b/al;

    const/4 v1, 0x0

    aget-object v1, p0, v1

    invoke-direct {v0, v1}, Lcom/c/a/b/al;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    .line 320
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static f()Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 77
    sget-object v0, Lcom/c/a/b/m;->a:Lcom/c/a/b/m;

    return-object v0
.end method


# virtual methods
.method a([Ljava/lang/Object;I)I
    .locals 4

    .prologue
    .line 494
    invoke-virtual {p0}, Lcom/c/a/b/m;->size()I

    move-result v1

    .line 495
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 496
    add-int v2, p2, v0

    invoke-virtual {p0, v0}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, p1, v2

    .line 495
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 498
    :cond_0
    add-int v0, p2, v1

    return v0
.end method

.method public a()Lcom/c/a/b/ao;
    .locals 1

    .prologue
    .line 340
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method public a(I)Lcom/c/a/b/ap;
    .locals 2

    .prologue
    .line 348
    new-instance v0, Lcom/c/a/b/n;

    invoke-virtual {p0}, Lcom/c/a/b/m;->size()I

    move-result v1

    invoke-direct {v0, p0, v1, p1}, Lcom/c/a/b/n;-><init>(Lcom/c/a/b/m;II)V

    return-object v0
.end method

.method public a(II)Lcom/c/a/b/m;
    .locals 1

    .prologue
    .line 381
    invoke-virtual {p0}, Lcom/c/a/b/m;->size()I

    move-result v0

    invoke-static {p1, p2, v0}, Lcom/c/a/a/u;->a(III)V

    .line 382
    sub-int v0, p2, p1

    .line 383
    packed-switch v0, :pswitch_data_0

    .line 389
    invoke-virtual {p0, p1, p2}, Lcom/c/a/b/m;->b(II)Lcom/c/a/b/m;

    move-result-object v0

    :goto_0
    return-object v0

    .line 385
    :pswitch_0
    sget-object v0, Lcom/c/a/b/m;->a:Lcom/c/a/b/m;

    goto :goto_0

    .line 387
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/c/a/b/m;->a(Ljava/lang/Object;)Lcom/c/a/b/m;

    move-result-object v0

    goto :goto_0

    .line 383
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final add(ILjava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 467
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 443
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method b(II)Lcom/c/a/b/m;
    .locals 2

    .prologue
    .line 399
    new-instance v0, Lcom/c/a/b/m$b;

    sub-int v1, p2, p1

    invoke-direct {v0, p0, p1, v1}, Lcom/c/a/b/m$b;-><init>(Lcom/c/a/b/m;II)V

    return-object v0
.end method

.method public final c()Lcom/c/a/b/m;
    .locals 0

    .prologue
    .line 488
    return-object p0
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 368
    invoke-virtual {p0, p1}, Lcom/c/a/b/m;->indexOf(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v0, 0x1

    .line 567
    invoke-static {p0}, Lcom/c/a/a/u;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ne v1, v2, :cond_2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/c/a/b/w;->a(Ljava/util/Iterator;Ljava/util/Iterator;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    .prologue
    .line 571
    const/4 v1, 0x1

    .line 572
    invoke-virtual {p0}, Lcom/c/a/b/m;->size()I

    move-result v2

    .line 573
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    .line 574
    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0, v0}, Lcom/c/a/b/m;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v1, v3

    .line 576
    xor-int/lit8 v1, v1, -0x1

    xor-int/lit8 v1, v1, -0x1

    .line 573
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 579
    :cond_0
    return v1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 358
    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/c/a/a/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    :goto_0
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0}, Lcom/c/a/b/m;->a()Lcom/c/a/b/ao;

    move-result-object v0

    return-object v0
.end method

.method public lastIndexOf(Ljava/lang/Object;)I
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 363
    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/c/a/a/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    :goto_0
    return v0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method public synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0, p1}, Lcom/c/a/b/m;->a(I)Lcom/c/a/b/ap;

    move-result-object v0

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 479
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 455
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public synthetic subList(II)Ljava/util/List;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0, p1, p2}, Lcom/c/a/b/m;->a(II)Lcom/c/a/b/m;

    move-result-object v0

    return-object v0
.end method
