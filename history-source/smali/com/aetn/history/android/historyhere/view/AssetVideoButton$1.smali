.class Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;
.super Ljava/lang/Object;
.source "AssetVideoButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/AssetVideoButton;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/AssetVideoButton;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    .prologue
    .line 54
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;->this$0:Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;->this$0:Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    # getter for: Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->TAG:Ljava/lang/String;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->access$000(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "clicked on the bubble"

    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/AssetVideoButton$1;->this$0:Lcom/aetn/history/android/historyhere/view/AssetVideoButton;

    # invokes: Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->openContent()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/AssetVideoButton;->access$100(Lcom/aetn/history/android/historyhere/view/AssetVideoButton;)V

    .line 58
    return-void
.end method
