.class final Lkik/android/chat/fragment/bh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/bg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/bg;)V
    .locals 0

    .prologue
    .line 86
    iput-object p1, p0, Lkik/android/chat/fragment/bh;->a:Lkik/android/chat/fragment/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lkik/android/chat/fragment/bh;->a:Lkik/android/chat/fragment/bg;

    iget-object v0, v0, Lkik/android/chat/fragment/bg;->a:Lkik/android/chat/fragment/bf;

    iget-object v0, v0, Lkik/android/chat/fragment/bf;->b:Lkik/android/chat/fragment/KikAddToBlockFragment;

    invoke-virtual {v0}, Lkik/android/chat/fragment/KikAddToBlockFragment;->S()V

    .line 92
    return-void
.end method
