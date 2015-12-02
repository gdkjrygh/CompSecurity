.class Lcom/facebook/prefs/shared/l;
.super Landroid/content/BroadcastReceiver;
.source "FbSharedPreferencesImpl.java"


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/j;


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/facebook/prefs/shared/l;->a:Lcom/facebook/prefs/shared/j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    .line 165
    const-string v0, "prefs"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 166
    invoke-static {}, Lcom/facebook/prefs/shared/j;->f()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "Received preference change broadcast for keys: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    invoke-static {v1, v2, v3}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    iget-object v1, p0, Lcom/facebook/prefs/shared/l;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v1, v0}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;Ljava/util/List;)V

    .line 168
    return-void
.end method
