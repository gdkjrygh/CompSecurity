.class public Lcom/qihoo/security/dialog/i;
.super Lcom/qihoo/security/dialog/a;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/a;-><init>(Landroid/content/Context;)V

    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 2

    .prologue
    .line 16
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    invoke-virtual {v1, p3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0, p3}, Lcom/qihoo/security/dialog/i;->setDialogMessage(Ljava/lang/CharSequence;)V

    .line 22
    invoke-virtual {p0, p2}, Lcom/qihoo/security/dialog/i;->setDialogTitle(Ljava/lang/CharSequence;)V

    .line 23
    return-void
.end method


# virtual methods
.method protected a()Landroid/view/View;
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x0

    return-object v0
.end method
