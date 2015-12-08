.class Lcom/jirbo/adcolony/AdColonyOverlay$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/jirbo/adcolony/AdColonyOverlay;


# direct methods
.method constructor <init>(Lcom/jirbo/adcolony/AdColonyOverlay;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/jirbo/adcolony/AdColonyOverlay$1;->b:Lcom/jirbo/adcolony/AdColonyOverlay;

    iput-object p2, p0, Lcom/jirbo/adcolony/AdColonyOverlay$1;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 48
    iget-object v0, p0, Lcom/jirbo/adcolony/AdColonyOverlay$1;->b:Lcom/jirbo/adcolony/AdColonyOverlay;

    iget-object v0, v0, Lcom/jirbo/adcolony/AdColonyOverlay;->N:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/jirbo/adcolony/AdColonyOverlay$1;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 49
    return-void
.end method
