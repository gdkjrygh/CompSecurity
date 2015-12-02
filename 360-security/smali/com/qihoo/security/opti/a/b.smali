.class public Lcom/qihoo/security/opti/a/b;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/opti/a/b$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/qihoo360/mobilesafe/core/c/c;

.field private d:Lcom/qihoo/security/opti/a/b$a;

.field private e:Landroid/content/ServiceConnection;

.field private f:Lcom/qihoo360/mobilesafe/core/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/qihoo/security/opti/a/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/opti/a/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->b:Landroid/content/Context;

    .line 28
    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 29
    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->d:Lcom/qihoo/security/opti/a/b$a;

    .line 128
    new-instance v0, Lcom/qihoo/security/opti/a/b$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/a/b$1;-><init>(Lcom/qihoo/security/opti/a/b;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->e:Landroid/content/ServiceConnection;

    .line 161
    new-instance v0, Lcom/qihoo/security/opti/a/b$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/opti/a/b$2;-><init>(Lcom/qihoo/security/opti/a/b;)V

    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->f:Lcom/qihoo360/mobilesafe/core/c/b;

    .line 42
    iput-object p1, p0, Lcom/qihoo/security/opti/a/b;->b:Landroid/content/Context;

    .line 43
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/opti/a/b;Lcom/qihoo360/mobilesafe/core/c/c;)Lcom/qihoo360/mobilesafe/core/c/c;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    return-object p1
.end method

.method static synthetic b(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo360/mobilesafe/core/c/b;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->f:Lcom/qihoo360/mobilesafe/core/c/b;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->b:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    sget-object v2, Lcom/qihoo/security/env/a;->f:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/opti/a/b;->e:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 73
    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/opti/a/b;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/qihoo/security/opti/a/b;->e()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/opti/a/b;)Lcom/qihoo/security/opti/a/b$a;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->d:Lcom/qihoo/security/opti/a/b$a;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    if-eqz v0, :cond_0

    .line 82
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/b;->f:Lcom/qihoo360/mobilesafe/core/c/b;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/c/c;->b(Lcom/qihoo360/mobilesafe/core/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    :cond_0
    :goto_0
    sget-object v0, Lcom/qihoo/security/opti/a/b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/opti/a/b;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/opti/a/b;->e:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 91
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    .line 92
    return-void

    .line 83
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private e()V
    .locals 1

    .prologue
    .line 98
    .line 100
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->f()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 101
    if-nez v0, :cond_0

    .line 106
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->c:Lcom/qihoo360/mobilesafe/core/c/c;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/c/c;->e()V

    .line 107
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/service/ProcessClearService;->a(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 126
    :goto_0
    return-void

    .line 118
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->d:Lcom/qihoo/security/opti/a/b$a;

    if-eqz v0, :cond_1

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/opti/a/b;->d:Lcom/qihoo/security/opti/a/b$a;

    invoke-interface {v0}, Lcom/qihoo/security/opti/a/b$a;->a()V

    .line 121
    :cond_1
    invoke-virtual {p0}, Lcom/qihoo/security/opti/a/b;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 123
    :catch_0
    move-exception v0

    goto :goto_0

    .line 112
    :catch_1
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/qihoo/security/opti/a/b;->d()V

    .line 53
    return-void
.end method

.method public a(Lcom/qihoo/security/opti/a/b$a;)V
    .locals 0

    .prologue
    .line 38
    iput-object p1, p0, Lcom/qihoo/security/opti/a/b;->d:Lcom/qihoo/security/opti/a/b$a;

    .line 39
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 62
    invoke-direct {p0}, Lcom/qihoo/security/opti/a/b;->c()V

    .line 63
    return-void
.end method
