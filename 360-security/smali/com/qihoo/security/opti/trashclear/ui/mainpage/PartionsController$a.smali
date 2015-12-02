.class public Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

.field public b:J

.field public c:J


# direct methods
.method public constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;)V
    .locals 2

    .prologue
    const-wide/16 v0, 0x0

    .line 713
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 709
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    .line 710
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    .line 714
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a:Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType;

    .line 715
    return-void
.end method


# virtual methods
.method public a()F
    .locals 4

    .prologue
    .line 725
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 726
    const/4 v0, 0x0

    .line 728
    :goto_0
    return v0

    :cond_0
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    long-to-float v0, v0

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    long-to-float v1, v2

    div-float/2addr v0, v1

    goto :goto_0
.end method

.method public b()F
    .locals 2

    .prologue
    .line 739
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->a()F

    move-result v1

    sub-float/2addr v0, v1

    return v0
.end method

.method public c()J
    .locals 4

    .prologue
    .line 744
    iget-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->c:J

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$a;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
