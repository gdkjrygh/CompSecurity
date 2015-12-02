.class public abstract Lcom/qihoo/security/dialog/AbsDialogActivity;
.super Lcom/qihoo/security/app/BaseSimpleActivity;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/d;


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Lcom/qihoo/security/locale/d;

.field private c:Lcom/qihoo/security/dialog/DialogView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseSimpleActivity;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    .line 23
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->b:Lcom/qihoo/security/locale/d;

    return-void
.end method

.method private c()V
    .locals 4

    .prologue
    .line 54
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->a()Landroid/view/View;

    move-result-object v0

    .line 55
    iget-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v1}, Lcom/qihoo/security/dialog/DialogView;->getMessageTextView()Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    .line 56
    iget-object v2, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v2}, Lcom/qihoo/security/dialog/DialogView;->getContentView()Landroid/widget/FrameLayout;

    move-result-object v2

    .line 57
    if-eqz v0, :cond_1

    if-eqz v2, :cond_1

    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 59
    if-eqz v3, :cond_2

    .line 60
    invoke-virtual {v2, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    :goto_0
    if-eqz v1, :cond_0

    .line 65
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 67
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 69
    :cond_1
    return-void

    .line 62
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->d()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method private d()Landroid/widget/FrameLayout$LayoutParams;
    .locals 3

    .prologue
    .line 72
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 74
    const/16 v1, 0x10

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 75
    return-object v0
.end method


# virtual methods
.method protected abstract a()Landroid/view/View;
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 108
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setDialogIcon(I)V

    .line 109
    return-void
.end method

.method protected b()Lcom/qihoo/security/dialog/DialogView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    return-object v0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/DialogView;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 27
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseSimpleActivity;->onCreate(Landroid/os/Bundle;)V

    .line 28
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->a:Landroid/content/Context;

    .line 29
    new-instance v0, Lcom/qihoo/security/dialog/DialogView;

    iget-object v1, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/dialog/DialogView;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->setContentView(Landroid/view/View;)V

    .line 31
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogActivity;->c()V

    .line 32
    return-void
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 41
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setButtonText([I)V

    .line 46
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setButtonText([Ljava/lang/CharSequence;)V

    .line 51
    return-void
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 95
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setDialogMessage(I)V

    .line 96
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 91
    return-void
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setDialogTitle(I)V

    .line 86
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/dialog/AbsDialogActivity;->c:Lcom/qihoo/security/dialog/DialogView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/dialog/DialogView;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 81
    return-void
.end method
