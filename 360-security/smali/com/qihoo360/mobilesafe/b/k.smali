.class public Lcom/qihoo360/mobilesafe/b/k;
.super Landroid/widget/Toast;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo360/mobilesafe/b/k;


# instance fields
.field private final b:Lcom/qihoo/security/locale/d;

.field private c:Landroid/view/View;

.field private d:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private e:Lcom/qihoo/security/locale/widget/LocaleTextView;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 27
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->b:Lcom/qihoo/security/locale/d;

    .line 28
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/b/k;->a(Landroid/content/Context;)V

    .line 30
    return-void
.end method

.method public static a()Lcom/qihoo360/mobilesafe/b/k;
    .locals 2

    .prologue
    .line 33
    sget-object v0, Lcom/qihoo360/mobilesafe/b/k;->a:Lcom/qihoo360/mobilesafe/b/k;

    if-nez v0, :cond_0

    .line 34
    new-instance v0, Lcom/qihoo360/mobilesafe/b/k;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/b/k;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo360/mobilesafe/b/k;->a:Lcom/qihoo360/mobilesafe/b/k;

    .line 36
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/b/k;->a:Lcom/qihoo360/mobilesafe/b/k;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 40
    const/16 v0, 0x30

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f090002

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/k;->setGravity(III)V

    .line 42
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/b/k;->setDuration(I)V

    .line 43
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 44
    const v1, 0x7f030089

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->c:Landroid/view/View;

    .line 45
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->c:Landroid/view/View;

    const v1, 0x7f0b01c3

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 46
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->c:Landroid/view/View;

    const v1, 0x7f0b01c5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 47
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/b/k;->setView(Landroid/view/View;)V

    .line 48
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 55
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 56
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 58
    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->d:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/b/k;->show()V

    .line 62
    const/16 v0, 0x4283

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 63
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;II)V
    .locals 2

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/k;->b:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/b/k;->b:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, p3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo360/mobilesafe/b/k;->a(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 52
    return-void
.end method
