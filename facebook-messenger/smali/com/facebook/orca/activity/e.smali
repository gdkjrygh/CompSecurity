.class public abstract Lcom/facebook/orca/activity/e;
.super Lcom/facebook/base/activity/i;
.source "ConfirmActionActivity.java"


# instance fields
.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/Button;

.field private s:Landroid/widget/Button;

.field private t:Landroid/widget/Button;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/facebook/orca/activity/i;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 26
    invoke-virtual {p0}, Lcom/facebook/orca/activity/e;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 29
    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 31
    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 33
    sget v0, Lcom/facebook/k;->orca_confirm_action:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->setContentView(I)V

    .line 35
    sget v0, Lcom/facebook/i;->confirm_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/activity/e;->p:Landroid/widget/TextView;

    .line 36
    sget v0, Lcom/facebook/i;->confirm_message:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/activity/e;->q:Landroid/widget/TextView;

    .line 37
    sget v0, Lcom/facebook/i;->confirm_okay_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/activity/e;->r:Landroid/widget/Button;

    .line 38
    sget v0, Lcom/facebook/i;->confirm_neutral_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/activity/e;->s:Landroid/widget/Button;

    .line 39
    sget v0, Lcom/facebook/i;->confirm_cancel_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/activity/e;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/activity/e;->t:Landroid/widget/Button;

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->p:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 43
    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->q:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->r:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 51
    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->s:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/facebook/orca/activity/i;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 57
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->r:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/activity/f;

    invoke-direct {v1, p0}, Lcom/facebook/orca/activity/f;-><init>(Lcom/facebook/orca/activity/e;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 63
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->s:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/activity/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/activity/g;-><init>(Lcom/facebook/orca/activity/e;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->t:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/activity/h;

    invoke-direct {v1, p0}, Lcom/facebook/orca/activity/h;-><init>(Lcom/facebook/orca/activity/e;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    return-void

    .line 46
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/activity/e;->s:Landroid/widget/Button;

    invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_1
.end method

.method protected j()V
    .locals 0

    .prologue
    .line 78
    return-void
.end method

.method protected k()V
    .locals 0

    .prologue
    .line 81
    return-void
.end method

.method protected l()V
    .locals 0

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/facebook/orca/activity/e;->finish()V

    .line 85
    return-void
.end method
