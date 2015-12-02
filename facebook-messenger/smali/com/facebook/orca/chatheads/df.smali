.class public Lcom/facebook/orca/chatheads/df;
.super Lcom/facebook/widget/d;
.source "ChatThreadKeyboardView.java"


# instance fields
.field private final a:Landroid/support/v4/app/bb;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 25
    sget v0, Lcom/facebook/i;->emoji_custom_keyboard_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/df;->setId(I)V

    .line 27
    new-instance v0, Landroid/support/v4/app/bb;

    invoke-direct {v0, p0}, Landroid/support/v4/app/bb;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    .line 28
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->k()V

    .line 29
    return-void
.end method

.method private getSupportFragmentManager()Landroid/support/v4/app/q;
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->r()Landroid/support/v4/app/q;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->r()Landroid/support/v4/app/q;

    move-result-object v0

    .line 47
    sget v1, Lcom/facebook/i;->emoji_custom_keyboard_container:I

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q;->a(I)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v2

    .line 51
    invoke-virtual {v2, v1}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/ad;

    .line 52
    invoke-virtual {v2}, Landroid/support/v4/app/ad;->a()I

    .line 53
    invoke-virtual {v0}, Landroid/support/v4/app/q;->b()Z

    .line 55
    :cond_0
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/df;->getSupportFragmentManager()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 38
    sget v1, Lcom/facebook/i;->emoji_custom_keyboard_container:I

    invoke-virtual {v0, v1, p1, p2}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 39
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 40
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 59
    invoke-super {p0}, Lcom/facebook/widget/d;->onAttachedToWindow()V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->l()V

    .line 63
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/chatheads/df;->a:Landroid/support/v4/app/bb;

    invoke-virtual {v0}, Landroid/support/v4/app/bb;->q()V

    .line 70
    :cond_0
    invoke-super {p0}, Lcom/facebook/widget/d;->onDetachedFromWindow()V

    .line 71
    return-void
.end method
