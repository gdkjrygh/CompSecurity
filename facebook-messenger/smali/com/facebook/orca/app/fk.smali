.class public Lcom/facebook/orca/app/fk;
.super Ljava/lang/Object;
.source "OrcaFirstInstallInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/app/fk;->a:Landroid/content/Context;

    .line 26
    iput-object p2, p0, Lcom/facebook/orca/app/fk;->b:Lcom/facebook/prefs/shared/d;

    .line 27
    return-void
.end method

.method private c()V
    .locals 5

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/app/fk;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/o;->app_name:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/facebook/orca/app/fk;->a:Landroid/content/Context;

    sget v2, Lcom/facebook/h;->launcher_icon:I

    invoke-static {v1, v2}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;

    move-result-object v1

    .line 63
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 64
    const-string v3, "com.facebook.orca"

    const-string v4, "com.facebook.orca.auth.StartScreenActivity"

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 65
    const-string v3, "android.intent.action.MAIN"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 66
    const-string v3, "android.intent.category.LAUNCHER"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 69
    const-string v4, "android.intent.extra.shortcut.INTENT"

    invoke-virtual {v3, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 70
    const-string v2, "android.intent.extra.shortcut.NAME"

    invoke-virtual {v3, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 71
    const-string v0, "android.intent.extra.shortcut.ICON_RESOURCE"

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 72
    const-string v0, "duplicate"

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 73
    const-string v0, "com.android.launcher.action.INSTALL_SHORTCUT"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    iget-object v0, p0, Lcom/facebook/orca/app/fk;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 75
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 81
    iget-object v0, p0, Lcom/facebook/orca/app/fk;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 82
    sget-object v1, Lcom/facebook/orca/prefs/o;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 83
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 84
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 31
    invoke-virtual {p0}, Lcom/facebook/orca/app/fk;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    .line 34
    invoke-direct {p0}, Lcom/facebook/orca/app/fk;->c()V

    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/facebook/orca/app/fk;->d()V

    .line 38
    :cond_1
    return-void
.end method

.method public b()Z
    .locals 4

    .prologue
    const-wide/16 v2, -0x1

    .line 46
    iget-object v0, p0, Lcom/facebook/orca/app/fk;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    .line 48
    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/app/fk;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 50
    sget-object v1, Lcom/facebook/orca/prefs/o;->c:Lcom/facebook/prefs/shared/ae;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 51
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 52
    const/4 v0, 0x1

    .line 54
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
