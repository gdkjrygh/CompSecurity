.class final Lkik/android/chat/fragment/iu;
.super Lcom/kik/g/i;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lkik/android/chat/fragment/iu;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {p0}, Lcom/kik/g/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 294
    check-cast p2, Ljava/lang/String;

    iget-object v0, p0, Lkik/android/chat/fragment/iu;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->k(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/fragment/iu;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikCodeFragment;->k(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$b;

    move-result-object v0

    invoke-interface {v0}, Lkik/android/chat/fragment/KikCodeFragment$b;->a()V

    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/iu;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0, p2}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Ljava/lang/String;)V

    return-void
.end method
