.class public Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;
.super Lcom/qihoo/security/locale/widget/LocaleTextView;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/locale/widget/LocaleTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 25
    if-nez p1, :cond_0

    .line 26
    const-string/jumbo p1, ""

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->a:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 29
    invoke-virtual {p0, p1}, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    :cond_1
    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 18
    iput-object p1, p0, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->a:Ljava/lang/String;

    .line 19
    const-string/jumbo v0, ""

    invoke-virtual {p0, v0}, Lcom/qihoo/security/locale/widget/AppLabelLocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    invoke-static {}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a()Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;

    move-result-object v0

    const-string/jumbo v1, "app-label"

    const-string/jumbo v2, ""

    invoke-virtual {v0, p0, v1, p1, v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a;->a(Lcom/qihoo/security/opti/trashclear/ui/mainpage/opti/a$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    return-void
.end method
