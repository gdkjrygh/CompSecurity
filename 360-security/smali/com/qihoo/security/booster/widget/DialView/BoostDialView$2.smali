.class Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(Lcom/qihoo/security/booster/widget/DialView/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/booster/widget/DialView/b;

.field final synthetic b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;


# direct methods
.method constructor <init>(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iput-object p2, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 183
    const/4 v0, 0x3

    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 184
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 188
    const/4 v0, 0x3

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 189
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-interface {v0}, Lcom/qihoo/security/booster/widget/DialView/b;->b()V

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$2;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-static {v0, v1}, Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(Lcom/qihoo/security/booster/widget/DialView/BoostDialView;Lcom/qihoo/security/booster/widget/DialView/b;)V

    .line 193
    return-void
.end method
