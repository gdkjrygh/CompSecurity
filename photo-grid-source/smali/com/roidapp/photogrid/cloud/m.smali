.class final Lcom/roidapp/photogrid/cloud/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/photogrid/cloud/r;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:I


# direct methods
.method private constructor <init>(Lcom/roidapp/photogrid/cloud/r;Lcom/roidapp/photogrid/cloud/m;)V
    .locals 8

    .prologue
    .line 1599
    iget-object v2, p2, Lcom/roidapp/photogrid/cloud/m;->b:Ljava/lang/String;

    iget-object v3, p2, Lcom/roidapp/photogrid/cloud/m;->e:Ljava/lang/String;

    iget-object v4, p2, Lcom/roidapp/photogrid/cloud/m;->d:Ljava/lang/String;

    iget v0, p2, Lcom/roidapp/photogrid/cloud/m;->f:I

    shr-int/lit8 v5, v0, 0x1

    iget v0, p2, Lcom/roidapp/photogrid/cloud/m;->g:I

    shr-int/lit8 v6, v0, 0x1

    iget v0, p2, Lcom/roidapp/photogrid/cloud/m;->h:I

    add-int/lit8 v7, v0, 0x1

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/photogrid/cloud/m;-><init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    .line 1600
    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/r;Lcom/roidapp/photogrid/cloud/m;B)V
    .locals 0

    .prologue
    .line 1574
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/cloud/m;-><init>(Lcom/roidapp/photogrid/cloud/r;Lcom/roidapp/photogrid/cloud/m;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 8

    .prologue
    .line 1574
    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/photogrid/cloud/m;-><init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    return-void
.end method

.method private constructor <init>(Lcom/roidapp/photogrid/cloud/r;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 2

    .prologue
    .line 1587
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1588
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    .line 1589
    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/m;->b:Ljava/lang/String;

    .line 1590
    iput-object p4, p0, Lcom/roidapp/photogrid/cloud/m;->d:Ljava/lang/String;

    .line 1591
    iput-object p3, p0, Lcom/roidapp/photogrid/cloud/m;->e:Ljava/lang/String;

    .line 1592
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/m;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->c:Ljava/lang/String;

    .line 1593
    iput p5, p0, Lcom/roidapp/photogrid/cloud/m;->f:I

    .line 1594
    iput p6, p0, Lcom/roidapp/photogrid/cloud/m;->g:I

    .line 1595
    iput p7, p0, Lcom/roidapp/photogrid/cloud/m;->h:I

    .line 1596
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .prologue
    const/4 v0, -0x1

    const v12, 0xcc03

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    .line 1604
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    .line 1752
    :cond_0
    :goto_0
    return-void

    .line 1607
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/m;->b:Ljava/lang/String;

    .line 1612
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/m;->b:Ljava/lang/String;

    if-eqz v1, :cond_1e

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/m;->c:Ljava/lang/String;

    if-eqz v1, :cond_1e

    iget v1, p0, Lcom/roidapp/photogrid/cloud/m;->f:I

    if-lez v1, :cond_1e

    iget v1, p0, Lcom/roidapp/photogrid/cloud/m;->g:I

    if-lez v1, :cond_1e

    .line 1614
    iget v0, p0, Lcom/roidapp/photogrid/cloud/m;->f:I

    iget v1, p0, Lcom/roidapp/photogrid/cloud/m;->g:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1620
    :try_start_0
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 1621
    const/4 v5, 0x1

    iput-boolean v5, v1, Landroid/graphics/BitmapFactory$Options;->inPurgeable:Z

    .line 1622
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v5, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 1623
    iget v5, p0, Lcom/roidapp/photogrid/cloud/m;->h:I

    iput v5, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 1625
    iget-object v5, p0, Lcom/roidapp/photogrid/cloud/m;->b:Ljava/lang/String;

    invoke-static {v5, v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1b
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v8

    .line 1627
    :try_start_1
    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 1628
    iget v5, p0, Lcom/roidapp/photogrid/cloud/m;->f:I

    sub-int v5, v0, v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    iput v5, v1, Landroid/graphics/RectF;->left:F

    .line 1629
    iget v5, p0, Lcom/roidapp/photogrid/cloud/m;->g:I

    sub-int v5, v0, v5

    div-int/lit8 v5, v5, 0x2

    int-to-float v5, v5

    iput v5, v1, Landroid/graphics/RectF;->top:F

    .line 1630
    iget v5, v1, Landroid/graphics/RectF;->left:F

    iget v7, p0, Lcom/roidapp/photogrid/cloud/m;->f:I

    int-to-float v7, v7

    add-float/2addr v5, v7

    iput v5, v1, Landroid/graphics/RectF;->right:F

    .line 1631
    iget v5, v1, Landroid/graphics/RectF;->top:F

    iget v7, p0, Lcom/roidapp/photogrid/cloud/m;->g:I

    int-to-float v7, v7

    add-float/2addr v5, v7

    iput v5, v1, Landroid/graphics/RectF;->bottom:F

    .line 1633
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v5}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1c
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_19
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v7

    .line 1634
    :try_start_2
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1635
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 1636
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 1637
    const/4 v5, -0x1

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 1638
    const/4 v5, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v8, v5, v1, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 1640
    if-eq v8, v7, :cond_2

    .line 1641
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 1644
    :cond_2
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v0

    if-eqz v0, :cond_5

    move v5, v3

    .line 1646
    :goto_1
    new-instance v9, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->c:Ljava/lang/String;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1647
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v9}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_14

    .line 1648
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/r;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1a
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1649
    if-nez v0, :cond_6

    .line 1713
    if-eqz v8, :cond_4

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1715
    :try_start_3
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_c

    .line 1719
    :cond_4
    :goto_2
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1721
    :try_start_4
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_0

    .line 1644
    :cond_5
    const/4 v5, 0x2

    goto :goto_1

    .line 1652
    :cond_6
    :try_start_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x13

    if-ne v1, v10, :cond_10

    .line 1653
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->b(Lcom/roidapp/photogrid/cloud/r;)Ljava/lang/ref/WeakReference;
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1a
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    move-result-object v1

    if-nez v1, :cond_8

    move-object v10, v6

    .line 1654
    :goto_3
    if-nez v10, :cond_9

    .line 1713
    if-eqz v8, :cond_7

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_7

    .line 1715
    :try_start_6
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_d

    .line 1719
    :cond_7
    :goto_4
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1721
    :try_start_7
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_0

    :catch_1
    move-exception v0

    goto/16 :goto_0

    .line 1653
    :cond_8
    :try_start_8
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->b(Lcom/roidapp/photogrid/cloud/r;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/cloud/BaseShareActivity;
    :try_end_8
    .catch Ljava/lang/OutOfMemoryError; {:try_start_8 .. :try_end_8} :catch_6
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1a
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-object v10, v1

    goto :goto_3

    .line 1658
    :cond_9
    :try_start_9
    new-instance v1, Lcom/roidapp/photogrid/common/ae;

    invoke-virtual {v10}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v11

    invoke-direct {v1, v11, v9}, Lcom/roidapp/photogrid/common/ae;-><init>(Landroid/content/ContentResolver;Ljava/io/File;)V

    .line 1659
    invoke-virtual {v1}, Lcom/roidapp/photogrid/common/ae;->b()Ljava/io/OutputStream;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    move-result-object v6

    .line 1660
    if-nez v6, :cond_d

    .line 1661
    :try_start_a
    new-instance v1, Ljava/io/IOException;

    const-string v9, "4.4 IOException"

    invoke-direct {v1, v9}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_a .. :try_end_a} :catch_1d
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 1664
    :catch_2
    move-exception v1

    :try_start_b
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 1665
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v9, "/"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v9, 0x7f07002e

    invoke-virtual {v10, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 1666
    new-instance v1, Ljava/io/File;

    iget-object v11, p0, Lcom/roidapp/photogrid/cloud/m;->d:Ljava/lang/String;

    invoke-direct {v1, v9, v11}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/OutOfMemoryError; {:try_start_b .. :try_end_b} :catch_1d
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1a
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1668
    :try_start_c
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_c .. :try_end_c} :catch_1d
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 1674
    :try_start_d
    invoke-static {v10, v9}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1675
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_d
    .catch Ljava/lang/OutOfMemoryError; {:try_start_d .. :try_end_d} :catch_1d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1a
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    move-object v6, v0

    .line 1690
    :goto_5
    if-ne v5, v3, :cond_15

    :try_start_e
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    :goto_6
    const/16 v9, 0x64

    invoke-virtual {v7, v0, v9, v6}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 1692
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
    :try_end_e
    .catch Ljava/lang/OutOfMemoryError; {:try_start_e .. :try_end_e} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1a
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    move-result-object v0

    .line 1713
    :goto_7
    if-eqz v8, :cond_a

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_a

    .line 1715
    :try_start_f
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_10

    .line 1719
    :cond_a
    :goto_8
    if-eqz v7, :cond_b

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_b

    .line 1721
    :try_start_10
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_11

    .line 1725
    :cond_b
    :goto_9
    if-eqz v6, :cond_1c

    .line 1727
    :try_start_11
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_8

    move v1, v3

    move v2, v5

    move-object v3, v0

    .line 1735
    :goto_a
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/r;

    .line 1736
    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->a(Lcom/roidapp/photogrid/cloud/r;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 1738
    if-eqz v1, :cond_c

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->b(Lcom/roidapp/photogrid/cloud/r;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 1740
    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->b(Lcom/roidapp/photogrid/cloud/r;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    .line 1741
    if-eqz v1, :cond_c

    .line 1743
    :try_start_12
    new-instance v5, Landroid/content/Intent;

    const-string v6, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_18

    .line 1750
    :cond_c
    :goto_b
    invoke-virtual {v0, v12, v2, v4, v3}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    goto/16 :goto_0

    :cond_d
    move-object v1, v9

    .line 1676
    goto :goto_5

    .line 1670
    :catch_3
    move-exception v1

    :try_start_13
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 1671
    const v1, 0xcc03

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v5, v3, v2}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_13
    .catch Ljava/lang/OutOfMemoryError; {:try_start_13 .. :try_end_13} :catch_1d
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_1a
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    .line 1713
    if-eqz v8, :cond_e

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_e

    .line 1715
    :try_start_14
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_e

    .line 1719
    :cond_e
    :goto_c
    if-eqz v7, :cond_f

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_f

    .line 1721
    :try_start_15
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_f

    .line 1725
    :cond_f
    :goto_d
    if-eqz v6, :cond_0

    .line 1727
    :try_start_16
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_4

    goto/16 :goto_0

    .line 1729
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 1679
    :cond_10
    :try_start_17
    invoke-virtual {v9}, Ljava/io/File;->createNewFile()Z
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_17 .. :try_end_17} :catch_6
    .catchall {:try_start_17 .. :try_end_17} :catchall_2

    .line 1684
    :goto_e
    :try_start_18
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    move-object v1, v9

    .line 1686
    goto/16 :goto_5

    .line 1681
    :catch_5
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 1682
    const v1, 0xcc03

    const/4 v10, 0x0

    invoke-virtual {v0, v1, v5, v10, v2}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
    :try_end_18
    .catch Ljava/lang/OutOfMemoryError; {:try_start_18 .. :try_end_18} :catch_6
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_1a
    .catchall {:try_start_18 .. :try_end_18} :catchall_2

    goto :goto_e

    .line 1697
    :catch_6
    move-exception v0

    move-object v1, v8

    move-object v2, v6

    move-object v6, v7

    :goto_f
    :try_start_19
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    .line 1698
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/r;

    .line 1699
    if-eqz v0, :cond_11

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->a(Lcom/roidapp/photogrid/cloud/r;)Z

    move-result v3

    if-nez v3, :cond_11

    .line 1700
    const v3, 0xcc04

    invoke-virtual {v0, v3, p0}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    const-wide/16 v4, 0x64

    invoke-virtual {v0, v3, v4, v5}, Lcom/roidapp/photogrid/cloud/r;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    .line 1713
    :cond_11
    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_12

    .line 1715
    :try_start_1a
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_12

    .line 1719
    :cond_12
    :goto_10
    if-eqz v6, :cond_13

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_13

    .line 1721
    :try_start_1b
    invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_13

    .line 1725
    :cond_13
    :goto_11
    if-eqz v2, :cond_0

    .line 1727
    :try_start_1c
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_7

    goto/16 :goto_0

    .line 1729
    :catch_7
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 1687
    :cond_14
    :try_start_1d
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1d
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1d .. :try_end_1d} :catch_6
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1a
    .catchall {:try_start_1d .. :try_end_1d} :catchall_2

    move-object v6, v0

    move-object v1, v9

    goto/16 :goto_5

    .line 1690
    :cond_15
    :try_start_1e
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;
    :try_end_1e
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1e .. :try_end_1e} :catch_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1a
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    goto/16 :goto_6

    .line 1729
    :catch_8
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    move v1, v3

    move v2, v5

    move-object v3, v0

    .line 1730
    goto/16 :goto_a

    .line 1705
    :catch_9
    move-exception v0

    move-object v7, v6

    move-object v8, v6

    :goto_12
    :try_start_1f
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    .line 1706
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/m;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/cloud/r;

    .line 1707
    if-eqz v0, :cond_16

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/r;->a(Lcom/roidapp/photogrid/cloud/r;)Z

    move-result v1

    if-nez v1, :cond_16

    .line 1708
    const v1, 0xcc04

    invoke-virtual {v0, v1, p0}, Lcom/roidapp/photogrid/cloud/r;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/cloud/r;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_2

    .line 1713
    :cond_16
    if-eqz v8, :cond_17

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_17

    .line 1715
    :try_start_20
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_14

    .line 1719
    :cond_17
    :goto_13
    if-eqz v7, :cond_18

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_18

    .line 1721
    :try_start_21
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_15

    .line 1725
    :cond_18
    :goto_14
    if-eqz v6, :cond_0

    .line 1727
    :try_start_22
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_a

    goto/16 :goto_0

    .line 1729
    :catch_a
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 1713
    :catchall_0
    move-exception v0

    move-object v7, v6

    move-object v8, v6

    :goto_15
    if-eqz v8, :cond_19

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_19

    .line 1715
    :try_start_23
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_16

    .line 1719
    :cond_19
    :goto_16
    if-eqz v7, :cond_1a

    invoke-virtual {v7}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1a

    .line 1721
    :try_start_24
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_17

    .line 1725
    :cond_1a
    :goto_17
    if-eqz v6, :cond_1b

    .line 1727
    :try_start_25
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_b

    .line 1730
    :cond_1b
    :goto_18
    throw v0

    .line 1729
    :catch_b
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_18

    :catch_c
    move-exception v0

    goto/16 :goto_2

    :catch_d
    move-exception v0

    goto/16 :goto_4

    :catch_e
    move-exception v0

    goto/16 :goto_c

    :catch_f
    move-exception v0

    goto/16 :goto_d

    :catch_10
    move-exception v1

    goto/16 :goto_8

    :catch_11
    move-exception v1

    goto/16 :goto_9

    :catch_12
    move-exception v0

    goto/16 :goto_10

    :catch_13
    move-exception v0

    goto/16 :goto_11

    :catch_14
    move-exception v0

    goto :goto_13

    :catch_15
    move-exception v0

    goto :goto_14

    :catch_16
    move-exception v1

    goto :goto_16

    :catch_17
    move-exception v1

    goto :goto_17

    :catch_18
    move-exception v1

    goto/16 :goto_b

    .line 1713
    :catchall_1
    move-exception v0

    move-object v7, v6

    goto :goto_15

    :catchall_2
    move-exception v0

    goto :goto_15

    :catchall_3
    move-exception v0

    move-object v7, v6

    move-object v8, v1

    move-object v6, v2

    goto :goto_15

    .line 1705
    :catch_19
    move-exception v0

    move-object v7, v6

    goto/16 :goto_12

    :catch_1a
    move-exception v0

    goto/16 :goto_12

    .line 1697
    :catch_1b
    move-exception v0

    move-object v1, v6

    move-object v2, v6

    goto/16 :goto_f

    :catch_1c
    move-exception v0

    move-object v1, v8

    move-object v2, v6

    goto/16 :goto_f

    :catch_1d
    move-exception v0

    move-object v1, v8

    move-object v2, v6

    move-object v6, v7

    goto/16 :goto_f

    :catch_1e
    move-exception v0

    move-object v1, v8

    move-object v2, v6

    move-object v6, v7

    goto/16 :goto_f

    :cond_1c
    move v1, v3

    move v2, v5

    move-object v3, v0

    goto/16 :goto_a

    :cond_1d
    move-object v0, v2

    goto/16 :goto_7

    :cond_1e
    move v1, v4

    move-object v3, v2

    move v2, v0

    goto/16 :goto_a
.end method
