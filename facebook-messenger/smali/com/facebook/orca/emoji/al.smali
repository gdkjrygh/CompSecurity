.class Lcom/facebook/orca/emoji/al;
.super Ljava/lang/Object;
.source "TabbedPageView.java"

# interfaces
.implements Landroid/support/v4/view/bb;


# instance fields
.field final synthetic a:Lcom/facebook/orca/emoji/TabbedPageView;


# direct methods
.method constructor <init>(Lcom/facebook/orca/emoji/TabbedPageView;)V
    .locals 0

    .prologue
    .line 384
    iput-object p1, p0, Lcom/facebook/orca/emoji/al;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .prologue
    .line 392
    iget-object v0, p0, Lcom/facebook/orca/emoji/al;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-static {v0}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/TabbedPageView;)Lcom/facebook/orca/emoji/an;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 393
    iget-object v0, p0, Lcom/facebook/orca/emoji/al;->a:Lcom/facebook/orca/emoji/TabbedPageView;

    invoke-static {v0}, Lcom/facebook/orca/emoji/TabbedPageView;->a(Lcom/facebook/orca/emoji/TabbedPageView;)Lcom/facebook/orca/emoji/an;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/facebook/orca/emoji/an;->a(I)V

    .line 395
    :cond_0
    return-void
.end method

.method public a(IFI)V
    .locals 0

    .prologue
    .line 388
    return-void
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 400
    return-void
.end method
