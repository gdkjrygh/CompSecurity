.class public Lcom/qihoo/security/clearengine/b/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/clearengine/b/a$a;,
        Lcom/qihoo/security/clearengine/b/a$b;
    }
.end annotation


# instance fields
.field private final A:Ljava/lang/Object;

.field private B:Z

.field a:Lcom/qihoo/security/clearengine/b/b;

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field protected c:Landroid/os/HandlerThread;

.field private d:Landroid/content/Context;

.field private e:Lcom/qihoo/security/clearengine/a/a;

.field private f:Lcom/qihoo/security/clearengine/surface/a;

.field private g:I

.field private h:[I

.field private i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/qihoo/security/clearengine/sdk/b;

.field private final k:Ljava/lang/Object;

.field private l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

.field private s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/qihoo/security/clearengine/TrashType;",
            "Lcom/qihoo/security/clearengine/surface/b;",
            ">;"
        }
    .end annotation
.end field

.field private final t:Ljava/lang/Object;

.field private u:Lcom/qihoo/security/clearengine/b/a$b;

.field private v:Landroid/content/ServiceConnection;

.field private w:Lcom/qihoo/security/clearengine/a/c;

.field private x:Lcom/qihoo/security/clearengine/a/b;

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    .line 73
    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    .line 75
    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    .line 77
    const/16 v0, 0xb

    iput v0, p0, Lcom/qihoo/security/clearengine/b/a;->g:I

    .line 84
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/b;

    invoke-direct {v0}, Lcom/qihoo/security/clearengine/sdk/b;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->j:Lcom/qihoo/security/clearengine/sdk/b;

    .line 86
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->k:Ljava/lang/Object;

    .line 102
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    .line 103
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->t:Ljava/lang/Object;

    .line 119
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->b:Ljava/util/Map;

    .line 216
    new-instance v0, Lcom/qihoo/security/clearengine/b/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/b/a$1;-><init>(Lcom/qihoo/security/clearengine/b/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->v:Landroid/content/ServiceConnection;

    .line 344
    new-instance v0, Lcom/qihoo/security/clearengine/b/a$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/b/a$2;-><init>(Lcom/qihoo/security/clearengine/b/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->w:Lcom/qihoo/security/clearengine/a/c;

    .line 450
    new-instance v0, Lcom/qihoo/security/clearengine/b/a$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/b/a$3;-><init>(Lcom/qihoo/security/clearengine/b/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->x:Lcom/qihoo/security/clearengine/a/b;

    .line 503
    iput-boolean v1, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    .line 504
    iput-boolean v1, p0, Lcom/qihoo/security/clearengine/b/a;->z:Z

    .line 510
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    .line 1305
    iput-boolean v1, p0, Lcom/qihoo/security/clearengine/b/a;->B:Z

    .line 106
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    .line 107
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/b/a$b;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    return-object v0
.end method

.method private a(Ljava/util/List;Ljava/util/ArrayList;Z)Lcom/qihoo/security/clearengine/sdk/b;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/qihoo/security/clearengine/sdk/b;"
        }
    .end annotation

    .prologue
    .line 695
    new-instance v10, Lcom/qihoo/security/clearengine/sdk/b;

    invoke-direct {v10}, Lcom/qihoo/security/clearengine/sdk/b;-><init>()V

    .line 698
    new-instance v11, Ljava/util/HashMap;

    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 699
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 700
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    .line 749
    const-wide/16 v4, 0x0

    .line 750
    const-wide/16 v2, 0x0

    .line 751
    new-instance v13, Ljava/util/HashSet;

    invoke-direct {v13}, Ljava/util/HashSet;-><init>()V

    .line 752
    invoke-virtual {v11}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v14

    move-wide v6, v2

    move-wide v8, v4

    :cond_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_8

    .line 797
    invoke-virtual {v13}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_d

    .line 802
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_e

    .line 811
    iget-wide v2, v10, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    sub-long/2addr v2, v8

    iput-wide v2, v10, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    .line 812
    iget-wide v2, v10, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    sub-long/2addr v2, v6

    iput-wide v2, v10, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    .line 816
    return-object v10

    .line 700
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 702
    iget v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 707
    :sswitch_0
    iget-object v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 708
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 710
    const/16 v5, 0x141

    iget v6, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-eq v5, v6, :cond_4

    .line 711
    const/16 v5, 0x21

    iget v6, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-eq v5, v6, :cond_4

    .line 712
    const/16 v5, 0x143

    iget v6, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-eq v5, v6, :cond_4

    .line 713
    const/16 v5, 0x170

    iget v6, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-ne v5, v6, :cond_3

    .line 716
    :cond_4
    iget-object v5, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v6, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 717
    iget-object v5, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v6, "subList"

    invoke-virtual {v5, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    .line 718
    if-nez v5, :cond_5

    .line 719
    iget-object v5, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {v11, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 721
    :cond_5
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 722
    iget-object v6, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {v11, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 730
    :sswitch_1
    iget-object v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 731
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 732
    iget-object v3, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v6, "overlapPath"

    invoke-virtual {v3, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 733
    if-eqz v6, :cond_6

    .line 734
    invoke-virtual {v12, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 735
    if-nez v3, :cond_7

    .line 736
    new-instance v3, Ljava/util/ArrayList;

    const/4 v7, 0x3

    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 738
    :cond_7
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    invoke-virtual {v12, v6, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    .line 752
    :cond_8
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 754
    invoke-virtual {v12, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 755
    if-eqz v3, :cond_1

    .line 758
    invoke-virtual {v11, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 759
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 761
    const/16 v5, 0x22

    iget v0, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    move/from16 v16, v0

    move/from16 v0, v16

    if-ne v5, v0, :cond_c

    .line 762
    if-eqz p2, :cond_c

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 764
    iget-boolean v5, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v5, :cond_b

    iget-boolean v5, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v5, :cond_b

    const/4 v5, 0x1

    :goto_7
    iput-boolean v5, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 783
    :cond_9
    :goto_8
    iget-wide v0, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    move-wide/from16 v16, v0

    add-long v8, v8, v16

    .line 785
    iget-boolean v5, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v5, :cond_a

    iget-boolean v5, v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v5, :cond_a

    iget-boolean v5, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v5, :cond_a

    .line 786
    iget-boolean v5, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v5, :cond_a

    .line 787
    iget-wide v0, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    move-wide/from16 v16, v0

    add-long v6, v6, v16

    .line 792
    :cond_a
    iget v3, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v13, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 764
    :cond_b
    const/4 v5, 0x0

    goto :goto_7

    .line 769
    :cond_c
    const/16 v5, 0x23

    iget v0, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    move/from16 v16, v0

    move/from16 v0, v16

    if-ne v5, v0, :cond_9

    if-nez p3, :cond_9

    .line 770
    if-eqz p2, :cond_9

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_8

    .line 797
    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    .line 798
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lcom/qihoo/security/clearengine/b/a;->f(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    move-result-object v2

    invoke-static {v2}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    goto/16 :goto_1

    .line 802
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 803
    iget-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    iget-wide v12, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    add-long/2addr v4, v12

    iput-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->d:J

    .line 804
    iget-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    iget-wide v12, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    add-long/2addr v4, v12

    iput-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->c:J

    .line 805
    iget-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    iget-wide v12, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    add-long/2addr v4, v12

    iput-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->b:J

    .line 806
    iget-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    iget-wide v12, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    add-long/2addr v4, v12

    iput-wide v4, v10, Lcom/qihoo/security/clearengine/sdk/b;->a:J

    goto/16 :goto_2

    .line 702
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x21 -> :sswitch_0
        0x22 -> :sswitch_1
        0x23 -> :sswitch_1
        0x24 -> :sswitch_0
        0x143 -> :sswitch_0
    .end sparse-switch
.end method

.method private final a(Lcom/qihoo/security/clearengine/TrashType;)Lcom/qihoo/security/clearengine/surface/b;
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/surface/b;

    .line 289
    if-nez v0, :cond_0

    .line 290
    new-instance v0, Lcom/qihoo/security/clearengine/surface/b;

    invoke-direct {v0, p1}, Lcom/qihoo/security/clearengine/surface/b;-><init>(Lcom/qihoo/security/clearengine/TrashType;)V

    .line 291
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    :cond_0
    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1551
    .line 1553
    new-instance v0, Lcom/qihoo/security/clearengine/b/a$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/clearengine/b/a$5;-><init>(Landroid/content/Context;)V

    invoke-static {p1, v0}, Lcom/qihoo/a/a/a/c;->a(Ljava/lang/String;Lcom/qihoo360/mobilesafe/opti/i/IFunctionManager;)V

    .line 1577
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/clearengine/b/a$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1416
    .line 1420
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1421
    const-string/jumbo p3, "en"

    .line 1424
    :cond_0
    const-string/jumbo v0, "cloud_data_language"

    invoke-static {p0, v0, p3}, Lcom/qihoo/security/clearengine/d/c;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1426
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/clearengine/b/a$4;

    invoke-direct {v1, p0, p2, p1, p4}, Lcom/qihoo/security/clearengine/b/a$4;-><init>(Landroid/content/Context;ILjava/util/List;Lcom/qihoo/security/clearengine/b/a$a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1528
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1529
    return-void
.end method

.method private final a(Landroid/os/IBinder;)V
    .locals 4

    .prologue
    .line 244
    invoke-static {p1}, Lcom/qihoo/security/clearengine/a/a$a;->a(Landroid/os/IBinder;)Lcom/qihoo/security/clearengine/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    .line 245
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_1

    .line 247
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget v1, p0, Lcom/qihoo/security/clearengine/b/a;->g:I

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->h:[I

    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a;->i:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/a/a;->a(I[ILjava/util/List;)V

    .line 248
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->w:Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->a(Lcom/qihoo/security/clearengine/a/c;)V

    .line 249
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->x:Lcom/qihoo/security/clearengine/a/b;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->a(Lcom/qihoo/security/clearengine/a/b;)V

    .line 250
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/surface/a;->a(Z)V

    .line 253
    :cond_0
    new-instance v0, Lcom/qihoo/security/clearengine/b/b;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/b/b;-><init>(Lcom/qihoo/security/clearengine/a/a;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    .line 254
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/b/b;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    :cond_1
    :goto_0
    return-void

    .line 255
    :catch_0
    move-exception v0

    .line 256
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v1, :cond_2

    .line 257
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/qihoo/security/clearengine/surface/a;->a(Z)V

    .line 259
    :cond_2
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/b/a;Landroid/os/IBinder;)V
    .locals 0

    .prologue
    .line 243
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/os/IBinder;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/b/a;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 0

    .prologue
    .line 1145
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/b/a;->f(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/b/a;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 551
    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/b/a;->b(Ljava/util/List;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/clearengine/b/a;Z)V
    .locals 0

    .prologue
    .line 504
    iput-boolean p1, p0, Lcom/qihoo/security/clearengine/b/a;->z:Z

    return-void
.end method

.method private a(Ljava/util/ArrayList;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .prologue
    .line 672
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 673
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 674
    :try_start_0
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/b/a;->e()Ljava/util/List;

    move-result-object v0

    .line 675
    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/util/List;Ljava/util/ArrayList;Z)Lcom/qihoo/security/clearengine/sdk/b;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->j:Lcom/qihoo/security/clearengine/sdk/b;

    .line 673
    monitor-exit v1

    .line 680
    return-void

    .line 673
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic b(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 510
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/clearengine/b/a;Z)V
    .locals 0

    .prologue
    .line 503
    iput-boolean p1, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    return-void
.end method

.method private final b(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 553
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 557
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 601
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_8

    .line 603
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 612
    :cond_1
    :goto_1
    return-void

    .line 557
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 558
    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v4, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 559
    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v4, "subList"

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 571
    if-eqz v3, :cond_3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v4, v5, :cond_5

    .line 572
    :cond_3
    iget-boolean v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-nez v3, :cond_0

    .line 575
    iget-boolean v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-nez v3, :cond_4

    iget v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v4, 0x142

    if-ne v3, v4, :cond_0

    .line 578
    :cond_4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 582
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 583
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 585
    iget-boolean v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-eqz v5, :cond_6

    .line 586
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 589
    :cond_6
    iget-boolean v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-nez v5, :cond_7

    .line 590
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 593
    :cond_7
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 604
    :catch_0
    move-exception v0

    .line 605
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 608
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_1

    .line 609
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/surface/a;->b(I)V

    goto :goto_1
.end method

.method static synthetic c(Lcom/qihoo/security/clearengine/b/a;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/surface/a;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    return-object v0
.end method

.method private e(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 965
    new-instance v1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 966
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 967
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 968
    if-eqz v0, :cond_1

    .line 969
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 975
    :goto_1
    return-object v1

    .line 969
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 970
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 973
    :cond_1
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method private e(I)Z
    .locals 1

    .prologue
    .line 979
    const/16 v0, 0x22

    if-eq v0, p1, :cond_0

    const/16 v0, 0x23

    if-ne v0, p1, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic e(Lcom/qihoo/security/clearengine/b/a;)Z
    .locals 1

    .prologue
    .line 506
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->k()Z

    move-result v0

    return v0
.end method

.method private f(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;
    .locals 1

    .prologue
    .line 1160
    const/4 v0, 0x0

    .line 1161
    sparse-switch p1, :sswitch_data_0

    .line 1194
    :goto_0
    return-object v0

    .line 1163
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1166
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1169
    :sswitch_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1172
    :sswitch_3
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1175
    :sswitch_4
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1178
    :sswitch_5
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1188
    :sswitch_6
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_0

    .line 1161
    :sswitch_data_0
    .sparse-switch
        0x21 -> :sswitch_2
        0x22 -> :sswitch_5
        0x23 -> :sswitch_4
        0x141 -> :sswitch_0
        0x142 -> :sswitch_1
        0x143 -> :sswitch_3
        0x169 -> :sswitch_6
        0x16a -> :sswitch_6
        0x16b -> :sswitch_6
        0x16c -> :sswitch_6
        0x16d -> :sswitch_6
        0x16e -> :sswitch_6
        0x16f -> :sswitch_6
        0x170 -> :sswitch_6
    .end sparse-switch
.end method

.method static synthetic f(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->k:Ljava/lang/Object;

    return-object v0
.end method

.method private f(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 1

    .prologue
    .line 1149
    if-nez p1, :cond_1

    .line 1157
    :cond_0
    :goto_0
    return-void

    .line 1153
    :cond_1
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->f(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    move-result-object v0

    .line 1154
    if-eqz v0, :cond_0

    .line 1155
    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic g(Lcom/qihoo/security/clearengine/b/a;)Z
    .locals 1

    .prologue
    .line 1305
    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->B:Z

    return v0
.end method

.method static synthetic h(Lcom/qihoo/security/clearengine/b/a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 103
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->t:Ljava/lang/Object;

    return-object v0
.end method

.method private final h()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 143
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_1

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/a/a;->a()V

    .line 154
    :cond_0
    :goto_0
    return-void

    .line 149
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/surface/a;->b(I)V

    goto :goto_0
.end method

.method private final i()V
    .locals 1

    .prologue
    .line 265
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    .line 266
    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 640
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->n()V

    return-void
.end method

.method static synthetic j(Lcom/qihoo/security/clearengine/b/a;)Lcom/qihoo/security/clearengine/sdk/b;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->j:Lcom/qihoo/security/clearengine/sdk/b;

    return-object v0
.end method

.method private final j()V
    .locals 2

    .prologue
    .line 271
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->v:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->x:Lcom/qihoo/security/clearengine/a/b;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->b(Lcom/qihoo/security/clearengine/a/b;)V

    .line 274
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->w:Lcom/qihoo/security/clearengine/a/c;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->b(Lcom/qihoo/security/clearengine/a/c;)V

    .line 275
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    if-eqz v0, :cond_1

    .line 278
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 279
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    .line 280
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 285
    :cond_1
    :goto_0
    return-void

    .line 282
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic k(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 1198
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->p()V

    return-void
.end method

.method private final k()Z
    .locals 1

    .prologue
    .line 507
    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->z:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private final l()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 618
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_1

    .line 619
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/a/a;->b()V

    .line 625
    :cond_0
    :goto_0
    return-void

    .line 621
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_0

    .line 622
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/surface/a;->b(I)V

    goto :goto_0
.end method

.method static synthetic l(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 139
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->h()V

    return-void
.end method

.method private final m()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 631
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_1

    .line 632
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0}, Lcom/qihoo/security/clearengine/a/a;->c()V

    .line 638
    :cond_0
    :goto_0
    return-void

    .line 634
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_0

    .line 635
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/surface/a;->b(I)V

    goto :goto_0
.end method

.method static synthetic m(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 614
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->l()V

    return-void
.end method

.method private declared-synchronized n()V
    .locals 2

    .prologue
    .line 642
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 643
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 644
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 645
    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->b(Ljava/util/List;)V

    .line 647
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 648
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 649
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 650
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 651
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 652
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 653
    invoke-static {v0}, Lcom/qihoo/security/clearengine/d/a;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->b:Ljava/util/Map;

    .line 655
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->q()V

    .line 656
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/util/ArrayList;Z)V

    .line 657
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 661
    monitor-exit p0

    return-void

    .line 642
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic n(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 627
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->m()V

    return-void
.end method

.method private final o()V
    .locals 4

    .prologue
    .line 665
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 669
    return-void

    .line 665
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/clearengine/TrashType;

    .line 666
    invoke-virtual {v0}, Lcom/qihoo/security/clearengine/TrashType;->toEnv()I

    move-result v2

    invoke-virtual {p0, v2}, Lcom/qihoo/security/clearengine/b/a;->d(I)Ljava/util/List;

    move-result-object v2

    .line 667
    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a;->s:Ljava/util/Map;

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/d/a;->a(Lcom/qihoo/security/clearengine/TrashType;Ljava/util/List;)Lcom/qihoo/security/clearengine/surface/b;

    move-result-object v2

    invoke-interface {v3, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method static synthetic o(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 264
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->i()V

    return-void
.end method

.method private p()V
    .locals 2

    .prologue
    .line 1199
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x20

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1200
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x142

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1201
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x143

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1202
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x21

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1203
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x22

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1204
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x24

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1205
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    const/16 v1, 0x23

    invoke-direct {v0, v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    .line 1206
    new-instance v0, Lcom/qihoo/security/clearengine/sdk/b;

    invoke-direct {v0}, Lcom/qihoo/security/clearengine/sdk/b;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->j:Lcom/qihoo/security/clearengine/sdk/b;

    .line 1207
    return-void
.end method

.method static synthetic p(Lcom/qihoo/security/clearengine/b/a;)V
    .locals 0

    .prologue
    .line 269
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->j()V

    return-void
.end method

.method private q()V
    .locals 6

    .prologue
    const/16 v5, 0x142

    const/4 v4, 0x0

    .line 1214
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1215
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 1216
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1220
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1221
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1225
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 1226
    if-eqz v0, :cond_0

    iget v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    if-eq v0, v5, :cond_1

    .line 1227
    :cond_0
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;-><init>()V

    .line 1228
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    const-string/jumbo v2, "trash_type_system_cache"

    const-string/jumbo v3, "System caches"

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/clearengine/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    .line 1229
    iput v5, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    .line 1230
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1231
    const-string/jumbo v2, "subList"

    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a;->n:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v3, v3, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1232
    iput-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 1233
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v1, v4, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1260
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1262
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1263
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1265
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1266
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1268
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1269
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1272
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1273
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1276
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    new-instance v1, Lcom/qihoo/security/clearengine/sdk/a;

    invoke-direct {v1}, Lcom/qihoo/security/clearengine/sdk/a;-><init>()V

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v2, v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/clearengine/sdk/a;->a(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 1277
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1279
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 1280
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-object v0, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/util/List;)V

    .line 1285
    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;",
            ">;"
        }
    .end annotation

    .prologue
    .line 125
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_0

    .line 127
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0, p1}, Lcom/qihoo/security/clearengine/a/a;->a(I)Ljava/util/List;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 135
    :goto_0
    return-object v0

    .line 128
    :catch_0
    move-exception v0

    .line 129
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    .line 135
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 180
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    if-nez v0, :cond_0

    .line 181
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "TrashCleanManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    .line 182
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 183
    new-instance v0, Lcom/qihoo/security/clearengine/b/a$b;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/clearengine/b/a$b;-><init>(Lcom/qihoo/security/clearengine/b/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    .line 186
    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/clearengine/service/ClearEngineService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 187
    const-string/jumbo v1, "ACTION_TRASH_CLEAR"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 188
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->v:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 192
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    monitor-enter v1

    .line 193
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->z:Z

    .line 194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    .line 192
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    if-eqz v0, :cond_1

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    invoke-interface {v0, v4}, Lcom/qihoo/security/clearengine/surface/a;->a(Z)V

    .line 200
    :cond_1
    return-void

    .line 192
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(ILcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    .locals 2

    .prologue
    .line 1318
    iget-object v0, p2, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    .line 1320
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/lang/String;Z)V

    .line 1333
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    iget-object v1, p2, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/b;->b(Ljava/lang/String;)V

    .line 1334
    const/4 v0, -0x1

    iput v0, p2, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->flag:I

    .line 1336
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0, p2}, Lcom/qihoo/security/clearengine/a/a;->b(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1343
    :goto_0
    return-void

    .line 1337
    :catch_0
    move-exception v0

    .line 1338
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public a(Lcom/qihoo/security/clearengine/surface/a;)V
    .locals 0

    .prologue
    .line 157
    if-eqz p1, :cond_0

    .line 158
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    .line 160
    :cond_0
    return-void
.end method

.method protected a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V
    .locals 4

    .prologue
    .line 1289
    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 1303
    :cond_0
    :goto_0
    return-void

    .line 1293
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1295
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1300
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1301
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    goto :goto_0

    .line 1295
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 1296
    if-eqz v0, :cond_2

    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 1297
    iget-object v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1
.end method

.method protected a(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 1043
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1064
    :cond_0
    return-void

    .line 1056
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 1057
    if-eqz v0, :cond_0

    .line 1058
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 1059
    if-eqz v0, :cond_2

    .line 1060
    iput-boolean p2, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    goto :goto_0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 163
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a;->i:Ljava/util/ArrayList;

    .line 164
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 530
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    monitor-enter v1

    .line 531
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 532
    monitor-exit v1

    .line 540
    :goto_0
    return-void

    .line 534
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->z:Z

    .line 530
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 538
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 539
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/clearengine/b/a$b;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 530
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a([I)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lcom/qihoo/security/clearengine/b/a;->h:[I

    .line 172
    return-void
.end method

.method public a([Lcom/qihoo/security/clearengine/TrashType;)V
    .locals 5

    .prologue
    .line 1537
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 1538
    array-length v3, p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 1543
    invoke-static {v2}, Lcom/qihoo/security/clearengine/d/a;->a(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 1546
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/clearengine/surface/a;->a(Ljava/util/Map;)V

    .line 1547
    return-void

    .line 1538
    :cond_0
    aget-object v4, p1, v1

    .line 1539
    invoke-virtual {v4}, Lcom/qihoo/security/clearengine/TrashType;->toEnv()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->d(I)Ljava/util/List;

    move-result-object v0

    .line 1540
    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_1
    invoke-interface {v2, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1538
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z
    .locals 1

    .prologue
    .line 115
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/b;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v0

    return v0
.end method

.method public b()V
    .locals 4

    .prologue
    .line 203
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_0

    .line 205
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    iget v1, p0, Lcom/qihoo/security/clearengine/b/a;->g:I

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->h:[I

    iget-object v3, p0, Lcom/qihoo/security/clearengine/b/a;->i:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo/security/clearengine/a/a;->a(I[ILjava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 206
    :catch_0
    move-exception v0

    .line 207
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto :goto_0
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 167
    iput p1, p0, Lcom/qihoo/security/clearengine/b/a;->g:I

    .line 168
    return-void
.end method

.method protected b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 8

    .prologue
    .line 299
    :try_start_0
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-static {v0}, Lcom/qihoo/security/clearengine/TrashType;->getTrashType(I)Lcom/qihoo/security/clearengine/TrashType;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/TrashType;)Lcom/qihoo/security/clearengine/surface/b;

    move-result-object v1

    .line 301
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-class v2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 303
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "subList"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 305
    if-eqz v0, :cond_2

    .line 306
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    .line 326
    :goto_1
    return-void

    .line 306
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    .line 307
    iget-boolean v3, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v3, :cond_1

    .line 308
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/surface/b;->a:J

    iget-wide v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 310
    :cond_1
    iget-wide v4, v1, Lcom/qihoo/security/clearengine/surface/b;->b:J

    iget-wide v6, v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v4, v6

    iput-wide v4, v1, Lcom/qihoo/security/clearengine/surface/b;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 323
    :catch_0
    move-exception v0

    .line 324
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 313
    :cond_2
    :try_start_1
    iget-boolean v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v0, :cond_3

    .line 314
    iget-wide v2, v1, Lcom/qihoo/security/clearengine/surface/b;->a:J

    iget-wide v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 316
    :cond_3
    iget-wide v2, v1, Lcom/qihoo/security/clearengine/surface/b;->b:J

    iget-wide v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/qihoo/security/clearengine/surface/b;->b:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method public c(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;
    .locals 2

    .prologue
    .line 846
    iget-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    if-eqz v0, :cond_0

    .line 847
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    monitor-enter v1

    .line 848
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    .line 847
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 851
    :try_start_1
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->n()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 856
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 857
    sparse-switch p1, :sswitch_data_0

    .line 881
    :goto_1
    if-nez v0, :cond_1

    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-direct {v0, p1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    :cond_1
    return-object v0

    .line 847
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 852
    :catch_0
    move-exception v0

    .line 853
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 859
    :sswitch_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 862
    :sswitch_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 865
    :sswitch_2
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 868
    :sswitch_3
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 871
    :sswitch_4
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 874
    :sswitch_5
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    goto :goto_1

    .line 857
    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x21 -> :sswitch_1
        0x22 -> :sswitch_2
        0x23 -> :sswitch_3
        0x24 -> :sswitch_5
        0x143 -> :sswitch_4
    .end sparse-switch
.end method

.method public c()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 516
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->A:Ljava/lang/Object;

    monitor-enter v1

    .line 517
    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/clearengine/b/a;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 518
    monitor-exit v1

    .line 524
    :goto_0
    return-void

    .line 520
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/clearengine/b/a;->y:Z

    .line 516
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 523
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/clearengine/b/a$b;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 516
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected c(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 6

    .prologue
    .line 330
    :try_start_0
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-static {v0}, Lcom/qihoo/security/clearengine/TrashType;->getTrashType(I)Lcom/qihoo/security/clearengine/TrashType;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/TrashType;)Lcom/qihoo/security/clearengine/surface/b;

    move-result-object v0

    .line 332
    iget-boolean v1, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v1, :cond_0

    .line 333
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    iget-wide v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 335
    :cond_0
    iget-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->b:J

    iget-wide v4, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->b:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 339
    :goto_0
    return-void

    .line 336
    :catch_0
    move-exception v0

    .line 337
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public d(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1309
    invoke-virtual {p0, p1}, Lcom/qihoo/security/clearengine/b/a;->c(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    move-result-object v1

    .line 1310
    if-eqz v1, :cond_0

    .line 1311
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1313
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 543
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->u:Lcom/qihoo/security/clearengine/b/a$b;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/clearengine/b/a$b;->sendEmptyMessage(I)Z

    .line 544
    return-void
.end method

.method public d(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 986
    if-nez p1, :cond_1

    .line 1038
    :cond_0
    :goto_0
    return-void

    .line 991
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    invoke-virtual {v0, p1}, Lcom/qihoo/security/clearengine/b/b;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Z

    move-result v0

    if-eqz v0, :cond_5

    move v0, v1

    :goto_1
    iput-boolean v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    .line 993
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/lang/String;Z)V

    .line 995
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->f(I)Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/clearengine/sdk/c;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;)V

    .line 997
    iget v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->e(I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, Lcom/qihoo/security/clearengine/b/a;->e(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_2
    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/clearengine/b/a;->a(Ljava/util/ArrayList;Z)V

    .line 1003
    invoke-static {p1}, Lcom/qihoo/security/clearengine/sdk/c;->b(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;

    move-result-object v1

    .line 1006
    const-string/jumbo v0, ""

    .line 1007
    iget v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    const/16 v3, 0x141

    if-ne v2, v3, :cond_4

    .line 1008
    iget-object v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-eqz v2, :cond_2

    iget-object v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v3, "app_name"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1009
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    const-string/jumbo v2, "app_name"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1012
    :cond_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 1013
    iget-object v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/clearengine/b/a;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/qihoo/security/clearengine/sdk/c;->a(Ljava/lang/String;Landroid/content/pm/PackageManager;)Ljava/lang/String;

    move-result-object v0

    .line 1016
    :cond_3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 1017
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string/jumbo v0, ""

    :goto_3
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    .line 1022
    :cond_4
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_0

    .line 1023
    iget-boolean v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-eqz v0, :cond_8

    .line 1024
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    iget-object v2, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/clearengine/b/b;->a(Ljava/lang/String;)V

    .line 1025
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->a(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 1031
    :catch_0
    move-exception v0

    .line 1032
    invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V

    goto/16 :goto_0

    .line 991
    :cond_5
    const/4 v0, 0x1

    goto/16 :goto_1

    .line 997
    :cond_6
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 1017
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->desc:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, ")"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 1027
    :cond_8
    :try_start_1
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->a:Lcom/qihoo/security/clearengine/b/b;

    iget-object v2, v1, Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;->value:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/qihoo/security/clearengine/b/b;->b(Ljava/lang/String;)V

    .line 1028
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    invoke-interface {v0, v1}, Lcom/qihoo/security/clearengine/a/a;->b(Lcom/qihoo360/mobilesafe/opti/i/whitelist/UserBWRecord;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_0
.end method

.method public e()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;",
            ">;"
        }
    .end annotation

    .prologue
    const-wide/16 v4, 0x0

    .line 823
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 824
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    .line 825
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->l:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 827
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 828
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->m:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 830
    :cond_1
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 831
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->o:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_3

    .line 834
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->q:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 836
    :cond_3
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_4

    .line 837
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->p:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 839
    :cond_4
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_5

    .line 840
    iget-object v1, p0, Lcom/qihoo/security/clearengine/b/a;->r:Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 842
    :cond_5
    return-object v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 1396
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->e:Lcom/qihoo/security/clearengine/a/a;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g()V
    .locals 1

    .prologue
    .line 1532
    iget-object v0, p0, Lcom/qihoo/security/clearengine/b/a;->f:Lcom/qihoo/security/clearengine/surface/a;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/clearengine/b/a;->a(Lcom/qihoo/security/clearengine/surface/a;)V

    .line 1533
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/b/a;->a()V

    .line 1534
    return-void
.end method
