.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;->a(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 349
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;

    iput-object p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 353
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 357
    :goto_0
    return-void

    .line 356
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;->b:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->f(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$16$1;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
