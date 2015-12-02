.class Lcom/facebook/orca/common/ui/titlebar/u;
.super Ljava/lang/Object;
.source "TitleBar.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/facebook/orca/common/ui/titlebar/TitleBar;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/TitleBar;I)V
    .locals 0

    .prologue
    .line 367
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/u;->b:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    iput p2, p0, Lcom/facebook/orca/common/ui/titlebar/u;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 370
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/u;->b:Lcom/facebook/orca/common/ui/titlebar/TitleBar;

    check-cast p1, Lcom/facebook/orca/common/ui/titlebar/z;

    iget v1, p0, Lcom/facebook/orca/common/ui/titlebar/u;->a:I

    invoke-static {v0, p1, v1}, Lcom/facebook/orca/common/ui/titlebar/TitleBar;->a(Lcom/facebook/orca/common/ui/titlebar/TitleBar;Lcom/facebook/orca/common/ui/titlebar/z;I)V

    .line 371
    return-void
.end method
