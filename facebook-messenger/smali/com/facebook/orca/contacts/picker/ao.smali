.class public Lcom/facebook/orca/contacts/picker/ao;
.super Lcom/facebook/widget/f;
.source "ContactPickerListItem.java"


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
.field private b:Landroid/widget/TextView;

.field private c:Landroid/widget/TextView;

.field private d:Lcom/facebook/user/tiles/UserTileView;

.field private e:Lcom/facebook/orca/presence/PresenceIndicatorView;

.field private f:Landroid/view/View;

.field private g:Landroid/widget/ToggleButton;

.field private h:Lcom/facebook/contacts/picker/ag;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 29
    const-class v0, Lcom/facebook/orca/contacts/picker/ao;

    sput-object v0, Lcom/facebook/orca/contacts/picker/ao;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/picker/ao;->a(Landroid/content/Context;)V

    .line 43
    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v0

    .line 97
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->b:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->d:Lcom/facebook/user/tiles/UserTileView;

    invoke-static {v0}, Lcom/facebook/user/tiles/e;->a(Lcom/facebook/user/User;)Lcom/facebook/user/tiles/e;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/user/tiles/UserTileView;->setParams(Lcom/facebook/user/tiles/e;)V

    .line 100
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->b()V

    .line 101
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->c()V

    .line 102
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->d()V

    .line 103
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->h()V

    .line 104
    return-void
.end method

.method private a(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 56
    sget v0, Lcom/facebook/k;->orca_contact_picker_list_item:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->setContentView(I)V

    .line 57
    sget v0, Lcom/facebook/i;->contact_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->b:Landroid/widget/TextView;

    .line 58
    sget v0, Lcom/facebook/i;->contact_status:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    .line 59
    sget v0, Lcom/facebook/i;->contact_user_tile_image:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/tiles/UserTileView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->d:Lcom/facebook/user/tiles/UserTileView;

    .line 60
    sget v0, Lcom/facebook/i;->contact_presence_indicator:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/presence/PresenceIndicatorView;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    .line 61
    sget v0, Lcom/facebook/i;->contact_divider:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->f:Landroid/view/View;

    .line 62
    sget v0, Lcom/facebook/i;->is_picked_checkbox:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/picker/ao;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ToggleButton;

    iput-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->g:Landroid/widget/ToggleButton;

    .line 63
    return-void
.end method

.method private b()V
    .locals 4

    .prologue
    .line 107
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 131
    :goto_0
    return-void

    .line 111
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v0

    .line 112
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/ag;->i()Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setShowIcon(Z)V

    .line 113
    invoke-virtual {v0}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_6

    .line 114
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->NEARBY:Lcom/facebook/orca/presence/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setStatus(Lcom/facebook/orca/presence/i;)V

    goto :goto_0

    .line 116
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->ONLINE:Lcom/facebook/orca/presence/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setStatus(Lcom/facebook/orca/presence/i;)V

    goto :goto_0

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 119
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->i()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->k()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 120
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->PUSHABLE:Lcom/facebook/orca/presence/i;

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/ag;->f()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v3}, Lcom/facebook/contacts/picker/ag;->g()I

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/facebook/orca/presence/PresenceIndicatorView;->a(Lcom/facebook/orca/presence/i;Ljava/lang/String;I)V

    goto :goto_0

    .line 123
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->PUSHABLE:Lcom/facebook/orca/presence/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setStatus(Lcom/facebook/orca/presence/i;)V

    goto :goto_0

    .line 126
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->NONE:Lcom/facebook/orca/presence/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setStatus(Lcom/facebook/orca/presence/i;)V

    goto :goto_0

    .line 129
    :cond_6
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget-object v1, Lcom/facebook/orca/presence/i;->NONE:Lcom/facebook/orca/presence/i;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setStatus(Lcom/facebook/orca/presence/i;)V

    goto :goto_0
.end method

.method private c()V
    .locals 6

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 134
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v3

    .line 136
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->j()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v2

    .line 137
    :goto_0
    invoke-virtual {v3}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v4

    sget-object v5, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v4, v5, :cond_4

    .line 138
    iget-object v4, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v4}, Lcom/facebook/contacts/picker/ag;->h()Lcom/facebook/user/ChatContext;

    move-result-object v4

    if-eqz v4, :cond_3

    move v0, v2

    .line 150
    :cond_1
    :goto_1
    if-eqz v0, :cond_5

    .line 151
    :goto_2
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    return-void

    :cond_2
    move v0, v1

    .line 136
    goto :goto_0

    .line 140
    :cond_3
    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/ag;->d()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/ag;->e()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lcom/facebook/user/User;->B()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v3}, Lcom/facebook/user/User;->A()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    move v0, v1

    .line 144
    goto :goto_1

    .line 146
    :cond_4
    invoke-virtual {v3}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v2

    sget-object v3, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    if-eq v2, v3, :cond_1

    move v0, v1

    .line 147
    goto :goto_1

    .line 150
    :cond_5
    const/16 v1, 0x8

    goto :goto_2
.end method

.method private d()V
    .locals 3

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v1

    sget-object v2, Lcom/facebook/user/n;->FACEBOOK:Lcom/facebook/user/n;

    if-ne v1, v2, :cond_4

    .line 157
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->h()Lcom/facebook/user/ChatContext;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ag;->h()Lcom/facebook/user/ChatContext;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/user/ChatContext;->getSubtext()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 169
    :cond_0
    :goto_0
    return-void

    .line 159
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->l()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->i()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 160
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->e()V

    goto :goto_0

    .line 161
    :cond_3
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->f()V

    goto :goto_0

    .line 164
    :cond_4
    invoke-virtual {v0}, Lcom/facebook/user/User;->a()Lcom/facebook/user/n;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/n;->ADDRESS_BOOK:Lcom/facebook/user/n;

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->l()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->i()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 166
    :cond_5
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/UserWithIdentifier;->c()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ao;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/user/UserIdentifier;->a(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->rich_presence_active:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 179
    :goto_0
    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->rich_presence_notification_on:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 177
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->g()V

    goto :goto_0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 182
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->presence_active_now:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 194
    :goto_0
    return-void

    .line 184
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ag;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 189
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v1, Lcom/facebook/o;->presence_mobile:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 192
    :cond_2
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->g()V

    goto :goto_0
.end method

.method private g()V
    .locals 2

    .prologue
    .line 197
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->b()Lcom/facebook/user/User;

    move-result-object v0

    .line 198
    invoke-virtual {v0}, Lcom/facebook/user/User;->B()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 199
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->B()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 203
    :cond_0
    :goto_0
    return-void

    .line 200
    :cond_1
    invoke-virtual {v0}, Lcom/facebook/user/User;->A()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 201
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/facebook/user/User;->A()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->g:Landroid/widget/ToggleButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setVisibility(I)V

    .line 208
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->g:Landroid/widget/ToggleButton;

    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ag;->k()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 212
    :goto_0
    return-void

    .line 210
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->g:Landroid/widget/ToggleButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ToggleButton;->setVisibility(I)V

    goto :goto_0
.end method

.method private i()Z
    .locals 2

    .prologue
    .line 215
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->c()Lcom/facebook/contacts/picker/ai;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ai;->TWO_LINE_RICH_PRESENCE:Lcom/facebook/contacts/picker/ai;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private j()Z
    .locals 2

    .prologue
    .line 219
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->c()Lcom/facebook/contacts/picker/ai;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ai;->TWO_LINE:Lcom/facebook/contacts/picker/ai;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private k()Z
    .locals 2

    .prologue
    .line 223
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->c()Lcom/facebook/contacts/picker/ai;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ai;->ONE_LINE:Lcom/facebook/contacts/picker/ai;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l()Z
    .locals 2

    .prologue
    .line 227
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->c()Lcom/facebook/contacts/picker/ai;

    move-result-object v0

    sget-object v1, Lcom/facebook/contacts/picker/ai;->TEXT_ONLY:Lcom/facebook/contacts/picker/ai;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private m()Z
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/ag;->h()Lcom/facebook/user/ChatContext;

    move-result-object v0

    .line 232
    if-nez v0, :cond_0

    .line 233
    const/4 v0, 0x0

    .line 235
    :goto_0
    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/user/ChatContext;->a()Z

    move-result v0

    goto :goto_0
.end method


# virtual methods
.method public getContactRow()Lcom/facebook/contacts/picker/ag;
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    return-object v0
.end method

.method public setColorScheme(Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 4

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/picker/ao;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 67
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DEFAULT_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_1

    .line 68
    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    sget v2, Lcom/facebook/f;->default_contacts_contact_background:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/ao;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 70
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->f:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->default_separator_color:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->b:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->default_contacts_contact_name_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->default_contacts_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 74
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget v2, Lcom/facebook/f;->default_contacts_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setTextColor(I)V

    .line 84
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    sget-object v1, Lcom/facebook/contacts/picker/ContactPickerColorScheme;->DIVEBAR_SCHEME:Lcom/facebook/contacts/picker/ContactPickerColorScheme;

    if-ne p1, v1, :cond_0

    .line 77
    sget v1, Lcom/facebook/h;->divebar_contact_bg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/facebook/orca/contacts/picker/ao;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 78
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->f:Landroid/view/View;

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    sget v3, Lcom/facebook/f;->divebar_contact_divider:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 80
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->b:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->divebar_contact_name_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 81
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->c:Landroid/widget/TextView;

    sget v2, Lcom/facebook/f;->divebar_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 82
    iget-object v1, p0, Lcom/facebook/orca/contacts/picker/ao;->e:Lcom/facebook/orca/presence/PresenceIndicatorView;

    sget v2, Lcom/facebook/f;->divebar_contact_status_text:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/facebook/orca/presence/PresenceIndicatorView;->setTextColor(I)V

    goto :goto_0
.end method

.method public setContactRow(Lcom/facebook/contacts/picker/ag;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/orca/contacts/picker/ao;->h:Lcom/facebook/contacts/picker/ag;

    .line 92
    invoke-direct {p0}, Lcom/facebook/orca/contacts/picker/ao;->a()V

    .line 93
    return-void
.end method
