.class Lcom/aetn/history/android/historyhere/fragment/MapFragment$10;
.super Ljava/lang/Object;
.source "MapFragment.java"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


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
    .line 351
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "v"    # Landroid/widget/TextView;
    .param p2, "actionId"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 354
    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    const/4 v1, 0x6

    if-eq p2, v1, :cond_0

    .line 356
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 357
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    const/16 v2, 0x42

    if-ne v1, v2, :cond_1

    .line 358
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 359
    .local v0, "currentSearchString":Ljava/lang/String;
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MapFragment;->doSearch(Ljava/lang/String;)V
    invoke-static {v1, v0}, Lcom/aetn/history/android/historyhere/fragment/MapFragment;->access$2100(Lcom/aetn/history/android/historyhere/fragment/MapFragment;Ljava/lang/String;)V

    .line 360
    const/4 v1, 0x1

    .line 362
    .end local v0    # "currentSearchString":Ljava/lang/String;
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x0

    goto :goto_0
.end method
