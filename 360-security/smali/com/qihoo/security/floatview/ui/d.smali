.class public Lcom/qihoo/security/floatview/ui/d;
.super Landroid/widget/LinearLayout;
.source "360Security"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 19
    invoke-direct {p0}, Lcom/qihoo/security/floatview/ui/d;->a()V

    .line 20
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 23
    invoke-virtual {p0}, Lcom/qihoo/security/floatview/ui/d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03004f

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    return-void
.end method
