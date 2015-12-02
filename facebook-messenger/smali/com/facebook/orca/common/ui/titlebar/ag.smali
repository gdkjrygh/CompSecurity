.class Lcom/facebook/orca/common/ui/titlebar/ag;
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
    .line 298
    iput-object p1, p0, Lcom/facebook/orca/common/ui/titlebar/ag;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 301
    iget-object v0, p0, Lcom/facebook/orca/common/ui/titlebar/ag;->a:Lcom/facebook/orca/common/ui/titlebar/ac;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lcom/facebook/orca/common/ui/titlebar/ac;->a(Lcom/facebook/orca/common/ui/titlebar/ac;F)Lcom/google/common/d/a/s;

    .line 302
    return-void
.end method
