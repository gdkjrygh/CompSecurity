.class final Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->init(Landroid/content/Context;Landroid/graphics/Rect;Lcom/nineoldandroids/a/o$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 159
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/high16 v3, 0x41a00000    # 20.0f

    const/16 v4, 0x16

    .line 161
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v4, :cond_0

    .line 162
    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 163
    if-eqz v0, :cond_0

    .line 164
    const/4 v1, 0x1

    invoke-static {v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(Z)Z

    .line 165
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    .line 168
    const/high16 v1, 0x43910000    # 290.0f

    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a()F

    move-result v2

    sub-float/2addr v2, v3

    int-to-float v0, v0

    invoke-static {v1, v2, v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(FFF)Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    .line 169
    const/high16 v0, 0x43340000    # 180.0f

    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a()F

    move-result v1

    add-float/2addr v1, v3

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(FFF)Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;

    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->b()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 174
    const-wide/16 v2, 0x3e8

    cmp-long v2, v0, v2

    if-gez v2, :cond_2

    .line 175
    const-wide/16 v2, 0x258

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 176
    const-wide/16 v0, 0x28

    invoke-virtual {p0, v4, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$1;->sendEmptyMessageDelayed(IJ)Z

    .line 186
    :cond_0
    :goto_0
    return-void

    .line 178
    :cond_1
    const/high16 v0, 0x41f00000    # 30.0f

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(F)F

    .line 179
    const-wide/16 v0, 0x5

    invoke-virtual {p0, v4, v0, v1}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke$1;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 182
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/rocket/RocketSmoke;->a(Z)Z

    goto :goto_0
.end method
