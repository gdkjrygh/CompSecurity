.class Lcom/thetransitapp/droid/widget/ErrorView$1;
.super Ljava/lang/Object;
.source "ErrorView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/ErrorView;->displayError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/ErrorView;

.field private final synthetic val$listener:Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/ErrorView;Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/ErrorView$1;->this$0:Lcom/thetransitapp/droid/widget/ErrorView;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/ErrorView$1;->val$listener:Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/thetransitapp/droid/widget/ErrorView$1;->val$listener:Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;

    invoke-interface {v0}, Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;->onErrorButtonClick()V

    .line 57
    return-void
.end method
