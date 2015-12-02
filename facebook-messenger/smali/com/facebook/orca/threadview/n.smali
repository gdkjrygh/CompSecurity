.class Lcom/facebook/orca/threadview/n;
.super Ljava/lang/Object;
.source "MessageItemView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/facebook/orca/threadview/n;->a:Lcom/facebook/orca/threadview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/orca/threadview/n;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 228
    iget-object v0, p0, Lcom/facebook/orca/threadview/n;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/n;->a:Lcom/facebook/orca/threadview/l;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/l;->getRowMessageItem()Lcom/facebook/orca/threadview/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/r;->a(Lcom/facebook/orca/threadview/ad;)V

    .line 230
    :cond_0
    return-void
.end method
