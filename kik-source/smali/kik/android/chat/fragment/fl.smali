.class final Lkik/android/chat/fragment/fl;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lkik/android/chat/fragment/fk;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/fk;Z)V
    .locals 0

    .prologue
    .line 4654
    iput-object p1, p0, Lkik/android/chat/fragment/fl;->b:Lkik/android/chat/fragment/fk;

    iput-boolean p2, p0, Lkik/android/chat/fragment/fl;->a:Z

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 4657
    iget-boolean v0, p0, Lkik/android/chat/fragment/fl;->a:Z

    if-nez v0, :cond_0

    .line 4658
    iget-object v0, p0, Lkik/android/chat/fragment/fl;->b:Lkik/android/chat/fragment/fk;

    iget-object v0, v0, Lkik/android/chat/fragment/fk;->b:Lkik/android/chat/fragment/KikChatFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChatFragment;->aP(Lkik/android/chat/fragment/KikChatFragment;)Z

    .line 4660
    :cond_0
    return-void
.end method
