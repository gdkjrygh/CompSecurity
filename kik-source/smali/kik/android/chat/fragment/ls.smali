.class final Lkik/android/chat/fragment/ls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/lr;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/lr;)V
    .locals 0

    .prologue
    .line 422
    iput-object p1, p0, Lkik/android/chat/fragment/ls;->a:Lkik/android/chat/fragment/lr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 426
    iget-object v0, p0, Lkik/android/chat/fragment/ls;->a:Lkik/android/chat/fragment/lr;

    iget-object v0, v0, Lkik/android/chat/fragment/lr;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->b(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V

    .line 427
    return-void
.end method
