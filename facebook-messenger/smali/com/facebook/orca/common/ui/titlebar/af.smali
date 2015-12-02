.class Lcom/facebook/orca/common/ui/titlebar/af;
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
    .line 196
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/af;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 199
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/af;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->setBadgeCount(I)V

    .line 200
    return-void
.end method
