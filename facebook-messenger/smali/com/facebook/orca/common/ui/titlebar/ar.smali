.class Lcom/facebook/orca/common/ui/titlebar/ar;
.super Ljava/lang/Object;
.source "TitleBarDivebarButtonOverlayController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ap;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ap;)V
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ar;->a:Lcom/facebook/orca/common/ui/titlebar/ap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ar;->a:Lcom/facebook/orca/common/ui/titlebar/ap;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ap;->b(Lcom/facebook/orca/common/ui/titlebar/ap;)V

    .line 116
    return-void
.end method
