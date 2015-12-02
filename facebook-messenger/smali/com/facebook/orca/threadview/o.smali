.class Lcom/facebook/orca/threadview/o;
.super Ljava/lang/Object;
.source "MessageItemView.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 234
    iput-object p1, p0, Lcom/facebook/orca/threadview/o;->a:Lcom/facebook/orca/threadview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 237
    iget-object v0, p0, Lcom/facebook/orca/threadview/o;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/threadview/o;->a:Lcom/facebook/orca/threadview/l;

    invoke-static {v0}, Lcom/facebook/orca/threadview/l;->a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/o;->a:Lcom/facebook/orca/threadview/l;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/l;->getRowMessageItem()Lcom/facebook/orca/threadview/ad;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/r;->b(Lcom/facebook/orca/threadview/ad;)Z

    move-result v0

    .line 240
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
