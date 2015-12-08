.class final Lkik/android/chat/fragment/pl;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikSelectUserFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikSelectUserFragment;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lkik/android/chat/fragment/pl;->a:Lkik/android/chat/fragment/KikSelectUserFragment;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 64
    check-cast p1, Landroid/os/Bundle;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lkik/android/chat/fragment/pl;->a:Lkik/android/chat/fragment/KikSelectUserFragment;

    invoke-static {v0, p1}, Lkik/android/chat/fragment/KikSelectUserFragment;->a(Lkik/android/chat/fragment/KikSelectUserFragment;Landroid/os/Bundle;)V

    return-void
.end method
