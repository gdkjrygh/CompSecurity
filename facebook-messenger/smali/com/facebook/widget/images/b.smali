.class Lcom/facebook/widget/images/b;
.super Ljava/lang/Object;
.source "GalleryWithSwipingFix.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/widget/images/a;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/a;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/widget/images/b;->a:Lcom/facebook/widget/images/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/widget/images/b;->a:Lcom/facebook/widget/images/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/widget/images/a;->a(Lcom/facebook/widget/images/a;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 95
    iget-object v0, p0, Lcom/facebook/widget/images/b;->a:Lcom/facebook/widget/images/a;

    invoke-static {v0}, Lcom/facebook/widget/images/a;->a(Lcom/facebook/widget/images/a;)V

    .line 96
    return-void
.end method
