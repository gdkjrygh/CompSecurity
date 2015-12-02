.class Lcom/facebook/orca/common/ui/titlebar/r;
.super Ljava/lang/Object;
.source "TitleBar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V
    .locals 0

    .prologue
    .line 164
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/r;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/r;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Lcom/facebook/widget/d/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 168
    new-instance v0, Lcom/facebook/widget/d/c;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/r;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->d(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Landroid/view/ViewGroup;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/r;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v2}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->c(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Lcom/facebook/widget/d/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/d/c;-><init>(Landroid/view/View;Lcom/facebook/widget/d/a;)V

    .line 170
    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Lcom/facebook/widget/d/c;->a(I)V

    .line 171
    invoke-virtual {v0}, Lcom/facebook/widget/d/c;->a()V

    .line 173
    :cond_0
    return-void
.end method
