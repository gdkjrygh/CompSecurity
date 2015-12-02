.class Lcom/facebook/orca/chatheads/eo;
.super Lcom/facebook/n/b;
.source "ViewDragDismissHelper.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/ek;


# direct methods
.method private constructor <init>(Lcom/facebook/orca/chatheads/ek;)V
    .locals 0

    .prologue
    .line 339
    iput-object p1, p0, Lcom/facebook/orca/chatheads/eo;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-direct {p0}, Lcom/facebook/n/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/chatheads/ek;Lcom/facebook/orca/chatheads/el;)V
    .locals 0

    .prologue
    .line 339
    invoke-direct {p0, p1}, Lcom/facebook/orca/chatheads/eo;-><init>(Lcom/facebook/orca/chatheads/ek;)V

    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 343
    invoke-virtual {p1}, Lcom/facebook/n/c;->c()D

    move-result-wide v0

    double-to-int v0, v0

    .line 344
    iget-object v1, p0, Lcom/facebook/orca/chatheads/eo;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/ek;->a(Lcom/facebook/orca/chatheads/ek;)Landroid/view/View;

    move-result-object v1

    int-to-float v0, v0

    invoke-static {v1, v0}, Lcom/a/c/a;->h(Landroid/view/View;F)V

    .line 345
    return-void
.end method

.method public c(Lcom/facebook/n/c;)V
    .locals 2

    .prologue
    .line 349
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eo;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ek;->b(Lcom/facebook/orca/chatheads/ek;)Lcom/facebook/orca/chatheads/em;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 350
    iget-object v0, p0, Lcom/facebook/orca/chatheads/eo;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/ek;->b(Lcom/facebook/orca/chatheads/ek;)Lcom/facebook/orca/chatheads/em;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/chatheads/eo;->a:Lcom/facebook/orca/chatheads/ek;

    invoke-interface {v0, v1}, Lcom/facebook/orca/chatheads/em;->b(Lcom/facebook/orca/chatheads/ek;)V

    .line 352
    :cond_0
    return-void
.end method
