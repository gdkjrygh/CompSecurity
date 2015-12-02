.class Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->b()Lcom/nineoldandroids/a/a$a;
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
    .line 274
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 277
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 278
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->a(Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->b()V

    .line 281
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 282
    if-eqz v0, :cond_1

    .line 283
    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->a(I)V

    .line 285
    :cond_1
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 294
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 295
    if-eqz v0, :cond_0

    .line 296
    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->b(I)V

    .line 298
    :cond_0
    return-void
.end method

.method public c(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 302
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket$1;->a:Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketAnimationListener()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 303
    if-eqz v0, :cond_0

    .line 304
    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->c(I)V

    .line 306
    :cond_0
    return-void
.end method

.method public d(Lcom/nineoldandroids/a/a;)V
    .locals 0

    .prologue
    .line 289
    return-void
.end method
