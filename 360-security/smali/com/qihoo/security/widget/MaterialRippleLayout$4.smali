.class Lcom/qihoo/security/widget/MaterialRippleLayout$4;
.super Lcom/nineoldandroids/util/c;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/MaterialRippleLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nineoldandroids/util/c",
        "<",
        "Lcom/qihoo/security/widget/MaterialRippleLayout;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/widget/MaterialRippleLayout;


# direct methods
.method constructor <init>(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 492
    iput-object p1, p0, Lcom/qihoo/security/widget/MaterialRippleLayout$4;->a:Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-direct {p0, p2, p3}, Lcom/nineoldandroids/util/c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Ljava/lang/Float;
    .locals 1

    .prologue
    .line 495
    invoke-static {p1}, Lcom/qihoo/security/widget/MaterialRippleLayout;->e(Lcom/qihoo/security/widget/MaterialRippleLayout;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 492
    check-cast p1, Lcom/qihoo/security/widget/MaterialRippleLayout;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/widget/MaterialRippleLayout$4;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Float;)V
    .locals 1

    .prologue
    .line 500
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/qihoo/security/widget/MaterialRippleLayout;->setRadius(F)V

    .line 501
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 492
    check-cast p1, Lcom/qihoo/security/widget/MaterialRippleLayout;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/widget/MaterialRippleLayout$4;->a(Lcom/qihoo/security/widget/MaterialRippleLayout;Ljava/lang/Float;)V

    return-void
.end method
