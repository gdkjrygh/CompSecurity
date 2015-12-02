.class Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->c()Lcom/nineoldandroids/a/a$a;
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
    .line 314
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 317
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 318
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 321
    const/16 v0, 0x9

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b:Landroid/view/View;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 323
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 324
    if-eqz v0, :cond_2

    .line 325
    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->a(I)V

    .line 327
    :cond_2
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 335
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    iget-object v0, v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 336
    const/16 v0, 0x9

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 337
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->a()V

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 340
    if-eqz v0, :cond_1

    .line 341
    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->b(I)V

    .line 343
    :cond_1
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 347
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$2;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 348
    if-eqz v0, :cond_0

    .line 349
    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->c(I)V

    .line 351
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 331
    return-void
.end method
