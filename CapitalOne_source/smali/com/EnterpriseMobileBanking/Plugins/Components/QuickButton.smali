.class public Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;
.super Landroid/widget/LinearLayout;
.source "QuickButton.java"


# static fields
.field public static final BOLD:I = 0x1

.field public static final BOLD_ITALIC:I = 0x3

.field public static final ITALIC:I = 0x2

.field public static final NORMAL:I = 0x0

.field public static final TAG:Ljava/lang/String; = "QuickButton"


# instance fields
.field private mImageView:Landroid/widget/ImageView;

.field private mSrc:I

.field private mText:Ljava/lang/String;

.field private mTextColor:I

.field private mTextSize:F

.field private mTextStyle:I

.field private mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v4, 0x0

    .line 52
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lcom/konylabs/capitalone/R$styleable;->C1Attrs:[I

    invoke-virtual {v2, p2, v3, v4, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 57
    .local v0, "a":Landroid/content/res/TypedArray;
    :try_start_0
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 58
    .local v1, "r":Landroid/content/res/Resources;
    const/4 v2, 0x0

    const v3, 0x7f0200be

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mSrc:I

    .line 59
    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    .line 60
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 61
    const-string v2, ""

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    .line 62
    :cond_0
    const/4 v2, 0x1

    const v3, 0x7f0a0005

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextSize:F

    .line 63
    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextStyle:I

    .line 64
    const/4 v2, 0x3

    const v3, 0x106000b

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextColor:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 70
    const v2, 0x7f03001a

    invoke-static {p1, v2, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 71
    return-void

    .line 68
    .end local v1    # "r":Landroid/content/res/Resources;
    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    throw v2
.end method


# virtual methods
.method public getSrc()I
    .locals 1

    .prologue
    .line 87
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mSrc:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 123
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextColor:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    .prologue
    .line 105
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextSize:F

    return v0
.end method

.method public getTextStyle()I
    .locals 1

    .prologue
    .line 114
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextStyle:I

    return v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 75
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 76
    const v0, 0x7f080084

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    .line 77
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->setText(Ljava/lang/String;)V

    .line 78
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextSize:F

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->setTextSize(F)V

    .line 79
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextColor:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->setTextColor(I)V

    .line 80
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextStyle:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->setTextStyle(I)V

    .line 82
    const v0, 0x7f080083

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mImageView:Landroid/widget/ImageView;

    .line 83
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mSrc:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->setSrc(I)V

    .line 84
    return-void
.end method

.method public setSrc(I)V
    .locals 2
    .param p1, "src"    # I

    .prologue
    .line 91
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mSrc:I

    .line 92
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mImageView:Landroid/widget/ImageView;

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mSrc:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 93
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 100
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    .line 101
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mText:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 102
    return-void
.end method

.method public setTextColor(I)V
    .locals 2
    .param p1, "textColor"    # I

    .prologue
    .line 127
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextColor:I

    .line 128
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 129
    return-void
.end method

.method public setTextSize(F)V
    .locals 3
    .param p1, "textSize"    # F

    .prologue
    .line 109
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextSize:F

    .line 110
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextSize:F

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 111
    return-void
.end method

.method public setTextStyle(I)V
    .locals 2
    .param p1, "textStyle"    # I

    .prologue
    .line 118
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextStyle:I

    .line 119
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/QuickButton;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 120
    return-void
.end method
