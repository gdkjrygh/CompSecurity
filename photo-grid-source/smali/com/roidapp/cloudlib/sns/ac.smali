.class final Lcom/roidapp/cloudlib/sns/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/ab;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/ab;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/ac;->a:Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 64
    const/4 v0, 0x3

    if-ne p2, v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ac;->a:Lcom/roidapp/cloudlib/sns/ab;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/ab;->a(Lcom/roidapp/cloudlib/sns/ab;)Lcom/roidapp/cloudlib/sns/ae;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ac;->a:Lcom/roidapp/cloudlib/sns/ab;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/ab;->a(Lcom/roidapp/cloudlib/sns/ab;)Lcom/roidapp/cloudlib/sns/ae;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/ae;->a()V

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/ac;->a:Lcom/roidapp/cloudlib/sns/ab;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->c()Z

    .line 69
    const/4 v0, 0x1

    .line 71
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
