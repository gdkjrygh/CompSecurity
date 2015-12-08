.class Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;
.super Ljava/lang/Object;
.source "DefaultClusterRenderer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;


# direct methods
.method constructor <init>(Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;)V
    .locals 0

    .prologue
    .line 259
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier.1;"
    iput-object p1, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;->this$1:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 262
    .local p0, "this":Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;, "Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier.1;"
    iget-object v0, p0, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier$1;->this$1:Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/maps/android/clustering/view/DefaultClusterRenderer$ViewModifier;->sendEmptyMessage(I)Z

    .line 263
    return-void
.end method
