.class final Lkik/android/chat/fragment/bc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikAddContactFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikAddContactFragment;)V
    .locals 0

    .prologue
    .line 350
    iput-object p1, p0, Lkik/android/chat/fragment/bc;->a:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .prologue
    .line 366
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 361
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    .prologue
    .line 354
    iget-object v0, p0, Lkik/android/chat/fragment/bc;->a:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 355
    iget-object v1, p0, Lkik/android/chat/fragment/bc;->a:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v1, v0}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;Ljava/lang/String;)V

    .line 356
    return-void
.end method
