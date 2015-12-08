.class public final Lcom/roidapp/photogrid/release/c;
.super Landroid/support/v4/app/DialogFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/roidapp/baselib/g/b;
.implements Lcom/roidapp/photogrid/release/a;


# instance fields
.field private A:Z

.field private B:Ljava/lang/String;

.field private C:Ljava/lang/String;

.field private D:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation
.end field

.field private E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;"
        }
    .end annotation
.end field

.field private F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private G:I

.field private H:I

.field private I:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/b;",
            ">;"
        }
    .end annotation
.end field

.field private J:Z

.field private K:Z

.field private L:Ljava/lang/String;

.field private M:I

.field private N:Z

.field private O:Landroid/os/Handler;

.field a:[I

.field private b:I

.field private c:Landroid/widget/ImageButton;

.field private d:Landroid/widget/ImageButton;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/widget/TextView;

.field private g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

.field private h:Landroid/widget/ListView;

.field private i:Landroid/widget/LinearLayout;

.field private j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private k:Lcom/roidapp/photogrid/release/PhotoView;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Lcom/roidapp/photogrid/release/q;

.field private n:Landroid/widget/LinearLayout;

.field private o:Lcom/roidapp/photogrid/release/r;

.field private p:Landroid/widget/ImageView;

.field private q:Landroid/content/Context;

.field private r:Landroid/view/animation/Animation;

.field private s:Landroid/view/animation/Animation;

.field private final t:I

.field private u:I

.field private v:I

.field private w:I

.field private x:Z

.field private y:I

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/16 v2, 0xf

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 68
    invoke-direct {p0}, Landroid/support/v4/app/DialogFragment;-><init>()V

    .line 88
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->b:I

    .line 107
    iput v2, p0, Lcom/roidapp/photogrid/release/c;->t:I

    .line 108
    iput v2, p0, Lcom/roidapp/photogrid/release/c;->u:I

    .line 109
    iput v0, p0, Lcom/roidapp/photogrid/release/c;->v:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->w:I

    .line 111
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->x:Z

    .line 113
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->y:I

    .line 118
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    .line 122
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    .line 125
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    .line 132
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->N:Z

    .line 609
    new-array v0, v1, [I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->a:[I

    .line 869
    new-instance v0, Lcom/roidapp/photogrid/release/n;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/n;-><init>(Lcom/roidapp/photogrid/release/c;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->O:Landroid/os/Handler;

    .line 1297
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/c;I)I
    .locals 0

    .prologue
    .line 68
    iput p1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    return p1
.end method

.method public static a(Landroid/content/res/Resources;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/StickerInfo;",
            ">;"
        }
    .end annotation

    .prologue
    const v12, 0x7f0203fd

    const v11, 0x7f0203fb

    const/4 v10, -0x1

    const v9, -0xbebebf

    const/4 v8, 0x1

    .line 1020
    invoke-static {}, Lcom/roidapp/photogrid/release/a/c;->a()Lcom/roidapp/photogrid/release/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/a/c;->c()Ljava/util/List;

    move-result-object v7

    .line 1021
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 1024
    new-instance v0, Lcom/roidapp/photogrid/release/StickerInfo;

    const-string v1, "freeCrop"

    const v2, 0x7f07011e

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "freeCrop"

    const v4, -0x141415

    const v5, 0x7f0203fc

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/StickerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1025
    if-nez v7, :cond_0

    .line 1026
    new-instance v0, Lcom/roidapp/photogrid/release/StickerInfo;

    const-string v1, "emoji"

    const v2, 0x7f0703bb

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "emoji"

    move v4, v10

    move v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/StickerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1027
    new-instance v0, Lcom/roidapp/photogrid/release/StickerInfo;

    const-string v1, "text"

    const v2, 0x7f070121

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "text"

    move v4, v9

    move v5, v12

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/release/StickerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v0, v6

    .line 1065
    :goto_0
    return-object v0

    .line 1032
    :cond_0
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 10158
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1034
    if-eqz v2, :cond_2

    const-string v2, "emoji"

    iget-object v3, v0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1035
    const v2, 0x7f0703bb

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 1036
    iput v10, v0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 1037
    const-string v2, "emoji"

    iput-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 1038
    iput v11, v0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 1039
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 1040
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1041
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 11158
    :cond_2
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1042
    if-eqz v2, :cond_3

    const-string v2, "text"

    iget-object v3, v0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1043
    const v2, 0x7f070121

    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->c:Ljava/lang/String;

    .line 1044
    iput v9, v0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 1045
    const-string v2, "text"

    iput-object v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 1046
    iput v12, v0, Lcom/roidapp/photogrid/release/StickerInfo;->d:I

    .line 1047
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 1048
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1049
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12158
    :cond_3
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 1052
    if-nez v2, :cond_1

    .line 1055
    invoke-static {v0}, Lcom/roidapp/photogrid/release/a/b;->a(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1056
    iput-boolean v8, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 1060
    :goto_2
    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1058
    :cond_4
    const/4 v2, 0x0

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    goto :goto_2

    :cond_5
    move-object v0, v6

    .line 1065
    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/c;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    return-object p1
.end method

.method private a()V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 717
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 719
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 720
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 764
    :cond_0
    return-void

    .line 723
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 726
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 727
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 728
    if-eqz v2, :cond_0

    .line 730
    array-length v4, v2

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_2

    aget-object v5, v2, v1

    .line 731
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 730
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 733
    :cond_2
    new-instance v1, Lcom/roidapp/photogrid/release/o;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/o;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 735
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->y:I

    if-le v1, v2, :cond_4

    .line 736
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->y:I

    sub-int v2, v1, v2

    move v1, v0

    .line 737
    :goto_1
    if-ge v1, v2, :cond_4

    .line 738
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 739
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 740
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 737
    :cond_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 745
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 746
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 748
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 749
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move v2, v1

    :goto_2
    if-ltz v2, :cond_0

    .line 750
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .line 751
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 752
    new-instance v4, Lcom/roidapp/photogrid/release/b;

    invoke-direct {v4}, Lcom/roidapp/photogrid/release/b;-><init>()V

    .line 753
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v4, Lcom/roidapp/photogrid/release/b;->c:Ljava/lang/String;

    .line 754
    iput v2, v4, Lcom/roidapp/photogrid/release/b;->a:I

    .line 755
    iput-object v0, v4, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 756
    const/4 v1, 0x2

    iput v1, v4, Lcom/roidapp/photogrid/release/b;->k:I

    .line 757
    const/4 v1, 0x1

    iput-boolean v1, v4, Lcom/roidapp/photogrid/release/b;->f:Z

    .line 758
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget v5, v4, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    iput-boolean v1, v4, Lcom/roidapp/photogrid/release/b;->b:Z

    .line 759
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 749
    :cond_5
    add-int/lit8 v1, v2, -0x1

    move v2, v1

    goto :goto_2
.end method

.method private a(Lcom/roidapp/photogrid/release/StickerInfo;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v0, 0x0

    .line 823
    iget-object v2, p1, Lcom/roidapp/photogrid/release/StickerInfo;->k:[Ljava/lang/String;

    .line 824
    if-eqz v2, :cond_0

    array-length v1, v2

    if-gtz v1, :cond_1

    .line 845
    :cond_0
    return-void

    .line 827
    :cond_1
    invoke-static {p1}, Lcom/roidapp/photogrid/release/a/b;->b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;

    move-result-object v3

    .line 829
    array-length v4, v2

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_0

    aget-object v5, v2, v1

    .line 830
    if-eqz v5, :cond_2

    const-string v6, ""

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 831
    new-instance v6, Lcom/roidapp/photogrid/release/b;

    invoke-direct {v6}, Lcom/roidapp/photogrid/release/b;-><init>()V

    .line 832
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    .line 833
    iput-object p1, v6, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 834
    iput v0, v6, Lcom/roidapp/photogrid/release/b;->j:I

    .line 835
    iput-boolean v9, v6, Lcom/roidapp/photogrid/release/b;->h:Z

    .line 836
    const/4 v7, 0x3

    iput v7, v6, Lcom/roidapp/photogrid/release/b;->k:I

    .line 837
    iput-boolean v9, v6, Lcom/roidapp/photogrid/release/b;->g:Z

    .line 838
    iget-object v7, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    iput-boolean v5, v6, Lcom/roidapp/photogrid/release/b;->b:Z

    .line 839
    iget-object v5, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 840
    add-int/lit8 v0, v0, 0x1

    .line 829
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/c;)V
    .locals 2

    .prologue
    .line 68
    .line 14192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->r:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 14193
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/c;Lcom/roidapp/photogrid/release/b;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/c;->e(Lcom/roidapp/photogrid/release/b;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/c;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 355
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 356
    new-instance v1, Lcom/roidapp/photogrid/release/q;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/q;-><init>(Lcom/roidapp/photogrid/release/c;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    .line 357
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->h:Landroid/widget/ListView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 359
    if-eqz p1, :cond_0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->K:Z

    if-eqz v1, :cond_0

    .line 360
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->K:Z

    .line 361
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 362
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->n:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    .line 365
    :cond_0
    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    if-eqz v1, :cond_3

    .line 367
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "deco_last_theme"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 369
    if-eqz v2, :cond_3

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    if-eq v2, v1, :cond_3

    .line 372
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 4126
    iget-object v4, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 373
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 4158
    iget-boolean v3, v0, Lcom/roidapp/photogrid/release/StickerInfo;->f:Z

    .line 374
    if-nez v3, :cond_1

    .line 5150
    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 374
    if-eqz v0, :cond_3

    .line 376
    :cond_1
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->G:I

    .line 377
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    .line 378
    iput-object v2, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    .line 379
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    .line 392
    :goto_1
    return-void

    .line 385
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 386
    goto :goto_0

    .line 389
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->G:I

    .line 390
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->H:I

    .line 391
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/c;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->n:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/c;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 68
    iput-object p1, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    return-object p1
.end method

.method private b()V
    .locals 4

    .prologue
    .line 850
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    iget v3, p0, Lcom/roidapp/photogrid/release/c;->u:I

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/15 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0702e8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 851
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v3, 0x3

    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v1, 0x0

    .line 612
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->x:Z

    if-eqz v0, :cond_1

    .line 9220
    :cond_0
    :goto_0
    return-void

    .line 615
    :cond_1
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->B:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 619
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    .line 620
    const-string v0, "emoji"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 622
    invoke-static {}, Lcom/roidapp/photogrid/common/n;->c()Lcom/roidapp/photogrid/common/n;

    invoke-static {}, Lcom/roidapp/photogrid/common/n;->a()[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->a:[I

    move v0, v1

    .line 635
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 637
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 638
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->b:I

    .line 663
    :goto_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    monitor-enter v2

    .line 664
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 665
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 666
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->H:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->G:I

    .line 667
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/q;->notifyDataSetChanged()V

    .line 668
    iput-object p1, p0, Lcom/roidapp/photogrid/release/c;->B:Ljava/lang/String;

    .line 669
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 670
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/c;->x:Z

    .line 671
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 672
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 673
    iput v4, v0, Landroid/os/Message;->what:I

    .line 674
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 675
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->O:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 624
    :cond_2
    const-string v0, "text"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 626
    invoke-static {}, Lcom/roidapp/photogrid/common/n;->c()Lcom/roidapp/photogrid/common/n;

    invoke-static {}, Lcom/roidapp/photogrid/common/n;->b()[I

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->a:[I

    move v0, v1

    goto :goto_1

    .line 628
    :cond_3
    const-string v0, "freeCrop"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v0, v2

    .line 629
    goto :goto_1

    :cond_4
    move v0, v3

    .line 631
    goto :goto_1

    .line 645
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    const v3, 0x7f020226

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 646
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 647
    iput v2, p0, Lcom/roidapp/photogrid/release/c;->b:I

    goto :goto_2

    .line 650
    :pswitch_1
    iput v3, p0, Lcom/roidapp/photogrid/release/c;->b:I

    .line 651
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/a/b;->a(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 9219
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 9223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/release/a/b;->a(Lcom/roidapp/photogrid/release/StickerInfo;Lcom/roidapp/baselib/g/b;)Lcom/roidapp/baselib/g/a;

    move-result-object v0

    .line 9225
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 9226
    const-string v2, "download_tag"

    invoke-virtual {v1, v0, v2}, Landroid/support/v4/app/FragmentTransaction;->add(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 9227
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto/16 :goto_0

    .line 656
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    const v2, 0x7f02037b

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 657
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_2

    .line 665
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 635
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/baselib/view/FixedDrawerLayout;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v2, 0x0

    const/4 v7, 0x1

    .line 938
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->q:Landroid/content/Context;

    .line 940
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p1, v8}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->q:Landroid/content/Context;

    .line 941
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->q:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "icons.xml"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    .line 942
    invoke-static {}, Lorg/xmlpull/v1/XmlPullParserFactory;->newInstance()Lorg/xmlpull/v1/XmlPullParserFactory;

    move-result-object v1

    .line 943
    invoke-virtual {v1, v7}, Lorg/xmlpull/v1/XmlPullParserFactory;->setNamespaceAware(Z)V

    .line 944
    invoke-virtual {v1}, Lorg/xmlpull/v1/XmlPullParserFactory;->newPullParser()Lorg/xmlpull/v1/XmlPullParser;

    move-result-object v4

    .line 945
    const-string v1, "UTF-8"

    invoke-interface {v4, v0, v1}, Lorg/xmlpull/v1/XmlPullParser;->setInput(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 946
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v1

    .line 947
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v3, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    move v3, v1

    move v1, v2

    .line 949
    :goto_0
    if-eq v3, v7, :cond_1

    .line 950
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    if-ne v3, v8, :cond_0

    .line 951
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    .line 952
    const-string v5, "element"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 953
    invoke-interface {v4, v2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v3

    .line 954
    if-eqz v3, :cond_0

    const-string v5, ""

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 955
    new-instance v5, Lcom/roidapp/photogrid/release/b;

    invoke-direct {v5}, Lcom/roidapp/photogrid/release/b;-><init>()V

    .line 956
    iput-object p1, v5, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    .line 957
    iput-object v3, v5, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    .line 958
    iput-object v0, v5, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 959
    iput v1, v5, Lcom/roidapp/photogrid/release/b;->j:I

    .line 960
    iput v7, v5, Lcom/roidapp/photogrid/release/b;->k:I

    .line 961
    iput-boolean v7, v5, Lcom/roidapp/photogrid/release/b;->g:Z

    .line 962
    iget-object v6, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    iput-boolean v3, v5, Lcom/roidapp/photogrid/release/b;->b:Z

    .line 963
    iget-object v3, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 964
    add-int/lit8 v1, v1, 0x1

    .line 968
    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3

    goto :goto_0

    .line 971
    :cond_1
    return-void
.end method

.method private c()Z
    .locals 4

    .prologue
    .line 1141
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_0

    .line 1142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 1143
    if-eqz v0, :cond_1

    iget-object v3, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    .line 13126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 1143
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1145
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->M:I

    .line 1149
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 1141
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/c;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    return-object v0
.end method

.method private d()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1268
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->N:Z

    if-eqz v0, :cond_1

    .line 1283
    :cond_0
    :goto_0
    return-void

    .line 1271
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/c;->N:Z

    .line 1272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/r;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1273
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/r;->b()V

    .line 1275
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h()Z

    move-result v0

    if-nez v0, :cond_3

    .line 1276
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->dismiss()V

    .line 1278
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1280
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v2, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    goto :goto_0
.end method

.method private e(Lcom/roidapp/photogrid/release/b;)V
    .locals 3

    .prologue
    .line 589
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->f:Z

    if-eqz v0, :cond_0

    .line 590
    new-instance v0, Ljava/io/File;

    iget-object v1, p1, Lcom/roidapp/photogrid/release/b;->c:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 591
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 593
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/qx;->b(Ljava/lang/String;)V

    .line 594
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/PhotoView;->a(Ljava/lang/String;)V

    .line 595
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 598
    :cond_0
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/b;)V

    .line 599
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 600
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/c;->a(I)V

    .line 601
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 602
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->invalidate()V

    .line 603
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    if-eqz v0, :cond_1

    .line 604
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/r;->b(Z)V

    .line 607
    :cond_1
    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/c;)V
    .locals 2

    .prologue
    .line 68
    .line 14199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->s:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 14200
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 68
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/c;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/photogrid/release/q;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/c;)Ljava/util/List;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->d()V

    return-void
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/c;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 68
    .line 14566
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 14567
    invoke-static {v0}, Lcom/roidapp/photogrid/release/a/b;->c(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    .line 14568
    const-string v1, ""

    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->B:Ljava/lang/String;

    .line 14569
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    .line 14570
    iget v1, p0, Lcom/roidapp/photogrid/release/c;->M:I

    if-lez v1, :cond_1

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 14571
    iget v1, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iput v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    .line 14572
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v3, p0, Lcom/roidapp/photogrid/release/c;->M:I

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 15126
    iget-object v1, v1, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 14572
    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    .line 14577
    :goto_0
    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 14578
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    .line 17114
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 17115
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17117
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/b;

    .line 17118
    iget-object v6, v1, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-virtual {v0, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 17119
    const/4 v2, 0x1

    .line 17120
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17121
    iget-object v1, v1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move v1, v2

    move v2, v1

    .line 17123
    goto :goto_1

    .line 14574
    :cond_1
    iput v2, p0, Lcom/roidapp/photogrid/release/c;->H:I

    .line 14575
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 16126
    iget-object v1, v1, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 14575
    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    goto :goto_0

    .line 17124
    :cond_2
    if-eqz v2, :cond_3

    .line 17125
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 17126
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 17129
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    .line 18126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 17129
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/PhotoView;->c(Ljava/lang/String;)Z

    .line 17130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->a()V

    .line 17131
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/c;->a(I)V

    .line 17132
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 68
    return-void
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/c;)V
    .locals 9

    .prologue
    const/4 v1, 0x0

    .line 18771
    .line 18772
    iget-object v3, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    monitor-enter v3

    .line 18773
    :try_start_0
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->b:I

    packed-switch v0, :pswitch_data_0

    .line 18805
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 19118
    iget v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->a:I

    .line 18805
    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setBackgroundColor(I)V

    .line 18806
    const-string v1, "Click"

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 19126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 18806
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 18807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/r;->isAdded()Z

    move-result v0

    if-nez v0, :cond_4

    .line 18808
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/release/r;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    .line 18810
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->v:I

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->w:I

    invoke-virtual {v0, v1, v2, p0}, Lcom/roidapp/photogrid/release/r;->a(IILcom/roidapp/photogrid/release/a;)V

    .line 18811
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/c;->q:Landroid/content/Context;

    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/roidapp/photogrid/release/r;->a(ILjava/util/ArrayList;Landroid/content/Context;Z)V

    .line 18812
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    .line 19181
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 18818
    :cond_2
    :goto_1
    monitor-exit v3

    return-void

    .line 18775
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 18776
    iget-object v4, p0, Lcom/roidapp/photogrid/release/c;->a:[I

    array-length v5, v4

    move v2, v1

    :goto_2
    if-ge v1, v5, :cond_0

    aget v6, v4, v1

    .line 18777
    new-instance v7, Lcom/roidapp/photogrid/release/b;

    invoke-direct {v7}, Lcom/roidapp/photogrid/release/b;-><init>()V

    .line 18778
    iput v6, v7, Lcom/roidapp/photogrid/release/b;->a:I

    .line 18779
    iput v2, v7, Lcom/roidapp/photogrid/release/b;->j:I

    .line 18780
    const/4 v6, 0x0

    iput v6, v7, Lcom/roidapp/photogrid/release/b;->k:I

    .line 18781
    iput-object v0, v7, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 18782
    iget-object v6, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget v8, v7, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    iput-boolean v6, v7, Lcom/roidapp/photogrid/release/b;->b:Z

    .line 18783
    iget-object v6, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18784
    add-int/lit8 v2, v2, 0x1

    .line 18776
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 18788
    :pswitch_1
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 18789
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->z:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18914
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "com.roidapp.photogrid.plugin.stickers"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/c;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 18917
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 18977
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18981
    new-instance v0, Lcom/roidapp/photogrid/release/ab;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/ab;-><init>()V

    .line 18982
    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ab;->a(Ljava/lang/String;)V

    .line 18983
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ab;->a(Z)V

    .line 18984
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 18985
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "AddDecoViewTipDialogFragment"

    invoke-static {v1, v0, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto/16 :goto_0

    .line 18818
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 18921
    :catch_1
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 18923
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    goto/16 :goto_0

    .line 18793
    :pswitch_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->a()V

    goto/16 :goto_0

    .line 18796
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->G:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 18797
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/c;->a(Lcom/roidapp/photogrid/release/StickerInfo;)V

    goto/16 :goto_0

    .line 19184
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->isAdded()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 19185
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getChildFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    const v2, 0x7f0d002e

    invoke-virtual {v1, v2, v0}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto/16 :goto_1

    .line 18814
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->b:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->I:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/c;->q:Landroid/content/Context;

    iget-boolean v5, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/roidapp/photogrid/release/r;->a(ILjava/util/ArrayList;Landroid/content/Context;Z)V

    .line 18815
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/r;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_1

    .line 18773
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/c;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->l:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/c;)Z
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->x:Z

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/c;)I
    .locals 1

    .prologue
    .line 68
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->G:I

    return v0
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    .prologue
    .line 145
    rsub-int/lit8 v0, p1, 0xf

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->u:I

    .line 147
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/release/b;)V
    .locals 2

    .prologue
    .line 1408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1409
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->h:Z

    if-eqz v0, :cond_1

    .line 1410
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1414
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 1415
    return-void

    .line 1412
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget v1, p1, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    const v2, 0x7f070037

    .line 1233
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->G:I

    if-le v0, v1, :cond_0

    .line 1234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 1236
    invoke-static {v0}, Lcom/roidapp/photogrid/release/a/b;->b(Lcom/roidapp/photogrid/release/StickerInfo;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/release/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1237
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/a/b;->a(Lcom/roidapp/photogrid/release/StickerInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1238
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    .line 1252
    :cond_0
    :goto_0
    return-void

    .line 1242
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    .line 1244
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    .line 1245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/q;->notifyDataSetChanged()V

    .line 1246
    const-string v1, "DownloadSuccess"

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    iget v2, p0, Lcom/roidapp/photogrid/release/c;->H:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 14126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 1246
    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 1248
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;I)V

    goto :goto_0
.end method

.method public final b(Lcom/roidapp/photogrid/release/b;)V
    .locals 4

    .prologue
    .line 1419
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->g:Z

    if-nez v0, :cond_0

    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->h:Z

    if-eqz v0, :cond_3

    .line 1420
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 1421
    iget-object v2, p1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    iget-object v3, v0, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1422
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1423
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget-object v1, p1, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1436
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 1437
    return-void

    .line 1428
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 1429
    iget v2, v0, Lcom/roidapp/photogrid/release/b;->a:I

    iget v3, p1, Lcom/roidapp/photogrid/release/b;->a:I

    if-ne v2, v3, :cond_4

    .line 1430
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 1431
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    iget v1, p1, Lcom/roidapp/photogrid/release/b;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public final c(Lcom/roidapp/photogrid/release/b;)V
    .locals 5

    .prologue
    .line 1441
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 1482
    :cond_0
    :goto_0
    return-void

    .line 1444
    :cond_1
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 1445
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->j()Ljava/util/List;

    move-result-object v0

    .line 1447
    const/4 v1, 0x0

    .line 1449
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ao;

    .line 1450
    check-cast v0, Lcom/roidapp/photogrid/release/qz;

    .line 1451
    iget-boolean v4, p1, Lcom/roidapp/photogrid/release/b;->f:Z

    if-eqz v4, :cond_2

    .line 1452
    iget-object v4, p1, Lcom/roidapp/photogrid/release/b;->c:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1454
    const/4 v0, 0x1

    .line 1459
    :goto_1
    if-eqz v0, :cond_3

    .line 1460
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070179

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 1461
    const v0, 0x1040013

    new-instance v1, Lcom/roidapp/photogrid/release/f;

    invoke-direct {v1, p0, p1}, Lcom/roidapp/photogrid/release/f;-><init>(Lcom/roidapp/photogrid/release/c;Lcom/roidapp/photogrid/release/b;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x1040009

    new-instance v3, Lcom/roidapp/photogrid/release/e;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/e;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1477
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 1479
    :cond_3
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/c;->e(Lcom/roidapp/photogrid/release/b;)V

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method public final d(Lcom/roidapp/photogrid/release/b;)Z
    .locals 2

    .prologue
    .line 1487
    iget-boolean v0, p1, Lcom/roidapp/photogrid/release/b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/c;->u:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 136
    move-object v0, p1

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->E:Z

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->K:Z

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->E:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->E:Z

    .line 139
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    .line 1855
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1856
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->d()V

    .line 141
    :goto_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    .line 142
    return-void

    .line 1859
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 1860
    iget v1, v0, Landroid/util/DisplayMetrics;->density:F

    .line 1861
    iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v2, v2

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v3

    const/high16 v3, 0x44340000    # 720.0f

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    .line 1862
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x4

    int-to-float v0, v0

    const/high16 v2, 0x42200000    # 40.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->v:I

    .line 1866
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->v:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->w:I

    goto :goto_0

    .line 1864
    :cond_3
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x4

    int-to-float v0, v0

    const/high16 v2, 0x41a00000    # 20.0f

    mul-float/2addr v1, v2

    sub-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->v:I

    goto :goto_1
.end method

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1260
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1261
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 1262
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ZZ)Z

    .line 1264
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/DialogFragment;->onCancel(Landroid/content/DialogInterface;)V

    .line 1265
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const/4 v0, 0x1

    .line 446
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 541
    :cond_0
    :goto_0
    :pswitch_0
    return-void

    .line 448
    :pswitch_1
    const/4 v2, 0x0

    .line 449
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ao()Ljava/util/List;

    move-result-object v0

    .line 450
    if-nez v0, :cond_8

    .line 451
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v1, v0

    .line 453
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 455
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v5

    :goto_2
    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/b;

    .line 456
    new-instance v3, Lcom/roidapp/photogrid/release/qz;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v3, v6}, Lcom/roidapp/photogrid/release/qz;-><init>(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_2

    .line 457
    :try_start_2
    iget v2, v0, Lcom/roidapp/photogrid/release/b;->a:I

    iput v2, v3, Lcom/roidapp/photogrid/release/qz;->L:I

    .line 458
    iget v2, v0, Lcom/roidapp/photogrid/release/b;->j:I

    iput v2, v3, Lcom/roidapp/photogrid/release/qz;->U:I

    .line 459
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->e:Ljava/lang/String;

    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->Q:Ljava/lang/String;

    .line 460
    iget v2, v0, Lcom/roidapp/photogrid/release/b;->k:I

    iput v2, v3, Lcom/roidapp/photogrid/release/qz;->V:I

    .line 461
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    if-eqz v2, :cond_1

    .line 462
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->R:Ljava/lang/String;

    .line 463
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 464
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->d:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    :cond_1
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/b;->f:Z

    if-eqz v2, :cond_2

    .line 470
    const/4 v2, 0x1

    iput-boolean v2, v3, Lcom/roidapp/photogrid/release/qz;->J:Z

    .line 471
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->c:Ljava/lang/String;

    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->K:Ljava/lang/String;

    .line 473
    :cond_2
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->S:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 474
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 6126
    iget-object v2, v2, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 474
    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    .line 475
    iget-boolean v2, v0, Lcom/roidapp/photogrid/release/b;->h:Z

    if-eqz v2, :cond_3

    .line 476
    iget-object v2, v0, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    iput-object v2, v3, Lcom/roidapp/photogrid/release/qz;->S:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 477
    iget-object v0, v0, Lcom/roidapp/photogrid/release/b;->i:Lcom/roidapp/photogrid/release/StickerInfo;

    .line 7126
    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->b:Ljava/lang/String;

    .line 477
    iput-object v0, v3, Lcom/roidapp/photogrid/release/qz;->T:Ljava/lang/String;

    .line 479
    :cond_3
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    move-object v2, v3

    .line 482
    goto :goto_2

    :cond_4
    move-object v0, v2

    .line 498
    :cond_5
    :goto_3
    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v2, :cond_6

    if-eqz v0, :cond_6

    .line 499
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/PhotoView;->a(Ljava/util/ArrayList;)V

    .line 500
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->l(Ljava/util/List;)V

    .line 505
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->d()V

    goto/16 :goto_0

    .line 484
    :catch_0
    move-exception v0

    move-object v7, v0

    move-object v0, v2

    move-object v2, v7

    :goto_4
    invoke-virtual {v2}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 485
    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_5

    .line 486
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 487
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f0702f4

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 488
    const v3, 0x1040013

    new-instance v5, Lcom/roidapp/photogrid/release/k;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/k;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v2, v3, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 494
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog;->show()V

    goto :goto_3

    .line 508
    :pswitch_2
    iget v1, p0, Lcom/roidapp/photogrid/release/c;->b:I

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_0

    .line 7993
    :pswitch_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "package:com.roidapp.photogrid.plugin.stickers"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 7994
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.DELETE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 7995
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 7996
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/c;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_0

    .line 513
    :pswitch_4
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    if-nez v1, :cond_7

    :goto_5
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    .line 514
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->o:Lcom/roidapp/photogrid/release/r;

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/c;->A:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/r;->a(Z)V

    goto/16 :goto_0

    .line 513
    :cond_7
    const/4 v0, 0x0

    goto :goto_5

    .line 8544
    :pswitch_5
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f0703bf

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07038a

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070049

    new-instance v2, Lcom/roidapp/photogrid/release/m;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/m;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070264

    new-instance v2, Lcom/roidapp/photogrid/release/l;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/l;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 526
    :pswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->F:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 527
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 528
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->d()V

    goto/16 :goto_0

    .line 484
    :catch_1
    move-exception v0

    move-object v2, v0

    move-object v0, v3

    goto/16 :goto_4

    :catch_2
    move-exception v0

    move-object v7, v0

    move-object v0, v2

    move-object v2, v7

    goto/16 :goto_4

    :cond_8
    move-object v1, v0

    goto/16 :goto_1

    .line 446
    nop

    :pswitch_data_0
    .packed-switch 0x7f0d0029
        :pswitch_2
        :pswitch_6
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 508
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    .line 153
    const v0, 0x7f030002

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v9

    .line 154
    if-nez v9, :cond_0

    .line 155
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->d()V

    .line 159
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->J:Z

    .line 160
    return-object v9

    .line 2171
    :cond_0
    const v0, 0x7f0d002c

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->c:Landroid/widget/ImageButton;

    .line 2172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->c:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2173
    const v0, 0x7f0d0029

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    .line 2174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2175
    const v0, 0x7f0d002a

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->e:Landroid/widget/ImageView;

    .line 2176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->e:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2177
    const v0, 0x7f0d002b

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->f:Landroid/widget/TextView;

    .line 2180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 2182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->f:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    iget v3, p0, Lcom/roidapp/photogrid/release/c;->u:I

    sub-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/15 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0702e8

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2185
    :cond_1
    const v0, 0x7f0d0032

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->l:Landroid/widget/RelativeLayout;

    .line 2188
    const v0, 0x7f0d002d

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    .line 2189
    const v0, 0x7f0d0031

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->h:Landroid/widget/ListView;

    .line 2190
    const v0, 0x7f0d002f

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->n:Landroid/widget/LinearLayout;

    .line 2191
    const v0, 0x7f0d0030

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->i:Landroid/widget/LinearLayout;

    .line 2192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->i:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2193
    const v0, 0x7f0d0033

    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    .line 2194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    new-instance v1, Lcom/roidapp/photogrid/release/d;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/d;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->p:Landroid/widget/ImageView;

    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setFocusableInTouchMode(Z)V

    .line 2214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->g:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/g;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/g;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Lcom/roidapp/baselib/view/j;)V

    .line 2238
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->h:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/h;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/h;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 2254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->h:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/i;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/i;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2265
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/j;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/j;-><init>(Lcom/roidapp/photogrid/release/c;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 2284
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/high16 v4, -0x40800000    # -1.0f

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->r:Landroid/view/animation/Animation;

    .line 2288
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->r:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 2290
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x1

    const/high16 v2, -0x40800000    # -1.0f

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->s:Landroid/view/animation/Animation;

    .line 2294
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->s:Landroid/view/animation/Animation;

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    goto/16 :goto_0
.end method

.method public final onDestroy()V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "deco_last_theme"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/c;->B:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 167
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onDestroy()V

    .line 168
    return-void
.end method

.method public final onResume()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 299
    invoke-super {p0}, Landroid/support/v4/app/DialogFragment;->onResume()V

    .line 301
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-nez v0, :cond_0

    .line 302
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 305
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-nez v0, :cond_1

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->O()Lcom/roidapp/photogrid/release/PhotoView;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    .line 311
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_c

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_6

    .line 3000
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->a(Landroid/content/res/Resources;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    .line 3069
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3070
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 3071
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 3072
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    .line 3073
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 3074
    iget-boolean v6, v0, Lcom/roidapp/photogrid/release/StickerInfo;->e:Z

    if-eqz v6, :cond_3

    .line 3075
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3077
    :cond_3
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 3081
    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3082
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 3083
    iput-object v1, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    .line 3003
    iput v2, p0, Lcom/roidapp/photogrid/release/c;->M:I

    .line 3004
    const-string v0, "freeCrop"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    .line 3008
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->D:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v2

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/StickerInfo;

    .line 3010
    const-string v4, "emoji"

    iget-object v0, v0, Lcom/roidapp/photogrid/release/StickerInfo;->i:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 3011
    iput v1, p0, Lcom/roidapp/photogrid/release/c;->M:I

    .line 3012
    const-string v0, "emoji"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    .line 3015
    :cond_5
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 3016
    goto :goto_1

    .line 317
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->c()Z

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->k:Lcom/roidapp/photogrid/release/PhotoView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoView;->k()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/c;->a(I)V

    .line 319
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/c;->b()V

    .line 320
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->b:I

    if-ne v0, v7, :cond_8

    .line 321
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "com.roidapp.photogrid.plugin.stickers"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3898
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_7
    move v0, v2

    .line 321
    :goto_2
    if-nez v0, :cond_8

    .line 322
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->G:I

    .line 323
    iget v0, p0, Lcom/roidapp/photogrid/release/c;->M:I

    iput v0, p0, Lcom/roidapp/photogrid/release/c;->H:I

    .line 324
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->L:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    .line 325
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->C:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/c;->b(Ljava/lang/String;)V

    .line 328
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    if-eqz v0, :cond_a

    .line 329
    iget-object v0, p0, Lcom/roidapp/photogrid/release/c;->m:Lcom/roidapp/photogrid/release/q;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/q;->notifyDataSetChanged()V

    .line 350
    :goto_3
    return-void

    .line 3901
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/c;->j:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    goto :goto_2

    .line 331
    :cond_a
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/c;->J:Z

    if-eqz v0, :cond_b

    .line 332
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/c;->a(Z)V

    .line 333
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/c;->J:Z

    goto :goto_3

    .line 335
    :cond_b
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/c;->a(Z)V

    goto :goto_3

    .line 347
    :cond_c
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/c;->dismiss()V

    goto :goto_3
.end method
