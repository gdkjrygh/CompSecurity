.class public final Lcom/roidapp/photogrid/release/ng;
.super Lcom/roidapp/photogrid/release/mm;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;
.implements Landroid/media/MediaPlayer$OnInfoListener;
.implements Landroid/media/MediaPlayer$OnPreparedListener;
.implements Lcom/roidapp/videolib/core/h;


# instance fields
.field protected L:[Ljava/lang/String;

.field protected M:[Z

.field protected N:Ljava/lang/String;

.field protected O:Ljava/lang/String;

.field protected P:Ljava/lang/String;

.field protected Q:Ljava/lang/String;

.field protected R:I

.field protected S:I

.field protected T:I

.field protected U:Z

.field protected V:Z

.field protected W:[I

.field public X:Ljava/lang/String;

.field Y:[Lcom/roidapp/videolib/b/u;

.field Z:Lcom/roidapp/videolib/b/u;

.field private aA:Z

.field private aB:Z

.field private aC:F

.field private aD:F

.field private aE:Landroid/graphics/Bitmap;

.field private aF:Landroid/graphics/Bitmap;

.field private aG:Z

.field private final aH:F

.field private aI:Lcom/roidapp/photogrid/video/e;

.field private aJ:Lcom/roidapp/videolib/core/i;

.field private aK:Ljava/lang/Object;

.field private aL:Z

.field private aM:Z

.field private aN:Z

.field private aO:F

.field private aP:F

.field private aQ:Lcom/roidapp/videolib/core/e;

.field private aR:Ljava/lang/Object;

.field private aS:Z

.field aa:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field ab:I

.field ac:Z

.field private ad:Landroid/widget/RelativeLayout;

.field private ae:Landroid/widget/RelativeLayout;

.field private af:Landroid/widget/LinearLayout;

.field private ag:Landroid/widget/LinearLayout;

.field private ah:Lcom/roidapp/videolib/gl/GPUVideoView;

.field private ai:Landroid/widget/TextView;

.field private aj:F

.field private ak:Landroid/media/MediaPlayer;

.field private al:I

.field private am:Ljava/lang/String;

.field private an:I

.field private ao:I

.field private ap:Z

.field private aq:I

.field private ar:I

.field private as:Z

.field private at:I

.field private au:I

.field private av:I

.field private aw:I

.field private ax:Lcom/roidapp/photogrid/release/ProgressView;

.field private ay:I

.field private az:Lcom/roidapp/videolib/gl/f;


# direct methods
.method public constructor <init>(ZLandroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;)V
    .locals 7

    .prologue
    const/high16 v6, 0x3f800000    # 1.0f

    const/16 v5, 0x64

    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 164
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/mm;-><init>()V

    .line 101
    iput v6, p0, Lcom/roidapp/photogrid/release/ng;->aj:F

    .line 103
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->al:I

    .line 108
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->O:Ljava/lang/String;

    .line 112
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    .line 113
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    .line 114
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->an:I

    .line 117
    const/16 v0, 0x1388

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    .line 121
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    .line 122
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->ap:Z

    .line 123
    const/16 v0, 0x3a98

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    .line 124
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    .line 126
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->as:Z

    .line 127
    iput v5, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    .line 128
    iput v5, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    .line 134
    const/16 v0, 0x280

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    .line 140
    iput v4, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    iput v4, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    .line 142
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    .line 152
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    .line 153
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    .line 155
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aa:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 156
    iput v5, p0, Lcom/roidapp/photogrid/release/ng;->ab:I

    .line 159
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 160
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    .line 161
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aK:Ljava/lang/Object;

    .line 162
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aL:Z

    .line 1150
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aM:Z

    .line 1440
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    .line 1585
    iput v6, p0, Lcom/roidapp/photogrid/release/ng;->aO:F

    .line 1586
    iput v4, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 2082
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    .line 2083
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aR:Ljava/lang/Object;

    .line 2138
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    .line 2273
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->ac:Z

    .line 165
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ng;->F:Z

    .line 166
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    .line 167
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    .line 168
    iput-object p4, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setFormat(I)V

    .line 170
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    .line 171
    if-eqz p1, :cond_0

    .line 172
    const/16 v1, -0x14

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(I)V

    .line 173
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->g(I)V

    .line 174
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(I)V

    .line 175
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(I)V

    .line 176
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->g(Z)V

    .line 177
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->d(F)V

    .line 178
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 179
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->f(F)V

    .line 180
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->d(Z)V

    .line 181
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->c(I)V

    .line 182
    invoke-virtual {v0, v6}, Lcom/roidapp/photogrid/release/ih;->b(F)V

    .line 183
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 184
    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->f(Z)V

    .line 186
    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/videolib/b/u;)V

    .line 187
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/videolib/b/u;)V

    .line 188
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 189
    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->a(F)V

    .line 190
    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->l(I)V

    .line 191
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 192
    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 195
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->s:I

    .line 196
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->r:I

    .line 197
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->t:I

    .line 198
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->u:I

    .line 199
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    .line 200
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    .line 201
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->c()F

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 202
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->m:I

    .line 203
    invoke-static {}, Lcom/roidapp/photogrid/common/aj;->a()Lcom/roidapp/photogrid/common/aj;

    move-result-object v1

    iget-object v1, v1, Lcom/roidapp/photogrid/common/aj;->b:[I

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ng;->W:[I

    .line 204
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->aH:F

    .line 205
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ac()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aa:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 206
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ae()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ab:I

    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 209
    const-string v1, "show_sign"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 210
    const-string v1, "sign_text"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    .line 211
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    .line 216
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->b(Landroid/content/Context;)V

    .line 218
    new-instance v0, Lcom/roidapp/photogrid/release/nh;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/nh;-><init>(Lcom/roidapp/photogrid/release/ng;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->az:Lcom/roidapp/videolib/gl/f;

    .line 494
    return-void
.end method

.method private A()V
    .locals 2

    .prologue
    .line 1839
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aK:Ljava/lang/Object;

    monitor-enter v1

    .line 1840
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    if-eqz v0, :cond_0

    .line 1841
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/i;->b()V

    .line 1842
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    .line 1844
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30103
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aR:Ljava/lang/Object;

    monitor-enter v1

    .line 30104
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    if-eqz v0, :cond_1

    .line 30105
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->e()V

    .line 30106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    .line 30108
    :cond_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    .line 1844
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 30108
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method private B()V
    .locals 5

    .prologue
    .line 2086
    .line 37356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 2086
    if-nez v0, :cond_0

    .line 2099
    :goto_0
    return-void

    .line 2089
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aR:Ljava/lang/Object;

    monitor-enter v1

    .line 2090
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    if-nez v0, :cond_2

    .line 2091
    new-instance v0, Lcom/roidapp/videolib/core/e;

    invoke-direct {v0}, Lcom/roidapp/videolib/core/e;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    .line 2092
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->b(Lcom/roidapp/videolib/b/u;)[Ljava/lang/String;

    move-result-object v2

    .line 2093
    const/4 v0, 0x0

    :goto_1
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 2094
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/.video/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v4, v2, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    .line 2093
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2096
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/core/e;->a([Ljava/lang/String;)V

    .line 2097
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    invoke-virtual {v0}, Lcom/roidapp/videolib/core/e;->b()I

    .line 2099
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Landroid/text/TextPaint;Ljava/lang/String;)F
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 93
    .line 39536
    const/4 v0, 0x0

    .line 39537
    const-string v2, "line.separator"

    const-string v3, "\n"

    invoke-static {v2, v3}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    move v2, v0

    move v0, v1

    .line 39538
    :goto_0
    array-length v3, v4

    if-ge v0, v3, :cond_1

    .line 39539
    aget-object v3, v4, v0

    .line 39540
    if-eqz v3, :cond_0

    .line 39541
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    .line 39542
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {p0, v3, v1, v6, v5}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 39543
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    .line 39545
    cmpl-float v5, v3, v2

    if-lez v5, :cond_0

    move v2, v3

    .line 39538
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 93
    :cond_1
    return v2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ng;F)F
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    return p1
.end method

.method static synthetic a(FF)I
    .locals 2

    .prologue
    .line 93
    .line 39532
    mul-float v0, p0, p1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    .line 93
    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ng;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->av:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->aF:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ng;Lcom/roidapp/videolib/core/i;)Lcom/roidapp/videolib/core/i;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aR:Ljava/lang/Object;

    return-object v0
.end method

.method private a(Landroid/widget/RelativeLayout;)V
    .locals 2

    .prologue
    .line 823
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0, p1, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/content/Context;)V

    .line 824
    return-void
.end method

.method private a(Lcom/roidapp/videolib/gl/a;Landroid/graphics/Bitmap;F)V
    .locals 11

    .prologue
    const/high16 v8, 0x3f000000    # 0.5f

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    const v9, 0x3c23d70a    # 0.01f

    .line 1918
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    .line 1919
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    .line 1920
    if-le v4, v5, :cond_0

    move v0, v2

    .line 1922
    :goto_0
    if-eqz v0, :cond_1

    .line 1923
    int-to-float v0, v4

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    .line 1927
    :goto_1
    int-to-float v1, v5

    div-float v6, v1, v0

    .line 1928
    int-to-float v1, v4

    div-float v0, v1, v0

    .line 1929
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v1, v1

    div-float v1, v0, v1

    .line 1930
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v0, v0

    div-float v0, v6, v0

    .line 1931
    cmpl-float v6, v1, v0

    if-lez v6, :cond_2

    .line 1932
    :goto_2
    div-float v1, v0, v10

    sub-float v1, v8, v1

    .line 1933
    add-float v6, v1, v0

    .line 1934
    div-float v7, v0, v10

    sub-float v7, v8, v7

    .line 1935
    add-float/2addr v0, v7

    .line 1936
    const/4 v8, 0x0

    cmpl-float v8, p3, v8

    if-lez v8, :cond_3

    .line 1937
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    int-to-float v4, v4

    .line 1938
    const/high16 v5, 0x42c80000    # 100.0f

    div-float v5, p3, v5

    const v8, 0x3f75c28f    # 0.96f

    mul-float/2addr v8, v4

    div-float/2addr v8, v10

    mul-float/2addr v5, v8

    .line 1940
    const v8, 0x3ed3f7cf    # 0.414f

    mul-float/2addr v5, v8

    const v8, 0x3fb4fdf4    # 1.414f

    mul-float/2addr v4, v8

    div-float v4, v5, v4

    .line 1941
    const/16 v5, 0x8

    new-array v5, v5, [F

    add-float v8, v1, v4

    add-float/2addr v8, v9

    aput v8, v5, v3

    sub-float v3, v0, v4

    sub-float/2addr v3, v9

    aput v3, v5, v2

    const/4 v2, 0x2

    sub-float v3, v6, v4

    sub-float/2addr v3, v9

    aput v3, v5, v2

    const/4 v2, 0x3

    sub-float/2addr v0, v4

    sub-float/2addr v0, v9

    aput v0, v5, v2

    const/4 v0, 0x4

    add-float/2addr v1, v4

    add-float/2addr v1, v9

    aput v1, v5, v0

    const/4 v0, 0x5

    add-float v1, v7, v4

    add-float/2addr v1, v9

    aput v1, v5, v0

    const/4 v0, 0x6

    sub-float v1, v6, v4

    sub-float/2addr v1, v9

    aput v1, v5, v0

    const/4 v0, 0x7

    add-float v1, v7, v4

    add-float/2addr v1, v9

    aput v1, v5, v0

    .line 1947
    iput-object v5, p1, Lcom/roidapp/videolib/gl/a;->c:[F

    .line 1959
    :goto_3
    return-void

    :cond_0
    move v0, v3

    .line 1920
    goto :goto_0

    .line 1925
    :cond_1
    int-to-float v0, v5

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    goto :goto_1

    :cond_2
    move v0, v1

    .line 1931
    goto :goto_2

    .line 1949
    :cond_3
    const/16 v4, 0x8

    new-array v4, v4, [F

    add-float v5, v1, v9

    aput v5, v4, v3

    sub-float v3, v0, v9

    aput v3, v4, v2

    const/4 v2, 0x2

    sub-float v3, v6, v9

    aput v3, v4, v2

    const/4 v2, 0x3

    sub-float/2addr v0, v9

    aput v0, v4, v2

    const/4 v0, 0x4

    add-float/2addr v1, v9

    aput v1, v4, v0

    const/4 v0, 0x5

    add-float v1, v7, v9

    aput v1, v4, v0

    const/4 v0, 0x6

    sub-float v1, v6, v9

    aput v1, v4, v0

    const/4 v0, 0x7

    add-float v1, v7, v9

    aput v1, v4, v0

    .line 1956
    iput-object v4, p1, Lcom/roidapp/videolib/gl/a;->c:[F

    goto :goto_3
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 2218
    const/4 v0, 0x1

    .line 2219
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ge v2, v3, :cond_0

    move v0, v1

    .line 2223
    :cond_0
    invoke-static {p0}, Lcom/roidapp/photogrid/release/ng;->c(Landroid/content/Context;)I

    move-result v2

    const/16 v3, 0x19

    if-le v2, v3, :cond_1

    .line 2227
    :goto_0
    return v1

    :cond_1
    move v1, v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ng;I)I
    .locals 0

    .prologue
    .line 93
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->aw:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ng;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 93
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/e;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aQ:Lcom/roidapp/videolib/core/e;

    return-object v0
.end method

.method private static b(Landroid/content/Context;)V
    .locals 8

    .prologue
    .line 2171
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/.video/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2172
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2173
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 2174
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 2178
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "effect.mp4"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->c(Ljava/lang/String;)V

    .line 2179
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "mask.mp4"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ng;->c(Ljava/lang/String;)V

    .line 2181
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "test.mp4"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2182
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2183
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2184
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v3, "test.mp4"

    invoke-static {v0, v2, v3}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/res/AssetManager;Ljava/io/File;Ljava/lang/String;)V

    .line 2185
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "video"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1}, Lcom/roidapp/videolib/core/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2206
    :cond_1
    :goto_0
    return-void

    .line 2187
    :cond_2
    const/4 v0, 0x0

    .line 2189
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "test.mp4"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 2190
    :try_start_1
    invoke-static {v0}, Lcom/roidapp/videolib/core/l;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v3

    .line 2191
    if-eqz v3, :cond_3

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "video"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 2192
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    const-string v5, "test.mp4"

    invoke-static {v4, v2, v5}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/res/AssetManager;Ljava/io/File;Ljava/lang/String;)V

    .line 2193
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "video"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2199
    :cond_3
    if-eqz v0, :cond_1

    .line 2200
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 2206
    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v1

    .line 2199
    if-eqz v0, :cond_1

    .line 2200
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    .line 2206
    :catch_2
    move-exception v0

    goto :goto_0

    .line 2198
    :catchall_0
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    .line 2199
    :goto_1
    if-eqz v1, :cond_4

    .line 2200
    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 2205
    :cond_4
    :goto_2
    throw v0

    :catch_3
    move-exception v1

    goto :goto_2

    .line 2198
    :catchall_1
    move-exception v1

    move-object v7, v1

    move-object v1, v0

    move-object v0, v7

    goto :goto_1
.end method

.method private b(Lcom/roidapp/videolib/b/u;)V
    .locals 1

    .prologue
    .line 1307
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    .line 1308
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/videolib/b/u;)V

    .line 1309
    return-void
.end method

.method private b(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 1152
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 1153
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 1154
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 1155
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    .line 1157
    :cond_0
    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    .line 1158
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    .line 1159
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    .line 1160
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->am:Ljava/lang/String;

    .line 1161
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    if-eqz v0, :cond_2

    .line 1162
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aM:Z

    .line 1166
    :cond_2
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p0}, Landroid/media/MediaPlayer;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    .line 1167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 1168
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->ac:Z

    .line 1169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1184
    :cond_3
    :goto_0
    return-void

    .line 1171
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1172
    const v0, 0xee08

    invoke-virtual {p0, v0, p1}, Lcom/roidapp/photogrid/release/ng;->a(ILjava/lang/String;)V

    .line 1173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 1175
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    .line 1176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepare()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 1178
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 1179
    iput-object v3, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    .line 1180
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->y()V

    goto :goto_0
.end method

.method private static b(FF)Z
    .locals 2

    .prologue
    const v1, 0x358637bd    # 1.0E-6f

    .line 1696
    add-float v0, p1, v1

    cmpg-float v0, p0, v0

    if-gez v0, :cond_0

    sub-float v0, p1, v1

    cmpl-float v0, p0, v0

    if-lez v0, :cond_0

    .line 1697
    const/4 v0, 0x1

    .line 1698
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static c(Landroid/content/Context;)I
    .locals 10

    .prologue
    const/16 v3, 0x64

    const/4 v1, 0x0

    .line 2231
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "videoDecodeSpeed"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 2232
    if-eqz v0, :cond_0

    .line 2265
    :goto_0
    return v0

    .line 2236
    :cond_0
    :try_start_0
    invoke-static {p0}, Lcom/roidapp/photogrid/release/ng;->b(Landroid/content/Context;)V

    .line 2238
    new-instance v5, Lcom/roidapp/videolib/core/g;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/b/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/.video/test.mp4"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/roidapp/videolib/core/g;-><init>(Ljava/lang/String;)V

    .line 2239
    invoke-virtual {v5}, Lcom/roidapp/videolib/core/g;->a()I

    .line 2241
    const/high16 v0, 0x190000

    new-array v6, v0, [B

    .line 2245
    const/16 v2, 0x32

    move v4, v1

    .line 2247
    :goto_1
    const/4 v0, 0x5

    if-ge v4, v0, :cond_2

    .line 2248
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 2250
    invoke-virtual {v5, v6}, Lcom/roidapp/videolib/core/g;->a([B)I

    .line 2252
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long v0, v8, v0

    .line 2254
    int-to-long v8, v2

    cmp-long v7, v0, v8

    if-gez v7, :cond_1

    :goto_2
    long-to-int v2, v0

    .line 2247
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto :goto_1

    .line 2254
    :cond_1
    int-to-long v0, v2

    goto :goto_2

    .line 2257
    :cond_2
    invoke-virtual {v5}, Lcom/roidapp/videolib/core/g;->c()V

    .line 2259
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "videoDecodeSpeed"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move v0, v2

    .line 2261
    goto :goto_0

    .line 2263
    :catch_0
    move-exception v0

    move v0, v3

    goto :goto_0

    .line 2265
    :catch_1
    move-exception v0

    move v0, v3

    goto :goto_0
.end method

.method private static c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 2160
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2161
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2162
    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2167
    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private c(Z)V
    .locals 1

    .prologue
    .line 1188
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    if-nez v0, :cond_0

    .line 1190
    if-eqz p1, :cond_1

    .line 1191
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 1192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    .line 1193
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 1194
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    .line 1206
    :cond_0
    :goto_0
    return-void

    .line 1197
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1202
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ng;)Z
    .locals 1

    .prologue
    .line 93
    .line 39356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 93
    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ng;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ng;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ng;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aK:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ng;)Lcom/roidapp/videolib/core/i;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aJ:Lcom/roidapp/videolib/core/i;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/ng;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aG:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aF:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/ng;)Z
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aG:Z

    return v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/ng;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    return v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/ng;)F
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aH:F

    return v0
.end method

.method private m(I)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 713
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 714
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 715
    const/16 v2, 0x15

    iput v2, v1, Landroid/os/Message;->what:I

    .line 716
    const v2, 0xee0a

    iput v2, v1, Landroid/os/Message;->arg1:I

    .line 717
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v2, v2, p1

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 718
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v1}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z

    .line 719
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    .line 720
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 726
    :cond_0
    :goto_0
    return-object v0

    .line 723
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, p1

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 725
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v0, p1

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    const/4 v3, 0x0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/ng;)Z
    .locals 1

    .prologue
    .line 93
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aB:Z

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/ng;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private n(I)V
    .locals 3

    .prologue
    .line 1127
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->an:I

    .line 1128
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    if-nez v0, :cond_1

    .line 1129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 1130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    .line 1131
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->b(Ljava/lang/String;)V

    .line 1133
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->ac:Z

    if-eqz v0, :cond_1

    .line 14356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1134
    if-eqz v0, :cond_2

    const/16 v0, 0x3a98

    .line 1136
    :goto_0
    div-int v0, p1, v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->p(I)V

    .line 1138
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->an:I

    add-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v2}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1147
    :cond_1
    :goto_1
    return-void

    .line 1134
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private o(I)V
    .locals 6

    .prologue
    const/16 v3, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1405
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->B()V

    .line 1406
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    .line 1407
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1408
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 19356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1410
    if-eqz v0, :cond_1

    .line 1411
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1412
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    .line 1418
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1419
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v3, 0x7

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1420
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v3, 0x2016

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1422
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v0, :cond_0

    .line 1423
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 20356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1423
    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    invoke-interface {v3, v0, v2}, Lcom/roidapp/photogrid/video/e;->a(ZZ)V

    .line 21356
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1425
    if-eqz v0, :cond_3

    .line 1426
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1427
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(J)V

    .line 1428
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 1435
    :goto_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->u()V

    .line 1436
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    .line 1437
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    .line 1438
    return-void

    .line 1414
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1415
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 1423
    goto :goto_1

    .line 1431
    :cond_3
    int-to-float v0, p1

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1432
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(J)V

    .line 1433
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    goto :goto_2
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/ng;)Z
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aB:Z

    return v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/release/ng;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->av:I

    return v0
.end method

.method private p(I)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1638
    const/high16 v1, 0x3f800000    # 1.0f

    .line 1639
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->as:Z

    if-eqz v2, :cond_4

    .line 1640
    const/4 v2, 0x0

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    sub-int/2addr v3, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1641
    const/16 v3, 0x1e

    if-ge v2, v3, :cond_0

    .line 1642
    int-to-float v1, v2

    const/high16 v2, 0x41f00000    # 30.0f

    div-float/2addr v1, v2

    .line 1645
    :cond_0
    cmpg-float v2, v1, v0

    if-gez v2, :cond_3

    .line 1648
    :goto_0
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aO:F

    cmpl-float v1, v0, v1

    if-eqz v1, :cond_2

    .line 1649
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_1

    .line 1650
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v1, v0, v0}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 1653
    :cond_1
    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aO:F

    .line 1655
    :cond_2
    return-void

    :cond_3
    move v0, v1

    .line 1645
    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method

.method static synthetic q(Lcom/roidapp/photogrid/release/ng;)I
    .locals 1

    .prologue
    .line 93
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aw:I

    return v0
.end method

.method private q(I)Lcom/roidapp/videolib/gl/a;
    .locals 11

    .prologue
    .line 1962
    new-instance v1, Lcom/roidapp/videolib/gl/a;

    invoke-direct {v1}, Lcom/roidapp/videolib/gl/a;-><init>()V

    .line 36356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1964
    if-nez v0, :cond_5

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-lez v0, :cond_5

    .line 1966
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->m(I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1967
    if-nez v0, :cond_0

    .line 1968
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 2078
    :goto_0
    return-object v0

    .line 1971
    :cond_0
    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/videolib/gl/a;Landroid/graphics/Bitmap;F)V

    .line 1972
    new-instance v2, Landroid/graphics/BitmapShader;

    sget-object v3, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v2, v0, v3, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 1975
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 1976
    if-nez v3, :cond_1

    .line 1977
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    .line 1978
    goto :goto_0

    .line 1982
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 1983
    goto :goto_0

    .line 1985
    :cond_1
    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    const/high16 v5, 0x42c80000    # 100.0f

    div-float/2addr v4, v5

    const v5, 0x3f75c28f    # 0.96f

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v5, v6

    mul-float/2addr v4, v5

    .line 1986
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1987
    new-instance v6, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-direct {v6, v7, v8}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v5, v6}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 1988
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    .line 1989
    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1990
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1991
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1992
    const/4 v7, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    invoke-virtual {v6, v7, v8}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1993
    invoke-virtual {v6}, Landroid/graphics/Path;->close()V

    .line 1994
    new-instance v7, Landroid/graphics/drawable/ShapeDrawable;

    new-instance v8, Landroid/graphics/drawable/shapes/PathShape;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    int-to-float v9, v9

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v10

    int-to-float v10, v10

    invoke-direct {v8, v6, v9, v10}, Landroid/graphics/drawable/shapes/PathShape;-><init>(Landroid/graphics/Path;FF)V

    invoke-direct {v7, v8}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 1995
    invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v6

    new-instance v8, Landroid/graphics/CornerPathEffect;

    invoke-direct {v8, v4}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1996
    invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1997
    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    invoke-virtual {v7, v2, v4, v6, v8}, Landroid/graphics/drawable/ShapeDrawable;->setBounds(IIII)V

    .line 1998
    invoke-virtual {v7, v5}, Landroid/graphics/drawable/ShapeDrawable;->draw(Landroid/graphics/Canvas;)V

    .line 2001
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 2004
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-nez v0, :cond_4

    .line 2007
    :try_start_1
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v4}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 2008
    if-nez v2, :cond_2

    .line 2009
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-object v0, v1

    .line 2010
    goto/16 :goto_0

    .line 2014
    :catch_1
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 2015
    goto/16 :goto_0

    .line 2017
    :cond_2
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2018
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x0

    const/4 v6, 0x3

    invoke-direct {v0, v5, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v4, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2020
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-le v0, v5, :cond_3

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 2021
    :goto_1
    iget v5, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v5, v5

    int-to-float v0, v0

    div-float v0, v5, v0

    .line 2022
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 2023
    iget v6, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    sub-float/2addr v6, v7

    .line 2024
    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sub-float/2addr v7, v8

    .line 2025
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2026
    iget v6, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v5, v0, v0, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 2027
    const/4 v0, 0x0

    const/16 v6, 0xff

    const/16 v7, 0xff

    const/16 v8, 0xff

    invoke-virtual {v4, v0, v6, v7, v8}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 2028
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v4, v3, v5, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2029
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 2030
    iput-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 2031
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    move-object v0, v1

    .line 2032
    goto/16 :goto_0

    .line 2020
    :cond_3
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_1

    .line 2034
    :cond_4
    iput-object v3, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 2035
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    move-object v0, v1

    .line 2037
    goto/16 :goto_0

    .line 2039
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-nez v0, :cond_9

    .line 2042
    :try_start_2
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v2, v3}, Lcom/roidapp/photogrid/release/rf;->a(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 2043
    if-nez v2, :cond_6

    .line 2044
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_2

    move-object v0, v1

    .line 2045
    goto/16 :goto_0

    .line 2048
    :catch_2
    move-exception v0

    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 2049
    goto/16 :goto_0

    .line 2051
    :cond_6
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2052
    new-instance v0, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v4, 0x0

    const/4 v5, 0x3

    invoke-direct {v0, v4, v5}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v0}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    .line 2053
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->m(I)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 2054
    if-nez v4, :cond_7

    .line 2055
    const/4 v0, 0x0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    move-object v0, v1

    .line 2056
    goto/16 :goto_0

    .line 2058
    :cond_7
    const/high16 v0, -0x40800000    # -1.0f

    invoke-direct {p0, v1, v4, v0}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/videolib/gl/a;Landroid/graphics/Bitmap;F)V

    .line 2059
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    if-le v0, v5, :cond_8

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 2060
    :goto_2
    iget v5, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v5, v5

    int-to-float v0, v0

    div-float v0, v5, v0

    .line 2061
    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    .line 2062
    iget v6, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    sub-float/2addr v6, v7

    .line 2063
    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    int-to-float v8, v8

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v8, v9

    sub-float/2addr v7, v8

    .line 2064
    invoke-virtual {v5, v6, v7}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 2065
    iget v6, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v6, v6

    const/high16 v7, 0x40000000    # 2.0f

    div-float/2addr v6, v7

    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    invoke-virtual {v5, v0, v0, v6, v7}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 2067
    const/4 v0, 0x0

    const/16 v6, 0xff

    const/16 v7, 0xff

    const/16 v8, 0xff

    invoke-virtual {v3, v0, v6, v7, v8}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 2068
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v3, v4, v5, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 2069
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->recycle()V

    .line 2071
    iput-object v2, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 2072
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    move-object v0, v1

    .line 2073
    goto/16 :goto_0

    .line 2059
    :cond_8
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    goto :goto_2

    .line 2075
    :cond_9
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->m(I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    .line 2076
    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/roidapp/videolib/gl/a;->d:Z

    .line 2077
    iget-object v0, v1, Lcom/roidapp/videolib/gl/a;->b:Landroid/graphics/Bitmap;

    const/high16 v2, -0x40800000    # -1.0f

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/videolib/gl/a;Landroid/graphics/Bitmap;F)V

    move-object v0, v1

    .line 2078
    goto/16 :goto_0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/release/ng;)V
    .locals 11

    .prologue
    const/4 v3, 0x0

    .line 93
    .line 39730
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 39734
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 39735
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const/16 v1, 0xf

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 39736
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 39737
    const/16 v1, 0x2be

    iput v1, v0, Landroid/os/Message;->what:I

    .line 39738
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 39739
    :cond_0
    :goto_0
    return-void

    .line 39743
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x14

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 39745
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v5, v0

    .line 39746
    const/high16 v0, 0x42a00000    # 80.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->al:I

    int-to-float v1, v1

    div-float v6, v0, v1

    .line 39747
    const/high16 v0, 0x41a00000    # 20.0f

    move v2, v3

    .line 39748
    :goto_1
    if-ge v2, v5, :cond_2

    .line 39749
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->M:[Z

    aget-boolean v1, v1, v2

    if-eqz v1, :cond_6

    .line 39750
    new-instance v1, Ljava/io/File;

    iget-object v7, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v7, v7, v2

    invoke-direct {v1, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_3

    .line 39751
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 39752
    const v0, 0xee0a

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v1, v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(ILjava/lang/String;)V

    .line 39768
    :cond_2
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    .line 39770
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 39755
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v1, v1, v2

    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    iget v8, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v9

    invoke-virtual {v9}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v9

    invoke-static {v1, v7, v8, v3, v9}, Lcom/roidapp/baselib/a/a;->a(Ljava/lang/String;IIZZ)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 39756
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v1, v1, v2

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v8, v8, v2

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v8

    add-int/lit8 v8, v8, 0x1

    invoke-virtual {v1, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 40677
    if-eqz v7, :cond_4

    iget-object v8, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    if-nez v8, :cond_7

    .line 39758
    :cond_4
    :goto_2
    add-float/2addr v0, v6

    .line 39759
    if-eqz v7, :cond_5

    .line 39760
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 39763
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    float-to-int v7, v0

    invoke-virtual {v1, v7, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 39748
    :cond_6
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 40679
    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 40680
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40681
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v9

    if-nez v9, :cond_8

    .line 40682
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 40687
    :cond_8
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40688
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_9

    .line 40689
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 40692
    :cond_9
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40698
    :try_start_1
    new-instance v9, Ljava/io/FileOutputStream;

    invoke-direct {v9, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 40699
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v10, 0x64

    invoke-virtual {v7, v1, v10, v9}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 40700
    invoke-virtual {v9}, Ljava/io/OutputStream;->flush()V

    .line 40701
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 40706
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v2

    iput-object v8, v1, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    .line 40707
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->M:[Z

    aput-boolean v3, v1, v2

    goto :goto_2

    .line 40694
    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_2

    .line 40704
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3
.end method

.method private u()V
    .locals 6

    .prologue
    const/16 v2, 0x3a98

    const/high16 v5, 0x3f800000    # 1.0f

    .line 914
    const/16 v0, 0x96

    .line 915
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-ne v1, v3, :cond_0

    .line 916
    const/16 v0, 0xc8

    .line 7356
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v1

    .line 918
    if-eqz v1, :cond_3

    move v1, v2

    .line 8356
    :goto_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v3}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v3

    .line 920
    if-eqz v3, :cond_4

    move v3, v2

    :goto_1
    int-to-float v3, v3

    mul-float/2addr v3, v5

    int-to-float v4, v0

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iput v3, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    .line 9356
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v3}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v3

    .line 921
    if-eqz v3, :cond_5

    :goto_2
    int-to-float v1, v2

    mul-float/2addr v1, v5

    int-to-float v2, v0

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    .line 923
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    int-to-float v1, v1

    mul-float/2addr v1, v5

    int-to-float v0, v0

    div-float/2addr v1, v0

    .line 924
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    .line 10356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 924
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v0

    :goto_3
    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    invoke-virtual {v2, v0, v3, v1}, Lcom/roidapp/photogrid/release/ProgressView;->a(IIF)V

    .line 929
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    const/16 v1, 0x1770

    if-lt v0, v1, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->S:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    if-gt v0, v1, :cond_2

    .line 11356
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 929
    if-eqz v0, :cond_7

    .line 930
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->as:Z

    .line 935
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 936
    return-void

    .line 918
    :cond_3
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v1, v3

    goto :goto_0

    .line 920
    :cond_4
    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    goto :goto_1

    :cond_5
    move v2, v1

    .line 921
    goto :goto_2

    .line 924
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    goto :goto_3

    .line 932
    :cond_7
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->as:Z

    goto :goto_4
.end method

.method private v()Z
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 939
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->M:[Z

    move v0, v1

    .line 940
    :goto_0
    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-ge v0, v3, :cond_2

    .line 941
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v3, v3, v0

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 946
    new-instance v3, Ljava/io/File;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 947
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    .line 948
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v0, v3, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/common/y;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 962
    :goto_1
    return v1

    .line 951
    :cond_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v3, v3, v0

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v4, v4, v0

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    .line 952
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v4, v4, v0

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v5, v5, v0

    iget-object v5, v5, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 955
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 956
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->M:[Z

    aput-boolean v1, v3, v0

    .line 940
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 958
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->M:[Z

    aput-boolean v2, v3, v0

    .line 959
    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->al:I

    add-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/roidapp/photogrid/release/ng;->al:I

    goto :goto_2

    :cond_2
    move v1, v2

    .line 962
    goto :goto_1
.end method

.method private w()V
    .locals 4

    .prologue
    .line 966
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_2

    .line 967
    :cond_0
    const-string v0, "200"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 1101
    :cond_1
    :goto_0
    return-void

    .line 11883
    :cond_2
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11887
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

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const v2, 0x7f07002e

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/.music"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 11888
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/default.mp3"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 11890
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11891
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_3

    .line 11892
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 11896
    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 11897
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_4

    .line 11898
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "default.mp3"

    invoke-static {v2, v0, v3}, Lcom/roidapp/baselib/d/a;->a(Landroid/content/res/AssetManager;Ljava/io/File;Ljava/lang/String;)V

    .line 11901
    :cond_4
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ng;->P:Ljava/lang/String;

    .line 11903
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->P:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Ljava/lang/String;)V

    .line 973
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    .line 974
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    .line 978
    const/4 v0, 0x0

    :goto_1
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-ge v0, v1, :cond_8

    .line 979
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ig;->d()Ljava/lang/String;

    move-result-object v1

    :goto_2
    aput-object v1, v2, v0

    .line 980
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 981
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_7

    .line 982
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 983
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    aget-object v0, v2, v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/y;->c(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 979
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    aget-object v1, v1, v0

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    goto :goto_2

    .line 978
    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 989
    :cond_8
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->v()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 992
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ap()I

    move-result v0

    if-nez v0, :cond_a

    .line 993
    const v0, 0x466a6000    # 15000.0f

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    .line 994
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 999
    :goto_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    .line 1002
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->as()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    .line 1003
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ar()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    .line 1004
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->at()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    .line 1005
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v0, :cond_9

    .line 1006
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    .line 1007
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->b(Ljava/lang/String;)V

    .line 1010
    :cond_9
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/videolib/b/u;)V

    .line 1011
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aa()[Lcom/roidapp/videolib/b/u;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    .line 1013
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    const/16 v1, 0x2d0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ay:I

    .line 1100
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/nk;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nk;-><init>(Lcom/roidapp/photogrid/release/ng;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto/16 :goto_0

    .line 996
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ap()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    goto :goto_3
.end method

.method private x()V
    .locals 4

    .prologue
    const/16 v0, 0x3a98

    .line 1105
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    if-nez v1, :cond_1

    .line 1107
    :try_start_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v1, :cond_1

    .line 1108
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-nez v1, :cond_0

    .line 1109
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ng;->b(Ljava/lang/String;)V

    .line 1110
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->ac:Z

    if-eqz v1, :cond_0

    .line 1111
    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 12356
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v1

    .line 1111
    if-eqz v1, :cond_2

    move v1, v0

    :goto_0
    int-to-float v1, v1

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->an:I

    .line 1112
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->an:I

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/media/MediaPlayer;->seekTo(I)V

    .line 1115
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->aO:F

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aO:F

    invoke-virtual {v1, v2, v3}, Landroid/media/MediaPlayer;->setVolume(FF)V

    .line 1116
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 13356
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v2}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v2

    .line 1116
    if-eqz v2, :cond_3

    :goto_1
    int-to-float v0, v0

    mul-float/2addr v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    int-to-float v1, v1

    add-float/2addr v0, v1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 1117
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    .line 1124
    :cond_1
    :goto_2
    return-void

    .line 1111
    :cond_2
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v1, v3

    goto :goto_0

    .line 1116
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ar:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sub-int/2addr v0, v2

    goto :goto_1

    .line 1120
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2
.end method

.method private y()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1537
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1538
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->ap:Z

    .line 1539
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->V:Z

    .line 1540
    iput v2, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    .line 1541
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->g(Ljava/lang/String;)V

    .line 1542
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->O:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->f(Ljava/lang/String;)V

    .line 1543
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->j(Z)V

    .line 1544
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->o(I)V

    .line 1545
    return-void
.end method

.method private z()V
    .locals 4

    .prologue
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1685
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-nez v0, :cond_0

    .line 1693
    :goto_0
    return-void

    .line 28356
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1688
    if-nez v0, :cond_1

    .line 1689
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    sub-float v1, v3, v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(F)V

    goto :goto_0

    .line 1691
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0, v3}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(F)V

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 790
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xb

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 3554
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 3555
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 3558
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v3

    .line 3561
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->x:I

    .line 3562
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    .line 3563
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->x:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    if-ge v0, v1, :cond_1

    .line 3564
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->x:I

    .line 3565
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->x:I

    .line 3566
    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    .line 3570
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900dd

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    .line 3571
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090058

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    .line 3572
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f090057

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 3574
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const v6, 0x7f0d0085

    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    .line 3575
    if-eqz v6, :cond_2

    .line 3576
    invoke-static {}, Lcom/roidapp/photogrid/common/a;->a()Lcom/roidapp/photogrid/common/a;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const-string v7, "video"

    const/4 v8, 0x0

    invoke-static {v0, v7, v8}, Lcom/roidapp/photogrid/common/a;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v0

    if-eq v0, v9, :cond_7

    .line 3577
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-nez v0, :cond_6

    .line 3578
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3580
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_2

    .line 3581
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 3582
    iget-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    if-eqz v7, :cond_2

    .line 3583
    const/4 v7, 0x0

    iput-boolean v7, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->F:Z

    .line 3584
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->C()V

    .line 3594
    :cond_2
    :goto_0
    if-eqz v6, :cond_8

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_8

    .line 3595
    const v0, 0x7f0d0086

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3596
    if-eqz v0, :cond_a

    .line 3597
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 3598
    if-lez v0, :cond_a

    .line 3599
    int-to-float v0, v0

    .line 3608
    :goto_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v6, 0x7f0900cb

    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 3611
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v6}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f090050

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    .line 3613
    iget v7, p0, Lcom/roidapp/photogrid/release/ng;->x:I

    int-to-float v7, v7

    sub-float v4, v7, v4

    sub-float/2addr v4, v5

    sub-float v0, v4, v0

    sub-float/2addr v0, v1

    sub-float/2addr v0, v6

    sget v1, Lcom/roidapp/photogrid/common/az;->g:I

    int-to-float v1, v1

    sub-float/2addr v0, v1

    float-to-int v1, v0

    .line 3618
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->w:I

    int-to-float v0, v0

    int-to-float v4, v1

    div-float/2addr v0, v4

    .line 3619
    cmpg-float v0, v3, v0

    if-gez v0, :cond_9

    .line 3621
    int-to-float v0, v1

    mul-float/2addr v0, v3

    float-to-int v0, v0

    .line 3626
    :goto_2
    int-to-float v0, v0

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aj:F

    mul-float/2addr v0, v3

    float-to-int v3, v0

    .line 3627
    int-to-float v0, v1

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aj:F

    mul-float/2addr v0, v1

    float-to-int v1, v0

    .line 3629
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v4, 0x7f03000e

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    .line 3630
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v4, -0x2

    const/4 v5, -0x2

    invoke-direct {v0, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 3631
    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 3632
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 3633
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3634
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v4, 0x7f0d0061

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    .line 3635
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 3636
    iput v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 3637
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 3638
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 3639
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3641
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v3, 0x7f0d0064

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ae:Landroid/widget/RelativeLayout;

    .line 3642
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 3644
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    .line 3646
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0067

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    .line 3647
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/ni;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ni;-><init>(Lcom/roidapp/photogrid/release/ng;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3655
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0068

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ag:Landroid/widget/LinearLayout;

    .line 3656
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ag:Landroid/widget/LinearLayout;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3668
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0069

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    .line 3670
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    const v1, 0x7f0d0065

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ProgressView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    .line 792
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xc

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 793
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/widget/RelativeLayout;)V

    .line 794
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xd

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 795
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/gl/GPUVideoView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    .line 796
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(Landroid/os/Handler;)V

    .line 798
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->w()V

    .line 4356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 799
    if-nez v0, :cond_3

    .line 800
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->o()I

    move-result v1

    int-to-float v1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    mul-float/2addr v1, v3

    float-to-long v4, v1

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/videolib/gl/GPUVideoView;->b(J)V

    .line 802
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    new-instance v1, Lcom/roidapp/photogrid/release/nj;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/nj;-><init>(Lcom/roidapp/photogrid/release/ng;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 809
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->az:Lcom/roidapp/videolib/gl/f;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(Lcom/roidapp/videolib/gl/f;)V

    .line 810
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xe

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 812
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_4

    .line 813
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(F)V

    .line 4830
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->av:I

    .line 4831
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aw:I

    .line 4832
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    if-nez v0, :cond_5

    .line 4833
    new-instance v0, Lcom/roidapp/photogrid/release/an;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->av:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aw:I

    invoke-direct {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/an;-><init>(Landroid/content/Context;II)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    .line 4834
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Z)V

    .line 4835
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->r:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->s:I

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->t:I

    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->u:I

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/photogrid/release/an;->a(IIII)V

    .line 820
    :cond_5
    :goto_3
    return-void

    .line 3588
    :cond_6
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    .line 820
    :catch_0
    move-exception v0

    goto :goto_3

    .line 3591
    :cond_7
    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_0

    :cond_8
    move v0, v2

    .line 3604
    goto/16 :goto_1

    .line 3623
    :cond_9
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->w:I
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 3624
    int-to-float v1, v0

    div-float/2addr v1, v3

    float-to-int v1, v1

    goto/16 :goto_2

    :cond_a
    move v0, v1

    goto/16 :goto_1
.end method

.method public final a(I)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 1864
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    .line 1865
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aB:Z

    .line 1866
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/mm;->a(I)V

    .line 1867
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 1871
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    .line 1872
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aB:Z

    .line 1873
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/mm;->a(II)V

    .line 1874
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1557
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->ap:Z

    .line 1558
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->am:Ljava/lang/String;

    .line 1559
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1560
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/mm;->a(ILjava/lang/String;)V

    .line 1561
    return-void
.end method

.method public final a(Landroid/widget/RelativeLayout;Landroid/view/View$OnTouchListener;)V
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v5, 0x0

    .line 841
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1, v5}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 843
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/gl/GPUVideoView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    .line 844
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->z()V

    .line 845
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ag()I

    move-result v1

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->af()Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(IZ)V

    .line 848
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-ne v0, v3, :cond_0

    .line 849
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const v2, 0x7f0702e1

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 853
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x64

    invoke-virtual {v0, v1, v5}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 854
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 855
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09010a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v5, v5, v5, v1}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 856
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 857
    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 858
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 861
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ProgressView;->bringToFront()V

    .line 862
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0901f9

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    .line 5356
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v3}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 6356
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v3}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 862
    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ProgressView;->a(II)V

    .line 866
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const v1, 0x7f0d03eb

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 867
    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 868
    const/4 v2, 0x0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v3}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 872
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 874
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 880
    :goto_1
    return-void

    .line 851
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    const v2, 0x7f0702e0

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-virtual {v1, v2, v3}, Landroid/app/Activity;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_0

    .line 880
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;I)V
    .locals 1

    .prologue
    .line 1313
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1315
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ng;->aa:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 1316
    iput p3, p0, Lcom/roidapp/photogrid/release/ng;->ab:I

    .line 1317
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 1318
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->a()V

    .line 1320
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/roidapp/photogrid/release/ih;->l(I)V

    .line 1321
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 1322
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 1324
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/video/e;)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 505
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 506
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    const/4 v2, 0x0

    cmpl-float v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v0, :cond_0

    .line 507
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 3356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 507
    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v2, v0, v1}, Lcom/roidapp/photogrid/video/e;->a(ZZ)V

    .line 508
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->o()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->o()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/video/e;->a(II)V

    .line 511
    :cond_0
    return-void

    :cond_1
    move v0, v1

    .line 507
    goto :goto_0
.end method

.method public final a(Lcom/roidapp/videolib/b/u;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1337
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1338
    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 1340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    if-eqz v0, :cond_0

    .line 1341
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Y:[Lcom/roidapp/videolib/b/u;

    .line 1343
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->b(Lcom/roidapp/videolib/b/u;)V

    .line 1344
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->z()V

    .line 1345
    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ng;->j(I)V

    .line 1346
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1883
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1884
    :cond_0
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    .line 1885
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aG:Z

    .line 1886
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 1888
    :cond_1
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v2, v2

    mul-int/2addr v0, v2

    div-int/lit16 v0, v0, 0x3e8

    const/4 v2, 0x3

    if-ge v0, v2, :cond_3

    .line 1889
    const/16 v0, 0xbb8

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v2, v2

    div-int/2addr v0, v2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ng;->h(I)V

    .line 1893
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-nez v0, :cond_2

    .line 1894
    const/16 v0, 0x3e8

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    .line 1895
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0901f9

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 30356
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v4}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 31356
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v4}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 1895
    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/release/ProgressView;->a(II)V

    .line 32356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1896
    if-eqz v0, :cond_4

    move v0, v1

    :goto_1
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->o(I)V

    .line 1897
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1898
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ng;->c(Z)V

    .line 1900
    :cond_2
    return-void

    .line 1891
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ap()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ng;->h(I)V

    goto :goto_0

    .line 1896
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->az:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    add-int/lit16 v0, v0, -0x3e8

    goto :goto_1
.end method

.method public final a(ZZ)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1800
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/mm;->a(ZZ)V

    .line 1801
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-eqz v0, :cond_1

    .line 1802
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    .line 1806
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->c(Z)V

    .line 1807
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1808
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1809
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2016

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1810
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2015

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1812
    if-eqz p2, :cond_3

    .line 1813
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->b()V

    .line 1814
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->a(I)V

    .line 1815
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2014

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1816
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v0, :cond_0

    .line 1823
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1824
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1830
    :cond_1
    if-eqz p2, :cond_2

    .line 1831
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    .line 1832
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->A()V

    .line 1836
    :cond_2
    return-void

    .line 1820
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->c()V

    goto :goto_0
.end method

.method protected final a([Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1252
    if-eqz p1, :cond_0

    array-length v0, p1

    const/4 v1, 0x2

    if-ge v0, v1, :cond_3

    .line 1254
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "fragmentEditVideo"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dk;

    .line 1255
    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    const-string v2, ""

    if-ne v1, v2, :cond_2

    .line 1256
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 1282
    :cond_2
    :goto_0
    return-void

    .line 1262
    :cond_3
    aget-object v0, p1, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 1263
    aget-object v1, p1, v3

    .line 1264
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 1272
    :pswitch_1
    const v0, 0xee09

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 1266
    :pswitch_2
    const v0, 0xee0c

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/photogrid/release/ng;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 1269
    :pswitch_3
    const v0, 0xee08

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/photogrid/release/ng;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 14525
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14526
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x12

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 1276
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ng;->ap:Z

    .line 1277
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aq()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->O:Ljava/lang/String;

    .line 1278
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ng;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 1260
    :catch_0
    move-exception v0

    goto :goto_0

    .line 1264
    nop

    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public final b(Z)I
    .locals 1

    .prologue
    .line 1669
    const/4 v0, 0x0

    return v0
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1565
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 26210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    .line 26212
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    .line 26213
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ak:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1568
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 1569
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 1571
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    if-eqz v0, :cond_2

    .line 1572
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->a()V

    .line 1574
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aF:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    .line 1575
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aF:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1576
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ng;->aF:Landroid/graphics/Bitmap;

    .line 1579
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    .line 1580
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 1581
    iput-object v2, p0, Lcom/roidapp/photogrid/release/ng;->aE:Landroid/graphics/Bitmap;

    .line 1583
    :cond_4
    return-void

    .line 26215
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public final b(II)V
    .locals 0

    .prologue
    .line 1674
    return-void
.end method

.method public final b(IZ)V
    .locals 0

    .prologue
    .line 1880
    return-void
.end method

.method public final c(I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1702
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1703
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v3

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/ng;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v3

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/ng;->b(FF)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    if-eqz v0, :cond_1

    .line 1704
    :cond_0
    invoke-virtual {p0, v2, v2}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 1706
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_5

    .line 1708
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v3

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/ng;->b(FF)Z

    move-result v0

    if-nez v0, :cond_7

    .line 1709
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aD:F

    .line 1710
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->z()V

    move v0, v1

    .line 1713
    :goto_0
    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->aC:F

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/release/ng;->b(FF)Z

    move-result v3

    if-nez v3, :cond_6

    .line 1715
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->A()V

    .line 1719
    :goto_1
    if-nez v1, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    if-eqz v0, :cond_3

    .line 1720
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->a()V

    .line 1721
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    if-eqz v0, :cond_4

    .line 1722
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aA:Z

    .line 1738
    :cond_4
    :goto_2
    return-void

    .line 1725
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/widget/RelativeLayout;)V

    .line 1728
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/videolib/gl/GPUVideoView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    .line 1729
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-nez v0, :cond_4

    .line 1734
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->a()V

    goto :goto_2

    :cond_6
    move v1, v0

    goto :goto_1

    :cond_7
    move v0, v2

    goto :goto_0
.end method

.method public final c(II)V
    .locals 0

    .prologue
    .line 1678
    return-void
.end method

.method public final c(IZ)V
    .locals 4

    .prologue
    const/4 v3, 0x2

    const v2, 0x41273333    # 10.45f

    .line 514
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 515
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(IZ)V

    .line 517
    :cond_0
    iput-boolean p2, p0, Lcom/roidapp/photogrid/release/ng;->aL:Z

    .line 518
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->aL:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->i(Z)V

    .line 519
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->m(I)V

    .line 521
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aL:Z

    if-eqz v0, :cond_3

    .line 522
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    cmpg-float v0, v0, v2

    if-gez v0, :cond_1

    .line 523
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 524
    :cond_1
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/ng;->c(I)V

    .line 529
    :cond_2
    :goto_0
    return-void

    .line 525
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aL:Z

    if-nez v0, :cond_2

    .line 526
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->U()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->e(F)V

    .line 527
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/ng;->c(I)V

    goto :goto_0
.end method

.method public final d(I)V
    .locals 0

    .prologue
    .line 1552
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/mm;->d(I)V

    .line 1553
    return-void
.end method

.method public final e(I)V
    .locals 3

    .prologue
    .line 1590
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/mm;->e(I)V

    .line 1596
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-eqz v0, :cond_1

    .line 1597
    const/high16 v0, 0x3f800000    # 1.0f

    int-to-float v1, p1

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1598
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    if-eqz v0, :cond_0

    .line 1599
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ProgressView;->a(I)V

    .line 1602
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->p(I)V

    .line 1604
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    if-eqz v0, :cond_1

    .line 1605
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    if-le v0, p1, :cond_2

    .line 1606
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    invoke-interface {v0, p1, v1}, Lcom/roidapp/photogrid/video/e;->a(II)V

    .line 1611
    :cond_1
    :goto_0
    return-void

    .line 1608
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/video/e;->a(ZZ)V

    goto :goto_0
.end method

.method public final f(I)Lcom/roidapp/videolib/gl/a;
    .locals 1

    .prologue
    .line 498
    .line 2356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 498
    if-eqz v0, :cond_0

    .line 499
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    rem-int/2addr p1, v0

    .line 501
    :cond_0
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->q(I)Lcom/roidapp/videolib/gl/a;

    move-result-object v0

    return-object v0
.end method

.method public final f()V
    .locals 0

    .prologue
    .line 1682
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 1659
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ae:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1660
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ae:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1663
    :cond_0
    return-void
.end method

.method protected final g(I)V
    .locals 1

    .prologue
    .line 1291
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->R:I

    .line 1292
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->o(I)V

    .line 1293
    return-void
.end method

.method public final h()V
    .locals 0

    .prologue
    .line 1851
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->x()V

    .line 1852
    return-void
.end method

.method protected final h(I)V
    .locals 2

    .prologue
    .line 1301
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    .line 1302
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    mul-int/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    .line 1303
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 1304
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 1748
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 1749
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->onResume()V

    .line 1751
    :cond_0
    return-void
.end method

.method public final i(I)V
    .locals 1

    .prologue
    .line 1327
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->v:Z

    .line 1329
    iput p1, p0, Lcom/roidapp/photogrid/release/ng;->ab:I

    .line 1330
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 1331
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->a()V

    .line 1332
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/ih;->l(I)V

    .line 1334
    return-void
.end method

.method public final j()V
    .locals 1

    .prologue
    .line 1754
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 1755
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->onPause()V

    .line 1756
    :cond_0
    return-void
.end method

.method protected final j(I)V
    .locals 6

    .prologue
    const/16 v4, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1363
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->B()V

    .line 1364
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    .line 1366
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    mul-int/2addr v0, p1

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    div-int/2addr v0, v3

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 1367
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1368
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1372
    if-eqz v0, :cond_2

    .line 1373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1374
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    .line 1380
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v3, 0x6

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1381
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v3, 0x7

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1382
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v3, 0x2016

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 16356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1384
    if-eqz v0, :cond_3

    .line 1385
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1386
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    const-wide/16 v4, 0x0

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(J)V

    .line 1387
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 1394
    :goto_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->u()V

    .line 1395
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v0, :cond_1

    .line 1396
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 17356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1396
    if-nez v0, :cond_4

    move v0, v1

    :goto_2
    invoke-interface {v3, v0, v2}, Lcom/roidapp/photogrid/video/e;->a(ZZ)V

    .line 18356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1397
    if-nez v0, :cond_0

    if-nez p1, :cond_1

    .line 1398
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    invoke-interface {v0, v2, v3}, Lcom/roidapp/photogrid/video/e;->a(II)V

    .line 1400
    :cond_1
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    .line 1401
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    .line 1402
    return-void

    .line 1376
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1377
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    goto :goto_0

    .line 1390
    :cond_3
    int-to-float v0, p1

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    int-to-float v3, v3

    div-float/2addr v0, v3

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1391
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(I)V

    .line 1392
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    mul-int/2addr v0, p1

    iget v3, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    div-int/2addr v0, v3

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    goto :goto_1

    :cond_4
    move v0, v2

    .line 1396
    goto :goto_2
.end method

.method public final k(I)V
    .locals 2

    .prologue
    .line 2121
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->i:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    if-nez v0, :cond_1

    .line 2136
    :cond_0
    :goto_0
    return-void

    .line 2123
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 2125
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-eqz v0, :cond_2

    .line 2126
    int-to-float v0, p1

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 2127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/gl/GPUVideoView;->b(I)V

    .line 2128
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    mul-int/2addr v0, p1

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    div-int/2addr v0, v1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 2129
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->x()V

    goto :goto_0

    .line 2136
    :catch_0
    move-exception v0

    goto :goto_0

    .line 2131
    :cond_2
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/release/ng;->j(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public final l(I)V
    .locals 4

    .prologue
    .line 2141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    if-ltz p1, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->ao:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->at:I

    if-nez v0, :cond_1

    .line 2156
    :cond_0
    :goto_0
    return-void

    .line 2143
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 2145
    int-to-float v1, p1

    .line 38356
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 2145
    if-eqz v0, :cond_2

    const/16 v0, 0x3a98

    :goto_1
    int-to-float v0, v0

    div-float v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 2146
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/videolib/gl/GPUVideoView;->b(J)V

    .line 2147
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 2148
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-nez v0, :cond_3

    .line 2149
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    goto :goto_0

    .line 2156
    :catch_0
    move-exception v0

    goto :goto_0

    .line 2145
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v0, v2

    goto :goto_1

    .line 2151
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public final m()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1349
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->i(Z)V

    .line 1350
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v0, :cond_0

    .line 1351
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(IZ)V

    .line 1353
    :cond_0
    return-void
.end method

.method protected final n()V
    .locals 10

    .prologue
    const v9, 0x3f7851ec    # 0.97f

    const/4 v8, 0x0

    const/16 v1, 0x8

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 1443
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    if-nez v0, :cond_0

    .line 1444
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->B()V

    .line 1446
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1447
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ai:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 22356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1448
    if-eqz v0, :cond_2

    .line 1449
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1450
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    .line 1455
    :goto_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 23356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1457
    if-eqz v0, :cond_3

    const/16 v0, 0x3a98

    .line 1458
    :goto_1
    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 24356
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v1

    .line 1458
    if-eqz v1, :cond_4

    const/16 v1, 0x3a98

    :goto_2
    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-double v4, v1

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    add-double/2addr v4, v6

    double-to-int v1, v4

    .line 1461
    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    if-eqz v4, :cond_5

    .line 1462
    iget-boolean v4, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    if-eqz v4, :cond_1

    .line 1463
    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v1, v4

    if-lt v1, v0, :cond_1

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    cmpl-float v0, v0, v9

    if-ltz v0, :cond_1

    .line 1466
    iput v8, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 1467
    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ng;->l(I)V

    .line 1470
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->d()V

    .line 1471
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->x()V

    .line 1491
    :goto_3
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    .line 1492
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ng;->aS:Z

    .line 1493
    return-void

    .line 1452
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/ProgressView;->a(Z)V

    .line 1453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ProgressView;->setVisibility(I)V

    goto :goto_0

    .line 1457
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    goto :goto_1

    .line 1458
    :cond_4
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v5, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v1, v5

    goto :goto_2

    .line 1475
    :cond_5
    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->T:I

    div-int/lit8 v4, v4, 0x2

    add-int/2addr v4, v1

    if-lt v4, v0, :cond_6

    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    cmpl-float v0, v0, v9

    if-gez v0, :cond_7

    :cond_6
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v4

    if-ltz v0, :cond_a

    .line 1478
    :cond_7
    iput v8, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    move v0, v2

    .line 1480
    :goto_4
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->u()V

    .line 1481
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    if-eqz v1, :cond_8

    .line 1482
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    .line 25356
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v1

    .line 1482
    if-nez v1, :cond_9

    move v1, v3

    :goto_5
    invoke-interface {v4, v1, v2}, Lcom/roidapp/photogrid/video/e;->a(ZZ)V

    .line 1483
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->aI:Lcom/roidapp/photogrid/video/e;

    iget v4, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    iget v5, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    int-to-float v5, v5

    mul-float/2addr v4, v5

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v4, v4

    iget v5, p0, Lcom/roidapp/photogrid/release/ng;->au:I

    invoke-interface {v1, v4, v5}, Lcom/roidapp/photogrid/video/e;->a(II)V

    .line 1486
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    int-to-long v4, v0

    invoke-virtual {v1, v4, v5}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(J)V

    .line 1487
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 1489
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ng;->aN:Z

    goto :goto_3

    :cond_9
    move v1, v2

    .line 1482
    goto :goto_5

    :cond_a
    move v0, v1

    goto :goto_4
.end method

.method public final o()I
    .locals 2

    .prologue
    .line 1614
    .line 26356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1614
    if-eqz v0, :cond_0

    const/16 v0, 0x3a98

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 0

    .prologue
    .line 1790
    return-void
.end method

.method public final onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 2277
    packed-switch p2, :pswitch_data_0

    .line 2284
    :goto_0
    return v0

    .line 2279
    :pswitch_0
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->ac:Z

    goto :goto_0

    .line 2277
    :pswitch_data_0
    .packed-switch 0x321
        :pswitch_0
    .end packed-switch
.end method

.method public final onPrepared(Landroid/media/MediaPlayer;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 1765
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->am:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    .line 1766
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Q:Ljava/lang/String;

    .line 1767
    invoke-virtual {p1}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ng;->S:I

    .line 1768
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->ap:Z

    if-eqz v0, :cond_0

    .line 28532
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->af:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 28533
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->l:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 1770
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ng;->y()V

    .line 1771
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v1, 0x7f0d03ec

    new-instance v2, Lcom/roidapp/photogrid/release/el;

    invoke-direct {v2}, Lcom/roidapp/photogrid/release/el;-><init>()V

    const-string v3, "fragmentEditVideoPopupMusic"

    invoke-virtual {v0, v1, v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 1775
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "fragmentEditVideo"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/dk;

    .line 1776
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/dk;->a(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1781
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aM:Z

    if-eqz v0, :cond_1

    .line 1782
    iget v1, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    .line 29356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1782
    if-eqz v0, :cond_2

    const/16 v0, 0x3a98

    :goto_1
    int-to-float v0, v0

    mul-float/2addr v0, v1

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->n(I)V

    .line 1783
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ng;->aM:Z

    .line 1786
    :cond_1
    return-void

    .line 1782
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aq:I

    iget v2, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    sub-int/2addr v0, v2

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final p()I
    .locals 3

    .prologue
    .line 1616
    const/4 v0, 0x0

    .line 1617
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    if-eqz v1, :cond_0

    .line 1618
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ah:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->e()I

    move-result v0

    .line 1619
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    .line 27356
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v2}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v2

    .line 1620
    if-eqz v2, :cond_1

    if-eqz v1, :cond_1

    .line 1621
    array-length v2, v1

    if-eqz v2, :cond_1

    array-length v1, v1

    rem-int/2addr v0, v1

    .line 1623
    :cond_1
    return v0
.end method

.method public final q()F
    .locals 1

    .prologue
    .line 1632
    iget v0, p0, Lcom/roidapp/photogrid/release/ng;->aP:F

    return v0
.end method

.method public final r()V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1903
    const-string v0, ""

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1904
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    .line 1905
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->aG:Z

    .line 1906
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x0

    iput-object v2, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c:Lcom/roidapp/photogrid/release/oi;

    .line 1908
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ng;->U:Z

    if-nez v0, :cond_1

    .line 1909
    iput v1, p0, Lcom/roidapp/photogrid/release/ng;->ar:I

    .line 1910
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ax:Lcom/roidapp/photogrid/release/ProgressView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ng;->h:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0901f9

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    .line 33356
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v4}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 34356
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v4}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    .line 1910
    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/release/ProgressView;->a(II)V

    .line 35356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->Z:Lcom/roidapp/videolib/b/u;

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v0

    .line 1911
    if-eqz v0, :cond_2

    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ng;->o(I)V

    .line 1912
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeMessages(I)V

    .line 1913
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ng;->c(Z)V

    .line 1915
    :cond_1
    return-void

    .line 1911
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->az:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final s()V
    .locals 2

    .prologue
    .line 2112
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2113
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2114
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2016

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2115
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2015

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2116
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->K:Landroid/os/Handler;

    const/16 v1, 0x2014

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2117
    return-void
.end method

.method public final t()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 2270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ng;->ad:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    return-object v0
.end method
