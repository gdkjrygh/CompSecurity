.class final Lkik/android/chat/fragment/fe;
.super Lcom/kik/m/c;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/text/Editable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:I

.field final synthetic d:Lkik/android/chat/fragment/KikChatFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChatFragment;Landroid/text/Editable;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 4156
    iput-object p1, p0, Lkik/android/chat/fragment/fe;->d:Lkik/android/chat/fragment/KikChatFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/fe;->a:Landroid/text/Editable;

    iput-object p3, p0, Lkik/android/chat/fragment/fe;->b:Ljava/lang/String;

    iput p4, p0, Lkik/android/chat/fragment/fe;->c:I

    invoke-direct {p0}, Lcom/kik/m/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .prologue
    .line 4160
    iget-object v0, p0, Lkik/android/chat/fragment/fe;->d:Lkik/android/chat/fragment/KikChatFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/fe;->a:Landroid/text/Editable;

    iget-object v2, p0, Lkik/android/chat/fragment/fe;->b:Ljava/lang/String;

    iget v3, p0, Lkik/android/chat/fragment/fe;->c:I

    invoke-static {v0, v1, v2, v3}, Lkik/android/chat/fragment/KikChatFragment;->a(Lkik/android/chat/fragment/KikChatFragment;Landroid/text/Editable;Ljava/lang/String;I)V

    .line 4161
    return-void
.end method
