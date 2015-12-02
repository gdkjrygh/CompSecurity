.class Lcom/facebook/reflex/view/n;
.super Ljava/lang/Object;
.source "ListView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/reflex/view/m;


# direct methods
.method constructor <init>(Lcom/facebook/reflex/view/m;)V
    .locals 0

    .prologue
    .line 489
    iput-object p1, p0, Lcom/facebook/reflex/view/n;->a:Lcom/facebook/reflex/view/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 492
    iget-object v0, p0, Lcom/facebook/reflex/view/n;->a:Lcom/facebook/reflex/view/m;

    iget-object v0, v0, Lcom/facebook/reflex/view/m;->a:Lcom/facebook/reflex/view/h;

    invoke-static {v0}, Lcom/facebook/reflex/view/h;->i(Lcom/facebook/reflex/view/h;)V

    .line 493
    return-void
.end method
