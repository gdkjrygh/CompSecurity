.class public Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "DivebarNearbyFriendsFragment.java"


# instance fields
.field private a:Lcom/facebook/orca/contacts/divebar/e;

.field private b:Lcom/facebook/contacts/a/c;

.field private c:Lcom/facebook/contacts/a/d;

.field private d:Lcom/facebook/orca/contacts/picker/az;

.field private e:Lcom/facebook/contacts/picker/ak;

.field private f:Landroid/view/View;

.field private g:Lcom/facebook/orca/contacts/divebar/au;

.field private h:Lcom/facebook/orca/contacts/divebar/bl;

.field private i:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/facebook/user/User;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 51
    new-instance v0, Lcom/facebook/orca/contacts/divebar/ar;

    invoke-direct {v0, p0}, Lcom/facebook/orca/contacts/divebar/ar;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->i:Ljava/util/Comparator;

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/contacts/a/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->b:Lcom/facebook/contacts/a/c;

    return-object v0
.end method

.method private a()V
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 119
    iget-object v1, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->c:Lcom/facebook/contacts/a/d;

    invoke-virtual {v1}, Lcom/facebook/contacts/a/d;->b()Lcom/google/common/a/es;

    move-result-object v1

    .line 120
    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v2}, Lcom/facebook/orca/contacts/divebar/e;->b()Lcom/google/common/a/es;

    move-result-object v2

    .line 121
    iget-object v3, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v3}, Lcom/facebook/orca/contacts/divebar/e;->e()Lcom/google/common/a/es;

    move-result-object v3

    .line 122
    iget-object v4, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v4}, Lcom/facebook/orca/contacts/divebar/e;->f()Lcom/google/common/a/es;

    move-result-object v4

    .line 123
    iget-object v5, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a:Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v5}, Lcom/facebook/orca/contacts/divebar/e;->c()Lcom/google/common/a/es;

    move-result-object v5

    .line 126
    invoke-static {}, Lcom/google/common/a/kl;->a()Ljava/util/HashSet;

    move-result-object v6

    .line 127
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v7

    .line 128
    const/4 v8, 0x5

    new-array v8, v8, [Ljava/util/List;

    aput-object v1, v8, v0

    const/4 v1, 0x1

    aput-object v2, v8, v1

    const/4 v1, 0x2

    aput-object v3, v8, v1

    const/4 v1, 0x3

    aput-object v4, v8, v1

    const/4 v1, 0x4

    aput-object v5, v8, v1

    array-length v2, v8

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_3

    aget-object v0, v8, v1

    .line 129
    if-nez v0, :cond_1

    .line 128
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 132
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 133
    invoke-virtual {v0}, Lcom/facebook/user/User;->c()Lcom/facebook/user/UserKey;

    move-result-object v4

    .line 134
    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 137
    iget-object v5, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->b:Lcom/facebook/contacts/a/c;

    invoke-virtual {v5, v4}, Lcom/facebook/contacts/a/c;->b(Lcom/facebook/user/UserKey;)Lcom/facebook/user/ChatContext;

    move-result-object v5

    .line 138
    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/facebook/user/ChatContext;->a()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 139
    invoke-interface {v6, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 144
    :cond_3
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->i:Ljava/util/Comparator;

    invoke-static {v7, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 146
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v1

    .line 147
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/user/User;

    .line 148
    new-instance v3, Lcom/facebook/user/UserWithIdentifier;

    invoke-virtual {v0}, Lcom/facebook/user/User;->i()Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Lcom/facebook/user/UserWithIdentifier;-><init>(Lcom/facebook/user/User;Lcom/facebook/user/UserIdentifier;)V

    .line 149
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->d:Lcom/facebook/orca/contacts/picker/az;

    sget-object v4, Lcom/facebook/contacts/picker/ah;->NEARBY:Lcom/facebook/contacts/picker/ah;

    invoke-virtual {v0, v3, v4}, Lcom/facebook/orca/contacts/picker/az;->b(Lcom/facebook/user/UserWithIdentifier;Lcom/facebook/contacts/picker/ah;)Lcom/facebook/contacts/picker/ag;

    move-result-object v0

    .line 153
    invoke-virtual {v1, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_2

    .line 155
    :cond_4
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->e:Lcom/facebook/contacts/picker/ak;

    invoke-virtual {v1}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->a(Lcom/google/common/a/es;)V

    .line 156
    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)Lcom/facebook/orca/contacts/divebar/bl;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->h:Lcom/facebook/orca/contacts/divebar/bl;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .prologue
    .line 81
    new-instance v0, Lcom/facebook/orca/contacts/divebar/au;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->n()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/facebook/orca/contacts/divebar/au;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->g:Lcom/facebook/orca/contacts/divebar/au;

    .line 82
    new-instance v0, Lcom/facebook/contacts/picker/ak;

    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->n()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->g:Lcom/facebook/orca/contacts/divebar/au;

    sget v3, Lcom/facebook/k;->orca_contact_picker_view_for_divebar_nearby_friends:I

    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/contacts/picker/ak;-><init>(Landroid/content/Context;Lcom/facebook/contacts/picker/b;I)V

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->e:Lcom/facebook/contacts/picker/ak;

    .line 87
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->e:Lcom/facebook/contacts/picker/ak;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/as;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/as;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->setOnRowClickedListener(Lcom/facebook/contacts/picker/aq;)V

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->e:Lcom/facebook/contacts/picker/ak;

    sget v1, Lcom/facebook/i;->divebar_nearby_friends_back_button:I

    invoke-virtual {v0, v1}, Lcom/facebook/contacts/picker/ak;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->f:Landroid/view/View;

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->f:Landroid/view/View;

    new-instance v1, Lcom/facebook/orca/contacts/divebar/at;

    invoke-direct {v1, p0}, Lcom/facebook/orca/contacts/divebar/at;-><init>(Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->e:Lcom/facebook/contacts/picker/ak;

    return-object v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 68
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 70
    const-class v0, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/e;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a:Lcom/facebook/orca/contacts/divebar/e;

    .line 71
    const-class v0, Lcom/facebook/contacts/a/c;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/c;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->b:Lcom/facebook/contacts/a/c;

    .line 72
    const-class v0, Lcom/facebook/contacts/a/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/contacts/a/d;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->c:Lcom/facebook/contacts/a/d;

    .line 73
    const-class v0, Lcom/facebook/orca/contacts/picker/az;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/picker/az;

    iput-object v0, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->d:Lcom/facebook/orca/contacts/picker/az;

    .line 74
    return-void
.end method

.method public a(Lcom/facebook/orca/contacts/divebar/bl;)V
    .locals 0

    .prologue
    .line 63
    iput-object p1, p0, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->h:Lcom/facebook/orca/contacts/divebar/bl;

    .line 64
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 114
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 115
    invoke-direct {p0}, Lcom/facebook/orca/contacts/divebar/DivebarNearbyFriendsFragment;->a()V

    .line 116
    return-void
.end method
