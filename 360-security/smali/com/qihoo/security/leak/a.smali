.class Lcom/qihoo/security/leak/a;
.super Lcom/qihoo/security/leak/c;
.source "360Security"


# direct methods
.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 0

    .prologue
    .line 322
    invoke-direct {p0, p1}, Lcom/qihoo/security/leak/c;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 323
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 327
    const-string/jumbo v0, "leak_exynos_mem"

    return-object v0
.end method

.method b()Z
    .locals 1

    .prologue
    .line 333
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    .prologue
    .line 376
    const/4 v0, 0x0

    return v0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 381
    iget-object v0, p0, Lcom/qihoo/security/leak/a;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200a9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 386
    const v0, 0x7f0e000f

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 398
    const/4 v0, 0x0

    return v0
.end method
