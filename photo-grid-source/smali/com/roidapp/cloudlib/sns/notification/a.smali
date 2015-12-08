.class public final Lcom/roidapp/cloudlib/sns/notification/a;
.super Landroid/text/style/ClickableSpan;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Landroid/view/View$OnClickListener;


# virtual methods
.method public final a(Z)V
    .locals 0

    .prologue
    .line 27
    iput-boolean p1, p0, Lcom/roidapp/cloudlib/sns/notification/a;->a:Z

    .line 28
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->f:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 38
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 39
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->e:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 40
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->f:Landroid/view/View$OnClickListener;

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 43
    :cond_0
    return-void
.end method

.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .prologue
    .line 47
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->a:Z

    if-eqz v0, :cond_0

    .line 48
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->c:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    .line 52
    :goto_0
    return-void

    .line 50
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/notification/a;->b:I

    invoke-virtual {p1, v0}, Landroid/text/TextPaint;->setColor(I)V

    goto :goto_0
.end method
