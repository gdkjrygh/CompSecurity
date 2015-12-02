.class public Lcom/facebook/orca/nux/NuxSmsIntroView;
.super Lcom/facebook/orca/nux/e;
.source "NuxSmsIntroView.java"


# instance fields
.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/Button;

.field private f:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0, p1}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;)V

    .line 32
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/orca/nux/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 36
    sget v0, Lcom/facebook/k;->orca_nux_sms_intro:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->setContentView(I)V

    .line 37
    sget v0, Lcom/facebook/i;->nux_sms_intro_try_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->d:Landroid/widget/Button;

    .line 38
    sget v0, Lcom/facebook/i;->nux_sms_intro_skip_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->e:Landroid/widget/Button;

    .line 39
    sget v0, Lcom/facebook/i;->nux_sms_intro_blurb:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->f:Landroid/widget/TextView;

    .line 40
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->e:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->d:Landroid/widget/Button;

    sget v1, Lcom/facebook/o;->sms_nux_ok_button:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 45
    return-void
.end method

.method public j()V
    .locals 2

    .prologue
    .line 68
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->d()V

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->f:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 70
    return-void
.end method

.method public setBlurb(I)V
    .locals 1

    .prologue
    .line 58
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->d()V

    .line 59
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 60
    return-void
.end method

.method public setBlurb(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->d()V

    .line 64
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    return-void
.end method

.method public setOnSkipClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->d()V

    .line 54
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->e:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    return-void
.end method

.method public setOnTryClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 48
    invoke-virtual {p0}, Lcom/facebook/orca/nux/NuxSmsIntroView;->d()V

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/nux/NuxSmsIntroView;->d:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    return-void
.end method
