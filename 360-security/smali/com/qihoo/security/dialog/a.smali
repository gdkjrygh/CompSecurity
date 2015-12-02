.class public abstract Lcom/qihoo/security/dialog/a;
.super Landroid/app/Dialog;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/d;


# instance fields
.field public a:Lcom/qihoo/security/locale/d;

.field private b:Lcom/qihoo/security/dialog/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 48
    const v0, 0x7f0d00f5

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    .line 26
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/a;->a:Lcom/qihoo/security/locale/d;

    .line 50
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->d()V

    .line 52
    new-instance v0, Lcom/qihoo/security/dialog/DialogView;

    invoke-direct {v0, p1}, Lcom/qihoo/security/dialog/DialogView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    .line 53
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    check-cast v0, Landroid/view/View;

    .line 54
    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/a;->setContentView(Landroid/view/View;)V

    .line 55
    invoke-direct {p0}, Lcom/qihoo/security/dialog/a;->c()V

    .line 56
    return-void
.end method

.method private c()V
    .locals 3

    .prologue
    .line 77
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/a;->a()Landroid/view/View;

    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v1}, Lcom/qihoo/security/dialog/f;->getMessageTextView()Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    .line 79
    iget-object v2, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v2}, Lcom/qihoo/security/dialog/f;->getContentView()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 80
    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    .line 81
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 82
    if-eqz v1, :cond_0

    .line 83
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 85
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 87
    :cond_1
    return-void
.end method


# virtual methods
.method protected abstract a()Landroid/view/View;
.end method

.method public b()Lcom/qihoo/security/dialog/f;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    return-object v0
.end method

.method public dismiss()V
    .locals 1

    .prologue
    .line 135
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/a;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    :cond_0
    :goto_0
    return-void

    .line 138
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0}, Lcom/qihoo/security/dialog/f;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 35
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setButtonText([I)V

    .line 40
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 44
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setButtonText([Ljava/lang/CharSequence;)V

    .line 45
    return-void
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 106
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setDialogMessage(I)V

    .line 107
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 102
    return-void
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setDialogTitle(I)V

    .line 97
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/qihoo/security/dialog/a;->b:Lcom/qihoo/security/dialog/f;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/f;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 92
    return-void
.end method

.method public show()V
    .locals 3

    .prologue
    .line 127
    :try_start_0
    invoke-super {p0}, Landroid/app/Dialog;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :goto_0
    return-void

    .line 128
    :catch_0
    move-exception v0

    .line 129
    const-string/jumbo v1, "AbsDialog"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
