.class Lcom/facebook/orca/fbwebrtc/j;
.super Ljava/lang/Object;
.source "VoipCallHandler.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/i;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/i;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/j;->a:Lcom/facebook/orca/fbwebrtc/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 93
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/fbwebrtc/j;->a:Lcom/facebook/orca/fbwebrtc/i;

    invoke-static {v0}, Lcom/facebook/orca/fbwebrtc/i;->a(Lcom/facebook/orca/fbwebrtc/i;)Lcom/facebook/orca/fbwebrtc/ae;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/fbwebrtc/ae;->a(Z)V

    .line 95
    return-void
.end method
