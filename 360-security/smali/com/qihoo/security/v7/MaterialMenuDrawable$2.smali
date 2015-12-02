.class Lcom/qihoo/security/v7/MaterialMenuDrawable$2;
.super Lcom/nineoldandroids/util/c;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/nineoldandroids/util/c",
        "<",
        "Lcom/qihoo/security/v7/MaterialMenuDrawable;",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v7/MaterialMenuDrawable;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 708
    iput-object p1, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;->a:Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-direct {p0, p2, p3}, Lcom/nineoldandroids/util/c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Ljava/lang/Float;
    .locals 1

    .prologue
    .line 711
    invoke-virtual {p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->c()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 708
    check-cast p1, Lcom/qihoo/security/v7/MaterialMenuDrawable;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable;)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Float;)V
    .locals 0

    .prologue
    .line 716
    invoke-virtual {p1, p2}, Lcom/qihoo/security/v7/MaterialMenuDrawable;->b(Ljava/lang/Float;)V

    .line 717
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 708
    check-cast p1, Lcom/qihoo/security/v7/MaterialMenuDrawable;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$2;->a(Lcom/qihoo/security/v7/MaterialMenuDrawable;Ljava/lang/Float;)V

    return-void
.end method
