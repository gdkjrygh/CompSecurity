.class Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;
.super Ljava/lang/Object;
.source "PresentationExtension.java"

# interfaces
.implements Lorg/xwalk/core/internal/extension/api/XWalkDisplayManager$DisplayListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;


# direct methods
.method constructor <init>(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)V
    .locals 0

    .prologue
    .line 87
    iput-object p1, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDisplayAdded(I)V
    .locals 2
    .param p1, "displayId"    # I

    .prologue
    const/4 v1, 0x1

    .line 90
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # ++operator for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mAvailableDisplayCount:I
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$004(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)I

    .line 94
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mAvailableDisplayCount:I
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$000(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)I

    move-result v0

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->notifyAvailabilityChanged(Z)V
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$100(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;Z)V

    .line 95
    :cond_0
    return-void
.end method

.method public onDisplayChanged(I)V
    .locals 0
    .param p1, "displayId"    # I

    .prologue
    .line 114
    return-void
.end method

.method public onDisplayRemoved(I)V
    .locals 2
    .param p1, "displayId"    # I

    .prologue
    .line 99
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # --operator for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mAvailableDisplayCount:I
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$006(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)I

    .line 103
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # getter for: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->mAvailableDisplayCount:I
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$000(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)I

    move-result v0

    if-nez v0, :cond_0

    .line 104
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    const/4 v1, 0x0

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->notifyAvailabilityChanged(Z)V
    invoke-static {v0, v1}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$100(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;Z)V

    .line 107
    iget-object v0, p0, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension$1;->this$0:Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;

    # invokes: Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->closePresentationContent()V
    invoke-static {v0}, Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;->access$200(Lorg/xwalk/core/internal/extension/api/presentation/PresentationExtension;)V

    .line 109
    :cond_0
    return-void
.end method
