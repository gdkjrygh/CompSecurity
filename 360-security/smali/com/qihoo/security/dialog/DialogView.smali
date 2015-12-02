.class public Lcom/qihoo/security/dialog/DialogView;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/dialog/DialogView$1;,
        Lcom/qihoo/security/dialog/DialogView$Style;
    }
.end annotation


# instance fields
.field private final a:Lcom/qihoo/security/locale/d;

.field private final b:Landroid/content/Context;

.field private c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private e:Landroid/widget/ImageView;

.field private f:Lcom/qihoo/security/dialog/e;

.field private g:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo/security/dialog/DialogView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 36
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->a:Lcom/qihoo/security/locale/d;

    .line 29
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 30
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    .line 31
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    .line 32
    iput-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->g:Landroid/view/View;

    .line 40
    iput-object p1, p0, Lcom/qihoo/security/dialog/DialogView;->b:Landroid/content/Context;

    .line 41
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030046

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/dialog/DialogView;->b()V

    .line 43
    return-void
.end method

.method private b()V
    .locals 1

    .prologue
    .line 61
    const v0, 0x7f0b0100

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/e;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    .line 62
    const v0, 0x7f0b00fd

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 63
    const v0, 0x7f0b00fe

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 64
    const v0, 0x7f0b00fc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    .line 65
    const v0, 0x7f0b00fb

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->g:Landroid/view/View;

    .line 66
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->g:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 179
    return-void
.end method

.method public getContentView()Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 79
    const v0, 0x7f0b00ff

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getMessageTextView()Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0}, Lcom/qihoo/security/dialog/e;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .prologue
    .line 70
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 71
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/DialogView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 72
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;)I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/dialog/DialogView;->b:Landroid/content/Context;

    const/high16 v3, 0x42200000    # 40.0f

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;F)I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 74
    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    return-void
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 48
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([I)V

    .line 53
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->f:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([Ljava/lang/CharSequence;)V

    .line 58
    return-void
.end method

.method public setDialogIcon(I)V
    .locals 1

    .prologue
    .line 140
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/DialogView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->setDialogIcon(Landroid/graphics/drawable/Drawable;)V

    .line 141
    return-void
.end method

.method public setDialogIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 145
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    :goto_0
    return-void

    .line 148
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 100
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 104
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/DialogView;->getContentView()Landroid/widget/FrameLayout;

    move-result-object v0

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 106
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 107
    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 117
    :cond_0
    :goto_0
    return-void

    .line 111
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 112
    iget-object v1, p0, Lcom/qihoo/security/dialog/DialogView;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v1, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 113
    if-eqz v0, :cond_0

    .line 114
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method

.method public setDialogStyle(Lcom/qihoo/security/dialog/DialogView$Style;)V
    .locals 2

    .prologue
    .line 164
    sget-object v0, Lcom/qihoo/security/dialog/DialogView$1;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/dialog/DialogView$Style;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 171
    :goto_0
    return-void

    .line 166
    :pswitch_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->setBackgroundColor(I)V

    goto :goto_0

    .line 164
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/DialogView;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 85
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 89
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 95
    :goto_0
    return-void

    .line 92
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/dialog/DialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method
