.class public Lcom/facebook/orca/messageview/MessageViewFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "MessageViewFragment.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private Z:Lcom/facebook/c/s;

.field private aa:Lcom/facebook/orca/share/a;

.field private ab:Landroid/widget/TextView;

.field private ac:Landroid/widget/TextView;

.field private ad:Landroid/widget/TextView;

.field private ae:Lcom/facebook/user/tiles/UserTileView;

.field private af:Lcom/facebook/orca/share/ShareView;

.field private ag:Landroid/view/ViewStub;

.field private ah:Landroid/view/ViewGroup;

.field private ai:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

.field private aj:Lcom/facebook/maps/MapImage;

.field private ak:Landroid/widget/LinearLayout;

.field private al:Lcom/facebook/widget/text/BetterTextView;

.field private am:Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

.field private an:Lcom/facebook/orca/messageview/MessageReaderListView;

.field private ao:Lcom/facebook/orca/messageview/k;

.field private ap:Z

.field private aq:Z

.field private ar:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Lcom/facebook/orca/k/d;",
            ">;"
        }
    .end annotation
.end field

.field private as:Lcom/facebook/zero/ui/o;

.field private at:Lcom/facebook/zero/ui/l;

.field private b:Lcom/facebook/common/executors/a;

.field private c:Lcom/facebook/orca/f/k;

.field private d:Lcom/facebook/orca/common/ui/a/b;

.field private e:Lcom/facebook/orca/attachments/a;

.field private f:Lcom/facebook/orca/threads/n;

.field private g:Lcom/facebook/orca/threads/s;

.field private h:Lcom/facebook/orca/k/b;

.field private i:Lcom/facebook/analytics/av;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 108
    const-class v0, Lcom/facebook/orca/messageview/MessageViewActivity;

    sput-object v0, Lcom/facebook/orca/messageview/MessageViewFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 86
    return-void
.end method

.method private O()V
    .locals 4

    .prologue
    .line 522
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v0, v0, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 523
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 524
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserKey;->b()Ljava/lang/String;

    move-result-object v0

    .line 525
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "fb://profile/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 526
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 527
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lcom/facebook/common/j/a;->a(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 528
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->Z:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;Landroid/content/Context;)V

    .line 535
    :goto_0
    return-void

    .line 532
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://m.facebook.com/profile.php?id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 533
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 534
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->Z:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method

.method private P()V
    .locals 2

    .prologue
    .line 542
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aq:Z

    .line 543
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ah:Landroid/view/ViewGroup;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 544
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a()V

    .line 545
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/messageview/MessageViewFragment;Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    return-object p1
.end method

.method private a()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/16 v5, 0x8

    .line 296
    new-instance v0, Lcom/facebook/orca/messageview/a;

    invoke-direct {v0}, Lcom/facebook/orca/messageview/a;-><init>()V

    .line 297
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v1, v1, Lcom/facebook/orca/messageview/k;->b:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/a;->a(Ljava/util/List;)V

    .line 298
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v1, v1, Lcom/facebook/orca/messageview/k;->c:Lcom/google/common/a/es;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/a;->b(Ljava/util/List;)V

    .line 299
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v1, v1, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 300
    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/a;->a(Lcom/facebook/messages/model/threads/Message;)V

    .line 301
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v2, v2, Lcom/facebook/orca/messageview/k;->d:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v0, v2}, Lcom/facebook/orca/messageview/a;->a(Lcom/facebook/orca/threads/ThreadSummary;)V

    .line 302
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->an:Lcom/facebook/orca/messageview/MessageReaderListView;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/messageview/MessageReaderListView;->setParameters(Lcom/facebook/orca/messageview/a;)V

    .line 305
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    .line 306
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v2, v2, Lcom/facebook/orca/messageview/k;->d:Lcom/facebook/orca/threads/ThreadSummary;

    invoke-virtual {v2, v0}, Lcom/facebook/orca/threads/ThreadSummary;->a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threads/ThreadParticipant;

    move-result-object v2

    .line 307
    if-eqz v2, :cond_5

    .line 308
    iget-object v3, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ae:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {v2}, Lcom/facebook/orca/photos/a/f;->a(Lcom/facebook/orca/threads/ThreadParticipant;)Lcom/facebook/user/tiles/e;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 314
    :goto_0
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ab:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 315
    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ab:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setClickable(Z)V

    .line 317
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ab:Landroid/widget/TextView;

    new-instance v2, Lcom/facebook/orca/messageview/h;

    invoke-direct {v2, p0}, Lcom/facebook/orca/messageview/h;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 326
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ac:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->f:Lcom/facebook/orca/threads/n;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->f()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/facebook/orca/threads/n;->d(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 329
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ad:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->g:Lcom/facebook/orca/threads/s;

    invoke-virtual {v2, v1}, Lcom/facebook/orca/threads/s;->a(Lcom/facebook/messages/model/threads/Message;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Lcom/facebook/location/Coordinates;)V

    .line 333
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->r()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aq:Z

    if-nez v0, :cond_6

    .line 334
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aj:Lcom/facebook/maps/MapImage;

    invoke-virtual {v0, v6}, Lcom/facebook/maps/MapImage;->setVisibility(I)V

    .line 335
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aj:Lcom/facebook/maps/MapImage;

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/location/Coordinates;->a()Landroid/location/Location;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/maps/MapImage;->setCenter(Landroid/location/Location;)V

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aj:Lcom/facebook/maps/MapImage;

    new-instance v2, Lcom/facebook/orca/messageview/i;

    invoke-direct {v2, p0, v1}, Lcom/facebook/orca/messageview/i;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;Lcom/facebook/messages/model/threads/Message;)V

    invoke-virtual {v0, v2}, Lcom/facebook/maps/MapImage;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 363
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aa:Lcom/facebook/orca/share/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/share/Share;

    move-result-object v2

    .line 364
    if-eqz v2, :cond_7

    invoke-static {v1, v2}, Lcom/facebook/orca/stickers/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/share/Share;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 365
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->b()V

    .line 366
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    if-eqz v0, :cond_2

    .line 367
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/share/ShareView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    .line 368
    iput-object v8, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    .line 372
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0}, Lcom/facebook/orca/share/ShareView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/4 v3, -0x2

    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 373
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/share/ShareView;->setVisibility(I)V

    .line 374
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v2, v7}, Lcom/facebook/orca/share/ShareView;->a(Lcom/facebook/messages/model/share/Share;Z)V

    .line 381
    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v0, v6}, Lcom/facebook/widget/text/BetterTextView;->setVisibility(I)V

    .line 382
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 383
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->k()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 384
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v0, v5}, Lcom/facebook/widget/text/BetterTextView;->setVisibility(I)V

    .line 385
    if-eqz v2, :cond_4

    invoke-static {v1, v2}, Lcom/facebook/orca/stickers/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/share/Share;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 386
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 387
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ad:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 401
    :goto_3
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->e:Lcom/facebook/orca/attachments/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/attachments/a;->f(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 402
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->am:Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;->setMessage(Lcom/facebook/messages/model/threads/Message;)V

    .line 403
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->am:Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;->setVisibility(I)V

    .line 407
    :goto_4
    return-void

    .line 310
    :cond_5
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ae:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v2, v8}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    goto/16 :goto_0

    .line 354
    :cond_6
    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->r()Z

    move-result v0

    if-nez v0, :cond_1

    .line 357
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_1

    .line 376
    :cond_7
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    if-eqz v0, :cond_3

    .line 377
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/share/ShareView;->setVisibility(I)V

    goto :goto_2

    .line 389
    :cond_8
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->c()V

    goto :goto_3

    .line 392
    :cond_9
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->d:Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/common/ui/a/b;->a(Lcom/facebook/messages/model/threads/Message;)Landroid/text/Spanned;

    move-result-object v0

    .line 393
    invoke-static {}, Landroid/text/Spannable$Factory;->getInstance()Landroid/text/Spannable$Factory;

    move-result-object v2

    .line 394
    invoke-virtual {v2, v0}, Landroid/text/Spannable$Factory;->newSpannable(Ljava/lang/CharSequence;)Landroid/text/Spannable;

    move-result-object v0

    .line 395
    const/16 v2, 0xf

    invoke-static {v0, v2}, Landroid/text/util/Linkify;->addLinks(Landroid/text/Spannable;I)Z

    .line 396
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v2, v0}, Lcom/facebook/widget/text/BetterTextView;->setText(Ljava/lang/CharSequence;)V

    .line 398
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->c()V

    goto :goto_3

    .line 405
    :cond_a
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->am:Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

    invoke-virtual {v0, v5}, Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;->setVisibility(I)V

    goto :goto_4
.end method

.method private a(Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 2

    .prologue
    .line 454
    const/16 v0, 0x9

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 455
    const/4 v0, 0x1

    sget v1, Lcom/facebook/i;->message_user_img:I

    invoke-virtual {p2, v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 456
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 459
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p3, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 460
    return-void
.end method

.method private a(Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;)V
    .locals 4

    .prologue
    const/4 v3, 0x5

    .line 469
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v0, v0, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 470
    const/16 v1, 0xb

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 471
    const/4 v1, 0x0

    sget v2, Lcom/facebook/i;->message_user_img:I

    invoke-virtual {p2, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 472
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    const/high16 v2, 0x40a00000    # 5.0f

    invoke-static {v1, v2}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v1

    iput v1, p2, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 474
    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 475
    invoke-static {v0}, Lcom/facebook/orca/threadview/dm;->a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    sget v1, Lcom/facebook/h;->orca_convo_bubble_green_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 481
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->o()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x42380000    # 46.0f

    invoke-static {v0, v1}, Lcom/facebook/common/w/j;->a(Landroid/content/res/Resources;F)I

    move-result v0

    iput v0, p3, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 482
    iput v3, p3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 483
    iput v3, p4, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 484
    iput v3, p5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 485
    return-void

    .line 478
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    sget v1, Lcom/facebook/h;->orca_convo_bubble_blue_normal:I

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/location/Coordinates;)V
    .locals 3

    .prologue
    .line 488
    if-nez p1, :cond_0

    .line 512
    :goto_0
    return-void

    .line 491
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v0, v0, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 492
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->h:Lcom/facebook/orca/k/b;

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/Message;->n()Lcom/facebook/location/Coordinates;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/k/b;->a(Lcom/facebook/location/Coordinates;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    .line 493
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->b:Lcom/facebook/common/executors/a;

    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    new-instance v2, Lcom/facebook/orca/messageview/j;

    invoke-direct {v2, p0}, Lcom/facebook/orca/messageview/j;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/common/executors/a;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->O()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/messageview/MessageViewFragment;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0, p1}, Lcom/facebook/orca/messageview/MessageViewFragment;->b(Landroid/content/Intent;)V

    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 410
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->af:Lcom/facebook/orca/share/ShareView;

    if-eqz v0, :cond_1

    .line 420
    :cond_0
    :goto_0
    return-void

    .line 414
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 415
    sget v1, Lcom/facebook/k;->orca_message_item_attachment_share:I

    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    .line 419
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ag:Landroid/view/ViewStub;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0
.end method

.method private b(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 538
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->Z:Lcom/facebook/c/s;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    .line 539
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/messageview/MessageViewFragment;)V
    .locals 0

    .prologue
    .line 79
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->P()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/orca/messageview/MessageViewFragment;)Lcom/facebook/zero/ui/l;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->at:Lcom/facebook/zero/ui/l;

    return-object v0
.end method

.method private c()V
    .locals 8

    .prologue
    .line 423
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ae:Lcom/facebook/user/tiles/UserTileView;

    invoke-virtual {v0}, Lcom/facebook/user/tiles/UserTileView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 425
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 427
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ad:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 429
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ab:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout$LayoutParams;

    .line 431
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ac:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 434
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    sget v6, Lcom/facebook/h;->orca_convo_bubble_white_normal:I

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 435
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v6, v0, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 436
    invoke-virtual {v6}, Lcom/facebook/messages/model/threads/Message;->i()Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messages/model/threads/ParticipantInfo;->e()Lcom/facebook/user/UserKey;

    move-result-object v0

    iget-object v7, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->c:Lcom/facebook/orca/f/k;

    invoke-virtual {v7}, Lcom/facebook/orca/f/k;->b()Lcom/facebook/user/UserKey;

    move-result-object v7

    invoke-virtual {v0, v7}, Lcom/facebook/user/UserKey;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, p0

    .line 437
    invoke-direct/range {v0 .. v5}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;)V

    .line 443
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aa:Lcom/facebook/orca/share/a;

    invoke-virtual {v0, v6}, Lcom/facebook/orca/share/a;->a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/model/share/Share;

    move-result-object v0

    .line 444
    if-eqz v0, :cond_0

    invoke-static {v6, v0}, Lcom/facebook/orca/stickers/i;->a(Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/model/share/Share;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 445
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 447
    :cond_0
    return-void

    .line 439
    :cond_1
    invoke-direct {p0, v1, v2, v3}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/LinearLayout$LayoutParams;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/orca/messageview/MessageViewFragment;)Lcom/facebook/orca/common/ui/a/b;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->d:Lcom/facebook/orca/common/ui/a/b;

    return-object v0
.end method

.method private d()V
    .locals 2

    .prologue
    .line 515
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    if-eqz v0, :cond_0

    .line 516
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/google/common/d/a/s;->cancel(Z)Z

    .line 517
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ar:Lcom/google/common/d/a/s;

    .line 519
    :cond_0
    return-void
.end method

.method static synthetic e(Lcom/facebook/orca/messageview/MessageViewFragment;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ad:Landroid/widget/TextView;

    return-object v0
.end method


# virtual methods
.method public C()V
    .locals 0

    .prologue
    .line 279
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->C()V

    .line 280
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->d()V

    .line 281
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 215
    sget v0, Lcom/facebook/k;->orca_message_view_fragment:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 216
    sget v0, Lcom/facebook/i;->message_name:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ab:Landroid/widget/TextView;

    .line 217
    sget v0, Lcom/facebook/i;->message_date:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ac:Landroid/widget/TextView;

    .line 218
    sget v0, Lcom/facebook/i;->message_via:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ad:Landroid/widget/TextView;

    .line 219
    sget v0, Lcom/facebook/i;->message_user_img:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ae:Lcom/facebook/user/tiles/UserTileView;

    .line 220
    sget v0, Lcom/facebook/i;->show_map_section:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ah:Landroid/view/ViewGroup;

    .line 221
    sget v0, Lcom/facebook/i;->show_map_row:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ai:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    .line 222
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ai:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    sget v2, Lcom/facebook/o;->zero_show_map_button_title:I

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setLabelText(I)V

    .line 223
    sget v0, Lcom/facebook/i;->message_map_image:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/maps/MapImage;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aj:Lcom/facebook/maps/MapImage;

    .line 224
    sget v0, Lcom/facebook/i;->message_bubble_container:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ak:Landroid/widget/LinearLayout;

    .line 225
    sget v0, Lcom/facebook/i;->message_text:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/text/BetterTextView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    .line 227
    new-instance v0, Lcom/facebook/widget/text/j;

    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    invoke-direct {v0, v2}, Lcom/facebook/widget/text/j;-><init>(Landroid/widget/TextView;)V

    .line 228
    new-instance v2, Lcom/facebook/orca/messageview/f;

    invoke-direct {v2, p0}, Lcom/facebook/orca/messageview/f;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v2}, Lcom/facebook/widget/text/j;->a(Lcom/facebook/widget/text/k;)V

    .line 244
    iget-object v2, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->al:Lcom/facebook/widget/text/BetterTextView;

    invoke-virtual {v2, v0}, Lcom/facebook/widget/text/BetterTextView;->a(Lcom/facebook/widget/text/b;)V

    .line 246
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ai:Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;

    new-instance v2, Lcom/facebook/orca/messageview/g;

    invoke-direct {v2, p0}, Lcom/facebook/orca/messageview/g;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/contactcard/entry/LabelValueRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 254
    sget v0, Lcom/facebook/i;->message_other_attachments:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->am:Lcom/facebook/orca/messageview/MessageViewOtherAttachmentsView;

    .line 255
    sget v0, Lcom/facebook/i;->message_reader_list:I

    invoke-virtual {p0, v1, v0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/messageview/MessageReaderListView;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->an:Lcom/facebook/orca/messageview/MessageReaderListView;

    .line 257
    iget-boolean v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aq:Z

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ah:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 261
    :cond_0
    return-object v1
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 147
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 149
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 150
    const-class v0, Lcom/facebook/common/executors/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/executors/a;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->b:Lcom/facebook/common/executors/a;

    .line 151
    const-class v0, Lcom/facebook/orca/f/k;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/k;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->c:Lcom/facebook/orca/f/k;

    .line 152
    const-class v0, Lcom/facebook/orca/common/ui/a/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/common/ui/a/b;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->d:Lcom/facebook/orca/common/ui/a/b;

    .line 153
    const-class v0, Lcom/facebook/orca/attachments/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/attachments/a;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->e:Lcom/facebook/orca/attachments/a;

    .line 154
    const-class v0, Lcom/facebook/orca/threads/n;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/n;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->f:Lcom/facebook/orca/threads/n;

    .line 155
    const-class v0, Lcom/facebook/orca/threads/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threads/s;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->g:Lcom/facebook/orca/threads/s;

    .line 156
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->i:Lcom/facebook/analytics/av;

    .line 157
    const-class v0, Lcom/facebook/orca/k/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/k/b;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->h:Lcom/facebook/orca/k/b;

    .line 159
    const-class v0, Lcom/facebook/c/s;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->Z:Lcom/facebook/c/s;

    .line 161
    const-class v0, Lcom/facebook/orca/share/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/share/a;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aa:Lcom/facebook/orca/share/a;

    .line 163
    const-class v0, Lcom/facebook/zero/ui/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/o;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->as:Lcom/facebook/zero/ui/o;

    .line 165
    const-class v0, Lcom/facebook/zero/ui/l;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/ui/l;

    iput-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->at:Lcom/facebook/zero/ui/l;

    .line 167
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->at:Lcom/facebook/zero/ui/l;

    sget-object v1, Lcom/facebook/zero/a/c;->k:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_external_url_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/messageview/e;

    invoke-direct {v3, p0}, Lcom/facebook/orca/messageview/e;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->i:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_show_map_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/messageview/d;

    invoke-direct {v3, p0}, Lcom/facebook/orca/messageview/d;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    move-result-object v0

    sget-object v1, Lcom/facebook/zero/a/c;->g:Lcom/facebook/prefs/shared/ae;

    sget v2, Lcom/facebook/o;->zero_view_timeline_dialog_content:I

    invoke-virtual {p0, v2}, Lcom/facebook/orca/messageview/MessageViewFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/facebook/orca/messageview/c;

    invoke-direct {v3, p0}, Lcom/facebook/orca/messageview/c;-><init>(Lcom/facebook/orca/messageview/MessageViewFragment;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/zero/ui/l;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;Lcom/facebook/zero/ui/k;)Lcom/facebook/zero/ui/l;

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->as:Lcom/facebook/zero/ui/o;

    sget-object v1, Lcom/facebook/zero/a/c;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/o;->a(Lcom/facebook/prefs/shared/ae;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->aq:Z

    .line 210
    return-void
.end method

.method public a(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    .prologue
    .line 549
    sget v0, Lcom/facebook/l;->message_view_menu:I

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 550
    return-void
.end method

.method public a(Lcom/facebook/orca/messageview/k;)V
    .locals 1

    .prologue
    .line 289
    iput-object p1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    .line 290
    iget-boolean v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ap:Z

    if-eqz v0, :cond_0

    .line 291
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a()V

    .line 293
    :cond_0
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    .line 554
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sget v2, Lcom/facebook/i;->delete:I

    if-ne v1, v2, :cond_0

    .line 555
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->i:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "click"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "opt_menu_item"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->f(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    const-string v3, "delete"

    invoke-virtual {v2, v3}, Lcom/facebook/analytics/cb;->g(Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;)V

    .line 558
    iget-object v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    iget-object v1, v1, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 559
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 560
    const-string v3, "thread_id"

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 561
    const-string v3, "message_ids"

    new-array v4, v0, [Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {v1}, Lcom/facebook/messages/model/threads/Message;->d()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-static {v4}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 563
    new-instance v1, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;

    invoke-direct {v1}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;-><init>()V

    .line 565
    invoke-virtual {v1, v2}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->g(Landroid/os/Bundle;)V

    .line 566
    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v2

    const-string v3, "delete_message_dialog_tag"

    invoke-virtual {v1, v2, v3}, Lcom/facebook/orca/mutators/DeleteMessagesDialogFragment;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    .line 569
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 266
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 268
    iput-boolean v1, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ap:Z

    .line 269
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->ao:Lcom/facebook/orca/messageview/k;

    if-eqz v0, :cond_0

    .line 270
    invoke-direct {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->a()V

    .line 272
    :cond_0
    invoke-virtual {p0, v1}, Lcom/facebook/orca/messageview/MessageViewFragment;->d(Z)V

    .line 274
    iget-object v0, p0, Lcom/facebook/orca/messageview/MessageViewFragment;->at:Lcom/facebook/zero/ui/l;

    invoke-virtual {p0}, Lcom/facebook/orca/messageview/MessageViewFragment;->p()Landroid/support/v4/app/q;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/zero/ui/l;->a(Landroid/support/v4/app/q;)V

    .line 275
    return-void
.end method
