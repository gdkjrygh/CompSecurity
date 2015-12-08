.class Lcom/thetransitapp/droid/ItineraryScreen$1;
.super Ljava/lang/Object;
.source "ItineraryScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/ItineraryScreen;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/ItineraryScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/ItineraryScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/ItineraryScreen$1;->this$0:Lcom/thetransitapp/droid/ItineraryScreen;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 73
    iget-object v0, p0, Lcom/thetransitapp/droid/ItineraryScreen$1;->this$0:Lcom/thetransitapp/droid/ItineraryScreen;

    # getter for: Lcom/thetransitapp/droid/ItineraryScreen;->viewController:Lcom/thetransitapp/droid/controller/ItineraryMapViewController;
    invoke-static {v0}, Lcom/thetransitapp/droid/ItineraryScreen;->access$0(Lcom/thetransitapp/droid/ItineraryScreen;)Lcom/thetransitapp/droid/controller/ItineraryMapViewController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/ItineraryMapViewController;->changeDirection()V

    .line 74
    return-void
.end method
