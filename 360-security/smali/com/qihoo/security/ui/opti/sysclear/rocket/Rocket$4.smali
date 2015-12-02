.class Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->e()Lcom/nineoldandroids/a/a$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)V
    .locals 0

    .prologue
    .line 398
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 401
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 402
    if-eqz v0, :cond_0

    .line 403
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->a(I)V

    .line 405
    :cond_0
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 413
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 414
    if-eqz v0, :cond_0

    .line 415
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->b(I)V

    .line 417
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 421
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$4;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 422
    if-eqz v0, :cond_0

    .line 423
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->c(I)V

    .line 425
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 409
    return-void
.end method
