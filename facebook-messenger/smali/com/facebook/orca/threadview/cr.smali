.class Lcom/facebook/orca/threadview/cr;
.super Ljava/lang/Object;
.source "ThreadViewMapActivityImpl.java"

# interfaces
.implements Lcom/google/android/maps/ItemizedOverlay$OnFocusChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/facebook/orca/threadview/cr;->a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChanged(Lcom/google/android/maps/ItemizedOverlay;Lcom/google/android/maps/OverlayItem;)V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/threadview/cr;->a:Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;

    invoke-static {v0, p2}, Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;->a(Lcom/facebook/orca/threadview/ThreadViewMapActivityImpl;Lcom/google/android/maps/OverlayItem;)V

    .line 124
    return-void
.end method
