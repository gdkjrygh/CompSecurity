.class final Lcom/roidapp/cloudlib/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;)V
    .locals 0

    .prologue
    .line 122
    iput-object p1, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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
    .line 128
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/common/c;->a()Z

    move-result v0

    if-nez v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    sget v2, Lcom/roidapp/cloudlib/at;->ag:I

    invoke-virtual {v1, v2}, Lcom/roidapp/cloudlib/t;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 139
    :cond_0
    :goto_0
    return-void

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->l:Lcom/roidapp/cloudlib/af;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iget-object v0, v0, Lcom/roidapp/cloudlib/t;->l:Lcom/roidapp/cloudlib/af;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/af;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iput p3, v0, Lcom/roidapp/cloudlib/t;->e:I

    .line 136
    iget-object v0, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iget-object v1, p0, Lcom/roidapp/cloudlib/v;->a:Lcom/roidapp/cloudlib/t;

    iget-object v1, v1, Lcom/roidapp/cloudlib/t;->d:Lcom/roidapp/cloudlib/ad;

    invoke-virtual {v1, p3}, Lcom/roidapp/cloudlib/ad;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/t;->a(Ljava/lang/String;)V

    goto :goto_0
.end method
