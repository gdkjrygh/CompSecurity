.class Lcom/facebook/maps/p;
.super Ljava/lang/Object;
.source "MapImage.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/maps/MapImage;


# direct methods
.method constructor <init>(Lcom/facebook/maps/MapImage;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/facebook/maps/p;->a:Lcom/facebook/maps/MapImage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/maps/p;->a:Lcom/facebook/maps/MapImage;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/maps/MapImage;->a(Lcom/facebook/maps/MapImage;Z)Z

    .line 228
    iget-object v0, p0, Lcom/facebook/maps/p;->a:Lcom/facebook/maps/MapImage;

    invoke-static {v0}, Lcom/facebook/maps/MapImage;->a(Lcom/facebook/maps/MapImage;)V

    .line 229
    return-void
.end method
