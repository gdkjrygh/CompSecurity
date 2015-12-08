.class final Lkik/android/chat/fragment/br;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V
    .locals 0

    .prologue
    .line 76
    iput-object p1, p0, Lkik/android/chat/fragment/br;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 81
    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_1

    .line 82
    :cond_0
    iget-object v0, p0, Lkik/android/chat/fragment/br;->a:Lkik/android/chat/fragment/KikChangeGroupNameFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikChangeGroupNameFragment;->a(Lkik/android/chat/fragment/KikChangeGroupNameFragment;)V

    .line 84
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
