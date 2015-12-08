.class final Lkik/android/chat/fragment/lm;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikGroupMembersListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikGroupMembersListFragment;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lkik/android/chat/fragment/lm;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 148
    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lkik/android/chat/fragment/lm;->a:Lkik/android/chat/fragment/KikGroupMembersListFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikGroupMembersListFragment;->a(Lkik/android/chat/fragment/KikGroupMembersListFragment;Landroid/os/Bundle;)V

    return-void
.end method
