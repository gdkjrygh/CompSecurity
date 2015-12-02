.class Lcom/facebook/orca/common/ui/titlebar/i;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/h;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/h;)V
    .locals 0

    .prologue
    .line 812
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/i;->a:Lcom/facebook/orca/common/ui/titlebar/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 815
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/i;->a:Lcom/facebook/orca/common/ui/titlebar/h;

    iget-object v0, v0, Lcom/facebook/orca/common/ui/titlebar/h;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/common/ui/titlebar/a;->a(Lcom/facebook/orca/common/ui/titlebar/a;JLjava/lang/Runnable;)V

    .line 816
    return-void
.end method
