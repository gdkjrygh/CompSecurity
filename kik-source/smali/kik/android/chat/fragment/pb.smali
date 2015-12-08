.class final Lkik/android/chat/fragment/pb;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/text/Editable;

.field final synthetic b:Lkik/android/chat/fragment/pa;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/pa;Landroid/text/Editable;)V
    .locals 0

    .prologue
    .line 352
    iput-object p1, p0, Lkik/android/chat/fragment/pb;->b:Lkik/android/chat/fragment/pa;

    iput-object p2, p0, Lkik/android/chat/fragment/pb;->a:Landroid/text/Editable;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 356
    iget-object v0, p0, Lkik/android/chat/fragment/pb;->b:Lkik/android/chat/fragment/pa;

    iget-object v0, v0, Lkik/android/chat/fragment/pa;->a:Lkik/android/chat/fragment/KikRegistrationFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/pb;->a:Landroid/text/Editable;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikRegistrationFragment;->a(Lkik/android/chat/fragment/KikRegistrationFragment;Ljava/lang/String;)V

    .line 357
    return-void
.end method
