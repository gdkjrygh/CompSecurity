.class Lcom/facebook/widget/d/e;
.super Ljava/lang/Object;
.source "QuickActionPopMenu.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/d/c;


# direct methods
.method constructor <init>(Lcom/facebook/widget/d/c;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/facebook/widget/d/e;->a:Lcom/facebook/widget/d/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 176
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/d/b;

    .line 177
    iget-object v1, p0, Lcom/facebook/widget/d/e;->a:Lcom/facebook/widget/d/c;

    invoke-virtual {v1}, Lcom/facebook/widget/d/c;->b()V

    .line 178
    iget-object v1, p0, Lcom/facebook/widget/d/e;->a:Lcom/facebook/widget/d/c;

    invoke-static {v1}, Lcom/facebook/widget/d/c;->b(Lcom/facebook/widget/d/c;)Lcom/facebook/widget/d/a;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 179
    iget-object v1, p0, Lcom/facebook/widget/d/e;->a:Lcom/facebook/widget/d/c;

    invoke-virtual {v0}, Lcom/facebook/widget/d/b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/facebook/widget/d/c;->a(Lcom/facebook/widget/d/c;Ljava/lang/String;)V

    .line 180
    iget-object v1, p0, Lcom/facebook/widget/d/e;->a:Lcom/facebook/widget/d/c;

    invoke-static {v1}, Lcom/facebook/widget/d/c;->b(Lcom/facebook/widget/d/c;)Lcom/facebook/widget/d/a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/widget/d/a;->a(Lcom/facebook/widget/d/b;)V

    .line 182
    :cond_0
    return-void
.end method
