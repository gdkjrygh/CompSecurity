.class final Lkik/android/chat/fragment/dh;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkik/android/chat/fragment/dg;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/dg;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1769
    iput-object p1, p0, Lkik/android/chat/fragment/dh;->b:Lkik/android/chat/fragment/dg;

    iput-object p2, p0, Lkik/android/chat/fragment/dh;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .prologue
    .line 1773
    iget-object v0, p0, Lkik/android/chat/fragment/dh;->b:Lkik/android/chat/fragment/dg;

    iget-object v0, v0, Lkik/android/chat/fragment/dg;->a:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/dh;->a:Ljava/lang/String;

    sget v2, Lkik/a/d/s$a;->b:I

    invoke-static {v0, v1, v2}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Ljava/lang/String;I)V

    .line 1774
    return-void
.end method
