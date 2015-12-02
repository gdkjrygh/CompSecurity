.class public Lcom/facebook/orca/photos/view/PhotoViewActivity;
.super Lcom/facebook/base/activity/i;
.source "PhotoViewActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private A:Lcom/facebook/orca/photos/c/a;

.field private B:Lcom/facebook/orca/threads/n;

.field private C:Lcom/facebook/messages/model/threads/Message;

.field private final D:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private final E:Landroid/view/GestureDetector$SimpleOnGestureListener;

.field private p:Landroid/widget/Gallery;

.field private q:Lcom/facebook/orca/photos/view/a;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Landroid/widget/FrameLayout;

.field private t:Landroid/view/GestureDetector;

.field private u:Landroid/widget/TextView;

.field private v:Lcom/facebook/user/tiles/UserTileView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Lcom/facebook/orca/emoji/z;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 125
    new-instance v0, Lcom/facebook/orca/photos/view/d;

    invoke-direct {v0, p0}, Lcom/facebook/orca/photos/view/d;-><init>(Lcom/facebook/orca/photos/view/PhotoViewActivity;)V

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->D:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 160
    new-instance v0, Lcom/facebook/orca/photos/view/e;

    invoke-direct {v0, p0}, Lcom/facebook/orca/photos/view/e;-><init>(Lcom/facebook/orca/photos/view/PhotoViewActivity;)V

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->E:Landroid/view/GestureDetector$SimpleOnGestureListener;

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/photos/view/PhotoViewActivity;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->k()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/Gallery;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->u:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Lcom/facebook/orca/emoji/z;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->z:Lcom/facebook/orca/emoji/z;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Lcom/facebook/user/tiles/UserTileView;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->v:Lcom/facebook/user/tiles/UserTileView;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->w:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Lcom/facebook/orca/threads/n;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->B:Lcom/facebook/orca/threads/n;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->x:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->r:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->y:Landroid/widget/TextView;

    return-object v0
.end method

.method private j()Z
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 212
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    invoke-virtual {v0}, Landroid/widget/Gallery;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/view/b;

    invoke-virtual {v0}, Lcom/facebook/orca/photos/view/b;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 216
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 218
    :cond_1
    return-void
.end method

.method static synthetic k(Lcom/facebook/orca/photos/view/PhotoViewActivity;)Z
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->j()Z

    move-result v0

    return v0
.end method

.method private l()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 221
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 223
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->s:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 225
    :cond_0
    return-void
.end method

.method static synthetic l(Lcom/facebook/orca/photos/view/PhotoViewActivity;)V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->l()V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 69
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 71
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/threads/n;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->B:Lcom/facebook/orca/threads/n;

    .line 72
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/emoji/z;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/emoji/z;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->z:Lcom/facebook/orca/emoji/z;

    .line 73
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->i()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/photos/c/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/c/a;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->A:Lcom/facebook/orca/photos/c/a;

    .line 74
    sget v0, Lcom/facebook/k;->orca_photo_view:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->setContentView(I)V

    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->getIntent()Landroid/content/Intent;

    move-result-object v3

    .line 77
    const-string v0, "imageData"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 78
    if-nez v0, :cond_0

    .line 79
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->finish()V

    .line 123
    :goto_0
    return-void

    .line 83
    :cond_0
    const-string v1, "message"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 84
    const-string v1, "message"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/messages/model/threads/Message;

    iput-object v1, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->C:Lcom/facebook/messages/model/threads/Message;

    .line 87
    :cond_1
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 89
    const-string v1, "imageAttachments"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 90
    const-string v1, "imageAttachments"

    invoke-virtual {v3, v1}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 93
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v3, v2

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/orca/attachments/ImageAttachmentData;

    .line 94
    new-instance v6, Lcom/facebook/orca/photos/view/b;

    invoke-virtual {v1}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v7

    iget-object v8, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->f()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v6, v7, v8, v9}, Lcom/facebook/orca/photos/view/b;-><init>(Landroid/net/Uri;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {v1}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v3, v2

    .line 100
    :cond_2
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 103
    :cond_3
    new-instance v1, Lcom/facebook/orca/photos/view/b;

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->b()Landroid/net/Uri;

    move-result-object v3

    const/4 v5, 0x0

    invoke-virtual {v0}, Lcom/facebook/orca/attachments/ImageAttachmentData;->f()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v5, v0}, Lcom/facebook/orca/photos/view/b;-><init>(Landroid/net/Uri;Lcom/facebook/messages/model/threads/Message;Ljava/lang/String;)V

    invoke-interface {v4, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v3, v2

    .line 108
    :cond_4
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->E:Landroid/view/GestureDetector$SimpleOnGestureListener;

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->t:Landroid/view/GestureDetector;

    .line 110
    sget v0, Lcom/facebook/i;->gallery:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Gallery;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    .line 111
    new-instance v0, Lcom/facebook/orca/photos/view/a;

    invoke-direct {v0, p0, v4}, Lcom/facebook/orca/photos/view/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->q:Lcom/facebook/orca/photos/view/a;

    .line 112
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    iget-object v1, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->q:Lcom/facebook/orca/photos/view/a;

    invoke-virtual {v0, v1}, Landroid/widget/Gallery;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    iget-object v1, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->D:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v1}, Landroid/widget/Gallery;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 114
    sget v0, Lcom/facebook/i;->message_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->r:Landroid/widget/RelativeLayout;

    .line 115
    sget v0, Lcom/facebook/i;->message_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->u:Landroid/widget/TextView;

    .line 116
    sget v0, Lcom/facebook/i;->message_user_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->v:Lcom/facebook/user/tiles/UserTileView;

    .line 117
    sget v0, Lcom/facebook/i;->message_user:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->w:Landroid/widget/TextView;

    .line 118
    sget v0, Lcom/facebook/i;->message_time:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->x:Landroid/widget/TextView;

    .line 119
    sget v0, Lcom/facebook/i;->photo_count_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->y:Landroid/widget/TextView;

    .line 120
    sget v0, Lcom/facebook/i;->photo_count_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->b(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->s:Landroid/widget/FrameLayout;

    .line 122
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    invoke-virtual {v0, v3}, Landroid/widget/Gallery;->setSelection(I)V

    goto/16 :goto_0
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->t:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 64
    sget-object v0, Lcom/facebook/analytics/f/a;->PHOTO_VIEW_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    .prologue
    .line 180
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 181
    invoke-static {}, Lcom/facebook/orca/photos/c/a;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 182
    invoke-virtual {p0}, Lcom/facebook/orca/photos/view/PhotoViewActivity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 183
    sget v1, Lcom/facebook/l;->photo_view_activity_menu:I

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 184
    const/4 v0, 0x1

    .line 187
    :cond_0
    return v0
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 3

    .prologue
    .line 192
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    sget v1, Lcom/facebook/i;->menu_item_save_image:I

    if-ne v0, v1, :cond_1

    .line 193
    iget-object v0, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->p:Landroid/widget/Gallery;

    invoke-virtual {v0}, Landroid/widget/Gallery;->getSelectedItemPosition()I

    move-result v0

    .line 194
    iget-object v1, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->q:Lcom/facebook/orca/photos/view/a;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/photos/view/a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_0

    instance-of v1, v0, Lcom/facebook/orca/photos/view/b;

    if-eqz v1, :cond_0

    .line 196
    check-cast v0, Lcom/facebook/orca/photos/view/b;

    .line 197
    invoke-virtual {v0}, Lcom/facebook/orca/photos/view/b;->a()Landroid/net/Uri;

    move-result-object v1

    .line 198
    invoke-virtual {v0}, Lcom/facebook/orca/photos/view/b;->c()Ljava/lang/String;

    move-result-object v0

    .line 199
    iget-object v2, p0, Lcom/facebook/orca/photos/view/PhotoViewActivity;->A:Lcom/facebook/orca/photos/c/a;

    invoke-virtual {v2, v1, v0}, Lcom/facebook/orca/photos/c/a;->a(Landroid/net/Uri;Ljava/lang/String;)V

    .line 201
    :cond_0
    const/4 v0, 0x1

    .line 203
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method
