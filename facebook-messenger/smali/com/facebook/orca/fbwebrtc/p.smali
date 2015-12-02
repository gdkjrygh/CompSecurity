.class Lcom/facebook/orca/fbwebrtc/p;
.super Ljava/lang/Object;
.source "WebrtcIncallActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;


# direct methods
.method constructor <init>(Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;)V
    .locals 0

    .prologue
    .line 853
    iput-object p1, p0, Lcom/facebook/orca/fbwebrtc/p;->a:Lcom/facebook/orca/fbwebrtc/WebrtcIncallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .prologue
    .line 856
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 857
    return-void
.end method
