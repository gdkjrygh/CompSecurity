.class Lcom/thetransitapp/droid/LocationScreen$1;
.super Ljava/lang/Object;
.source "LocationScreen.java"

# interfaces
.implements Lcom/thetransitapp/droid/service/ServiceCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/LocationScreen;->onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/thetransitapp/droid/service/ServiceCallback",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/LocationScreen;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/LocationScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/LocationScreen$1;->this$0:Lcom/thetransitapp/droid/LocationScreen;

    .line 191
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0
    .param p1, "message"    # Ljava/lang/String;
    .param p2, "exception"    # Ljava/lang/Exception;

    .prologue
    .line 201
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/thetransitapp/droid/LocationScreen$1;->onResult(Ljava/lang/String;)V

    return-void
.end method

.method public onResult(Ljava/lang/String;)V
    .locals 2
    .param p1, "result"    # Ljava/lang/String;

    .prologue
    .line 194
    if-eqz p1, :cond_0

    .line 195
    iget-object v0, p0, Lcom/thetransitapp/droid/LocationScreen$1;->this$0:Lcom/thetransitapp/droid/LocationScreen;

    # getter for: Lcom/thetransitapp/droid/LocationScreen;->searchView:Lcom/actionbarsherlock/widget/SearchView;
    invoke-static {v0}, Lcom/thetransitapp/droid/LocationScreen;->access$0(Lcom/thetransitapp/droid/LocationScreen;)Lcom/actionbarsherlock/widget/SearchView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/actionbarsherlock/widget/SearchView;->setQuery(Ljava/lang/CharSequence;Z)V

    .line 197
    :cond_0
    return-void
.end method
