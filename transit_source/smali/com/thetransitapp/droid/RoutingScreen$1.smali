.class Lcom/thetransitapp/droid/RoutingScreen$1;
.super Ljava/lang/Object;
.source "RoutingScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/RoutingScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/thetransitapp/droid/RoutingScreen$1;->this$0:Lcom/thetransitapp/droid/RoutingScreen;

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 168
    iget-object v0, p0, Lcom/thetransitapp/droid/RoutingScreen$1;->this$0:Lcom/thetransitapp/droid/RoutingScreen;

    invoke-virtual {v0}, Lcom/thetransitapp/droid/RoutingScreen;->onRouteClick()V

    .line 169
    return-void
.end method
