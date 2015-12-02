.class public Lcom/qihoo/security/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Z

.field private static b:Z

.field private static c:Lcom/qihoo/security/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    sput-boolean v0, Lcom/qihoo/security/a;->a:Z

    .line 36
    sput-boolean v0, Lcom/qihoo/security/a;->b:Z

    .line 38
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/a;->c:Lcom/qihoo/security/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    return-void
.end method

.method public static a()V
    .locals 8

    .prologue
    const v3, 0x7f0c01d2

    const/4 v5, 0x1

    const/4 v7, 0x0

    .line 45
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 47
    const-string/jumbo v1, "shortcut_created"

    invoke-static {v0, v1, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 48
    const-string/jumbo v1, "shortcut_created"

    invoke-static {v0, v1, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 49
    invoke-static {v0, v3}, Lcom/qihoo360/mobilesafe/b/m;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 50
    const-class v1, Lcom/qihoo/security/lite/AppEnterActivity;

    const v2, 0x7f020043

    const/4 v4, 0x0

    new-array v5, v5, [Ljava/lang/String;

    const-string/jumbo v6, "android.intent.category.LAUNCHER"

    aput-object v6, v5, v7

    invoke-static/range {v0 .. v5}, Lcom/qihoo360/mobilesafe/b/m;->a(Landroid/content/Context;Ljava/lang/Class;IILandroid/graphics/Bitmap;[Ljava/lang/String;)V

    .line 55
    :cond_0
    return-void
.end method

.method public static b()Lcom/qihoo/security/a;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lcom/qihoo/security/a;->c:Lcom/qihoo/security/a;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Lcom/qihoo/security/a;

    invoke-direct {v0}, Lcom/qihoo/security/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/a;->c:Lcom/qihoo/security/a;

    .line 61
    :cond_0
    sget-object v0, Lcom/qihoo/security/a;->c:Lcom/qihoo/security/a;

    return-object v0
.end method

.method public static c()V
    .locals 1

    .prologue
    .line 65
    sget-boolean v0, Lcom/qihoo/security/a;->a:Z

    if-eqz v0, :cond_0

    .line 77
    :goto_0
    return-void

    .line 68
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/a;->a:Z

    .line 74
    invoke-static {}, Lcom/qihoo/security/a;->b()Lcom/qihoo/security/a;

    move-result-object v0

    .line 75
    invoke-direct {v0}, Lcom/qihoo/security/a;->e()V

    .line 76
    invoke-direct {v0}, Lcom/qihoo/security/a;->f()V

    goto :goto_0
.end method

.method public static d()V
    .locals 1

    .prologue
    .line 91
    sget-boolean v0, Lcom/qihoo/security/a;->b:Z

    if-eqz v0, :cond_0

    .line 103
    :goto_0
    return-void

    .line 95
    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/qihoo/security/a;->b:Z

    .line 101
    invoke-static {}, Lcom/qihoo/security/a;->g()V

    .line 102
    invoke-static {}, Lcom/qihoo/security/a;->h()V

    goto :goto_0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 80
    sget-boolean v0, Lcom/qihoo/security/env/a;->g:Z

    if-eqz v0, :cond_0

    .line 81
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/env/a;->g:Z

    .line 82
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const-string/jumbo v1, ""

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(Ljava/lang/String;)V

    .line 84
    :cond_0
    return-void
.end method

.method private f()V
    .locals 0

    .prologue
    .line 88
    return-void
.end method

.method private static g()V
    .locals 2

    .prologue
    .line 107
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/malware/b;->a(Landroid/content/Context;)V

    .line 110
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "setting_auto_update"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    return-void
.end method

.method private static h()V
    .locals 2

    .prologue
    .line 114
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 115
    if-eqz v0, :cond_0

    .line 116
    new-instance v1, Lcom/qihoo/security/a$1;

    invoke-direct {v1, v0}, Lcom/qihoo/security/a$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/qihoo/security/a$1;->start()V

    .line 129
    :cond_0
    return-void
.end method
