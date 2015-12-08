.class public abstract Lcom/cmcm/adsdk/nativead/n;
.super Lcom/cmcm/adsdk/nativead/d;
.source "SourceFile"


# instance fields
.field protected c:Lcom/cleanmaster/ui/app/market/Ad;

.field protected d:Landroid/view/View;

.field protected e:Lcom/cmcm/adsdk/nativead/q;

.field protected f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Lcom/cmcm/adsdk/nativead/e;

.field protected h:Lcom/cmcm/adsdk/nativead/h;

.field protected i:Landroid/content/Context;

.field protected j:Ljava/lang/String;

.field protected k:Z

.field protected l:Z

.field protected m:Z

.field private n:Lcom/cmcm/adsdk/nativead/r;

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Lcom/cmcm/adsdk/nativead/h;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 50
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/d;-><init>()V

    .line 43
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/n;->k:Z

    .line 46
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/n;->l:Z

    .line 47
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/n;->m:Z

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    .line 49
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/n;->o:Z

    .line 51
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    .line 52
    iput-object p2, p0, Lcom/cmcm/adsdk/nativead/n;->j:Ljava/lang/String;

    .line 53
    iput-object p4, p0, Lcom/cmcm/adsdk/nativead/n;->h:Lcom/cmcm/adsdk/nativead/h;

    .line 54
    iput-object p3, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->f:Ljava/util/List;

    .line 56
    return-void
.end method

.method private a(Landroid/view/View;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 125
    const-string v0, "CMPicksNativeAd"

    const-string v1, "registerView"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    if-nez p1, :cond_1

    .line 157
    :cond_0
    :goto_0
    return-void

    .line 129
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 130
    const-string v0, "CMPicksNativeAd"

    const-string v1, "clickableViews is  empty"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 3232
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 5246
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 5247
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5248
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_1

    .line 5250
    :cond_3
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3236
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "unregisterView"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 3237
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3238
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 3239
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->q()V

    .line 3240
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->s()V

    .line 3241
    iput-object v3, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    .line 137
    :cond_4
    new-instance v0, Lcom/cmcm/adsdk/nativead/q;

    invoke-direct {v0, p0, v4}, Lcom/cmcm/adsdk/nativead/q;-><init>(Lcom/cmcm/adsdk/nativead/n;B)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->e:Lcom/cmcm/adsdk/nativead/q;

    .line 138
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    .line 139
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 1255
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->f:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1256
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->e:Lcom/cmcm/adsdk/nativead/q;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1257
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->e:Lcom/cmcm/adsdk/nativead/q;

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    goto :goto_2

    .line 142
    :cond_5
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->m:Z

    if-eqz v0, :cond_6

    .line 143
    const-string v0, "CMPicksNativeAd"

    const-string v1, "ignore view has on screen, report show"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/n;->l()V

    goto/16 :goto_0

    .line 146
    :cond_6
    const-string v0, "CMPicksNativeAd"

    const-string v1, "check view has on screen and report show"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->r()V

    .line 148
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "has report show ?:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    if-nez v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-static {v0}, Lcom/cmcm/adsdk/c/d;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 151
    const-string v0, "CMPicksNativeAd"

    const-string v1, "lock screen,cancel schedule check view"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->s()V

    .line 2161
    :cond_7
    const-string v0, "CMPicksNativeAd"

    const-string v1, "register screen receiver"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2162
    new-instance v0, Lcom/cmcm/adsdk/nativead/r;

    invoke-direct {v0, p0, v4}, Lcom/cmcm/adsdk/nativead/r;-><init>(Lcom/cmcm/adsdk/nativead/n;B)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    .line 2163
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 2164
    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2165
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2166
    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 2167
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->r()V

    return-void
.end method

.method private a(Ljava/util/List;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .prologue
    .line 275
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 276
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 277
    check-cast p2, Landroid/view/ViewGroup;

    .line 278
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 279
    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, p1, v1}, Lcom/cmcm/adsdk/nativead/n;->a(Ljava/util/List;Landroid/view/View;)V

    .line 278
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 281
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->q()V

    return-void
.end method

.method static synthetic c(Lcom/cmcm/adsdk/nativead/n;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/n;->s()V

    return-void
.end method

.method static synthetic d(Lcom/cmcm/adsdk/nativead/n;)Z
    .locals 8

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 32
    .line 2368
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 2384
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v2, v3, :cond_2

    .line 2385
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    move-result v2

    const v3, 0x3f666666    # 0.9f

    cmpl-float v2, v2, v3

    if-gtz v2, :cond_2

    move v2, v1

    .line 2368
    :goto_0
    if-nez v2, :cond_3

    :cond_0
    move v0, v1

    .line 2379
    :cond_1
    :goto_1
    return v0

    :cond_2
    move v2, v0

    .line 2387
    goto :goto_0

    .line 2373
    :cond_3
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 2374
    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 2377
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    mul-int/2addr v2, v3

    int-to-double v2, v2

    .line 2378
    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/cmcm/adsdk/nativead/n;->d:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    mul-int/2addr v4, v5

    int-to-double v4, v4

    .line 2379
    const-wide/high16 v6, 0x4024000000000000L    # 10.0

    mul-double/2addr v4, v6

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    div-double/2addr v4, v6

    cmpl-double v2, v2, v4

    if-gez v2, :cond_1

    :cond_4
    move v0, v1

    .line 32
    goto :goto_1
.end method

.method static synthetic e(Lcom/cmcm/adsdk/nativead/n;)Z
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->o:Z

    return v0
.end method

.method static synthetic f(Lcom/cmcm/adsdk/nativead/n;)Z
    .locals 1

    .prologue
    .line 32
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->o:Z

    return v0
.end method

.method private q()V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 172
    const-string v0, "CMPicksNativeAd"

    const-string v1, "unregister screen receiver"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 174
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->n:Lcom/cmcm/adsdk/nativead/r;

    .line 176
    :cond_0
    return-void
.end method

.method private r()V
    .locals 2

    .prologue
    .line 204
    const-string v0, "CMPicksNativeAd"

    const-string v1, "schedule check view impression"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    new-instance v0, Lcom/cmcm/adsdk/nativead/e;

    new-instance v1, Lcom/cmcm/adsdk/nativead/o;

    invoke-direct {v1, p0}, Lcom/cmcm/adsdk/nativead/o;-><init>(Lcom/cmcm/adsdk/nativead/n;)V

    invoke-direct {v0, v1}, Lcom/cmcm/adsdk/nativead/e;-><init>(Lcom/cmcm/adsdk/nativead/g;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->g:Lcom/cmcm/adsdk/nativead/e;

    .line 219
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->g:Lcom/cmcm/adsdk/nativead/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/e;->a()V

    .line 220
    return-void
.end method

.method private s()V
    .locals 2

    .prologue
    .line 224
    const-string v0, "CMPicksNativeAd"

    const-string v1, "cancel schedule check view impression"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->g:Lcom/cmcm/adsdk/nativead/e;

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->g:Lcom/cmcm/adsdk/nativead/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/e;->b()V

    .line 227
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->g:Lcom/cmcm/adsdk/nativead/e;

    .line 229
    :cond_0
    return-void
.end method


# virtual methods
.method public abstract a(Landroid/content/Context;)V
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 116
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 117
    invoke-direct {p0, v0, p1}, Lcom/cmcm/adsdk/nativead/n;->a(Ljava/util/List;Landroid/view/View;)V

    .line 118
    invoke-direct {p0, p1, v0}, Lcom/cmcm/adsdk/nativead/n;->a(Landroid/view/View;Ljava/util/List;)V

    .line 119
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 302
    iput-boolean p1, p0, Lcom/cmcm/adsdk/nativead/n;->l:Z

    .line 303
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 306
    iput-boolean p1, p0, Lcom/cmcm/adsdk/nativead/n;->m:Z

    .line 307
    return-void
.end method

.method public abstract b(Landroid/content/Context;)Z
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 392
    const-string v0, "cm"

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getTitle()Ljava/lang/String;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    if-eqz v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getBackground()Ljava/lang/String;

    move-result-object v0

    .line 71
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getPicUrl()Ljava/lang/String;

    move-result-object v0

    .line 79
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getButtonTxt()Ljava/lang/String;

    move-result-object v0

    .line 95
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getDesc()Ljava/lang/String;

    move-result-object v0

    .line 103
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 398
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->isAvailAble()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 431
    const/4 v0, 0x0

    return v0
.end method

.method public abstract k()V
.end method

.method public final l()V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 263
    const-string v2, "CMPicksNativeAd"

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "picks ad handleImpression,title:"

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/n;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",this ad is new or has setReUseAd:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    if-nez v0, :cond_0

    .line 265
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/n;->j:Ljava/lang/String;

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0, v2, v3, v4}, Lcom/picksinit/b;->showReport(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;)V

    .line 266
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/n;->a:Z

    .line 271
    :cond_0
    return-void

    .line 263
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()V
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 310
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ad title:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "isInstalled:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->isInstalled()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    const-string v0, "CMPicksNativeAd"

    const-string v1, "CMPicks handleClick"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->h:Lcom/cmcm/adsdk/nativead/h;

    invoke-interface {v0, p0}, Lcom/cmcm/adsdk/nativead/h;->b(Lcom/cmcm/a/a/a;)V

    .line 313
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->k:Z

    if-eqz v0, :cond_0

    .line 355
    :goto_0
    return-void

    .line 316
    :cond_0
    const-string v0, "CMPicksNativeAd"

    const-string v1, "startLoading V"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->b:Lcom/cmcm/a/a/b;

    if-eqz v0, :cond_2

    .line 318
    const-string v0, "CMPicksNativeAd"

    const-string v1, "mInnerClickListener !=null"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/n;->p()Z

    .line 320
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/n;->k:Z

    .line 329
    :cond_1
    :goto_1
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->j:Ljava/lang/String;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    new-instance v4, Lcom/cmcm/adsdk/nativead/p;

    invoke-direct {v4, p0}, Lcom/cmcm/adsdk/nativead/p;-><init>(Lcom/cmcm/adsdk/nativead/n;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/picksinit/b;->onClickAdNoDialog(Landroid/content/Context;Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Lcom/picksinit/ClickAdFinishListener;)V

    goto :goto_0

    .line 322
    :cond_2
    const-string v0, "CMPicksNativeAd"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "currentStatus="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/cmcm/adsdk/nativead/n;->o:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/n;->o:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/n;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 324
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/cmcm/adsdk/nativead/n;->a(Landroid/content/Context;)V

    .line 325
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/n;->k:Z

    goto :goto_1
.end method

.method public final n()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 407
    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/n;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 420
    :cond_0
    :goto_0
    return v0

    .line 411
    :cond_1
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->isDeepLink()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 412
    const-string v0, "CMPicksNativeAd"

    const-string v2, "ad is deeplink"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v0, v1

    .line 413
    goto :goto_0

    .line 416
    :cond_2
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->i:Landroid/content/Context;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v3}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/c/d;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 420
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->isSubjectAd()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->isInstalled()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->isOpenInternal()Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v2}, Lcom/cleanmaster/ui/app/market/Ad;->getAppShowType()I

    move-result v2

    const v3, 0xc358

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final o()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 426
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/Ad;->getPriority()I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 436
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/n;->c:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v0}, Lcom/cleanmaster/ui/app/market/Ad;->getMtType()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
