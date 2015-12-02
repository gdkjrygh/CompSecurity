.class Lcom/facebook/maps/b;
.super Ljava/lang/Object;
.source "FacebookMapView.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/maps/a;


# direct methods
.method constructor <init>(Lcom/facebook/maps/a;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/maps/b;->a:Lcom/facebook/maps/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/maps/b;->a:Lcom/facebook/maps/a;

    invoke-static {v0}, Lcom/facebook/maps/a;->a(Lcom/facebook/maps/a;)Lcom/facebook/maps/n;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/maps/n;->b()V

    .line 56
    return-void
.end method
