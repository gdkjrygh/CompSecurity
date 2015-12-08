.class final Lkik/android/chat/fragment/ji;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikContactsListFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikContactsListFragment;)V
    .locals 0

    .prologue
    .line 690
    iput-object p1, p0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 694
    iget-object v0, p0, Lkik/android/chat/fragment/ji;->a:Lkik/android/chat/fragment/KikContactsListFragment;

    new-instance v1, Lkik/android/chat/fragment/jj;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/jj;-><init>(Lkik/android/chat/fragment/ji;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikContactsListFragment;->b(Ljava/lang/Runnable;)V

    .line 706
    return-void
.end method
