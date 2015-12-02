.class Lcom/qihoo/security/ui/main/BaseHomeFragment$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(ZLcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BaseHomeFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BaseHomeFragment;)V
    .locals 0

    .prologue
    .line 407
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 410
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 412
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 424
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 425
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 416
    invoke-super {p0, p1}, Lcom/nineoldandroids/a/b;->c(Lcom/nineoldandroids/a/a;)V

    .line 417
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/nineoldandroids/b/a;->a(Landroid/view/View;F)V

    .line 418
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 419
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$1;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 420
    return-void
.end method
