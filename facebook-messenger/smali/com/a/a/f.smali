.class Lcom/a/a/f;
.super Ljava/lang/Object;
.source "AnimatorSet.java"

# interfaces
.implements Lcom/a/a/b;


# instance fields
.field final synthetic a:Lcom/a/a/d;

.field private b:Lcom/a/a/d;


# direct methods
.method constructor <init>(Lcom/a/a/d;Lcom/a/a/d;)V
    .locals 0

    .prologue
    .line 707
    iput-object p1, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 708
    iput-object p2, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    .line 709
    return-void
.end method


# virtual methods
.method public a(Lcom/a/a/a;)V
    .locals 0

    .prologue
    .line 766
    return-void
.end method

.method public b(Lcom/a/a/a;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    .line 728
    invoke-virtual {p1, p0}, Lcom/a/a/a;->b(Lcom/a/a/b;)V

    .line 729
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    invoke-static {v0}, Lcom/a/a/d;->a(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 730
    iget-object v0, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    invoke-static {v0}, Lcom/a/a/d;->b(Lcom/a/a/d;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 731
    iput-boolean v1, v0, Lcom/a/a/j;->f:Z

    .line 732
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-boolean v0, v0, Lcom/a/a/d;->b:Z

    if-nez v0, :cond_2

    .line 735
    iget-object v0, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    invoke-static {v0}, Lcom/a/a/d;->c(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v4

    .line 737
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    move v2, v3

    .line 738
    :goto_0
    if-ge v2, v5, :cond_3

    .line 739
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    iget-boolean v0, v0, Lcom/a/a/j;->f:Z

    if-nez v0, :cond_0

    move v0, v3

    .line 744
    :goto_1
    if-eqz v0, :cond_2

    .line 747
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-object v0, v0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 748
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-object v0, v0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 750
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v2, v3

    .line 751
    :goto_2
    if-ge v2, v4, :cond_1

    .line 752
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/a/a/b;

    iget-object v5, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    invoke-interface {v1, v5}, Lcom/a/a/b;->b(Lcom/a/a/a;)V

    .line 751
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    .line 738
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 755
    :cond_1
    iget-object v0, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    invoke-static {v0, v3}, Lcom/a/a/d;->a(Lcom/a/a/d;Z)Z

    .line 758
    :cond_2
    return-void

    :cond_3
    move v0, v1

    goto :goto_1
.end method

.method public c(Lcom/a/a/a;)V
    .locals 4

    .prologue
    .line 712
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-boolean v0, v0, Lcom/a/a/d;->b:Z

    if-nez v0, :cond_0

    .line 715
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    invoke-static {v0}, Lcom/a/a/d;->a(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 716
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-object v0, v0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 717
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-object v0, v0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 718
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 719
    iget-object v0, p0, Lcom/a/a/f;->a:Lcom/a/a/d;

    iget-object v0, v0, Lcom/a/a/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/b;

    iget-object v3, p0, Lcom/a/a/f;->b:Lcom/a/a/d;

    invoke-interface {v0, v3}, Lcom/a/a/b;->c(Lcom/a/a/a;)V

    .line 718
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 724
    :cond_0
    return-void
.end method

.method public d(Lcom/a/a/a;)V
    .locals 0

    .prologue
    .line 762
    return-void
.end method
