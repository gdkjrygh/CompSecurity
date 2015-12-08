.class final Lcom/roidapp/cloudlib/sns/basepost/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/basepost/ad;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/basepost/ad;)V
    .locals 0

    .prologue
    .line 525
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/basepost/am;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 529
    add-int/lit8 v0, p3, -0x1

    .line 530
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/am;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/basepost/ad;->l(Lcom/roidapp/cloudlib/sns/basepost/ad;)Lcom/roidapp/cloudlib/sns/basepost/w;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/basepost/w;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/a;

    .line 531
    if-nez v0, :cond_0

    .line 535
    :goto_0
    return-void

    .line 534
    :cond_0
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/basepost/am;->a:Lcom/roidapp/cloudlib/sns/basepost/ad;

    invoke-static {v1, p2, v0}, Lcom/roidapp/cloudlib/sns/basepost/ad;->a(Lcom/roidapp/cloudlib/sns/basepost/ad;Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/a;)V

    goto :goto_0
.end method
