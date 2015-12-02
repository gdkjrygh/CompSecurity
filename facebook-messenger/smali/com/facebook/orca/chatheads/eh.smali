.class Lcom/facebook/orca/chatheads/eh;
.super Ljava/lang/Object;
.source "SpringyPositioner.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/ej;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ef;

.field private b:D

.field private c:D


# direct methods
.method public constructor <init>(Lcom/facebook/orca/chatheads/ef;DD)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 291
    iput-wide p2, p0, Lcom/facebook/orca/chatheads/eh;->b:D

    .line 292
    iput-wide p4, p0, Lcom/facebook/orca/chatheads/eh;->c:D

    .line 293
    return-void
.end method


# virtual methods
.method public a(DD)V
    .locals 3

    .prologue
    .line 297
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->d(Lcom/facebook/orca/chatheads/ef;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 307
    :cond_0
    :goto_0
    return-void

    .line 301
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/chatheads/eh;->b:D

    add-double/2addr v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 302
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    iget-wide v1, p0, Lcom/facebook/orca/chatheads/eh;->c:D

    add-double/2addr v1, p3

    invoke-virtual {v0, v1, v2}, Lcom/facebook/n/c;->b(D)Lcom/facebook/n/c;

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->c(Lcom/facebook/orca/chatheads/ef;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->a(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->b(Lcom/facebook/orca/chatheads/ef;)Lcom/facebook/n/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/n/c;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 305
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eh;->a:Lcom/facebook/orca/chatheads/ef;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ef;->c(Lcom/facebook/orca/chatheads/ef;)Lcom/google/common/d/a/ab;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    goto :goto_0
.end method
