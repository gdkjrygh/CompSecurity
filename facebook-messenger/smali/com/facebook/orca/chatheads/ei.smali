.class Lcom/facebook/orca/chatheads/ei;
.super Lcom/facebook/n/b;
.source "SpringyPositioner.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ef;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/ef;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/ef;Lcom/facebook/orca/chatheads/eg;)V
    .locals 0

    .prologue
    .line 265
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/ei;-><init>(Lcom/facebook/orca/chatheads/ef;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    .line 269
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 270
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;D)V

    .line 274
    :cond_0
    :goto_0
    return-void

    .line 271
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ef;D)V

    goto :goto_0
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 278
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->c(Lcom/facebook/orca/chatheads/ef;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 279
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->c(Lcom/facebook/orca/chatheads/ef;)Lcom/google/common/d/a/ab;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 280
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ei;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;Lcom/google/common/d/a/ab;)Lcom/google/common/d/a/ab;

    .line 282
    :cond_0
    return-void
.end method
