.class Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;
.super Ljava/lang/Object;
.source "SwipeCover.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private lastPos:I

.field final synthetic this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;


# direct methods
.method constructor <init>(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)V
    .locals 1

    .prologue
    .line 46
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->lastPos:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    .line 51
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->getScrollX()I

    move-result v0

    .line 52
    .local v0, "newpos":I
    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->lastPos:I

    sub-int/2addr v1, v0

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->FLING_THRESHOLD:I
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$000()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 53
    const-string v1, "SC"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "threshold: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I
    invoke-static {v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$100(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " -- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->lastPos:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " -- "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->threshold:I
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$100(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I

    move-result v1

    if-le v0, v1, :cond_0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->scrollStart:I
    invoke-static {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$200(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I

    move-result v1

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->SPRING_THRESHOLD:I
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$300(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)I

    move-result v2

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_0

    .line 55
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->resetScroll()V

    .line 59
    :goto_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    const/high16 v2, -0x80000000

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->lastButton:I
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$402(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;I)I

    .line 60
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    const/4 v2, 0x0

    # setter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->ignoreButtons:Z
    invoke-static {v1, v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$502(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;Z)Z

    .line 66
    :goto_1
    return-void

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    invoke-virtual {v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->openScroll()V

    goto :goto_0

    .line 62
    :cond_1
    iput v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->lastPos:I

    .line 63
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover$1;->this$0:Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->snapCheck:Ljava/lang/Runnable;
    invoke-static {v2}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$600(Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;)Ljava/lang/Runnable;

    move-result-object v2

    # getter for: Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->checkDelay:I
    invoke-static {}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->access$700()I

    move-result v3

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lcom/EnterpriseMobileBanking/Plugins/Components/SwipeCover;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_1
.end method
