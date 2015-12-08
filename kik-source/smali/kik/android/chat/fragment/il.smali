.class final Lkik/android/chat/fragment/il;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:I

.field final synthetic b:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;I)V
    .locals 0

    .prologue
    .line 680
    iput-object p1, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iput p2, p0, Lkik/android/chat/fragment/il;->a:I

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 680
    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    iget-object v1, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCodeFragment;->n(Lkik/android/chat/fragment/KikCodeFragment;)Landroid/view/View$OnTouchListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/widget/KikFinderCodeImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x14

    if-le v1, v2, :cond_0

    iget-object v1, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->h:Lkik/android/scan/d;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lkik/android/scan/d;->a(Lkik/a/d/aa;I)Lcom/kik/g/p;

    move-result-object v0

    new-instance v1, Lkik/android/chat/fragment/im;

    invoke-direct {v1, p0}, Lkik/android/chat/fragment/im;-><init>(Lkik/android/chat/fragment/il;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/kik/scan/UsernameKikCode;

    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget v3, p0, Lkik/android/chat/fragment/il;->a:I

    invoke-direct {v1, v0, v2, v3}, Lcom/kik/scan/UsernameKikCode;-><init>(Ljava/lang/String;II)V

    iget-object v0, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCodeFragment;->b(Lkik/android/chat/fragment/KikCodeFragment;Lcom/kik/scan/KikCode;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 713
    invoke-static {p1}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    .line 714
    iget-object v0, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, p0, Lkik/android/chat/fragment/il;->b:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCodeFragment;->o(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/android/chat/fragment/KikCodeFragment$c;

    move-result-object v1

    invoke-static {v0, v1}, Lkik/android/chat/fragment/KikCodeFragment;->a(Lkik/android/chat/fragment/KikCodeFragment;Lkik/android/chat/fragment/KikCodeFragment$c;)V

    .line 715
    return-void
.end method
