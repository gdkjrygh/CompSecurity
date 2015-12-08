.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapFragment;->setListeners()V
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
    .line 343
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 346
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$9;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->mSearchEditText:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2000(Lcom/aetn/history/android/historyhere/fragment/MapFragment;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->doSearch(Ljava/lang/String;)V
    invoke-static {v0, v1}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)V

    .line 347
    return-void
.end method
