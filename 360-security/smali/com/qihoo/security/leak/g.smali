.class Lcom/qihoo/security/leak/g;
.super Lcom/qihoo/security/leak/c;
.source "360Security"


# direct methods
.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 0

    .prologue
    .line 437
    invoke-direct {p0, p1}, Lcom/qihoo/security/leak/c;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 438
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 459
    const-string/jumbo v0, "leak_remote_wipe"

    return-object v0
.end method

.method b()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 442
    invoke-virtual {p0}, Lcom/qihoo/security/leak/g;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 454
    :cond_0
    :goto_0
    return v0

    .line 446
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/leak/g;->o()Z

    move-result v1

    if-nez v1, :cond_0

    .line 450
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xf

    if-gt v1, v2, :cond_0

    .line 452
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 464
    iget-object v0, p0, Lcom/qihoo/security/leak/g;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200ad

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 483
    const v0, 0x7f0e0010

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 469
    invoke-super {p0}, Lcom/qihoo/security/leak/c;->f()Z

    .line 471
    const/4 v0, 0x1

    return v0
.end method
