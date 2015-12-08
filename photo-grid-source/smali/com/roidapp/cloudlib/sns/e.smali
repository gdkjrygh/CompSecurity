.class final Lcom/roidapp/cloudlib/sns/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/d;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/e;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 77
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/e;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/e;->b:Lcom/roidapp/cloudlib/sns/d;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d;->dismiss()V

    .line 83
    :cond_0
    return-void
.end method
