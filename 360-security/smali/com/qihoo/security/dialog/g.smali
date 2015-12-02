.class public Lcom/qihoo/security/dialog/g;
.super Lcom/qihoo/security/dialog/a;
.source "360Security"


# instance fields
.field private b:Lcom/qihoo/security/locale/widget/LocaleTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/a;-><init>(Landroid/content/Context;)V

    .line 16
    const-string/jumbo v0, ""

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/g;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 17
    const-string/jumbo v0, ""

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/g;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 18
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 3

    .prologue
    .line 22
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/g;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030071

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-nez v0, :cond_0

    .line 27
    const v0, 0x7f0b017e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(I)V

    .line 30
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-nez v0, :cond_0

    .line 34
    const v0, 0x7f0b017e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/dialog/g;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 37
    return-void
.end method
