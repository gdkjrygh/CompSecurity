.class Lcom/thetransitapp/droid/TransitActivity$3;
.super Ljava/lang/Object;
.source "TransitActivity.java"

# interfaces
.implements Lcom/actionbarsherlock/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/TransitActivity;->onCreateOptionsMenu(Lcom/actionbarsherlock/view/Menu;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/TransitActivity;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/TransitActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/TransitActivity$3;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    .line 324
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Lcom/actionbarsherlock/view/MenuItem;)Z
    .locals 4
    .param p1, "item"    # Lcom/actionbarsherlock/view/MenuItem;

    .prologue
    const/4 v0, 0x1

    .line 327
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity$3;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    invoke-virtual {v1}, Lcom/thetransitapp/droid/TransitActivity;->getDisplayedScreen()Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    move-result-object v1

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    if-eq v1, v2, :cond_1

    .line 328
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity$3;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    new-instance v2, Lcom/thetransitapp/droid/OptionScreen;

    invoke-direct {v2}, Lcom/thetransitapp/droid/OptionScreen;-><init>()V

    sget-object v3, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    # invokes: Lcom/thetransitapp/droid/TransitActivity;->updateScreen(Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V
    invoke-static {v1, v2, v3, v0}, Lcom/thetransitapp/droid/TransitActivity;->access$5(Lcom/thetransitapp/droid/TransitActivity;Landroid/support/v4/app/Fragment;Lcom/thetransitapp/droid/TransitActivity$TransitScreen;Z)V

    .line 330
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity$3;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;
    invoke-static {v1}, Lcom/thetransitapp/droid/TransitActivity;->access$2(Lcom/thetransitapp/droid/TransitActivity;)Lcom/thetransitapp/droid/RoutesScreen;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 331
    iget-object v1, p0, Lcom/thetransitapp/droid/TransitActivity$3;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    # getter for: Lcom/thetransitapp/droid/TransitActivity;->routeScreen:Lcom/thetransitapp/droid/RoutesScreen;
    invoke-static {v1}, Lcom/thetransitapp/droid/TransitActivity;->access$2(Lcom/thetransitapp/droid/TransitActivity;)Lcom/thetransitapp/droid/RoutesScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/thetransitapp/droid/RoutesScreen;->clearError()V

    .line 337
    :cond_0
    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
