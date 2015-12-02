.class Lcom/facebook/orca/common/ui/titlebar/ai;
.super Ljava/lang/Object;
.source "TitleBarDivebarButtonOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ah;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ah;)V
    .locals 0

    .prologue
    .line 318
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ai;->a:Lcom/facebook/orca/common/ui/titlebar/ah;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 321
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ai;->a:Lcom/facebook/orca/common/ui/titlebar/ah;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/ah;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->b(Lcom/facebook/orca/common/ui/titlebar/ac;)Landroid/widget/TextView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 322
    return-void
.end method
