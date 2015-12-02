.class Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/booster/widget/DialView/BoostDialView;->a(IJLcom/qihoo/security/booster/widget/DialView/b;)V
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
    .line 156
    iput-object p1, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;->b:Lcom/qihoo/security/booster/widget/DialView/BoostDialView;

    iput-object p2, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/booster/widget/DialView/BoostDialView$1;->a:Lcom/qihoo/security/booster/widget/DialView/b;

    invoke-interface {v0}, Lcom/qihoo/security/booster/widget/DialView/b;->a()V

    .line 168
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 161
    return-void
.end method
