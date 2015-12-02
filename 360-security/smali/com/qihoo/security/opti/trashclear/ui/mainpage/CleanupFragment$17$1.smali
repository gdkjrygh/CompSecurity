.class Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;II)V
    .locals 0

    .prologue
    .line 371
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iput p2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->a:I

    iput p3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 375
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->g(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$e;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 382
    :cond_0
    :goto_0
    return-void

    .line 378
    :cond_1
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v0, v1

    .line 379
    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v1, v1, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v1}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->c:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;

    iget-object v2, v2, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;

    invoke-static {v2}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;->h(Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->getProgress()F

    move-result v2

    iget v3, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/CleanupFragment$17$1;->b:I

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->a(FFILcom/qihoo/security/malware/widget/RadarProgressBar$a;)V

    goto :goto_0
.end method
