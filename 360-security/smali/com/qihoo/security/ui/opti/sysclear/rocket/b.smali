.class public Lcom/qihoo/security/ui/opti/sysclear/rocket/b;
.super Landroid/graphics/drawable/Drawable;
.source "360Security"

# interfaces
.implements Lcom/nineoldandroids/a/o$b;
.implements Lcom/qihoo/security/ui/opti/sysclear/rocket/a;


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field a:Landroid/content/Context;

.field private c:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

.field private d:J

.field private e:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 22
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    .line 19
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->d:J

    .line 20
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->e:F

    .line 23
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a:Landroid/content/Context;

    .line 24
    return-void
.end method


# virtual methods
.method public a()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;
    .locals 1

    .prologue
    .line 31
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    return-object v0
.end method

.method public a(FFZLandroid/view/View;)V
    .locals 2

    .prologue
    .line 59
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 61
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a:Landroid/content/Context;

    invoke-static {v1, p3, v0, p0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->init(Landroid/content/Context;ZLandroid/graphics/Rect;Lcom/nineoldandroids/a/o$b;Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V

    .line 62
    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a:Landroid/content/Context;

    invoke-static {v1, v0, p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->init(Landroid/content/Context;Landroid/graphics/Rect;Lcom/nineoldandroids/a/o$b;)V

    .line 63
    invoke-static {p1, p2, p3, p4}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->launch(FFZLandroid/view/View;)V

    .line 64
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->getRocketWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    add-float/2addr v0, p1

    iput v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->e:F

    .line 66
    :cond_0
    return-void
.end method

.method public a(I)V
    .locals 1

    .prologue
    .line 84
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 85
    if-eqz v0, :cond_0

    .line 86
    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->a(I)V

    .line 88
    :cond_0
    return-void
.end method

.method public a(Lcom/nineoldandroids/a/o;)V
    .locals 6

    .prologue
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 76
    iget-wide v2, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->d:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0xa

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->invalidateSelf()V

    .line 78
    iput-wide v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->d:J

    .line 80
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/opti/sysclear/rocket/a;)V
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->c:Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    .line 28
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 69
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->destroy()V

    .line 70
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->destroy()V

    .line 71
    return-void
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 94
    iget v0, p0, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->e:F

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->startSmoke(F)V

    .line 96
    :cond_0
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 97
    if-eqz v0, :cond_1

    .line 98
    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->b(I)V

    .line 100
    :cond_1
    return-void
.end method

.method public c(I)V
    .locals 1

    .prologue
    .line 104
    invoke-virtual {p0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/b;->a()Lcom/qihoo/security/ui/opti/sysclear/rocket/a;

    move-result-object v0

    .line 105
    if-eqz v0, :cond_0

    .line 106
    invoke-interface {v0, p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/a;->c(I)V

    .line 108
    :cond_0
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 0

    .prologue
    .line 39
    invoke-static {p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/Rocket;->draw(Landroid/graphics/Canvas;)V

    .line 40
    invoke-static {p1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->draw(Landroid/graphics/Canvas;)V

    .line 41
    return-void
.end method

.method public getOpacity()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x1

    return v0
.end method

.method public setAlpha(I)V
    .locals 0

    .prologue
    .line 46
    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    .prologue
    .line 51
    return-void
.end method
