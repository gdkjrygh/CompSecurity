.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$8;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->showFavoritesIntro()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 229
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 232
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hideFavoritesIntro()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$500(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    .line 233
    return-void
.end method
