.class public Lcom/qihoo/security/notify/c;
.super Lcom/qihoo/security/notify/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/notify/c$a;
    }
.end annotation


# instance fields
.field private h:Lcom/qihoo/security/notify/c$a;

.field private i:I

.field private j:Lcom/qihoo/security/service/a;

.field private k:Landroid/graphics/Bitmap;

.field private l:Landroid/graphics/Canvas;

.field private final m:Landroid/graphics/Paint;

.field private n:Landroid/graphics/Paint;

.field private o:Z

.field private p:Lcom/qihoo/security/widget/a;

.field private q:Z

.field private r:J

.field private s:Z

.field private final t:I

.field private final u:I

.field private final v:I

.field private w:I

.field private final x:Lcom/qihoo/security/service/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/service/a;Lcom/qihoo/security/notify/c$a;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    const/4 v0, 0x0

    .line 89
    invoke-direct {p0, p1}, Lcom/qihoo/security/notify/b;-><init>(Landroid/content/Context;)V

    .line 72
    iput-object v0, p0, Lcom/qihoo/security/notify/c;->h:Lcom/qihoo/security/notify/c$a;

    .line 73
    iput v2, p0, Lcom/qihoo/security/notify/c;->i:I

    .line 74
    iput-object v0, p0, Lcom/qihoo/security/notify/c;->j:Lcom/qihoo/security/service/a;

    .line 75
    iput-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    .line 76
    iput-object v0, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    .line 78
    iput-object v0, p0, Lcom/qihoo/security/notify/c;->n:Landroid/graphics/Paint;

    .line 79
    iput-boolean v2, p0, Lcom/qihoo/security/notify/c;->o:Z

    .line 81
    iput-boolean v3, p0, Lcom/qihoo/security/notify/c;->q:Z

    .line 82
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/notify/c;->r:J

    .line 83
    iput-boolean v2, p0, Lcom/qihoo/security/notify/c;->s:Z

    .line 85
    iput v2, p0, Lcom/qihoo/security/notify/c;->w:I

    .line 140
    new-instance v0, Lcom/qihoo/security/notify/c$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/notify/c$1;-><init>(Lcom/qihoo/security/notify/c;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->x:Lcom/qihoo/security/service/b$a;

    .line 90
    iput-object p2, p0, Lcom/qihoo/security/notify/c;->j:Lcom/qihoo/security/service/a;

    .line 91
    iput-object p3, p0, Lcom/qihoo/security/notify/c;->h:Lcom/qihoo/security/notify/c$a;

    .line 92
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    .line 93
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 94
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 95
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->n:Landroid/graphics/Paint;

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->n:Landroid/graphics/Paint;

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->n:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v2}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 99
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->j:Lcom/qihoo/security/service/a;

    invoke-interface {v0}, Lcom/qihoo/security/service/a;->c()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/notify/c;->i:I
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    :goto_0
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->f:Z

    if-eqz v0, :cond_0

    .line 105
    invoke-direct {p0}, Lcom/qihoo/security/notify/c;->e()V

    .line 107
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 108
    const v1, 0x7f090064

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/notify/c;->t:I

    .line 109
    const v1, 0x7f090062

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/notify/c;->u:I

    .line 110
    const v1, 0x7f090065

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    iput v1, p0, Lcom/qihoo/security/notify/c;->w:I

    .line 111
    const v1, 0x7f090063

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/notify/c;->v:I

    .line 112
    return-void

    .line 101
    :catch_0
    move-exception v0

    .line 102
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryUsedPercent()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/notify/c;->i:I

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/notify/c;I)I
    .locals 0

    .prologue
    .line 52
    iput p1, p0, Lcom/qihoo/security/notify/c;->i:I

    return p1
.end method

.method static synthetic a(Lcom/qihoo/security/notify/c;Lcom/qihoo/security/widget/a;)Lcom/qihoo/security/widget/a;
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    return-object p1
.end method

.method private a(Landroid/widget/RemoteViews;)V
    .locals 12

    .prologue
    const v11, 0x7f0b019d

    const/16 v10, 0x14

    const/4 v1, 0x0

    const v9, 0x40666666    # 3.6f

    const/4 v8, 0x0

    .line 274
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 275
    iget v0, p0, Lcom/qihoo/security/notify/c;->t:I

    mul-int/lit8 v0, v0, 0x2

    iget v2, p0, Lcom/qihoo/security/notify/c;->t:I

    mul-int/lit8 v2, v2, 0x2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    .line 276
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    .line 278
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int/lit8 v6, v0, 0x2

    .line 279
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    div-int/lit8 v7, v0, 0x2

    .line 280
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    int-to-float v3, v2

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    int-to-float v4, v2

    iget-object v5, p0, Lcom/qihoo/security/notify/c;->n:Landroid/graphics/Paint;

    move v2, v1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 283
    iget v0, p0, Lcom/qihoo/security/notify/c;->u:I

    iget v1, p0, Lcom/qihoo/security/notify/c;->v:I

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 284
    new-instance v1, Landroid/graphics/RectF;

    sub-int v2, v6, v0

    int-to-float v2, v2

    sub-int v3, v7, v0

    int-to-float v3, v3

    add-int v4, v6, v0

    int-to-float v4, v4

    add-int/2addr v0, v7

    int-to-float v0, v0

    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 288
    iget v0, p0, Lcom/qihoo/security/notify/c;->i:I

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(I)I

    move-result v6

    .line 289
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 290
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 293
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    iget v2, p0, Lcom/qihoo/security/notify/c;->v:I

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 294
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    const/16 v2, -0x55

    int-to-float v2, v2

    iget v3, p0, Lcom/qihoo/security/notify/c;->i:I

    int-to-float v3, v3

    mul-float/2addr v3, v9

    iget-object v5, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    move v4, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 296
    iget v0, p0, Lcom/qihoo/security/notify/c;->i:I

    rsub-int/lit8 v0, v0, 0x64

    int-to-float v0, v0

    mul-float v3, v0, v9

    .line 298
    int-to-float v0, v10

    cmpl-float v0, v3, v0

    if-lez v0, :cond_1

    .line 299
    iget-object v2, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, -0xc8b8b1

    :goto_0
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 300
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->l:Landroid/graphics/Canvas;

    iget v2, p0, Lcom/qihoo/security/notify/c;->i:I

    int-to-float v2, v2

    mul-float/2addr v2, v9

    const/high16 v4, 0x42b40000    # 90.0f

    sub-float/2addr v2, v4

    const/16 v4, 0xf

    int-to-float v4, v4

    add-float/2addr v2, v4

    int-to-float v4, v10

    sub-float/2addr v3, v4

    iget-object v5, p0, Lcom/qihoo/security/notify/c;->m:Landroid/graphics/Paint;

    move v4, v8

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 302
    :cond_1
    const v0, 0x7f0b019c

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    .line 303
    iget v0, p0, Lcom/qihoo/security/notify/c;->i:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v11, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 304
    invoke-virtual {p1, v11, v6}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 305
    const v0, 0x7f0b019e

    invoke-virtual {p1, v0, v6}, Landroid/widget/RemoteViews;->setTextColor(II)V

    .line 306
    const v0, 0x7f0b019f

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c017a

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/qihoo/security/notify/c;->i:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v8

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 308
    const v0, 0x7f0b019b

    invoke-direct {p0, v8}, Lcom/qihoo/security/notify/c;->b(I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 310
    return-void

    .line 299
    :cond_2
    const v0, -0x403b3a

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/notify/c;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/qihoo/security/notify/c;->h()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/notify/c;Z)Z
    .locals 0

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/qihoo/security/notify/c;->o:Z

    return p1
.end method

.method private b(I)Landroid/app/PendingIntent;
    .locals 4

    .prologue
    const/high16 v3, 0x10000000

    .line 313
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/notify/NotificationActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 314
    invoke-virtual {v0, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 315
    const-string/jumbo v1, "com.qihoo.security.action.function.NOTIFICATION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 316
    const-string/jumbo v1, "com.qihoo.security.index.function.notification"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 317
    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v1, p1, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/notify/c;)Lcom/qihoo/security/widget/a;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/notify/c;Z)Z
    .locals 0

    .prologue
    .line 52
    iput-boolean p1, p0, Lcom/qihoo/security/notify/c;->q:Z

    return p1
.end method

.method private c(I)Landroid/app/PendingIntent;
    .locals 3

    .prologue
    .line 321
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 322
    const-string/jumbo v1, "com.qihoo.security.action.function.notification"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 323
    const-string/jumbo v1, "com.qihoo.security.index.function.notification"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 324
    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    const/high16 v2, 0x10000000

    invoke-static {v1, p1, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 116
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->j:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->x:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->a(Lcom/qihoo/security/service/b;)V

    .line 117
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/notify/c;->s:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    :goto_0
    return-void

    .line 118
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private f()V
    .locals 1

    .prologue
    .line 172
    invoke-virtual {p0}, Lcom/qihoo/security/notify/c;->b()V

    .line 173
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->o:Z

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    if-eqz v0, :cond_0

    .line 175
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/notify/c;->o:Z

    .line 176
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/a;->b()V

    .line 177
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    .line 180
    :cond_0
    return-void
.end method

.method private g()V
    .locals 7

    .prologue
    .line 446
    :try_start_0
    const-string/jumbo v0, "android.os.ServiceManager"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 447
    const-string/jumbo v1, "getService"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    const-class v4, Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 448
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string/jumbo v4, "statusbar"

    aput-object v4, v2, v3

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    .line 449
    invoke-interface {v0}, Landroid/os/IBinder;->getInterfaceDescriptor()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 450
    invoke-virtual {v1}, Ljava/lang/Class;->getClasses()[Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const-string/jumbo v3, "asInterface"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Landroid/os/IBinder;

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 452
    const-string/jumbo v2, "toggleRecentApps"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    .line 453
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    .line 454
    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 460
    :goto_0
    return-void

    .line 455
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private h()V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 466
    const-string/jumbo v0, "NX501"

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 468
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 469
    const-string/jumbo v3, "com.android.timemanager"

    const-string/jumbo v4, "com.android.timemanager.TimeManager"

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 470
    const/high16 v3, 0x10000000

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 471
    iget-object v3, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 556
    :goto_0
    return-void

    .line 474
    :catch_0
    move-exception v0

    .line 481
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    const-string/jumbo v3, "scpkg.list"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/Utils;->openConfigFile(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    .line 486
    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 487
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    move v4, v2

    .line 488
    :goto_1
    if-ge v4, v6, :cond_2

    .line 489
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string/jumbo v3, "com.qihoo.security"

    invoke-static {v0, v3}, Lcom/qihoo360/common/utils/Utils;->DES_decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 493
    const-string/jumbo v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    .line 494
    const/4 v3, -0x1

    if-eq v7, v3, :cond_4

    .line 495
    invoke-virtual {v0, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 496
    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 501
    :goto_2
    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    .line 503
    :try_start_1
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 504
    invoke-virtual {v7, v3, v0}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 505
    const/high16 v0, 0x10000000

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 506
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 512
    :catch_1
    move-exception v0

    .line 488
    :cond_1
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    .line 524
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    const-string/jumbo v1, "scact.list"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->openConfigFile(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 526
    if-eqz v3, :cond_3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 527
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v1, v2

    .line 528
    :goto_3
    if-ge v1, v4, :cond_3

    .line 529
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string/jumbo v5, "com.qihoo.security"

    invoke-static {v0, v5}, Lcom/qihoo360/common/utils/Utils;->DES_decrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 534
    :try_start_2
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 535
    const/high16 v0, 0x10000000

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_0

    .line 542
    :catch_2
    move-exception v0

    .line 528
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 554
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->g:Lcom/qihoo/security/notify/b$a;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/notify/b$a;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    :cond_4
    move-object v0, v1

    move-object v3, v1

    goto :goto_2
.end method


# virtual methods
.method public a(I)V
    .locals 8

    .prologue
    const/16 v7, 0x4e25

    const/16 v2, 0x4e24

    const/16 v1, 0x4e23

    const/16 v0, 0x4e22

    const/4 v6, 0x1

    .line 332
    packed-switch p1, :pswitch_data_0

    .line 440
    :goto_0
    invoke-virtual {p0}, Lcom/qihoo/security/notify/c;->c()V

    .line 441
    :cond_0
    return-void

    .line 334
    :pswitch_0
    invoke-static {v1}, Lcom/qihoo/security/support/b;->c(I)V

    .line 335
    invoke-static {v1}, Lcom/qihoo/security/support/b;->a(I)V

    .line 336
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/p;->a()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/notify/c$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/notify/c$2;-><init>(Lcom/qihoo/security/notify/c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 342
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 345
    :pswitch_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 346
    iget-wide v2, p0, Lcom/qihoo/security/notify/c;->r:J

    sub-long/2addr v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    .line 349
    iput-wide v0, p0, Lcom/qihoo/security/notify/c;->r:J

    .line 351
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->q:Z

    if-eqz v0, :cond_0

    .line 354
    invoke-static {v7}, Lcom/qihoo/security/support/b;->c(I)V

    .line 355
    invoke-static {v7}, Lcom/qihoo/security/support/b;->a(I)V

    .line 356
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    if-nez v0, :cond_1

    .line 357
    new-instance v0, Lcom/qihoo/security/widget/a;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    new-instance v2, Lcom/qihoo/security/notify/c$3;

    invoke-direct {v2, p0}, Lcom/qihoo/security/notify/c$3;-><init>(Lcom/qihoo/security/notify/c;)V

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/widget/a;-><init>(Landroid/content/Context;Lcom/qihoo/security/widget/a$a;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    .line 396
    :cond_1
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->o:Z

    if-eqz v0, :cond_2

    .line 397
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/notify/c;->o:Z

    .line 398
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/a;->b()V

    .line 399
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    goto :goto_0

    .line 401
    :cond_2
    iput-boolean v6, p0, Lcom/qihoo/security/notify/c;->o:Z

    .line 402
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->p:Lcom/qihoo/security/widget/a;

    invoke-virtual {v0}, Lcom/qihoo/security/widget/a;->a()V

    goto :goto_0

    .line 406
    :pswitch_2
    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 407
    invoke-static {v0}, Lcom/qihoo/security/support/b;->a(I)V

    .line 408
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->g:Lcom/qihoo/security/notify/b$a;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v6, v2, v3}, Lcom/qihoo/security/notify/b$a;->sendEmptyMessageDelayed(IJ)Z

    .line 409
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->b(Landroid/content/Context;)V

    goto :goto_0

    .line 415
    :pswitch_3
    invoke-static {v2}, Lcom/qihoo/security/support/b;->c(I)V

    .line 416
    invoke-static {v2}, Lcom/qihoo/security/support/b;->a(I)V

    .line 417
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->b(Landroid/content/Context;)V

    .line 418
    invoke-direct {p0}, Lcom/qihoo/security/notify/c;->g()V

    goto/16 :goto_0

    .line 332
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method public a(Landroid/os/Message;)V
    .locals 2

    .prologue
    .line 596
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 622
    :goto_0
    return-void

    .line 598
    :pswitch_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0178

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 601
    :pswitch_1
    new-instance v0, Lcom/qihoo/security/opti/a/b;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/opti/a/b;-><init>(Landroid/content/Context;)V

    .line 602
    new-instance v1, Lcom/qihoo/security/notify/c$4;

    invoke-direct {v1, p0}, Lcom/qihoo/security/notify/c$4;-><init>(Lcom/qihoo/security/notify/c;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/opti/a/b;->a(Lcom/qihoo/security/opti/a/b$a;)V

    .line 617
    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/b;->b()V

    goto :goto_0

    .line 596
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 127
    invoke-super {p0, p1}, Lcom/qihoo/security/notify/b;->a(Z)V

    .line 131
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->s:Z

    if-nez v0, :cond_0

    .line 132
    invoke-direct {p0}, Lcom/qihoo/security/notify/c;->e()V

    .line 134
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 135
    invoke-virtual {p0}, Lcom/qihoo/security/notify/c;->c()V

    .line 138
    :cond_0
    return-void
.end method

.method public c()V
    .locals 7

    .prologue
    const v6, 0x7f0b01a2

    const v5, 0x7f0b01a0

    const v4, 0x7f0b01a5

    .line 188
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 189
    invoke-direct {p0}, Lcom/qihoo/security/notify/c;->f()V

    .line 271
    :cond_0
    :goto_0
    return-void

    .line 193
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 194
    invoke-virtual {p0}, Lcom/qihoo/security/notify/c;->b()V

    goto :goto_0

    .line 198
    :cond_2
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->f:Z

    if-eqz v0, :cond_0

    .line 202
    invoke-virtual {p0}, Lcom/qihoo/security/notify/c;->a()V

    .line 205
    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 206
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f03007e

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 224
    :goto_1
    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/qihoo/security/notify/c;->b(I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 226
    const v1, 0x7f0b01a1

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c017b

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 229
    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 233
    iget-boolean v1, p0, Lcom/qihoo/security/notify/c;->o:Z

    if-eqz v1, :cond_5

    .line 234
    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 235
    const v1, 0x7f0200d7

    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 246
    :goto_2
    const v1, 0x7f0b01a6

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c005c

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 248
    const v1, 0x7f0b01a4

    const/4 v2, 0x3

    invoke-direct {p0, v2}, Lcom/qihoo/security/notify/c;->c(I)Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 251
    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->isMeizu()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 252
    const/16 v1, 0x8

    invoke-virtual {v0, v6, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 266
    :goto_3
    invoke-direct {p0, v0}, Lcom/qihoo/security/notify/c;->a(Landroid/widget/RemoteViews;)V

    .line 268
    iget-object v1, p0, Lcom/qihoo/security/notify/c;->e:Landroid/app/Notification;

    iput-object v0, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 270
    const/16 v0, 0x115

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->e:Landroid/app/Notification;

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/notify/c;->a(ILandroid/app/Notification;)V

    goto/16 :goto_0

    .line 208
    :cond_3
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f03007d

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_1

    .line 237
    :cond_4
    const v1, 0x7f0200d6

    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_2

    .line 240
    :cond_5
    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 241
    const v1, 0x7f0200d5

    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_2

    .line 243
    :cond_6
    const v1, 0x7f0200d4

    invoke-virtual {v0, v4, v1}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    goto :goto_2

    .line 255
    :cond_7
    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lcom/qihoo/security/notify/c;->b(I)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    .line 257
    const v1, 0x7f0b01a3

    iget-object v2, p0, Lcom/qihoo/security/notify/c;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c017c

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    goto :goto_3
.end method

.method protected d()V
    .locals 2

    .prologue
    .line 153
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 154
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 156
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/notify/c;->k:Landroid/graphics/Bitmap;

    .line 157
    iget-boolean v0, p0, Lcom/qihoo/security/notify/c;->s:Z

    if-eqz v0, :cond_1

    .line 158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/notify/c;->s:Z

    .line 160
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/notify/c;->j:Lcom/qihoo/security/service/a;

    iget-object v1, p0, Lcom/qihoo/security/notify/c;->x:Lcom/qihoo/security/service/b$a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/service/a;->b(Lcom/qihoo/security/service/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :cond_1
    :goto_0
    return-void

    .line 162
    :catch_0
    move-exception v0

    goto :goto_0
.end method
