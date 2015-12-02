.class public Lcom/qihoo/security/locale/widget/LocaleButton;
.super Landroid/widget/Button;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    invoke-virtual {p0}, Lcom/qihoo/security/locale/widget/LocaleButton;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 22
    :goto_0
    return-void

    .line 20
    :cond_0
    const-string/jumbo v0, "http://schemas.android.com/apk/res/android"

    const-string/jumbo v1, "text"

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setLocalText(I)V

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    .line 25
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 26
    invoke-virtual {p0}, Lcom/qihoo/security/locale/widget/LocaleButton;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 31
    :goto_0
    return-void

    .line 29
    :cond_0
    const-string/jumbo v0, "http://schemas.android.com/apk/res/android"

    const-string/jumbo v1, "text"

    const/4 v2, 0x0

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setLocalText(I)V

    goto :goto_0
.end method


# virtual methods
.method public setLocalText(I)V
    .locals 1

    .prologue
    .line 34
    if-lez p1, :cond_0

    .line 35
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 37
    :cond_0
    return-void
.end method

.method public setLocalText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 41
    invoke-virtual {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setText(Ljava/lang/CharSequence;)V

    .line 42
    return-void
.end method
