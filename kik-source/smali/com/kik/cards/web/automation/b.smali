.class final Lcom/kik/cards/web/automation/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/automation/a;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/automation/a;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/kik/cards/web/automation/b;->a:Lcom/kik/cards/web/automation/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    .line 69
    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/automation/b;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v0}, Lcom/kik/cards/web/automation/a;->a(Lcom/kik/cards/web/automation/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/a/a/b/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    iget-object v1, p0, Lcom/kik/cards/web/automation/b;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v1}, Lcom/kik/cards/web/automation/a;->b(Lcom/kik/cards/web/automation/a;)Lcom/kik/cards/web/bd;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "javascript:window.automation.setSyncValue(eval(\'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\'));"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kik/cards/web/bd;->loadUrl(Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/kik/cards/web/automation/b;->a:Lcom/kik/cards/web/automation/a;

    invoke-static {v0}, Lcom/kik/cards/web/automation/a;->c(Lcom/kik/cards/web/automation/a;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    const/4 v0, 0x1

    .line 81
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
