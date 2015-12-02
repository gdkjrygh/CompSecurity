.class public Lcom/qihoo/security/dialog/ScrollContentDialogView;
.super Landroid/widget/FrameLayout;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/dialog/f;


# instance fields
.field a:Lcom/qihoo/security/locale/d;

.field b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field c:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field d:Landroid/widget/ImageView;

.field private e:Lcom/qihoo/security/dialog/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->a:Lcom/qihoo/security/locale/d;

    .line 27
    iput-object v1, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 28
    iput-object v1, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    .line 29
    iput-object v1, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->e:Lcom/qihoo/security/dialog/e;

    .line 33
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03008d

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 34
    invoke-direct {p0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->a()V

    .line 35
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 59
    const v0, 0x7f0b0100

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/dialog/e;

    iput-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->e:Lcom/qihoo/security/dialog/e;

    .line 60
    const v0, 0x7f0b00fd

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 61
    const v0, 0x7f0b00fe

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 62
    const v0, 0x7f0b00fc

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    .line 63
    return-void
.end method


# virtual methods
.method public getContentView()Landroid/widget/FrameLayout;
    .locals 1

    .prologue
    .line 66
    const v0, 0x7f0b00ff

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getMessageTextView()Lcom/qihoo/security/locale/widget/LocaleTextView;
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    return-object v0
.end method

.method public getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;
    .locals 1

    .prologue
    .line 122
    const/4 v0, 0x0

    return-object v0
.end method

.method public varargs setButtonOnClickListener([Landroid/view/View$OnClickListener;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->e:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 46
    return-void
.end method

.method public varargs setButtonText([I)V
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->e:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([I)V

    .line 51
    return-void
.end method

.method public varargs setButtonText([Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->e:Lcom/qihoo/security/dialog/e;

    invoke-interface {v0, p1}, Lcom/qihoo/security/dialog/e;->setButtonText([Ljava/lang/CharSequence;)V

    .line 56
    return-void
.end method

.method public setDialogIcon(I)V
    .locals 1

    .prologue
    .line 101
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->setDialogIcon(Landroid/graphics/drawable/Drawable;)V

    .line 102
    return-void
.end method

.method public setDialogIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 106
    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0}, Lcom/qihoo/security/locale/widget/LocaleTextView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 107
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 113
    :goto_0
    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 110
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method public setDialogMessage(I)V
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 97
    return-void
.end method

.method public setDialogMessage(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 86
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 92
    :goto_0
    return-void

    .line 89
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->c:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setDialogTitle(I)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/ScrollContentDialogView;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 82
    return-void
.end method

.method public setDialogTitle(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 71
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 72
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 77
    :goto_0
    return-void

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 75
    iget-object v0, p0, Lcom/qihoo/security/dialog/ScrollContentDialogView;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    goto :goto_0
.end method
