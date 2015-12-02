.class public Lcom/qihoo/security/dialog/b;
.super Lcom/qihoo/security/dialog/a;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/a;-><init>(Landroid/content/Context;)V

    .line 14
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .prologue
    .line 17
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-virtual {p0, p3}, Lcom/qihoo/security/dialog/b;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 23
    invoke-virtual {p0, p2}, Lcom/qihoo/security/dialog/b;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 24
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 28
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 36
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/b;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 37
    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/b;->a(Landroid/view/View;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/b;->b()Lcom/qihoo/security/dialog/f;

    move-result-object v0

    .line 42
    invoke-interface {v0}, Lcom/qihoo/security/dialog/f;->getMessageTextView()Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v1

    .line 43
    invoke-interface {v0}, Lcom/qihoo/security/dialog/f;->getContentView()Landroid/widget/FrameLayout;

    move-result-object v0

    .line 44
    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    .line 45
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 46
    if-eqz v1, :cond_0

    .line 47
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 51
    :cond_1
    return-object p1
.end method

.method public c()V
    .locals 1

    .prologue
    .line 32
    const-string/jumbo v0, ""

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/b;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 33
    return-void
.end method
