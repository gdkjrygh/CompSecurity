.class Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$2;
.super Ljava/lang/Object;
.source "ListViewFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    .prologue
    .line 129
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 132
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment$2;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/ListViewFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hidePlacesList()V

    .line 133
    return-void
.end method
