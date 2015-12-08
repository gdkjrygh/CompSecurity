.class public Lcom/facebook/share/internal/LikeButton;
.super Lcom/facebook/FacebookButtonBase;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 36
    const/4 v2, 0x0

    const-string v5, "fb_like_button_create"

    move-object v0, p0

    move-object v1, p1

    move v4, v3

    move v6, v3

    invoke-direct/range {v0 .. v6}, Lcom/facebook/FacebookButtonBase;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/lang/String;I)V

    .line 37
    invoke-virtual {p0, p2}, Lcom/facebook/share/internal/LikeButton;->setSelected(Z)V

    .line 38
    return-void
.end method

.method private updateForLikeStatus()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 63
    invoke-virtual {p0}, Lcom/facebook/share/internal/LikeButton;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    sget v0, Lcom/facebook/R$drawable;->com_facebook_button_like_icon_selected:I

    invoke-virtual {p0, v0, v1, v1, v1}, Lcom/facebook/share/internal/LikeButton;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 66
    invoke-virtual {p0}, Lcom/facebook/share/internal/LikeButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/R$string;->com_facebook_like_button_liked:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeButton;->setText(Ljava/lang/CharSequence;)V

    .line 72
    :goto_0
    return-void

    .line 68
    :cond_0
    sget v0, Lcom/facebook/R$drawable;->com_facebook_button_icon:I

    invoke-virtual {p0, v0, v1, v1, v1}, Lcom/facebook/share/internal/LikeButton;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 70
    invoke-virtual {p0}, Lcom/facebook/share/internal/LikeButton;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/R$string;->com_facebook_like_button_not_liked:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/share/internal/LikeButton;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method


# virtual methods
.method protected configureButton(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .prologue
    .line 52
    invoke-super {p0, p1, p2, p3, p4}, Lcom/facebook/FacebookButtonBase;->configureButton(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 53
    invoke-direct {p0}, Lcom/facebook/share/internal/LikeButton;->updateForLikeStatus()V

    .line 54
    return-void
.end method

.method protected getDefaultStyleResource()I
    .locals 1

    .prologue
    .line 58
    sget v0, Lcom/facebook/R$style;->com_facebook_button_like:I

    return v0
.end method

.method public setSelected(Z)V
    .locals 0

    .prologue
    .line 42
    invoke-super {p0, p1}, Lcom/facebook/FacebookButtonBase;->setSelected(Z)V

    .line 43
    invoke-direct {p0}, Lcom/facebook/share/internal/LikeButton;->updateForLikeStatus()V

    .line 44
    return-void
.end method
