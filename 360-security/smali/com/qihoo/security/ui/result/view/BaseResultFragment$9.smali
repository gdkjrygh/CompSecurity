.class Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/result/view/BaseResultFragment;->a(Landroid/view/View;Landroid/view/animation/Interpolator;IJI)Lcom/nineoldandroids/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/qihoo/security/ui/result/view/BaseResultFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/result/view/BaseResultFragment;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 746
    iput-object p1, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;->b:Lcom/qihoo/security/ui/result/view/BaseResultFragment;

    iput-object p2, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;->a:Landroid/view/View;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 749
    iget-object v0, p0, Lcom/qihoo/security/ui/result/view/BaseResultFragment$9;->a:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 750
    return-void
.end method
