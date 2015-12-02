.class public Lcom/qihoo/security/locale/widget/LocaleEditText;
.super Landroid/widget/EditText;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 17
    invoke-virtual {p0}, Lcom/qihoo/security/locale/widget/LocaleEditText;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    :goto_0
    return-void

    .line 20
    :cond_0
    const-string/jumbo v0, "http://schemas.android.com/apk/res/android"

    const-string/jumbo v1, "text"

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setLocalText(I)V

    .line 23
    const-string/jumbo v0, "http://schemas.android.com/apk/res/android"

    const-string/jumbo v1, "hint"

    invoke-interface {p2, v0, v1, v2}, Landroid/util/AttributeSet;->getAttributeResourceValue(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    .line 24
    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setLocalHint(I)V

    goto :goto_0
.end method


# virtual methods
.method public setLocalHint(I)V
    .locals 1

    .prologue
    .line 41
    if-lez p1, :cond_0

    .line 42
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setHint(Ljava/lang/CharSequence;)V

    .line 44
    :cond_0
    return-void
.end method

.method public setLocalHint(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 48
    invoke-virtual {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setHint(Ljava/lang/CharSequence;)V

    .line 49
    return-void
.end method

.method public setLocalText(I)V
    .locals 1

    .prologue
    .line 29
    if-lez p1, :cond_0

    .line 30
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setText(Ljava/lang/CharSequence;)V

    .line 32
    :cond_0
    return-void
.end method

.method public setLocalText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 36
    invoke-virtual {p0, p1}, Lcom/qihoo/security/locale/widget/LocaleEditText;->setText(Ljava/lang/CharSequence;)V

    .line 37
    return-void
.end method
