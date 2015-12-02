.class Lcom/facebook/orca/common/ui/titlebar/ak;
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
    .line 352
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ak;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ak;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->e(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    .line 356
    return-void
.end method
