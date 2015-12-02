.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;)V
    .locals 0

    .prologue
    .line 392
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 396
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-nez v0, :cond_0

    .line 402
    :goto_0
    return-void

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->getProgress()F

    move-result v1

    const/high16 v2, 0x43b40000    # 360.0f

    const/16 v3, 0x3e8

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$2;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v4, v4, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->i(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar$a;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->a(FFILcom/qihoo/security/malware/widget/RadarProgressBar$a;)V

    goto :goto_0
.end method
