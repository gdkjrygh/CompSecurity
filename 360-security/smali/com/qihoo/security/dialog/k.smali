.class public Lcom/qihoo/security/dialog/k;
.super Lcom/qihoo/security/dialog/a;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .prologue
    .line 13
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/dialog/k;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/a;-><init>(Landroid/content/Context;)V

    .line 18
    invoke-virtual {p0, p3}, Lcom/qihoo/security/dialog/k;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 19
    invoke-virtual {p0, p2}, Lcom/qihoo/security/dialog/k;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 20
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 4

    .prologue
    .line 24
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/k;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300a3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/qihoo/security/dialog/k;->a:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/k;->a(Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 32
    const-string/jumbo v0, ""

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/k;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 33
    const v0, 0x7f0b017e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/k;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 34
    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 35
    return-void
.end method
