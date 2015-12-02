.class Lcom/qihoo/security/leak/i;
.super Lcom/qihoo/security/leak/c;
.source "360Security"


# direct methods
.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 0

    .prologue
    .line 271
    invoke-direct {p0, p1}, Lcom/qihoo/security/leak/c;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 272
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 288
    const-string/jumbo v0, "leak_sms_broadcast"

    return-object v0
.end method

.method b()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 276
    invoke-virtual {p0}, Lcom/qihoo/security/leak/i;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 283
    :cond_0
    :goto_0
    return v0

    .line 280
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/leak/i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    .line 283
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Lcom/qihoo/security/leak/i;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200ae

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 312
    const v0, 0x7f0e000e

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 298
    invoke-super {p0}, Lcom/qihoo/security/leak/c;->f()Z

    .line 300
    const/4 v0, 0x1

    return v0
.end method
