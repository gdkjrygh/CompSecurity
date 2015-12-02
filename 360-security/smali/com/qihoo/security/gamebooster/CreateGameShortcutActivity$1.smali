.class Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 61
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_last_recommend_create_shortcut_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v0}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "sp_key_last_recommend_create_shortcut_times"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    .line 64
    iget-object v1, p0, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity$1;->a:Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;

    invoke-static {v1}, Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;->a(Lcom/qihoo/security/gamebooster/CreateGameShortcutActivity;)Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "sp_key_last_recommend_create_shortcut_times"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 65
    return-void
.end method
