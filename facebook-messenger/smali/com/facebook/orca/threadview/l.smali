.class public Lcom/facebook/orca/threadview/l;
.super Lcom/facebook/widget/e;
.source "MessageItemView.java"


# instance fields
.field private A:Lcom/facebook/orca/threadview/r;

.field private B:Lcom/facebook/orca/threadview/ad;

.field private C:Lcom/facebook/messages/model/threads/Message;

.field private D:Z

.field private a:Lcom/facebook/orca/f/k;

.field private b:Lcom/facebook/orca/common/ui/a/b;

.field private c:Lcom/facebook/orca/threads/n;

.field private d:Lcom/facebook/orca/share/a;

.field private e:Lcom/facebook/orca/attachments/a;

.field private f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/facebook/analytics/cn;

.field private h:Lcom/facebook/user/UserKey;

.field private i:Landroid/widget/FrameLayout;

.field private j:Landroid/widget/LinearLayout;

.field private k:Lcom/facebook/widget/text/BetterTextView;

.field private l:Landroid/widget/TextView;

.field private m:Lcom/facebook/user/tiles/UserTileView;

.field private n:Lcom/facebook/orca/share/ShareView;

.field private o:Landroid/view/ViewStub;

.field private p:Landroid/view/ViewStub;

.field private q:Landroid/view/ViewStub;

.field private r:Landroid/view/ViewStub;

.field private s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

.field private t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

.field private u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

.field private v:Landroid/widget/ImageButton;

.field private w:Lcom/facebook/orca/threadview/ReceiptItemView;

.field private x:Landroid/widget/LinearLayout;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;Z)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 148
    invoke-direct {p0, p1, p2}, Lcom/facebook/widget/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 149
    iput-boolean p3, p0, Lcom/facebook/orca/threadview/l;->D:Z

    .line 151
    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadview/l;->setOrientation(I)V

    .line 153
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 154
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->a:Lcom/facebook/orca/f/k;

    .line 155
    const-class v0, Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/a/b;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->b:Lcom/facebook/orca/common/ui/a/b;

    .line 156
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->c:Lcom/facebook/orca/threads/n;

    .line 157
    const-class v0, Lcom/facebook/orca/share/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/share/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->d:Lcom/facebook/orca/share/a;

    .line 158
    const-class v0, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/a;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    .line 159
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/orca/annotations/IsAudioPlayerEnabled;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->f:Ljavax/inject/a;

    .line 161
    const-class v0, Lcom/facebook/analytics/cn;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/cn;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->g:Lcom/facebook/analytics/cn;

    .line 162
    const-class v0, Lcom/facebook/user/UserKey;

    const-class v2, Lcom/facebook/auth/annotations/ViewerContextUserKey;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/UserKey;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->h:Lcom/facebook/user/UserKey;

    .line 164
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/l;->D:Z

    if-eqz v0, :cond_0

    sget v0, Lcom/facebook/k;->orca_message_me_user_item:I

    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->setContentView(I)V

    .line 167
    sget v0, Lcom/facebook/i;->message_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    .line 168
    sget v0, Lcom/facebook/i;->message_bubble_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    .line 169
    sget v0, Lcom/facebook/i;->message_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/BetterTextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    .line 170
    sget v0, Lcom/facebook/i;->message_user_tile:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->m:Lcom/facebook/user/tiles/UserTileView;

    .line 171
    sget v0, Lcom/facebook/i;->message_audio:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    .line 172
    sget v0, Lcom/facebook/i;->message_left_bubble_sender_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->a(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->l:Landroid/widget/TextView;

    .line 174
    new-instance v0, Lcom/facebook/widget/text/j;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-direct {v0, v1}, Lcom/facebook/widget/text/j;-><init>(Landroid/widget/TextView;)V

    .line 175
    new-instance v1, Lcom/facebook/orca/threadview/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/m;-><init>(Lcom/facebook/orca/threadview/l;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/j;->a(Lcom/facebook/widget/text/k;)V

    .line 185
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/text/BetterTextView;->a(Lcom/facebook/widget/text/b;)V

    .line 189
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x40c00000    # 6.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v0

    .line 190
    invoke-virtual {p0, v3, v0, v3, v0}, Lcom/facebook/orca/threadview/l;->setPadding(IIII)V

    .line 194
    invoke-virtual {p0, v4}, Lcom/facebook/orca/threadview/l;->setClickable(Z)V

    .line 195
    return-void

    .line 164
    :cond_0
    sget v0, Lcom/facebook/k;->orca_message_item:I

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/orca/threadview/l;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Z)V

    .line 145
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/r;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    return-object v0
.end method

.method private a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/16 v5, 0x8

    const/4 v4, 0x0

    .line 212
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->m()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 213
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v0, v4}, Lcom/facebook/widget/text/BetterTextView;->setVisibility(I)V

    .line 214
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->b:Lcom/facebook/orca/common/ui/a/b;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;

    move-result-object v0

    .line 215
    invoke-static {}, Landroid/text/Spannable$Factory;->getInstance()Landroid/text/Spannable$Factory;

    move-result-object v1

    .line 216
    invoke-virtual {v1, v0}, Landroid/text/Spannable$Factory;->newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;

    move-result-object v0

    .line 217
    const/16 v1, 0xf

    invoke-static {v0, v1}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    .line 218
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v1, v0}, Lcom/facebook/widget/text/BetterTextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->isClickable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/facebook/orca/threadview/n;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/n;-><init>(Lcom/facebook/orca/threadview/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    new-instance v1, Lcom/facebook/orca/threadview/o;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/o;-><init>(Lcom/facebook/orca/threadview/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 244
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/l;->D:Z

    if-eqz v0, :cond_f

    .line 247
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 248
    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 249
    sget v0, Lcom/facebook/h;->orca_convo_bubble_green_button:I

    .line 253
    :goto_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 272
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 273
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 277
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->f:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->c(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->d(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 280
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->e(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/orca/attachments/AudioAttachmentData;

    move-result-object v1

    .line 282
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->e()V

    .line 283
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    if-eqz v0, :cond_3

    .line 284
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    .line 285
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    iget-boolean v2, p0, Lcom/facebook/orca/threadview/l;->D:Z

    invoke-virtual {v0, v2}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->setForMeUser(Z)V

    .line 286
    iput-object v6, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    .line 288
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->setVisibility(I)V

    .line 289
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->setAudioAttachmentData(Lcom/facebook/orca/attachments/AudioAttachmentData;)V

    .line 290
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->a(Lcom/facebook/orca/threadview/l;)V

    .line 299
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->d:Lcom/facebook/orca/share/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/share/Share;

    move-result-object v1

    .line 300
    if-eqz v1, :cond_14

    .line 301
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->f()V

    .line 302
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, v1}, Lcom/facebook/orca/stickers/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/share/Share;)Z

    move-result v2

    .line 303
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    if-eqz v0, :cond_4

    .line 304
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/share/ShareView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    .line 305
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    new-instance v3, Lcom/facebook/orca/threadview/p;

    invoke-direct {v3, p0, v2}, Lcom/facebook/orca/threadview/p;-><init>(Lcom/facebook/orca/threadview/l;Z)V

    invoke-virtual {v0, v3}, Lcom/facebook/orca/share/ShareView;->setListener(Lcom/facebook/orca/share/c;)V

    .line 318
    iput-object v6, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    .line 322
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0}, Lcom/facebook/orca/share/ShareView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/4 v3, -0x2

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 323
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/share/ShareView;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/share/ShareView;->a(Lcom/facebook/messages/model/share/Share;Z)V

    .line 326
    if-eqz v2, :cond_5

    .line 327
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 338
    :cond_5
    :goto_4
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->f(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 339
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_15

    .line 340
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->g()V

    .line 341
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    if-eqz v0, :cond_6

    .line 342
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    .line 343
    iput-object v6, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    .line 345
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->setVisibility(I)V

    .line 346
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 354
    :cond_7
    :goto_5
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->e:Lcom/facebook/orca/attachments/a;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->a(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_16

    .line 355
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->h()V

    .line 356
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    if-eqz v0, :cond_8

    .line 357
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    .line 358
    iput-object v6, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    .line 360
    :cond_8
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setVisibility(I)V

    .line 361
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 362
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0, p0}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->a(Lcom/facebook/orca/threadview/l;)V

    .line 369
    :cond_9
    :goto_6
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/16 v1, 0x385

    if-ne v0, v1, :cond_17

    .line 370
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->i()V

    .line 371
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, v4}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 372
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->g:Lcom/facebook/analytics/cn;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->K()Lcom/facebook/messages/model/threads/SendError;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/SendError;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cn;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    :cond_a
    :goto_7
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v0

    if-eqz v0, :cond_19

    .line 382
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->j()V

    .line 383
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-virtual {v1}, Lcom/facebook/orca/threadview/ad;->d()Lcom/facebook/orca/threadview/ae;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadview/ReceiptItemView;->setRowReceiptItem(Lcom/facebook/orca/threadview/ae;)V

    .line 384
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/threadview/ReceiptItemView;->setVisibility(I)V

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ReceiptItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 389
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->h:Lcom/facebook/user/UserKey;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 390
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 391
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40c00000    # 6.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 393
    const/4 v1, 0x5

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 406
    :cond_b
    :goto_8
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->c()Z

    move-result v0

    if-eqz v0, :cond_1b

    .line 407
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->k()V

    .line 408
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->g()Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v0

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1a

    .line 409
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->c:Lcom/facebook/orca/threads/n;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 415
    :goto_9
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 421
    :cond_c
    :goto_a
    return-void

    .line 220
    :cond_d
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v0, v5}, Lcom/facebook/widget/text/BetterTextView;->setVisibility(I)V

    goto/16 :goto_0

    .line 251
    :cond_e
    sget v0, Lcom/facebook/h;->orca_convo_bubble_blue_button:I

    goto/16 :goto_1

    .line 257
    :cond_f
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    sget v1, Lcom/facebook/h;->orca_convo_bubble_white_button:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 260
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->m:Lcom/facebook/user/tiles/UserTileView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/UserKey;)Lcom/facebook/user/tiles/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 261
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->m:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v0, v4}, Lcom/facebook/user/tiles/UserTileView;->setVisibility(I)V

    .line 263
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->a:Lcom/facebook/orca/f/k;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/f/k;->b(Ljava/lang/String;)Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    .line 264
    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadSummary;->h()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 265
    :cond_10
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    .line 267
    :cond_11
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 268
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->l:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->a:Lcom/facebook/orca/f/k;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/f/k;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 292
    :cond_12
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    if-eqz v0, :cond_13

    .line 293
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;->setVisibility(I)V

    .line 295
    :cond_13
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_3

    .line 330
    :cond_14
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    if-eqz v0, :cond_5

    .line 331
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/share/ShareView;->setVisibility(I)V

    goto/16 :goto_4

    .line 348
    :cond_15
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    if-eqz v0, :cond_7

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;->setVisibility(I)V

    goto/16 :goto_5

    .line 364
    :cond_16
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    if-eqz v0, :cond_9

    .line 365
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;->setVisibility(I)V

    goto/16 :goto_6

    .line 376
    :cond_17
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    if-eqz v0, :cond_a

    .line 377
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_7

    .line 395
    :cond_18
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x424a0000    # 50.5f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 397
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 398
    const/4 v1, 0x3

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto/16 :goto_8

    .line 401
    :cond_19
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    if-eqz v0, :cond_b

    .line 402
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/threadview/ReceiptItemView;->setVisibility(I)V

    goto/16 :goto_8

    .line 412
    :cond_1a
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->c:Lcom/facebook/orca/threads/n;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v2}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/threads/n;->c(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_9

    .line 417
    :cond_1b
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_c

    .line 418
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto/16 :goto_a
.end method

.method private a(Landroid/view/ViewStub;I)V
    .locals 2

    .prologue
    .line 515
    if-nez p2, :cond_1

    .line 516
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;Landroid/view/ViewStub;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;Landroid/view/ViewStub;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 519
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 528
    :cond_0
    :goto_0
    return-void

    .line 521
    :cond_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_2

    .line 522
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;Landroid/view/ViewStub;Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 523
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 525
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 526
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0
.end method

.method private a(Landroid/view/ViewStub;Landroid/view/ViewStub;Landroid/view/View;)Z
    .locals 2

    .prologue
    .line 534
    if-nez p2, :cond_0

    if-eqz p3, :cond_2

    .line 535
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    if-eqz p2, :cond_1

    :goto_0
    invoke-virtual {v0, p2}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 537
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    .line 538
    const/4 v0, 0x1

    .line 540
    :goto_1
    return v0

    :cond_1
    move-object p2, p3

    .line 535
    goto :goto_0

    .line 540
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method static synthetic b(Lcom/facebook/orca/threadview/l;)Lcom/facebook/orca/threadview/ad;
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/threadview/l;)V
    .locals 0

    .prologue
    .line 60
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->d()V

    return-void
.end method

.method private d()V
    .locals 2

    .prologue
    .line 448
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-interface {v0, v1}, Lcom/facebook/orca/threadview/r;->c(Lcom/facebook/orca/threadview/ad;)V

    .line 451
    :cond_0
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 454
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->l()V

    .line 455
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->t:Lcom/facebook/orca/threadview/ThreadViewAudioAttachmentView;

    if-eqz v0, :cond_1

    .line 470
    :cond_0
    :goto_0
    return-void

    .line 459
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 462
    iget-boolean v0, p0, Lcom/facebook/orca/threadview/l;->D:Z

    if-eqz v0, :cond_2

    sget v0, Lcom/facebook/k;->orca_message_item_attachment_audio_me_user:I

    :goto_1
    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    .line 468
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->q:Landroid/view/ViewStub;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 469
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 462
    :cond_2
    sget v0, Lcom/facebook/k;->orca_message_item_attachment_audio:I

    goto :goto_1
.end method

.method private f()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 473
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->l()V

    .line 474
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->n:Lcom/facebook/orca/share/ShareView;

    if-eqz v0, :cond_1

    .line 484
    :cond_0
    :goto_0
    return-void

    .line 478
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 479
    sget v1, Lcom/facebook/k;->orca_message_item_attachment_share:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    .line 483
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->o:Landroid/view/ViewStub;

    invoke-direct {p0, v0, v3}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;I)V

    goto :goto_0
.end method

.method private g()V
    .locals 4

    .prologue
    .line 487
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->l()V

    .line 488
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->u:Lcom/facebook/orca/threadview/ThreadViewOtherAttachmentsView;

    if-eqz v0, :cond_1

    .line 498
    :cond_0
    :goto_0
    return-void

    .line 492
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 493
    sget v1, Lcom/facebook/k;->orca_message_item_attachment_other_attachments:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    .line 497
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->r:Landroid/view/ViewStub;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;I)V

    goto :goto_0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 501
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->l()V

    .line 502
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->s:Lcom/facebook/orca/threadview/ThreadViewImageAttachmentView;

    if-eqz v0, :cond_1

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 506
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 507
    sget v1, Lcom/facebook/k;->orca_message_item_attachment_image:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    .line 511
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->p:Landroid/view/ViewStub;

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lcom/facebook/orca/threadview/l;->a(Landroid/view/ViewStub;I)V

    goto :goto_0
.end method

.method private i()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 544
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    .line 559
    :goto_0
    return-void

    .line 547
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 548
    sget v1, Lcom/facebook/k;->orca_message_item_retry_button:I

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    .line 550
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->i:Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    .line 552
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setFocusable(Z)V

    .line 553
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/threadview/q;

    invoke-direct {v1, p0}, Lcom/facebook/orca/threadview/q;-><init>(Lcom/facebook/orca/threadview/l;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 562
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    if-eqz v0, :cond_0

    .line 569
    :goto_0
    return-void

    .line 565
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 566
    sget v1, Lcom/facebook/k;->orca_message_item_receipt_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 567
    invoke-virtual {p0, v0}, Lcom/facebook/orca/threadview/l;->addView(Landroid/view/View;)V

    .line 568
    sget v1, Lcom/facebook/i;->row_receipt_container:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/ReceiptItemView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->w:Lcom/facebook/orca/threadview/ReceiptItemView;

    goto :goto_0
.end method

.method private k()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 572
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    .line 580
    :goto_0
    return-void

    .line 575
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 576
    sget v1, Lcom/facebook/k;->orca_message_divider:I

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    .line 578
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    sget v1, Lcom/facebook/i;->message_divider_text:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->y:Landroid/widget/TextView;

    .line 579
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->x:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v2}, Lcom/facebook/orca/threadview/l;->addView(Landroid/view/View;I)V

    goto :goto_0
.end method

.method private l()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 584
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->m()Z

    move-result v0

    if-nez v0, :cond_0

    .line 609
    :goto_0
    return-void

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    if-eqz v0, :cond_1

    .line 588
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 592
    :cond_1
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    .line 593
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/g;->divider_width:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 596
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 598
    invoke-virtual {v0, v4, v1, v4, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 600
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 601
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/h;->default_separator_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 603
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->k:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 604
    if-ltz v0, :cond_2

    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getChildCount()I

    move-result v1

    add-int/lit8 v2, v0, 0x1

    if-le v1, v2, :cond_2

    .line 605
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v2, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    goto :goto_0

    .line 607
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->z:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0
.end method

.method private m()Z
    .locals 1

    .prologue
    .line 612
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Landroid/os/Parcelable;)V
    .locals 2
    .param p1    # Landroid/os/Parcelable;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 621
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    if-eqz v0, :cond_0

    .line 622
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-interface {v0, v1, p1}, Lcom/facebook/orca/threadview/r;->a(Lcom/facebook/orca/threadview/ad;Landroid/os/Parcelable;)V

    .line 624
    :cond_0
    return-void
.end method

.method protected dispatchSetPressed(Z)V
    .locals 0

    .prologue
    .line 428
    return-void
.end method

.method public getRowMessageItem()Lcom/facebook/orca/threadview/ad;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    return-object v0
.end method

.method protected onLayout(ZIIII)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "DrawAllocation"
        }
    .end annotation

    .prologue
    .line 433
    invoke-super/range {p0 .. p5}, Lcom/facebook/widget/e;->onLayout(ZIIII)V

    .line 434
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->u()I

    move-result v0

    const/16 v1, 0x385

    if-ne v0, v1, :cond_0

    .line 435
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 436
    iget-object v1, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-static {v1, p0, v0}, Lcom/facebook/orca/common/a/c;->a(Landroid/view/View;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 437
    invoke-virtual {p0}, Lcom/facebook/orca/threadview/l;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x41700000    # 15.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/Context;F)I

    move-result v1

    .line 438
    iget v2, v0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->left:I

    .line 439
    iget v2, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->top:I

    .line 440
    iget v2, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v1

    iput v2, v0, Landroid/graphics/Rect;->right:I

    .line 441
    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/graphics/Rect;->bottom:I

    .line 442
    new-instance v1, Landroid/view/TouchDelegate;

    iget-object v2, p0, Lcom/facebook/orca/threadview/l;->v:Landroid/widget/ImageButton;

    invoke-direct {v1, v0, v2}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 443
    invoke-virtual {p0, v1}, Lcom/facebook/orca/threadview/l;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 445
    :cond_0
    return-void
.end method

.method public setCanOpenMessagePermalink(Z)V
    .locals 1

    .prologue
    .line 616
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->setClickable(Z)V

    .line 617
    return-void
.end method

.method public setListener(Lcom/facebook/orca/threadview/r;)V
    .locals 0

    .prologue
    .line 208
    iput-object p1, p0, Lcom/facebook/orca/threadview/l;->A:Lcom/facebook/orca/threadview/r;

    .line 209
    return-void
.end method

.method public setRowMessageItem(Lcom/facebook/orca/threadview/ad;)V
    .locals 1

    .prologue
    .line 202
    iput-object p1, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/threadview/l;->B:Lcom/facebook/orca/threadview/ad;

    invoke-virtual {v0}, Lcom/facebook/orca/threadview/ad;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/l;->C:Lcom/facebook/messages/model/threads/Message;

    .line 204
    invoke-direct {p0}, Lcom/facebook/orca/threadview/l;->a()V

    .line 205
    return-void
.end method
