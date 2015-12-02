.class public Lcom/qihoo/security/widget/TipsBar;
.super Landroid/widget/FrameLayout;
.source "360Security"


# instance fields
.field private final a:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private final b:Lcom/qihoo/security/locale/widget/LocaleTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 26
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    const v0, 0x7f03009e

    invoke-static {p1, v0, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 30
    const v0, 0x7f0b0210

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/TipsBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 31
    const v0, 0x7f0b0211

    invoke-virtual {p0, v0}, Lcom/qihoo/security/widget/TipsBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 33
    sget-object v0, Lcom/qihoo/security/lite/a$a;->tipsbar:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 35
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 36
    if-lez v1, :cond_0

    .line 37
    iget-object v2, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 38
    iget-object v1, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 43
    :goto_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 44
    if-lez v1, :cond_1

    .line 45
    iget-object v2, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v2, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 46
    iget-object v1, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 51
    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 52
    return-void

    .line 40
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0

    .line 48
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public setLeftText(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 56
    iget-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->a:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 57
    return-void
.end method

.method public setRightText(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 60
    iget-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/widget/TipsBar;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 62
    return-void
.end method
