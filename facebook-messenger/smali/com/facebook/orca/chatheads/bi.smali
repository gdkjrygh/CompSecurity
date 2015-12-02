.class Lcom/facebook/orca/chatheads/bi;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/facebook/orca/chatheads/ec;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;)V
    .locals 0

    .prologue
    .line 493
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bi;->a:Lcom/facebook/orca/chatheads/al;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Rect;)V
    .locals 1

    .prologue
    .line 496
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bi;->a:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0, p1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Landroid/graphics/Rect;)V

    .line 497
    return-void
.end method
