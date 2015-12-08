.class public final Lcom/roidapp/photogrid/common/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/SharedPreferences;

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/w;->b:Landroid/content/SharedPreferences;

    .line 50
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "dd/MM/yyyy HH:mm:ss"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-direct {v0, v1, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 53
    :try_start_0
    const-string v1, "30/11/2015 24:00:00"

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    .line 58
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v0, v4, v0

    if-gez v0, :cond_0

    move v0, v2

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->c:Z

    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "event"

    const-string v4, "christmas2015"

    invoke-virtual {v0, v1, v4, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    .line 61
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->b:Landroid/content/SharedPreferences;

    const-string v1, "tg_ani"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    :goto_2
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->e:Z

    .line 62
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->b:Landroid/content/SharedPreferences;

    const-string v1, "cm_ani"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_3
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/w;->f:Z

    .line 63
    return-void

    .line 55
    :catch_0
    move-exception v0

    const-wide v0, 0x151591f4400L

    goto :goto_0

    :cond_0
    move v0, v3

    .line 58
    goto :goto_1

    :cond_1
    move v0, v3

    .line 61
    goto :goto_2

    :cond_2
    move v2, v3

    .line 62
    goto :goto_3
.end method

.method private static a([Landroid/view/View;I)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v7, 0x0

    .line 300
    const v1, 0xffffff

    and-int/2addr v1, p1

    const/high16 v2, -0x60000000

    or-int/2addr v1, v2

    .line 301
    new-instance v2, Lcom/roidapp/baselib/view/w;

    invoke-direct {v2, p1}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 302
    new-instance v3, Lcom/roidapp/baselib/view/w;

    invoke-direct {v3, v1}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 303
    invoke-virtual {v2}, Lcom/roidapp/baselib/view/w;->a()V

    .line 304
    aget-object v4, p0, v7

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    invoke-virtual {v2, v4}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 305
    invoke-virtual {v3}, Lcom/roidapp/baselib/view/w;->a()V

    .line 306
    aget-object v4, p0, v7

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 307
    new-instance v4, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 308
    new-array v5, v0, [I

    const v6, 0x10100a7

    aput v6, v5, v7

    invoke-virtual {v4, v5, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 309
    new-array v3, v7, [I

    invoke-virtual {v4, v3, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 310
    aget-object v2, p0, v7

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 312
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_0

    .line 313
    aget-object v2, p0, v0

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 312
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 315
    :cond_0
    return-void
.end method

.method private a([Landroid/view/View;[I)V
    .locals 10

    .prologue
    const/4 v9, 0x2

    const/4 v8, 0x3

    const v7, 0x10100a7

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 253
    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v0

    .line 256
    new-instance v1, Lcom/roidapp/baselib/view/w;

    aget v2, p2, v5

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 257
    new-instance v2, Lcom/roidapp/baselib/view/w;

    aget v3, p2, v6

    invoke-direct {v2, v3}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 258
    int-to-float v3, v0

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 259
    int-to-float v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 260
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 261
    new-array v4, v6, [I

    aput v7, v4, v5

    invoke-virtual {v3, v4, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 262
    new-array v2, v5, [I

    invoke-virtual {v3, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 263
    aget-object v1, p1, v5

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 266
    new-instance v1, Lcom/roidapp/baselib/view/w;

    aget v2, p2, v9

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 267
    new-instance v2, Lcom/roidapp/baselib/view/w;

    aget v3, p2, v8

    invoke-direct {v2, v3}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 268
    int-to-float v3, v0

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 269
    int-to-float v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 270
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 271
    new-array v4, v6, [I

    aput v7, v4, v5

    invoke-virtual {v3, v4, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 272
    new-array v2, v5, [I

    invoke-virtual {v3, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 273
    aget-object v1, p1, v6

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 276
    new-instance v1, Lcom/roidapp/baselib/view/w;

    const/4 v2, 0x4

    aget v2, p2, v2

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 277
    new-instance v2, Lcom/roidapp/baselib/view/w;

    const/4 v3, 0x5

    aget v3, p2, v3

    invoke-direct {v2, v3}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 278
    int-to-float v3, v0

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 279
    int-to-float v3, v0

    invoke-virtual {v2, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 280
    new-instance v3, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 281
    new-array v4, v6, [I

    aput v7, v4, v5

    invoke-virtual {v3, v4, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 282
    new-array v2, v5, [I

    invoke-virtual {v3, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 283
    aget-object v1, p1, v9

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 286
    aget-object v1, p1, v8

    if-eqz v1, :cond_0

    .line 287
    new-instance v1, Lcom/roidapp/baselib/view/w;

    const/4 v2, 0x6

    aget v2, p2, v2

    invoke-direct {v1, v2}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 288
    new-instance v2, Lcom/roidapp/baselib/view/w;

    const/4 v3, 0x7

    aget v3, p2, v3

    invoke-direct {v2, v3}, Lcom/roidapp/baselib/view/w;-><init>(I)V

    .line 289
    int-to-float v3, v0

    invoke-virtual {v1, v3}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 290
    int-to-float v0, v0

    invoke-virtual {v2, v0}, Lcom/roidapp/baselib/view/w;->a(F)V

    .line 291
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 292
    new-array v3, v6, [I

    aput v7, v3, v5

    invoke-virtual {v0, v3, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 293
    new-array v2, v5, [I

    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 294
    aget-object v1, p1, v8

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 296
    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    if-eqz v0, :cond_0

    .line 67
    const v0, -0x190e08

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 69
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/ViewGroup;)V
    .locals 7

    .prologue
    const/high16 v6, 0x41f00000    # 30.0f

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 176
    if-nez p1, :cond_1

    .line 218
    :cond_0
    :goto_0
    return-void

    .line 180
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->e:Z

    if-eqz v0, :cond_2

    .line 181
    new-instance v0, Lcom/roidapp/baselib/view/e;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/view/e;-><init>(Landroid/content/Context;)V

    .line 182
    const/16 v1, 0x78

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/e;->c(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    const v2, 0x3f4ccccd    # 0.8f

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a(F)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->d()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->e()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->f()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2, v6}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x42480000    # 50.0f

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->b(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    const/16 v2, 0x8

    new-array v2, v2, [I

    fill-array-data v2, :array_0

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a([I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->b()V

    .line 198
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "tg_ani"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 200
    iput-boolean v4, p0, Lcom/roidapp/photogrid/common/w;->e:Z

    .line 201
    iput-boolean v5, p0, Lcom/roidapp/photogrid/common/w;->g:Z

    goto :goto_0

    .line 202
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->f:Z

    if-eqz v0, :cond_0

    .line 203
    new-instance v0, Lcom/roidapp/baselib/view/e;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/baselib/view/e;-><init>(Landroid/content/Context;)V

    .line 204
    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/e;->c(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a(F)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->d()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->e()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->f()Lcom/roidapp/baselib/view/e;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v2, v3}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-static {v2, v6}, Lcom/roidapp/cloudlib/common/d;->a(Landroid/content/res/Resources;F)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->b(I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    new-array v2, v5, [I

    const v3, 0x7f0205e0

    aput v3, v2, v4

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/e;->a([I)Lcom/roidapp/baselib/view/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/baselib/view/e;->b()V

    .line 213
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/common/w;->b:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "cm_ani"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 215
    iput-boolean v4, p0, Lcom/roidapp/photogrid/common/w;->f:Z

    .line 216
    iput-boolean v5, p0, Lcom/roidapp/photogrid/common/w;->h:Z

    goto/16 :goto_0

    .line 182
    nop

    :array_0
    .array-data 4
        0x7f020431
        0x7f020432
        0x7f020433
        0x7f020434
        0x7f020435
        0x7f020436
        0x7f020437
        0x7f020438
    .end array-data
.end method

.method public final varargs a([Landroid/view/View;)V
    .locals 7

    .prologue
    const/16 v2, 0x8

    const/4 v6, 0x4

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v4, -0x2

    .line 117
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->c:Z

    if-eqz v0, :cond_1

    .line 120
    new-array v0, v2, [I

    fill-array-data v0, :array_0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;[I)V

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    if-eqz v0, :cond_0

    .line 127
    new-array v0, v2, [I

    fill-array-data v0, :array_1

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;[I)V

    .line 132
    aget-object v0, p1, v1

    instance-of v0, v0, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_2

    .line 133
    aget-object v0, p1, v1

    check-cast v0, Landroid/widget/FrameLayout;

    .line 134
    new-instance v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 135
    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020003

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 136
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 138
    const/16 v3, 0x55

    iput v3, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 139
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 140
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 142
    :cond_2
    aget-object v0, p1, v5

    instance-of v0, v0, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_3

    .line 143
    aget-object v0, p1, v5

    check-cast v0, Landroid/widget/FrameLayout;

    .line 144
    new-instance v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 145
    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020004

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 148
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 149
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 151
    :cond_3
    aget-object v0, p1, v6

    if-eqz v0, :cond_0

    .line 152
    aget-object v0, p1, v6

    new-instance v1, Lcom/roidapp/photogrid/common/x;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/roidapp/photogrid/common/x;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 120
    :array_0
    .array-data 4
        -0x759b
        -0x1a83a5
        -0x6f5b52
        -0x7e6c64
        -0x5e7781
        -0x6e858e
        -0x2ab1
        -0x1a40b9
    .end array-data

    .line 127
    :array_1
    .array-data 4
        -0xeb70b4
        -0xee7eba
        -0xeb4c1
        -0x28bcc9
        -0x34ac9
        -0x1d5ccf
        -0xa8ae65
        -0xb1b675
    .end array-data
.end method

.method public final b(Landroid/view/View;)V
    .locals 10

    .prologue
    const v9, 0x10100a7

    const/4 v8, 0x1

    const/4 v7, -0x2

    const/high16 v6, -0x1000000

    const/4 v5, 0x0

    .line 76
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->c:Z

    if-eqz v0, :cond_1

    .line 77
    const v0, -0x7595ac

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 110
    :cond_0
    :goto_0
    return-void

    .line 79
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    if-eqz v0, :cond_0

    .line 80
    const v0, -0x6a3820

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 82
    const v0, 0x7f0d03a1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 83
    iget-object v1, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x7f020000

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    const v0, 0x7f0d03a2

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 86
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 87
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 88
    new-array v2, v8, [I

    aput v9, v2, v5

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v4, 0x33000000

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 89
    new-array v2, v5, [I

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 90
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 92
    const v0, 0x7f0d03a4

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 93
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 94
    new-instance v1, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 95
    new-array v2, v8, [I

    aput v9, v2, v5

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/high16 v4, 0x33000000

    invoke-direct {v3, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 96
    new-array v2, v5, [I

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2, v3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 97
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 99
    instance-of v0, p1, Landroid/widget/FrameLayout;

    if-eqz v0, :cond_0

    .line 100
    check-cast p1, Landroid/widget/FrameLayout;

    .line 101
    new-instance v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 102
    iget-object v1, p0, Lcom/roidapp/photogrid/common/w;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020002

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v7, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 105
    const/16 v2, 0x55

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 106
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 107
    invoke-virtual {p1, v0, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    goto/16 :goto_0
.end method

.method public final b(Landroid/view/ViewGroup;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 221
    if-nez p1, :cond_1

    .line 249
    :cond_0
    :goto_0
    return-void

    .line 225
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->g:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->h:Z

    if-eqz v0, :cond_0

    .line 226
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 227
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v1, v2

    .line 228
    :goto_1
    if-ge v1, v4, :cond_4

    .line 229
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 230
    instance-of v5, v0, Lcom/roidapp/baselib/view/e;

    if-eqz v5, :cond_3

    .line 231
    check-cast v0, Lcom/roidapp/baselib/view/e;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 234
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/e;

    .line 235
    invoke-virtual {v0}, Lcom/roidapp/baselib/view/e;->a()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 236
    invoke-virtual {v0}, Lcom/roidapp/baselib/view/e;->c()V

    .line 238
    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_2

    .line 240
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 242
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->g:Z

    if-eqz v0, :cond_7

    .line 243
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/w;->g:Z

    goto :goto_0

    .line 246
    :cond_7
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/w;->h:Z

    goto :goto_0
.end method

.method public final varargs b([Landroid/view/View;)V
    .locals 1

    .prologue
    .line 162
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->c:Z

    if-eqz v0, :cond_1

    .line 163
    const/16 v0, -0x759b

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;I)V

    .line 168
    :cond_0
    :goto_0
    return-void

    .line 165
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/w;->d:Z

    if-eqz v0, :cond_0

    .line 166
    const v0, -0xeb70b4

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/common/w;->a([Landroid/view/View;I)V

    goto :goto_0
.end method
