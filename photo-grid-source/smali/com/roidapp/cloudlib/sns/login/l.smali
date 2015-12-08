.class final Lcom/roidapp/cloudlib/sns/login/l;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;)V
    .locals 0

    .prologue
    .line 70
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/login/l;->a:Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/l;->a:Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/login/l;->a:Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->b()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 74
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .prologue
    .line 79
    invoke-super {p0, p1}, Landroid/text/style/ClickableSpan;->updateDrawState(Landroid/text/TextPaint;)V

    .line 80
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setUnderlineText(Z)V

    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/login/l;->a:Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/LoginTipsTextView;->getCurrentHintTextColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 82
    return-void
.end method
