.class final Lcom/c/b/bo$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/bo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Stack;

.field private b:Lcom/c/b/ba;


# direct methods
.method private constructor <init>(Lcom/c/b/f;)V
    .locals 1

    .prologue
    .line 723
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 719
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lcom/c/b/bo$a;->a:Ljava/util/Stack;

    .line 724
    invoke-direct {p0, p1}, Lcom/c/b/bo$a;->a(Lcom/c/b/f;)Lcom/c/b/ba;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/bo$a;->b:Lcom/c/b/ba;

    .line 725
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/f;B)V
    .locals 0

    .prologue
    .line 717
    invoke-direct {p0, p1}, Lcom/c/b/bo$a;-><init>(Lcom/c/b/f;)V

    return-void
.end method

.method private a(Lcom/c/b/f;)Lcom/c/b/ba;
    .locals 2

    .prologue
    .line 728
    move-object v0, p1

    :goto_0
    instance-of v1, v0, Lcom/c/b/bo;

    if-eqz v1, :cond_0

    .line 730
    check-cast v0, Lcom/c/b/bo;

    .line 731
    iget-object v1, p0, Lcom/c/b/bo$a;->a:Ljava/util/Stack;

    invoke-virtual {v1, v0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 732
    invoke-static {v0}, Lcom/c/b/bo;->a(Lcom/c/b/bo;)Lcom/c/b/f;

    move-result-object v0

    goto :goto_0

    .line 734
    :cond_0
    check-cast v0, Lcom/c/b/ba;

    return-object v0
.end method

.method private b()Lcom/c/b/ba;
    .locals 2

    .prologue
    .line 741
    :cond_0
    iget-object v0, p0, Lcom/c/b/bo$a;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 742
    const/4 v0, 0x0

    .line 746
    :goto_0
    return-object v0

    .line 744
    :cond_1
    iget-object v0, p0, Lcom/c/b/bo$a;->a:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/bo;

    invoke-static {v0}, Lcom/c/b/bo;->b(Lcom/c/b/bo;)Lcom/c/b/f;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/c/b/bo$a;->a(Lcom/c/b/f;)Lcom/c/b/ba;

    move-result-object v0

    .line 745
    invoke-virtual {v0}, Lcom/c/b/ba;->d()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lcom/c/b/ba;
    .locals 2

    .prologue
    .line 762
    iget-object v0, p0, Lcom/c/b/bo$a;->b:Lcom/c/b/ba;

    if-nez v0, :cond_0

    .line 763
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    .line 765
    :cond_0
    iget-object v0, p0, Lcom/c/b/bo$a;->b:Lcom/c/b/ba;

    .line 766
    invoke-direct {p0}, Lcom/c/b/bo$a;->b()Lcom/c/b/ba;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/bo$a;->b:Lcom/c/b/ba;

    .line 767
    return-object v0
.end method

.method public final hasNext()Z
    .locals 1

    .prologue
    .line 753
    iget-object v0, p0, Lcom/c/b/bo$a;->b:Lcom/c/b/ba;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final synthetic next()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 717
    invoke-virtual {p0}, Lcom/c/b/bo$a;->a()Lcom/c/b/ba;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 1

    .prologue
    .line 771
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
