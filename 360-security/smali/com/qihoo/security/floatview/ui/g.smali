.class public Lcom/qihoo/security/floatview/ui/g;
.super Landroid/widget/LinearLayout;
.source "360Security"


# instance fields
.field a:Landroid/view/View;

.field b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->a:Landroid/view/View;

    .line 23
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030052

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    const v0, 0x7f0b0110

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->a:Landroid/view/View;

    .line 25
    const v0, 0x7f0b011e

    invoke-virtual {p0, v0}, Lcom/qihoo/security/floatview/ui/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->b:Landroid/widget/TextView;

    .line 26
    return-void
.end method


# virtual methods
.method public getBackView()Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->a:Landroid/view/View;

    return-object v0
.end method

.method public setTipText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->b:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/g;->b:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    :cond_0
    return-void
.end method
