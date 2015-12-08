.class final Lcom/roidapp/cloudlib/sns/notification/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/s;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/s;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/u;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/u;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 96
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/u;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 100
    :goto_0
    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/u;->a:Lcom/roidapp/cloudlib/sns/notification/s;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/s;->onRefresh()V

    goto :goto_0
.end method
