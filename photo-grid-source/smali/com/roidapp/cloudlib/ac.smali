.class final Lcom/roidapp/cloudlib/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/t;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/t;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lcom/roidapp/cloudlib/ac;->a:Lcom/roidapp/cloudlib/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 449
    iget-object v0, p0, Lcom/roidapp/cloudlib/ac;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ac;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 450
    iget-object v0, p0, Lcom/roidapp/cloudlib/ac;->a:Lcom/roidapp/cloudlib/t;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/t;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 453
    :cond_0
    return-void
.end method
