.class Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;
.super Ljava/lang/Object;
.source "PickerFragment.java"

# interfaces
.implements Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/widget/PickerFragment$LoadingStrategy;->attach(Lcom/facebook/widget/GraphObjectAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/widget/GraphObjectAdapter$OnErrorListener;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;


# direct methods
.method constructor <init>(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;

    .line 921
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/facebook/widget/GraphObjectAdapter;Lcom/facebook/FacebookException;)V
    .locals 2
    .param p2, "error"    # Lcom/facebook/FacebookException;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/widget/GraphObjectAdapter",
            "<*>;",
            "Lcom/facebook/FacebookException;",
            ")V"
        }
    .end annotation

    .prologue
    .line 924
    .local p1, "adapter":Lcom/facebook/widget/GraphObjectAdapter;, "Lcom/facebook/widget/GraphObjectAdapter<*>;"
    iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;

    # getter for: Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    invoke-static {v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->access$0(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)Lcom/facebook/widget/PickerFragment;

    move-result-object v0

    # getter for: Lcom/facebook/widget/PickerFragment;->onErrorListener:Lcom/facebook/widget/PickerFragment$OnErrorListener;
    invoke-static {v0}, Lcom/facebook/widget/PickerFragment;->access$1(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 925
    iget-object v0, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;

    # getter for: Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    invoke-static {v0}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->access$0(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)Lcom/facebook/widget/PickerFragment;

    move-result-object v0

    # getter for: Lcom/facebook/widget/PickerFragment;->onErrorListener:Lcom/facebook/widget/PickerFragment$OnErrorListener;
    invoke-static {v0}, Lcom/facebook/widget/PickerFragment;->access$1(Lcom/facebook/widget/PickerFragment;)Lcom/facebook/widget/PickerFragment$OnErrorListener;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/widget/PickerFragment$LoadingStrategy$3;->this$1:Lcom/facebook/widget/PickerFragment$LoadingStrategy;

    # getter for: Lcom/facebook/widget/PickerFragment$LoadingStrategy;->this$0:Lcom/facebook/widget/PickerFragment;
    invoke-static {v1}, Lcom/facebook/widget/PickerFragment$LoadingStrategy;->access$0(Lcom/facebook/widget/PickerFragment$LoadingStrategy;)Lcom/facebook/widget/PickerFragment;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/facebook/widget/PickerFragment$OnErrorListener;->onError(Lcom/facebook/widget/PickerFragment;Lcom/facebook/FacebookException;)V

    .line 927
    :cond_0
    return-void
.end method
