.class final Lkik/android/chat/fragment/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/c;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/c;)V
    .locals 0

    .prologue
    .line 135
    iput-object p1, p0, Lkik/android/chat/fragment/d;->a:Lkik/android/chat/fragment/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lkik/android/chat/fragment/d;->a:Lkik/android/chat/fragment/c;

    iget-object v0, v0, Lkik/android/chat/fragment/c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->a(Lkik/android/chat/fragment/AbTestsFragment;)Lcom/kik/view/adapters/bb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/view/adapters/bb;->notifyDataSetChanged()V

    .line 140
    return-void
.end method
