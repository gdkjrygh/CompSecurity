.class public Lcom/qihoo/security/profile/j;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/app/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/app/d$a",
        "<",
        "Lcom/qihoo/security/profile/e;",
        ">;"
    }
.end annotation


# static fields
.field private static a:Lcom/qihoo/security/profile/j;


# instance fields
.field private final b:Ljava/lang/String;

.field private c:Lcom/qihoo/security/profile/d;

.field private d:Lcom/qihoo/security/profile/e;

.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 30
    new-instance v0, Lcom/qihoo/security/profile/j;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/qihoo/security/profile/j;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/qihoo/security/profile/j;->a:Lcom/qihoo/security/profile/j;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Lcom/qihoo/security/profile/j$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/profile/j$1;-><init>(Lcom/qihoo/security/profile/j;)V

    iput-object v0, p0, Lcom/qihoo/security/profile/j;->c:Lcom/qihoo/security/profile/d;

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/profile/j;->e:Landroid/content/Context;

    .line 42
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/profile/j;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    .line 44
    :cond_0
    const-string/jumbo v0, "main"

    .line 46
    :cond_1
    iput-object v0, p0, Lcom/qihoo/security/profile/j;->b:Ljava/lang/String;

    .line 47
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.security.service.PROFILE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 48
    iget-object v1, p0, Lcom/qihoo/security/profile/j;->e:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/service/SecurityService;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 49
    iget-object v1, p0, Lcom/qihoo/security/profile/j;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/app/d;->a(Landroid/content/Context;)Lcom/qihoo/security/app/d;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/profile/e;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3, p0}, Lcom/qihoo/security/app/d;->a(Ljava/lang/Class;Landroid/content/Intent;ZLcom/qihoo/security/app/d$a;)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/profile/e;

    iput-object v0, p0, Lcom/qihoo/security/profile/j;->d:Lcom/qihoo/security/profile/e;

    .line 51
    return-void
.end method

.method public static a()Lcom/qihoo/security/profile/j;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/qihoo/security/profile/j;->a:Lcom/qihoo/security/profile/j;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/profile/j;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 22
    iget-object v0, p0, Lcom/qihoo/security/profile/j;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public synthetic a(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p0, p1}, Lcom/qihoo/security/profile/j;->b(Landroid/os/IBinder;)Lcom/qihoo/security/profile/e;

    move-result-object v0

    return-object v0
.end method

.method public a(IILjava/lang/String;)V
    .locals 2

    .prologue
    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/profile/j;->d:Lcom/qihoo/security/profile/e;

    iget-object v1, p0, Lcom/qihoo/security/profile/j;->c:Lcom/qihoo/security/profile/d;

    invoke-interface {v0, v1, p1, p2, p3}, Lcom/qihoo/security/profile/e;->a(Lcom/qihoo/security/profile/d;IILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    :goto_0
    return-void

    .line 89
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Landroid/os/IBinder;)Lcom/qihoo/security/profile/e;
    .locals 3

    .prologue
    .line 62
    invoke-static {p1}, Lcom/qihoo/security/profile/e$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/profile/e;

    move-result-object v0

    .line 64
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/profile/j;->c:Lcom/qihoo/security/profile/d;

    iget-object v2, p0, Lcom/qihoo/security/profile/j;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/profile/e;->a(Lcom/qihoo/security/profile/d;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :goto_0
    return-object v0

    .line 65
    :catch_0
    move-exception v1

    goto :goto_0
.end method
