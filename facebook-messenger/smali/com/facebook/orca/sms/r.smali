.class Lcom/facebook/orca/sms/r;
.super Ljava/lang/Object;
.source "MmsContentResolverHandler.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Landroid/net/Uri;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/orca/sms/bk;

.field private final e:Lcom/facebook/ui/media/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 66
    const-class v0, Lcom/facebook/orca/sms/r;

    sput-object v0, Lcom/facebook/orca/sms/r;->a:Ljava/lang/Class;

    .line 69
    const-string v0, "content://mms/part"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/sms/r;->b:Landroid/net/Uri;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/facebook/orca/sms/bk;Lcom/facebook/ui/media/b/a;)V
    .locals 0

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    iput-object p1, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    .line 98
    iput-object p2, p0, Lcom/facebook/orca/sms/r;->d:Lcom/facebook/orca/sms/bk;

    .line 99
    iput-object p3, p0, Lcom/facebook/orca/sms/r;->e:Lcom/facebook/ui/media/b/a;

    .line 100
    return-void
.end method

.method private a(Lcom/facebook/messages/model/threads/Message;)Landroid_src/mms/e/j;
    .locals 11

    .prologue
    .line 704
    new-instance v4, Landroid_src/mms/e/j;

    invoke-direct {v4}, Landroid_src/mms/e/j;-><init>()V

    .line 705
    const/4 v2, 0x1

    .line 710
    invoke-static {}, Landroid_src/mms/c;->j()I

    move-result v0

    invoke-static {}, Landroid_src/mms/c;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 711
    invoke-static {}, Landroid_src/mms/c;->b()I

    move-result v0

    add-int/lit16 v1, v0, -0x1388

    .line 712
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    .line 713
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->B()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v3, v2

    move v2, v1

    move v1, v0

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/MediaResource;

    .line 714
    div-int v7, v2, v1

    .line 715
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v8

    sget-object v9, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v8, v9}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 716
    new-instance v8, Landroid_src/mms/e/s;

    invoke-direct {v8}, Landroid_src/mms/e/s;-><init>()V

    .line 717
    new-instance v9, Lcom/facebook/ui/media/attachments/a;

    iget-object v10, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-direct {v9, v10, v0}, Lcom/facebook/ui/media/attachments/a;-><init>(Landroid/content/Context;Lcom/facebook/ui/media/attachments/MediaResource;)V

    .line 718
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->e:Lcom/facebook/ui/media/b/a;

    invoke-virtual {v0, v9, v5, v5, v7}, Lcom/facebook/ui/media/b/a;->a(Lcom/facebook/ui/media/attachments/a;III)[B

    move-result-object v0

    .line 724
    array-length v7, v0

    .line 725
    invoke-virtual {v8, v0}, Landroid_src/mms/e/s;->a([B)V

    .line 726
    const-string v0, "image/jpeg"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid_src/mms/e/s;->e([B)V

    .line 727
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "IMG_"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, "_"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, ".jpg"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid_src/mms/e/s;->c([B)V

    .line 728
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "IMG_"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, "_"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid_src/mms/e/s;->b([B)V

    .line 730
    invoke-virtual {v4, v8}, Landroid_src/mms/e/j;->a(Landroid_src/mms/e/s;)Z

    .line 731
    sub-int/2addr v2, v7

    .line 737
    :cond_0
    :goto_1
    add-int/lit8 v0, v1, -0x1

    .line 738
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    .line 739
    goto/16 :goto_0

    .line 732
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v7

    sget-object v8, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v7, v8}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 734
    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/MediaResource;->c()Lcom/facebook/ui/media/attachments/g;

    move-result-object v0

    sget-object v7, Lcom/facebook/ui/media/attachments/g;->VIDEO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v0, v7}, Lcom/facebook/ui/media/attachments/g;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 742
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 743
    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v3, 0x1

    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;I)Landroid_src/mms/e/s;

    move-result-object v0

    .line 744
    invoke-virtual {v4, v0}, Landroid_src/mms/e/j;->a(Landroid_src/mms/e/s;)Z

    .line 748
    :cond_3
    invoke-static {v4}, Landroid_src/mms/d/a;->a(Landroid_src/mms/e/j;)Lorg/a/a/b/f;

    move-result-object v0

    .line 749
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 750
    invoke-static {v0, v1}, Landroid_src/mms/a/b/a/c;->a(Lorg/a/a/b/f;Ljava/io/OutputStream;)V

    .line 751
    new-instance v0, Landroid_src/mms/e/s;

    invoke-direct {v0}, Landroid_src/mms/e/s;-><init>()V

    .line 752
    const-string v2, "smil"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid_src/mms/e/s;->b([B)V

    .line 753
    const-string v2, "smil.xml"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid_src/mms/e/s;->c([B)V

    .line 754
    const-string v2, "application/smil"

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid_src/mms/e/s;->e([B)V

    .line 755
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->a([B)V

    .line 756
    const/4 v1, 0x0

    invoke-virtual {v4, v1, v0}, Landroid_src/mms/e/j;->a(ILandroid_src/mms/e/s;)V

    .line 758
    return-object v4
.end method

.method private a(Ljava/lang/String;I)Landroid_src/mms/e/s;
    .locals 3

    .prologue
    .line 768
    new-instance v0, Landroid_src/mms/e/s;

    invoke-direct {v0}, Landroid_src/mms/e/s;-><init>()V

    .line 769
    const/16 v1, 0x6a

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->a(I)V

    .line 770
    const-string v1, "text/plain"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->e([B)V

    .line 771
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "text_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".txt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->c([B)V

    .line 772
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "text_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->b([B)V

    .line 773
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/s;->a([B)V

    .line 774
    return-object v0
.end method

.method private a(Ljava/util/Set;)Landroid_src/mms/e/z;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)",
            "Landroid_src/mms/e/z;"
        }
    .end annotation

    .prologue
    .line 679
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 680
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 681
    invoke-static {v0}, Landroid_src/mms/f/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 682
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 683
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 686
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 687
    new-instance v1, Landroid_src/mms/e/z;

    invoke-direct {v1}, Landroid_src/mms/e/z;-><init>()V

    .line 688
    invoke-static {v0}, Landroid_src/mms/e/e;->a([Ljava/lang/String;)[Landroid_src/mms/e/e;

    move-result-object v0

    .line 689
    if-eqz v0, :cond_2

    .line 690
    invoke-virtual {v1, v0}, Landroid_src/mms/e/z;->a([Landroid_src/mms/e/e;)V

    .line 692
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Landroid_src/mms/e/z;->a(J)V

    .line 693
    return-object v1
.end method

.method private a(Landroid/database/Cursor;Lcom/google/common/a/ex;)Lcom/facebook/messages/model/threads/Message;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/Cursor;",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/Long;",
            "Lcom/facebook/orca/sms/s;",
            ">;)",
            "Lcom/facebook/messages/model/threads/Message;"
        }
    .end annotation

    .prologue
    .line 405
    const-string v1, "thread_id"

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    .line 406
    const-string v3, "_id"

    move-object/from16 v0, p1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    move-object/from16 v0, p1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    .line 407
    const-string v5, "sub"

    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    move-object/from16 v0, p1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 408
    invoke-static {v1, v2}, Lcom/facebook/orca/threads/m;->a(J)Ljava/lang/String;

    move-result-object v2

    .line 409
    invoke-static {v3, v4}, Lcom/facebook/orca/threads/m;->c(J)Ljava/lang/String;

    move-result-object v6

    .line 410
    const-string v1, "date"

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    mul-long/2addr v7, v9

    .line 411
    const-wide/32 v9, 0xf4240

    mul-long/2addr v9, v7

    .line 413
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v0, p2

    invoke-virtual {v0, v1}, Lcom/google/common/a/ex;->e(Ljava/lang/Object;)Lcom/google/common/a/em;

    move-result-object v1

    .line 414
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v11

    .line 415
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v12

    .line 416
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/sms/s;

    .line 417
    iget-object v14, v1, Lcom/facebook/orca/sms/s;->b:Lcom/facebook/ui/media/attachments/MediaResource;

    if-eqz v14, :cond_1

    .line 418
    iget-object v1, v1, Lcom/facebook/orca/sms/s;->b:Lcom/facebook/ui/media/attachments/MediaResource;

    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 419
    :cond_1
    iget-object v14, v1, Lcom/facebook/orca/sms/s;->a:Ljava/lang/String;

    invoke-static {v14}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_0

    .line 420
    iget-object v1, v1, Lcom/facebook/orca/sms/s;->a:Ljava/lang/String;

    invoke-interface {v11, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 423
    :cond_2
    const-string v1, "\n\n"

    invoke-static {v1}, Lcom/google/common/base/Joiner;->on(Ljava/lang/String;)Lcom/google/common/base/Joiner;

    move-result-object v1

    invoke-virtual {v1, v11}, Lcom/google/common/base/Joiner;->join(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v11

    .line 425
    const-string v1, "msg_box"

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v13

    .line 426
    const/4 v1, 0x0

    .line 427
    const/4 v14, 0x0

    .line 428
    const/4 v15, 0x2

    if-ne v13, v15, :cond_4

    .line 429
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/sms/r;->d:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v1}, Lcom/facebook/orca/sms/bk;->a()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    .line 434
    :cond_3
    :goto_1
    new-instance v3, Lcom/facebook/messages/model/threads/e;

    invoke-direct {v3}, Lcom/facebook/messages/model/threads/e;-><init>()V

    invoke-virtual {v3, v6}, Lcom/facebook/messages/model/threads/e;->a(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/facebook/messages/model/threads/e;->b(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v14}, Lcom/facebook/messages/model/threads/e;->a(I)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/facebook/messages/model/threads/e;->c(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/facebook/messages/model/threads/e;->d(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Lcom/facebook/messages/model/threads/e;->a(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Lcom/facebook/messages/model/threads/e;->c(J)Lcom/facebook/messages/model/threads/e;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1, v12}, Lcom/facebook/messages/model/threads/e;->a(Ljava/util/List;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Z)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    const-string v2, "mms"

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->f(Ljava/lang/String;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/messages/model/threads/c;->MMS:Lcom/facebook/messages/model/threads/c;

    invoke-virtual {v1, v2}, Lcom/facebook/messages/model/threads/e;->a(Lcom/facebook/messages/model/threads/c;)Lcom/facebook/messages/model/threads/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/e;->B()Lcom/facebook/messages/model/threads/Message;

    move-result-object v1

    return-object v1

    .line 430
    :cond_4
    const/4 v15, 0x1

    if-ne v13, v15, :cond_3

    .line 431
    move-object/from16 v0, p0

    invoke-direct {v0, v3, v4}, Lcom/facebook/orca/sms/r;->c(J)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    goto :goto_1
.end method

.method static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 301
    invoke-static {p0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 303
    const-string v0, "SELECT MAX(date)*1000 AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM pdu WHERE %1$s GROUP BY thread_id"

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "m_type IN (128, 132) AND msg_box IN (1, 2)"

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 307
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "SELECT MAX(date)*1000 AS normalized_date, thread_id AS thread_id, MAX(_id) AS _id FROM pdu WHERE %1$s GROUP BY thread_id"

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "m_type IN (128, 132) AND msg_box IN (1, 2) AND "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v4

    invoke-static {v0, v1}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .prologue
    .line 596
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://mms/part/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 598
    const-string v1, ""

    .line 600
    :try_start_0
    iget-object v2, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 602
    :try_start_1
    new-instance v0, Ljava/io/InputStreamReader;

    invoke-direct {v0, v2, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 603
    invoke-static {v0}, Lcom/google/common/b/b;->a(Ljava/lang/Readable;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 605
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 610
    :goto_0
    return-object v0

    .line 605
    :catchall_0
    move-exception v0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 607
    :catch_0
    move-exception v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    .line 608
    :goto_1
    sget-object v2, Lcom/facebook/orca/sms/r;->a:Ljava/lang/Class;

    const-string v3, "Opening MMS Part input stream failed"

    invoke-static {v2, v3, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 607
    :catch_1
    move-exception v1

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 274
    if-nez p2, :cond_0

    .line 275
    const-string v0, ""

    .line 279
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_id IN (SELECT mms._id FROM ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") mms "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "LEFT JOIN "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p1}, Lcom/facebook/orca/sms/bn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ") sms "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "ON sms.thread_id=mms.thread_id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "WHERE "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(sms.normalized_date<mms.normalized_date OR sms.normalized_date IS NULL) "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "ORDER BY mms.normalized_date DESC "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "LIMIT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 277
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " AND "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private a(Landroid_src/mms/e/z;)V
    .locals 3

    .prologue
    const/16 v2, 0x81

    .line 644
    const-wide/32 v0, 0x93a80

    invoke-virtual {p1, v0, v1}, Landroid_src/mms/e/z;->b(J)V

    .line 645
    invoke-virtual {p1, v2}, Landroid_src/mms/e/z;->c(I)V

    .line 646
    invoke-virtual {p1, v2}, Landroid_src/mms/e/z;->d(I)V

    .line 647
    invoke-virtual {p1, v2}, Landroid_src/mms/e/z;->e(I)V

    .line 648
    return-void
.end method

.method private b(Ljava/lang/String;)Lcom/google/common/a/es;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 140
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v10

    .line 143
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/d;->a:Landroid/net/Uri;

    sget-object v3, Lcom/facebook/orca/sms/bh;->e:[Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "date DESC"

    move-object/from16 v4, p1

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    .line 151
    :try_start_0
    const-string v1, "thread_id"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 152
    const-string v1, "_id"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 153
    const-string v1, "date"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 154
    const-string v1, "read"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 155
    const-string v1, "sub"

    invoke-interface {v11, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 156
    :goto_0
    invoke-interface {v11}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 157
    invoke-interface {v11, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 158
    invoke-interface {v11, v13}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    .line 159
    invoke-interface {v11, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const-wide/16 v8, 0x3e8

    mul-long/2addr v6, v8

    .line 160
    invoke-interface {v11, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    .line 161
    move/from16 v0, v16

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 163
    new-instance v1, Lcom/facebook/orca/sms/f;

    if-nez v8, :cond_0

    const/4 v8, 0x1

    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/facebook/orca/sms/f;-><init>(JJJZLjava/lang/String;)V

    .line 171
    invoke-virtual {v10, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 174
    :catchall_0
    move-exception v1

    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    throw v1

    .line 163
    :cond_0
    const/4 v8, 0x0

    goto :goto_1

    .line 174
    :cond_1
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 176
    invoke-virtual {v10}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    return-object v1
.end method

.method private b(Lcom/facebook/orca/sms/c;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 189
    const-string v1, "mms.normalized_date"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 191
    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->b()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 197
    :goto_0
    const/4 v1, 0x0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->a()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 194
    :cond_0
    const-string v1, "<="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    invoke-virtual {p1}, Lcom/facebook/orca/sms/c;->c()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0
.end method

.method private c(J)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 614
    const-string v3, "type=137"

    .line 615
    sget-object v0, Landroid_src/c/d;->a:Landroid/net/Uri;

    invoke-static {v0, p1, p2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "addr"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 617
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 625
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 626
    const-string v0, "address"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 627
    iget-object v2, p0, Lcom/facebook/orca/sms/r;->d:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/bk;->a(Ljava/lang/String;)Lcom/facebook/user/User;

    move-result-object v0

    .line 628
    iget-object v2, p0, Lcom/facebook/orca/sms/r;->d:Lcom/facebook/orca/sms/bk;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/sms/bk;->a(Lcom/facebook/user/User;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 631
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 633
    :goto_0
    return-object v2

    .line 631
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0
.end method

.method private c(Ljava/util/List;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .prologue
    .line 212
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "thread_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 213
    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/util/List;)Lcom/google/common/a/ex;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/ex",
            "<",
            "Ljava/lang/Long;",
            "Lcom/facebook/orca/sms/s;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 534
    invoke-static {}, Lcom/google/common/a/ex;->j()Lcom/google/common/a/ey;

    move-result-object v6

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mid IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 537
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/sms/r;->b:Landroid/net/Uri;

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 545
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 546
    const-string v0, "mid"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    .line 547
    const-string v0, "ct"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 548
    const-string v0, "name"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 549
    const-string v0, "fn"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 550
    const-string v0, "_id"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 551
    const-string v0, "chset"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 552
    const-string v0, "_data"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 553
    const-string v0, "text"

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 555
    invoke-static {}, Lcom/facebook/ui/media/attachments/MediaResource;->a()Lcom/facebook/ui/media/attachments/f;

    move-result-object v12

    .line 557
    const-string v13, "text/plain"

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3

    .line 559
    if-eqz v11, :cond_1

    .line 560
    invoke-direct {p0, v9, v10}, Lcom/facebook/orca/sms/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 564
    :cond_1
    invoke-static {v0}, Lcom/facebook/orca/sms/s;->a(Ljava/lang/String;)Lcom/facebook/orca/sms/s;

    move-result-object v0

    .line 576
    :goto_1
    invoke-virtual {v12}, Lcom/facebook/ui/media/attachments/f;->b()Lcom/facebook/ui/media/attachments/g;

    move-result-object v10

    if-eqz v10, :cond_2

    .line 578
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "content://mms/part/"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v12, v0}, Lcom/facebook/ui/media/attachments/f;->a(Landroid/net/Uri;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/facebook/ui/media/attachments/f;->a(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v5

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    move-object v0, v1

    :goto_2
    invoke-virtual {v5, v0}, Lcom/facebook/ui/media/attachments/f;->b(Ljava/lang/String;)Lcom/facebook/ui/media/attachments/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/ui/media/attachments/f;->i()Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    .line 583
    invoke-static {v0}, Lcom/facebook/orca/sms/s;->a(Lcom/facebook/ui/media/attachments/MediaResource;)Lcom/facebook/orca/sms/s;

    move-result-object v0

    .line 585
    :cond_2
    if-eqz v0, :cond_0

    .line 586
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v6, v1, v0}, Lcom/google/common/a/ey;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ey;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 590
    :catchall_0
    move-exception v0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    throw v0

    .line 565
    :cond_3
    :try_start_1
    invoke-static {}, Landroid_src/mms/a;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 566
    sget-object v0, Lcom/facebook/ui/media/attachments/g;->PHOTO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v12, v0}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-object v0, v2

    goto :goto_1

    .line 567
    :cond_4
    invoke-static {}, Landroid_src/mms/a;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 568
    sget-object v0, Lcom/facebook/ui/media/attachments/g;->AUDIO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v12, v0}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-object v0, v2

    goto :goto_1

    .line 569
    :cond_5
    invoke-static {}, Landroid_src/mms/a;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 570
    sget-object v0, Lcom/facebook/ui/media/attachments/g;->VIDEO:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v12, v0}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;

    move-object v0, v2

    goto :goto_1

    .line 571
    :cond_6
    invoke-static {v5}, Landroid_src/mms/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 572
    sget-object v0, Lcom/facebook/ui/media/attachments/g;->TEXT:Lcom/facebook/ui/media/attachments/g;

    invoke-virtual {v12, v0}, Lcom/facebook/ui/media/attachments/f;->a(Lcom/facebook/ui/media/attachments/g;)Lcom/facebook/ui/media/attachments/f;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_7
    move-object v0, v2

    goto/16 :goto_1

    :cond_8
    move-object v0, v3

    .line 578
    goto :goto_2

    .line 590
    :cond_9
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 592
    invoke-virtual {v6}, Lcom/google/common/a/ey;->a()Lcom/google/common/a/ex;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a(Lcom/facebook/messages/model/threads/Message;Ljava/util/Set;)J
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/messages/model/threads/Message;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)J"
        }
    .end annotation

    .prologue
    .line 660
    invoke-direct {p0, p2}, Lcom/facebook/orca/sms/r;->a(Ljava/util/Set;)Landroid_src/mms/e/z;

    move-result-object v0

    .line 661
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/r;->a(Lcom/facebook/messages/model/threads/Message;)Landroid_src/mms/e/j;

    move-result-object v1

    .line 662
    invoke-virtual {v0, v1}, Landroid_src/mms/e/z;->a(Landroid_src/mms/e/j;)V

    .line 664
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/r;->a(Landroid_src/mms/e/z;)V

    .line 665
    const-string v1, "personal"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid_src/mms/e/z;->b([B)V

    .line 666
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Landroid_src/mms/e/z;->a(J)V

    .line 667
    iget-object v1, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-static {v1}, Landroid_src/mms/e/t;->a(Landroid/content/Context;)Landroid_src/mms/e/t;

    move-result-object v1

    .line 668
    sget-object v2, Landroid_src/c/g;->a:Landroid/net/Uri;

    invoke-virtual {v1, v0, v2}, Landroid_src/mms/e/t;->a(Landroid_src/mms/e/f;Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    .line 669
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method a(J)Lcom/facebook/messages/model/threads/Message;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 457
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Long;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/sms/r;->b(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v0

    .line 458
    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 459
    invoke-virtual {v0, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    .line 461
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/sms/b;)Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/b;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .prologue
    const-wide/16 v2, 0x3e8

    .line 351
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 354
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->c()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 355
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    div-long/2addr v0, v2

    .line 356
    const-string v2, "date"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/d/d/e;->c(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    .line 364
    :goto_0
    const/4 v1, 0x3

    new-array v1, v1, [Lcom/facebook/d/d/j;

    const/4 v2, 0x0

    const-string v3, "thread_id"

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->a()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "m_type IN (128, 132) AND msg_box IN (1, 2)"

    invoke-static {v3}, Lcom/facebook/d/d/e;->a(Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/facebook/d/d/e;->a([Lcom/facebook/d/d/j;)Lcom/facebook/d/d/f;

    move-result-object v4

    .line 369
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/d;->a:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/orca/sms/bh;->d:[Ljava/lang/String;

    invoke-virtual {v4}, Lcom/facebook/d/d/j;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4}, Lcom/facebook/d/d/j;->b()[Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "date DESC LIMIT "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->b()I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 377
    :try_start_0
    const-string v0, "_id"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 380
    :goto_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 381
    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    .line 382
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 385
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    .line 359
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/sms/b;->d()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    div-long/2addr v0, v2

    .line 360
    const-string v2, "date"

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/d/d/e;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/d/d/j;

    move-result-object v0

    goto/16 :goto_0

    .line 385
    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 387
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/facebook/orca/sms/c;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/sms/c;",
            ")",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/r;->b(Lcom/facebook/orca/sms/c;)Ljava/lang/String;

    move-result-object v0

    .line 114
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/r;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Lcom/google/common/a/es;)Lcom/google/common/a/es;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 324
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v3

    .line 326
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v1

    .line 327
    invoke-virtual {p1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    .line 328
    invoke-virtual {v0}, Lcom/facebook/orca/sms/f;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 330
    :cond_0
    invoke-virtual {p0, v1}, Lcom/facebook/orca/sms/r;->b(Ljava/util/List;)Lcom/google/common/a/es;

    move-result-object v4

    .line 331
    const/4 v0, 0x0

    move v2, v0

    :goto_1
    invoke-virtual {p1}, Lcom/google/common/a/es;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 332
    invoke-virtual {p1, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/sms/f;

    .line 333
    invoke-virtual {v4, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    .line 334
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-static {v0, v5, v1}, Lcom/facebook/orca/sms/f;->a(Lcom/facebook/orca/sms/f;Ljava/lang/String;Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/sms/f;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    .line 331
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 342
    :cond_1
    invoke-virtual {v3}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/sms/f;",
            ">;"
        }
    .end annotation

    .prologue
    .line 127
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/r;->c(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 128
    invoke-direct {p0, v0}, Lcom/facebook/orca/sms/r;->b(Ljava/lang/String;)Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method

.method a(Ljava/util/Collection;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 792
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 793
    const-string v1, "read"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 794
    iget-object v1, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    sget-object v2, Landroid_src/c/d;->a:Landroid/net/Uri;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "thread_id IN "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v0, v3, v4}, Landroid/content/ContentResolver;->update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 800
    return-void
.end method

.method b(Ljava/util/List;)Lcom/google/common/a/es;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/Long;",
            ">;)",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v4, 0x0

    .line 472
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 473
    invoke-static {}, Lcom/google/common/a/es;->d()Lcom/google/common/a/es;

    move-result-object v0

    .line 502
    :goto_0
    return-object v0

    .line 476
    :cond_0
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v6

    .line 479
    invoke-direct {p0, p1}, Lcom/facebook/orca/sms/r;->d(Ljava/util/List;)Lcom/google/common/a/ex;

    move-result-object v7

    .line 482
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "_id IN "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1}, Lcom/facebook/common/w/k;->a(Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Landroid_src/c/d;->a:Landroid/net/Uri;

    sget-object v2, Lcom/facebook/orca/sms/bh;->f:[Ljava/lang/String;

    move-object v5, v4

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    .line 491
    :goto_1
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 493
    :try_start_1
    invoke-direct {p0, v1, v7}, Lcom/facebook/orca/sms/r;->a(Landroid/database/Cursor;Lcom/google/common/a/ex;)Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    .line 494
    invoke-virtual {v6, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;
    :try_end_1
    .catch Landroid_src/mms/d; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 495
    :catch_0
    move-exception v0

    .line 496
    :try_start_2
    sget-object v2, Lcom/facebook/orca/sms/r;->a:Ljava/lang/Class;

    const-string v3, "Error making Mms message"

    invoke-static {v2, v3, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    .line 500
    :catchall_0
    move-exception v0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    throw v0

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 502
    invoke-virtual {v6}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    goto :goto_0
.end method

.method b(J)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 778
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "content://mms/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 779
    const-string v1, "part"

    invoke-static {v0, v1}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 780
    const-string v2, "addr"

    invoke-static {v0, v2}, Landroid/net/Uri;->withAppendedPath(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 782
    iget-object v3, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v0, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 783
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v1, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 784
    iget-object v0, p0, Lcom/facebook/orca/sms/r;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, v2, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    .line 785
    return-void
.end method
