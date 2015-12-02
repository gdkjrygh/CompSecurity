.class public Lcom/qihoo360/mobilesafe/b/q;
.super Landroid/widget/Toast;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo360/mobilesafe/b/q;


# instance fields
.field private final b:Lcom/qihoo/security/locale/d;

.field private final c:Landroid/content/Context;

.field private d:Landroid/view/View;

.field private e:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field private f:Landroid/widget/ImageView;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 34
    invoke-direct {p0, p1}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V

    .line 35
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/b/q;->c:Landroid/content/Context;

    .line 36
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->b:Lcom/qihoo/security/locale/d;

    .line 37
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/b/q;->a(Landroid/content/Context;)V

    .line 38
    return-void
.end method

.method public static a()Lcom/qihoo360/mobilesafe/b/q;
    .locals 2

    .prologue
    .line 41
    sget-object v0, Lcom/qihoo360/mobilesafe/b/q;->a:Lcom/qihoo360/mobilesafe/b/q;

    if-nez v0, :cond_0

    .line 42
    new-instance v0, Lcom/qihoo360/mobilesafe/b/q;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo360/mobilesafe/b/q;->a:Lcom/qihoo360/mobilesafe/b/q;

    .line 44
    :cond_0
    sget-object v0, Lcom/qihoo360/mobilesafe/b/q;->a:Lcom/qihoo360/mobilesafe/b/q;

    return-object v0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 48
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->c:Landroid/content/Context;

    const v1, 0x7f0300a1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->d:Landroid/view/View;

    .line 49
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->d:Landroid/view/View;

    const v1, 0x7f0b0217

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->f:Landroid/widget/ImageView;

    .line 50
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->d:Landroid/view/View;

    const v1, 0x7f0b0218

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 51
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->d:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/b/q;->setView(Landroid/view/View;)V

    .line 52
    return-void
.end method

.method private b(Ljava/lang/CharSequence;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 71
    if-lez p2, :cond_1

    .line 72
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 73
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 78
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->e:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 82
    :cond_0
    invoke-virtual {p0, v2}, Lcom/qihoo360/mobilesafe/b/q;->setDuration(I)V

    .line 84
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/b/q;->show()V

    .line 85
    return-void

    .line 75
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->f:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->b:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 56
    return-void
.end method

.method public a(II)V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/b/q;->b:Lcom/qihoo/security/locale/d;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;I)V

    .line 64
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 59
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/qihoo360/mobilesafe/b/q;->b(Ljava/lang/CharSequence;I)V

    .line 60
    return-void
.end method

.method public a(Ljava/lang/CharSequence;I)V
    .locals 0

    .prologue
    .line 67
    invoke-direct {p0, p1, p2}, Lcom/qihoo360/mobilesafe/b/q;->b(Ljava/lang/CharSequence;I)V

    .line 68
    return-void
.end method
