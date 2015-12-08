.class public final Lcom/roidapp/photogrid/video/ad;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/app/Activity;

.field private final c:Landroid/view/LayoutInflater;

.field private d:Z

.field private e:Lcom/roidapp/photogrid/video/f;

.field private f:Landroid/os/Handler;

.field private g:I

.field private h:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/roidapp/photogrid/video/f;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 44
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 33
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/ad;->d:Z

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    .line 36
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    .line 37
    iput v1, p0, Lcom/roidapp/photogrid/video/ad;->h:I

    .line 45
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    .line 46
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ad;->b:Landroid/app/Activity;

    .line 47
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ad;->c:Landroid/view/LayoutInflater;

    .line 48
    iput-object p2, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    if-eqz v0, :cond_0

    .line 50
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->d()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    .line 51
    :cond_0
    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 1

    .prologue
    .line 193
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    .line 194
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ad;->notifyDataSetChanged()V

    .line 195
    return-void
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 59
    iput p1, p0, Lcom/roidapp/photogrid/video/ad;->h:I

    .line 72
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ad;->notifyDataSetChanged()V

    .line 74
    return-void
.end method

.method public final getCount()I
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/f;->b()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/video/f;->b(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 89
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const v9, 0x7f0203be

    const/16 v8, 0x8

    const/4 v7, 0x0

    .line 95
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/ad;->d:Z

    if-eqz v0, :cond_1

    .line 96
    new-instance p2, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 97
    const-string v0, " "

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 189
    :cond_0
    :goto_0
    return-object p2

    .line 100
    :cond_1
    if-nez p2, :cond_2

    .line 102
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f0300eb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_0
    .catch Landroid/view/InflateException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object p2

    .line 107
    :goto_1
    if-nez p2, :cond_2

    .line 108
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 109
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 111
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->c:Landroid/view/LayoutInflater;

    const v1, 0x7f0300eb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_1
    .catch Landroid/view/InflateException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object p2

    .line 125
    :cond_2
    const v0, 0x7f0d03bc

    invoke-static {p2, v0}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 126
    const v1, 0x7f0d03bd

    invoke-static {p2, v1}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 127
    const v2, 0x7f0d022b

    invoke-static {p2, v2}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 128
    const v3, 0x7f0d03bb

    invoke-static {p2, v3}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    .line 129
    const v4, 0x7f0d03ba

    invoke-static {p2, v4}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 131
    const v5, 0x7f0d0380

    invoke-static {p2, v5}, Lcom/roidapp/baselib/c/u;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    .line 132
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 133
    invoke-virtual {v4, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 139
    iget v4, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    if-ne v4, p1, :cond_3

    .line 140
    iget v4, p0, Lcom/roidapp/photogrid/video/ad;->h:I

    packed-switch v4, :pswitch_data_0

    .line 167
    :goto_2
    iget-object v2, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v2, p1}, Lcom/roidapp/photogrid/video/f;->b(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v2

    .line 168
    if-eqz v2, :cond_0

    .line 169
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "By "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v4

    iget-object v4, v4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->artist_name:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 170
    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->thumb_url:Ljava/lang/String;

    .line 172
    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 174
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 175
    invoke-static {}, Lcom/roidapp/baselib/b/a;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_0

    .line 104
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 105
    const/4 p2, 0x0

    goto/16 :goto_1

    .line 113
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Landroid/view/InflateException;->printStackTrace()V

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/ad;->d:Z

    .line 116
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    .line 118
    new-instance p2, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-direct {p2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 119
    const-string v0, " "

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 143
    :pswitch_0
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 144
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 145
    iget-object v3, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 146
    const/4 v2, -0x1

    iput v2, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    goto :goto_2

    .line 150
    :pswitch_1
    invoke-virtual {v3, v7}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 151
    invoke-virtual {v2, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_2

    .line 155
    :pswitch_2
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 156
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 157
    iget-object v3, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0203bd

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 162
    :cond_3
    invoke-virtual {v3, v8}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 163
    invoke-virtual {v2, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 164
    iget-object v3, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v9}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_2

    .line 176
    :cond_4
    const-string v1, "Photo Grid"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 177
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f020357

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_0

    .line 179
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ad;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/bumptech/glide/h;->a(Landroid/app/Activity;)Lcom/bumptech/glide/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/d;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/baselib/b/a;->b()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/c;->b(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/bumptech/glide/c;->a(Landroid/widget/ImageView;)Lcom/bumptech/glide/g/b/k;

    goto/16 :goto_0

    .line 140
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/16 v4, 0x3001

    .line 206
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 207
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->e:Lcom/roidapp/photogrid/video/f;

    invoke-interface {v0, v1}, Lcom/roidapp/photogrid/video/f;->b(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 208
    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrackPath()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrackPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 211
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrackPath()Ljava/lang/String;

    move-result-object v0

    .line 216
    :goto_0
    if-nez v0, :cond_2

    .line 244
    :cond_0
    :goto_1
    return-void

    .line 214
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    goto :goto_0

    .line 224
    :cond_2
    iget v2, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    if-ne v2, v1, :cond_3

    .line 225
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    .line 226
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 227
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 228
    const/16 v1, 0x3002

    iput v1, v0, Landroid/os/Message;->what:I

    .line 229
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 240
    :goto_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/ad;->notifyDataSetChanged()V

    goto :goto_1

    .line 231
    :cond_3
    iput v1, p0, Lcom/roidapp/photogrid/video/ad;->g:I

    .line 232
    const/4 v1, 0x1

    iput v1, p0, Lcom/roidapp/photogrid/video/ad;->h:I

    .line 233
    iget-object v1, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 234
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 235
    iput v4, v1, Landroid/os/Message;->what:I

    .line 236
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 237
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ad;->f:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_2
.end method
