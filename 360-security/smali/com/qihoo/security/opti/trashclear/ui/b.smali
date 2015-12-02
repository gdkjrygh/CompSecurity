.class public Lcom/qihoo/security/opti/trashclear/ui/b;
.super Lcom/qihoo/security/dialog/b;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/trashclear/ui/b$a;
    }
.end annotation


# instance fields
.field b:Lcom/qihoo/security/locale/widget/LocaleTextView;

.field c:Landroid/view/View;

.field final d:Lcom/qihoo/security/opti/trashclear/ui/b$a;

.field e:Ljava/lang/CharSequence;

.field f:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/opti/trashclear/ui/b$a;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/b;-><init>(Landroid/content/Context;)V

    .line 31
    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->d:Lcom/qihoo/security/opti/trashclear/ui/b$a;

    .line 32
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/b;->d()V

    .line 33
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/b;->f()Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->c:Landroid/view/View;

    .line 136
    return-void
.end method

.method private e()V
    .locals 3

    .prologue
    .line 144
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/b$1;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/b$1;-><init>(Lcom/qihoo/security/opti/trashclear/ui/b;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/opti/trashclear/ui/b$2;

    invoke-direct {v2, p0}, Lcom/qihoo/security/opti/trashclear/ui/b$2;-><init>(Lcom/qihoo/security/opti/trashclear/ui/b;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 169
    return-void
.end method

.method private f()Landroid/view/View;
    .locals 3

    .prologue
    .line 173
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/b;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f030034

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 175
    const v0, 0x7f0b00c2

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 177
    return-object v1
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->e:Ljava/lang/CharSequence;

    .line 74
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/b;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 75
    return-void
.end method

.method public a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V
    .locals 0

    .prologue
    .line 62
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Ljava/lang/CharSequence;)V

    .line 63
    invoke-virtual {p0, p2}, Lcom/qihoo/security/opti/trashclear/ui/b;->b(Ljava/lang/CharSequence;)V

    .line 64
    invoke-virtual {p0, p3}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Z)V

    .line 65
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 108
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 v1, 0x1

    aput-object p2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->setButtonText([Ljava/lang/CharSequence;)V

    .line 109
    return-void
.end method

.method public a(Z)V
    .locals 0

    .prologue
    .line 95
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/ui/b;->b(Z)V

    .line 96
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/ui/b;->e()V

    .line 97
    return-void
.end method

.method public b(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 83
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->f:Ljava/lang/CharSequence;

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->b:Lcom/qihoo/security/locale/widget/LocaleTextView;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 86
    :cond_0
    return-void
.end method

.method public b(Z)V
    .locals 4

    .prologue
    const v3, 0x7f0c022e

    .line 100
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    aput-object v0, v1, v2

    const/4 v0, 0x1

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c014f

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    invoke-virtual {p0, v1}, Lcom/qihoo/security/opti/trashclear/ui/b;->setButtonText([Ljava/lang/CharSequence;)V

    .line 102
    return-void

    .line 100
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 182
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 38
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/b;->onCreate(Landroid/os/Bundle;)V

    .line 39
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/b;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/opti/trashclear/ui/b;->a(Landroid/view/View;)Landroid/view/View;

    .line 41
    return-void
.end method
