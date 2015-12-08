.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$5;
.super Ljava/lang/Object;
.source "SuggestActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setSuccessMessage()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    .prologue
    .line 238
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 241
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$5;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->finish()V

    .line 242
    return-void
.end method
