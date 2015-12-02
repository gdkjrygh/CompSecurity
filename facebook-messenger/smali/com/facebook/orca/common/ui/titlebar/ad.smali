.class Lcom/facebook/orca/common/ui/titlebar/ad;
.super Ljava/lang/Object;
.source "TitleBarDivebarButtonOverlay.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/ac;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/ac;)V
    .locals 0

    .prologue
    .line 123
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ad;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 126
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ad;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->b(Lcom/facebook/orca/common/ui/titlebar/ac;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/common/ui/titlebar/ad;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    iget-object v2, p0, Lcom/facebook/orca/common/ui/titlebar/ad;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/orca/common/ui/titlebar/ac;)I

    move-result v2

    invoke-static {v1, v2}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/orca/common/ui/titlebar/ac;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    return-void
.end method
