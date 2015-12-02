.class public Lcom/facebook/orca/common/ui/titlebar/z;
.super Lcom/facebook/widget/d;
.source "TitleBarButton.java"


# instance fields
.field private final a:Landroid/widget/ImageButton;

.field private final b:Landroid/widget/ProgressBar;

.field private final c:Landroid/widget/TextView;

.field private final d:Landroid/view/View;

.field private e:Landroid/graphics/drawable/Drawable;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 37
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/common/ui/titlebar/z;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, -0x1

    .line 45
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    sget-object v0, Lcom/facebook/q;->TitleBarButton:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 48
    sget v1, Lcom/facebook/q;->TitleBarButton_src:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 49
    if-eq v1, v2, :cond_0

    .line 50
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->e:Landroid/graphics/drawable/Drawable;

    .line 52
    :cond_0
    sget v1, Lcom/facebook/q;->TitleBarButton_dividerPosition:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->g:I

    .line 54
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    sget v0, Lcom/facebook/k;->orca_titlebar_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->setContentView(I)V

    .line 57
    sget v0, Lcom/facebook/i;->titlebar_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->e:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/common/ui/titlebar/aa;

    invoke-direct {v1, p0}, Lcom/facebook/orca/common/ui/titlebar/aa;-><init>(Lcom/facebook/orca/common/ui/titlebar/z;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 65
    sget v0, Lcom/facebook/i;->titlebar_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->c:Landroid/widget/TextView;

    .line 66
    sget v0, Lcom/facebook/i;->titlebar_button_progress:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->b:Landroid/widget/ProgressBar;

    .line 67
    sget v0, Lcom/facebook/i;->titlebar_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    .line 68
    iget v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->g:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->setDividerPosition(I)V

    .line 69
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 140
    iget-boolean v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->h:Z

    if-eqz v0, :cond_1

    .line 141
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 142
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    :cond_0
    :goto_0
    return-void

    .line 145
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->b:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->f:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 148
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->e:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public getImageButton()Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    return-object v0
.end method

.method public setButtonWidth(I)V
    .locals 2

    .prologue
    .line 86
    if-nez p1, :cond_0

    .line 94
    :goto_0
    return-void

    .line 89
    :cond_0
    sget v0, Lcom/facebook/i;->titlebar_button_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/common/ui/titlebar/z;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 90
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 91
    iput p1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 92
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 93
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/z;->a()V

    goto :goto_0
.end method

.method public setColorScheme(Lcom/facebook/orca/common/ui/titlebar/w;)V
    .locals 2

    .prologue
    .line 131
    sget-object v0, Lcom/facebook/orca/common/ui/titlebar/ab;->a:[I

    invoke-virtual {p1}, Lcom/facebook/orca/common/ui/titlebar/w;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 137
    :goto_0
    return-void

    .line 132
    :pswitch_0
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/facebook/h;->orca_title_bar_top_button:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 134
    :pswitch_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    sget v1, Lcom/facebook/h;->orca_title_bar_top_sms_button:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    goto :goto_0

    .line 131
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setDividerPosition(I)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 97
    iput p1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->g:I

    .line 98
    and-int/lit8 v0, p1, 0x1

    if-ne v0, v1, :cond_0

    .line 99
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 100
    const/4 v3, 0x3

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 101
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 111
    :goto_0
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    if-eqz p1, :cond_2

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 112
    return-void

    .line 103
    :cond_0
    and-int/lit8 v0, p1, 0x2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    .line 104
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 105
    const/4 v3, 0x5

    iput v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 106
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->d:Landroid/view/View;

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 111
    goto :goto_1
.end method

.method public setEnabled(Z)V
    .locals 1

    .prologue
    .line 115
    invoke-super {p0, p1}, Lcom/facebook/widget/d;->setEnabled(Z)V

    .line 116
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setEnabled(Z)V

    .line 117
    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->f:Ljava/lang/String;

    .line 73
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->e:Landroid/graphics/drawable/Drawable;

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/z;->a()V

    .line 76
    return-void
.end method

.method public setShowProgress(Z)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 120
    iput-boolean p1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->h:Z

    .line 121
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/z;->b:Landroid/widget/ProgressBar;

    if-eqz p1, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 122
    iget-object v3, p0, Lcom/facebook/orca/common/ui/titlebar/z;->a:Landroid/widget/ImageButton;

    if-nez p1, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->c:Landroid/widget/TextView;

    if-nez p1, :cond_2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 124
    return-void

    :cond_0
    move v0, v2

    .line 121
    goto :goto_0

    :cond_1
    move v0, v2

    .line 122
    goto :goto_1

    :cond_2
    move v1, v2

    .line 123
    goto :goto_2
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->e:Landroid/graphics/drawable/Drawable;

    .line 80
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/z;->f:Ljava/lang/String;

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/z;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 82
    invoke-direct {p0}, Lcom/facebook/orca/common/ui/titlebar/z;->a()V

    .line 83
    return-void
.end method
