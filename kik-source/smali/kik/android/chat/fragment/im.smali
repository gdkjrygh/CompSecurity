.class final Lkik/android/chat/fragment/im;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/il;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/il;)V
    .locals 0

    .prologue
    .line 687
    iput-object p1, p0, Lkik/android/chat/fragment/im;->a:Lkik/android/chat/fragment/il;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 687
    check-cast p1, [B

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    new-instance v0, Lcom/kik/scan/RemoteKikCode;

    iget-object v1, p0, Lkik/android/chat/fragment/im;->a:Lkik/android/chat/fragment/il;

    iget v1, v1, Lkik/android/chat/fragment/il;->a:I

    invoke-direct {v0, p1, v1}, Lcom/kik/scan/RemoteKikCode;-><init>([BI)V

    iget-object v1, p0, Lkik/android/chat/fragment/im;->a:Lkik/android/chat/fragment/il;

    iget-object v1, v1, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 699
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 700
    iget-object v0, p0, Lkik/android/chat/fragment/im;->a:Lkik/android/chat/fragment/il;

    iget-object v0, v0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/im;->a:Lkik/android/chat/fragment/il;

    iget-object v1, v1, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCodeFragment;->o(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$c;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V

    .line 701
    return-void
.end method
