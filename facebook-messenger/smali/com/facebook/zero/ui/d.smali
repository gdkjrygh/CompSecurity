.class public Lcom/facebook/zero/ui/d;
.super Ljava/lang/Object;
.source "CarrierBottomBannerController.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/facebook/zero/d/a;

.field private final d:Lcom/facebook/zero/ui/o;

.field private final e:Lcom/facebook/zero/ui/c;

.field private final f:Lcom/facebook/prefs/shared/d;

.field private final g:Lcom/facebook/c/s;

.field private final h:Lcom/facebook/base/broadcast/q;

.field private final i:Lcom/facebook/analytics/av;

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Ljava/lang/String;

.field private l:Landroid/view/ViewStub;

.field private m:Lcom/facebook/zero/ui/CarrierBottomBanner;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/facebook/zero/ui/d;

    sput-object v0, Lcom/facebook/zero/ui/d;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/zero/d/a;Lcom/facebook/zero/ui/o;Lcom/facebook/prefs/shared/d;Lcom/facebook/c/s;Lcom/facebook/analytics/av;Ljavax/inject/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/zero/d/a;",
            "Lcom/facebook/zero/ui/o;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/c/s;",
            "Lcom/facebook/analytics/av;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/facebook/zero/ui/d;->b:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lcom/facebook/zero/ui/d;->c:Lcom/facebook/zero/d/a;

    .line 65
    iput-object p3, p0, Lcom/facebook/zero/ui/d;->d:Lcom/facebook/zero/ui/o;

    .line 66
    iput-object p4, p0, Lcom/facebook/zero/ui/d;->f:Lcom/facebook/prefs/shared/d;

    .line 67
    iput-object p5, p0, Lcom/facebook/zero/ui/d;->g:Lcom/facebook/c/s;

    .line 68
    iput-object p6, p0, Lcom/facebook/zero/ui/d;->i:Lcom/facebook/analytics/av;

    .line 69
    iput-object p7, p0, Lcom/facebook/zero/ui/d;->j:Ljavax/inject/a;

    .line 70
    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/ui/d;->k:Ljava/lang/String;

    .line 72
    new-instance v0, Lcom/facebook/zero/ui/e;

    invoke-direct {v0, p0}, Lcom/facebook/zero/ui/e;-><init>(Lcom/facebook/zero/ui/d;)V

    iput-object v0, p0, Lcom/facebook/zero/ui/d;->e:Lcom/facebook/zero/ui/c;

    .line 84
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 85
    const-string v1, "com.facebook.orca.ZERO_RATING_BOTTOM_BANNER_DATA_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 86
    const-string v1, "com.facebook.orca.ZERO_RATING_STATE_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 88
    new-instance v1, Lcom/facebook/zero/ui/f;

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->b:Landroid/content/Context;

    invoke-direct {v1, p0, v2, v0}, Lcom/facebook/zero/ui/f;-><init>(Lcom/facebook/zero/ui/d;Landroid/content/Context;Landroid/content/IntentFilter;)V

    iput-object v1, p0, Lcom/facebook/zero/ui/d;->h:Lcom/facebook/base/broadcast/q;

    .line 97
    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/ui/d;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lcom/facebook/zero/ui/d;->f()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/ui/d;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/facebook/zero/ui/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 180
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 182
    iget-object v1, p0, Lcom/facebook/zero/ui/d;->i:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/facebook/zero/ui/d;->k:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "carrier_bottom_banner"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "carrier_bottom_banner_goto"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 188
    :try_start_0
    iget-object v1, p0, Lcom/facebook/zero/ui/d;->g:Lcom/facebook/c/s;

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->b:Landroid/content/Context;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    :goto_0
    return-void

    .line 189
    :catch_0
    move-exception v0

    .line 192
    sget-object v0, Lcom/facebook/zero/ui/d;->a:Ljava/lang/Class;

    const-string v1, "Activity not found for opening url: [%s]"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private e()V
    .locals 3

    .prologue
    .line 122
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->d:Lcom/facebook/zero/ui/o;

    sget-object v1, Lcom/facebook/zero/a/c;->m:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/o;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 126
    :cond_1
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->c:Lcom/facebook/zero/d/a;

    invoke-virtual {v0}, Lcom/facebook/zero/d/a;->d()Lcom/facebook/zero/ui/CarrierBottomBannerData;

    move-result-object v1

    .line 127
    if-eqz v1, :cond_0

    .line 131
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->l:Landroid/view/ViewStub;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    if-nez v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->l:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/CarrierBottomBanner;

    iput-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    .line 134
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->e:Lcom/facebook/zero/ui/c;

    invoke-virtual {v0, v2}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setListener(Lcom/facebook/zero/ui/c;)V

    .line 135
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setBottomBannerData(Lcom/facebook/zero/ui/CarrierBottomBannerData;)V

    .line 137
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->i:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "view"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner_show"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0

    .line 142
    :cond_2
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setVisibility(I)V

    .line 145
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setBottomBannerData(Lcom/facebook/zero/ui/CarrierBottomBannerData;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->i:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "view"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner_show"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    goto :goto_0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 167
    invoke-virtual {p0}, Lcom/facebook/zero/ui/d;->d()V

    .line 169
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->i:Lcom/facebook/analytics/av;

    new-instance v1, Lcom/facebook/analytics/cb;

    const-string v2, "dismiss"

    invoke-direct {v1, v2}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/facebook/zero/ui/d;->k:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->h(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->e(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "carrier_bottom_banner_close"

    invoke-virtual {v1, v2}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 174
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->f:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->m:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 177
    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewStub;)Lcom/facebook/zero/ui/d;
    .locals 0

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/zero/ui/d;->l:Landroid/view/ViewStub;

    .line 110
    return-object p0
.end method

.method public a()V
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->h:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->a()V

    .line 101
    invoke-virtual {p0}, Lcom/facebook/zero/ui/d;->c()V

    .line 102
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->h:Lcom/facebook/base/broadcast/q;

    invoke-virtual {v0}, Lcom/facebook/base/broadcast/q;->b()V

    .line 106
    return-void
.end method

.method public c()V
    .locals 2

    .prologue
    .line 114
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->j:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v1, :cond_0

    .line 115
    invoke-direct {p0}, Lcom/facebook/zero/ui/d;->e()V

    .line 119
    :goto_0
    return-void

    .line 117
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/zero/ui/d;->d()V

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 158
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    if-nez v0, :cond_0

    .line 164
    :goto_0
    return-void

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/facebook/zero/ui/d;->m:Lcom/facebook/zero/ui/CarrierBottomBanner;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/CarrierBottomBanner;->setVisibility(I)V

    goto :goto_0
.end method
