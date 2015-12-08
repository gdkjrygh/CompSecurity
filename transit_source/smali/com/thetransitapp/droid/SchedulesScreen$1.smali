.class Lcom/thetransitapp/droid/SchedulesScreen$1;
.super Ljava/lang/Object;
.source "SchedulesScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/SchedulesScreen;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/SchedulesScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/SchedulesScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/SchedulesScreen$1;->this$0:Lcom/thetransitapp/droid/SchedulesScreen;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 40
    iget-object v0, p0, Lcom/thetransitapp/droid/SchedulesScreen$1;->this$0:Lcom/thetransitapp/droid/SchedulesScreen;

    # getter for: Lcom/thetransitapp/droid/SchedulesScreen;->viewController:Lcom/thetransitapp/droid/controller/ScheduleViewController;
    invoke-static {v0}, Lcom/thetransitapp/droid/SchedulesScreen;->access$0(Lcom/thetransitapp/droid/SchedulesScreen;)Lcom/thetransitapp/droid/controller/ScheduleViewController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/thetransitapp/droid/controller/ScheduleViewController;->changeDirection()V

    .line 41
    return-void
.end method
