.class public Lcom/facebook/orca/threadlist/q;
.super Lcom/facebook/widget/CustomRelativeLayout;
.source "ThreadItemView.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/regex/Pattern;


# instance fields
.field private c:Lcom/facebook/orca/f/k;

.field private d:Lcom/facebook/orca/f/z;

.field private e:Lcom/facebook/orca/threads/n;

.field private f:Lcom/facebook/orca/threads/q;

.field private g:Lcom/facebook/orca/emoji/z;

.field private h:Lcom/facebook/orca/common/ui/widgets/text/a;

.field private i:Lcom/facebook/orca/photos/a/e;

.field private j:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private k:Landroid/widget/ImageView;

.field private l:Lcom/facebook/widget/tiles/ThreadTileView;

.field private m:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/ImageView;

.field private p:Lcom/facebook/orca/threads/ThreadSummary;

.field private q:Lcom/facebook/orca/threadlist/al;

.field private r:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lcom/facebook/orca/p/b;

.field private u:Lcom/facebook/orca/p/d;

.field private v:Lcom/facebook/l/x;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 58
    const-class v0, Lcom/facebook/orca/threadlist/q;

    sput-object v0, Lcom/facebook/orca/threadlist/q;->a:Ljava/lang/Class;

    .line 60
    const-string v0, "\\n+"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/orca/threadlist/q;->b:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 87
    invoke-direct {p0, p1}, Lcom/facebook/widget/CustomRelativeLayout;-><init>(Landroid/content/Context;)V

    .line 84
    sget-object v0, Lcom/facebook/l/x;->a:Lcom/facebook/l/x;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->v:Lcom/facebook/l/x;

    .line 88
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/q;->a(Landroid/content/Context;)V

    .line 89
    return-void
.end method

.method private static a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 233
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const-string v0, "<null>"

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 102
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/q;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 103
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    .line 104
    const-class v0, Lcom/facebook/orca/f/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/z;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->d:Lcom/facebook/orca/f/z;

    .line 105
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->e:Lcom/facebook/orca/threads/n;

    .line 106
    const-class v0, Lcom/facebook/orca/threads/q;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/q;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->f:Lcom/facebook/orca/threads/q;

    .line 107
    const-class v0, Lcom/facebook/orca/emoji/z;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/z;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->g:Lcom/facebook/orca/emoji/z;

    .line 108
    const-class v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/a;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->h:Lcom/facebook/orca/common/ui/widgets/text/a;

    .line 110
    const-class v0, Lcom/facebook/orca/photos/a/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/a/e;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->i:Lcom/facebook/orca/photos/a/e;

    .line 113
    sget v0, Lcom/facebook/k;->orca_thread_list_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->setContentView(I)V

    .line 115
    sget v0, Lcom/facebook/i;->thread_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->j:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 116
    sget v0, Lcom/facebook/i;->thread_presence_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    .line 117
    sget v0, Lcom/facebook/i;->thread_tile_img:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/tiles/ThreadTileView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->l:Lcom/facebook/widget/tiles/ThreadTileView;

    .line 118
    sget v0, Lcom/facebook/i;->thread_last_msg:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->m:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    .line 119
    sget v0, Lcom/facebook/i;->thread_time:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->n:Landroid/widget/TextView;

    .line 120
    sget v0, Lcom/facebook/i;->thread_failed_icon:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->o:Landroid/widget/ImageView;

    .line 122
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsThreadlistOnlinePresenceEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->r:Ljavax/inject/a;

    .line 124
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsThreadlistOnlineAndMobilePresenceEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->s:Ljavax/inject/a;

    .line 126
    const-class v0, Lcom/facebook/orca/p/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/p/b;

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    .line 127
    new-instance v0, Lcom/facebook/orca/threadlist/r;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/r;-><init>(Lcom/facebook/orca/threadlist/q;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/q;->u:Lcom/facebook/orca/p/d;

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/q;->u:Lcom/facebook/orca/p/d;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/p/d;)V

    .line 134
    return-void
.end method

.method private a(Lcom/facebook/l/x;)V
    .locals 1

    .prologue
    .line 170
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->v:Lcom/facebook/l/x;

    if-ne v0, p1, :cond_0

    .line 174
    :goto_0
    return-void

    .line 173
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/q;->b(Lcom/facebook/l/x;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/l/x;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 189
    invoke-virtual {p1}, Lcom/facebook/l/x;->a()Lcom/facebook/l/a;

    move-result-object v0

    sget-object v1, Lcom/facebook/l/a;->AVAILABLE:Lcom/facebook/l/a;

    if-ne v0, v1, :cond_0

    .line 190
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_online_icon_thread:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 191
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 198
    :goto_0
    return-void

    .line 192
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/l/x;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    sget v1, Lcom/facebook/h;->orca_mobile_icon_thread:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 194
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 196
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->k:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/q;Lcom/facebook/l/x;)V
    .locals 0

    .prologue
    .line 56
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/l/x;)V

    return-void
.end method

.method private a(Lcom/facebook/orca/threadview/v;)V
    .locals 1

    .prologue
    .line 246
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/p/b;->a(Lcom/facebook/orca/threadview/v;)V

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/q;->b(Lcom/facebook/l/x;)V

    .line 248
    return-void
.end method

.method private a(Z)V
    .locals 2

    .prologue
    .line 270
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->q:Lcom/facebook/orca/threadlist/al;

    sget-object v1, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    if-ne v0, v1, :cond_1

    .line 271
    if-eqz p1, :cond_0

    sget v0, Lcom/facebook/h;->orca_thread_list_item_unread_background:I

    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->setBackgroundResource(I)V

    .line 278
    :goto_1
    return-void

    .line 271
    :cond_0
    sget v0, Lcom/facebook/h;->orca_thread_list_read_item_background:I

    goto :goto_0

    .line 276
    :cond_1
    const v0, 0x106000d

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadlist/q;->setBackgroundResource(I)V

    goto :goto_1
.end method

.method private b(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/CharSequence;
    .locals 12

    .prologue
    const/4 v3, 0x0

    .line 281
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->o()Ljava/lang/String;

    move-result-object v0

    .line 282
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 351
    :goto_0
    return-object v0

    .line 286
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->n()Ljava/lang/String;

    move-result-object v0

    .line 287
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->p()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    .line 288
    if-eqz v0, :cond_1

    if-nez v2, :cond_2

    .line 289
    :cond_1
    const-string v0, ""

    goto :goto_0

    .line 293
    :cond_2
    sget-object v1, Lcom/facebook/orca/threadlist/q;->b:Ljava/util/regex/Pattern;

    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 294
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 295
    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 302
    :goto_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/q;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 303
    new-instance v6, Lcom/facebook/common/w/o;

    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/q;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {v6, v0}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 304
    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    iget-object v4, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v4}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 305
    sget v0, Lcom/facebook/h;->orca_reply_arrow:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 306
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 307
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->f:Lcom/facebook/orca/threads/q;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/threads/q;->b(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v0

    .line 309
    if-eqz v0, :cond_9

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v7

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v9

    cmp-long v0, v7, v9

    if-gez v0, :cond_9

    .line 311
    sget v0, Lcom/facebook/h;->orca_inbox_seen:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 326
    :goto_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    invoke-virtual {v0, v3, v3, v2, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 327
    new-instance v2, Landroid/text/style/ImageSpan;

    invoke-direct {v2, v0}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 328
    const/16 v0, 0x21

    invoke-virtual {v6, v2, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 329
    const-string v0, "\u00a0"

    invoke-virtual {v6, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 330
    invoke-virtual {v6}, Lcom/facebook/common/w/o;->a()Lcom/facebook/common/w/o;

    .line 331
    const-string v0, "\u00a0"

    invoke-virtual {v6, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 332
    invoke-virtual {v6, v1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 348
    :goto_3
    invoke-virtual {v6}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    .line 349
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/q;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->b(Landroid/content/Context;F)I

    move-result v1

    .line 350
    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->g:Lcom/facebook/orca/emoji/z;

    invoke-virtual {v2, v0, v1}, Lcom/facebook/orca/emoji/z;->a(Landroid/text/Spannable;I)V

    goto/16 :goto_0

    .line 314
    :cond_3
    const/4 v4, 0x1

    .line 315
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->j()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/ThreadParticipant;

    .line 316
    iget-object v8, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v8}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v8

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->d()Lcom/facebook/user/UserKey;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v8

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadParticipant;->i()J

    move-result-wide v10

    cmp-long v0, v8, v10

    if-ltz v0, :cond_4

    move v0, v3

    .line 322
    :goto_4
    if-eqz v0, :cond_9

    .line 323
    sget v0, Lcom/facebook/h;->orca_inbox_seen:I

    invoke-virtual {v5, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_2

    .line 333
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->d:Lcom/facebook/orca/f/z;

    invoke-virtual {v0, p1}, Lcom/facebook/orca/f/z;->c(Lcom/facebook/orca/threads/ThreadSummary;)I

    move-result v0

    const/4 v3, 0x2

    if-ne v0, v3, :cond_6

    .line 334
    invoke-virtual {v6, v1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto :goto_3

    .line 337
    :cond_6
    invoke-virtual {p1}, Lcom/facebook/orca/threads/ThreadSummary;->f()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 338
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/k;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v0

    .line 339
    if-eqz v0, :cond_7

    .line 340
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ": "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto/16 :goto_3

    .line 342
    :cond_7
    invoke-virtual {v6, v1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto/16 :goto_3

    .line 345
    :cond_8
    invoke-virtual {v6, v1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    goto/16 :goto_3

    :cond_9
    move-object v0, v2

    goto/16 :goto_2

    :cond_a
    move v0, v4

    goto :goto_4

    :cond_b
    move-object v1, v0

    goto/16 :goto_1
.end method

.method private b(Lcom/facebook/l/x;)V
    .locals 2

    .prologue
    .line 177
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->s:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    :goto_0
    return-void

    .line 182
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/threadlist/q;->v:Lcom/facebook/l/x;

    .line 183
    iget-object v1, p0, Lcom/facebook/orca/threadlist/q;->v:Lcom/facebook/l/x;

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->s:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/l/x;Z)V

    goto :goto_0
.end method

.method private d()V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->h:Lcom/facebook/orca/common/ui/widgets/text/a;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/text/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/orca/threadview/v;

    move-result-object v0

    .line 253
    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->j:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v2, v0}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 254
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/orca/threadview/v;)V

    .line 255
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->l:Lcom/facebook/widget/tiles/ThreadTileView;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->i:Lcom/facebook/orca/photos/a/e;

    iget-object v3, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2, v3}, Lcom/facebook/orca/photos/a/e;->a(Lcom/facebook/orca/threads/ThreadSummary;)Lcom/facebook/widget/tiles/j;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/tiles/ThreadTileView;->setThreadTileViewData(Lcom/facebook/widget/tiles/j;)V

    .line 257
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->m:Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-direct {p0, v2}, Lcom/facebook/orca/threadlist/q;->b(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/common/ui/widgets/text/MultilineEllipsizeTextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->n:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->e:Lcom/facebook/orca/threads/n;

    iget-object v3, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v3}, Lcom/facebook/orca/threads/ThreadSummary;->l()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/threads/n;->a(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 259
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;)J

    move-result-wide v2

    .line 260
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v4

    cmp-long v0, v2, v4

    if-gez v0, :cond_0

    const/4 v0, 0x1

    .line 261
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(Z)V

    .line 262
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->o:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 267
    :goto_1
    return-void

    :cond_0
    move v0, v1

    .line 260
    goto :goto_0

    .line 265
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->o:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method a()V
    .locals 4

    .prologue
    .line 225
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->q:Lcom/facebook/orca/threadlist/al;

    sget-object v1, Lcom/facebook/orca/threadlist/al;->NORMAL:Lcom/facebook/orca/threadlist/al;

    if-ne v0, v1, :cond_0

    .line 226
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->c:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v1}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->a(Ljava/lang/String;)J

    move-result-wide v0

    .line 227
    iget-object v2, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2}, Lcom/facebook/orca/threads/ThreadSummary;->c()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, 0x1

    .line 228
    :goto_0
    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/q;->a(Z)V

    .line 230
    :cond_0
    return-void

    .line 227
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threadlist/al;)V
    .locals 5

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->q:Lcom/facebook/orca/threadlist/al;

    if-eq p2, v0, :cond_1

    .line 202
    :cond_0
    sget-object v0, Lcom/facebook/orca/threadlist/q;->a:Ljava/lang/Class;

    const-string v1, "addThreadToThreadList (%s to %s)"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-static {v4}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-static {p1}, Lcom/facebook/orca/threadlist/q;->a(Lcom/facebook/orca/threads/ThreadSummary;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iput-object p1, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    .line 205
    iput-object p2, p0, Lcom/facebook/orca/threadlist/q;->q:Lcom/facebook/orca/threadlist/al;

    .line 206
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/q;->d()V

    .line 214
    :goto_0
    return-void

    .line 212
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadlist/q;->a()V

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .prologue
    .line 406
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method getThreadId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method getThreadSummary()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 217
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 138
    invoke-super {p0}, Lcom/facebook/widget/CustomRelativeLayout;->onAttachedToWindow()V

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    invoke-virtual {v0}, Lcom/facebook/orca/p/b;->c()Lcom/facebook/l/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/q;->b(Lcom/facebook/l/x;)V

    .line 141
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 145
    invoke-super {p0}, Lcom/facebook/widget/CustomRelativeLayout;->onDetachedFromWindow()V

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->t:Lcom/facebook/orca/p/b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/orca/p/b;->a(Z)V

    .line 147
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 160
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ThreadItemView.onLayout ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 161
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/CustomRelativeLayout;->onLayout(ZIIII)V

    .line 162
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 163
    return-void

    .line 159
    :cond_0
    const-string v0, "<none>"

    goto :goto_0
.end method

.method protected onMeasure(II)V
    .locals 3

    .prologue
    .line 151
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->p:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->a()Ljava/lang/String;

    move-result-object v0

    .line 152
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ThreadItemView.onMeasure ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v0

    .line 153
    invoke-super {p0, p1, p2}, Lcom/facebook/widget/CustomRelativeLayout;->onMeasure(II)V

    .line 154
    invoke-virtual {v0}, Lcom/facebook/debug/d/e;->a()J

    .line 155
    return-void

    .line 151
    :cond_0
    const-string v0, "<none>"

    goto :goto_0
.end method

.method public setThreadIconSize(I)V
    .locals 2

    .prologue
    .line 383
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->l:Lcom/facebook/widget/tiles/ThreadTileView;

    invoke-virtual {v0}, Lcom/facebook/widget/tiles/ThreadTileView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 385
    iput p1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 386
    iput p1, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 387
    iget-object v1, p0, Lcom/facebook/orca/threadlist/q;->l:Lcom/facebook/widget/tiles/ThreadTileView;

    invoke-virtual {v1, p1}, Lcom/facebook/widget/tiles/ThreadTileView;->setTileSizePx(I)V

    .line 388
    iget-object v1, p0, Lcom/facebook/orca/threadlist/q;->l:Lcom/facebook/widget/tiles/ThreadTileView;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/tiles/ThreadTileView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 389
    return-void
.end method

.method public setThreadNameColor(I)V
    .locals 1

    .prologue
    .line 367
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->j:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, p1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setTextColor(I)V

    .line 368
    return-void
.end method

.method public setThreadNameSize(I)V
    .locals 1

    .prologue
    .line 375
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->j:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, p1, p1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->a(II)V

    .line 376
    return-void
.end method

.method public setTimeTextColor(I)V
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Lcom/facebook/orca/threadlist/q;->n:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 360
    return-void
.end method
