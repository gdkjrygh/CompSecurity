.class final Lkik/android/chat/fragment/lu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/lt;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/lt;)V
    .locals 0

    .prologue
    .line 495
    iput-object p1, p0, Lkik/android/chat/fragment/lu;->a:Lkik/android/chat/fragment/lt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 499
    iget-object v0, p0, Lkik/android/chat/fragment/lu;->a:Lkik/android/chat/fragment/lt;

    iget-object v0, v0, Lkik/android/chat/fragment/lt;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    .line 500
    return-void
.end method
