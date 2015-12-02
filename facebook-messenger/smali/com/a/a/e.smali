.class Lcom/a/a/e;
.super Lcom/a/a/c;
.source "AnimatorSet.java"


# instance fields
.field a:Z

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/a/a/d;


# direct methods
.method constructor <init>(Lcom/a/a/d;Ljava/util/ArrayList;)V
    .locals 1

    .prologue
    .line 504
    iput-object p1, p0, Lcom/a/a/e;->c:Lcom/a/a/d;

    iput-object p2, p0, Lcom/a/a/e;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Lcom/a/a/c;-><init>()V

    .line 505
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/a/a/e;->a:Z

    return-void
.end method


# virtual methods
.method public b(Lcom/a/a/a;)V
    .locals 4

    .prologue
    .line 510
    iget-boolean v0, p0, Lcom/a/a/e;->a:Z

    if-nez v0, :cond_0

    .line 511
    iget-object v0, p0, Lcom/a/a/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 512
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 513
    iget-object v0, p0, Lcom/a/a/e;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/a/a/j;

    .line 514
    iget-object v3, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v3}, Lcom/a/a/a;->a()V

    .line 515
    iget-object v3, p0, Lcom/a/a/e;->c:Lcom/a/a/d;

    invoke-static {v3}, Lcom/a/a/d;->a(Lcom/a/a/d;)Ljava/util/ArrayList;

    move-result-object v3

    iget-object v0, v0, Lcom/a/a/j;->a:Lcom/a/a/a;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 512
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 518
    :cond_0
    return-void
.end method

.method public c(Lcom/a/a/a;)V
    .locals 1

    .prologue
    .line 507
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/a/a/e;->a:Z

    .line 508
    return-void
.end method
