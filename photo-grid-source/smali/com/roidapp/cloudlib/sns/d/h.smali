.class final Lcom/roidapp/cloudlib/sns/d/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/d/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/d/f;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/d/h;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 219
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/h;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/f;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const-string v1, "FeedPublic"

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/app/Activity;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/d/h;->a:Lcom/roidapp/cloudlib/sns/d/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/d/f;->r()V

    .line 222
    :cond_0
    return-void
.end method
