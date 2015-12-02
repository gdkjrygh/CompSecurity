.class Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->b(Lcom/qihoo/security/booster/widget/DialView/b;)V
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
    .line 204
    iput-object p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iput-object p2, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 207
    const/16 v0, 0xe

    iget-object v1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 208
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 212
    const/16 v0, 0xe

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$3;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-interface {v0}, Lcom/qihoo/security/booster/widget/DialView/b;->c()V

    .line 216
    :cond_0
    return-void
.end method
