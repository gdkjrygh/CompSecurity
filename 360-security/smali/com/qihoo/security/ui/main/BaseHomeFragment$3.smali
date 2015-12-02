.class Lcom/qihoo/security/ui/main/BaseHomeFragment$3;
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
    .line 447
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$3;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 450
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BaseHomeFragment$3;->a:Lcom/qihoo/security/ui/main/BaseHomeFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BaseHomeFragment;->b(Lcom/qihoo/security/ui/main/BaseHomeFragment;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 451
    return-void
.end method
