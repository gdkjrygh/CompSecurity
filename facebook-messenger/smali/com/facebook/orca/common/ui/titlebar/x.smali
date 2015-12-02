.class Lcom/facebook/orca/common/ui/titlebar/x;
.super Ljava/lang/Object;
.source "TitleBarBackButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/x;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/x;->a:Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/TitleBarBackButton;->performClick()Z

    .line 38
    return-void
.end method
