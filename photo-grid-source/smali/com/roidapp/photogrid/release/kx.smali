.class final Lcom/roidapp/photogrid/release/kx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/kt;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kt;I)V
    .locals 0

    .prologue
    .line 542
    iput-object p1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    iput p2, p0, Lcom/roidapp/photogrid/release/kx;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .prologue
    const-wide/16 v12, 0x5000

    const/4 v8, 0x0

    const/16 v9, 0x1b

    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 546
    new-array v2, v7, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v2, v6

    .line 551
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v1, "%s >= ?"

    new-array v3, v7, [Ljava/lang/Object;

    const-string v4, "date_modified"

    aput-object v4, v3, v6

    invoke-static {v0, v1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 552
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide v4, 0x134fd9000L

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    div-long/2addr v0, v4

    .line 553
    new-array v4, v7, [Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v4, v6

    .line 560
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "date_modified desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    move-result-object v0

    move v1, v6

    .line 566
    :goto_0
    if-eqz v1, :cond_0

    .line 568
    const-wide/16 v0, 0xbb8

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3

    .line 573
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const-string v5, "date_modified desc"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v0

    .line 581
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x3c

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 582
    if-eqz v0, :cond_9

    .line 584
    :try_start_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x3d

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 585
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    if-lez v1, :cond_7

    .line 587
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 588
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v4

    move v2, v6

    .line 592
    :cond_1
    :goto_2
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    move-result v1

    if-eqz v1, :cond_5

    .line 595
    const/16 v1, 0xc8

    if-gt v2, v1, :cond_5

    .line 599
    const/4 v1, 0x0

    :try_start_4
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 600
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 604
    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    .line 605
    const-string v6, "/mnt"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 606
    const-string v6, "mnt"

    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 607
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v6, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 612
    :cond_2
    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 613
    if-eqz v5, :cond_1

    .line 617
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 620
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 621
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v6}, Ljava/io/File;->length()J
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result-wide v10

    cmp-long v5, v10, v12

    if-lez v5, :cond_1

    .line 623
    :try_start_5
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 624
    const/4 v7, 0x1

    iput-boolean v7, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 625
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 626
    iget v7, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v7, :cond_1

    iget v5, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    if-lez v5, :cond_1

    .line 639
    :cond_3
    :try_start_6
    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    cmp-long v5, v6, v12

    if-lez v5, :cond_1

    .line 643
    add-int/lit8 v2, v2, 0x1

    .line 646
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    goto/16 :goto_2

    .line 650
    :catch_0
    move-exception v1

    .line 651
    :try_start_7
    iget-object v5, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v6, 0x4b

    invoke-static {v5, v6}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 652
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    goto/16 :goto_2

    .line 686
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 687
    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_4

    .line 688
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 690
    :cond_4
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 691
    iput v9, v0, Landroid/os/Message;->what:I

    .line 692
    iget v1, p0, Lcom/roidapp/photogrid/release/kx;->a:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 693
    iput-object v8, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 694
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 704
    :goto_3
    return-void

    .line 563
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v1, v7

    move-object v0, v8

    .line 564
    goto/16 :goto_0

    .line 570
    :catch_3
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto/16 :goto_1

    .line 576
    :catch_4
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 577
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_3

    .line 630
    :catch_5
    move-exception v1

    :try_start_8
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    goto/16 :goto_2

    .line 656
    :cond_5
    if-eqz v0, :cond_6

    :try_start_9
    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_6

    .line 657
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x4c

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 658
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 660
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x50

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 663
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 664
    const-string v2, "pics"

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 665
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v3, 0x57

    invoke-static {v2, v3}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 666
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v2

    .line 667
    const/16 v3, 0x1b

    iput v3, v2, Landroid/os/Message;->what:I

    .line 668
    iget v3, p0, Lcom/roidapp/photogrid/release/kx;->a:I

    iput v3, v2, Landroid/os/Message;->arg1:I

    .line 669
    iput-object v1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 670
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_3

    .line 674
    :cond_7
    if-eqz v0, :cond_8

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_8

    .line 675
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x58

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    .line 676
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 678
    :cond_8
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 679
    const/16 v2, 0x1b

    iput v2, v1, Landroid/os/Message;->what:I

    .line 680
    iget v2, p0, Lcom/roidapp/photogrid/release/kx;->a:I

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 681
    const/4 v2, 0x0

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 682
    iget-object v2, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 683
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v2, 0x59

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    goto/16 :goto_3

    .line 697
    :cond_9
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 698
    iput v9, v0, Landroid/os/Message;->what:I

    .line 699
    iget v1, p0, Lcom/roidapp/photogrid/release/kx;->a:I

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 700
    iput-object v8, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 701
    iget-object v1, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/kt;->b(Lcom/roidapp/photogrid/release/kt;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 702
    iget-object v0, p0, Lcom/roidapp/photogrid/release/kx;->b:Lcom/roidapp/photogrid/release/kt;

    const/16 v1, 0x5a

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/kt;->a(Lcom/roidapp/photogrid/release/kt;I)V

    goto/16 :goto_3
.end method
