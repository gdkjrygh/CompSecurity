.class public final Lcom/kik/cards/web/iap/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static j:Lcom/kik/cards/web/iap/b;


# instance fields
.field private a:Lcom/android/a/a/a;

.field private b:Landroid/content/Context;

.field private c:Lkik/a/e/f;

.field private d:Lcom/kik/g/ao;

.field private e:Lcom/kik/g/f;

.field private f:Z

.field private g:Z

.field private h:Lcom/kik/g/ar;

.field private i:Lkik/a/e/v;

.field private k:Landroid/content/ServiceConnection;

.field private final l:Lcom/kik/g/i;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Lcom/kik/g/ao;

    invoke-direct {v0}, Lcom/kik/g/ao;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->d:Lcom/kik/g/ao;

    .line 47
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->e:Lcom/kik/g/f;

    .line 48
    iput-boolean v1, p0, Lcom/kik/cards/web/iap/b;->f:Z

    .line 49
    iput-boolean v1, p0, Lcom/kik/cards/web/iap/b;->g:Z

    .line 68
    new-instance v0, Lcom/kik/cards/web/iap/c;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/iap/c;-><init>(Lcom/kik/cards/web/iap/b;)V

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->k:Landroid/content/ServiceConnection;

    .line 85
    new-instance v0, Lcom/kik/cards/web/iap/d;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/iap/d;-><init>(Lcom/kik/cards/web/iap/b;)V

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->l:Lcom/kik/g/i;

    .line 58
    return-void
.end method

.method static synthetic a(Lcom/kik/cards/web/iap/b;Lcom/android/a/a/a;)Lcom/android/a/a/a;
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/kik/cards/web/iap/b;->a:Lcom/android/a/a/a;

    return-object p1
.end method

.method public static a()Lcom/kik/cards/web/iap/b;
    .locals 1

    .prologue
    .line 62
    sget-object v0, Lcom/kik/cards/web/iap/b;->j:Lcom/kik/cards/web/iap/b;

    if-nez v0, :cond_0

    .line 63
    new-instance v0, Lcom/kik/cards/web/iap/b;

    invoke-direct {v0}, Lcom/kik/cards/web/iap/b;-><init>()V

    sput-object v0, Lcom/kik/cards/web/iap/b;->j:Lcom/kik/cards/web/iap/b;

    .line 65
    :cond_0
    sget-object v0, Lcom/kik/cards/web/iap/b;->j:Lcom/kik/cards/web/iap/b;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/cards/web/iap/b;)V
    .locals 2

    .prologue
    .line 40
    new-instance v0, Lcom/kik/cards/web/iap/f;

    invoke-direct {v0, p0}, Lcom/kik/cards/web/iap/f;-><init>(Lcom/kik/cards/web/iap/b;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/kik/cards/web/iap/f;->a([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method static synthetic b(Lcom/kik/cards/web/iap/b;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/cards/web/iap/b;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->i:Lkik/a/e/v;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/cards/web/iap/b;)V
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->h:Lcom/kik/g/ar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->h:Lcom/kik/g/ar;

    invoke-virtual {v0}, Lcom/kik/g/ar;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->h:Lcom/kik/g/ar;

    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/kik/cards/web/iap/b;)Z
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/iap/b;->g:Z

    return v0
.end method

.method static synthetic f(Lcom/kik/cards/web/iap/b;)Lcom/android/a/a/a;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->a:Lcom/android/a/a/a;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lkik/a/e/f;Lkik/a/e/v;)V
    .locals 1

    .prologue
    .line 113
    iput-object p1, p0, Lcom/kik/cards/web/iap/b;->b:Landroid/content/Context;

    .line 114
    iput-object p2, p0, Lcom/kik/cards/web/iap/b;->c:Lkik/a/e/f;

    .line 115
    iput-object p3, p0, Lcom/kik/cards/web/iap/b;->i:Lkik/a/e/v;

    .line 117
    invoke-virtual {p0}, Lcom/kik/cards/web/iap/b;->b()Lcom/kik/g/ar;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/cards/web/iap/b;->h:Lcom/kik/g/ar;

    .line 118
    return-void
.end method

.method public final b()Lcom/kik/g/ar;
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 129
    iget-boolean v0, p0, Lcom/kik/cards/web/iap/b;->g:Z

    if-nez v0, :cond_1

    .line 130
    iput-boolean v6, p0, Lcom/kik/cards/web/iap/b;->g:Z

    .line 132
    iget-object v1, p0, Lcom/kik/cards/web/iap/b;->b:Landroid/content/Context;

    if-eqz v1, :cond_0

    iget-boolean v0, p0, Lcom/kik/cards/web/iap/b;->f:Z

    if-eqz v0, :cond_2

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->e:Lcom/kik/g/f;

    invoke-virtual {v0}, Lcom/kik/g/f;->a()V

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->e:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/iap/b;->c:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/web/iap/b;->l:Lcom/kik/g/i;

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->e:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/cards/web/iap/b;->d:Lcom/kik/g/ao;

    invoke-virtual {v1}, Lcom/kik/g/ao;->d()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lcom/kik/cards/web/iap/e;

    invoke-direct {v2, p0}, Lcom/kik/cards/web/iap/e;-><init>(Lcom/kik/cards/web/iap/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 134
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->d:Lcom/kik/g/ao;

    invoke-virtual {v0}, Lcom/kik/g/ao;->f()Lcom/kik/g/ar;

    move-result-object v0

    return-object v0

    .line 132
    :cond_2
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2, v7}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v6, :cond_0

    new-instance v4, Landroid/content/ComponentName;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v5, v0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v0, v0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v4, v5, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "com.android.vending"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->k:Landroid/content/ServiceConnection;

    invoke-virtual {v1, v2, v0, v6}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    iput-boolean v6, p0, Lcom/kik/cards/web/iap/b;->f:Z

    goto :goto_0
.end method

.method public final c()Lcom/android/a/a/a;
    .locals 1

    .prologue
    .line 155
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->a:Lcom/android/a/a/a;

    return-object v0
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 183
    iget-boolean v0, p0, Lcom/kik/cards/web/iap/b;->f:Z

    if-nez v0, :cond_1

    .line 190
    :cond_0
    :goto_0
    return-void

    .line 186
    :cond_1
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->a:Lcom/android/a/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->k:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->b:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/kik/cards/web/iap/b;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/kik/cards/web/iap/b;->k:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 188
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/cards/web/iap/b;->f:Z

    goto :goto_0
.end method
