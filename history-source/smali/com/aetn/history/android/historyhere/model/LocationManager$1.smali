.class Lcom/aetn/history/android/historyhere/model/LocationManager$1;
.super Ljava/lang/Object;
.source "LocationManager.java"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/model/LocationManager;->showErrorDialog(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/model/LocationManager;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/model/LocationManager;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/model/LocationManager;

    .prologue
    .line 109
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/model/LocationManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/LocationManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;

    .prologue
    .line 112
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/model/LocationManager$1;->this$0:Lcom/aetn/history/android/historyhere/model/LocationManager;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/model/LocationManager;->notifyPlayServiceFailed()V

    .line 113
    return-void
.end method
