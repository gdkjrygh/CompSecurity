.class final Lkik/android/chat/fragment/go;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/gn;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/gn;)V
    .locals 0

    .prologue
    .line 852
    iput-object p1, p0, Lkik/android/chat/fragment/go;->a:Lkik/android/chat/fragment/gn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 856
    iget-object v0, p0, Lkik/android/chat/fragment/go;->a:Lkik/android/chat/fragment/gn;

    iget-object v0, v0, Lkik/android/chat/fragment/gn;->b:Lkik/android/chat/fragment/KikChatInfoFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/KikChatInfoFragment;->b(Z)V

    .line 857
    return-void
.end method
