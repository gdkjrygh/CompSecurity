.class final Lcom/roidapp/photogrid/video/ae;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 117
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 6

    .prologue
    const/4 v2, 0x3

    const/4 v1, 0x2

    const/16 v5, 0x8

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 119
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    .line 246
    :cond_0
    :goto_0
    :sswitch_0
    return-void

    .line 121
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 123
    :cond_1
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-nez v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/16 v1, 0x5003

    invoke-static {v0, v1, v4}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;IZ)V

    goto :goto_0

    .line 126
    :cond_2
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v1, :cond_3

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0701c4

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 128
    :cond_3
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v2, :cond_4

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0702f6

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 130
    :cond_4
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_5

    .line 131
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070137

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 132
    :cond_5
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_6

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0702f5

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 134
    :cond_6
    iget v0, p1, Landroid/os/Message;->arg2:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0702f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 141
    :sswitch_2
    const-string v0, "online music"

    .line 142
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v1, :cond_e

    .line 143
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " By "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 146
    :goto_1
    iget-object v2, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 149
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->c(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 150
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->c(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 152
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->d(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/TextView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->d(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 163
    :sswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handler update "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", current:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", count:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->e(I)I

    move-result v1

    if-eq v0, v1, :cond_a

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    if-gtz v0, :cond_8

    .line 166
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 168
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->e(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;I)I

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handler count change update "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", current:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mTrackCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->i(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/g;->notifyDataSetChanged()V

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;I)V

    .line 178
    :cond_9
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->k(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 173
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_9

    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    if-ne v0, v1, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->f(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/q;->d(I)I

    move-result v1

    if-ne v0, v1, :cond_9

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->h(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/XListView;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/XListView;->b(Z)V

    goto :goto_2

    .line 182
    :sswitch_5
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->e(Lcom/roidapp/photogrid/video/TrackSelector;)I

    move-result v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/TrackSelector;->a:Lcom/roidapp/photogrid/video/q;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/q;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget v0, p1, Landroid/os/Message;->arg2:I

    if-ne v0, v4, :cond_0

    .line 184
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto/16 :goto_0

    .line 188
    :sswitch_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 194
    :sswitch_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 195
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 199
    :sswitch_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 204
    :sswitch_9
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 209
    :sswitch_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 210
    if-eqz v0, :cond_b

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "http"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->l(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const/16 v1, 0x5003

    invoke-static {v0, v1, v3}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;IZ)V

    .line 215
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 219
    :cond_b
    if-eqz v0, :cond_c

    .line 220
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Ljava/lang/String;)V

    .line 221
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 225
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 232
    :sswitch_b
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->l(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 233
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    if-eqz v0, :cond_d

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->g(Lcom/roidapp/photogrid/video/TrackSelector;)Lcom/roidapp/photogrid/video/ad;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/video/ad;->a(I)V

    goto/16 :goto_0

    .line 237
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->j(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/RelativeLayout;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ae;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->m(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_0

    :cond_e
    move-object v1, v0

    goto/16 :goto_1

    .line 119
    nop

    :sswitch_data_0
    .sparse-switch
        0x1001 -> :sswitch_1
        0x1002 -> :sswitch_2
        0x1003 -> :sswitch_3
        0x2001 -> :sswitch_0
        0x2002 -> :sswitch_0
        0x2003 -> :sswitch_0
        0x2004 -> :sswitch_4
        0x2005 -> :sswitch_5
        0x3001 -> :sswitch_a
        0x3002 -> :sswitch_b
        0x4001 -> :sswitch_6
        0x4002 -> :sswitch_7
        0x4003 -> :sswitch_8
        0x4004 -> :sswitch_9
    .end sparse-switch
.end method
