.class final Lkik/android/chat/fragment/qe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnCreateContextMenuListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/MissedConversationsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/MissedConversationsFragment;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lkik/android/chat/fragment/qe;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lkik/android/chat/fragment/qe;->a:Lkik/android/chat/fragment/MissedConversationsFragment;

    invoke-virtual {v0, p1, p3}, Lkik/android/chat/fragment/MissedConversationsFragment;->a(Landroid/view/ContextMenu;Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 76
    return-void
.end method
