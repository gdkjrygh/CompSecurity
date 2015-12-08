.class final Lkik/android/chat/fragment/c;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/AbTestsFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/AbTestsFragment;)V
    .locals 0

    .prologue
    .line 130
    iput-object p1, p0, Lkik/android/chat/fragment/c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 130
    iget-object v0, p0, Lkik/android/chat/fragment/c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/AbTestsFragment;->b(Lkik/android/chat/fragment/AbTestsFragment;)V

    iget-object v0, p0, Lkik/android/chat/fragment/c;->a:Lkik/android/chat/fragment/AbTestsFragment;

    new-instance v1, Lkik/android/chat/fragment/d;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/d;-><init>(Lkik/android/chat/fragment/c;)V

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/AbTestsFragment;->b(Ljava/lang/Runnable;)V

    return-void
.end method
