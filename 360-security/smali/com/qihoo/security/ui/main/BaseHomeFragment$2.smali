.class Lcom/qihoo/security/ui/main/BaseHomeFragment$2;
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
.field final synthetic a:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

.field final synthetic b:Lcom/qihoo/security/ui/main/BaseHomeFragment;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/main/BaseHomeFragment;Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V
    .locals 0

    .prologue
    .line 437
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->b:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    iput-object p2, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->a:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 440
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->b:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 441
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->b:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->a:Lcom/qihoo/security/ui/main/FragmentsObservable$Action;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(Lcom/qihoo/security/ui/main/FragmentsObservable$Action;)V

    .line 442
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$2;->b:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->a(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 443
    return-void
.end method
