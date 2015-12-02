.class public Lcom/qihoo/security/ui/result/card/view/CardView;
.super Landroid/widget/RelativeLayout;
.source "360Security"


# instance fields
.field protected c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 15
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/qihoo/security/ui/result/card/view/CardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    iput-object p1, p0, Lcom/qihoo/security/ui/result/card/view/CardView;->c:Landroid/content/Context;

    .line 22
    return-void
.end method
