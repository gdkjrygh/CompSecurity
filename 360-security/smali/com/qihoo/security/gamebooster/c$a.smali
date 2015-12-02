.class public Lcom/qihoo/security/gamebooster/c$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/gamebooster/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 270
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/gamebooster/c$a;->a:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 273
    iget v0, p0, Lcom/qihoo/security/gamebooster/c$a;->a:I

    return v0
.end method

.method public a(Lcom/qihoo/security/gamebooster/c$e;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 277
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->a(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 278
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->b(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 279
    invoke-static {p1}, Lcom/qihoo/security/gamebooster/c$e;->c(Lcom/qihoo/security/gamebooster/c$e;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 280
    return-void
.end method
