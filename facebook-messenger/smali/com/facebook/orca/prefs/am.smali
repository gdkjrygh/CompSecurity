.class Lcom/facebook/orca/prefs/am;
.super Ljava/lang/Object;
.source "OrcaPartialUserUpgradeActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/orca/prefs/am;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 179
    const-string v0, "com.facebook.katana"

    .line 181
    :try_start_0
    iget-object v0, p0, Lcom/facebook/orca/prefs/am;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->d(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)Lcom/facebook/c/s;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    const-string v3, "market://details?id=com.facebook.katana"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v2, p0, Lcom/facebook/orca/prefs/am;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :goto_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 192
    return-void

    .line 184
    :catch_0
    move-exception v0

    .line 185
    iget-object v0, p0, Lcom/facebook/orca/prefs/am;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->d(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)Lcom/facebook/c/s;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    const-string v3, "http://play.google.com/store/apps/details?id=com.facebook.katana"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    iget-object v2, p0, Lcom/facebook/orca/prefs/am;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method
