.class final Lcom/roidapp/cloudlib/sns/notification/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/c;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/c;)V
    .locals 0

    .prologue
    .line 138
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/d;->a:Lcom/roidapp/cloudlib/sns/notification/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/d;->a:Lcom/roidapp/cloudlib/sns/notification/c;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/notification/c;->a:Lcom/roidapp/cloudlib/sns/notification/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/notification/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 143
    return-void
.end method
