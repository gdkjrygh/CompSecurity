.class Lcom/facebook/orca/common/ui/titlebar/k;
.super Ljava/lang/Object;
.source "DivebarController.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/titlebar/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/titlebar/a;)V
    .locals 0

    .prologue
    .line 1129
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/k;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1133
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/k;->a:Lcom/facebook/orca/common/ui/titlebar/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/titlebar/a;->o(Lcom/facebook/orca/common/ui/titlebar/a;)V

    .line 1134
    return-void
.end method
