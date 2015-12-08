.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->showSearch()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .prologue
    .line 1271
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 1275
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    .line 1276
    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 1277
    .local v0, "keyboard":Landroid/view/inputmethod/InputMethodManager;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$20;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/widget/EditText;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 1278
    return-void
.end method
