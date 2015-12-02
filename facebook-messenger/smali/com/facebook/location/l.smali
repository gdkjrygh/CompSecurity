.class Lcom/facebook/location/l;
.super Ljava/lang/Object;
.source "GetDeviceLocationExecutor.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/location/h;

.field final synthetic b:Lcom/facebook/location/j;


# direct methods
.method constructor <init>(Lcom/facebook/location/j;Lcom/facebook/location/h;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/location/l;->b:Lcom/facebook/location/j;

    iput-object p2, p0, Lcom/facebook/location/l;->a:Lcom/facebook/location/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/location/l;->b:Lcom/facebook/location/j;

    invoke-static {v0}, Lcom/facebook/location/j;->b(Lcom/facebook/location/j;)V

    .line 124
    return-void
.end method
