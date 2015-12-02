.class Lcom/facebook/orca/common/ui/titlebar/aa;
.super Ljava/lang/Object;
.source "TitleBarButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/z;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/z;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/aa;->a:Lcom/facebook/orca/common/ui/titlebar/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/aa;->a:Lcom/facebook/orca/common/ui/titlebar/z;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/titlebar/z;->performClick()Z

    .line 63
    return-void
.end method
