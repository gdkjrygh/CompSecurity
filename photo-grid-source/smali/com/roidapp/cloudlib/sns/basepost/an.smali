.class final Lcom/roidapp/cloudlib/sns/basepost/an;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 538
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/an;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    .prologue
    .line 542
    add-int/lit8 v0, p3, -0x1

    .line 544
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/an;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 545
    if-nez v0, :cond_0

    .line 546
    const/4 v0, 0x0

    .line 549
    :goto_0
    return v0

    .line 548
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/an;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1, p2, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/a;)V

    .line 549
    const/4 v0, 0x1

    goto :goto_0
.end method
