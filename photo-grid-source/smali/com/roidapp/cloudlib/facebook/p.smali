.class final Lcom/roidapp/cloudlib/facebook/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/EditText;

.field final synthetic b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Landroid/widget/EditText;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/p;->b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/facebook/p;->a:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 120
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/p;->a:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/p;->b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 122
    return-void
.end method
