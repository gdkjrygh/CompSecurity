.class Lcom/facebook/widget/text/n;
.super Ljava/lang/Object;
.source "VariableTextLayoutView.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field final synthetic a:Lcom/facebook/widget/text/m;


# direct methods
.method constructor <init>(Lcom/facebook/widget/text/m;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/facebook/widget/text/n;->a:Lcom/facebook/widget/text/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .locals 1

    .prologue
    .line 77
    iget-object v0, p0, Lcom/facebook/widget/text/n;->a:Lcom/facebook/widget/text/m;

    invoke-static {v0}, Lcom/facebook/widget/text/m;->a(Lcom/facebook/widget/text/m;)Z

    move-result v0

    return v0
.end method
