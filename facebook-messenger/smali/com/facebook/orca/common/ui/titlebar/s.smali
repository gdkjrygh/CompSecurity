.class Lcom/facebook/orca/common/ui/titlebar/s;
.super Ljava/lang/Object;
.source "TitleBar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)V
    .locals 0

    .prologue
    .line 176
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/s;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/s;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->e(Lcom/facebook/orca/common/ui/titlebar/TitleBar;)Lcom/facebook/orca/fbwebrtc/l;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/fbwebrtc/l;->c()V

    .line 180
    return-void
.end method
