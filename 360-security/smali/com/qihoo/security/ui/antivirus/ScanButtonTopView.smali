.class public Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;
.super Landroid/widget/RelativeLayout;
.source "360Security"


# instance fields
.field private a:Landroid/view/LayoutInflater;

.field private final b:Landroid/content/Context;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/widget/ImageView;

.field private f:Lcom/qihoo/security/locale/widget/LocaleTextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 29
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->b:Landroid/content/Context;

    .line 30
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->a()V

    .line 31
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 35
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->b:Landroid/content/Context;

    .line 36
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->a()V

    .line 37
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->b:Landroid/content/Context;

    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->a()V

    .line 43
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    const v1, 0x7f03008c

    const/4 v2, -0x1

    .line 46
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->a:Landroid/view/LayoutInflater;

    .line 47
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    .line 48
    if-nez v0, :cond_0

    .line 52
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->a:Landroid/view/LayoutInflater;

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    .line 60
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    const v1, 0x7f0b01c6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->d:Landroid/widget/ImageView;

    .line 61
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    const v1, 0x7f0b01ca

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->e:Landroid/widget/ImageView;

    .line 62
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    const v1, 0x7f0b01c7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 63
    return-void

    .line 57
    :cond_0
    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    iput-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    .line 58
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->c:Landroid/view/View;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method


# virtual methods
.method public setColor(I)V
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setTextColor(I)V

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 88
    return-void
.end method

.method public setIcon(I)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 67
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->d:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 71
    return-void
.end method

.method public setIconShadow(I)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 75
    return-void
.end method

.method public setIconShadow(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 78
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 79
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/ScanButtonTopView;->f:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 83
    return-void
.end method
