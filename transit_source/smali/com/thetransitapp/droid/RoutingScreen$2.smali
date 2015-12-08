.class Lcom/thetransitapp/droid/RoutingScreen$2;
.super Ljava/lang/Object;
.source "RoutingScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/widget/ErrorView$OnErrorButtonClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutingScreen;->onError(Lcom/thetransitapp/droid/model/RoutingRequest$ErrorType;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/RoutingScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/RoutingScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutingScreen$2;->this$0:Lcom/thetransitapp/droid/RoutingScreen;

    .line 609
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorButtonClick()V
    .locals 1

    .prologue
    .line 612
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen$2;->this$0:Lcom/thetransitapp/droid/RoutingScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/RoutingScreen;->hideError()V

    .line 614
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen$2;->this$0:Lcom/thetransitapp/droid/RoutingScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/RoutingScreen;->onRouteClick()V

    .line 615
    return-void
.end method
