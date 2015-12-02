.class public Lcom/facebook/orca/contacts/divebar/be;
.super Lcom/facebook/widget/f;
.source "DivebarPickerView.java"


# instance fields
.field private final a:Lcom/facebook/contacts/picker/as;

.field private final b:Lcom/facebook/orca/contacts/picker/bg;

.field private final c:Lcom/facebook/user/i;

.field private d:Landroid/view/ViewGroup;

.field private e:Lcom/facebook/contacts/picker/r;

.field private final f:Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

.field private g:Lcom/facebook/orca/contacts/divebar/bl;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;Lcom/facebook/contacts/picker/ContactPickerColorScheme;)V
    .locals 3

    .prologue
    .line 55
    invoke-direct {p0, p1}, Lcom/facebook/widget/f;-><init>(Landroid/content/Context;)V

    .line 57
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/i;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->c:Lcom/facebook/user/i;

    .line 60
    new-instance v0, Lcom/facebook/contacts/picker/as;

    sget v2, Lcom/facebook/k;->orca_contact_picker_view_for_divebar:I

    invoke-direct {v0, p1, p2, v2}, Lcom/facebook/contacts/picker/as;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/c;I)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    sget v2, Lcom/facebook/o;->name_search_hint:I

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/as;->setSearchHint(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/be;->addView(Landroid/view/View;)V

    .line 69
    sget v0, Lcom/facebook/i;->divebar_availability_warning:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/be;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->f:Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/bf;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/bf;-><init>(Lcom/facebook/orca/contacts/divebar/be;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/as;->setOnRowClickedListener(Lcom/facebook/contacts/picker/aq;)V

    .line 79
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/bg;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/bg;-><init>(Lcom/facebook/orca/contacts/divebar/be;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/as;->setSearchStartedListener(Lcom/facebook/contacts/picker/bc;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/bh;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/bh;-><init>(Lcom/facebook/orca/contacts/divebar/be;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/as;->setSearchPerformedListener(Lcom/facebook/contacts/picker/bb;)V

    .line 99
    sget v0, Lcom/facebook/i;->divebar_header_view_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/be;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->d:Landroid/view/ViewGroup;

    .line 100
    new-instance v0, Lcom/facebook/contacts/picker/r;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->d:Landroid/view/ViewGroup;

    invoke-direct {v0, v2}, Lcom/facebook/contacts/picker/r;-><init>(Landroid/view/ViewGroup;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->e:Lcom/facebook/contacts/picker/r;

    .line 103
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->e:Lcom/facebook/contacts/picker/r;

    const-class v0, Lcom/facebook/orca/contacts/divebar/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/p;

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/picker/r;->a(Lcom/facebook/contacts/picker/p;)V

    .line 106
    const-class v0, Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/bg;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->b:Lcom/facebook/orca/contacts/picker/bg;

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    new-instance v2, Lcom/facebook/orca/contacts/divebar/bi;

    invoke-direct {v2, p0}, Lcom/facebook/orca/contacts/divebar/bi;-><init>(Lcom/facebook/orca/contacts/divebar/be;)V

    invoke-virtual {v0, v2}, Lcom/facebook/contacts/picker/as;->setOnSearchBoxFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 116
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->e:Lcom/facebook/contacts/picker/r;

    const-class v0, Lcom/facebook/orca/contacts/divebar/aa;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/picker/p;

    invoke-virtual {v2, v0}, Lcom/facebook/contacts/picker/r;->a(Lcom/facebook/contacts/picker/p;)V

    .line 119
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/be;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/f;->divebar_contact_background:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/contacts/divebar/be;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 121
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/bl;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    return-object v0
.end method

.method private a(Lcom/facebook/contacts/picker/ad;I)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    if-eqz v0, :cond_0

    .line 147
    instance-of v0, p1, Lcom/facebook/contacts/picker/ag;

    if-eqz v0, :cond_1

    move-object v1, p1

    .line 148
    check-cast v1, Lcom/facebook/contacts/picker/ag;

    .line 149
    invoke-direct {p0, p1}, Lcom/facebook/orca/contacts/divebar/be;->setLastNavigationTapPoint(Lcom/facebook/contacts/picker/ad;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ag;->a()Lcom/facebook/user/UserWithIdentifier;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/as;->c()Z

    move-result v2

    const-string v4, "divebar"

    move-object v3, p1

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;I)Z

    .line 181
    :cond_0
    :goto_0
    return-void

    .line 156
    :cond_1
    instance-of v0, p1, Lcom/facebook/orca/contacts/picker/ad;

    if-eqz v0, :cond_2

    move-object v0, p1

    .line 157
    check-cast v0, Lcom/facebook/orca/contacts/picker/ad;

    .line 158
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/ad;->a()Lcom/facebook/orca/threads/ThreadSummary;

    move-result-object v0

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/as;->c()Z

    move-result v2

    const-string v3, "divebar"

    invoke-interface {v1, v0, v2, p1, v3}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/orca/threads/ThreadSummary;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;)Z

    goto :goto_0

    .line 163
    :cond_2
    instance-of v0, p1, Lcom/facebook/orca/contacts/picker/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    .line 164
    check-cast v0, Lcom/facebook/orca/contacts/picker/j;

    .line 165
    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/j;->a()Ljava/lang/String;

    move-result-object v0

    .line 166
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/be;->c:Lcom/facebook/user/i;

    invoke-virtual {v1, v0}, Lcom/facebook/user/i;->a(Ljava/lang/String;)Lcom/facebook/user/j;

    move-result-object v0

    .line 167
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/user/j;->a(I)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v2

    .line 168
    new-instance v1, Lcom/facebook/user/o;

    invoke-direct {v1}, Lcom/facebook/user/o;-><init>()V

    sget-object v3, Lcom/facebook/user/n;->PHONE_NUMBER:Lcom/facebook/user/n;

    invoke-virtual {v0}, Lcom/facebook/user/j;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/facebook/user/o;->a(Lcom/facebook/user/n;Ljava/lang/String;)Lcom/facebook/user/o;

    move-result-object v1

    new-instance v3, Lcom/facebook/user/Name;

    invoke-virtual {v0}, Lcom/facebook/user/j;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v5, v5, v0}, Lcom/facebook/user/Name;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lcom/facebook/user/o;->a(Lcom/facebook/user/Name;)Lcom/facebook/user/o;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/o;->x()Lcom/facebook/user/User;

    move-result-object v0

    .line 172
    new-instance v1, Lcom/facebook/user/UserWithIdentifier;

    invoke-direct {v1, v0, v2}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 173
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v2}, Lcom/facebook/contacts/picker/as;->c()Z

    move-result v2

    const-string v4, "divebar"

    move-object v3, p1

    move v5, p2

    invoke-interface/range {v0 .. v5}, Lcom/facebook/orca/contacts/divebar/bl;->a(Lcom/facebook/user/UserWithIdentifier;ZLcom/facebook/contacts/picker/ad;Ljava/lang/String;I)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/be;Lcom/facebook/contacts/picker/ad;I)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/facebook/orca/contacts/divebar/be;->a(Lcom/facebook/contacts/picker/ad;I)V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/be;)Landroid/view/ViewGroup;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->d:Landroid/view/ViewGroup;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/contacts/divebar/be;)Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->f:Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

    return-object v0
.end method

.method private setLastNavigationTapPoint(Lcom/facebook/contacts/picker/ad;)V
    .locals 3

    .prologue
    .line 184
    check-cast p1, Lcom/facebook/contacts/picker/ag;

    invoke-virtual {p1}, Lcom/facebook/contacts/picker/ag;->j()Lcom/facebook/contacts/picker/ah;

    move-result-object v1

    .line 186
    const/4 v0, 0x0

    .line 188
    sget-object v2, Lcom/facebook/orca/contacts/divebar/bj;->a:[I

    invoke-virtual {v1}, Lcom/facebook/contacts/picker/ah;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    .line 214
    :goto_0
    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/be;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/analytics/i/c;->a(Landroid/content/Context;)Lcom/facebook/analytics/av;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->a(Ljava/lang/String;)V

    .line 217
    :cond_0
    return-void

    .line 190
    :pswitch_0
    const-string v0, "via_chat_bar_active_chats_section"

    goto :goto_0

    .line 193
    :pswitch_1
    const-string v0, "via_chat_bar_auto_complete_section"

    goto :goto_0

    .line 196
    :pswitch_2
    const-string v0, "via_chat_bar_favorite_friends_section"

    goto :goto_0

    .line 199
    :pswitch_3
    const-string v0, "via_chat_bar_nearby_friends_section"

    goto :goto_0

    .line 202
    :pswitch_4
    const-string v0, "via_chat_bar_search_result_section"

    goto :goto_0

    .line 205
    :pswitch_5
    const-string v0, "via_chat_bar_suggestions_section"

    goto :goto_0

    .line 208
    :pswitch_6
    const-string v0, "via_chat_bar_top_friends_section"

    goto :goto_0

    .line 211
    :pswitch_7
    const-string v0, "via_chat_bar_unknown_section"

    goto :goto_0

    .line 188
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 220
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->a()V

    .line 221
    return-void
.end method

.method public a(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;I)V
    .locals 2

    .prologue
    .line 248
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->b:Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v0, p1, p2, p3}, Lcom/facebook/orca/contacts/picker/bg;->a(Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;I)V

    .line 249
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->e:Lcom/facebook/contacts/picker/r;

    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/be;->b:Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/r;->a(Lcom/facebook/contacts/picker/p;)V

    .line 250
    return-void
.end method

.method public a(Lcom/google/common/a/es;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/contacts/picker/ad;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 240
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/as;->a(Lcom/google/common/a/es;)V

    .line 241
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->f:Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/DivebarChatAvailabilityWarning;->a()V

    .line 242
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 253
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->b:Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/bg;->b()V

    .line 254
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->b:Lcom/facebook/orca/contacts/picker/bg;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/picker/bg;->c()V

    .line 258
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 261
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->b()V

    .line 262
    return-void
.end method

.method public getContactPickerHeaderViewManager()Lcom/facebook/contacts/picker/r;
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->e:Lcom/facebook/contacts/picker/r;

    return-object v0
.end method

.method public getSearchBoxText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->getSearchBoxText()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setContactPickerViewListener(Lcom/facebook/orca/contacts/divebar/bl;)V
    .locals 0

    .prologue
    .line 132
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/be;->g:Lcom/facebook/orca/contacts/divebar/bl;

    .line 133
    return-void
.end method

.method public setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/as;->setOnContactListScrollListener(Lcom/facebook/contacts/picker/ap;)V

    .line 143
    return-void
.end method

.method public setOnFilterStateChangedListener(Lcom/facebook/contacts/picker/ba;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/as;->setOnFilterStateChangedListener(Lcom/facebook/contacts/picker/ba;)V

    .line 138
    return-void
.end method

.method public setSearchBoxText(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 224
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0}, Lcom/facebook/contacts/picker/as;->e()V

    .line 229
    :goto_0
    return-void

    .line 227
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/as;->setSearchBoxText(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setSearchHint(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 124
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/be;->a:Lcom/facebook/contacts/picker/as;

    invoke-virtual {v0, p1}, Lcom/facebook/contacts/picker/as;->setSearchHint(Ljava/lang/String;)V

    .line 125
    return-void
.end method
