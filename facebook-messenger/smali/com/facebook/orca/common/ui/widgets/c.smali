.class Lcom/facebook/orca/common/ui/widgets/c;
.super Ljava/lang/Object;
.source "AnchorableToast.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/common/ui/widgets/a;


# direct methods
.method constructor <init>(Lcom/facebook/orca/common/ui/widgets/a;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/facebook/orca/common/ui/widgets/c;->a:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/orca/common/ui/widgets/c;->a:Lcom/facebook/orca/common/ui/widgets/a;

    invoke-static {v0}, Lcom/facebook/orca/common/ui/widgets/a;->a(Lcom/facebook/orca/common/ui/widgets/a;)V

    .line 157
    return-void
.end method
