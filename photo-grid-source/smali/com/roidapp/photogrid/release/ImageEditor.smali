.class public Lcom/roidapp/photogrid/release/ImageEditor;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Landroid/widget/ViewSwitcher$ViewFactory;


# static fields
.field private static A:I

.field private static B:I

.field private static C:I

.field private static D:I

.field private static E:I

.field private static F:I

.field private static G:I

.field private static H:I

.field private static I:I

.field public static a:I

.field private static i:I

.field private static j:I

.field private static k:I

.field private static l:I

.field private static m:I

.field private static n:I

.field private static o:I

.field private static p:I

.field private static q:I

.field private static r:I

.field private static s:I

.field private static y:I

.field private static z:I


# instance fields
.field private J:Z

.field private K:Landroid/widget/RelativeLayout;

.field private L:[I

.field private M:Landroid/view/View;

.field private N:Landroid/view/GestureDetector;

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private S:I

.field private T:Landroid/view/View;

.field private U:Lcom/roidapp/photogrid/release/aq;

.field private V:Z

.field private W:Ljava/lang/String;

.field private X:Z

.field private Y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private Z:I

.field private aa:Lcom/roidapp/photogrid/release/an;

.field private ab:Landroid/view/ViewGroup;

.field private ac:Landroid/widget/RelativeLayout;

.field private ad:Landroid/widget/FrameLayout;

.field private ae:Landroid/widget/RelativeLayout;

.field private af:I

.field private ag:Z

.field private ah:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private ai:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/release/ic;",
            ">;"
        }
    .end annotation
.end field

.field private aj:F

.field private ak:I

.field private al:I

.field private am:Z

.field private an:Lcom/roidapp/photogrid/common/al;

.field b:Ljava/lang/String;

.field c:I

.field d:[Ljava/lang/String;

.field e:[Lcom/roidapp/photogrid/release/ig;

.field f:I

.field public g:Ljava/lang/String;

.field public h:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x1

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->i:I

    .line 83
    const/4 v0, 0x2

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    .line 84
    const/4 v0, 0x3

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->k:I

    .line 85
    const/4 v0, 0x4

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->l:I

    .line 86
    const/4 v0, 0x5

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->m:I

    .line 87
    const/4 v0, 0x6

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    .line 88
    const/4 v0, 0x7

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->o:I

    .line 89
    const/16 v0, 0x8

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->a:I

    .line 90
    const/16 v0, 0x9

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->p:I

    .line 91
    const/16 v0, 0xa

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->q:I

    .line 92
    const/16 v0, 0xb

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->r:I

    .line 95
    const/16 v0, 0x57

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->s:I

    .line 96
    const/16 v0, 0x58

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->y:I

    .line 97
    const/16 v0, 0x59

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->z:I

    .line 98
    const/16 v0, 0x5e

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->A:I

    .line 99
    const/16 v0, 0x5f

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->B:I

    .line 100
    const/16 v0, 0x60

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->C:I

    .line 101
    const/16 v0, 0x61

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->D:I

    .line 102
    const/16 v0, 0x62

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->E:I

    .line 103
    const/16 v0, 0x5a

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->F:I

    .line 104
    const/16 v0, 0x5b

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->G:I

    .line 105
    const/16 v0, 0x5c

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->H:I

    .line 106
    const/16 v0, 0x5d

    sput v0, Lcom/roidapp/photogrid/release/ImageEditor;->I:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 80
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 114
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 119
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->O:I

    .line 120
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->P:I

    .line 121
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Q:I

    .line 122
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->R:I

    .line 123
    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->S:I

    .line 127
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->V:Z

    .line 128
    const-string v0, "exchange"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    .line 129
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->X:Z

    .line 141
    const/16 v0, 0xa0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 143
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ag:Z

    .line 145
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    .line 146
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    .line 150
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->aj:F

    .line 155
    new-instance v0, Lcom/roidapp/photogrid/release/ik;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ik;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    return-void
.end method

.method static synthetic A(Lcom/roidapp/photogrid/release/ImageEditor;)Z
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->V:Z

    return v0
.end method

.method static synthetic B(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 3

    .prologue
    .line 80
    .line 16547
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    .line 16550
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 16551
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->d:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Ljava/lang/String;)V

    .line 16552
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->c:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 16553
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 16554
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->f:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 16555
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->O:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->h(I)V

    .line 16556
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16557
    const-string v1, "firstCreate"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 16558
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 16559
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 16561
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->startActivity(Landroid/content/Intent;)V

    .line 16562
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->finish()V

    .line 80
    :cond_1
    return-void
.end method

.method static synthetic C(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 2

    .prologue
    .line 16900
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/it;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/it;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 80
    return-void
.end method

.method static synthetic D(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 12

    .prologue
    const/16 v11, 0x12

    const/4 v10, 0x0

    .line 17686
    const/4 v1, 0x0

    .line 17688
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 17689
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->I()Ljava/lang/String;

    move-result-object v5

    .line 17690
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 17691
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17692
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17693
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-ne v0, v2, :cond_5

    .line 17694
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v6}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    .line 17696
    :try_start_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    .line 17711
    :cond_0
    :try_start_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_7

    .line 17712
    const-string v2, ".png"

    .line 17713
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    .line 17719
    :goto_0
    new-instance v7, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "PhotoGrid_"

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 17721
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 17723
    :try_start_3
    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3

    .line 17732
    :cond_1
    :try_start_4
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_a

    .line 17733
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3

    if-le v0, v11, :cond_9

    .line 17735
    :try_start_5
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v7}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 17736
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v0

    .line 17737
    if-nez v0, :cond_8

    .line 17738
    new-instance v0, Ljava/io/IOException;

    const-string v2, "4.4 IOException"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_3

    .line 17741
    :catch_0
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 17742
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    .line 17797
    :cond_3
    :goto_1
    return-void

    .line 17698
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 17699
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 17767
    :catch_2
    move-exception v0

    .line 17768
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_4

    .line 17769
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 17772
    :cond_4
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 17773
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 17774
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 17775
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 17776
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 17777
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 17778
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 17779
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 17780
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 17703
    :cond_5
    :try_start_7
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_1

    .line 17785
    :catch_3
    move-exception v0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 17786
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 17789
    :cond_6
    const/16 v0, 0xa9

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 17790
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 17791
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 17792
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 17793
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 17794
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 17795
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 17796
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_1

    .line 17715
    :cond_7
    :try_start_8
    const-string v2, ".jpg"

    .line 17716
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    goto/16 :goto_0

    .line 17725
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 17726
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v11, :cond_1

    .line 17727
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    move-object v2, v0

    .line 17752
    :goto_2
    const v0, 0x7f0d03a9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 17753
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v5

    sget-object v6, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 17754
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 17755
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 17756
    const/16 v0, 0x64

    invoke-virtual {v1, v3, v0, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 17757
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 17758
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 17761
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->d(Ljava/lang/String;)V

    .line 17763
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 17764
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_1

    .line 17746
    :cond_9
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 17750
    :cond_a
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_3

    move-object v2, v0

    goto :goto_2

    .line 17782
    :cond_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_1
.end method

.method static synthetic E(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 12

    .prologue
    const/16 v11, 0x12

    const/4 v10, 0x0

    .line 18574
    const/4 v1, 0x0

    .line 18576
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 18577
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->I()Ljava/lang/String;

    move-result-object v5

    .line 18578
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18579
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18580
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18581
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-ne v0, v2, :cond_5

    .line 18582
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v6}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    .line 18584
    :try_start_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    .line 18598
    :cond_0
    :try_start_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_7

    .line 18599
    const-string v2, ".png"

    .line 18600
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    .line 18606
    :goto_0
    new-instance v7, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "PhotoGrid_"

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18607
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 18609
    :try_start_3
    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3

    .line 18618
    :cond_1
    :try_start_4
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_a

    .line 18619
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3

    if-le v0, v11, :cond_9

    .line 18621
    :try_start_5
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v7}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 18622
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v0

    .line 18623
    if-nez v0, :cond_8

    .line 18624
    new-instance v0, Ljava/io/IOException;

    const-string v2, "4.4 IOException"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_3

    .line 18627
    :catch_0
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18628
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    .line 18682
    :cond_3
    :goto_1
    return-void

    .line 18586
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18587
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 18652
    :catch_2
    move-exception v0

    .line 18653
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_4

    .line 18654
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 18657
    :cond_4
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 18658
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 18659
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 18660
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18661
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18662
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 18663
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18664
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 18665
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 18591
    :cond_5
    :try_start_7
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_1

    .line 18670
    :catch_3
    move-exception v0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 18671
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 18674
    :cond_6
    const/16 v0, 0xa8

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 18675
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 18676
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 18677
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 18678
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 18679
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18680
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18681
    invoke-static {}, Ljava/lang/System;->gc()V

    goto/16 :goto_1

    .line 18602
    :cond_7
    :try_start_8
    const-string v2, ".jpg"

    .line 18603
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    goto/16 :goto_0

    .line 18611
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18612
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v11, :cond_1

    .line 18613
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_8
    move-object v2, v0

    .line 18638
    :goto_2
    const v0, 0x7f0d03a8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 18639
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getMeasuredHeight()I

    move-result v5

    sget-object v6, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 18640
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 18641
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->draw(Landroid/graphics/Canvas;)V

    .line 18642
    const/16 v0, 0x64

    invoke-virtual {v1, v3, v0, v2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 18643
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    .line 18644
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    .line 18647
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->d(Ljava/lang/String;)V

    .line 18648
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_3

    .line 18649
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto/16 :goto_1

    .line 18632
    :cond_9
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 18636
    :cond_a
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_3

    move-object v2, v0

    goto :goto_2

    .line 18667
    :cond_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_1
.end method

.method static synthetic F(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 12

    .prologue
    const/4 v1, 0x0

    const/16 v11, 0x12

    const/4 v10, 0x0

    .line 18801
    .line 18803
    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 18804
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->I()Ljava/lang/String;

    move-result-object v5

    .line 18805
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18806
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18807
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_0

    .line 18808
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x13

    if-ne v0, v2, :cond_4

    .line 18809
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v6}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    .line 18811
    :try_start_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->a()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    .line 18825
    :cond_0
    :try_start_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_6

    .line 18826
    const-string v2, ".png"

    .line 18827
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    .line 18832
    :goto_0
    new-instance v7, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v8, "PhotoGrid_"

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v8

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18833
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_3

    .line 18835
    :try_start_3
    invoke-virtual {v7}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_3

    .line 18844
    :cond_1
    :try_start_4
    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_8

    .line 18845
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3

    if-le v0, v11, :cond_7

    .line 18847
    :try_start_5
    new-instance v0, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-direct {v0, v2, v7}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 18848
    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;

    move-result-object v0

    .line 18849
    if-nez v0, :cond_9

    .line 18850
    new-instance v0, Ljava/io/IOException;

    const-string v2, "4.4 IOException"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_3

    .line 18853
    :catch_0
    move-exception v0

    :try_start_6
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18854
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    .line 18915
    :goto_1
    return-void

    .line 18813
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18814
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 18884
    :catch_2
    move-exception v0

    .line 18885
    :goto_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_3

    .line 18886
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 18889
    :cond_3
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 18890
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 18891
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 18892
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18893
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18894
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 18895
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 18896
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 18897
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 18818
    :cond_4
    :try_start_7
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/release/ImageEditor;->c(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_3

    goto :goto_1

    .line 18901
    :catch_3
    move-exception v0

    .line 18902
    :goto_3
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_5

    .line 18903
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 18906
    :cond_5
    const/16 v1, 0xaa

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 18907
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 18908
    iput-boolean v10, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 18909
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 18910
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v1, Landroid/os/Message;->what:I

    .line 18911
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 18912
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 18913
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 18914
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_1

    .line 18829
    :cond_6
    :try_start_8
    const-string v2, ".jpg"

    .line 18830
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    move-object v3, v0

    move-object v0, v2

    goto/16 :goto_0

    .line 18837
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 18838
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v11, :cond_1

    .line 18839
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 18858
    :cond_7
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->b(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 18862
    :cond_8
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 18864
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getMeasuredWidth()I

    move-result v2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v4}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v4

    sget-object v5, Lcom/roidapp/photogrid/common/az;->c:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v4, v5}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_3

    move-result-object v2

    .line 18865
    :try_start_9
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 18866
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v5, :cond_a

    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v6, 0x5

    if-ne v5, v6, :cond_b

    .line 18867
    :cond_a
    iget v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_b

    .line 18868
    const/4 v5, -0x1

    invoke-virtual {v4, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 18871
    :cond_b
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v5, v4}, Landroid/widget/RelativeLayout;->draw(Landroid/graphics/Canvas;)V

    .line 18873
    const/16 v4, 0x64

    invoke-virtual {v2, v3, v4, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 18874
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 18875
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 18877
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_d

    .line 18878
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_5

    .line 18882
    :goto_4
    :try_start_a
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->d(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_3

    goto/16 :goto_1

    .line 18899
    :cond_c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_1

    .line 18901
    :catch_5
    move-exception v0

    move-object v1, v2

    goto/16 :goto_3

    .line 18884
    :catch_6
    move-exception v0

    move-object v1, v2

    goto/16 :goto_2

    :cond_d
    move-object v1, v2

    goto :goto_4
.end method

.method private G()V
    .locals 15

    .prologue
    .line 1058
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 1059
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1060
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1061
    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1062
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1063
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 1065
    :try_start_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->J()V

    .line 1066
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9099
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->f:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v3, v3

    invoke-static {p0, v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;Ljava/util/ArrayList;[III)V

    .line 1067
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 9108
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    move-object v3, p0

    invoke-static/range {v0 .. v5}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/LinearLayout;Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Ljava/util/ArrayList;)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    .line 9120
    :goto_0
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->aa:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_0

    .line 9121
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-direct {v0, p0, v1, v2}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->aa:Lcom/roidapp/photogrid/release/an;

    .line 9122
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->O:I

    if-ltz v0, :cond_0

    .line 9123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->aa:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->P:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->S:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Q:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->R:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 1070
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    .line 1071
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 1072
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/if;

    .line 1073
    new-instance v2, Lcom/roidapp/photogrid/release/iy;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/iy;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/if;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1071
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 9110
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 1083
    :catch_1
    move-exception v0

    .line 1084
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->J()V

    .line 1085
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 1086
    const/16 v0, 0x8d

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 1087
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1089
    :goto_2
    return-void

    .line 9112
    :catch_2
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 1081
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v4, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9135
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    .line 9136
    const v1, 0x3c3c6a7f    # 0.0115f

    const/high16 v2, 0x42c80000    # 100.0f

    div-float v2, v0, v2

    sub-float/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v2, v2

    mul-float v5, v1, v2

    .line 9137
    const v1, 0x3c3c6a7f    # 0.0115f

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v0, v2

    sub-float v0, v1, v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v1, v1

    mul-float v6, v0, v1

    .line 9138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v5

    sub-float v7, v0, v1

    .line 9139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    mul-float/2addr v1, v6

    sub-float v8, v0, v1

    .line 9140
    const/4 v0, 0x0

    move v2, v0

    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_4

    .line 9141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v2

    iget-object v9, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 9143
    if-nez v9, :cond_2

    .line 9144
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "data null"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9146
    :cond_2
    iget v0, v9, Lcom/roidapp/photogrid/release/lc;->k:F

    mul-float/2addr v0, v8

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    add-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 9147
    iget v1, v9, Lcom/roidapp/photogrid/release/lc;->j:F

    mul-float/2addr v1, v7

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v1, v10

    add-float/2addr v1, v5

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 9148
    iget v10, v9, Lcom/roidapp/photogrid/release/lc;->l:F

    mul-float/2addr v10, v7

    const/high16 v11, 0x42c80000    # 100.0f

    div-float/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    add-int/2addr v10, v1

    .line 9149
    iget v11, v9, Lcom/roidapp/photogrid/release/lc;->m:F

    mul-float/2addr v11, v8

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v11, v12

    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    add-int/2addr v11, v0

    .line 9150
    iget-object v12, v9, Lcom/roidapp/photogrid/release/lc;->p:Landroid/graphics/Region;

    invoke-virtual {v12, v1, v0, v10, v11}, Landroid/graphics/Region;->set(IIII)Z

    .line 9153
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 9154
    iget-object v11, v9, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 9155
    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    int-to-float v1, v3

    mul-float/2addr v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v1, v0

    const/4 v0, 0x0

    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v12, v4

    mul-float/2addr v0, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v0, v12

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v10, v1, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 9156
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    .line 9157
    const/4 v0, 0x1

    move v1, v0

    :goto_4
    if-ge v1, v12, :cond_3

    .line 9158
    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->x:F

    int-to-float v13, v3

    mul-float/2addr v0, v13

    const/high16 v13, 0x42c80000    # 100.0f

    div-float/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v13, v0

    invoke-interface {v11, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/PointF;

    iget v0, v0, Landroid/graphics/PointF;->y:F

    int-to-float v14, v4

    mul-float/2addr v0, v14

    const/high16 v14, 0x42c80000    # 100.0f

    div-float/2addr v0, v14

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v10, v13, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 9157
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_4

    .line 9160
    :cond_3
    invoke-virtual {v10}, Landroid/graphics/Path;->close()V

    .line 9161
    iput-object v10, v9, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 9140
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_3

    .line 1082
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 9174
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, Lcom/roidapp/photogrid/release/iz;

    invoke-direct {v3, p0, v0, v1}, Lcom/roidapp/photogrid/release/iz;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;II)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_2
.end method

.method static synthetic G(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->J()V

    return-void
.end method

.method private H()V
    .locals 2

    .prologue
    .line 1528
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    .line 1544
    :goto_0
    return-void

    .line 1531
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1532
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->d:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Ljava/lang/String;)V

    .line 1533
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->c:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1534
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 1535
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->f:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 1536
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->O:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->h(I)V

    .line 1537
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 1538
    const-class v1, Lcom/roidapp/photogrid/release/EffectsList;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1539
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_1

    .line 1540
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1542
    :cond_1
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->startActivity(Landroid/content/Intent;)V

    .line 1543
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->finish()V

    goto :goto_0
.end method

.method private I()Ljava/lang/String;
    .locals 3

    .prologue
    .line 1567
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f07002e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1568
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1570
    const-string v2, "SAVEPATH"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized J()V
    .locals 3

    .prologue
    .line 2277
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 2278
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 2280
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2281
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 2283
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 2277
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 2286
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2287
    monitor-exit p0

    return-void
.end method

.method static synthetic a()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->i:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageEditor;I)I
    .locals 0

    .prologue
    .line 80
    iput p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/an;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->aa:Lcom/roidapp/photogrid/release/an;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v4, 0x0

    .line 80
    .line 11497
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->T:Landroid/view/View;

    if-nez v0, :cond_0

    .line 11498
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->T:Landroid/view/View;

    .line 11499
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 11500
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 11501
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 11502
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 11503
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 11504
    :goto_0
    return-void

    :cond_0
    move v3, v4

    .line 11507
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v3, v0, :cond_1

    .line 11508
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->T:Landroid/view/View;

    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 11509
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 11510
    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/AbsoluteLayout$LayoutParams;

    .line 11511
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/AbsoluteLayout$LayoutParams;

    .line 11512
    new-instance v5, Landroid/view/animation/TranslateAnimation;

    iget v6, v0, Landroid/widget/AbsoluteLayout$LayoutParams;->x:I

    iget v7, v2, Landroid/widget/AbsoluteLayout$LayoutParams;->x:I

    sub-int/2addr v6, v7

    int-to-float v6, v6

    iget v0, v0, Landroid/widget/AbsoluteLayout$LayoutParams;->y:I

    iget v2, v2, Landroid/widget/AbsoluteLayout$LayoutParams;->y:I

    sub-int/2addr v0, v2

    int-to-float v0, v0

    invoke-direct {v5, v6, v8, v0, v8}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 11513
    new-instance v0, Landroid/view/animation/AnimationSet;

    const/4 v2, 0x1

    invoke-direct {v0, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 11514
    invoke-virtual {v0, v5}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 11515
    sget-wide v6, Lcom/roidapp/photogrid/common/az;->d:J

    invoke-virtual {v0, v6, v7}, Landroid/view/animation/AnimationSet;->setDuration(J)V

    .line 11516
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 11507
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_1

    .line 11519
    :cond_1
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->T:Landroid/view/View;

    .line 11520
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 11521
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 11522
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 11523
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 11524
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0
.end method

.method private a(Landroid/view/View;)Z
    .locals 13

    .prologue
    .line 1378
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge v2, v0, :cond_7

    .line 1379
    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/aq;

    .line 1380
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x3

    if-eq v1, v3, :cond_0

    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 1381
    :cond_0
    new-instance v1, Lcom/roidapp/photogrid/release/ja;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/photogrid/release/ja;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;Lcom/roidapp/photogrid/release/aq;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1388
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    iget-object v5, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 1389
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    const/4 v3, 0x0

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 1390
    const/4 v1, 0x0

    .line 1393
    :try_start_0
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_3

    packed-switch v3, :pswitch_data_0

    :goto_1
    :pswitch_0
    move-object v3, v1

    .line 1488
    :goto_2
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_2

    .line 1489
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/aq;->a(Landroid/graphics/Bitmap;)V

    .line 1490
    invoke-virtual {p0, v2, v3}, Lcom/roidapp/photogrid/release/ImageEditor;->a(ILandroid/graphics/Bitmap;)V

    .line 1378
    :cond_2
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 1396
    :pswitch_1
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v3

    .line 1397
    const/4 v4, 0x0

    aget v4, v3, v4

    .line 1398
    const/4 v6, 0x1

    aget v3, v3, v6

    .line 1399
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    add-int/lit8 v3, v3, 0x6

    add-int/lit8 v4, v4, 0x6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v3, v4, v7}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v3

    .line 1400
    :try_start_2
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1402
    iget v6, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1403
    iget v7, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1405
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 1407
    iget-object v9, v5, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 1408
    const/4 v1, 0x0

    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    int-to-float v4, v6

    mul-float/2addr v1, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v4, v1

    const/4 v1, 0x0

    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    int-to-float v10, v7

    mul-float/2addr v1, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v1, v10

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v8, v4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1410
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    .line 1411
    const/4 v1, 0x1

    move v4, v1

    :goto_3
    if-ge v4, v10, :cond_3

    .line 1413
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    int-to-float v11, v6

    mul-float/2addr v1, v11

    const/high16 v11, 0x42c80000    # 100.0f

    div-float/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v11, v1

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    int-to-float v12, v7

    mul-float/2addr v1, v12

    const/high16 v12, 0x42c80000    # 100.0f

    div-float/2addr v1, v12

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v8, v11, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1411
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_3

    .line 1417
    :cond_3
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 1418
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v8, v1, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_2

    .line 1432
    :catch_0
    move-exception v1

    move-object v1, v3

    :goto_4
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1433
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1434
    const/4 v1, 0x0

    .line 1436
    :cond_4
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1439
    :try_start_3
    sget v3, Lcom/roidapp/photogrid/common/az;->q:I
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_2

    packed-switch v3, :pswitch_data_1

    :goto_5
    :pswitch_2
    move-object v3, v1

    .line 1486
    goto/16 :goto_2

    .line 1421
    :pswitch_3
    :try_start_4
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v3

    .line 1422
    int-to-float v4, v3

    const/high16 v6, 0x3f400000    # 0.75f

    mul-float/2addr v4, v6

    float-to-int v4, v4

    .line 1423
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v3, v4, v7}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto/16 :goto_2

    .line 1426
    :pswitch_4
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v3

    .line 1427
    int-to-float v4, v3

    const/high16 v6, 0x3f400000    # 0.75f

    mul-float/2addr v4, v6

    float-to-int v4, v4

    .line 1428
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v4, v3, v7}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_3

    move-result-object v1

    goto/16 :goto_1

    .line 1442
    :pswitch_5
    :try_start_5
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v3

    .line 1444
    const/4 v4, 0x0

    aget v4, v3, v4

    .line 1445
    const/4 v6, 0x1

    aget v3, v3, v6

    .line 1446
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v2

    add-int/lit8 v3, v3, 0x6

    add-int/lit8 v4, v4, 0x6

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v3, v4, v7}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_2

    move-result-object v3

    .line 1448
    :try_start_6
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 1449
    iget v6, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1450
    iget v7, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1451
    new-instance v8, Landroid/graphics/Path;

    invoke-direct {v8}, Landroid/graphics/Path;-><init>()V

    .line 1452
    iget-object v5, v5, Lcom/roidapp/photogrid/release/lc;->b:Ljava/util/List;

    .line 1453
    const/4 v1, 0x0

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    int-to-float v4, v6

    mul-float/2addr v1, v4

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v1, v4

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v4, v1

    const/4 v1, 0x0

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    int-to-float v9, v7

    mul-float/2addr v1, v9

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v8, v4, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1455
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v9

    .line 1456
    const/4 v1, 0x1

    move v4, v1

    :goto_6
    if-ge v4, v9, :cond_5

    .line 1458
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->x:F

    int-to-float v10, v6

    mul-float/2addr v1, v10

    const/high16 v10, 0x42c80000    # 100.0f

    div-float/2addr v1, v10

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v10, v1

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/PointF;

    iget v1, v1, Landroid/graphics/PointF;->y:F

    int-to-float v11, v7

    mul-float/2addr v1, v11

    const/high16 v11, 0x42c80000    # 100.0f

    div-float/2addr v1, v11

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v8, v10, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1456
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_6

    .line 1462
    :cond_5
    invoke-virtual {v8}, Landroid/graphics/Path;->close()V

    .line 1463
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v8, v1, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_2

    .line 1478
    :catch_1
    move-exception v0

    move-object v1, v3

    :goto_7
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_6

    .line 1479
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 1482
    :cond_6
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 1483
    const/16 v0, 0xa7

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 1484
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 1485
    const/4 v0, 0x0

    .line 1493
    :goto_8
    return v0

    .line 1467
    :pswitch_6
    :try_start_7
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v3

    .line 1468
    int-to-float v4, v3

    const/high16 v5, 0x3f400000    # 0.75f

    mul-float/2addr v4, v5

    float-to-int v4, v4

    .line 1469
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v2

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5, v3, v4, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v3

    goto/16 :goto_2

    .line 1472
    :pswitch_7
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v3

    .line 1473
    int-to-float v4, v3

    const/high16 v5, 0x3f400000    # 0.75f

    mul-float/2addr v4, v5

    float-to-int v4, v4

    .line 1474
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v2

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v5, v4, v3, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;
    :try_end_7
    .catch Ljava/lang/OutOfMemoryError; {:try_start_7 .. :try_end_7} :catch_2

    move-result-object v1

    goto/16 :goto_5

    .line 1493
    :cond_7
    const/4 v0, 0x1

    goto :goto_8

    .line 1478
    :catch_2
    move-exception v0

    goto :goto_7

    .line 1432
    :catch_3
    move-exception v3

    goto/16 :goto_4

    .line 1393
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 1439
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_2
        :pswitch_6
        :pswitch_7
        :pswitch_2
        :pswitch_5
    .end packed-switch
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageEditor;Z)Z
    .locals 0

    .prologue
    .line 80
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    return p1
.end method

.method static synthetic b()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ab:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageEditor;I)V
    .locals 3

    .prologue
    .line 12946
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    int-to-float v1, p1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->a(F)V

    .line 12947
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 12966
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 12948
    :catch_0
    move-exception v0

    .line 12949
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12950
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 12951
    :catch_1
    move-exception v0

    .line 12952
    const/16 v1, 0xab

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 12953
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 12954
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageEditor;Z)V
    .locals 3

    .prologue
    .line 12076
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/aq;->c(Z)V

    .line 12077
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 12090
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 12078
    :catch_0
    move-exception v0

    .line 12079
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12080
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 12081
    :catch_1
    move-exception v0

    .line 12082
    const/16 v1, 0xb1

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 12083
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 12084
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1929
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 1930
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1931
    const/16 v1, 0x2bc

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1932
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1933
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1934
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)Z
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ImageEditor;->a(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .prologue
    .line 80
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    return-object p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageEditor;Z)V
    .locals 3

    .prologue
    .line 12095
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/aq;->d(Z)V

    .line 12096
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 12109
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 12097
    :catch_0
    move-exception v0

    .line 12098
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12099
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 12100
    :catch_1
    move-exception v0

    .line 12101
    const/16 v1, 0xb2

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 12102
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 12103
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1937
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 1938
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1939
    const/16 v1, 0x2bd

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1940
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1941
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1942
    return-void
.end method

.method static synthetic d()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->k:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2216
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "file://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 2217
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->sendBroadcast(Landroid/content/Intent;)V

    .line 2219
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->am:Z

    if-eqz v0, :cond_0

    .line 2220
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07027e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2221
    const-string v0, "image/jpeg"

    invoke-static {p1, v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2222
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->finish()V

    .line 2240
    :goto_0
    return-void

    .line 2227
    :cond_0
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2228
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->k:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2229
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2230
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2231
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2232
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2233
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 2234
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2235
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->V:Z

    if-eqz v0, :cond_1

    .line 2236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->l:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 2238
    :cond_1
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    goto :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->G()V

    return-void
.end method

.method static synthetic f()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->l:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 3

    .prologue
    .line 11179
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 11181
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 11182
    const v1, 0x7f070158

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 11183
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 11184
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f070157

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "   ErrorCode:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 11185
    const v1, 0x7f070156

    new-instance v2, Lcom/roidapp/photogrid/release/jb;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jb;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 11191
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 11192
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_1

    .line 11197
    :goto_0
    return-void

    .line 11194
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_0

    .line 11196
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/NoSuchMethodError;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic g()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->m:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ImageEditor;)Z
    .locals 1

    .prologue
    .line 80
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->X:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/ImageEditor;)Z
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->X:Z

    return v0
.end method

.method static synthetic j()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->F:I

    return v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->K:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic k()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->G:I

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/ImageEditor;)Z
    .locals 1

    .prologue
    .line 80
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->V:Z

    return v0
.end method

.method static synthetic l()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->H:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic m()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->I:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/ImageEditor;)I
    .locals 1

    .prologue
    .line 80
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    return v0
.end method

.method static synthetic n()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->A:I

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/ImageEditor;)Landroid/view/View;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    return-object v0
.end method

.method static synthetic o()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->B:I

    return v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 3

    .prologue
    .line 12988
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->d()V

    .line 12989
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 13000
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 12990
    :catch_0
    move-exception v0

    .line 12991
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 12992
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 12993
    :catch_1
    move-exception v0

    .line 12994
    const/16 v1, 0xad

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 12995
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 12996
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic p()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->C:I

    return v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 3

    .prologue
    .line 13971
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->e()V

    .line 13972
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 13983
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 13973
    :catch_0
    move-exception v0

    .line 13974
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 13975
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 13976
    :catch_1
    move-exception v0

    .line 13977
    const/16 v1, 0xac

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 13978
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 13979
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic q()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->E:I

    return v0
.end method

.method static synthetic q(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 14022
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->a(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14023
    const v0, 0x7f0d024a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14024
    const v0, 0x7f0d024c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 14025
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const/4 v1, 0x1

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 14029
    :goto_0
    const v0, 0x7f0d024d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14030
    const v0, 0x7f0d024d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14031
    const v0, 0x7f0d024f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 14033
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 14044
    :goto_1
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 14027
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->x:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 14034
    :catch_0
    move-exception v0

    .line 14035
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 14036
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 14037
    :catch_1
    move-exception v0

    .line 14038
    const/16 v1, 0xaf

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 14039
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 14040
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic r()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->D:I

    return v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 14049
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/aq;->b(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14050
    const v0, 0x7f0d024d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14051
    const v0, 0x7f0d024f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 14052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const/4 v1, -0x1

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->x:I

    .line 14056
    :goto_0
    const v0, 0x7f0d024a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 14057
    const v0, 0x7f0d024a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14058
    const v0, 0x7f0d024c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(I)V

    .line 14060
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 14071
    :goto_1
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 14054
    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    iput v1, v0, Lcom/roidapp/photogrid/release/ig;->x:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 14061
    :catch_0
    move-exception v0

    .line 14062
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 14063
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 14064
    :catch_1
    move-exception v0

    .line 14065
    const/16 v1, 0xb0

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 14066
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 14067
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1
.end method

.method static synthetic s()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->z:I

    return v0
.end method

.method static synthetic s(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    return-object v0
.end method

.method static synthetic t()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->y:I

    return v0
.end method

.method static synthetic t(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/release/aq;
    .locals 1

    .prologue
    .line 80
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    return-object v0
.end method

.method static synthetic u()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->r:I

    return v0
.end method

.method static synthetic u(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 3

    .prologue
    .line 15005
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->c()V

    .line 15006
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 15017
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 80
    return-void

    .line 15007
    :catch_0
    move-exception v0

    .line 15008
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 15009
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 15010
    :catch_1
    move-exception v0

    .line 15011
    const/16 v1, 0xae

    iput v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->af:I

    .line 15012
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->n:I

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 15013
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic v()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->o:I

    return v0
.end method

.method static synthetic v(Lcom/roidapp/photogrid/release/ImageEditor;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Y:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic w()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->s:I

    return v0
.end method

.method static synthetic w(Lcom/roidapp/photogrid/release/ImageEditor;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->an:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method static synthetic x(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 0

    .prologue
    .line 80
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->H()V

    return-void
.end method

.method static synthetic y()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->p:I

    return v0
.end method

.method static synthetic y(Lcom/roidapp/photogrid/release/ImageEditor;)Z
    .locals 1

    .prologue
    .line 80
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    return v0
.end method

.method static synthetic z()I
    .locals 1

    .prologue
    .line 80
    sget v0, Lcom/roidapp/photogrid/release/ImageEditor;->q:I

    return v0
.end method

.method static synthetic z(Lcom/roidapp/photogrid/release/ImageEditor;)V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 80
    .line 15871
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 15872
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 15873
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 15874
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 15875
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 15877
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    if-eqz v0, :cond_1

    .line 15878
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v0

    .line 15879
    add-int/lit8 v0, v0, -0x1

    .line 15880
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "mask"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 15881
    if-eqz v0, :cond_0

    .line 15882
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 15884
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    .line 15887
    :cond_1
    const/16 v0, 0xa

    invoke-static {p0, v0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;I)Z

    move-result v0

    .line 15888
    if-nez v0, :cond_2

    .line 15889
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :goto_0
    return-void

    .line 15891
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/photogrid/release/is;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/is;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method


# virtual methods
.method public final declared-synchronized a(ILandroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 2268
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 2269
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2270
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 2273
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ah:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2274
    monitor-exit p0

    return-void

    .line 2268
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final a(Lcom/roidapp/photogrid/release/aq;)V
    .locals 11

    .prologue
    const/4 v8, 0x0

    const/16 v10, 0x80

    const/high16 v7, 0x3f400000    # 0.75f

    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 1252
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    if-eqz v0, :cond_1

    .line 1375
    :cond_0
    :goto_0
    return-void

    .line 1255
    :cond_1
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v0

    .line 1256
    const-string v2, "sketch"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1257
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    .line 9914
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    if-nez v0, :cond_0

    .line 9917
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    if-eqz v0, :cond_0

    .line 9920
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 9921
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 9922
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 9923
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9924
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 9925
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/iu;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/iu;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 1260
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    if-eqz v2, :cond_9

    .line 1261
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v2

    if-eq v0, v2, :cond_0

    .line 1276
    const-string v2, "exchange"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1277
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 10207
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->K:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 10208
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    .line 10209
    check-cast p1, Lcom/roidapp/photogrid/release/aq;

    .line 10211
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 10212
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    .line 10214
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "mask"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    .line 10215
    if-eqz v4, :cond_3

    .line 10216
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 10221
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 10222
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->c()V

    .line 10224
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->a()Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 10225
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/lc;->a()Lcom/roidapp/photogrid/release/lc;

    move-result-object v4

    .line 10227
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v3

    aput-object v6, v5, v0

    .line 10228
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aput-object v1, v5, v3

    .line 10229
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v0

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    iput-object v5, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 10230
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    iput-object v4, v1, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 10232
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_4

    .line 10233
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    .line 10234
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    .line 10237
    :cond_4
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 10238
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->m:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 10239
    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 10240
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 10242
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 10243
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->m:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 10244
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 10245
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 10247
    iput-object v8, p0, Lcom/roidapp/photogrid/release/ImageEditor;->g:Ljava/lang/String;

    .line 10248
    iput-object v8, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    goto/16 :goto_0

    .line 1280
    :cond_5
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/aq;->getId()I

    move-result v2

    .line 1281
    add-int/lit8 v2, v2, -0x1

    .line 1282
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "mask"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v2

    .line 1284
    if-eqz v2, :cond_6

    .line 1285
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 1288
    :cond_6
    add-int/lit8 v3, v0, -0x1

    .line 1289
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "mask"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    .line 1290
    if-eqz v4, :cond_7

    .line 1293
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, v3

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 1294
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, v3

    iput-boolean v1, v2, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 1295
    iget-object v5, v0, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 1297
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move v0, v1

    move v2, v1

    .line 1313
    :goto_1
    if-eqz v5, :cond_8

    .line 1314
    new-instance v6, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v7, Landroid/graphics/drawable/shapes/PathShape;

    int-to-float v8, v2

    int-to-float v9, v0

    invoke-direct {v7, v5, v8, v9}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 1315
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v5

    invoke-static {v10, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 1316
    invoke-virtual {v6, v1, v1, v2, v0}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 1317
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1322
    :cond_7
    :goto_2
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    .line 1324
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1325
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->r:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1326
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->x:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1327
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1300
    :pswitch_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v0

    .line 1301
    aget v2, v0, v1

    .line 1302
    aget v0, v0, v6

    goto :goto_1

    .line 1305
    :pswitch_2
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v0

    .line 1306
    int-to-float v2, v0

    mul-float/2addr v2, v7

    float-to-int v2, v2

    .line 1307
    goto :goto_1

    .line 1309
    :pswitch_3
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v2

    .line 1310
    int-to-float v0, v2

    mul-float/2addr v0, v7

    float-to-int v0, v0

    goto :goto_1

    .line 1319
    :cond_8
    invoke-static {v10, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    .line 1331
    :cond_9
    add-int/lit8 v3, v0, -0x1

    .line 1332
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->M:Landroid/view/View;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "mask"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v4

    .line 1334
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_1

    :pswitch_4
    move v0, v1

    move v2, v1

    .line 1350
    :goto_3
    if-eqz v4, :cond_a

    .line 1351
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v3

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ig;->y:Lcom/roidapp/photogrid/release/lc;

    .line 1352
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v6, v6, v3

    iput-boolean v1, v6, Lcom/roidapp/photogrid/release/ig;->w:Z

    .line 1353
    iget-object v5, v5, Lcom/roidapp/photogrid/release/lc;->a:Landroid/graphics/Path;

    .line 1354
    if-eqz v5, :cond_b

    .line 1355
    const-string v6, "imagee"

    const-string v7, " get irregular sharpe.."

    invoke-static {v6, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1356
    new-instance v6, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v7, Landroid/graphics/drawable/shapes/PathShape;

    int-to-float v8, v2

    int-to-float v9, v0

    invoke-direct {v7, v5, v8, v9}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v6, v7}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 1357
    invoke-virtual {v6}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v5

    invoke-static {v10, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v7

    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 1359
    invoke-virtual {v6, v1, v1, v2, v0}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 1360
    invoke-virtual {v4, v6}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1365
    :cond_a
    :goto_4
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->U:Lcom/roidapp/photogrid/release/aq;

    .line 1366
    const-string v0, "move_zoom_rotate"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1368
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1369
    sget v1, Lcom/roidapp/photogrid/release/ImageEditor;->r:I

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1370
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v3

    iget v1, v1, Lcom/roidapp/photogrid/release/ig;->x:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 1371
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 1337
    :pswitch_5
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-static {p1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;)[I

    move-result-object v0

    .line 1338
    aget v2, v0, v1

    .line 1339
    aget v0, v0, v6

    goto :goto_3

    .line 1342
    :pswitch_6
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v0

    .line 1343
    int-to-float v2, v0

    mul-float/2addr v2, v7

    float-to-int v2, v2

    .line 1344
    goto :goto_3

    .line 1346
    :pswitch_7
    invoke-static {p0}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;)I

    move-result v2

    .line 1347
    int-to-float v0, v2

    mul-float/2addr v0, v7

    float-to-int v0, v0

    goto :goto_3

    .line 1362
    :cond_b
    invoke-static {v10, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_4

    .line 1297
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 1334
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_7
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;)V
    .locals 11

    .prologue
    const/4 v5, 0x0

    const/4 v9, 0x0

    .line 2243
    iput-boolean v9, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 2244
    iput-boolean v9, p0, Lcom/roidapp/photogrid/release/ImageEditor;->V:Z

    .line 2245
    const/16 v1, 0xf01

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    const v0, 0x7f0702b8

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v7, "ImageEditor"

    sget v10, Lcom/roidapp/photogrid/cloud/BaseShareActivity;->a:I

    move-object v0, p0

    move-object v2, p1

    move-object v6, v5

    move-object v8, v5

    invoke-static/range {v0 .. v10}, Lcom/roidapp/photogrid/cloud/br;->a(Landroid/app/Activity;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)Z

    .line 2247
    return-void
.end method

.method public makeView()Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, -0x1

    .line 2147
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2148
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2149
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 2151
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    .line 2152
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 2154
    :cond_1
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2156
    return-object v0
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    .prologue
    .line 2160
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    .prologue
    .line 748
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 750
    iget v0, p1, Landroid/content/res/Configuration;->orientation:I

    .line 753
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 754
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 12

    .prologue
    const/4 v3, 0x2

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v11, 0x0

    const/16 v10, 0x8

    .line 377
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 378
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 380
    const v0, 0x7f030092

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 386
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->v:Z

    if-nez v0, :cond_1

    .line 387
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Y:Ljava/util/Map;

    .line 388
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->L()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->b:Ljava/lang/String;

    .line 389
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->c:I

    .line 390
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->J()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->d:[Ljava/lang/String;

    .line 391
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    .line 392
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->I()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->f:I

    .line 393
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->H()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->O:I

    .line 394
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->P:I

    .line 395
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Q:I

    .line 396
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->R:I

    .line 397
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->S:I

    .line 398
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->B()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ag:Z

    .line 400
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->c:I

    if-lez v0, :cond_2

    .line 3113
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 3114
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 3115
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    .line 3116
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 3118
    :cond_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->startActivity(Landroid/content/Intent;)V

    .line 3119
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->finish()V

    .line 725
    :cond_1
    :goto_1
    return-void

    .line 382
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 383
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->v:Z

    .line 384
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 403
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->c:I

    if-nez v0, :cond_3

    .line 405
    const-string v0, "170"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto :goto_1

    .line 409
    :cond_3
    const v0, 0x7f0d00aa

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    .line 410
    const v0, 0x7f0d0061

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    .line 411
    const v0, 0x7f0d0239

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ad:Landroid/widget/FrameLayout;

    .line 412
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 413
    const-string v4, "effect_mode"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    .line 415
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    .line 3832
    const-string v4, "exchange"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 3833
    const v0, 0x7f0d023b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3834
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 3835
    const v0, 0x7f0d023d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3836
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3837
    const v0, 0x7f0d025e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3838
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 417
    :cond_4
    :goto_2
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->K:Landroid/widget/RelativeLayout;

    .line 419
    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p0}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->N:Landroid/view/GestureDetector;

    .line 421
    const v0, 0x7f0d0060

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ab:Landroid/view/ViewGroup;

    .line 422
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ag:Z

    if-eqz v0, :cond_5

    .line 423
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ab:Landroid/view/ViewGroup;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 426
    :cond_5
    const v0, 0x7f0d0028

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 427
    new-instance v2, Lcom/roidapp/photogrid/release/iv;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/iv;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 435
    const-string v0, "sketch"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->W:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 436
    const v0, 0x7f0d0238

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 437
    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 439
    const v0, 0x7f0d003a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 440
    const/16 v2, 0xa5

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 441
    new-instance v2, Lcom/roidapp/photogrid/release/jc;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jc;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 449
    const v2, 0x7f0d0237

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    .line 450
    const/16 v4, 0xa5

    invoke-virtual {v2, v4}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 451
    new-instance v4, Lcom/roidapp/photogrid/release/jd;

    invoke-direct {v4, p0}, Lcom/roidapp/photogrid/release/jd;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v2, v4}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 465
    invoke-static {p0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a(Landroid/app/Activity;)Z

    move-result v4

    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->am:Z

    .line 466
    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageEditor;->am:Z

    if-eqz v4, :cond_6

    .line 471
    const v4, 0x7f020459

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 472
    invoke-virtual {v0}, Landroid/widget/ImageButton;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout$LayoutParams;

    .line 473
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f090193

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 474
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f090187

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {v4, v11, v11, v5, v11}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 475
    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 476
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 477
    invoke-virtual {v2, v10}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 496
    :cond_6
    :goto_3
    const v0, 0x7f0d0250

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 497
    new-instance v2, Lcom/roidapp/photogrid/release/jf;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jf;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 511
    const v0, 0x7f0d0256

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 512
    new-instance v2, Lcom/roidapp/photogrid/release/jg;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jg;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 526
    const v0, 0x7f0d0253

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 527
    new-instance v2, Lcom/roidapp/photogrid/release/jh;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jh;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 541
    const v0, 0x7f0d0259

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 542
    new-instance v2, Lcom/roidapp/photogrid/release/ji;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ji;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 556
    const v0, 0x7f0d025c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 557
    new-instance v2, Lcom/roidapp/photogrid/release/il;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/il;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 571
    const v0, 0x7f0d023e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 572
    new-instance v2, Lcom/roidapp/photogrid/release/im;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/im;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 586
    const v0, 0x7f0d0241

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 587
    new-instance v2, Lcom/roidapp/photogrid/release/in;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/in;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 601
    const v0, 0x7f0d0244

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 602
    new-instance v2, Lcom/roidapp/photogrid/release/io;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/io;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 616
    const v0, 0x7f0d0247

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 617
    new-instance v2, Lcom/roidapp/photogrid/release/ip;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ip;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 631
    const v0, 0x7f0d024a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 632
    new-instance v2, Lcom/roidapp/photogrid/release/iq;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/iq;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 646
    const v0, 0x7f0d024d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 647
    new-instance v2, Lcom/roidapp/photogrid/release/ir;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/ir;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 665
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->X:Z

    .line 666
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 6210
    :goto_4
    :pswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v11}, Lcom/roidapp/photogrid/release/ImageEditor;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 6211
    const-string v1, "FORMAT"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 722
    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->Z:I

    .line 7733
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v11}, Lcom/roidapp/photogrid/release/ImageEditor;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 7734
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v11}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 6740
    if-eqz v0, :cond_1

    .line 6741
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->an:Lcom/roidapp/photogrid/common/al;

    .line 6742
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->an:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 6743
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    goto/16 :goto_1

    .line 3839
    :cond_7
    const-string v4, "move_zoom_rotate"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 3840
    const v0, 0x7f0d023b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3841
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3842
    const v0, 0x7f0d023d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v9

    .line 3843
    invoke-virtual {v9, v11}, Landroid/view/View;->setVisibility(I)V

    .line 3844
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/high16 v4, -0x40800000    # -1.0f

    move v5, v1

    move v6, v2

    move v7, v1

    move v8, v2

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    .line 3845
    const-wide/16 v4, 0x3e8

    invoke-virtual {v0, v4, v5}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 3846
    invoke-virtual {v9, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 3847
    const v0, 0x7f0d025e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3848
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 3849
    :cond_8
    const-string v2, "sketch"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3850
    const v0, 0x7f0d023b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3851
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3852
    const v0, 0x7f0d023d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3853
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 3854
    const v0, 0x7f0d025e

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3855
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_2

    .line 480
    :cond_9
    const v0, 0x7f0d003a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 481
    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 482
    const v0, 0x7f0d0237

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 483
    invoke-virtual {v0, v10}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 485
    const v0, 0x7f0d0238

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageEditor;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    .line 486
    new-instance v2, Lcom/roidapp/photogrid/release/je;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/je;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_3

    .line 669
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setDrawingCacheEnabled(Z)V

    .line 670
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    const/high16 v2, 0x100000

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setDrawingCacheQuality(I)V

    .line 671
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v11}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 672
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ad:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v10}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 673
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_a

    .line 675
    const-string v0, "171"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_1

    .line 4778
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v6

    .line 4781
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->al:I

    .line 4782
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    .line 4783
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->al:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    if-ge v0, v2, :cond_b

    .line 4784
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->al:I

    .line 4785
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    iput v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->al:I

    .line 4786
    iput v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    .line 4789
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0900dd

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    .line 4790
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f090058

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    const/high16 v4, 0x42480000    # 50.0f

    add-float/2addr v4, v0

    .line 4791
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f090057

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 4792
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    if-eqz v5, :cond_c

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v5

    if-nez v5, :cond_c

    .line 4793
    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v5}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    iget v5, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4794
    if-lez v5, :cond_c

    .line 4795
    int-to-float v0, v5

    .line 4798
    :cond_c
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f0900cb

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 4799
    iget v7, p0, Lcom/roidapp/photogrid/release/ImageEditor;->al:I

    int-to-float v7, v7

    sub-float v2, v7, v2

    sub-float/2addr v2, v4

    sub-float v0, v2, v0

    sub-float/2addr v0, v5

    float-to-int v2, v0

    .line 4802
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    int-to-float v0, v0

    int-to-float v4, v2

    div-float/2addr v0, v4

    .line 4804
    cmpg-float v0, v6, v0

    if-gez v0, :cond_e

    .line 4806
    int-to-float v0, v2

    mul-float/2addr v0, v6

    float-to-int v0, v0

    move v4, v0

    move v5, v2

    .line 4811
    :goto_5
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v6, v0

    if-lez v0, :cond_f

    .line 4812
    int-to-float v0, v5

    const v2, 0x3c3c6a7f    # 0.0115f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    move v2, v0

    .line 4817
    :goto_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 4818
    iput v4, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4819
    iput v5, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 4820
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v6, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 4822
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 4823
    mul-int/lit8 v6, v2, 0x2

    sub-int/2addr v4, v6

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 4824
    mul-int/lit8 v4, v2, 0x2

    sub-int v4, v5, v4

    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 4825
    invoke-virtual {v0, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 4826
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 679
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ne v0, v1, :cond_10

    .line 680
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    .line 698
    :cond_d
    :goto_7
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->G()V

    goto/16 :goto_4

    .line 4808
    :cond_e
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ak:I

    .line 4809
    int-to-float v2, v0

    div-float/2addr v2, v6

    float-to-int v2, v2

    move v4, v0

    move v5, v2

    goto :goto_5

    .line 4814
    :cond_f
    int-to-float v0, v4

    const v2, 0x3c3c6a7f    # 0.0115f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    move v2, v0

    goto :goto_6

    .line 681
    :cond_10
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ne v0, v3, :cond_11

    .line 682
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->c:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 683
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_12

    .line 684
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->d:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 685
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_13

    .line 686
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->e:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 687
    :cond_13
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_14

    .line 688
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->f:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 689
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_15

    .line 690
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->g:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 691
    :cond_15
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/4 v1, 0x7

    if-ne v0, v1, :cond_16

    .line 692
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->h:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 693
    :cond_16
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ne v0, v10, :cond_17

    .line 694
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->i:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto :goto_7

    .line 695
    :cond_17
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_d

    .line 696
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/common/aj;->j:[I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->L:[I

    goto/16 :goto_7

    .line 701
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 702
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ad:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v11}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 703
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_18

    .line 705
    const-string v0, "172"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_1

    .line 5030
    :cond_18
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 5031
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 5032
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v0, Landroid/os/Message;->what:I

    .line 5033
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 5034
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 5035
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300df

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 5036
    const v0, 0x7f0d03a9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 5037
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-static {v0, p0, v2}, Lcom/roidapp/photogrid/release/rf;->b(Landroid/widget/LinearLayout;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V

    .line 5038
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/release/ix;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/ix;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_4

    .line 711
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ac:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v10}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 712
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ad:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v11}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 713
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_19

    .line 715
    const-string v0, "173"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    goto/16 :goto_1

    .line 6004
    :cond_19
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    .line 6005
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 6006
    sget v2, Lcom/roidapp/photogrid/release/ImageEditor;->j:I

    iput v2, v0, Landroid/os/Message;->what:I

    .line 6007
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6008
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->h:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 6009
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300de

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 6010
    const v0, 0x7f0d03a8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 6012
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageEditor;->e:[Lcom/roidapp/photogrid/release/ig;

    invoke-static {v0, p0, v2}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/widget/LinearLayout;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V

    .line 6013
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/photogrid/release/iw;

    invoke-direct {v2, p0, v1}, Lcom/roidapp/photogrid/release/iw;-><init>(Lcom/roidapp/photogrid/release/ImageEditor;Landroid/view/View;)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_4

    .line 666
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 761
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->an:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 762
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->an:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->c()V

    .line 764
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 765
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 767
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->J()V

    .line 8290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 8291
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ic;

    .line 8292
    if-eqz v0, :cond_2

    .line 8293
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ic;->a()V

    goto :goto_0

    .line 8296
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->ai:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 769
    :cond_4
    invoke-static {}, Lcom/roidapp/baselib/c/p;->b()V

    .line 770
    invoke-static {}, Lcom/roidapp/photogrid/common/n;->d()V

    .line 771
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->b()V

    .line 772
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 773
    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 2123
    const/4 v0, 0x0

    return v0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 2128
    const/4 v0, 0x0

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2167
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 2168
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageEditor;->J:Z

    if-eqz v1, :cond_0

    .line 2175
    :goto_0
    return v0

    .line 2171
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageEditor;->H()V

    goto :goto_0

    .line 2175
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 2132
    return-void
.end method

.method public onResume()V
    .locals 0

    .prologue
    .line 757
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 758
    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 2136
    const/4 v0, 0x0

    return v0
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    .prologue
    .line 2163
    return-void
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 2140
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 2143
    const/4 v0, 0x1

    return v0
.end method

.method public onStart()V
    .locals 0

    .prologue
    .line 2302
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 2304
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 867
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->N:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 729
    const-string v0, "image_editor"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageEditor;->t:Ljava/lang/String;

    .line 730
    return-void
.end method
