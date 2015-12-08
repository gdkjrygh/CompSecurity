.class final Lkik/android/chat/fragment/pm;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikSelectUserFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikSelectUserFragment;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lkik/android/chat/fragment/pm;->a:Lkik/android/chat/fragment/KikSelectUserFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 137
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/pm;->a:Lkik/android/chat/fragment/KikSelectUserFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Lkik/android/chat/fragment/KikSelectUserFragment;Landroid/os/Bundle;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 149
    iget-object v0, p0, Lkik/android/chat/fragment/pm;->a:Lkik/android/chat/fragment/KikSelectUserFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikSelectUserFragment;->S()V

    .line 150
    return-void
.end method
