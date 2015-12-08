.class final Lkik/android/chat/fragment/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field a:J

.field final synthetic b:Lkik/android/chat/fragment/KikAddContactFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikAddContactFragment;)V
    .locals 2

    .prologue
    .line 91
    iput-object p1, p0, Lkik/android/chat/fragment/ax;->b:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkik/android/chat/fragment/ax;->a:J

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    .line 97
    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x42

    if-ne v0, v1, :cond_1

    .line 98
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x1f4

    sub-long/2addr v0, v2

    iget-wide v2, p0, Lkik/android/chat/fragment/ax;->a:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-object v0, p0, Lkik/android/chat/fragment/ax;->b:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ax;->b:Lkik/android/chat/fragment/KikAddContactFragment;

    const v2, 0x7f0901ee

    invoke-virtual {v1, v2}, Lkik/android/chat/fragment/KikAddContactFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    iget-object v0, p0, Lkik/android/chat/fragment/ax;->b:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->b(Lkik/android/chat/fragment/KikAddContactFragment;)V

    .line 100
    iget-object v0, p0, Lkik/android/chat/fragment/ax;->b:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->c(Lkik/android/chat/fragment/KikAddContactFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 101
    invoke-virtual {p1}, Landroid/widget/TextView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 102
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lkik/android/chat/fragment/ax;->a:J

    .line 105
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
