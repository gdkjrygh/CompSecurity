.class final Lcom/roidapp/photogrid/video/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/e/b;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/video/q;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/q;I)V
    .locals 0

    .prologue
    .line 1636
    iput-object p1, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    iput p2, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 1639
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1640
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-interface {v0, v1, p1}, Lcom/roidapp/photogrid/video/ab;->a(II)V

    .line 1641
    :cond_0
    return-void
.end method

.method public final a(ILjava/lang/Exception;)V
    .locals 4

    .prologue
    .line 1683
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->l(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/a;

    .line 1684
    if-eqz v0, :cond_0

    .line 1685
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/a;->a()V

    .line 1687
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->l(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1688
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 1689
    if-eqz v0, :cond_1

    .line 1690
    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1691
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/q;->m(Lcom/roidapp/photogrid/video/q;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 1692
    new-instance v1, Ljava/io/File;

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1693
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1694
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1697
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1698
    sparse-switch p1, :sswitch_data_0

    .line 1709
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p2}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    .line 1715
    :cond_2
    :goto_0
    return-void

    .line 1700
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2, p2}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 1703
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x6

    invoke-interface {v0, v1, v2, p2}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 1706
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, p2}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 1698
    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_2
        0x190 -> :sswitch_0
        0x194 -> :sswitch_1
    .end sparse-switch
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1636
    check-cast p1, Ljava/lang/String;

    .line 2647
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->l(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/a;

    .line 2648
    if-eqz v0, :cond_0

    .line 2649
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/a;->a()V

    .line 2651
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->l(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2652
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 2653
    if-eqz v0, :cond_4

    .line 2654
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2655
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {p1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 2656
    iput-object p1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 2657
    iget-object v1, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    iget v2, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-static {v1, v2, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 2658
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/lang/String;)V

    .line 2659
    iget-object v1, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V

    .line 2660
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2661
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    invoke-interface {v0, v1, p1}, Lcom/roidapp/photogrid/video/ab;->a(ILjava/lang/String;)V

    .line 2670
    :cond_1
    :goto_0
    return-void

    .line 2664
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2665
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2666
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x3

    invoke-interface {v0, v1, v2, v4}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 2668
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x5

    invoke-interface {v0, v1, v2, v4}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 2675
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2676
    iget-object v0, p0, Lcom/roidapp/photogrid/video/y;->b:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/y;->a:I

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v4}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0
.end method
