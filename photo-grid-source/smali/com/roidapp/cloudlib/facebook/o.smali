.class final Lcom/roidapp/cloudlib/facebook/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/facebook/t;

.field final synthetic b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;Lcom/roidapp/cloudlib/facebook/t;)V
    .locals 0

    .prologue
    .line 101
    iput-object p1, p0, Lcom/roidapp/cloudlib/facebook/o;->b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/facebook/o;->a:Lcom/roidapp/cloudlib/facebook/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/o;->a:Lcom/roidapp/cloudlib/facebook/t;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/facebook/t;->a(Ljava/lang/String;)V

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/o;->b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 109
    :goto_0
    return-void

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/facebook/o;->b:Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;->a(Lcom/roidapp/cloudlib/facebook/FbFriendListActivity;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 112
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 115
    return-void
.end method
