.class Lcom/aetn/history/android/historyhere/view/SuggestActivity$3;
.super Ljava/lang/Object;
.source "SuggestActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/view/SuggestActivity;->setErrorMessage(Ljava/lang/String;)V
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
    .line 214
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$3;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 217
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/view/SuggestActivity$3;->this$0:Lcom/aetn/history/android/historyhere/view/SuggestActivity;

    # getter for: Lcom/aetn/history/android/historyhere/view/SuggestActivity;->mSuggestPrompt:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/view/SuggestActivity;->access$1200(Lcom/aetn/history/android/historyhere/view/SuggestActivity;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 218
    return-void
.end method
