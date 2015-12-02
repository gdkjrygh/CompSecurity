.class Lcom/facebook/orca/chatheads/cc;
.super Lcom/facebook/n/b;
.source "ChatHeadsFullView.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ca;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/ca;)V
    .locals 0

    .prologue
    .line 237
    iput-object p1, p0, Lcom/facebook/orca/chatheads/cc;->a:Lcom/facebook/orca/chatheads/ca;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/ca;Lcom/facebook/orca/chatheads/cb;)V
    .locals 0

    .prologue
    .line 237
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/cc;-><init>(Lcom/facebook/orca/chatheads/ca;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 3

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cc;->a:Lcom/facebook/orca/chatheads/ca;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ca;->b(Lcom/facebook/orca/chatheads/ca;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v1

    double-to-float v1, v1

    invoke-static {v0, v1}, Lcom/a/c/a;->a(Landroid/view/View;F)V

    .line 241
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 245
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cc;->a:Lcom/facebook/orca/chatheads/ca;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ca;->c(Lcom/facebook/orca/chatheads/ca;)Lcom/google/common/d/a/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cc;->a:Lcom/facebook/orca/chatheads/ca;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ca;->c(Lcom/facebook/orca/chatheads/ca;)Lcom/google/common/d/a/ab;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 248
    :cond_0
    return-void
.end method
