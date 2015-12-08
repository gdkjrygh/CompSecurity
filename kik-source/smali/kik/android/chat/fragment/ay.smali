.class final Lkik/android/chat/fragment/ay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lkik/android/chat/fragment/KikAddContactFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikAddContactFragment;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lkik/android/chat/fragment/ay;->c:Lkik/android/chat/fragment/KikAddContactFragment;

    iput-object p2, p0, Lkik/android/chat/fragment/ay;->a:Ljava/lang/String;

    iput-object p3, p0, Lkik/android/chat/fragment/ay;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 124
    iget-object v0, p0, Lkik/android/chat/fragment/ay;->c:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ay;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 125
    iget-object v0, p0, Lkik/android/chat/fragment/ay;->c:Lkik/android/chat/fragment/KikAddContactFragment;

    invoke-static {v0}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/ay;->a:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 126
    iget-object v0, p0, Lkik/android/chat/fragment/ay;->c:Lkik/android/chat/fragment/KikAddContactFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/ay;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikAddContactFragment;->a(Lkik/android/chat/fragment/KikAddContactFragment;Ljava/lang/String;)V

    .line 127
    return-void
.end method
