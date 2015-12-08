.class public Lcom/roidapp/cloudlib/common/e;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 69
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 70
    const/4 v0, 0x0

    sget v1, Lcom/roidapp/cloudlib/au;->a:I

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/cloudlib/common/e;->setStyle(II)V

    .line 71
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/common/e;->setCancelable(Z)V

    .line 72
    return-void
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 76
    sget v0, Lcom/roidapp/cloudlib/as;->O:I

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 77
    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 79
    :cond_0
    return-object v0
.end method
