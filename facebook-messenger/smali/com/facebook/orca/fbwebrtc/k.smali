.class Lcom/facebook/orca/fbwebrtc/k;
.super Ljava/lang/Object;
.source "VoipCallHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Lcom/facebook/orca/fbwebrtc/i;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/i;Landroid/content/Intent;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/k;->c:Lcom/facebook/orca/fbwebrtc/i;

    iput-object p2, p0, Lcom/facebook/orca/fbwebrtc/k;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcom/facebook/orca/fbwebrtc/k;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 82
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 83
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/k;->c:Lcom/facebook/orca/fbwebrtc/i;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/i;->b(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/prefs/shared/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ay;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 86
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/k;->c:Lcom/facebook/orca/fbwebrtc/i;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/i;->a(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/orca/fbwebrtc/ae;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/orca/fbwebrtc/ae;->a(Z)V

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/k;->c:Lcom/facebook/orca/fbwebrtc/i;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/i;->c(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/c/s;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/fbwebrtc/k;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/fbwebrtc/k;->b:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 88
    return-void
.end method
