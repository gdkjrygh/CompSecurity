.class public Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "ComposeBroadcastFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# instance fields
.field private Z:Landroid/view/View;

.field private a:Landroid/view/inputmethod/InputMethodManager;

.field private aa:Landroid/widget/ImageButton;

.field private ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

.field private b:Lcom/facebook/ui/media/attachments/d;

.field private c:Lcom/facebook/common/time/a;

.field private d:Lcom/facebook/base/fragment/c;

.field private e:Lcom/facebook/orca/broadcast/q;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/TextView;

.field private h:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

.field private i:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 51
    return-void
.end method

.method private O()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 215
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->q()Landroid/support/v4/app/q;

    move-result-object v2

    .line 216
    const-string v0, "pickMediaOperation"

    invoke-virtual {v2, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    .line 218
    if-eqz v0, :cond_0

    move v0, v1

    .line 229
    :goto_0
    return v0

    .line 221
    :cond_0
    invoke-virtual {v2}, Landroid/support/v4/app/q;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 222
    const/4 v0, 0x0

    goto :goto_0

    .line 224
    :cond_1
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    invoke-direct {v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;-><init>()V

    .line 225
    invoke-virtual {v2}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v3

    .line 226
    const-string v4, "pickMediaOperation"

    invoke-virtual {v3, v0, v4}, Landroid/support/v4/app/ad;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 227
    invoke-virtual {v3}, Landroid/support/v4/app/ad;->a()I

    .line 228
    invoke-virtual {v2}, Landroid/support/v4/app/q;->b()Z

    move v0, v1

    .line 229
    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/broadcast/q;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->e:Lcom/facebook/orca/broadcast/q;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Z
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->O()Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/orca/compose/ComposeAttachmentContainer;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Landroid/view/View;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->Z:Landroid/view/View;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Landroid/widget/EditText;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->i:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Landroid/view/inputmethod/InputMethodManager;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a:Landroid/view/inputmethod/InputMethodManager;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/ui/media/attachments/d;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->b:Lcom/facebook/ui/media/attachments/d;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)Lcom/facebook/common/time/a;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c:Lcom/facebook/common/time/a;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 81
    sget v0, Lcom/facebook/k;->compose_broadcast_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(IZI)Landroid/view/animation/Animation;
    .locals 2

    .prologue
    .line 145
    if-eqz p2, :cond_0

    .line 146
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    sget v1, Lcom/facebook/b;->in_from_left:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 151
    :goto_0
    new-instance v1, Lcom/facebook/orca/broadcast/n;

    invoke-direct {v1, p0, p2}, Lcom/facebook/orca/broadcast/n;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;Z)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 165
    return-object v0

    .line 148
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    sget v1, Lcom/facebook/b;->out_to_left:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    goto :goto_0
.end method

.method public a()V
    .locals 2

    .prologue
    .line 256
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->h:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->g:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 258
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 72
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 73
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 74
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/media/attachments/d;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->b:Lcom/facebook/ui/media/attachments/d;

    .line 75
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a:Landroid/view/inputmethod/InputMethodManager;

    .line 76
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c:Lcom/facebook/common/time/a;

    .line 77
    return-void
.end method

.method public a(Landroid/support/v4/app/Fragment;)V
    .locals 1

    .prologue
    .line 170
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/support/v4/app/Fragment;)V

    .line 171
    instance-of v0, p1, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    if-eqz v0, :cond_0

    .line 172
    check-cast p1, Lcom/facebook/orca/photos/picking/PickMediaOperation;

    new-instance v0, Lcom/facebook/orca/broadcast/o;

    invoke-direct {v0, p0}, Lcom/facebook/orca/broadcast/o;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V

    invoke-virtual {p1, v0}, Lcom/facebook/orca/photos/picking/PickMediaOperation;->a(Lcom/facebook/orca/photos/picking/i;)V

    .line 203
    :cond_0
    return-void
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 207
    iput-object p1, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d:Lcom/facebook/base/fragment/c;

    .line 208
    return-void
.end method

.method public a(Lcom/facebook/orca/broadcast/q;)V
    .locals 0

    .prologue
    .line 211
    iput-object p1, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->e:Lcom/facebook/orca/broadcast/q;

    .line 212
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/user/UserWithIdentifier;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    .line 233
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/google/common/a/es;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->a()V

    .line 253
    :goto_0
    return-void

    .line 237
    :cond_1
    new-instance v0, Lcom/facebook/orca/broadcast/p;

    invoke-direct {v0, p0}, Lcom/facebook/orca/broadcast/p;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V

    invoke-static {p1, v0}, Lcom/google/common/a/ax;->a(Ljava/util/Collection;Lcom/google/common/base/Function;)Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/util/Collection;)Lcom/google/common/a/es;

    move-result-object v0

    .line 245
    new-instance v1, Lcom/facebook/messages/threads/ui/name/g;

    const/4 v2, 0x0

    invoke-direct {v1, v3, v2, v0}, Lcom/facebook/messages/threads/ui/name/g;-><init>(ZLjava/lang/String;Lcom/google/common/a/es;)V

    .line 250
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->h:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, v1}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setData(Ljava/lang/Object;)V

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->g:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 252
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->h:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    invoke-virtual {v0, v3}, Lcom/facebook/messages/threads/ui/name/ThreadNameView;->setVisibility(I)V

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 261
    invoke-virtual {p0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->c(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->i:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/ui/media/attachments/MediaResource;",
            ">;"
        }
    .end annotation

    .prologue
    .line 269
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    invoke-virtual {v0}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->getMediaResources()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 86
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 88
    sget v0, Lcom/facebook/i;->add_friends_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->f:Landroid/view/View;

    .line 89
    sget v0, Lcom/facebook/i;->add_friedns_button_empty_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->g:Landroid/widget/TextView;

    .line 90
    sget v0, Lcom/facebook/i;->add_friedns_button_label:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->h:Lcom/facebook/messages/threads/ui/name/ThreadNameView;

    .line 91
    sget v0, Lcom/facebook/i;->composer_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->i:Landroid/widget/EditText;

    .line 92
    sget v0, Lcom/facebook/i;->add_photo_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->aa:Landroid/widget/ImageButton;

    .line 93
    sget v0, Lcom/facebook/i;->compose_attachment_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    .line 94
    sget v0, Lcom/facebook/i;->compose_attachment_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->Z:Landroid/view/View;

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->f:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/broadcast/k;

    invoke-direct {v1, p0}, Lcom/facebook/orca/broadcast/k;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->aa:Landroid/widget/ImageButton;

    new-instance v1, Lcom/facebook/orca/broadcast/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/broadcast/l;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    iget-object v0, p0, Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;->ab:Lcom/facebook/orca/compose/ComposeAttachmentContainer;

    new-instance v1, Lcom/facebook/orca/broadcast/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/broadcast/m;-><init>(Lcom/facebook/orca/broadcast/ComposeBroadcastFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/compose/ComposeAttachmentContainer;->setListener(Lcom/facebook/orca/compose/k;)V

    .line 139
    return-void
.end method
