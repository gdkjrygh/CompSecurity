.class Lcom/facebook/orca/prefs/al;
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
    .line 194
    iput-object p1, p0, Lcom/facebook/orca/prefs/al;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 197
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/prefs/al;->a:Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;

    invoke-static {v0}, Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;->c(Lcom/facebook/orca/prefs/OrcaPartialUserUpgradeActivity;)V

    .line 199
    return-void
.end method
