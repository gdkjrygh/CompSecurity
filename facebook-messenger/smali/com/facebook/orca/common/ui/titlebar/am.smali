.class Lcom/facebook/orca/common/ui/titlebar/am;
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
    .line 382
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/am;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 385
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/am;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/ac;->g(Lcom/facebook/orca/common/ui/titlebar/ac;)V

    .line 386
    return-void
.end method
